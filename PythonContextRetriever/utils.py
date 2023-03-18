import os
import json
PYTEST_TEMPLATE = """# {filename}_{suffix}Test.java
from {scenario}.{filename} import {routine_name}
{import_statements}
import pytest

class {filename}_{suffix}Test:
    \"\"\"
    Test class of {filename}.py.
    It contains {number_tests} unit test cases for the :{routine_type}:`{scenario}.{filename}.{routine_name}`.
    \"\"\"
"""

BASE_DIR = "../"
# folders for RQ1
RQ1_BASE_DIR = BASE_DIR + "RQ1_Test_Generation/"
RQ1_PROMPT_OUTPUT_FILE = RQ1_BASE_DIR + "OpenAI_Data/%s_input/%s_prompt.json"

# folders for RQ2
RQ2_BASE_DIR = BASE_DIR + "RQ2_Prompt_Elements/"
RQ2_PROMPT_OUTPUT_FILE = RQ2_BASE_DIR + "OpenAI_Data/%s_input/%s_prompt.json"


def compute_id(file_path: str, filename, suffix: str) -> str:
    """
    ID is equals to the relative path to the file under analysis appended with a suffix (if not empty).
    Ex: suffix = 001 and javaFile = /path/to/HumanEvalJava/src/main/scenario1/id_1.java
    ID = /HumanEvalJava/src/main/scenario1/id_1_001Test.java
    @param file_path: path to the python file under analysis
    @param filename: filename of the python script under analysis
    @param suffix: suffix to be appended to the ID
    @return: a unique identifier for the prompt being generated
    """
    # if a suffix is provided, then append it to the test filename
    test_filename = f"{filename}_{suffix}Test.py" if suffix else filename
    # get parent path
    parent_path = os.path.dirname(file_path)
    # concatenate with the computed filename
    return os.path.join(parent_path, test_filename)


def save(prompts, output_file_path):
    # Serializing json
    json_object = json.dumps(prompts, indent=4)

    # Writing to sample.json
    with open(output_file_path, "w") as outfile:
        outfile.write(json_object)
