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
        Document doc = new Document("test/data/noWhitespace.txt");
        assertEquals("This is a test document.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the method with a document that has whitespace.
    */
    @Test
    void testStringifyWithWhitespace() {
        Document doc = new Document("test/data/withWhitespace.txt");
        assertEquals("This is a test document.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the method with a document that has a lot of whitespace.
    */
    @Test
    void testStringifyWithLotsOfWhitespace() {
        Document doc = new Document("test/data/lotsOfWhitespace.txt");
        assertEquals("This is a test document.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the method with a document that has a lot of whitespace.
    */
    @Test
    void testStringifyWithLotsOfWhitespace2() {
        Document doc = new Document("test/data/lotsOfWhitespace2.txt");
        assertEquals("This is a test document.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the method with a document that has a lot of whitespace.
    */
    @Test
    void testStringifyWithLotsOfWhitespace3() {
        Document doc = new Document("test/data/lotsOfWhitespace3.txt");
        assertEquals("This is a test document.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the method with a document that has a lot of whitespace.
    */
    @Test
    void testStringifyWithLotsOfWhitespace4() {
        Document doc = new Document("test/data/lotsOfWhitespace4.txt");
        assertEquals("This is a test document.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the method with a document that has a lot of whitespace.
    */
    @Test
    void testStringifyWithLotsOfWhitespace5() {
        Document doc = new Document("test/data/lotsOfWhitespace5.txt");
        assertEquals("This is a test document.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the method with a document that has a lot of whitespace.
    */
    @Test
    void testStringifyWithLotsOfWhitespace6() {
        Document doc = new Document("test/data/lotsOfWhitespace6.txt");
        assertEquals("This is a test document.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the method with a document that has a lot of whitespace.
    */
    @Test
    void testStringifyWithLotsOfWhitespace7() {
        Document doc = new Document("test/data/lotsOfWhitespace7.txt");
        assertEquals("This is a test document.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the method with a document that has a lot of whitespace.
    */
    @Test
    void testStringifyWithLotsOfWhitespace8() {
        Document doc = new Document("test/data/lotsOfWhitespace8.txt");
        assertEquals("This is a test document.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the method with a document that has a lot of whitespace.
    */
    @Test
    void testStringifyWithLotsOfWhitespace9() {
        Document doc = new Document("test/data/lotsOfWhitespace9.txt");
        assertEquals("This is a test document.", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the method with a document that has a lot of whitespace.
    */
    @Test
    void testStringifyWithLotsOfWhitespace10() {
        Document doc = new Document("test/data/lotsOfWhitespace10.txt");
        assertEquals("This is a test document.", doc.stringify());
    }
}
