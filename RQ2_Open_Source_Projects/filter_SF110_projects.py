import os
import json

# folder path
dir_path = r'./OpenAI_Data/SF110_input'


# list to store files
files = []

# Iterate directory
for path in os.listdir(dir_path):
    # check if current path is a file
    if os.path.isfile(os.path.join(dir_path, path)) and path.endswith(".json"):
        files.append(path)



MIN_NUM_OF_METHODS = 10
MAX_NUM_OF_METHODS = 50

filtered_files = []
for file in files:
    with open(os.path.join(dir_path, file), 'r') as f:
        data = json.load(f)
        if len(data)>=MIN_NUM_OF_METHODS and len(data)<=MAX_NUM_OF_METHODS:
            filtered_files.append((len(data),file))

filtered_files.sort(key=lambda x: x[0])

with open('SF110_projects.txt', 'w') as file:
    for f in filtered_files:
        file.write(f[1] + ' ' + str(f[0]) + '\n')
