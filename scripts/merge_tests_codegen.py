import json

from utils import load_config, get_output_files


def get_generated_test(model: str, response: dict):
    generated_test = []
    for c in response["choices"]:
        gen_code = c["text"]
        #  the code generated the method followed by a "}" to close the class of the prompt
        if (gen_code.count("{") + 1) == gen_code.count("}") and c["finish_reason"] == 'stop':
            # remove the last curly bracket (replace by a blank space)
            index = gen_code.rfind("}")
            gen_code = gen_code[:index] + " " + gen_code[index + 1:]
            generated_test.append(gen_code)

    # if the # of {} is off-by-one, just add one "}" to close the test_prompt class
    test_code = "\n".join(generated_test)
    if (test_code.count("{") + 1) == test_code.count("}"):
        return test_code + "\n}"

    return test_code


def merge_suggestions(config: dict, rq: int, dataset: str, prompt_file: str, max_tokens: int, model: str) -> None:
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
        i = 1
        for c in r["choices"]:
            new_resp = r.copy()
            gen_code = r["test_prompt"] + "\n\t" + c["text"]
            new_resp["removed_extra_code"] = False
            new_resp["original_generated_code"] = gen_code
            new_resp["choices"][0]["text"] = gen_code
            new_resp["choice_no"] = i
            # only keep the first recommendation, that has the merged output with test prompt
            del new_resp["choices"][1:]
            filtered_responses.append(new_resp)
            i += 1
            print("\tPROMPT", r["prompt_id"], gen_code)

    fixed_json_file = json_file.replace(".json", "_fixed_extracode.json")
    with open(fixed_json_file, "w") as f:
        f.write(json.dumps(filtered_responses, indent=4))
    print("SAVED AT ", fixed_json_file)


def main():
    config = load_config("config.json")
    dataset = "HumanEvalJava"
    model = "CodeGen"
    scenarios = ["original", "scenario1", "scenario2", "scenario3"]
    tokens = [2000]
    for max_tokens in tokens:
        for scenario in scenarios:
            rq = 1 if scenario == "original" else 2
            rq_folder = "RQ1_Test_Generation" if rq == 1 else "RQ2_Prompt_Elements"
            prompt_file = f"{rq_folder}/{model}_Data/HumanEvalJava_input/{scenario}_prompt.json"
            print(f"RQ{rq}. Scenario: {scenario}. Token: {max_tokens}")
            merge_suggestions(config, rq, dataset, prompt_file, max_tokens, model)


if __name__ == "__main__":
    main()
