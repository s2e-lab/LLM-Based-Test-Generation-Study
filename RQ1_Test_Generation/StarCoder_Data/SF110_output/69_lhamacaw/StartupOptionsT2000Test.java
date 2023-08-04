// StartupOptionsTest.java
package macaw.system;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartupOptions}.
* It contains ten unit test cases for the {@link StartupOptions#useDemo()} method.
*/
class StartupOptionsTest {

    /**
    * Test of {@link StartupOptions#useDemo()} method, of class StartupOptions.
    */
    @Test
    void testUseDemo() {
        StartupOptions instance = new StartupOptions();
        boolean expResult = true;
        boolean result = instance.useDemo();
        assertEquals(expResult, result);
    }
}
