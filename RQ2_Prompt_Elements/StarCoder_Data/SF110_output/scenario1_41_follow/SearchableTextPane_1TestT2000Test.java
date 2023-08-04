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

    @Test
    void testSearch_1() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 0;
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    @Test
    void testSearch_2() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 1;
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    @Test
    void testSearch_3() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 2;
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    @Test
    void testSearch_4() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 3;
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    @Test
    void testSearch_5() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 4;
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    @Test
    void testSearch_6() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 5;
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    @Test
    void testSearch_7() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 6;
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    @Test
    void testSearch_8() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 7;
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    @Test
    void testSearch_9() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 8;
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    @Test
    void testSearch_10() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 9;
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

    @Test
    void testSearch_1() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 0;
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    @Test
    void testSearch_2() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 1;
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    @Test
    void testSearch_3() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 2;
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    @Test
    void testSearch_4() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 3;
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    @Test
    void testSearch_5() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 4;
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    @Test
    void testSearch_6() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 5;
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    @Test
    void testSearch_7() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 6;
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    @Test
    void testSearch_8() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 7;
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    @Test
    void testSearch_9() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 8;
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }

    @Test
    void testSearch_10() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 9;
        int expResult = 0;
        int result = instance.search(term, startPos);
        assertEquals(expResult, result);
    }
}

// SearchableTextPane_3Test.java
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
class SearchableTextPane_3Test {
		
    private static final Logger log = Logger.getLogger(SearchableTextPane_3Test.class.getName());

    @Test
    void testSearch_1() {
        SearchableTextPane instance = new SearchableTextPane();
        String term = "test";
        int startPos = 0;
        int expResult = 0;