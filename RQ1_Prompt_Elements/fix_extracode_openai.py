import json

EOF = ["\n\n// ","\n```\n\n##","</code>"]

from generate_tests_openai import load_config,get_fixed_files,save_generated_code

def remove_extracode(code: str) -> str:
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


def fix_extracode(config: dict, scenario: str) -> None:
    """
    Fixes the extra code in the generated tests.
    @param config: dictionary of the parsed configuration
    @param scenario: filename for the scenario (ex: "Scenario1_prompt.json")
    """
    output_folder, response_file = get_fixed_files(config, scenario)
    # load previously computed response
    with open(response_file, "r") as f:
        previous_responses = json.load(f)

    # creates a new array with responses that are fixed
    filtered_responses = []
    for r in previous_responses:
        print("PROMPT", r["prompt_id"])
        
        old_code = r["choices"][0]["text"]

        r["choices"][0]["text"] = remove_extracode(old_code)

        if old_code != r["choices"][0]["text"]:
                r["removed_extracode"] = True
                print("Code was fixed")
            
        save_generated_code(r, r, output_folder)
        filtered_responses.append(r)


    with open(response_file.replace(".json", "_fixed_extracode.json"), "w") as f:
        f.write(json.dumps(filtered_responses, indent=4))


def main():
    config = load_config("config.json")
    fix_extracode(config, "scenario1_prompt.json")


if __name__ == "__main__":
    main()