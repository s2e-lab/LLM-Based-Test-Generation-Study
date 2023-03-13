package s2e.lab.searcher;

import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * It  finds all Java files in a directory and its subdirectories.
 */
public class JavaSearcher {

    /**
     * A list of all java files recursively found in a specific folder
     *
     * @param directory folder to search for Java files.
     * @return a list of Java source files.
     * @throws IOException
     */
    public static List<File> findJavaFiles(File directory) throws IOException {
        return Files.walk(Paths.get(directory.getAbsolutePath()))
                .filter(p -> Files.isRegularFile(p) && p.toString().endsWith(".java"))
                .map(Path::toFile)
                .collect(Collectors.toList());
    }

    /**
     * Collects all folders in a specific directory.
     *
     * @param directory directory to be searched
     * @return a list of folders
     */
    public static List<File> getProjectList(String directory) {
        File projectDirectory = new File(directory);
        return Arrays.stream(Objects.requireNonNull(projectDirectory.listFiles()))
                .filter(File::isDirectory)
                .collect(Collectors.toList());
    }


}
