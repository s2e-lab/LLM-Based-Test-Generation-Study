// StrongestExtensionTest.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link StrongestExtension}.
 * It contains ten unit test cases for the {@link StrongestExtension#strongestExtension(String, List)} method.
 */
class StrongestExtensionTest {

    @Test
    void testStrongestExtensionWithOneExtension() {
        String className = "MyClass";
        List<String> extensions = Arrays.asList("Extension");
        String expected = "MyClass.Extension";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    @Test
    void testStrongestExtensionWithMultipleExtensions() {
        String className = "MyClass";
        List<String> extensions = Arrays.asList("Extension1", "Extension2", "Extension3");
        String expected = "MyClass.Extension1";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    @Test
    void testStrongestExtensionWithEqualStrengthExtensions() {
        String className = "MyClass";
        List<String> extensions = Arrays.asList("ExTension1", "eXTension2", "EXTENSION3");
        String expected = "MyClass.ExTension1";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    @Test
    void testStrongestExtensionWithNoExtensions() {
        String className = "MyClass";
        List<String> extensions = Arrays.asList();
        String expected = "";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    @Test
    void testStrongestExtensionWithEmptyClassName() {
        String className = "";
        List<String> extensions = Arrays.asList("Extension1", "Extension2", "Extension3");
        String expected = "";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    @Test
    void testStrongestExtensionWithNullClassName() {
        String className = null;
        List<String> extensions = Arrays.asList("Extension1", "Extension2", "Extension3");
        String expected = "";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    @Test
    void testStrongestExtensionWithNullExtensions() {
        String className = "MyClass";
        List<String> extensions = null;
        String expected = "";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    @Test
    void testStrongestExtensionWithMixedCaseExtensions() {
        String className = "MyClass";
        List<String> extensions = Arrays.asList("ExTension1", "eXTension2", "EXTENSION3", "extension4");
        String expected = "MyClass.ExTension1";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    @Test
    void testStrongestExtensionWithNoLettersInExtensions() {
        String className = "MyClass";
        List<String> extensions = Arrays.asList("123", "456", "789");
        String expected = "MyClass.123";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    @Test
    void testStrongestExtensionWithEqualStrengthExtensionsAtTheEnd() {
        String className = "MyClass";
        List<String> extensions = Arrays.asList("Extension1", "Extension2", "EXTENSION3");
        String expected = "MyClass.EXTENSION3";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
}