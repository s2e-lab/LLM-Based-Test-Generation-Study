package s2e.lab;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.Jsoner;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import org.apache.commons.text.StringSubstitutor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PromptUtils {
    /**
     * The template for the unit test prompt (template is in the resources folder).
     */
    public static String UNIT_TEST_TEMPLATE;

    static {
        try {
            URL templateUrl = TestPromptCreator.class.getClassLoader().getResource("UnitTestTemplate.java");
            UNIT_TEST_TEMPLATE = new String(Files.readAllBytes(Paths.get(templateUrl.getPath())), StandardCharsets.UTF_8);
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
        try (FileWritser file = new FileWriter(outputFile)) {
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
     * @return
     */
    public static HashMap<String, String> computeUnitTestPrompt(File javaFile, String numberTests, CompilationUnit cu, String className, String methodSignature, String suffix) {
        String packageDeclaration = Optional.of(cu.getPackageDeclaration())
                .map(p -> p.get().toString().strip())
                .orElse("");

        String importedPackages = cu.getImports().stream()
                .map(i -> i.toString().strip())
                .collect(Collectors.joining("\n"));
        // fill in the template
        Map<String, Object> params = new HashMap<>();
        params.put("className", className);
        params.put("packageDeclaration", packageDeclaration);
        params.put("importedPackages", importedPackages);
        params.put("numberTests", numberTests);
        params.put("methodSignature", methodSignature);
        params.put("suffix", suffix);

        // creates dict object to be serialized
        HashMap<String, String> outputMap = new HashMap<>();
        outputMap.put("id", javaFile.getName().split("_")[1].split("\\.")[0]);
        outputMap.put("original_code", String.format("// %s.java\n%s", className, cu));
        outputMap.put("test_prompt", StringSubstitutor.replace(UNIT_TEST_TEMPLATE, params));

        return outputMap;
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
                .filter(t -> t.isClassOrInterfaceDeclaration())
                .map(t -> t.asClassOrInterfaceDeclaration())
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
                .filter(m -> m.isPublic() && !m.isAbstract())
                .map(m -> m.getSignature().toString())
                .collect(Collectors.toList());
    }
}
