import json

EOF = "\n\n// "

from generate_projectTests_openai import load_config, generate_code, get_generate_output_files, save_generated_code

def remove_extracode(code: str) -> str:
    """
    Removes the extra code from the generated tests.
    @param code: generated code
    @return: code without the extra code
    """
    # removes the extra code
    if EOF in code:
        code = code[:code.index(EOF)]
    return code.strip()


def fix_extracode(config: dict, scenario: str) -> None:
    """
    Fixes the extra code in the generated tests.
    @param config: dictionary of the parsed configuration
    @param scenario: filename for the scenario (ex: "Scenario1_prompt.json")
    """
    # sets the data output paths
    output_folder, response_file = get_generate_output_files(config, scenario)
    projectName = scenario.split(".")[0]

    # load previously computed response
    with open(response_file, "r") as f:
        previous_responses = json.load(f)

    # creates a new array with responses that are fixed
    filtered_responses = []
    for r in previous_responses:
        print("PROMPT", r["prompt_id"])
        outputPath = r["prompt_id"].split(projectName)[1]
        outputPath = outputPath.replace("/java/", "/test/")
        print(outputPath)

        if not r["choices"][0]["finish_reason"] == "stop":

            old_code = r["choices"][0]["text"].strip()

            r["choices"][0]["text"] = remove_extracode(old_code)

            if old_code != r["choices"][0]["text"]:
                r["removed_extracode"] = True
                print("Code was fixed")
            
            save_generated_code(r, r, output_folder + outputPath)
            filtered_responses.append(r)

        else:
            filtered_responses.append(r)

    with open(response_file.replace(".json", "_fixed_extracode.json"), "w") as f:
        f.write(json.dumps(filtered_responses, indent=4))


def main():
    config = load_config("config.json")
    fix_extracode(config, "scribejava.json")


if __name__ == "__main__":
    main()