// SearchableTextPane_1Test.java
package ghm.follow.search;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.plaf.ComponentUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Utilities;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchableTextPane}.
* It contains ten unit test cases for the {@link SearchableTextPane#search(String, int)} method.
*/
class SearchableTextPane_1Test {

    private static final Logger log = Logger.getLogger(SearchableTextPane_1Test.class.getName());

    /**
     * Test of {@link SearchableTextPane#search(String, int)} method, of class SearchableTextPane.
     */
    @Test
    void testSearch_String_int() {
        log.info("search");
        String term = "test";
        int startPos = 0;
        SearchableTextPane instance = new SearchableTextPane();
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link SearchableTextPane#search(String, int)} method, of class SearchableTextPane.
     */
    @Test
    void testSearch_String_int_1() {
        log.info("search");
        String term = "";
        int startPos = 0;
        SearchableTextPane instance = new SearchableTextPane();
        int expResult = -1;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link SearchableTextPane#search(String, int)} method, of class SearchableTextPane.
     */
    @Test
    void testSearch_String_int_2() {
        log.info("search");
        String term = null;
        int startPos = 0;
        SearchableTextPane instance = new SearchableTextPane();
        int expResult = -1;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link SearchableTextPane#search(String, int)} method, of class SearchableTextPane.
     */
    @Test
    void testSearch_String_int_3() {
        log.info("search");
        String term = "test";
        int startPos = 1;
        SearchableTextPane instance = new SearchableTextPane();
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link SearchableTextPane#search(String, int)} method, of class SearchableTextPane.
     */
    @Test
    void testSearch_String_int_4() {
        log.info("search");
        String term = "test";
        int startPos = 2;
        SearchableTextPane instance = new SearchableTextPane();
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link SearchableTextPane#search(String, int)} method, of class SearchableTextPane.
     */
    @Test
    void testSearch_String_int_5() {
        log.info("search");
        String term = "test";
        int startPos = 3;
        SearchableTextPane instance = new SearchableTextPane();
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link SearchableTextPane#search(String, int)} method, of class SearchableTextPane.
     */
    @Test
    void testSearch_String_int_6() {
        log.info("search");
        String term = "test";
        int startPos = 4;
        SearchableTextPane instance = new SearchableTextPane();
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link SearchableTextPane#search(String, int)} method, of class SearchableTextPane.
     */
    @Test
    void testSearch_String_int_7() {
        log.info("search");
        String term = "test";
        int startPos = 5;
        SearchableTextPane instance = new SearchableTextPane();
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link SearchableTextPane#search(String, int)} method, of class SearchableTextPane.
     */
    @Test
    void testSearch_String_int_8() {
        log.info("search");
        String term = "test";
        int startPos = 6;
        SearchableTextPane instance = new SearchableTextPane();
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link SearchableTextPane#search(String, int)} method, of class SearchableTextPane.
     */
    @Test
    void testSearch_String_int_9() {
        log.info("search");
        String term = "test";
        int startPos = 7;
        SearchableTextPane instance = new SearchableTextPane();
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link SearchableTextPane#search(String, int)} method, of class SearchableTextPane.
     */
    @Test
    void testSearch_String_int_10() {
        log.info("search");
        String term = "test";
        int startPos = 8;
        SearchableTextPane instance = new SearchableTextPane();
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }
}

// SearchableTextPane_2Test.java
package ghm.follow.search;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.plaf.ComponentUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Utilities;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchableTextPane}.
* It contains ten unit test cases for the {@link SearchableTextPane#search(String, int)} method.
*/
class SearchableTextPane_2Test {
		
    private static final Logger log = Logger.getLogger(SearchableTextPane_2Test.class.getName());

    /**
     * Test of {@link SearchableTextPane#search(String, int)} method, of class SearchableTextPane.
     */
    @Test
    void testSearch_String_int() {
        log.info("search");
        String term = "test";
        int startPos = 0;
        SearchableTextPane instance = new SearchableTextPane();
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link SearchableTextPane#search(String, int)} method, of class SearchableTextPane.
     */
    @Test
    void testSearch_String_int_1() {
        log.info("search");
        String term = "";
        int startPos = 0;
        SearchableTextPane instance = new SearchableTextPane();
        int expResult = -1;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link SearchableTextPane#search(String, int)} method, of class SearchableTextPane.
     */
    @Test
    void testSearch_String_int_2() {
        log.info("search");
        String term = null;
        int startPos = 0;
        SearchableTextPane instance = new SearchableTextPane();
        int expResult = -1;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link SearchableTextPane#search(String, int)} method, of class SearchableTextPane.
     */
    @Test
    void testSearch_String_int_3() {
        log.info("search");
        String term = "test";
        int startPos = 1;
        SearchableTextPane instance = new SearchableTextPane();
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link SearchableTextPane#search(String, int)} method, of class SearchableTextPane.
     */
    @Test
    void testSearch_String_int_4() {
        log.info("search");
        String term = "