import json
import openai
import time

# responses = json.load(open('openai_Part3.json'))
# filter_responses = []


# config = json.load(open("config.json"))

# current_directory = "/Part3/"

# openai.api_key = config["OPEN_AI_KEY"]
# directory_path = config["BASE_DIRECTORY"] + current_directory

# for response in responses:
#     if (response["choices"][0]["finish_reason"] == "length"):
#         print(response["id"])
#         with open(directory_path + "id_" + str(response["id"]) + ".java", "r") as file:

#             context = file.read()

#             prompt = (
#                 context
#                 + "\n/* Write a JUNIT test class with ten test cases for the previous class. */\n"
#             )
#             start_time = time.time()
#             response = openai.Completion.create(
#                 model="code-davinci-002",
#                 prompt=prompt,
#                 temperature=0,
#                 max_tokens=4000,
#                 top_p=1,
#                 frequency_penalty=0,
#                 presence_penalty=0,
#             )
#             time_taken = time.time() - start_time
#             response["time_taken"] = time_taken
#             response["id"] = response["id"]
#             filter_responses.append(response)
#             print(time_taken)
#             time.sleep(60)

#     else:
#         filter_responses.append(response)

# output = open("filter_output_Part3.json", "w")
# output.write(json.dumps(filter_responses))



config = json.load(open("config.json"))

current_directory = "/Part3/"

openai.api_key = config["OPEN_AI_KEY"]
directory_path = config["BASE_DIRECTORY"] + current_directory

id = 152
with open(directory_path + "id_"+str(id)+".java", "r") as file:

            context = file.read()

            prompt = (
                context
                + "\n/* Write a JUNIT test class with ten test cases for the previous class. */\n"
            )
            start_time = time.time()
            response = openai.Completion.create(
                model="code-davinci-002",
                prompt=prompt,
                temperature=0,
                max_tokens=4000,
                top_p=1,
                frequency_penalty=0,
                presence_penalty=0,
            )
            time_taken = time.time() - start_time
            response["time_taken"] = time_taken
            response["id"] = id
            print(response)
