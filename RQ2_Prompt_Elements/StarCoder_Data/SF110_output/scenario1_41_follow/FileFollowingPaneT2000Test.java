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
        boolean expResult = false;
        boolean result = instance.autoPositionCaret();
        assertEquals(expResult, result);
    }
}

// FileFollower.java
package ghm.follow.io;

import ghm.follow.FileFollowingPane;
import ghm.follow.FileFollowingPaneTest;
import ghm.follow.SearchableTextPane;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.PlainDocument;

/**
 * A class which follows a file and appends the contents to a {@link JTextPane}.
 *
 * @author <a href="mailto:greghmerrill@yahoo.com">Greg Merrill</a>
 */
public class FileFollower {

    private static final Logger LOGGER = Logger.getLogger(FileFollower.class.getName());

    private final File file;
    private final FileFollowingPane pane;
    private final OutputDestination destination;

    /**
     * Creates a new {@link FileFollower} which follows the given file and appends the contents to
     * the given {@link JTextPane}.
     *
     * @param file the file to follow
     * @param pane the pane to which the contents of the file will be appended
     */
    public FileFollower(File file, FileFollowingPane pane) {
        this.file = file;
        this.pane = pane;
        this.destination = new JTextComponentDestination(pane.getViewport().getView());
    }

    /**
     * Creates a new {@link FileFollower} which follows the given file and appends the contents to
     * the given {@link SearchableTextPane}.
     *
     * @param file the file to follow
     * @param pane the pane to which the contents of the file will be appended
     */
    public FileFollower(File file, SearchableTextPane pane) {
        this.file = file;
        this.pane = pane;
        this.destination = new JTextComponentDestination(pane);
    }

    /**
     * Creates a new {@link FileFollower} which follows the given file and appends the contents to
     * the given {@link JTextPane}.
     *
     * @param file the file to follow
     * @param pane the pane to which the contents of the file will be appended
     * @param autoPositionCaret whether the caret should be positioned at the end of the file
     */
    public FileFollower(File file, FileFollowingPane pane, boolean autoPositionCaret) {
        this.file = file;
        this.pane = pane;
        this.destination = new JTextComponentDestination(pane.getViewport().getView(), autoPositionCaret);
    }

    /**
     * Creates a new {@link FileFollower} which follows the given file and appends the contents to
     * the given {@link SearchableTextPane}.
     *
     * @param file the file to follow
     * @param pane the pane to which the contents of the file will be appended
     * @param autoPositionCaret whether the caret should be positioned at the end of the file
     */
    public FileFollower(File file, SearchableTextPane pane, boolean autoPositionCaret) {
        this.file = file;
        this.pane = pane;
        this.destination = new JTextComponentDestination(pane, autoPositionCaret);
    }

    /**
     * Creates a new {@link FileFollower} which follows the given file and appends the contents to
     * the given {@link JTextPane}.
     *
     * @param file the file to follow
     * @param pane the pane to which the contents of the file will be appended
     * @param autoPositionCaret whether the caret should be positioned at the end of the file
     * @param autoScroll whether the pane should be scrolled to the end of the file
     */
    public FileFollower(File file, FileFollowingPane pane, boolean autoPositionCaret, boolean autoScroll) {
        this.file = file;
        this.pane = pane;
        this.destination = new JTextComponentDestination(pane.getViewport().getView(), autoPositionCaret, autoScroll);
    }

    /**
     * Creates a new {@link FileFollower} which follows the given file and appends the contents to
     * the given {@link SearchableTextPane}.
     *
     * @param file the file to follow
     * @param pane the pane to which the contents of the file will be appended
     * @param autoPositionCaret whether the caret should be positioned at the end of the file
     * @param autoScroll whether the pane should be scrolled to the end of the file
     */
    public FileFollower(File file, SearchableTextPane pane, boolean autoPositionCaret, boolean autoScroll) {
        this.file = file;
        this.pane = pane;
        this.destination = new JTextComponentDestination(pane, autoPositionCaret, autoScroll);
    }

    /**
     * Creates a new {@link FileFollower} which follows the given file and appends the contents to
     * the given {@link JTextPane}.
     *
     * @param file the file to follow
     * @param pane the pane to which the contents of the file will be appended
     * @param autoPositionCaret whether the caret should be positioned at the end of the file
     * @param autoScroll whether the pane should be scrolled to the end of the file
     * @param autoScrollDelay the delay between automatic scrolls
     */
    public FileFollower(File file, FileFollowingPane pane, boolean autoPositionCaret, boolean autoScroll, int autoScrollDelay) {
        this.file = file;
        this.pane = pane;
        this.destination = new JTextComponentDestination(pane.getViewport().getView(), autoPositionCaret, autoScroll, autoScrollDelay);
    }

    /**
     * Creates a new {@link FileFollower} which follows the given file and appends the contents to
     * the given {@link SearchableTextPane}.
     *
     * @param file the file to follow
     * @param pane the pane to which the contents of the file will be appended
     * @param autoPositionCaret whether the caret should be positioned at the end of the file
     * @param autoScroll whether the pane should be scrolled to the end of the file
     * @param autoScrollDelay the delay between automatic scrolls
     */
    public FileFollower(File file, SearchableTextPane pane, boolean autoPositionCaret, boolean autoScroll, int autoScrollDelay) {
        this.file = file;
        this.pane = pane;
        this.destination = new JTextComponentDestination(pane, autoPositionCaret, autoScroll, autoScrollDelay);
    }

    /**
     * Creates a new {@link FileFollower} which follows the given file and appends the contents to
     * the given {@link JTextPane}.
     *
     * @param file the file to follow
     * @param pane the pane to which the contents of the file will be appended
     * @param autoPositionCaret whether the caret should be positioned at the end of the file
     * @param autoScroll whether the pane should be scrolled to the end of the file
     * @param autoScrollDelay the delay between automatic scrolls
     * @param autoScrollInterval the interval between automatic scrolls
     */
    public FileFollower(File file, FileFollowingPane pane, boolean autoPositionCaret, boolean autoScroll, int autoScrollDelay, int autoScrollInterval) {
        this.file = file;
        this.pane = pane;
        this.destination = new JTextComponentDestination(pane.getViewport().getView(), autoPositionCaret, autoScroll, autoScrollDelay, autoScrollInterval);
    }

    /**
     * Creates a new {@link FileFollower} which follows the given file and appends the contents to
     * the given {@link SearchableTextPane}.
     *
     * @param file the file to follow
     * @param pane the pane to which the contents of the file will be appended
     * @param autoPositionCaret whether the caret should be positioned at the end of the file
     * @param autoScroll whether the pane should be scrolled to the end of the file
     * @param autoScrollDelay the delay between automatic scrolls
     * @param autoScrollInterval the interval between automatic scrolls
     */
    public FileFollower(File file, SearchableTextPane pane, boolean autoPositionCaret, boolean autoScroll, int autoScrollDelay, int autoScrollInterval) {
        this.file = file;
        this.pane = pane;
        this.destination = new JTextComponentDestination(pane, autoPositionCaret, autoScroll, autoScrollDelay, autoScrollInterval);
    }

    /**
     * Creates a new {@link FileFollower} which follows the given file and appends the contents to
     * the given {@link JTextPane}.
     *
     * @param