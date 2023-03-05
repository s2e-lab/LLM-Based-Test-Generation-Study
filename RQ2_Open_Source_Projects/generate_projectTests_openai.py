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

PROJECT_PREFIX = "SF110_"


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


def generate_code(prompt, max_tokens=OPENAI_MAX_TOKENS, IS_FIX=False):
    """
    Returns a response object from OpenAI enriched with the prompt metadata.
    @param max_tokens: what is the token size limit used (default = OPENAI_MAX_TOKENS)
    @param prompt: the prompt object
    """
    start_time = time.time()
    response = openai.Completion.create(
        model=OPENAI_MODEL,
        prompt=prompt["original_code"]
        + "\n"
        + prompt["test_prompt"].strip()
        + "\n\t\t",
        temperature=OPENAI_TEMPERATURE,
        max_tokens=max_tokens,
        top_p=OPENAI_TOP_P,
        frequency_penalty=OPENAI_FREQUENCY_PENALTY,
        presence_penalty=OPENAI_PRESENCE_PENALTY,
    )
    time_taken = time.time() - start_time
    response["time_taken"] = time_taken
    if IS_FIX:
        response["prompt_id"] = prompt["prompt_id"]
    else:
        response["prompt_id"] = prompt["id"]
    response["original_code"] = prompt["original_code"]
    response["test_prompt"] = prompt["test_prompt"]

    if time_taken <= 60:
        time.sleep(60 - time_taken + 5)  # wait 5 seconds more to avoid rate limit
    return response


def save_generated_code(prompt: dict, response: dict, output_path: str) -> None:
    """
    Saves the generated Unit Test on a separate file in the output folder.
    @param prompt: prompt used for test generation.
    @param response: the response returned by OpenAI
    @param output_folder: where to save the Unit Test.
    """
    output_folder = "/".join(output_path.split("/")[:-1])
    if not os.path.exists(output_folder):
        os.makedirs(output_folder)
    with open(output_path, "w") as gen_file:
        gen_file.write(prompt["test_prompt"] + "\n" + response["choices"][0]["text"])


def get_prompts(config: dict, scenario: str) -> list:
    """
    Computes the prompts used for test generation
    @param config: analysis configuration
    @param scenario:  filename for the scenario (ex: "Scenario1_prompt.json")
    @return: a list of parsed prompts
    """
    scenario_path = os.path.join(config["BASE_DIRECTORY"], PROJECT_PREFIX+"input", scenario)
    with open(scenario_path, "r") as scenario_file:
        return json.load(scenario_file)


def get_generate_output_files(config: dict, scenario: str) -> tuple:
    """
    Compute the paths to the output folder and response file.
    @param config: analysis configuration
    @param scenario: filename for the scenario (ex: "Scenario1_prompt.json")
    @return:
    """
    projectName = scenario.split(".")[0]
    output_folder = os.path.join(config["BASE_DIRECTORY"], f"{PROJECT_PREFIX}output/{projectName}")
    if not os.path.exists(output_folder):
        os.makedirs(output_folder)
    response_file = os.path.join(output_folder, f"{projectName}_response.json")
    return output_folder, response_file


def get_fixed_files(config: dict, scenario: str) -> tuple:
    """
    Compute the paths to the output folder and response file.
    @param config: analysis configuration
    @param scenario: filename for the scenario (ex: "Scenario1_prompt.json")
    @return:
    """
    projectName = scenario.split(".")[0]
    output_folder = os.path.join(config["BASE_DIRECTORY"], f"{PROJECT_PREFIX}output/{projectName}")
    if not os.path.exists(output_folder):
        os.makedirs(output_folder)
    response_file = os.path.join(output_folder, f"{projectName}_response_fixed.json")
    return output_folder, response_file


def get_mock_response(prompt: dict, error_msg: str) -> dict:
    """
    Creates a mock response object to be used to record runtime errors
    @param prompt: the prompt object
    @param error_msg: error message to be captured in this mock response
    @return: a mock response object with the same structure as the actual response
    """
    time.sleep(60)
    return dict(
        choices=[{"finish_reason": "ERROR - " + error_msg}],
        prompt_id=prompt["id"],
        original_code=prompt["original_code"],
        test_prompt=prompt["test_prompt"],
    )


def save_response(f, prompt: dict, prompts: list, response: dict):
    f.write(json.dumps(response, indent=4))  # save immediately
    if prompt != prompts[-1]:
        f.write(",")
    f.write("\n")


def generate_tests(config: dict, scenario: str, prompts: list) -> None:
    """
    Generates tests for the given scenario.
    @param config: dictionary of the parsed configuration
    @param scenario: filename for the scenario (ex: "Scenario1_prompt.json")
    @param prompts: a list of parsed prompts
    """

    # sets the data output paths
    output_folder, response_file = get_generate_output_files(config, scenario)
    projectName = scenario.split(".")[0]

    with open(response_file, "w") as f:
        f.write("[\n")
        for prompt in prompts:
            print("PROMPT", prompt["id"])
            outputPath = prompt["id"].split(projectName)[1]
            outputPath = outputPath.replace("/java/", "/test/")

            try:
                response = generate_code(prompt)
                save_generated_code(prompt, response, output_folder + outputPath)
                save_response(f, prompt, prompts, response)
                print(
                    "Duration: ",
                    response["time_taken"],
                    "Finish Reason:",
                    response["choices"][0]["finish_reason"],
                    "\n" + "-" * 30,
                )

            except Exception as e:
                print("ERROR", e)
                mock_response = get_mock_response(prompt, str(e))
                save_response(f, prompt, prompts, mock_response)

        f.write("]")


def main():
    config = load_config("config.json")
    with open("SF110_projects.txt", "r") as f:
        for project in f.read().splitlines():
            
            scenario = project.split()[0]
            print("Starting: ",scenario)
            prompts = get_prompts(config, scenario)
            generate_tests(config, scenario, prompts)
            print("Done: ",scenario)
   
if __name__ == "__main__":
    main()
