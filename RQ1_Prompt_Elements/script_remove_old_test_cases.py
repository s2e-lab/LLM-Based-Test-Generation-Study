import json
import os


print("Enter directory path from where you want to copy:")
directory_path =  "/Users/lsiddiqsunny/Documents/Notre Dame/Research/Deep-Context-Aware-CodeGeneration/RQ1_Prompt_Elements/Part3/"


#############-----Find File Counts-----#############
total_files = 0

for path in os.listdir(directory_path):
    # check if current path is a file
    if os.path.isfile(os.path.join(directory_path, path)):
        total_files += 1

print(total_files)
#############-----Copy Code From One File to Another-----#############
for i in range(164):
    try:
        file = open(directory_path + "id_" + str(i) + ".java", "r")
        lines = file.readlines()
        
        is_copy = False
        data = ""
        for line in lines:
            if "// Create 10 test cases for the above function" in line:
                is_copy = True
                data += "\n}"
            if not is_copy:
                data += line
        file.close()
        print(i)
        
        with open(directory_path + "id_" + str(i) + ".java", "w") as f:
            f.write(data)
    except:
        continue

