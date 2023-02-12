import json
import openai
import time

responses = json.load(open('filter_openai_Part3.json'))

for response in responses:
    print(response['choices'][0]["text"])
    with open('testPart3/id_'+str(response['id'])+'Test.java', 'w') as f:
        f.write(response['choices'][0]["text"])
        f.close()
        