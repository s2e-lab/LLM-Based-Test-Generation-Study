import ast
import os

from utils import PYTEST_TEMPLATE
from utils import RQ2_PROMPT_OUTPUT_FILE, RQ1_PROMPT_OUTPUT_FILE
from utils import compute_id, save


def top_level_functions(body):
    return (f for f in body if isinstance(f, ast.FunctionDef))


def get_dependencies(body):
    modules = []

    # Walk every node in the tree
    for node in ast.walk(body):
        # If the node is 'import x', then extract the module names
        if isinstance(node, ast.Import):
            modules.extend([x.name for x in node.names])

        # If the node is 'from x import y', then extract the module name
        #   and check level, so we can ignore relative imports
        if isinstance(node, ast.ImportFrom) and node.level is None:
            modules.append(node.module)

    return modules


def parse_ast(filename):
    with open(filename, "rt") as file:
        return ast.parse(file.read(), filename=filename)


def get_humaneval_mapping(path: str) -> {}:
    """
    Returns a dictionary: (key = 'filename' / value = 'function_name').
    @param path: path to where the files under analysis are located.
    """
    out: dict[str, str] = {}
    dir_list = os.listdir(path)
    for file in dir_list:
        if file.endswith(".py"):
            file_path = os.path.join(path, file)
            tree = parse_ast(file_path)
            function_names = []
            for func in top_level_functions(tree.body):
                function_names.append(func.name)
            # filename, without extension
            filename = os.path.splitext(os.path.basename(file_path))[0]
            out[filename] = function_names[-1]

    return out


def get_humaneval_prompts(path: str, mappings: dict, scenario: str) -> []:
    """
    Return a list of prompts.

    @param scenario: the package where the script is located.
    @param mappings: dictionary (filename -> function_name).
    @param path: base path that contains the script.
    """
    prompts = []
    for filename, function_name in mappings.items():
        file_path = os.path.join(path, f"{filename}.py")
        with open(file_path, "r") as file:
            suffix = ""  # empty because the HumanEval has one function to be tested per file
            original_code = f"# {filename}.py\n{file.read()}"
            import_statements = ""  # FIXME: should we extract these from the original code?
            routine_name = function_name
            number_tests = "ten"
            routine_type = "func"  # function (meth, for method)

            prompts.append({
                "id": compute_id(file_path, f"{filename}.py", suffix),
                "original_code": original_code,
                "test_prompt": PYTEST_TEMPLATE.format(**locals())
            })

    return prompts


if __name__ == "__main__":
    for scenario in (["original"] + [f"scenario{i}" for i in range(1, 4)]):
        path = "../HumanEvalPython/" + scenario + "/"
        mapping = get_humaneval_mapping(path=path)
        prompts = get_humaneval_prompts(path=path, mappings=mapping, scenario=scenario)
        # original  sample = RQ1, otherwise, RQ2 folder
        output_folder = RQ1_PROMPT_OUTPUT_FILE if scenario == "original" else RQ2_PROMPT_OUTPUT_FILE
        # saves on the corresponding input folder
        print("saving", len(prompts), "prompts on", output_folder % ("HumanEvalPython", scenario))
        save(prompts, output_folder % ("HumanEvalPython", scenario));
