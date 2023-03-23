import os
def createJob(scenario_path):
    with open("../scripts/codegen_sf110_rq2_job.sh", "w") as f:
        f.write("#!/bin/bash"+"\n")

        f.write("#$ -M msiddiq3@nd.edu   # Email address for job notification"+"\n")
        f.write("#$ -m abe            # Send mail when job begins, ends and aborts"+"\n")
        f.write("#$ -pe smp 1     # Specify parallel environment and legal core size"+"\n")
        f.write("#$ -q gpu@@jung_gpu           # Specify queue"+"\n")
        f.write("#$ -l gpu=1         # Specify queue"+"\n")
        f.write("#$ -N  RQ2_SF110_codegen_1"+"\n")
    
    for token in [2000]:
        for project in os.listdir(scenario_path):
            if project.endswith(".csv"):
                continue

            if "scenario1" in project:
                with open("../scripts/codegen_sf110_rq2_job.sh", "a") as f:
                    f.write(f"python generate_tests_codegen.py -t {token} -d SF110 -q RQ2 -p \"RQ2_Prompt_Elements/CodeGen_Data/SF110_input/{project}\"\n")


createJob("../RQ2_Prompt_Elements/CodeGen_Data/%s_input"%("SF110"))
