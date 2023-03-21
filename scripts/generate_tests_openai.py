import argparse
import csv
import json
import os
import time
import uuid

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


def save_generated_code(prompt: dict, response: dict, max_tokens: int, output_folder: str) -> None:
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
        gen_file.write(prompt["test_prompt"] + "\n" + response['choices'][0]["text"])


def get_prompts(config: dict, prompt_file: str) -> list:
    """
    Returns a list of prompts used for test generation.
    @param config: analysis configuration
    @param prompt_file:  path to the JSON file containing prompts (ex: "RQ1_Test_Generation/OpenAI_Data/HumanEvalJava_input/original_prompt.json")
    @return: a list of parsed prompts
    """
    scenario_path = os.path.join(config["BASE_DIRECTORY"], prompt_file)
    with open(scenario_path, 'r') as scenario_file:
        return json.load(scenario_file)


def get_output_files(config: dict, rq: int, dataset: str, prompt_file: str, max_tokens: int) -> tuple:
    """
    Compute the paths to the output folder and response file.

    @param rq: research question
    @param dataset: the dataset associated with the prompt file
    @param max_tokens: maximum number of tokens
    @param config: analysis configuration
    @param prompt_file:  path to the JSON file containing prompts (ex: "RQ1_Test_Generation/OpenAI_Data/HumanEvalJava_input/original_prompt.json")
    @return: a tuple:
    - output_folder: <BASE_DIR>/<RQ_FOLDER>/OpenAI_Data/<DATASET>_output/"
    - scenario_folder: output_folder/<SCENARIO>
    - json_file = output_folder/<SCENARIO>_output_<max_tokens>.json
    - csv_file = output_folder/<SCENARIO>_output_<max_tokens>.csv
    """
    # prompt files are typically named <label>_prompt.json, extract the label part
    scenario_name = os.path.basename(prompt_file).split("_prompt")[0]
    rq_folder = "RQ1_Test_Generation" if rq == 1 else "RQ2_Prompt_Elements"
    output_folder = os.path.join(config["BASE_DIRECTORY"], rq_folder, "OpenAI_Data", f"{dataset}_output/")
    scenario_folder = os.path.join(output_folder, scenario_name)
    json_file = os.path.join(output_folder, f"{scenario_name}_output_{max_tokens}.json")
    csv_file = json_file.replace(".json", ".csv")
    return output_folder, scenario_folder, json_file, csv_file


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
            "finish_reason": "ERROR - " + error_msg,
            "text": ""
        }],
        id=str(uuid.uuid4()),  # generates a dummy ID
        prompt_id=prompt["id"],
        original_code=prompt["original_code"],
        test_prompt=prompt["test_prompt"],
        time_taken=-1,  # dummy
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
        [response['id'], response['prompt_id'], response['time_taken'],
         response["choices"][0]["finish_reason"],
         response["original_code"],
         response['test_prompt'],
         prompt["test_prompt"] + "\n" + response['choices'][0]["text"]
         ])


