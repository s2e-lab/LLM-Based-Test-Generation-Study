# from generate_tests_openai import load_config, generate_code
#
#
# def fix(config: dict, scenario: str) -> None:
#     output_folder = os.path.join(config["BASE_DIRECTORY"], "output/")
#     with open(os.path.join(output_folder, scenario.replace("prompt", "output")), "w") as response_file:
#         responses = json.load(response_file)
#
#
# def main():
#     config = load_config("config.json")
#     fix(config, "scenario1_prompt.json")
#
#
# if __name__ == "__main__":
#     main()
