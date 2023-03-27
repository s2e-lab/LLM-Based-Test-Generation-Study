import os
import re

# Define the regular expression pattern to match the class name
class_name_pattern = re.compile(r"\nclass\s+(\w+)")


directory = "../../ICSE23-results/GPT3.5/HumanEvalJava-Results/src/test/java/original"#"../../ICSE23-results/OpenAI/HumanEvalJava-Results/src/test/java/scenario3"
to_rename = []
# Iterate over all the files in the current directory
for filename in os.listdir(directory):
    # Check if the file is a Java file
    if filename.endswith(".java"):
        # Open the file and read its contents
        with open(os.path.join(directory,filename), "r") as f:
            contents = f.read()

        # Search for the class name using the regular expression
        match = class_name_pattern.search(contents)
        
        if match:
            class_name = match.group(1)
            expected = filename.split(".")[0]
            
            if class_name != expected:
                contents = contents.replace(f"class {class_name} ", f"class {expected} ")
                print(class_name, expected)
                with open(os.path.join(directory, filename), "w") as f:
                    f.write(contents)
            
