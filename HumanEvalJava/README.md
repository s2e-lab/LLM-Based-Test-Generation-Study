# Overview

This directory contains the source code from HumanEval that are modified to represent 3 scenarios:

- **Scenario 1**: The samples only contain the import statements, function’s signature and implementation.
- **Scenario 2**: The samples include the function’s signature, implementation and a docstring with the function’s
  description but excluding the input-output examples.
- **Scenario 3**: The samples include the function’s signature, implementation and a docstring with the function’s
  description, and input-output examples, but we exclude its implementation.
- **Original**: We use the sample without excluding anything.

The folder `/tests/` contains JUnit tests we semi-automatically created for these samples.

The file `HumanEval_java_v1.jsonl` is the original JSONL file from the extended HumanEval dataset.

This maven project uses JaCoCo to measure test coverage.


## How to run the tests and measure the coverage
From command line:
1. `mvn clean`
2. `mvn compile`
3. `mvn test`
4. Put `jacococli.jar` in the {root}/lib directory of the project.
5. `java -jar lib/jacococli.jar report target/jacoco.exec --classfiles "target/classes" --html ./report --csv report/report.csv`
