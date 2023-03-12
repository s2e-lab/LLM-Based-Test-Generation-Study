#!/bin/bash

#$ -M msiddiq3@nd.edu   # Email address for job notification
#$ -m abe            # Send mail when job begins, ends and aborts
#$ -pe smp 1     # Specify parallel environment and legal core size
#$ -q long           # Specify queue
#$ -N  scenario3_1000
python generate_tests_openai.py -t 1000 -s HumanEvalJava_scenario3
