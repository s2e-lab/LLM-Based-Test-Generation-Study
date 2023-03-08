<<<<<<< HEAD
# Scripts

- `generate_tests_openai.py`:
Generates test cases using OpenAI's API. It produces a JSON containing the results metadata as well as all the generated test files in separate `.java` files. 
The token size and scenario under analysis are specified as program arguments.
- `fix_tests_openai.py`: Re-generates test cases using OpenAI's API for samples that run out of the token size. Token size is `4096`.

# Configuration


- `example_config.json`: File used for configuring the script `test_file_generation.py`: 
	- `API_KEY`: You OpenAI API developer key.
	- `BASE_DIRECTORY`: Full/relative path to the **OpenAI_Data** folder that contains the HumanEval dataset decomposed into 3 scenarios. For example: `/Users/abcd/Documents/study_repo/RQ1_Prompt_Elements/OpenAI_Data/`.



# Folders

- `data`: Java samples extracted from HumanEval (java version)
- `OpenAI_Data`: JSON files with prompts used to generate tests (`inputs`) and the outcome of the results (`output`) 
- `RQ1_Result`