def generate_tests(config: dict, rq: int, dataset: str, prompt_file: str, prompts: list, max_tokens: int) -> None:
    """
    Generates tests for the given scenario.
    @param config: dictionary of the parsed configuration
    @param rq: research question
    @param dataset: the dataset associated with the prompt file
    @param prompts: a list of parsed prompts
    @param prompt_file: filename for the scenario (ex: "Scenario1_prompt.json")
    @param max_tokens: maximum number of tokens for generation
    """

    # sets the data output paths
    output_folder, scenario_folder, response_file, csv_file = get_output_files(config, rq, dataset, prompt_file,
                                                                               max_tokens)
    # opens output file in write mode (overwrite prior results)
    with open(response_file, "w") as json_file, open(csv_file, "w") as csv_out:
        csv_file = csv.writer(csv_out, delimiter=',', quotechar='"', quoting=csv.QUOTE_MINIMAL)
        csv_file.writerow(
            ["ID", "PROMPT_ID", "DURATION", "FINISH_REASON", "ORIGINAL_CODE", "TEST_PROMPT", "GENERATED_TEST"])
        json_file.write("[\n")
        for prompt in prompts:
            print("PROMPT", prompt["id"])
            try:
                # query Open AI to generate the unit test
                response = generate_code(prompt, max_tokens)
                # save the generated test in a file
                print("SAVING", prompt["id"], "at", scenario_folder)
                save_generated_code(prompt, response, max_tokens, scenario_folder)
                # save the response's metadata in CSV and JSON
                save_response(json_file, csv_file, prompt, prompts, response)
                print("Duration: ", response['time_taken'],
                      "Finish Reason:", response["choices"][0]["finish_reason"],
                      "\n" + "-" * 30)

            except Exception as e:
                print("ERROR", e)
                mock_response = get_mock_response(prompt, str(e))
                save_response(json_file, csv_file, prompt, prompts, mock_response)

        json_file.write("]")


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("-t", "--tokens", type=int, choices=[x * 1000 for x in range(1, 5)],
                        help="token limit (ex: 1000)", required=True)
    parser.add_argument("-p", "--prompts", type=str,
                        help="path to the JSON file with prompts", required=True)
    parser.add_argument("-dataset", "--dataset", type=str,
                        choices=("SF110", "GitHub", "HumanEvalJava", "HumanEvalPython"),
                        help="The dataset being used", required=True)
    parser.add_argument("-q", "--question", type=str, choices=("RQ1", "RQ2"),
                        help="The research question (this will dictate where the file will be saved)", required=True)

    args = parser.parse_args()

    config = load_config("config.json")
    print(args)
    # get list of parsed prompts from the JSON file
    prompts = get_prompts(config, args.prompts)
    prompts.sort(key=lambda x: x["id"])
    print("Generating unit tests for", len(prompts), "prompts in", args.dataset)
    # generate unit tests
    question = int(args.question.replace("RQ", ""))
    generate_tests(config, question, args.dataset, args.prompts, prompts, args.tokens)


if __name__ == "__main__":
    main()

# QUICK SCRIPT TO GENERATE SAMPLE USAGES
# for token in [x * 1000 for x in range(1, 5)]:
#     for prompt_file in ["100_jgaap_prompt.json", "27_gangup_prompt.json", "43_lilith_prompt.json", "63_objectexplorer_prompt.json", "81_javathena_prompt.json","10_water-simulator_prompt.json", "29_apbsmem_prompt.json", "47_dvd-homevideo_prompt.json", "64_jtailgui_prompt.json", "82_ipcalculator_prompt.json","11_imsmart_prompt.json", "2_a4j_prompt.json", "49_diebierse_prompt.json", "65_gsftp_prompt.json", "84_ifx-framework_prompt.json","12_dsachat_prompt.json", "30_bpmail_prompt.json", "4_rif_prompt.json", "67_gae-app-manager_prompt.json", "86_at-robots2-j_prompt.json","13_jdbacl_prompt.json", "31_xisemele_prompt.json", "51_jiprof_prompt.json", "68_biblestudy_prompt.json", "88_jopenchart_prompt.json","14_omjstate_prompt.json", "32_httpanalyzer_prompt.json", "52_lagoon_prompt.json", "69_lhamacaw_prompt.json", "8_gfarcegestionfa_prompt.json","15_beanbin_prompt.json", "33_javaviewcontrol_prompt.json", "54_db-everywhere_prompt.json", "6_jnfe_prompt.json", "91_classviewer_prompt.json","17_inspirento_prompt.json", "34_sbmlreader2_prompt.json", "55_lavalamp_prompt.json", "71_ext4j_prompt.json", "93_quickserver_prompt.json","19_jmca_prompt.json", "36_schemaspy_prompt.json", "56_jhandballmoves_prompt.json", "73_fim1_prompt.json", "94_jclo_prompt.json","22_byuic_prompt.json", "39_diffi_prompt.json", "57_hft-bomberman_prompt.json", "74_fixsuite_prompt.json","23_jwbf_prompt.json", "40_glengineer_prompt.json", "59_mygrid_prompt.json", "75_openhre_prompt.json","24_saxpath_prompt.json", "41_follow_prompt.json", "5_templateit_prompt.json", "76_dash-framework_prompt.json","25_jni-inchi_prompt.json", "42_asphodel_prompt.json", "60_sugar_prompt.json", "7_sfmis_prompt.json"]:
#         print(f"python3.9 generate_tests_openai.py -t {token} -d EvoSuiteBenchmark -q RQ1 -p RQ1_Test_Generation/OpenAI_Data/SF110_input/{prompt_file}")
