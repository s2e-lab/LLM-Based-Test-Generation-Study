// HttpPreferenceTest.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpPreference}.
* It contains ten unit test cases for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
*/
class HttpPreferenceTest {

    /**
     * Test of loadPreference method, of class HttpPreference.
     */
    @Test
    void testLoadPreference() {
        System.out.println("loadPreference");
        HttpAnalyzerView mainView = new HttpAnalyzerView();
        JFrame parentFrame = new JFrame();
        HttpPreference instance = new HttpPreference();
        String expResult = "Notes";
        String result = instance.loadPreference(mainView, parentFrame);
        assertEquals(expResult, result);
    }
}
