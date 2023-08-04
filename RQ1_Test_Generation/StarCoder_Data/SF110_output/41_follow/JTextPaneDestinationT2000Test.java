// JTextPaneDestinationTest.java
package ghm.follow.io;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JTextPaneDestination}.
* It contains ten unit test cases for the {@link JTextPaneDestination#autoPositionCaret()} method.
*/
class JTextPaneDestinationTest {

    private Logger log = Logger.getLogger(JTextPaneDestinationTest.class.getName());

    /**
     * Test of autoPositionCaret method, of class JTextPaneDestination.
     */
    @Test
    void testAutoPositionCaret() {
        JTextPane jTextPane = new JTextPane();
        JTextPaneDestination instance = new JTextPaneDestination(jTextPane, true);
        assertTrue(instance.autoPositionCaret());
        instance.setAutoPositionCaret(false);
        assertFalse(instance.autoPositionCaret());
    }
}
