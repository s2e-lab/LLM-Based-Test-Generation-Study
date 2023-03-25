import json

from utils import load_config, get_output_files

EOF = ["\n\n// ", "\n```\n\n##", "</code>"]


def remove_extra_code(code: str) -> str:
    """
    Removes the extra code from the generated tests.
    @param code: generated code.
    @return: code without the extra code
    """
    # removes the extra code
    for e in EOF:
        if e in code:
            code = code[:code.index(e)]

    return code

def get_generated_test(model: str, response: dict):
    if model == "OpenAI":
        return response["choices"][0]["text"]
    if model == "GPT3.5":
        return response["choices"][0]["message"]["content"]

    raise Exception(f"{model} is an unexpected value")




def fix_extra_code(config: dict, rq: int, dataset: str, prompt_file: str, max_tokens: int, model: str) -> None:
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
    output_folder, scenario_folder, json_file, csv_file = \
        get_output_files(config, rq, dataset, prompt_file, max_tokens, model)

    # load previously computed response
    with open(json_file, "r") as f:
        previous_responses = json.load(f)

    # creates a new array with responses that are fixed
    filtered_responses = []
    for r in previous_responses:
        old_code = get_generated_test(model, r) # r["choices"][0]["text"]
        new_code = remove_extra_code(old_code)
        r["removed_extra_code"] = old_code != new_code
        r["original_generated_code"] = old_code
        r["choices"][0]["text"] = new_code
        print("\tPROMPT", r["prompt_id"], "FIXED?", r["removed_extra_code"])
        filtered_responses.append(r)

    fixed_json_file = json_file.replace(".json", "_fixed_extracode.json")
    with open(fixed_json_file, "w") as f:
        f.write(json.dumps(filtered_responses, indent=4))
    print("SAVED AT ", fixed_json_file)


def main():
    config = load_config("config.json")
    dataset = "HumanEvalJava"
    model = "GPT3.5"
    scenarios = ["original"]#, "scenario1", "scenario2", "scenario3","scenario4"]
    tokens = [2000]#, 4000]
    for max_tokens in tokens:
        for scenario in scenarios:
            rq = 1 if scenario == "original" else 2
            rq_folder = "RQ1_Test_Generation" if rq == 1 else "RQ2_Prompt_Elements"
            prompt_file = f"{rq_folder}/{model}_Data/HumanEvalJava_input/{scenario}_prompt.json"
            print(f"RQ{rq}. Scenario: {scenario}. Token: {max_tokens}")
            fix_extra_code(config, rq, dataset, prompt_file, max_tokens, model)


if __name__ == "__main__":
    main()
