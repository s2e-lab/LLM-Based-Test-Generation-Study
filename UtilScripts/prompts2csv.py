import csv
import json
import re



def main(scenario_path):
    prompts = []
    with open(scenario_path, 'r') as scenario_file:
        prompts =  json.load(scenario_file)


    regex = r"It contains ten unit test cases for the {@link ([a-zA-Z0-9_]+)#(.+)}"

    for p in prompts:
        test_prompt = p["test_prompt"]
        matches = re.search(regex, test_prompt, re.MULTILINE)
        p["classname"] = matches.group(1)
        p["method_signature"] = matches.group(2)
        # print(p)


    # with open(scenario_path.replace(".json","extra.json"), 'w') as scenario_file:
    #     scenario_file.write(json.dumps(prompts, indent=4))

    with open(scenario_path.replace(".json",".csv"), "w") as csv_out:
        csv_file = csv.writer(csv_out, delimiter=',', quotechar='"', quoting=csv.QUOTE_MINIMAL)
        csv_file.writerow(["id", "method_signature", "classname"])
        for p in prompts:
            print(p)
            csv_file.writerow([p["id"],p["method_signature"], p["classname"]])


if __name__ == "__main__":

    # RQ1 folder
    rq1_folder = "../RQ1_Test_Generation/OpenAI_Data/%s_input/%s_prompt.json"
    main(rq1_folder % ("HumanEvalJava", "original"))
    for p in ["100_jgaap", "10_water-simulator", "11_imsmart", "12_dsachat", "13_jdbacl", "14_omjstate", "15_beanbin", "17_inspirento", "19_jmca", "22_byuic", "23_jwbf", "24_saxpath", "25_jni-inchi", "27_gangup", "29_apbsmem", "2_a4j", "30_bpmail", "31_xisemele", "32_httpanalyzer", "33_javaviewcontrol", "34_sbmlreader2", "36_schemaspy", "39_diffi", "40_glengineer", "41_follow", "42_asphodel", "43_lilith", "47_dvd-homevideo", "49_diebierse", "4_rif", "51_jiprof", "52_lagoon", "54_db-everywhere", "55_lavalamp", "56_jhandballmoves", "57_hft-bomberman", "59_mygrid", "5_templateit", "60_sugar", "63_objectexplorer", "64_jtailgui", "65_gsftp", "67_gae-app-manager", "68_biblestudy", "69_lhamacaw", "6_jnfe", "71_ext4j", "73_fim1", "74_fixsuite", "75_openhre", "76_dash-framework", "7_sfmis", "81_javathena", "82_ipcalculator", "84_ifx-framework", "86_at-robots2-j", "88_jopenchart", "8_gfarcegestionfa", "91_classviewer", "93_quickserver", "94_jclo"]:
        main(rq1_folder % ("SF110", p))

    # RQ2 folder
    rq2_folder = "../RQ2_Prompt_Elements/OpenAI_Data/%s_input/%s_prompt.json"
    for i in range(1,4):
        main(rq2_folder % ("HumanEvalJava", f"scenario{i}"))

