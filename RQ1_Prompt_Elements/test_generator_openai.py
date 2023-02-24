import json
import os
import time

import openai

RE_FILENAME = "^id_([0-9]+).java"

# Generation Configuration Parameters
OPENAI_MODEL = "code-davinci-002"
OPENAI_TEMPERATURE = 0
OPENAI_MAX_TOKENS = 2048
OPENAI_TOP_P = 1
OPENAI_FREQUENCY_PENALTY = 0
OPENAI_PRESENCE_PENALTY = 0


def load_config(config_file: str) -> dict:
    """Loads the JSON configuration and sets the OpenAI API key.
    @param config_file:  Path to the JSON configuration file.
    @returns config: dictionary of the parsed configuration
    """
    with open(config_file) as json_file:
        config = json.load(json_file)
    return config


def generate_tests(config: dict, scenario: str) -> None:
    """Generates tests for the given scenario.
    @param config: dictionary of the parsed configuration
    @param scenario: filename for the scenario (ex: "Scenario1_prompt.json")
    """
    # sets the OpenAI key
    openai.api_key = config["OPEN_AI_KEY"]
    scenario_path = os.path.join(config["BASE_DIRECTORY"], "input", scenario)
    output_path = os.path.join(config["BASE_DIRECTORY"], "output/", scenario.replace("prompt", "output"))
    responses = []
    with open(scenario_path, 'r') as scenario_file:
        prompts = json.load(scenario_file)
        for prompt in prompts:
            print("PROMPT", prompt["id"])
            start_time = time.time()
            try:
                response = openai.Completion.create(
                    model=OPENAI_MODEL,
                    prompt=prompt["original_code"] + "\n" + prompt["test_prompt"].strip(),
                    temperature=OPENAI_TEMPERATURE,
                    max_tokens=OPENAI_MAX_TOKENS,
                    top_p=OPENAI_TOP_P,
                    frequency_penalty=OPENAI_FREQUENCY_PENALTY,
                    presence_penalty=OPENAI_PRESENCE_PENALTY,
                )
                time_taken = time.time() - start_time
                response["time_taken"] = time_taken
                response["id"] = prompt["id"]
                response["original_code"] = prompt["original_code"]
                response["test_prompt"] = prompt["test_prompt"]
                responses.append(response)
                time.sleep(100)
                print("Duration:", time_taken)
                print(response)
                print("-" * 20)
            except Exception as e:
                print("ERROR", e)

    # opens output file in write mode (overwritte prior results)
    with open(output_path, "w") as output_file:
        output_file.write(json.dumps(responses, indent=4))


def main():
    config = load_config("config.json")
    generate_tests(config, "scenario1_prompt.json")


if __name__ == "__main__":
    main()

"""
{
  "choices": [
	{
	  "finish_reason": "stop",
	  "index": 0,
	  "logprobs": null,
	  "text": "\nclass HasCloseElementsTest {\n	@Test\n	void hasCloseElements() {\n		List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));\n		assertEquals(false, HasCloseElements.hasCloseElements(numbers, 0.5));\n	}\n\n	@Test\n	void hasCloseElements2() {\n		List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.8, 3.0, 4.0, 5.0, 2.0));\n		assertEquals(true, HasCloseElements.hasCloseElements(numbers, 0.3));\n	}\n\n	@Test\n	void hasCloseElements3() {\n		List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2));\n		assertEquals(true, HasCloseElements.hasCloseElements(numbers, 0.3));\n	}\n\n	@Test\n	void hasCloseElements4() {\n		List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2));\n		assertEquals(false, HasCloseElements.hasCloseElements(numbers, 0.05));\n	}\n\n	@Test\n	void hasCloseElements5() {\n		List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0));\n		assertEquals(true, HasCloseElements.hasCloseElements(numbers, 0.95));\n	}\n\n	@Test\n	void hasCloseElements6() {\n		List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0));\n		assertEquals(false, HasCloseElements.hasCloseElements(numbers, 0.8));\n	}\n\n	@Test\n	void hasCloseElements7() {\n		List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0));\n		assertEquals(true, HasCloseElements.hasCloseElements(numbers, 0.1));\n	}\n\n	@Test\n	void hasCloseElements8() {\n		List<Double> numbers = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1));\n		assertEquals(true, HasCloseElements.hasCloseElements(numbers, 1.0));\n	}\n\n	@Test\n	void hasCloseElements9() {\n		List<Double> numbers = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1));\n		assertEquals(false, HasCloseElements.hasCloseElements(numbers, 0.5));\n	}\n\n	@Test\n	void hasCloseElements10() {\n		List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0));\n		assertEquals(true, HasCloseElements.hasCloseElements(numbers, 0.1));\n	}\n}"
	}
  ],
  "created": 1675995324,
  "id": "cmpl-6iDEadFtcUy4MuWThS41U1LCupsXG",
  "model": "code-davinci-002",
  "object": "text_completion",
  "usage": {
	"completion_tokens": 831,
	"prompt_tokens": 583,
	"total_tokens": 1414
  }
}
"""
