from generate_tests_openai import load_config, get_output_files, save_generated_code
import os
import json


def updateOutputFolder(config: dict, scenario: str) -> str:
    scenarioFolder = scenario.split("_")[0]
    output_folder = os.path.join(
        config["BASE_DIRECTORY"], f"output/test_{scenarioFolder}"
    )
    if not os.path.exists(output_folder):
        os.makedirs(output_folder)
    return output_folder


def updateResponseFile(response_file: str) -> str:
    return response_file.replace(".json", ".json")


def parser(config: dict, scenario: str) -> None:
    output_folder, response_file = get_output_files(config, scenario)

    output_folder = updateOutputFolder(config, scenario)
    response_file = updateResponseFile(response_file)

    with open(response_file, "r") as response:
        prompts = json.load(response)
        for prompt in prompts:
            print(prompt)
            save_generated_code(prompt, prompt, output_folder)


def main():
    config = load_config("config.json")
    parser(config, "scenario1_prompt.json")


if __name__ == "__main__":
    main()
