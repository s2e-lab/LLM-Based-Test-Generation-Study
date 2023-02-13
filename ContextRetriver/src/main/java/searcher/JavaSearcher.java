package searcher;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class JavaSearcher {

    private static List<File> javaFileList = new ArrayList<>();

    public static List<File> findJavaFiles(File directory) {
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
