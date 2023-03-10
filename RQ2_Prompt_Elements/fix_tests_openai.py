import json
import time

from generate_tests_openai import load_config, generate_code, get_output_files, save_generated_code, get_mock_response, save_response

NEW_TOKEN_LIMIT = 4000 # changes the token size

def fix(config: dict, scenario: str) -> None:
    output_folder, response_file = get_output_files(config, scenario)
    # load previously computed response
    with open(response_file, "r") as f:
        previous_responses = json.load(f)

    # creates a new array with responses that are fixed
    filtered_responses = []
    
    for r in previous_responses:
        print("PROMPT", r["prompt_id"])
        if r["prompt_id"] not in ["144","163"]:
            continue
        try:
            if not r["choices"][0]["finish_reason"] == "stop":
                # generates new code, with token limit size increased
                new_response = generate_code(r, NEW_TOKEN_LIMIT, True)
                save_generated_code(r, new_response, max_tokens, output_folder)
                filtered_responses.append(new_response)
                print(new_response)
                print("Duration: ", new_response['time_taken'],
                      "Finish Reason:", new_response["choices"][0]["finish_reason"],
                      "\n" + "-" * 20)
            else:
                filtered_responses.append(r)
        except Exception as e:
            print("ERROR", e)
            filtered_responses.append(r)
            time.sleep(60)
            # mock_response = get_mock_response(r, str(e))
            # save_response(f, r, previous_responses, mock_response)

    # with open(response_file.replace(".json", "_fixed.json"), "w") as f:
    #     f.write(json.dumps(filtered_responses, indent=4))


def main():
    config = load_config("config.json")
    fix(config, "scenario3_prompt.json")


if __name__ == "__main__":
    main()
