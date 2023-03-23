#!/bin/bash

#$ -M msiddiq3@nd.edu   # Email address for job notification
#$ -m abe            # Send mail when job begins, ends and aborts
#$ -q gpu@@jung_gpu           # Specify queue
#$ -l gpu=1
#$ -pe smp 1    # Specify parallel environment and legal core size
#$ -N HumanEval_CodeGen       # Specify job name
python generate_tests_codegen.py -t 2000 -d HumanEvalJava -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/HumanEvalJava_input/scenario1_prompt.json"