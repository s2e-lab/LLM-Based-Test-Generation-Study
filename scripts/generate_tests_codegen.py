import argparse
import csv
import time
from transformers import AutoTokenizer, AutoModelWithLMHead, AutoModelForCausalLM
import torch

from utils import (
    load_config,
    get_prompts,
    get_output_files,
    save_generated_code,
    save_response,
    get_mock_response,
)

# Code Generation Configuration Parameters
CODEGEN_MODEL = "Salesforce/codegen-350M-multi"
CODEGEN_TEMPERATURE = 1e-5
CODEGEN_TOP_P = 1
CODEGEN_DO_SAMPLE = True
CODEGEN_EARLY_STOPPING = True


def setup_model(device: str):
    tokenizer = AutoTokenizer.from_pretrained(CODEGEN_MODEL)
    model = AutoModelForCausalLM.from_pretrained(CODEGEN_MODEL)
    tokenizer.pad_token = tokenizer.eos_token
    model.config.pad_token_id = model.config.eos_token_id
    model = model.to(device)
    return tokenizer, model


def generate_code(prompt, max_tokens, tokenizer, model, device, is_fix=False):
    """
    Returns a response object from OpenAI enriched with the prompt metadata.
    @param max_tokens: what is the token size limit used
    @param is_fix: True if we are generating code for a previous prompt that had an error
    @param prompt: the prompt object
    """
    start_time = time.time()

    response = get_mock_response(prompt, "No Error")
    inputs = tokenizer(prompt, return_tensors="pt").to(device)
    generated_token = model.generate(
        **inputs,
        max_new_tokens=max_tokens,
        do_sample=CODEGEN_DO_SAMPLE,
        top_p=CODEGEN_TOP_P,
        temperature=CODEGEN_TEMPERATURE,
        early_stopping=CODEGEN_EARLY_STOPPING
    )
    output = tokenizer.decode(generated_token[0].cpu().squeeze()).split(prompt)[-1]
    response["choices"][0]["text"] = output
    response["choices"][0]["finish_reason"] = "length"
    response["usage"]={ "prompt_tokens": inputs['input_ids'].shape[1], "total_tokens": output.shape[1]}
    

    time_taken = time.time() - start_time
    response["time_taken"] = time_taken
    if is_fix:
        response["prompt_id"] = prompt["prompt_id"]
    else:
        response["prompt_id"] = prompt["id"]

    if time_taken <= 60:
        time.sleep(60 - time_taken + 5)  # wait 5 seconds more to avoid rate limit
    return response


def generate_tests(
    config: dict,
    rq: int,
    dataset: str,
    prompt_file: str,
    prompts: list,
    max_tokens: int,
    tokenizer, model, device
) -> None:
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
    output_folder, scenario_folder, response_file, csv_file = get_output_files(
        config, rq, dataset, prompt_file, max_tokens, "CodeGen"
    )
    # opens output file in write mode (overwrite prior results)
    with open(response_file, "w") as json_file, open(csv_file, "w") as csv_out:
        csv_file = csv.writer(
            csv_out, delimiter=",", quotechar='"', quoting=csv.QUOTE_MINIMAL
        )
        csv_file.writerow(
            [
                "ID",
                "PROMPT_ID",
                "DURATION",
                "FINISH_REASON",
                "ORIGINAL_CODE",
                "TEST_PROMPT",
                "GENERATED_TEST",
            ]
        )
        json_file.write("[\n")
        for prompt in prompts:
            print("PROMPT", prompt["id"])
            try:
                # query Open AI to generate the unit test
                response = generate_code(prompt, max_tokens, tokenizer, model, device)
                # save the generated test in a file
                print("SAVING", prompt["id"], "at", scenario_folder)
                save_generated_code(prompt, response, max_tokens, scenario_folder)
                # save the response's metadata in CSV and JSON
                save_response(json_file, csv_file, prompt, prompts, response)
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
                time.sleep(60)  # some sleep to make sure we don't go over rate limit
                save_response(json_file, csv_file, prompt, prompts, mock_response)

        json_file.write("]")


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument(
        "-t",
        "--tokens",
        type=int,
        choices=[x * 1000 for x in range(1, 5)],
        help="token limit (ex: 1000)",
        required=True,
    )
    parser.add_argument(
        "-p",
        "--prompts",
        type=str,
        help="path to the JSON file with prompts",
        required=True,
    )
    parser.add_argument(
        "-dataset",
        "--dataset",
        type=str,
        choices=("SF110", "GitHub", "HumanEvalJava", "HumanEvalPython"),
        help="The dataset being used",
        required=True,
    )
    parser.add_argument(
        "-q",
        "--question",
        type=str,
        choices=("RQ1", "RQ2"),
        help="The research question (this will dictate where the file will be saved)",
        required=True,
    )

    args = parser.parse_args()

    config = load_config("config.json")
    print(args)
    # get list of parsed prompts from the JSON file
    prompts = get_prompts(config, args.prompts)

    print("Generating unit tests for", len(prompts), "prompts in", args.dataset)
    # generate unit tests
    question = int(args.question.replace("RQ", ""))
    device = "cuda" if torch.cuda.is_available() else "cpu"
    tokenizer, model =  setup_model(device="cuda" if torch.cuda.is_available() else "cpu")

    generate_tests(config, question, args.dataset, args.prompts, prompts, args.tokens, tokenizer, model, device)


