// StrongestExtensionTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrongestExtension}.
* It contains ten unit test cases for the {@link StrongestExtension#strongestExtension(String, List)} method.
*/
class StrongestExtensionTest {

    /**
    * Test case for {@link StrongestExtension#strongestExtension(String, List)} where the given class name is "java.util.List" and the given list of extensions is {"java", "util", "List", "java.util", "java.util.List"}.
    */
    @Test
    void testStrongestExtension1() {
        String className = "java.util.List";
        List<String> extensions = List.of("java", "util", "List", "java.util", "java.util.List");
        String expected = "java.util.List";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StrongestExtension#strongestExtension(String, List)} where the given class name is "java.util.List" and the given list of extensions is {"java", "util", "List", "java.util", "java.util.List", "java.util.List.java"}.
    */
    @Test
    void testStrongestExtension2() {
        String className = "java.util.List";
        List<String> extensions = List.of("java", "util", "List", "java.util", "java.util.List", "java.util.List.java");
        String expected = "java.util.List";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StrongestExtension#strongestExtension(String, List)} where the given class name is "java.util.List" and the given list of extensions is {"java", "util", "List", "java.util", "java.util.List", "java.util.List.java", "java.util.List.java.util", "java.util.List.java.util.List"}.
    */
    @Test
    void testStrongestExtension3() {
        String className = "java.util.List";
        List<String> extensions = List.of("java", "util", "List", "java.util", "java.util.List", "java.util.List.java", "java.util.List.java.util", "java.util.List.java.util.List");
        String expected = "java.util.List";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StrongestExtension#strongestExtension(String, List)} where the given class name is "java.util.List" and the given list of extensions is {"java", "util", "List", "java.util", "java.util.List", "java.util.List.java", "java.util.List.java.util", "java.util.List.java.util.List", "java.util.List.java.util.List.java"}.
    */
    @Test
    void testStrongestExtension4() {
        String className = "java.util.List";
        List<String> extensions = List.of("java", "util", "List", "java.util", "java.util.List", "java.util.List.java", "java.util.List.java.util", "java.util.List.java.util.List", "java.util.List.java.util.List.java");
        String expected = "java.util.List";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StrongestExtension#strongestExtension(String, List)} where the given class name is "java.util.List" and the given list of extensions is {"java", "util", "List", "java.util", "java.util.List", "java.util.List.java", "java.util.List.java.util", "java.util.List.java.util.List", "java.util.List.java.util.List.java", "java.util.List.java.util.List.java.util"}.
    */
    @Test
    void testStrongestExtension5() {
        String className = "java.util.List";
        List<String> extensions = List.of("java", "util", "List", "java.util", "java.util.List", "java.util.List.java", "java.util.List.java.util", "java.util.List.java.util.List", "java.util.List.java.util.List.java", "java.util.List.java.util.List.java.util");
        String expected = "java.util.List";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StrongestExtension#strongestExtension(String, List)} where the given class name is "java.util.List" and the given list of extensions is {"java", "util", "List", "java.util", "java.util.List", "java.util.List.java", "java.util.List.java.util", "java.util.List.java.util.List", "java.util.List.java.util.List.java", "java.util.List.java.util.List.java.util", "java.util.List.java.util.List.java.util.List"}.
    */
    @Test
    void testStrongestExtension6() {
        String className = "java.util.List";
        List<String> extensions = List.of("java", "util", "List", "java.util", "java.util.List", "java.util.List.java", "java.util.List.java.util", "java.util.List.java.util.List", "java.util.List.java.util.List.java", "java.util.List.java.util.List.java.util", "java.util.List.java.util.List.java.util.List");
        String expected = "java.util.List";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StrongestExtension#strongestExtension(String, List)} where the given class name is "java.util.List" and the given list of extensions is {"java", "util", "List", "java.util", "java.util.List", "java.util.List.java", "java.util.List.java.util", "java.util.List.java.util.List", "java.util.List.java.util.List.java", "java.util.List.java.util.List.java.util", "java.util.List.java.util.List.java.util.List", "java.util.List.java.util.List.java.util.List.java"}.
    */
    @Test
    void testStrongestExtension7() {
        String className = "java.util.List";
        List<String> extensions = List.of("java", "util", "List", "java.util", "java.util.List", "java.util.List.java", "java.util.List.java.util", "java.util.List.java.util.List", "java.util.List.java.util.List.java", "java.util.List.java.util.List.java.util", "java.util.List.java.util.List.java.util.List", "java.util.List.java.util.List.java.util.List.java");
        String expected = "java.util.List";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StrongestExtension#strongestExtension(String, List)} where the given class name is "java.util.List" and the given list of extensions is {"java", "util", "List", "java.util", "java.util.List", "java.util.List.java", "java.util.List.java.util", "java.util.List.java.util.List", "java.util.List.java.util.List.java", "java.util.List.java.util.List.java.util", "java.util.List.java.util.List.java.util.List", "java.util.List.java.util.List.java.util.List.java", "java.util.List.java.util.List.java.util.List.java.util"}