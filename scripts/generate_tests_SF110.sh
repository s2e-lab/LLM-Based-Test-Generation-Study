#!/bin/bash
#$ -M msiddiq3@nd.edu   # Email address for job notification
#$ -m abe            # Send mail when job begins, ends and aborts
#$ -pe smp 1     # Specify parallel environment and legal core size
#$ -q long           # Specify queue
#$ -N  RQ1_SF110_2K_4K
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/5_templateit_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/71_ext4j_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/103_sweethome3d_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/14_omjstate_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/69_lhamacaw_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/82_ipcalculator_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/12_dsachat_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/86_at-robots2-j_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/2_a4j_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/17_inspirento_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/7_sfmis_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/32_httpanalyzer_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/29_apbsmem_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/10_water-simulator_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/56_jhandballmoves_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/81_javathena_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/39_diffi_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/57_hft-bomberman_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/91_classviewer_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/43_lilith_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/34_sbmlreader2_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/33_javaviewcontrol_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/47_dvd-homevideo_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/67_gae-app-manager_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/41_follow_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/23_jwbf_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/79_twfbplayer_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/73_fim1_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/94_jclo_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/31_xisemele_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/64_jtailgui_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/93_quickserver_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/68_biblestudy_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/100_jgaap_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/4_rif_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/60_sugar_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/52_lagoon_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/6_jnfe_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/24_saxpath_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/96_heal_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/59_mygrid_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/40_glengineer_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/42_asphodel_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/11_imsmart_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/74_fixsuite_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/75_openhre_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/8_gfarcegestionfa_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/63_objectexplorer_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/22_byuic_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/25_jni-inchi_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/84_ifx-framework_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/19_jmca_prompt.json"
python generate_tests_openai.py -t 2000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/49_diebierse_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/5_templateit_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/71_ext4j_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/103_sweethome3d_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/14_omjstate_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/69_lhamacaw_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/82_ipcalculator_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/12_dsachat_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/86_at-robots2-j_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/2_a4j_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/17_inspirento_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/7_sfmis_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/32_httpanalyzer_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/29_apbsmem_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/10_water-simulator_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/56_jhandballmoves_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/81_javathena_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/39_diffi_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/57_hft-bomberman_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/91_classviewer_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/43_lilith_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/34_sbmlreader2_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/33_javaviewcontrol_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/47_dvd-homevideo_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/67_gae-app-manager_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/41_follow_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/23_jwbf_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/79_twfbplayer_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/73_fim1_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/94_jclo_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/31_xisemele_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/64_jtailgui_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/93_quickserver_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/68_biblestudy_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/100_jgaap_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/4_rif_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/60_sugar_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/52_lagoon_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/6_jnfe_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/24_saxpath_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/96_heal_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/59_mygrid_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/40_glengineer_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/42_asphodel_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/11_imsmart_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/74_fixsuite_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/75_openhre_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/8_gfarcegestionfa_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/63_objectexplorer_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/22_byuic_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/25_jni-inchi_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/84_ifx-framework_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/19_jmca_prompt.json"
python generate_tests_openai.py -t 4000 -d SF110 -q RQ1 -p "RQ1_Test_Generation/OpenAI_Data/SF110_input/49_diebierse_prompt.json"
