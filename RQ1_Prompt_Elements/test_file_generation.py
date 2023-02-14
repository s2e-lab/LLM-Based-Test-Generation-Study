import json

responses = json.load(open('filter_openai_Part3.json'))

libraries = "package Part3;\n\nimport org.junit.jupiter.api.Test;\n\nimport java.util.ArrayList;\nimport java.util.Arrays;\nimport java.util.List;\n\nimport static org.junit.jupiter.api.Assertions.assertEquals;\n"

for response in responses:
    print(response['choices'][0]["text"])
    with open('/Users/lsiddiqsunny/Documents/Notre Dame/Research/Deep-Context-Aware-CodeGeneration/RQ1_Prompt_Elements/ResearchData/src/main/java/Part3/id_'+str(response['id'])+'Test.java', 'w') as f:
        f.write(libraries+response['choices'][0]["text"])
        f.close()
        