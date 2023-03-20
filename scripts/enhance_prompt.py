import argparse
import csv
import json
import os
import time
import uuid
import re
prompts = []
scenario_path = "../RQ1_Test_Generation/OpenAI_Data/HumanEvalJava_input/original_prompt.json"
with open(scenario_path, 'r') as scenario_file:
    prompts =  json.load(scenario_file)


regex = r"It contains ten unit test cases for the {@link ([a-zA-Z0-9_]+)#(.+)}"

for p in prompts:
    test_prompt = p["test_prompt"]
    matches = re.search(regex, test_prompt, re.MULTILINE)
    p["classname"] = matches.group(1)
    p["method_signature"] = matches.group(2)
    # print(p)


with open(scenario_path.replace(".json","extra.json"), 'w') as scenario_file:
    scenario_file.write(json.dumps(prompts, indent=4))


with open(scenario_path.replace(".json","2.csv"), "w") as csv_out:
    csv_file = csv.writer(csv_out, delimiter=',', quotechar='"', quoting=csv.QUOTE_MINIMAL)
    csv_file.writerow(["id", "method_signature", "classname"])
    for p in prompts:
        csv_file.writerow([p["id"],p["method_signature"], p["classname"]])