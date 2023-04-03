import json
import os
import re

import javalang
from javalang.parser import JavaSyntaxError
from javalang.tokenizer import LexerError

from utils import load_config, get_output_files


def heuristic_1(code: str, cut_classname: str) -> tuple[str, bool]:
    """
    Removes the extra code from the generated tests.
    @param cut_classname: the simple name of the class under test
    @param code: generated code.
    @return: a tuple (str, bool).
        [0] = code without the extra code; [1] = true if this heuristic was applied
    """

    # notice that if the file had an error, it won't have the @Test annotation,
    # so we use the class name instead because it should be there from the prompt,
    # which has `class ClassName...Test{}`
    ignore_line_before = code.index("@Test") if "@Test" in code else code.index(f"class {cut_classname}")
    # removes the extra code
    eof_tokens = [f"\n\n// {cut_classname}", "\n```\n\n##", "</code>"]
    applied_heuristic = False
    for e in eof_tokens:
        index = code.index(e) if e in code else None
        if index and index > ignore_line_before:
            code = code[:index]
            applied_heuristic = True
    return code, applied_heuristic


def heuristic_2(code: str) -> tuple[str, bool]:
    """
    Captures the code between the triple backticks.
    @param code: generated code.
    @return: code between the triple backticks
    """
    applied_heuristic = False
    pattern = r"[\S\s.]*?\`\`\`([\S\s.]*?)\`\`\`[\S\s.]*?"
    good_code = re.findall(pattern, code, re.DOTALL)
    if len(good_code) > 0:
        code = good_code[0]
        applied_heuristic = True
    return code, applied_heuristic


def heuristic_3(code: str, cut_classname: str) -> tuple[str, bool]:
    """
    Remove the code that is not part of the test.
    @param cut_classname: simple name of the class under test.
    @param code: generated code.
    @return: code that is part of the test
    """
    applied_heuristic = False
    # a more strict pattern that only matches the test class name
    pattern = r"(\/\/ " + cut_classname + ".java[\S\s.]*?)(\/\/ " + cut_classname + "[0-9a-zA-Z_]*Test.java)"
    bad_code = re.findall(pattern, code, re.DOTALL)
    if len(bad_code) > 0:
        bad_code = bad_code[0][0]
        if len(bad_code.strip()) != 0:
            code = code.replace(bad_code, "\n").strip()
            applied_heuristic = True
    return code, applied_heuristic


def heuristic_4_and_5(code: str, package: str, test_classname: str) -> tuple[str, bool, bool]:
    """
    Replaces the package name with the scenario name.
    @param test_classname: the simple name of the generated test class
    @param code: generated code.
    @param package: the package where the CUT is
    @return: the code with the package (if needed), and two booleans (H4, H5) to indicate what heuristic was applied.
    (code, H4, H5)
    """
    applied_heuristic_h4, applied_heuristic_h5 = False, False
    package_regex = r"package\s+([a-z][a-z0-9_\.]*)\s*;"
    # search only in the beginning of the file (before the test class)
    m = re.search(package_regex, code[:code.index(f"class {test_classname}")], re.IGNORECASE)
    missing = True
    if m:
        missing = False
        actual_package = m.group(1)
        if package and actual_package != package:
            applied_heuristic_h4 = True
            code = code[:m.start()] + f"package {package};\n" + code[m.end():]
    # test should be in a package, but package declaration is missing
    # thus, apply H5 here
    if package and missing:
        code = f"package {package};\n" + code
        applied_heuristic_h5 = True

    return code, applied_heuristic_h4, applied_heuristic_h5

def get_classname(code: str) -> str:
    """
    Gets the name of the CUT from the test prompt.
    @param code: the test prompt or the original code (it assumes it starts with `// classname.java`)
    @return: the classname of the CUT or the unit test to be generated
    """
    return code.split("\n")[0][3:-5].strip()

def get_full_code(code: str, response: dict) -> str:
    """
    Gets the full code from the response (including the test prompt).
    @param code: generated code.
    @param response: the original response from the model
    @return: full code
    """
    test_prompt = response["test_prompt"]
    test_classname = get_classname(test_prompt)
    # code does not contain the test prompt
    # and the test prompt class should appear before the first @Test annotation
    if test_prompt.strip() in code and code.index(test_prompt.strip()) < code.index("@Test"):
        return code
    # if it contains the prompt, the test prompt class should appear before the first @Test annotation
    if f"class {test_classname}" in code and code.index(f"class {test_classname}") < code.index("@Test"):
        return code
    # if we reach here, the code needs to be pre-pended with the test prompt
    return (test_prompt + "\n\t\t" + code).strip()


