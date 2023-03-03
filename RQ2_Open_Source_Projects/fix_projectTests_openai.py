import json

from generate_projectTests_openai import load_config, generate_code, get_generate_output_files, save_generated_code

NEW_TOKEN_LIMIT = 4000 # changes the token size

def fix(config: dict, scenario: str) -> None:
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
        try:
            if not r["choices"][0]["finish_reason"] == "stop":
                # generates new code, with token limit size increased
                new_response = generate_code(r, NEW_TOKEN_LIMIT, True)
                save_generated_code(r, new_response, output_folder + outputPath)
                filtered_responses.append(new_response)
                print("Duration: ", new_response['time_taken'],
                      "Finish Reason:", new_response["choices"][0]["finish_reason"],
                      "\n" + "-" * 20)
            else:
                filtered_responses.append(r)
        except Exception as e:
            print("ERROR", e)
            filtered_responses.append(r)
            # mock_response = get_mock_response(r, str(e))
            # save_response(f, r, previous_responses, mock_response)

    # with open(response_file.replace(".json", "_fixed.json"), "w") as f:
    #     f.write(json.dumps(filtered_responses, indent=4))


def main():
    config = load_config("config.json")
    fix(config, "scribejava.json")


if __name__ == "__main__":
    main()
