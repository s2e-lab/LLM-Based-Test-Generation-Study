import argparse
import csv
import json
import os
import time

import openai

# Code Generation Configuration Parameters
OPENAI_MODEL = "code-davinci-002"
OPENAI_TEMPERATURE = 0
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


def generate_code(prompt, max_tokens, is_fix=False):
    """
    Returns a response object from OpenAI enriched with the prompt metadata.
    @param max_tokens: what is the token size limit used
    @param is_fix: True if we are generating code for a previous prompt that had an error
    @param prompt: the prompt object
    """
    start_time = time.time()
    response = openai.Completion.create(
        model=OPENAI_MODEL,
        prompt=prompt["original_code"] + "\n" + prompt["test_prompt"].strip() + "\n\t\t",
        temperature=OPENAI_TEMPERATURE,
        max_tokens=max_tokens,
        top_p=OPENAI_TOP_P,
        frequency_penalty=OPENAI_FREQUENCY_PENALTY,
        presence_penalty=OPENAI_PRESENCE_PENALTY,
    )
    time_taken = time.time() - start_time
    response["time_taken"] = time_taken
    if is_fix:
        response["prompt_id"] = prompt["prompt_id"]
    else:
        response["prompt_id"] = prompt["id"]
    response["original_code"] = prompt["original_code"]
    response["test_prompt"] = prompt["test_prompt"]

    if time_taken <= 60:
        time.sleep(60 - time_taken + 5)  # wait 5 seconds more to avoid rate limit
    return response


def save_generated_code(prompt: dict, response: dict, output_folder: str) -> None:
    """
    Saves the generated Unit Test on a separate file in the output folder.
    @param max_tokens: maximum number of tokens used for generation
    @param prompt: prompt used for test generation.
    @param response: the response returned by OpenAI
    @param output_folder: where to save the Unit Test.
    """
    with open(os.path.join(output_folder, f"{response['prompt_id']}Test.java"), "w") as gen_file:
        gen_file.write(prompt["test_prompt"] + "\n" + response['choices'][0]["text"])


def get_prompts(config: dict, scenario_json: str) -> list:
    """
    Returns a list of prompts used for test generation.
    @param config: analysis configuration
    @param scenario_json:  filename for the scenario JSON file (ex: "scenario1_prompt.json")
    @return: a list of parsed prompts
    """
    scenario_path = os.path.join(config["BASE_DIRECTORY"], "input", scenario_json)
    with open(scenario_path, 'r') as scenario_file:
        return json.load(scenario_file)


def get_output_files(config: dict, scenario: str, max_tokens: int) -> tuple:
    """
    Compute the paths to the output folder and response file.
    @param max_tokens: maximum number of tokens
    @param config: analysis configuration
    @param scenario: filename for the scenario (ex: "Scenario1_prompt.json")
    @return:
    """
    output_folder = os.path.join(config["BASE_DIRECTORY"], "output/")
    scenario_folder = os.path.join(output_folder, scenario.split("_")[0])
    response_file = os.path.join(output_folder, scenario.replace("prompt", f"output-{max_tokens}"))
    csv_file = response_file.replace(".json", ".csv")
    # JSON file in the format scenariox_output-token.json
    return output_folder, scenario_folder, response_file, csv_file


def get_fixed_files(config: dict, scenario: str, max_tokens: int) -> tuple:
    """
    Compute the paths to the output folder and response file.
    @param max_tokens: maximum number of tokens used for analysis
    @param config:  configuration
    @param scenario: filename for the scenario (ex: "scenario1_prompt.json")
    @return:
    """
    output_folder, scenario_folder, response_file, csv_file = get_output_files(config, scenario, max_tokens)
    response_file = response_file.replace(".json", "_fixed.json")
    csv_file = response_file.replace(".json", ".csv")
    return output_folder, scenario_folder, response_file, csv_file


def get_mock_response(prompt: dict, error_msg: str) -> dict:
    """
    Creates a mock response object to be used to record runtime errors
    @param prompt: the prompt object
    @param error_msg: error message to be captured in this mock response
    @return: a mock response object with the same structure as the actual response
    """
    time.sleep(60)
    return dict(
        choices=[{
            "finish_reason": "ERROR - " + error_msg
        }],
        prompt_id=prompt["id"],
        original_code=prompt["original_code"], test_prompt=prompt["test_prompt"]
    )


def save_response(json_file, csv_file, prompt: dict, prompts: list, response: dict) -> None:
    """
        Saves a response into an open json file
        @param csv_file: an open writeable file where to save the results in CSV format
        @param json_file: an open writeable file where to save the results in JSON format
        @param prompt: the prompt object to be saved
        @param prompts: the list of all prompts (used to check when to stop adding commas)
        @param response: the JSON response object from Codex API to be serialized into the file
        @return: a mock response object with the same structure as the actual response
    """
    json_file.write(json.dumps(response, indent=4))  # save immediately
    if prompt != prompts[-1]:
        json_file.write(",")
    json_file.write("\n")

    csv_file.writerow(
        [response['id'], response['prompt_id'], response['time_taken'], response["choices"][0]["finish_reason"]])


def generate_tests(config: dict, scenario: str, prompts: list, max_tokens: int) -> None:
    """
    Generates tests for the given scenario.
    @param max_tokens: maximum number of tokens for generation
    @param config: dictionary of the parsed configuration
    @param scenario: filename for the scenario (ex: "Scenario1_prompt.json")
    @param prompts: a list of parsed prompts
    """

    # sets the data output paths
    output_folder, scenario_folder, response_file, csv_file = get_output_files(config, scenario, max_tokens)

    # opens output file in write mode (overwrite prior results)
    with open(response_file, "w") as json_file, open(csv_file, "w") as csv_out:
        csv_file = csv.writer(csv_out, delimiter=',', quotechar='"', quoting=csv.QUOTE_MINIMAL)

        json_file.write("[\n")
        for prompt in prompts[0:2]:
            print("PROMPT", prompt["id"])
            try:
                # query Open AI to generate the unit test
                response = generate_code(prompt, max_tokens)
                # save the generated test in a file
                save_generated_code(prompt, response, output_folder)
                # save the response's metadata in CSV and JSON
                save_response(json_file, csv_file, prompt, prompts, response)
                print("Duration: ", response['time_taken'],
                      "Finish Reason:", response["choices"][0]["finish_reason"],
                      "\n" + "-" * 30)

            except Exception as e:
                print("ERROR", e)
                mock_response = get_mock_response(prompt, str(e))
                save_response(json_file, prompt, prompts, mock_response)

        json_file.write("]")


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("-t", "--token", type=int, choices=[x * 1000 for x in range(1, 5)],
                        help="token limit (ex: 1000)", required=True)
    parser.add_argument("-s", "--scenario", type=str, choices=[f"scenario{x}" for x in range(1, 5)],
                        help="your scenario (ex: scenario3)", required=True)
    args = parser.parse_args()

    config = load_config("config.json")
    scenario_json = f"{args.scenario}_prompt.json"
    prompts = get_prompts(config, scenario_json)
    generate_tests(config, scenario_json, prompts, args.token)


if __name__ == "__main__":
    main()
