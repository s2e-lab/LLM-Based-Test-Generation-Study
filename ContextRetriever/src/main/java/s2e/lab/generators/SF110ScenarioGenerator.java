package s2e.lab.generators;

import com.github.javaparser.ParseProblemException;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import s2e.lab.PromptUtils;
import s2e.lab.searcher.JavaSearcher;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static s2e.lab.generators.JavaTestPromptGenerator.*;

public class SF110ScenarioGenerator {

    /**
     * Generates the scenario 1:
     */
    public static ClassOrInterfaceDeclaration generateScenario1(ClassOrInterfaceDeclaration classDeclaration, MethodDeclaration methodUnderTest) {

        // create a copy
        ClassOrInterfaceDeclaration scenarioClass = classDeclaration.clone();

        // remove all methods, but keep the one under test
        classDeclaration.getMethods().stream().filter(m -> !m.equals(methodUnderTest)).forEach(m -> scenarioClass.remove(m));

        // remove all of its constructors
        classDeclaration.getConstructors().stream().forEach(c -> scenarioClass.remove(c));

        // remove all of its members (fields)
        classDeclaration.getMembers().stream().forEach(m -> scenarioClass.remove(m));

        // remove the method's javadoc
        scenarioClass.getMethods().get(0).removeJavaDocComment();

        return scenarioClass;

    }

    public static void save(ClassOrInterfaceDeclaration scenarioClass, File project, File javaFile, int scenarioNo) throws IOException {
        // path to the scenario folder
        String scenarioFolderPath = String.format(SF100_EVOSUITE_SCENARIO, scenarioNo, project.getName());
        // the line below keeps the original folder structure to take into account the package location
        String sourceFileLocation = javaFile.getAbsolutePath().replace(project.getAbsolutePath(), "");
        // the scenario file generated
        File scenarioFile = new File(scenarioFolderPath + sourceFileLocation);
        // creates parent(s) directory if needed
        scenarioFile.getParentFile().mkdirs();
        // saves to the Java file
        try (FileWriter fileWriter = new FileWriter(scenarioFile)) {
            fileWriter.write(scenarioClass.toString());
        }

        System.out.println("Saved at " + scenarioFile);
    }

    public static void main(String[] args) throws IOException {


        List<File> projectList = JavaSearcher.getProjectList(SF100_EVOSUITE);
        for (File project : projectList) {
            System.out.println("Analyzing project " + project.getName());
            List<File> javaFiles = JavaSearcher.findJavaFiles(project);
            List<HashMap<String, String>> outputList = new ArrayList<>();

            for (File javaFile : javaFiles) {
                // is it a test class?
                if (javaFile.getPath().toLowerCase().contains("/test/")) continue;

                try {
                    // get the class declaration
                    CompilationUnit cu = StaticJavaParser.parse(javaFile);
                    ClassOrInterfaceDeclaration classDecl = PromptUtils.getPrimaryClass(cu);
                    if (classDecl == null) continue;

                    // collect the testable method's names (only if the class is also testable, AND the method has a "good" JavaDoc)
                    List<MethodDeclaration> testableMethods = PromptUtils.getTestableMethods(classDecl, true)
                            .stream()
                            .filter(m -> PromptUtils.hasGoodJavadoc(m)).collect(Collectors.toList());
                    // only includes projects that have # units under tests between MIN and MAX (inclusive)
                    if (testableMethods.size() < MIN_NUM_TESTABLE_METHODS || testableMethods.size() > MAX_NUM_TESTABLE_METHODS)
                        continue;


                    for (MethodDeclaration m : testableMethods) {
                        save(generateScenario1(classDecl, m), project, javaFile, 1);
                    }
                } catch (ParseProblemException e) {
                    System.err.println("Parsing error for file " + javaFile);
                }
            }
        }
    }


}
