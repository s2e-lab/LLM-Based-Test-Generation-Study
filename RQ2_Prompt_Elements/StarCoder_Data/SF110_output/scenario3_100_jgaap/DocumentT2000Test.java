// DocumentTest.java


import java.io.*;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Document}.
* It contains ten unit test cases for the {@link Document#stringify()} method.
*/
class DocumentTest {

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case when the document is empty.
    */
    @Test
    void testStringifyEmpty() {
        Document doc = new Document();
        assertEquals("", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case when the document is not empty.
    */
    @Test
    void testStringifyNotEmpty() {
        Document doc = new Document();
        doc.add("This is a test.");
        assertEquals("This is a test.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case when the document is not empty.
    */
    @Test
    void testStringifyMultiple() {
        Document doc = new Document();
        doc.add("This is a test.");
        doc.add("This is another test.");
        assertEquals("This is a test.\nThis is another test.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case when the document is not empty.
    */
    @Test
    void testStringifyMultipleWithNewlines() {
        Document doc = new Document();
        doc.add("This is a test.");
        doc.add("This is another test.");
        doc.add("This is a third test.");
        assertEquals("This is a test.\nThis is another test.\nThis is a third test.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case when the document is not empty.
    */
    @Test
    void testStringifyMultipleWithNewlinesAndSpaces() {
        Document doc = new Document();
        doc.add("This is a test.");
        doc.add("This is another test.");
        doc.add("This is a third test.");
        doc.add("This is a fourth test.");
        assertEquals("This is a test.\nThis is another test.\nThis is a third test.\nThis is a fourth test.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case when the document is not empty.
    */
    @Test
    void testStringifyMultipleWithNewlinesAndSpacesAndTabs() {
        Document doc = new Document();
        doc.add("This is a test.");
        doc.add("This is another test.");
        doc.add("This is a third test.");
        doc.add("This is a fourth test.");
        doc.add("This is a fifth test.");
        assertEquals("This is a test.\nThis is another test.\nThis is a third test.\nThis is a fourth test.\nThis is a fifth test.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case when the document is not empty.
    */
    @Test
    void testStringifyMultipleWithNewlinesAndSpacesAndTabsAndNewlines() {
        Document doc = new Document();
        doc.add("This is a test.");
        doc.add("This is another test.");
        doc.add("This is a third test.");
        doc.add("This is a fourth test.");
        doc.add("This is a fifth test.");
        doc.add("This is a sixth test.");
        assertEquals("This is a test.\nThis is another test.\nThis is a third test.\nThis is a fourth test.\nThis is a fifth test.\nThis is a sixth test.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case when the document is not empty.
    */
    @Test
    void testStringifyMultipleWithNewlinesAndSpacesAndTabsAndNewlinesAndSpaces() {
        Document doc = new Document();
        doc.add("This is a test.");
        doc.add("This is another test.");
        doc.add("This is a third test.");
        doc.add("This is a fourth test.");
        doc.add("This is a fifth test.");
        doc.add("This is a sixth test.");
        doc.add("This is a seventh test.");
        assertEquals("This is a test.\nThis is another test.\nThis is a third test.\nThis is a fourth test.\nThis is a fifth test.\nThis is a sixth test.\nThis is a seventh test.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case when the document is not empty.
    */
    @Test
    void testStringifyMultipleWithNewlinesAndSpacesAndTabsAndNewlinesAndSpacesAndTabs() {
        Document doc = new Document();
        doc.add("This is a test.");
        doc.add("This is another test.");
        doc.add("This is a third test.");
        doc.add("This is a fourth test.");
        doc.add("This is a fifth test.");
        doc.add("This is a sixth test.");
        doc.add("This is a seventh test.");
        doc.add("This is an eighth test.");
        assertEquals("This is a test.\nThis is another test.\nThis is a third test.\nThis is a fourth test.\nThis is a fifth test.\nThis is a sixth test.\nThis is a seventh test.\nThis is an eighth test.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case when the document is not empty.
    */
    @Test
    void testStringifyMultipleWithNewlinesAndSpacesAndTabsAndNewlinesAndSpacesAndTabsAndNewlines() {
        Document doc = new Document();
        doc.add("This is a test.");
        doc.add("This is another test.");
        doc.add("This is a third test.");
        doc.add("This is a fourth test.");
        doc.add("This is a fifth test.");
        doc.add("This is a sixth test.");
        doc.add("This is a seventh test.");
        doc.add("This is an eighth test.");
        doc.add("This is a ninth test.");
        assertEquals("This is a test.\nThis is another test.\nThis is a third test.\nThis is a fourth test.\nThis is a fifth test.\nThis is a sixth test.\nThis is a seventh test.\nThis is an eighth test.\nThis is a ninth test.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case when the document is not empty.
    */
    @Test
    void testStringifyMultipleWithNewlinesAndSpacesAndTabsAndNewlinesAndSpacesAndTabsAndNewlinesAndSpaces() {
        Document doc = new Document();
        doc.add("This is a test.");
        doc.add("This is another test.");
        doc.add("This is a third test.");
        doc.add("This is a fourth test.");
        doc.add("This is a fifth test.");
        doc.add("This is a sixth test.");
        doc.add("This is a seventh test.");
        doc.add("This is an eighth test.");
        doc.add("This is a ninth test.");
        doc.add("This is a tenth test.");
        assertEquals("This is a test.\nThis is another test.\nThis is a third test.\nThis is a fourth test.\nThis is a fifth test.\nThis is a sixth test.\nThis is a seventh test.\nThis is an eighth test.\nThis is a ninth test.\nThis is a tenth test.", doc.stringify());
    }
}

// Document.java
import java.io.*;
import java.util.Vector;

/**
 *   Code for storing and processing individual documents of any type.
 */
public class Document {

    /**
     * Convert processed document into one really long string.
     * I'm not quite sure yet why this ever would need to be done.
     */
    public String stringify() {
        String result = "";
        for (int i = 0; i < contents.size(); i++) {
            result += contents.get(i);
        }
        return result;
    }

    /**
     * Add a string to the document.
     */
    public void add(String s) {
        contents.add(s);
    }

    /**
     * Vector of strings that make up the document.
     */
    private Vector<String> contents = new Vector<String>();
}

// DocumentTest.java


import java.io.*;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Document}.
* It contains ten unit test cases for the {@link Document#stringify()} method.
*/
class DocumentTest {
		
    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case