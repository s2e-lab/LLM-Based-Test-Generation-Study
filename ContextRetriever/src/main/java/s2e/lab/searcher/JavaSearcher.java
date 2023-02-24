package s2e.lab.searcher;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * It  finds all Java files in a directory and its subdirectories.
 */
public class JavaSearcher {


    public static List<File> findJavaFiles(File directory) throws IOException {
        return Files.walk(Paths.get(directory.getAbsolutePath()))
                .filter(p -> Files.isRegularFile(p) && p.toString().endsWith(".java"))
                .map(Path::toFile)
                .collect(Collectors.toList());
    }


}
