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

    private Logger log = Logger.getLogger(FileFollowingPaneTest.class.getName());

    /**
     * Test of autoPositionCaret method, of class FileFollowingPane.
     */
    @Test
    void testAutoPositionCaret() {
        log.info("autoPositionCaret");
        FileFollowingPane instance = new FileFollowingPane(new File("test.txt"), 1024, 100, true, new Font("Monospaced", Font.PLAIN, 12), 4);
        boolean expResult = true;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }

    /**
     * Test of autoPositionCaret method, of class FileFollowingPane.
     */
    @Test
    void testAutoPositionCaret2() {
        log.info("autoPositionCaret");
        FileFollowingPane instance = new FileFollowingPane(new File("test.txt"), 1024, 100, false, new Font("Monospaced", Font.PLAIN, 12), 4);
        boolean expResult = false;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }

    /**
     * Test of autoPositionCaret method, of class FileFollowingPane.
     */
    @Test
    void testAutoPositionCaret3() {
        log.info("autoPositionCaret");
        FileFollowingPane instance = new FileFollowingPane(new File("test.txt"), 1024, 100, true, new Font("Monospaced", Font.PLAIN, 12), 4);
        boolean expResult = true;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }

    /**
     * Test of autoPositionCaret method, of class FileFollowingPane.
     */
    @Test
    void testAutoPositionCaret4() {
        log.info("autoPositionCaret");
        FileFollowingPane instance = new FileFollowingPane(new File("test.txt"), 1024, 100, true, new Font("Monospaced", Font.PLAIN, 12), 4);
        boolean expResult = true;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }

    /**
     * Test of autoPositionCaret method, of class FileFollowingPane.
     */
    @Test
    void testAutoPositionCaret5() {
        log.info("autoPositionCaret");
        FileFollowingPane instance = new FileFollowingPane(new File("test.txt"), 1024, 100, true, new Font("Monospaced", Font.PLAIN, 12), 4);
        boolean expResult = true;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }

    /**
     * Test of autoPositionCaret method, of class FileFollowingPane.
     */
    @Test
    void testAutoPositionCaret6() {
        log.info("autoPositionCaret");
        FileFollowingPane instance = new FileFollowingPane(new File("test.txt"), 1024, 100, true, new Font("Monospaced", Font.PLAIN, 12), 4);
        boolean expResult = true;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }

    /**
     * Test of autoPositionCaret method, of class FileFollowingPane.
     */
    @Test
    void testAutoPositionCaret7() {
        log.info("autoPositionCaret");
        FileFollowingPane instance = new FileFollowingPane(new File("test.txt"), 1024, 100, true, new Font("Monospaced", Font.PLAIN, 12), 4);
        boolean expResult = true;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }

    /**
     * Test of autoPositionCaret method, of class FileFollowingPane.
     */
    @Test
    void testAutoPositionCaret8() {
        log.info("autoPositionCaret");
        FileFollowingPane instance = new FileFollowingPane(new File("test.txt"), 1024, 100, true, new Font("Monospaced", Font.PLAIN, 12), 4);
        boolean expResult = true;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }

    /**
     * Test of autoPositionCaret method, of class FileFollowingPane.
     */
    @Test
    void testAutoPositionCaret9() {
        log.info("autoPositionCaret");
        FileFollowingPane instance = new FileFollowingPane(new File("test.txt"), 1024, 100, true, new Font("Monospaced", Font.PLAIN, 12), 4);
        boolean expResult = true;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }

    /**
     * Test of autoPositionCaret method, of class FileFollowingPane.
     */
    @Test
    void testAutoPositionCaret10() {
        log.info("autoPositionCaret");
        FileFollowingPane instance = new FileFollowingPane(new File("test.txt"), 1024, 100, true, new Font("Monospaced", Font.PLAIN, 12), 4);
        boolean expResult = true;
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

    private Logger log = Logger.getLogger(FileFollowingPane.class.getName());

    /**
     * FileFollower used to print to this component
     */
    protected FileFollower fileFollower;

    /**
     * Text area into which followed file's contents are printed
     */
    protected SearchableTextPane textArea;

    /**
     * OutputDestination used w/FileFollower
     */
    protected JTextComponentDestination destination;

    /**
     * @param file
     *            text file to be followed
     * @param bufferSize
     *            size of the character buffer inside the FileFollower used to follow the supplied
     *            file
     * @param latency
     *            latency of the FileFollower used to follow the supplied file
     */
    public FileFollowingPane(File file, int bufferSize, int latency, boolean autoPositionCaret, Font font, int tabSize) {
    }

    /**
     * Returns the text area to which the followed file's contents are being printed.
     *
     * @return text area containing followed file's contents
     */
    public SearchableTextPane getTextPane();

    /**
     * Returns whether caret is automatically repositioned to the end of the text area when text is
     * appended to the followed file
     *
     * @return whether caret is automatically repositioned on append
     */
    public boolean autoPositionCaret();

    /**
     * Sets whether caret is automatically repositioned to the end of the text area when text is
     * appended to the followed file
     *
     * @param value
     *            whether caret is automatically repositioned on append
     */
    public void setAutoPositionCaret(boolean value);

    /**
     * Returns the FileFollower which is being used to print information in this component.
     *
     * @return FileFollower used by this component
     */
    public FileFollower getFileFollower();

    /**
     * Convenience method; equivalent to calling getFileFollower().getFollowedFile()
     */
    public File getFollowedFile();

    /**
     * Convenience method; equivalent to calling getFileFollower().start()
     */
    public void startFollowing();

    /**
     * Convenience method; equivalent to calling getFileFollower().stop()
     */
    public void stopFollowing();

    /**
     * Convenience method; equivalent to calling getFileFollower().restart()
     */
    public void restartFollowing();

    /**
     * Convenience method; equivalent to calling getFileFollower().pause()
     */
    public void pauseFollowing();

    /**
     * Convenience method; equivalent to calling getFileFollower().unpause()
     */
    public void unpauseFollowing();

    /**
     * Convenience method; equivalent to calling getFileFollower().isPaused()
     *
     * @return
     */
    public boolean isFollowingPaused();

    /**
     * Convenience method; equivalent to calling getFileFollower().stopAndWait()
     */
    public void stopFollowingAndWait() throws InterruptedException;

    /**
     * Convenience method; equivalent to called getFileFollower().isBeingFollowed()
     *
     * @return