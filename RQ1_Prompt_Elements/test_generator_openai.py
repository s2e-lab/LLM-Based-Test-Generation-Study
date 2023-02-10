import openai
import json
import time

config = json.load(open("config.json"))

current_directory = "/Part3/"

openai.api_key = config["OPEN_AI_KEY"]
directory_path = config["BASE_DIRECTORY"] + current_directory

responses = []
for i in range(164):
    print(i)
    if i in [32,38,50,160]:
        continue
    with open(directory_path + "id_" + str(i) + ".java", "r") as file:

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
            max_tokens=1024,
            top_p=1,
            frequency_penalty=0,
            presence_penalty=0,
        )
        time_taken = time.time() - start_time
        response["time_taken"] = time_taken
        response["id"] = i
        responses.append(response)
        print(time_taken)
        time.sleep(30)
        if (i+1)%10==0:
          output = open("output_" + current_directory.replace("/", "") +"_"+str(i)+ ".json", "w")
          output.write(json.dumps(responses))
          responses = []
          time.sleep(30)

output = open("output_" + current_directory.replace("/", "") +"_"+str(i)+ ".json", "w")
output.write(json.dumps(responses))

"""
{
  "choices": [
    {
      "finish_reason": "stop",
      "index": 0,
      "logprobs": null,
      "text": "\nclass HasCloseElementsTest {\n    @Test\n    void hasCloseElements() {\n        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));\n        assertEquals(false, HasCloseElements.hasCloseElements(numbers, 0.5));\n    }\n\n    @Test\n    void hasCloseElements2() {\n        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.8, 3.0, 4.0, 5.0, 2.0));\n        assertEquals(true, HasCloseElements.hasCloseElements(numbers, 0.3));\n    }\n\n    @Test\n    void hasCloseElements3() {\n        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2));\n        assertEquals(true, HasCloseElements.hasCloseElements(numbers, 0.3));\n    }\n\n    @Test\n    void hasCloseElements4() {\n        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2));\n        assertEquals(false, HasCloseElements.hasCloseElements(numbers, 0.05));\n    }\n\n    @Test\n    void hasCloseElements5() {\n        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0));\n        assertEquals(true, HasCloseElements.hasCloseElements(numbers, 0.95));\n    }\n\n    @Test\n    void hasCloseElements6() {\n        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0));\n        assertEquals(false, HasCloseElements.hasCloseElements(numbers, 0.8));\n    }\n\n    @Test\n    void hasCloseElements7() {\n        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0));\n        assertEquals(true, HasCloseElements.hasCloseElements(numbers, 0.1));\n    }\n\n    @Test\n    void hasCloseElements8() {\n        List<Double> numbers = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1));\n        assertEquals(true, HasCloseElements.hasCloseElements(numbers, 1.0));\n    }\n\n    @Test\n    void hasCloseElements9() {\n        List<Double> numbers = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1));\n        assertEquals(false, HasCloseElements.hasCloseElements(numbers, 0.5));\n    }\n\n    @Test\n    void hasCloseElements10() {\n        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0));\n        assertEquals(true, HasCloseElements.hasCloseElements(numbers, 0.1));\n    }\n}"
    }
  ],
  "created": 1675995324,
  "id": "cmpl-6iDEadFtcUy4MuWThS41U1LCupsXG",
  "model": "code-davinci-002",
  "object": "text_completion",
  "usage": {
    "completion_tokens": 831,
    "prompt_tokens": 583,
    "total_tokens": 1414
  }
}
"""
