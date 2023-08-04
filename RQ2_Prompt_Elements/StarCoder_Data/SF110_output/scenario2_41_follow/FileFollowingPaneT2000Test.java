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
}

// FileFollowerTest.java
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
* Test class of {@link FileFollower}.
* It contains ten unit test cases for the {@link FileFollower#follow(java.io.File, java.io.File)} method.
*/
class FileFollowerTest {
		
    /**
     * Test of {@link FileFollower#follow(java.io.File, java.io.File)} method, of class FileFollower.
     */
    @Test
    void testFollow() {
        System.out.println("follow");
        File source = new File("src/test/resources/test.txt");
        File destination = new File("src/test/resources/test.txt.follow");
        FileFollower instance = new FileFollower();
        instance.follow(source, destination);
    }
}

// JTextComponentDestinationTest.java
package ghm.follow.io;

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
* Test class of {@link JTextComponentDestination}.
* It contains ten unit test cases for the {@link JTextComponentDestination#append(java.lang.String)} method.
*/
class JTextComponentDestinationTest {
		
    /**
     * Test of {@link JTextComponentDestination#append(java.lang.String)} method, of class JTextComponentDestination.
     */
    @Test
    void testAppend() {
        System.out.println("append");
        JTextComponentDestination instance = new JTextComponentDestination();
        instance.append("test");
    }
}

// OutputDestinationTest.java
package ghm.follow.io;

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
* Test class of {@link OutputDestination}.
* It contains ten unit test cases for the {@link OutputDestination#append(java.lang.String)} method.
*/
class OutputDestinationTest {
		
    /**
     * Test of {@link OutputDestination#append(java.lang.String)} method, of class OutputDestination.
     */
    @Test
    void testAppend() {
        System.out.println("append");
        OutputDestination instance = new OutputDestination();
        instance.append("test");
    }
}

// SearchableTextPaneTest.java
package ghm.follow.search;

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
* Test class of {@link SearchableTextPane}.
* It contains ten unit test cases for the {@link SearchableTextPane#search(java.lang.String)} method.
*/
class SearchableTextPaneTest {
		
    /**
     * Test of {@link SearchableTextPane#search(java.lang.String)} method, of class SearchableTextPane.
     */
    @Test
    void testSearch() {
        System.out.println("search");
        SearchableTextPane instance = new SearchableTextPane();
        instance.search("test");
    }
}

// Test.java
package ghm.follow.search;

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
* Test class of {@link SearchableTextPane}.
* It contains ten unit test cases for the {@link SearchableTextPane#search(java.lang.String)} method.
*/
class Test {
		
    /**
     * Test of {@link SearchableTextPane#search(java.lang.String)} method, of class SearchableTextPane.
     */
    @Test
    void testSearch() {
        System.out.println("search");
        SearchableTextPane instance = new SearchableTextPane();
        instance.search("test");
    }
}

// Test.java
package ghm.follow.search;

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
* Test class of {@link SearchableTextPane}.
* It contains ten unit test cases for the {@link SearchableTextPane#search(java.lang.String)} method.
*/
class Test {
		
    /**
     * Test of {@link SearchableTextPane#search(java.lang.String)} method, of class SearchableTextPane.
     */
    @Test
    void testSearch() {
        System.out.println("search");
        SearchableTextPane instance = new SearchableTextPane();
        instance.search("test");
    }
}

// Test.java
package ghm.follow.search;

import ghm