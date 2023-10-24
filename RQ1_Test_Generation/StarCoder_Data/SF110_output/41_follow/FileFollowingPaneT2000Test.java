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
        File file = new File("test.txt");
        FileFollowingPane instance = new FileFollowingPane(file, 1024, 100, true, new Font("Monospaced", Font.PLAIN, 12), 8);
        assertTrue(instance.autoPositionCaret());
        instance.setAutoPositionCaret(false);
        assertFalse(instance.autoPositionCaret());
    }
}
