// FileFollowingPaneTest.java
package ghm.follow.gui;

import ghm.follow.FileFollower;
import ghm.follow.io.JTextComponentDestination;
import ghm.follow.io.OutputDestination;
import ghm.follow.search.SearchableTextPane;
import java.awt.Font;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileFollowingPane}.
* It contains ten unit test cases for the {@link FileFollowingPane#autoPositionCaret()} method.
*/
class FileFollowingPaneTest {

    /**
     * Test of {@link FileFollowingPane#autoPositionCaret()} method, of class FileFollowingPane.
     */
    @Test
    void testAutoPositionCaret() {
        System.out.println("autoPositionCaret");
        FileFollowingPane instance = new FileFollowingPane();
        boolean expResult = true;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link FileFollowingPane#autoPositionCaret()} method, of class FileFollowingPane.
     */
    @Test
    void testAutoPositionCaret2() {
        System.out.println("autoPositionCaret");
        FileFollowingPane instance = new FileFollowingPane(new FileFollower(new JTextComponentDestination(new SearchableTextPane())));
        boolean expResult = true;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link FileFollowingPane#autoPositionCaret()} method, of class FileFollowingPane.
     */
    @Test
    void testAutoPositionCaret3() {
        System.out.println("autoPositionCaret");
        FileFollowingPane instance = new FileFollowingPane(new FileFollower(new JTextComponentDestination(new SearchableTextPane()), true));
        boolean expResult = true;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link FileFollowingPane#autoPositionCaret()} method, of class FileFollowingPane.
     */
    @Test
    void testAutoPositionCaret4() {
        System.out.println("autoPositionCaret");
        FileFollowingPane instance = new FileFollowingPane(new FileFollower(new JTextComponentDestination(new SearchableTextPane()), false));
        boolean expResult = false;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link FileFollowingPane#autoPositionCaret()} method, of class FileFollowingPane.
     */
    @Test
    void testAutoPositionCaret5() {
        System.out.println("autoPositionCaret");
        FileFollowingPane instance = new FileFollowingPane(new FileFollower(new JTextComponentDestination(new SearchableTextPane()), true, true));
        boolean expResult = true;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link FileFollowingPane#autoPositionCaret()} method, of class FileFollowingPane.
     */
    @Test
    void testAutoPositionCaret6() {
        System.out.println("autoPositionCaret");
        FileFollowingPane instance = new FileFollowingPane(new FileFollower(new JTextComponentDestination(new SearchableTextPane()), false, true));
        boolean expResult = false;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link FileFollowingPane#autoPositionCaret()} method, of class FileFollowingPane.
     */
    @Test
    void testAutoPositionCaret7() {
        System.out.println("autoPositionCaret");
        FileFollowingPane instance = new FileFollowingPane(new FileFollower(new JTextComponentDestination(new SearchableTextPane()), true, false));
        boolean expResult = true;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link FileFollowingPane#autoPositionCaret()} method, of class FileFollowingPane.
     */
    @Test
    void testAutoPositionCaret8() {
        System.out.println("autoPositionCaret");
        FileFollowingPane instance = new FileFollowingPane(new FileFollower(new JTextComponentDestination(new SearchableTextPane()), false, false));
        boolean expResult = false;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link FileFollowingPane#autoPositionCaret()} method, of class FileFollowingPane.
     */
    @Test
    void testAutoPositionCaret9() {
        System.out.println("autoPositionCaret");
        FileFollowingPane instance = new FileFollowingPane(new FileFollower(new JTextComponentDestination(new SearchableTextPane()), true, true, true));
        boolean expResult = true;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link FileFollowingPane#autoPositionCaret()} method, of class FileFollowingPane.
     */
    @Test
    void testAutoPositionCaret10() {
        System.out.println("autoPositionCaret");
        FileFollowingPane instance = new FileFollowingPane(new FileFollower(new JTextComponentDestination(new SearchableTextPane()), false, true, true));
        boolean expResult = false;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }
}

// FileFollowingPane.java
package ghm.follow.gui;

import ghm.follow.FileFollower;
import ghm.follow.io.JTextComponentDestination;
import ghm.follow.io.OutputDestination;
import ghm.follow.search.SearchableTextPane;
import java.awt.Font;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

/**
 * A component which allows one to view a text file to which information is being asynchronously
 * appended.
 *
 * @author <a href="mailto:greghmerrill@yahoo.com">Greg Merrill</a>
 */
public class FileFollowingPane extends JScrollPane {

    /**
     * Returns whether caret is automatically repositioned to the end of the text area when text is
     * appended to the followed file
     *
     * @return whether caret is automatically repositioned on append
     */
    public boolean autoPositionCaret() {
        return autoPositionCaret;
    }
}

// FileFollowingPane.java
package ghm.follow.gui;

import ghm.follow.FileFollower;
import ghm.follow.io.JTextComponentDestination;
import ghm.follow.io.OutputDestination;
import ghm.follow.search.SearchableTextPane;
import java.awt.Font;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

/**
 * A component which allows one to view a text file to which information is being asynchronously
 * appended.
 *
 * @author <a href="mailto:greghmerrill@yahoo.com">Greg Merrill</a>
 */
public class FileFollowingPane extends JScrollPane {

    /**
     * Returns whether caret is automatically repositioned to the end of the text area when text is
     * appended to the followed file
     *
     * @return whether caret is automatically repositioned on append
     */
    public boolean autoPositionCaret() {
        return autoPositionCaret;
    }
}

// FileFollowingPane.java
package ghm.follow.gui;

import ghm.follow.FileFollower;
import ghm.follow.io.JTextComponentDestination;
import ghm.follow.io.OutputDestination;
import ghm.follow.search.SearchableTextPane;
import java.awt.Font;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

/**
 * A component which allows one to view a text file to which information is being asynchronously
 * appended.
 *
 * @author <a href="mailto:greghmerrill@yahoo.com">Greg Merrill</a>
 */
public class FileFollowingPane extends JScrollPane {

    /**
     * Returns whether caret is automatically repositioned to the end of the text area when text is
     * appended to the followed file
     *
     * @return whether caret is automatically repositioned on append
     */
    public boolean autoPositionCaret() {
        return autoPositionCaret;
    }
}

// FileFollowingPane.java
package ghm.follow.gui;

import ghm.follow.FileFollower;
import ghm.follow.io.JTextComponentDestination;
import ghm.follow.io.OutputDestination;
import ghm.follow.search.SearchableTextPane;
import java.awt.Font;
import java