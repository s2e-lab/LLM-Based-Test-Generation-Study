package s2e.lab;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.Jsoner;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import org.apache.commons.text.StringSubstitutor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Utilities for the test prompt creation.
 *
 * @author Joanna C. S. Santos
 */
public class PromptUtils {
    /**
     * The template for the unit test prompt (template is in the resources' folder).
     */
    public static String UNIT_TEST_TEMPLATE;

    /**
     * Used for generating Unit Tests for the HumanEval dataset (RQ1).
     */
    public static String HUMAN_EVAL_TEST_TEMPLATE;

    static {
        try {
            URL templateUrl = TestPromptCreator.class.getClassLoader().getResource("UnitTestTemplate.java");
            UNIT_TEST_TEMPLATE = Files.readString(Paths.get(templateUrl.getPath()));
            URL humanEvalUrl = TestPromptCreator.class.getClassLoader().getResource("HumanEvalTestTemplate.java");
            HUMAN_EVAL_TEST_TEMPLATE = Files.readString(Paths.get(humanEvalUrl.getPath()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Saves the prompts to a JSON file.
     *
     * @param outputList the list of prompts (containing ID, original code, and test prompt)
     * @param outputFile where to save the prompts (path)
     * @throws IOException in case of an IO error
     */
    public static void save(List<HashMap<String, String>> outputList, String outputFile) throws IOException {
        JsonArray objects = new JsonArray(outputList);
        String jsonStr = Jsoner.prettyPrint(Jsoner.serialize(objects));
        try (FileWriter file = new FileWriter(outputFile)) {
            file.write(jsonStr);
        }
        System.out.println("Successfully Copied JSON Object to " + outputFile);
    }

    /**
     * This method is used to fill in the template with the actual values.
     *
     * @param javaFile        the java file under analysis
     * @param cu              compilation unit
     * @param numberTests     the number of tests to generate
     * @param className       the name of the class under test
     * @param methodSignature the signature of the method under test
     * @param suffix          to distinguish between different test classes
     */
    public static HashMap<String, String> computeUnitTestPrompt(File javaFile, String numberTests, CompilationUnit cu, String className, String methodSignature, String suffix, boolean isHumanEval) {
        String packageDeclaration = Optional.of(cu.getPackageDeclaration())
                .map(p -> p.get().toString().strip())
                .orElse("");


        // fill in the template
        Map<String, Object> params = new HashMap<>();
        params.put("className", className);
        params.put("packageDeclaration", packageDeclaration);
        params.put("importedPackages", getImportedPackages(cu));
        params.put("numberTests", numberTests);
        params.put("methodSignature", methodSignature);
        params.put("suffix", suffix);

        // creates dict object to be serialized
        HashMap<String, String> outputMap = new HashMap<>();
        if(isHumanEval){
            outputMap.put("id", javaFile.getName().split("_")[1].split("\\.")[0]);
        }
        else{
            outputMap.put("id", javaFile.getPath().split("\\.\\./")[1]);
        }
        outputMap.put("original_code", String.format("// %s.java\n%s", className, cu));
        outputMap.put("test_prompt", StringSubstitutor.replace(UNIT_TEST_TEMPLATE, params));

        return outputMap;
    }

    /**
     * Given a compilation unit, it returns the import statements (ie: `package ... ;`, separated by newline).
     *
     * @param cu compilation unit
     * @return the import statements
     */
    public static String getImportedPackages(CompilationUnit cu) {
        return cu.getImports().stream()
                .map(i -> i.toString().strip())
                .collect(Collectors.joining("\n"));
    }

    /**
     * Get the primary class of the compilation unit.
     * Algorithm:
     * - the class that matches the filename (ex: StringBuilder in a file named StringBuilder.java)
     * - the first declared class in the file
     *
     * @param cu Compilation unit
     * @return the primary class of the compilation unit
     */
    public static ClassOrInterfaceDeclaration getPrimaryClass(CompilationUnit cu) {
        Optional<TypeDeclaration<?>> primaryType = cu.getPrimaryType();
        if (primaryType.isPresent()) {
            TypeDeclaration<?> typeDeclaration = primaryType.get();
            return cu.getClassByName(typeDeclaration.getNameAsString()).get();
        }
        return cu.getTypes().stream()
                .filter(BodyDeclaration::isClassOrInterfaceDeclaration)
                .map(BodyDeclaration::asClassOrInterfaceDeclaration)
                .findFirst()
                .get();
    }

    /**
     * Returns the signatures of the testable methods (public, non-void, non-abstract).
     *
     * @param classDeclaration where to look for the methods.
     * @return testable methods signatures
     */
    public static List<String> getTestableMethodSignatures(ClassOrInterfaceDeclaration classDeclaration) {
        return classDeclaration.getMethods().stream()
                .filter(PromptUtils::isTestable)
                .map(m -> m.getSignature().toString())
                .collect(Collectors.toList());
    }

    /**
     * Method to check if a method is testable:
     * - public
     * - non-abstract
     * - non-void
     * - non-getter/setter
     * - non-toString
     *
     * @param m a method declaration
     * @return true if testable, false otherwise.
     */
    private static boolean isTestable(MethodDeclaration m) {
        if (!m.isPublic())
            return false;
        if (m.isAbstract())
            return false;
        if (m.getType().asString().equalsIgnoreCase("void"))
            return false;
        if (!m.isStatic() && (m.getNameAsString().startsWith("get") || m.getNameAsString().startsWith("set")))
            return false;
        if (m.getNameAsString().equals("toString"))
            return false;
        return true;
    }
}
