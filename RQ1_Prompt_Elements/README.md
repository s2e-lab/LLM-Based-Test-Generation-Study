

# Scripts

- test_generator_openai.py: Generates test cases using OpenAI's API. Token size is 1024.
- filter_test_generator.py: Generates test cases using OpenAI's API for samples that run out of the token size. Token size is 4000.
- script_remove_old_test_cases.py: Removes test cases for the ICPC paper that were generated using OpenAI's API but were not used in the evaluation.
- test_file_generation.py: Generates test file from the generated test cases. 

# Configuration


- example_config.json: File used for configuring the script `test_file_generation.py`: 
	- `API_KEY`: You OpenAI API developer key.
	- `BASE_DIRECTORY`: Full/relative path to the data folder that contains the HumanEval dataset decomposed into 3 scenarios.

- openai_Part2.json
- openai_Part3.json: Test cases with 1024 tokens generated using OpenAI's API for the 3 scenarios.
- Filter_openai_Part3.json: Test cases with 4000 tokens generated using OpenAI's API for the 3 scenarios that run out of the token size.
