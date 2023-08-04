// JWBF_2Test.java
package net.sourceforge.jwbf;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JWBF}.
* It contains ten unit test cases for the {@link JWBF#getVersion()} method.
*/
class JWBF_2Test {

  private static final Map<String, String> PARTS = new HashMap<String, String>();

  private static String version = "";

  private static String title = "";

  private static Manifest manifest = null;

  private static final char separatorChar = '/';

  private static boolean errorInfo = true;

  static {
    init(JWBF_2Test.class);
  }

  private static final String jarFileIndex = "jar:file:";

  private static void init(Class<?> clazz) {
    PARTS.clear();
    version = "";
    title = "";
    manifest = null;
    String packagename = clazz.getPackage().getName().replace('.', separatorChar);
    URL url = clazz.getClassLoader().getResource(packagename);
    boolean isJar = url.toExternalForm().toLowerCase().contains(jarFileIndex);
    if (isJar) {
      try {
        int jarEnd = url.toExternalForm().indexOf("!" + separatorChar);
        String jarFileName = url.toExternalForm().substring(jarFileIndex.length(), jarEnd);
        JarFile jar = new JarFile(jarFileName);
        Enumeration<JarEntry> je = jar.entries();
        while (je.hasMoreElements()) {
          JarEntry jarEntry = je.nextElement();
          String slashCount = jarEntry.getName().replaceAll("[a-zA-Z0-9]", "");
          if (jarEntry.isDirectory() && jarEntry.getName().contains(packagename) && slashCount.length() == 4) {
            registerModule(readMFProductTitle(jarFileName) + "-" + jarEntry.getName().split(separatorChar + "")[3], readMFVersion(jarFileName));
          }
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    } else {
      try {
        File root = new File(url.toURI());
        File[] dirs = root.listFiles(new FileFilter() {

          public boolean accept(File f) {
            return f.isDirectory();
          }
        });
        for (File dir : dirs) {
          int lastIndex = dir.toString().lastIndexOf(separatorChar) + 1;
          String partTitle = dir.toString().substring(lastIndex, dir.toString().length());
          registerModule(readMFProductTitle(root + "") + "-" + partTitle, readMFVersion(root + ""));
        }
      } catch (URISyntaxException e1) {
        e1.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  /**
  */
  private JWBF_2Test() {
    // do nothing
  }

  /**
  * @param artifactId
  *          a
  * @param version
  *          a
  */
  private static void registerModule(String artifactId, String version) {
    PARTS.put(artifactId, version);
  }

  /**
  * @param clazz
  *          a class of the module
  * @return the version
  */
  public static String getVersion(Class<?> clazz) {
    try {
      return getPartInfo(clazz)[1];
    } catch (Exception e) {
      return "Version Unknown";
    }
  }

  /**
  * @param clazz
  *          a class of the module
  * @return the version
  */
  public static String getPartId(Class<?> clazz) {
    try {
      return getPartInfo(clazz)[0];
    } catch (Exception e) {
      return "No Module for " + clazz.getName();
    }
  }

  private static String[] getPartInfo(Class<?> clazz) {
    String classContainer = clazz.getPackage().getName().split("\\.")[3];
    Iterable<String> keys = PARTS.keySet();
    for (String key : keys) {
      if (key.contains(classContainer)) {
        String[] result = { key, PARTS.get(key) };
        return result;
      }
    }
    return null;
  }

  /**
  * Prints the JWBF Version.
  */
  public static void printVersion() {
    System.out.println(PARTS);
  }

  public static void main(String[] args) {
    printVersion();
  }

  /**
  * @return the JWBF Version.
  */
  public static Map<String, String> getVersion() {
    return Collections.unmodifiableMap(PARTS);
  }

  /**
  * @param path
  *          a
  * @return the version from manifest
  * @throws IOException
  *           if path invalid
  */
  private static String readMFVersion(String path) throws IOException {
    if (version.length() < 1) {
      String implementationVersion = null;
      implementationVersion = readFromManifest(path, "Implementation-Version");
      if (implementationVersion == null) {
        version = "DEVEL";
      } else {
        version = implementationVersion;
      }
    }
    return version;
  }

  /**
  * @param path
  *          a
  * @return the
  * @throws IOException
  *           if path invalid
  */
  private static String readMFProductTitle(String path) throws IOException {
    if (title.length() < 1) {
      String implementationTitle = null;
      implementationTitle = readFromManifest(path, "Implementation-Title");
      if (implementationTitle == null) {
        title = "jwbf-generic";
      } else {
        title = implementationTitle;
      }
    }
    return title;
  }

  /**
  * @param path
  *          a
  * @param key
  *          a
  * @return value
  * @throws IOException
  *           if path invalid
  */
  private static String readFromManifest(String path, String key) throws IOException {
    if (manifest == null) {
      URL manifestUrl;
      if (path.endsWith(".jar")) {
        manifestUrl = new URL("jar:file:" + path + "!/META-INF/MANIFEST.MF");
      } else {
        if (!path.endsWith(File.separator))
          path += File.separatorChar;
        manifestUrl = searchMF(path);
      }
      if (manifestUrl != null)
        manifest = new Manifest(manifestUrl.openStream());
    }
    if (manifest == null) {
      if (errorInfo) {
        errorInfo = false;
        String msg = "E: no MANIFEST.MF found, please create it.";
        System.err.println(msg);
      }
      return null;
    }
    return manifest.getMainAttributes().getValue(key);
  }

  private static URL searchMF(String f) throws IOException {
    if (f == null)
      return null;
    File fi = new File(f);
    String foundE = "target" + File.separatorChar + "MANIFEST.MF";
    if (new File(fi, foundE).exists()) {
      return new URL("file:" + fi + File.separatorChar + foundE);
    } else {
      return searchMF(fi.getParent());
    }
  }

  @Test
  void testVersion() {
    assertEquals("1.0.0", JWBF.getVersion(JWBF.class));
  }

  @Test
  void testVersion2() {
    assertEquals("1.0.0", JWBF.getVersion(JWBF_2Test.class));
  }

  @Test
  void testVersion3() {
    assertEquals("1.0.0", JWBF.getVersion(JWBF_3Test.class));
  }

  @Test
  void testVersion4() {
    assertEquals("1.0.0", JWBF.getVersion(JWBF_4Test.class));
  }

  @Test
  void testVersion5() {
    assertEquals("1.0.0", JWBF.getVersion(JWBF_5Test.class));
  }

  @Test
  void testVersion6() {
    assertEquals("1.0.0", JWBF.getVersion(JWBF_6Test.class));
  }

  @Test
  void testVersion7() {
    assertEquals("1.0.0", JWBF.getVersion(JWBF_7Test.class));
  }

  @Test
  void testVersion8() {
    assertEquals("1.0.0", JWBF.getVersion(JWBF_8Test.class));
  }

  @Test
  void testVersion9() {
    assertEquals("1.0.0", JWBF.getVersion(JWBF_9Test.class));
  }

  @Test
  void testVersion10() {
    assertEquals("1.0.0", JWBF.getVersion(JWBF_10Test.class));
  }
}

// JWBF_3Test.java
package net.sourceforge.jwbf;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link