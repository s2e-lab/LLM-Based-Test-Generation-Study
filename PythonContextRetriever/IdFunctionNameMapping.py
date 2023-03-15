import ast
import os


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
        #   and check level so we can ignore relative imports
        if isinstance(node, ast.ImportFrom) and node.level is None:
            modules.append(node.module)

    return modules


def parse_ast(filename):
    with open(filename, "rt") as file:
        return ast.parse(file.read(), filename=filename)


def get_mapping(path):
    mapping = {}
    dir_list = os.listdir(path)
    for file in dir_list:
        if file.endswith(".py"):
            print(file)
            filename = path + file
            tree = parse_ast(filename)
            functionNames = []
            for func in top_level_functions(tree.body):
                functionNames.append(func.name)
            mapping[file.split(".")[0]] = functionNames[-1]
    return mapping


def make_prompt(file, filename, function_name, scenario):
    prompt = "# " + filename + "\n" + file.read() + "\n"
    prompt += "# " + filename.split(".")[0] + "Test.py\n\n"
    prompt += (
        "from "
        + scenario
        + "."
        + filename.split(".")[0]
        + " import "
        + function_name
        + "\n"
    )
    prompt += "import pytest\n\n"
    prompt += (
        "\"\"\"\nTest class of "
        + filename.split(".")[0]
        + "\n"
        + "It contains ten unit test cases for the :func:`~"
        + scenario
        + "."
        + filename.split(".")[0]
        + "."
        + function_name
        + "` method.\n\"\"\"\n"
        + "class "+filename.split(".")[0]+"Test:\n"
    )
    return prompt


def get_prompts(path, mapping, scenario):
    prompts = []
    for key, value in mapping.items():
        with open(path + key + ".py", "r") as file:
            filename = value.capitalize()
            prompt = make_prompt(
                file=file, filename=filename+".py", function_name=value, scenario=scenario
            )
            prompts.append(prompt)

    return prompts


if __name__ == "__main__":
    scenario = "original"
    path = "../HumanEvalPython/" + scenario + "/"
    mapping = get_mapping(path=path)
    prompts = get_prompts(path=path, mapping=mapping, scenario=scenario)
    for prompt in prompts:
        print(prompt)
