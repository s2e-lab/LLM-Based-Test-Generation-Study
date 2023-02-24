

# Scripts

- test_generator_openai.py: Generates test cases using OpenAI's API. Token size is 1024.
- filter_test_generator.py: Generates test cases using OpenAI's API for samples that run out of the token size. Token size is 4000.
- script_remove_old_test_cases.py: Removes test cases for the ICPC paper that were generated using OpenAI's API but were not used in the evaluation.
- test_file_generation.py: Generates test file from the generated test cases. 

# Configuration


- `example_config.json`: File used for configuring the script `test_file_generation.py`: 
	- `API_KEY`: You OpenAI API developer key.
	- `BASE_DIRECTORY`: Full/relative path to the **OpenAI_Data** folder that contains the HumanEval dataset decomposed into 3 scenarios. For example: `/Users/abcd/Documents/study_repo/RQ1_Prompt_Elements/OpenAI_Data/`.

