package s2e.lab;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.Jsoner;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.text.StringSubstitutor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.String.format;
import static s2e.lab.TestPromptCreator.BASE_DIR;

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
            URL templateUrl = TestPromptCreator.class.getClassLoader().getResource("JUnitTestTemplate.java");
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
        System.out.println("Successfully saved JSON to " + outputFile);
    }

    /**
     * ID is equals to the relative path to the file under analysis appended with a suffix (if not empty).
     * Ex: suffix = 001 and javaFile = /path/to/HumanEvalJava/src/main/scenario1/id_1.java
     * ID = /HumanEvalJava/src/main/scenario1/id_1_001.java
     *
     * @param javaFile java file under analysis
     * @param suffix   suffix to be appended to the ID
     * @return a unique identifier for the prompt being generated
     */
    private static String computeID(File javaFile, String suffix) {
        String filename = javaFile.getName();
        // if a suffix is provided, then append
        if (suffix != null && !suffix.isEmpty())
            filename = format("%s_%sTest.java", FilenameUtils.removeExtension(filename), suffix);

        // get relative path
        String parentPath = javaFile.getParentFile().getAbsolutePath().replace(new File(BASE_DIR).getAbsolutePath(), "");

        // concatenate with the computed filename
        return FilenameUtils.concat(parentPath, filename);
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
    public static HashMap<String, String> computeUnitTestPrompt(File javaFile, String numberTests, CompilationUnit cu, String className, String methodSignature, String suffix) {
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
        params.put("suffix", suffix.isEmpty() ? suffix : "_" + suffix);

        // creates dict object to be serialized
        HashMap<String, String> outputMap = new HashMap<>();
        outputMap.put("id", computeID(javaFile, suffix));
        outputMap.put("original_code", format("// %s.java\n%s", className, cu));
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
            // checks whether it is a class/interface being declared (and not something else, like an enumeration)
            if (typeDeclaration instanceof ClassOrInterfaceDeclaration)
                return ((ClassOrInterfaceDeclaration) typeDeclaration);
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
        // class is not testable, so don't even bother retrieving its declared methods
        if (!isTestable(classDeclaration))
            return Collections.emptyList();
        // finds all methods that are testable in the class under test
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

    /**
     * Method to check if a class is testable:
     * - non-abstract
     * - non-interface
     *
     * @param c a class/interface declaration
     * @return true if testable, false otherwise.
     */
    private static boolean isTestable(ClassOrInterfaceDeclaration c) {
        return !c.isInterface() && !c.isAbstract() && !c.getNameAsString().endsWith("Test");
    }
}
