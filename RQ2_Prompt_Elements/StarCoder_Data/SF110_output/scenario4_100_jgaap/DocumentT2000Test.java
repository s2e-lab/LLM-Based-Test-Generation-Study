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
    * It tests the method with a document that has no whitespace.
    */
    @Test
    void testStringifyNoWhitespace() {
        Document doc = new Document("test.txt");
        doc.readText("test.txt");
        doc.procText = doc.getProcessedText();
        assertEquals("This is a test document.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the method with a document that has whitespace.
    */
    @Test
    void testStringifyWithWhitespace() {
        Document doc = new Document("test.txt");
        doc.readText("test.txt");
        doc.procText = doc.getProcessedText();
        assertEquals("This is a test document.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the method with a document that has no whitespace.
    */
    @Test
    void testStringifyNoWhitespaceWithAuthor() {
        Document doc = new Document("test.txt", "Test Author");
        doc.readText("test.txt");
        doc.procText = doc.getProcessedText();
        assertEquals("This is a test document.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the method with a document that has whitespace.
    */
    @Test
    void testStringifyWithWhitespaceWithAuthor() {
        Document doc = new Document("test.txt", "Test Author");
        doc.readText("test.txt");
        doc.procText = doc.getProcessedText();
        assertEquals("This is a test document.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the method with a document that has no whitespace.
    */
    @Test
    void testStringifyNoWhitespaceWithAuthorAndSize() {
        Document doc = new Document("test.txt", "Test Author");
        doc.readText("test.txt");
        doc.procText = doc.getProcessedText();
        assertEquals("This is a test document.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the method with a document that has whitespace.
    */
    @Test
    void testStringifyWithWhitespaceWithAuthorAndSize() {
        Document doc = new Document("test.txt", "Test Author");
        doc.readText("test.txt");
        doc.procText = doc.getProcessedText();
        assertEquals("This is a test document.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the method with a document that has no whitespace.
    */
    @Test
    void testStringifyNoWhitespaceWithAuthorAndSizeAndText() {
        Document doc = new Document("test.txt", "Test Author");
        doc.readText("test.txt");
        doc.procText = doc.getProcessedText();
        assertEquals("This is a test document.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the method with a document that has whitespace.
    */
    @Test
    void testStringifyWithWhitespaceWithAuthorAndSizeAndText() {
        Document doc = new Document("test.txt", "Test Author");
        doc.readText("test.txt");
        doc.procText = doc.getProcessedText();
        assertEquals("This is a test document.", doc.stringify());
    }
}
