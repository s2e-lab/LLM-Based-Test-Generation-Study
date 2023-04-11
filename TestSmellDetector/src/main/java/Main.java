import testsmell.AbstractSmell;
import testsmell.ResultsWriter;
import testsmell.TestFile;
import testsmell.TestSmellDetector;
import thresholds.DefaultThresholds;
import thresholds.Thresholds;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        if (args == null) {
//            System.out.println("Please provide the file containing the paths to the collection of test files");
//            return;
//        }
//        if (!args[0].isEmpty()) {
//            File inputFile = new File(args[0]);
//            if (!inputFile.exists() || inputFile.isDirectory()) {
//                System.out.println("Please provide a valid file containing the paths to the collection of test files");
//                return;
//            }
//        }

  //      String fileName = "/Users/joanna/Documents/Portfolio/GitHub/S2E-Lab/ICSE23-FAKE/CodeGen/HumanEvalJava-Results/csv-data/TestSmellInput-original-2000.csv";
       String fileName = "/Users/lsiddiqsunny/Documents/Notre_Dame/Research/ICSE23-results/CodeGen/SF110-Results/csv-data/TestSmellInput-SF110-CodeGen.csv";
        TestSmellDetector testSmellDetector = new TestSmellDetector(new DefaultThresholds());

        /*
//          Read the input file and build the TestFile objects
//         */
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String str;

        String[] lineItem;
        TestFile testFile;
        List<TestFile> testFiles = new ArrayList<>();
        while ((str = in.readLine()) != null) {
            // use comma as separator
            lineItem = str.split(",");

            //check if the test file has an associated production file
            if (lineItem.length == 2) {
                testFile = new TestFile(lineItem[0], lineItem[1], "");
            } else {
                testFile = new TestFile(lineItem[0], lineItem[1], lineItem[2]);
            }

            testFiles.add(testFile);
        }

        /*
          Initialize the output file - Create the output file and add the column names
         */
        ResultsWriter resultsWriter = ResultsWriter.createResultsWriter();
        List<String> columnNames;
        List<String> columnValues;

        columnNames = testSmellDetector.getTestSmellNames();
        columnNames.add(0, "App");
        columnNames.add(1, "TestClass");
        columnNames.add(2, "TestFilePath");
        columnNames.add(3, "ProductionFilePath");
        columnNames.add(4, "RelativeTestFilePath");
        columnNames.add(5, "RelativeProductionFilePath");
        columnNames.add(6, "NumberOfMethods");

        resultsWriter.writeColumnName(columnNames);

        /*
          Iterate through all test files to detect smells and then write the output
        */
        TestFile tempFile;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date;
        for (TestFile file : testFiles) {
            date = new Date();
            System.out.println(dateFormat.format(date) + " Processing: " + file.getTestFilePath());
            System.out.println("Processing: " + file.getTestFilePath());

            //detect smells
            tempFile = testSmellDetector.detectSmells(file);

            //write output
            columnValues = new ArrayList<>();
            columnValues.add(file.getApp());
            columnValues.add(file.getTestFileName());
            columnValues.add(file.getTestFilePath());
            columnValues.add(file.getProductionFilePath());
            columnValues.add(file.getRelativeTestFilePath());
            columnValues.add(file.getRelativeProductionFilePath());
            columnValues.add(String.valueOf(file.getNumberOfTestMethods()));
            for (AbstractSmell smell : tempFile.getTestSmells()) {
                try {
                    columnValues.add(String.valueOf(smell.getNumberOfSmellyTests()));
                } catch (NullPointerException e) {
                    columnValues.add("");
                }
            }
            resultsWriter.writeLine(columnValues);
        }

        System.out.println("end");
    }


}
