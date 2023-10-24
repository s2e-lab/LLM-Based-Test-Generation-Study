// JTextComponentDestinationTest.java
package ghm.follow.io;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JTextComponentDestination}.
* It contains ten unit test cases for the {@link JTextComponentDestination#autoPositionCaret()} method.
*/
class JTextComponentDestinationTest {

    private static final Logger LOG = Logger.getLogger(JTextComponentDestinationTest.class.getName());

    /**
     * Test of autoPositionCaret method, of class JTextComponentDestination.
     */
    @Test
    void testAutoPositionCaret() {
        JTextComponent comp = new JTextComponent() {
            public void setCaretPosition(int pos) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        JTextComponentDestination instance = new JTextComponentDestination(comp, true);
        assertTrue(instance.autoPositionCaret());
        instance.setAutoPositionCaret(false);
        assertFalse(instance.autoPositionCaret());
    }
}
