import json
import re

from utils import load_config, get_output_files

EOF = ["\n\n// ", "\n```\n\n##", "</code>"]


def heuristic_1(code: str) -> str:
    """
    Removes the extra code from the generated tests.
    @param code: generated code.
    @return: code without the extra code
    """
    # removes the extra code
    for e in EOF:
        if e in code:
            code = code[: code.index(e)]
    return code


def heuristic_2(code: str) -> str:
    pattern = r"[\S\s.]*?\`\`\`([\S\s.]*?)\`\`\`[\S\s.]*?"
    good_code = re.findall(pattern, code, re.DOTALL)
    if len(good_code) > 0:
        code = good_code[0]
    return code


def heuristic_3(code: str) -> str:
    pattern = r"([\S\s.]*?)(\/\/ [A-Za-z0-9]+Test.java)"
    bad_code = re.findall(pattern, code, re.DOTALL)
    if len(bad_code) > 0:
        bad_code = bad_code[0][0]
        code = code.replace(bad_code, "")
    return code


def heuristic_4(code: str, scenario: str) -> str:
    keywords = ["updated", "revised", "modified", "changed", "altered"]
    for keyword in keywords:
        code = code.replace(f"package {keyword};", f"package {scenario};")
    return code


def heuristic_5(code: str, scenario: str) -> str:
    if f"package {scenario};" not in code:
        code = f"package {scenario};\n" + code
    return code


def remove_extra_code(model: str, code: str, scenario: str) -> str:
    code = heuristic_1(code)
    if model == "GPT3.5":
        code = heuristic_2(code)
        code = heuristic_3(code)
        code = heuristic_4(code, scenario)
        code = heuristic_5(code, scenario)

    
    return code


def get_generated_test(model: str, response: dict):
    if model == "OpenAI":
        return response["choices"][0]["text"]
    if model == "GPT3.5":
        return response["choices"][0]["message"]["content"]

    raise Exception(f"{model} is an unexpected value")


def fix_extra_code(
    config: dict,
    rq: int,
    dataset: str,
    prompt_file: str,
    max_tokens: int,
    model: str,
    scenario: str,
) -> None:
    """
    Fixes the extra code in the generated tests.
    @param model: model name (ex: OpenAI, CodeGen)
    @param max_tokens: token size
    @param prompt_file:  filename for the scenario (ex: "Scenario1_prompt.json")
    @param rq: research question (ex: "RQ1")
    @param dataset: the name of the dataset (ex: "HumanEvalJava")
    @param config: dictionary of the parsed configuration
    """
    # sets the data output paths
    output_folder, scenario_folder, json_file, csv_file = get_output_files(
        config, rq, dataset, prompt_file, max_tokens, model
    )

    # load previously computed response
    with open(json_file, "r") as f:
        previous_responses = json.load(f)

    # creates a new array with responses that are fixed
    filtered_responses = []
    for r in previous_responses:
        old_code = get_generated_test(model, r)  # r["choices"][0]["text"]
        new_code = remove_extra_code(model, old_code, scenario)
        r["removed_extra_code"] = old_code != new_code
        r["original_generated_code"] = old_code

        if model == "OpenAI":
            r["choices"][0]["text"] = new_code
        if model == "GPT3.5":
            r["choices"][0]["message"]["content"] = new_code
            with open("./dummy_output/" + r["prompt_id"].replace("/", "_"), "w") as f:
                f.write(new_code)

        r["choices"][0]["text"] = new_code
        print("\tPROMPT", r["prompt_id"], "FIXED?", r["removed_extra_code"])
        # code has un-matching {} pairs
        # check_code_blocks(new_code, r)

        filtered_responses.append(r)

    fixed_json_file = json_file.replace(".json", "_fixed_extracode_gpt3.json")
    with open(fixed_json_file, "w") as f:
        f.write(json.dumps(filtered_responses, indent=4))
    print("SAVED AT ", fixed_json_file)


def main():
    config = load_config("config.json")
    dataset = "HumanEvalJava"
    model = "GPT3.5"  # "OpenAI"
    scenarios = ["original", "scenario1", "scenario2", "scenario3"]
    tokens = [2000]  # , 4000]
    for max_tokens in tokens:
        for scenario in scenarios:
            rq = 1 if scenario == "original" else 2
            rq_folder = "RQ1_Test_Generation" if rq == 1 else "RQ2_Prompt_Elements"
            prompt_file = (
                f"{rq_folder}/{model}_Data/HumanEvalJava_input/{scenario}_prompt.json"
            )
            print(f"RQ{rq}. Scenario: {scenario}. Token: {max_tokens}")
            fix_extra_code(
                config, rq, dataset, prompt_file, max_tokens, model, scenario
            )


if __name__ == "__main__":
    main()