def fix_code(model: str, code: str, scenario: str, response: dict) -> str:
    """
    Removes the extra code from the generated tests.
    @param model: model name (ex: OpenAI, CodeGen)
    @param code: generated code.
    @param scenario: scenario name
    @param response: the original response from the model
    @return: code without the extra code
    """
    full_code = get_full_code(code, response)

    cu_original = parse_code(response["original_code"])
    package_name = cu_original.package.name if cu_original.package else None
    test_classname = get_classname(response["test_prompt"])
    cut_classname = cu_original.types[0].name
    # track what heuristic(s) were applied, if any
    applied_heuristics = [False for _ in range(0, 5)]

    if model == "GPT3.5":
        # H2: retrieve code in between the triple backticks (only applies to ChatGPT)
        full_code, applied_heuristics[1] = heuristic_2(full_code)

    # H1: removes the extra code (after the unit test)
    full_code, applied_heuristics[0] = heuristic_1(full_code, cut_classname)
    # H3: remove the original code from the CUT
    full_code, applied_heuristics[2] = heuristic_3(full_code, cut_classname)
    # H4: replaces the package name with the scenario name
    # H5: adds the package name if it is missing
    full_code, applied_heuristics[3], applied_heuristics[4] = heuristic_4_and_5(full_code, package_name, test_classname)

    applied_heuristics = [f"H{i + 1}" for i in range(0, 5) if applied_heuristics[i]]

    return full_code, applied_heuristics


def get_generated_test(model: str, response: dict):
    """
    Gets the generated test from the response.
    @param model: model name (ex: OpenAI, CodeGen)
    @param response: response from the model
    @return: generated test
    """
    if model == "OpenAI":
        return response["choices"][0]["text"]
    if model == "GPT3.5":
        return response["choices"][0]["message"]["content"]

    raise Exception(f"{model} is an unexpected value")


def fix_extra_code(config: dict, rq: int, dataset: str, prompt_file: str, max_tokens: int, model: str,
                   scenario: str) -> None:
    """
    Fixes the extra code in the generated tests.
    @param scenario: scenario name (ex: scenario1)
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
        new_code, applied_heuristics = fix_code(model, old_code, scenario, r)
        r["original_generated_code"] = old_code
        r["applied_heuristics"] = ";".join(applied_heuristics)

        if model == "OpenAI":
            r["choices"][0]["text"] = new_code
        if model == "GPT3.5":
            r["choices"][0]["message"]["content"] = new_code
            with open("./dummy_output/" + r["prompt_id"].replace("/", "_"), "w") as f:
                f.write(new_code)

        r["choices"][0]["text"] = new_code
        print("\tPROMPT", r["prompt_id"], "APPLIED HEURISTICS", r["applied_heuristics"])
        # code has un-matching {} pairs
        # check_code_blocks(new_code, r)

        filtered_responses.append(r)

    fixed_json_file = json_file.replace(".json", "_fixed_extracode.json")
    with open(fixed_json_file, "w") as f:
        f.write(json.dumps(filtered_responses, indent=4))
    print("SAVED AT ", fixed_json_file)


def run_humaneval(config, dataset, max_tokens, model, rq, rq_folder, scenario):
    prompt_file = (
        f"{rq_folder}/{model}_Data/HumanEvalJava_input/{scenario}_prompt.json"
    )
    print(f"RQ{rq}. Scenario: {scenario}. Token: {max_tokens}")
    fix_extra_code(
        config, rq, dataset, prompt_file, max_tokens, model, scenario
    )


def run_sf110(config, dataset, max_tokens, model, rq, rq_folder, scenario):
    prompt_folder = f"../{rq_folder}/{model}_Data/SF110_input/"
    # finds all json files in prompt_folder
    prompt_files = [f for f in os.listdir(prompt_folder) if
                    f.endswith(".json") and ((rq == 1) or (rq == 2 and scenario in f))]
    for prompt_file in prompt_files:
        print(f"RQ{rq}\tScenario: {scenario}\tToken: {max_tokens}\tPrompt: {prompt_file}")
        fix_extra_code(
            config, rq, dataset, prompt_file, max_tokens, model, scenario
        )


def parse_code(code) -> bool:
    try:
        return javalang.parse.parse(code)  # code is compilable
    except (JavaSyntaxError, LexerError, TypeError) as e:
        return None


def main():
    config = load_config("config.json")
    dataset = "HumanEvalJava"  # Possible values: "HumanEvalJava" "SF110"
    model = "GPT3.5"  # Possible values: "OpenAI" "GPT3.5"
    scenarios = ["original"]  # , "scenario1", "scenario2", "scenario3", "scenario4"]
    tokens = [2000]  # , 4000]
    for max_tokens in tokens:
        for scenario in scenarios:
            rq = 1 if scenario == "original" else 2
            rq_folder = "RQ1_Test_Generation" if rq == 1 else "RQ2_Prompt_Elements"
            if dataset == "HumanEvalJava":
                run_humaneval(config, dataset, max_tokens, model, rq, rq_folder, scenario)
            elif dataset == "SF110":
                run_sf110(config, dataset, max_tokens, model, rq, rq_folder, scenario)
            else:
                raise Exception("Unknown")


if __name__ == "__main__":
    main()