if __name__ == "__main__":
    main()

# QUICK SCRIPT TO GENERATE SAMPLE USAGES
# for token in [x * 1000 for x in range(1, 5)]:
#     for prompt_file in ["100_jgaap_prompt.json", "27_gangup_prompt.json", "43_lilith_prompt.json", "63_objectexplorer_prompt.json", "81_javathena_prompt.json","10_water-simulator_prompt.json", "29_apbsmem_prompt.json", "47_dvd-homevideo_prompt.json", "64_jtailgui_prompt.json", "82_ipcalculator_prompt.json","11_imsmart_prompt.json", "2_a4j_prompt.json", "49_diebierse_prompt.json", "65_gsftp_prompt.json", "84_ifx-framework_prompt.json","12_dsachat_prompt.json", "30_bpmail_prompt.json", "4_rif_prompt.json", "67_gae-app-manager_prompt.json", "86_at-robots2-j_prompt.json","13_jdbacl_prompt.json", "31_xisemele_prompt.json", "51_jiprof_prompt.json", "68_biblestudy_prompt.json", "88_jopenchart_prompt.json","14_omjstate_prompt.json", "32_httpanalyzer_prompt.json", "52_lagoon_prompt.json", "69_lhamacaw_prompt.json", "8_gfarcegestionfa_prompt.json","15_beanbin_prompt.json", "33_javaviewcontrol_prompt.json", "54_db-everywhere_prompt.json", "6_jnfe_prompt.json", "91_classviewer_prompt.json","17_inspirento_prompt.json", "34_sbmlreader2_prompt.json", "55_lavalamp_prompt.json", "71_ext4j_prompt.json", "93_quickserver_prompt.json","19_jmca_prompt.json", "36_schemaspy_prompt.json", "56_jhandballmoves_prompt.json", "73_fim1_prompt.json", "94_jclo_prompt.json","22_byuic_prompt.json", "39_diffi_prompt.json", "57_hft-bomberman_prompt.json", "74_fixsuite_prompt.json","23_jwbf_prompt.json", "40_glengineer_prompt.json", "59_mygrid_prompt.json", "75_openhre_prompt.json","24_saxpath_prompt.json", "41_follow_prompt.json", "5_templateit_prompt.json", "76_dash-framework_prompt.json","25_jni-inchi_prompt.json", "42_asphodel_prompt.json", "60_sugar_prompt.json", "7_sfmis_prompt.json"]:
#         print(f"python3.9 generate_tests_codex.py -t {token} -d EvoSuiteBenchmark -q RQ1 -p RQ1_Test_Generation/OpenAI_Data/SF110_input/{prompt_file}")
