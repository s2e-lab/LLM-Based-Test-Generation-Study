import json
import os
import uuid

import openai


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


def get_prompts(config: dict, prompt_file: str) -> list:
    """
    Returns a list of prompts used for test generation.
    @param config: analysis configuration
    @param prompt_file:  path to the JSON file containing prompts (ex: "RQ1_Test_Generation/OpenAI_Data/HumanEvalJava_input/original_prompt.json")
    @return: a list of parsed prompts
    """
    scenario_path = os.path.join(config["BASE_DIRECTORY"], prompt_file)
    with open(scenario_path, 'r') as scenario_file:
        prompts = json.load(scenario_file)
    return prompts


def get_output_files(config: dict, rq: int, dataset: str, prompt_file: str, max_tokens: int, model: str) -> tuple:
    """
    Compute the paths to the output folder and response file.

    @param rq: research question
    @param dataset: the dataset associated with the prompt file
    @param max_tokens: maximum number of tokens
    @param config: analysis configuration
    @param prompt_file:  path to the JSON file containing prompts (ex: "RQ1_Test_Generation/OpenAI_Data/HumanEvalJava_input/original_prompt.json")
    @param model: the model used for generation (ex: OpenAI, CodeGen)
    @return: a tuple:
    - output_folder: <BASE_DIR>/<RQ_FOLDER>/OpenAI_Data/<DATASET>_output/"
    - scenario_folder: output_folder/<SCENARIO>
    - json_file = output_folder/<SCENARIO>_output_<max_tokens>.json
    - csv_file = output_folder/<SCENARIO>_output_<max_tokens>.csv
    """
    # prompt files are typically named <label>_prompt.json, extract the label part
    scenario_name = os.path.basename(prompt_file).split("_prompt")[0]
    rq_folder = "RQ1_Test_Generation" if rq == 1 else "RQ2_Prompt_Elements"
    output_folder = os.path.join(config["BASE_DIRECTORY"], rq_folder, f"{model}_Data", f"{dataset}_output/")
    scenario_folder = os.path.join(output_folder, scenario_name)
    json_file = os.path.join(output_folder, f"{scenario_name}_output_{max_tokens}.json")
    csv_file = json_file.replace(".json", ".csv")
    return output_folder, scenario_folder, json_file, csv_file


def save_generated_code(prompt: dict, response: dict, max_tokens: int, output_folder: str, isGPT3=False) -> None:
    """
    Saves the generated Unit Test on a separate file in the output folder.
    @param max_tokens:
    @param prompt: prompt used for test generation.
    @param response: the response returned by OpenAI
    @param output_folder: where to save the Unit Test.
    The file will be named as {response['prompt_id']}Test.xyz (xyz extension is based on the original language of the sample).
    This assumes that the prompt_id is the path to the class under test.
    """
    # get the original sample filename and extension (this makes the generation logic generic to any language)
    original_filename, extension = os.path.splitext(response['prompt_id'])
    original_filename = os.path.basename(original_filename)
    filename = f"{original_filename}T{max_tokens}Test{extension}"

    # create the output folder if needed
    if not os.path.exists(output_folder): os.makedirs(output_folder)

    with open(os.path.join(output_folder, filename), "w") as gen_file:
        if isGPT3:
            gen_file.write(response['choices'][0]["message"]["content"])
        else:
            gen_file.write(prompt["test_prompt"] + "\n" + response['choices'][0]["text"])


def save_response(json_file, csv_file, prompt: dict, prompts: list, response: dict, isGPT=False) -> None:
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

    if isGPT:
        csv_file.writerow(
            [response['id'], response['prompt_id'], response['time_taken'],
             response["choices"][0]["finish_reason"],
             response["original_code"],
             response['test_prompt'],
             response['choices'][0]["message"]["content"]
             ])
    else:

        csv_file.writerow(
            [response['id'], response['prompt_id'], response['time_taken'],
             response["choices"][0]["finish_reason"],
             response["original_code"],
             response['test_prompt'],
             prompt["test_prompt"] + "\n" + response['choices'][0]["text"]
             ])


def get_mock_response(prompt: dict, error_msg: str) -> dict:
    """
    Creates a mock response object to be used to record runtime errors
    @param prompt: the prompt object
    @param error_msg: error message to be captured in this mock response
    @return: a mock response object with the same structure as the actual response
    """
    return dict(
        choices=[{
            "finish_reason": "ERROR - " + error_msg,
            "text": ""
        }],
        id=str(uuid.uuid4()),  # generates a dummy ID
        prompt_id=prompt["id"],
        original_code=prompt["original_code"],
        test_prompt=prompt["test_prompt"],
        time_taken=-1,  # dummy
    )


def save_to_dummy_folder(new_code: str, r: dict) -> None:
    """
    Saves the generated code to the dummy_output folder
    @param r: the response dictionary
    """
    with open("./dummy_output/" + r["prompt_id"][1:].replace("/", "_"), "w") as f:
        f.write(new_code)
