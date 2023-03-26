#!/bin/bash
#$ -M msiddiq3@nd.edu   # Email address for job notification
#$ -m abe            # Send mail when job begins, ends and aborts
#$ -pe smp 1     # Specify parallel environment and legal core size
#$ -q long          # Specify queue
#$ -N  RQ2_SF110_gpt
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_84_ifx-framework_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_39_diffi_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_93_quickserver_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_29_apbsmem_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_12_dsachat_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_19_jmca_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_5_templateit_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_71_ext4j_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_63_objectexplorer_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_8_gfarcegestionfa_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_69_lhamacaw_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_23_jwbf_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_73_fim1_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_94_jclo_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_14_omjstate_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_96_heal_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_43_lilith_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_81_javathena_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_17_inspirento_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_4_rif_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_33_javaviewcontrol_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_11_imsmart_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_24_saxpath_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_86_at-robots2-j_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_74_fixsuite_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_100_jgaap_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_41_follow_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_57_hft-bomberman_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_32_httpanalyzer_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_22_byuic_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_67_gae-app-manager_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_103_sweethome3d_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_47_dvd-homevideo_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_59_mygrid_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_6_jnfe_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_52_lagoon_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_82_ipcalculator_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_68_biblestudy_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_91_classviewer_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_49_diebierse_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_2_a4j_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_79_twfbplayer_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_56_jhandballmoves_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_64_jtailgui_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_31_xisemele_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_10_water-simulator_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_60_sugar_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_40_glengineer_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_75_openhre_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_25_jni-inchi_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_42_asphodel_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_7_sfmis_prompt.json"
python generate_tests_codegen.py -t 2000 -d SF110 -q RQ2 -p "RQ2_Prompt_Elements/CodeGen_Data/SF110_input/scenario4_34_sbmlreader2_prompt.json"