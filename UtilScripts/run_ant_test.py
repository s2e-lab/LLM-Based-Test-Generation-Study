import subprocess
import os
import time

projects = []

for project in os.listdir("../RQ2_Prompt_Elements/OpenAI_Data/%s_input" % ("SF110")):
    if project.endswith(".csv"):
        continue
    if "scenario1" in project:
        projects.append("_".join(project.split("_")[1:3]))


source_folder = "/Users/lsiddiqsunny/Documents/Notre_Dame/Research/ICSE23-results/Experiment_Folder/SF110-Results"
subfolders = [f.path for f in os.scandir(source_folder) if f.is_dir()]
for subfolder in subfolders:
    projectName = subfolder.split("/")[-1]
    if projectName not in projects:
        continue
    print(subfolder)
    os.chdir(subfolder)

    run_ant = True

    while run_ant:
        # Run the "mvn test" command and capture the output
        process = subprocess.Popen(['ant'], stdout=subprocess.PIPE)
        output, error = process.communicate(timeout=60)

        # Print the output of the command
        test_results = output.decode('utf-8')

        # Check if the command ran successfully
        if process.returncode == 0:
            print('ant test succeeded')
            run_ant = False
        else:
            print('ant test failed')
            # parse the compilation output
            # test_results = test_results.replace("\n  ","")

            if "Compile failed;" in test_results:
                run_ant = False
                continue

            lines = test_results.split("\n")
            print("Output # lines ", len(lines))
            start, end = -1, -1
            for i in range(0, len(lines)):
                line = lines[i]
                if start == -1 and "error:" in line:
                    start = i + 1
                if start >= 0 and (i > start + 1) and ("-" * 60) in line:
                    end = i + 1
                    break

            run_ant = True if start > 0 else False

            # collects files that failed compilation
            to_delete = []
            output = []
            for line in lines[start:end]:
                if "error:" in line:
                    parts = line.split()
                    file = parts[1].split(":")[0]
                    if "_Test.java" not in file:
                        continue
                    location = parts[1].split(":")[1][1:-1]
                    error = " ".join(parts[2:])
                    to_delete.append(file)
                    output.append("\t".join([file, location, error]))

            # save the compilation status
            with open(f"output{time.time()}.csv","w") as f:
                f.write("\n".join(output))

            # delete the problematic test files
            for f in to_delete:
                if os.path.exists(f):
                    print("Removing ", f)
                    os.remove(f)
