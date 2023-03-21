import json

from generate_tests_openai import load_config, get_output_files

EOF = ["\n\n// ", "\n```\n\n##", "</code>"]


def remove_extra_code(code: str) -> str:
    """
    Removes the extra code from the generated tests.
    @param code: generated code
    @return: code without the extra code
    """
    # removes the extra code
    for e in EOF:
        if e in code:
            code = code[:code.index(e)]

    return code


def fix_extra_code(config: dict, rq: int, dataset: str, prompt_file: str, max_tokens: int) -> None:
    """
    Fixes the extra code in the generated tests.
    @param config: dictionary of the parsed configuration
    @param scenario: filename for the scenario (ex: "Scenario1_prompt.json")
    """
    # sets the data output paths
    output_folder, scenario_folder, json_file, csv_file = get_output_files(config, rq, dataset, prompt_file, max_tokens)

    # load previously computed response
    with open(json_file, "r") as f:
        previous_responses = json.load(f)

    # creates a new array with responses that are fixed
    filtered_responses = []
    for r in previous_responses:
        old_code = r["choices"][0]["text"]
        r["choices"][0]["text"] = remove_extra_code(old_code)
        r["removed_extra_code"] = old_code != r["choices"][0]["text"]
        r["original_generated_code"] = old_code
        print("PROMPT", r["prompt_id"], "FIXED?", r["removed_extra_code"])
        filtered_responses.append(r)

    fixed_json_file = json_file.replace(".json", "_fixed_extracode.json")
    with open(fixed_json_file, "w") as f:
        f.write(json.dumps(filtered_responses, indent=4))
    print("SAVED AT ", fixed_json_file)


def main():
    config = load_config("config.json")

    for max_tokens in [2000, 4000]:
        rq = 1
        dataset = "HumanEvalJava"
        prompt_file = "RQ1_Test_Generation/OpenAI_Data/HumanEvalJava_input/original_prompt.json"
        fix_extra_code(config, rq, dataset, prompt_file, max_tokens)

    for max_tokens in [2000, 4000]:
        for scenario in ["scenario1", "scenario2", "scenario3"]:
            rq = 2
            dataset = "HumanEvalJava"
            prompt_file = f"RQ2_Prompt_Elements/OpenAI_Data/HumanEvalJava_input/{scenario}_prompt.json"
            fix_extra_code(config, rq, dataset, prompt_file, max_tokens)


if __name__ == "__main__":
    main()
