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

    private static final Logger LOGGER = Logger.getLogger(JTextComponentDestinationTest.class.getName());

    /**
     * Test of {@link JTextComponentDestination#autoPositionCaret()} method, of class {@link JTextComponentDestination}.
     */
    @Test
    void testAutoPositionCaret() {
        LOGGER.log(Level.INFO, "testAutoPositionCaret");
        JTextComponent jtc = new JTextComponent() {
            @Override
            public void setCaretPosition(int position) {
                LOGGER.log(Level.INFO, "setCaretPosition({0})", position);
            }
        };
        JTextComponentDestination instance = new JTextComponentDestination(jtc);
        instance.autoPositionCaret = true;
        instance.write("test");
        assertEquals(4, jtc.getCaretPosition());
    }

    /**
     * Test of {@link JTextComponentDestination#autoPositionCaret()} method, of class {@link JTextComponentDestination}.
     */
    @Test
    void testAutoPositionCaret2() {
        LOGGER.log(Level.INFO, "testAutoPositionCaret2");
        JTextComponent jtc = new JTextComponent() {
            @Override
            public void setCaretPosition(int position) {
                LOGGER.log(Level.INFO, "setCaretPosition({0})", position);
            }
        };
        JTextComponentDestination instance = new JTextComponentDestination(jtc);
        instance.autoPositionCaret = false;
        instance.write("test");
        assertEquals(0, jtc.getCaretPosition());
    }

    /**
     * Test of {@link JTextComponentDestination#autoPositionCaret()} method, of class {@link JTextComponentDestination}.
     */
    @Test
    void testAutoPositionCaret3() {
        LOGGER.log(Level.INFO, "testAutoPositionCaret3");
        JTextComponent jtc = new JTextComponent() {
            @Override
            public void setCaretPosition(int position) {
                LOGGER.log(Level.INFO, "setCaretPosition({0})", position);
            }
        };
        JTextComponentDestination instance = new JTextComponentDestination(jtc);
        instance.autoPositionCaret = true;
        instance.write("test");
        instance.autoPositionCaret = false;
        instance.write("test");
        assertEquals(0, jtc.getCaretPosition());
    }

    /**
     * Test of {@link JTextComponentDestination#autoPositionCaret()} method, of class {@link JTextComponentDestination}.
     */
    @Test
    void testAutoPositionCaret4() {
        LOGGER.log(Level.INFO, "testAutoPositionCaret4");
        JTextComponent jtc = new JTextComponent() {
            @Override
            public void setCaretPosition(int position) {
                LOGGER.log(Level.INFO, "setCaretPosition({0})", position);
            }
        };
        JTextComponentDestination instance = new JTextComponentDestination(jtc);
        instance.autoPositionCaret = true;
        instance.write("test");
        instance.autoPositionCaret = true;
        instance.write("test");
        assertEquals(8, jtc.getCaretPosition());
    }

    /**
     * Test of {@link JTextComponentDestination#autoPositionCaret()} method, of class {@link JTextComponentDestination}.
     */
    @Test
    void testAutoPositionCaret5() {
        LOGGER.log(Level.INFO, "testAutoPositionCaret5");
        JTextComponent jtc = new JTextComponent() {
            @Override
            public void setCaretPosition(int position) {
                LOGGER.log(Level.INFO, "setCaretPosition({0})", position);
            }
        };
        JTextComponentDestination instance = new JTextComponentDestination(jtc);
        instance.autoPositionCaret = true;
        instance.write("test");
        instance.autoPositionCaret = true;
        instance.write("test");
        instance.autoPositionCaret = false;
        instance.write("test");
        assertEquals(0, jtc.getCaretPosition());
    }

    /**
     * Test of {@link JTextComponentDestination#autoPositionCaret()} method, of class {@link JTextComponentDestination}.
     */
    @Test
    void testAutoPositionCaret6() {
        LOGGER.log(Level.INFO, "testAutoPositionCaret6");
        JTextComponent jtc = new JTextComponent() {
            @Override
            public void setCaretPosition(int position) {
                LOGGER.log(Level.INFO, "setCaretPosition({0})", position);
            }
        };
        JTextComponentDestination instance = new JTextComponentDestination(jtc);
        instance.autoPositionCaret = true;
        instance.write("test");
        instance.autoPositionCaret = true;
        instance.write("test");
        instance.autoPositionCaret = true;
        instance.write("test");
        assertEquals(12, jtc.getCaretPosition());
    }

    /**
     * Test of {@link JTextComponentDestination#autoPositionCaret()} method, of class {@link JTextComponentDestination}.
     */
    @Test
    void testAutoPositionCaret7() {
        LOGGER.log(Level.INFO, "testAutoPositionCaret7");
        JTextComponent jtc = new JTextComponent() {
            @Override
            public void setCaretPosition(int position) {
                LOGGER.log(Level.INFO, "setCaretPosition({0})", position);
            }
        };
        JTextComponentDestination instance = new JTextComponentDestination(jtc);
        instance.autoPositionCaret = true;
        instance.write("test");
        instance.autoPositionCaret = true;
        instance.write("test");
        instance.autoPositionCaret = true;
        instance.write("test");
        instance.autoPositionCaret = false;
        instance.write("test");
        assertEquals(0, jtc.getCaretPosition());
    }

    /**
     * Test of {@link JTextComponentDestination#autoPositionCaret()} method, of class {@link JTextComponentDestination}.
     */
    @Test
    void testAutoPositionCaret8() {
        LOGGER.log(Level.INFO, "testAutoPositionCaret8");
        JTextComponent jtc = new JTextComponent() {
            @Override
            public void setCaretPosition(int position) {
                LOGGER.log(Level.INFO, "setCaretPosition({0})", position);
            }
        };
        JTextComponentDestination instance = new JTextComponentDestination(jtc);
        instance.autoPositionCaret = true;
        instance.write("test");
        instance.autoPositionCaret = true;
        instance.write("test");
        instance.autoPositionCaret = true;
        instance.write("test");
        instance.autoPositionCaret = true;
        instance.write("test");
        assertEquals(16, jtc.getCaretPosition());
    }

    /**
     * Test of {@link JTextComponentDestination#autoPositionCaret()} method, of class {@link JTextComponentDestination}.
     */
    @Test
    void testAutoPositionCaret9() {
        LOGGER.log(Level.INFO, "testAutoPositionCaret9");
        JTextComponent jtc = new JTextComponent() {
            @Override
            public void setCaretPosition(int position) {
                LOGGER.log(Level.INFO, "setCaretPosition({0})", position);
            }
        };
        JTextComponentDestination instance = new JTextComponentDestination(jtc);
        instance.autoPositionCaret = true;
        instance.write("test");
        instance.autoPositionCaret = true;
        instance.write("test");
        instance.autoPositionCaret = true;
        instance.write("test");
        instance.autoPositionCaret = true;
        instance.write("test");
        instance.autoPositionCaret = false;
        instance.write("test");
        assertEquals(0, jtc.getCaretPosition());
    }

    /**
     * Test of {@link JTextComponentDestination#autoPositionCaret()} method, of class {@link JTextComponentDestination}.
     */
    @Test
    void testAutoPositionCaret10() {
        LOGGER.log(Level.INFO, "testAutoPositionCaret10");
        JTextComponent jtc = new JTextComponent() {
            @Override
            public void setCaretPosition(int position) {
                LOGGER.log(Level.INFO, "setCaretPosition({0})", position);
            }
        };
        JTextComponentDestination instance = new JTextComponentDestination(jtc);
        instance.autoPositionCaret = true;
        instance.write("test");
        instance.autoPositionCaret = true;
        instance.write("test");
        instance.autoPositionCaret = true;
        instance.write("test");
        instance.autoPositionCaret = true;
        instance.write("test");
        instance.autoPositionCaret = true;
        instance.write("test");
        assertEquals(20, jtc.getCaretPosition());
    }
}

// JTextComponentDestination.java
package ghm.follow.io;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;

/**
 * Implementation of {@link OutputDestination} which appends Strings to a {@link JTextComponent}.
 *
 * @see OutputDestination
 * @see JTextCompnent
 * @author <a href="mailto:<EMAIL>"><NAME></a>
 */
