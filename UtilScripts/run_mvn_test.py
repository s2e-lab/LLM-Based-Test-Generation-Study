import subprocess
import os
import time


os.chdir("/Users/joanna/Documents/Portfolio/GitHub/S2E-Lab/ICSE23-results/CodeGen/HumanEvalJava-Results")

run_maven = True

while run_maven:
    # Run the "mvn test" command and capture the output
    process = subprocess.Popen(['mvn', 'test'], stdout=subprocess.PIPE)
    output, error = process.communicate(timeout=60)

    # Print the output of the command
    test_results = output.decode('utf-8')

    # Check if the command ran successfully
    if process.returncode == 0:
        print('Maven test succeeded')
        run_maven = False
    else:
        print('Maven test failed')
        # parse the compilation output
        test_results = test_results.replace("\n  ","")
        lines = test_results.split("\n")
        print("Output # lines ", len(lines))
        start, end = -1, -1
        for i in range(0, len(lines)):
            line = lines[i]
            if start == -1 and "COMPILATION ERROR" in line:
                start = i + 1
            if start >= 0 and (i > start + 1) and ("-" * 60) in line:
                end = i + 1
                break

        run_maven = True if start > 0 else False
        
        # collects files that failed compilation
        to_delete = []
        output = []
        for line in lines[start:end]:
            if line.startswith("[ERROR]"):
                parts = line.split()
                file = parts[1].split(":")[0]
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









