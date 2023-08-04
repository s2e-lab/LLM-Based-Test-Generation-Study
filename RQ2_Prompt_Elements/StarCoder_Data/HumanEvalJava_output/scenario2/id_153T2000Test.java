// StrongestExtensionTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrongestExtension}.
* It contains ten unit test cases for the {@link StrongestExtension#strongestExtension(String, List)} method.
*/
class StrongestExtensionTest {

    /**
    * Test case for the {@link StrongestExtension#strongestExtension(String, List)} method.
    */
    @Test
    void testStrongestExtension() {
        List<String> extensions = List.of("java", "class", "java.lang", "java.util", "java.util.List", "java.util.ArrayList", "java.util.LinkedList", "java.util.Vector", "java.util.Stack", "java.util.Queue");
        assertEquals("java.util.List", StrongestExtension.strongestExtension("java.util.ArrayList", extensions));
        assertEquals("java.util.List", StrongestExtension.strongestExtension("java.util.LinkedList", extensions));
        assertEquals("java.util.List", StrongestExtension.strongestExtension("java.util.Vector", extensions));
        assertEquals("java.util.List", StrongestExtension.strongestExtension("java.util.Stack", extensions));
        assertEquals("java.util.List", StrongestExtension.strongestExtension("java.util.Queue", extensions));
        assertEquals("java.util.ArrayList", StrongestExtension.strongestExtension("java.util.List", extensions));
        assertEquals("java.util.LinkedList", StrongestExtension.strongestExtension("java.util.ArrayList", extensions));
        assertEquals("java.util.Vector", StrongestExtension.strongestExtension("java.util.LinkedList", extensions));
        assertEquals("java.util.Stack", StrongestExtension.strongestExtension("java.util.Vector", extensions));
        assertEquals("java.util.Queue", StrongestExtension.strongestExtension("java.util.Stack", extensions));
    }
}
