package s2e.lab.searcher;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * It  finds all Java files in a directory and its subdirectories.
 */
public class JavaSearcher {


    public static List<File> findJavaFiles(File directory) {
        List<File> javaFileList = new ArrayList<>();
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".java")) {
                javaFileList.add(file);
            } else if (file.isDirectory()) {
                findJavaFiles(file);
            }
        }
        return javaFileList;
    }


}
