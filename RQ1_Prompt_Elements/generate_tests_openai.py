import json
import os
import time

import openai

# Code Generation Configuration Parameters
OPENAI_MODEL = "code-davinci-002"
OPENAI_TEMPERATURE = 0
OPENAI_MAX_TOKENS = 2048
OPENAI_TOP_P = 1
OPENAI_FREQUENCY_PENALTY = 0
OPENAI_PRESENCE_PENALTY = 0


def load_config(config_file: str) -> dict:
    """
    Loads the JSON configuration and sets the OpenAI API key.
    @param config_file:  Path to the JSON configuration file.
    @returns config: dictionary of the parsed configuration
    """
    with open(config_file) as json_file:
        config = json.load(json_file)
    # sets the OpenAI key
    openai.api_key = config["OPEN_AI_KEY"]
    return config


def generate_code(prompt, max_tokens=OPENAI_MAX_TOKENS):
    """
    Returns a response object from OpenAI enriched with the prompt metadata.
    @param max_tokens: what is the token size limit used (default = OPENAI_MAX_TOKENS)
    @param prompt: the prompt object
    """
    start_time = time.time()
    response = openai.Completion.create(
        model=OPENAI_MODEL,
        prompt=prompt["original_code"] + "\n" + prompt["test_prompt"].strip(),
        temperature=OPENAI_TEMPERATURE,
        max_tokens=max_tokens,
        top_p=OPENAI_TOP_P,
        frequency_penalty=OPENAI_FREQUENCY_PENALTY,
        presence_penalty=OPENAI_PRESENCE_PENALTY,
    )
    time_taken = time.time() - start_time
    response["time_taken"] = time_taken
    response["prompt_id"] = prompt["id"]
    response["original_code"] = prompt["original_code"]
    response["test_prompt"] = prompt["test_prompt"]
    return response


def save_generated_code(prompt: dict, response: dict, output_folder: str) -> None:
    """
    Saves the generated Unit Test on a separate file in the output folder.
    @param prompt: prompt used for test generation.
    @param response: the response returned by OpenAI
    @param output_folder: where to save the Unit Test.
    """
    with open(os.path.join(output_folder, f"{response['prompt_id']}Test.java"), "w") as gen_file:
        gen_file.write(prompt["test_prompt"] + "\n" + response['choices'][0]["text"])


def get_prompts(config: dict, scenario: str) -> list:
    """
    Computes the prompts used for test generation
    @param config: analysis configuration
    @param scenario:  filename for the scenario (ex: "Scenario1_prompt.json")
    @return: a list of parsed prompts
    """
    scenario_path = os.path.join(config["BASE_DIRECTORY"], "input", scenario)
    with open(scenario_path, 'r') as scenario_file:
        return json.load(scenario_file)


def get_output_files(config: dict, scenario: str) -> tuple:
    """
    Compute the paths to the output folder and response file.
    @param config: analysis configuration
    @param scenario: filename for the scenario (ex: "Scenario1_prompt.json")
    @return:
    """
    output_folder = os.path.join(config["BASE_DIRECTORY"], "output/")
    response_file = os.path.join(output_folder, scenario.replace("prompt", "output"))
    return output_folder, response_file


def generate_tests(config: dict, scenario: str, prompts: list) -> None:
    """
    Generates tests for the given scenario.
    @param config: dictionary of the parsed configuration
    @param scenario: filename for the scenario (ex: "Scenario1_prompt.json")
    @param prompts: a list of parsed prompts
    """

    # sets the data output paths
    output_folder, response_file = get_output_files(config, scenario)
    # holds all responses in memory
    responses = []

    for prompt in prompts:
        print("PROMPT", prompt["id"])
        try:
            response = generate_code(prompt)
            save_generated_code(prompt, response, output_folder)
            responses.append(response)
            print("Duration: ", response['time_taken'],
                  "Finish Reason:", response["choices"][0]["finish_reason"],
                  "\n" + "-" * 30)

            time.sleep(10)
        except Exception as e:
            print("ERROR", e)

    # opens output file in write mode (overwrite prior results)
    with open(response_file, "w") as f:
        f.write(json.dumps(responses, indent=4))


def main():
    config = load_config("config.json")
    for scenario in ["scenario1_prompt.json"]:
        prompts = get_prompts(config, scenario)
        generate_tests(config, scenario, prompts)


if __name__ == "__main__":
    main()
