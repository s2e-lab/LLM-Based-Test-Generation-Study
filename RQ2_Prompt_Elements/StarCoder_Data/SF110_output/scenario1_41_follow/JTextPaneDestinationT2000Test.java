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

    private static final Logger LOGGER = Logger.getLogger(JTextPaneDestinationTest.class.getName());

    /**
     * Test of {@link JTextPaneDestination#autoPositionCaret()} method, of class {@link JTextPaneDestination}.
     */
    @Test
    void testAutoPositionCaret() {
        LOGGER.log(Level.INFO, "testAutoPositionCaret");
        JTextPane textPane = new JTextPane();
        JTextPaneDestination instance = new JTextPaneDestination(textPane);
        boolean expResult = true;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }
}

// JTextPaneDestination.java
package ghm.follow.io;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;

/**
 * Implementation of {@link OutputDestination} which appends Strings to a {@link JTextPane}.
 *
 * @see OutputDestination
 * @see JTextPane
 * @author <a href="mailto:<EMAIL>"><NAME></a>
 */
public class JTextPaneDestination implements OutputDestination {

    private final JTextPane textPane;
    private boolean autoPositionCaret;

    public JTextPaneDestination(JTextPane textPane) {
        this.textPane = textPane;
        this.autoPositionCaret = true;
    }

    public boolean autoPositionCaret() {
        return autoPositionCaret;
    }

    public void setAutoPositionCaret(boolean autoPositionCaret) {
        this.autoPositionCaret = autoPositionCaret;
    }

    public void append(String string) {
        try {
            textPane.getDocument().insertString(textPane.getDocument().getLength(), string, null);
            if (autoPositionCaret) {
                textPane.setCaretPosition(textPane.getDocument().getLength());
            }
        } catch (BadLocationException ex) {
            Logger.getLogger(JTextPaneDestination.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

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
		
    private static final Logger LOGGER = Logger.getLogger(JTextPaneDestinationTest.class.getName());

    /**
     * Test of {@link JTextPaneDestination#autoPositionCaret()} method, of class {@link JTextPaneDestination}.
     */
    @Test
    void testAutoPositionCaret() {
        LOGGER.log(Level.INFO, "testAutoPositionCaret");
        JTextPane textPane = new JTextPane();
        JTextPaneDestination instance = new JTextPaneDestination(textPane);
        boolean expResult = true;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }
}

// JTextPaneDestination.java
package ghm.follow.io;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;

/**
 * Implementation of {@link OutputDestination} which appends Strings to a {@link JTextPane}.
 *
 * @see OutputDestination
 * @see JTextPane
 * @author <a href="mailto:<EMAIL>"><NAME></a>
 */
public class JTextPaneDestination implements OutputDestination {

    private final JTextPane textPane;
    private boolean autoPositionCaret;

    public JTextPaneDestination(JTextPane textPane) {
        this.textPane = textPane;
        this.autoPositionCaret = true;
    }

    public boolean autoPositionCaret() {
        return autoPositionCaret;
    }

    public void setAutoPositionCaret(boolean autoPositionCaret) {
        this.autoPositionCaret = autoPositionCaret;
    }

    public void append(String string) {
        try {
            textPane.getDocument().insertString(textPane.getDocument().getLength(), string, null);
            if (autoPositionCaret) {
                textPane.setCaretPosition(textPane.getDocument().getLength());
            }
        } catch (BadLocationException ex) {
            Logger.getLogger(JTextPaneDestination.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

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
		
    private static final Logger LOGGER = Logger.getLogger(JTextPaneDestinationTest.class.getName());

    /**
     * Test of {@link JTextPaneDestination#autoPositionCaret()} method, of class {@link JTextPaneDestination}.
     */
    @Test
    void testAutoPositionCaret() {
        LOGGER.log(Level.INFO, "testAutoPositionCaret");
        JTextPane textPane = new JTextPane();
        JTextPaneDestination instance = new JTextPaneDestination(textPane);
        boolean expResult = true;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }
}

// JTextPaneDestination.java
package ghm.follow.io;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;

/**
 * Implementation of {@link OutputDestination} which appends Strings to a {@link JTextPane}.
 *
 * @see OutputDestination
 * @see JTextPane
 * @author <a href="mailto:<EMAIL>"><NAME></a>
 */
public class JTextPaneDestination implements OutputDestination {

    private final JTextPane textPane;
    private boolean autoPositionCaret;

    public JTextPaneDestination(JTextPane textPane) {
        this.textPane = textPane;
        this.autoPositionCaret = true;
    }

    public boolean autoPositionCaret() {
        return autoPositionCaret;
    }

    public void setAutoPositionCaret(boolean autoPositionCaret) {
        this.autoPositionCaret = autoPositionCaret;
    }

    public void append(String string) {
        try {
            textPane.getDocument().insertString(textPane.getDocument().getLength(), string, null);
            if (autoPositionCaret) {
                textPane.setCaretPosition(textPane.getDocument().getLength());
            }
        } catch (BadLocationException ex) {
            Logger.getLogger(JTextPaneDestination.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

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
		
    private static final Logger LOGGER = Logger.getLogger(JTextPaneDestinationTest.class.getName());

    /**
     * Test of {@link JTextPaneDestination#autoPositionCaret()} method, of class {@link JTextPaneDestination}.
     */
    @Test
    void testAutoPositionCaret() {
        LOGGER.log(Level.INFO, "testAutoPositionCaret");
        JTextPane textPane = new JTextPane();
        JTextPaneDestination instance = new JTextPaneDestination(textPane);
        boolean expResult = true;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }
}

// JTextPaneDestination.java
package ghm.follow.io;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;

/**
 * Implementation of {@link OutputDestination} which appends Strings to a {@link JTextPane}.
 *
 * @see OutputDestination
 * @