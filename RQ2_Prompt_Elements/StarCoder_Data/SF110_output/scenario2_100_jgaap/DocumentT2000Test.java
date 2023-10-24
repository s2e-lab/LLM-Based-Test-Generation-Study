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
        doc.procText.addElement((int) 'a');
        doc.procText.addElement((int) 'b');
        doc.procText.addElement((int) 'c');
        assertEquals("abc", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case when the document is not empty.
    */
    @Test
    void testStringifyNotEmpty2() {
        Document doc = new Document();
        doc.procText.addElement((int) 'a');
        doc.procText.addElement((int) 'b');
        doc.procText.addElement((int) 'c');
        doc.procText.addElement((int) 'd');
        assertEquals("abcd", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case when the document is not empty.
    */
    @Test
    void testStringifyNotEmpty3() {
        Document doc = new Document();
        doc.procText.addElement((int) 'a');
        doc.procText.addElement((int) 'b');
        doc.procText.addElement((int) 'c');
        doc.procText.addElement((int) 'd');
        doc.procText.addElement((int) 'e');
        assertEquals("abcde", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case when the document is not empty.
    */
    @Test
    void testStringifyNotEmpty4() {
        Document doc = new Document();
        doc.procText.addElement((int) 'a');
        doc.procText.addElement((int) 'b');
        doc.procText.addElement((int) 'c');
        doc.procText.addElement((int) 'd');
        doc.procText.addElement((int) 'e');
        doc.procText.addElement((int) 'f');
        assertEquals("abcdef", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case when the document is not empty.
    */
    @Test
    void testStringifyNotEmpty5() {
        Document doc = new Document();
        doc.procText.addElement((int) 'a');
        doc.procText.addElement((int) 'b');
        doc.procText.addElement((int) 'c');
        doc.procText.addElement((int) 'd');
        doc.procText.addElement((int) 'e');
        doc.procText.addElement((int) 'f');
        doc.procText.addElement((int) 'g');
        assertEquals("abcdefg", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case when the document is not empty.
    */
    @Test
    void testStringifyNotEmpty6() {
        Document doc = new Document();
        doc.procText.addElement((int) 'a');
        doc.procText.addElement((int) 'b');
        doc.procText.addElement((int) 'c');
        doc.procText.addElement((int) 'd');
        doc.procText.addElement((int) 'e');
        doc.procText.addElement((int) 'f');
        doc.procText.addElement((int) 'g');
        doc.procText.addElement((int) 'h');
        assertEquals("abcdefgh", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case when the document is not empty.
    */
    @Test
    void testStringifyNotEmpty7() {
        Document doc = new Document();
        doc.procText.addElement((int) 'a');
        doc.procText.addElement((int) 'b');
        doc.procText.addElement((int) 'c');
        doc.procText.addElement((int) 'd');
        doc.procText.addElement((int) 'e');
        doc.procText.addElement((int) 'f');
        doc.procText.addElement((int) 'g');
        doc.procText.addElement((int) 'h');
        doc.procText.addElement((int) 'i');
        assertEquals("abcdefghi", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case when the document is not empty.
    */
    @Test
    void testStringifyNotEmpty8() {
        Document doc = new Document();
        doc.procText.addElement((int) 'a');
        doc.procText.addElement((int) 'b');
        doc.procText.addElement((int) 'c');
        doc.procText.addElement((int) 'd');
        doc.procText.addElement((int) 'e');
        doc.procText.addElement((int) 'f');
        doc.procText.addElement((int) 'g');
        doc.procText.addElement((int) 'h');
        doc.procText.addElement((int) 'i');
        doc.procText.addElement((int) 'j');
        assertEquals("abcdefghij", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case when the document is not empty.
    */
    @Test
    void testStringifyNotEmpty9() {
        Document doc = new Document();
        doc.procText.addElement((int) 'a');
        doc.procText.addElement((int) 'b');
        doc.procText.addElement((int) 'c');
        doc.procText.addElement((int) 'd');
        doc.procText.addElement((int) 'e');
        doc.procText.addElement((int) 'f');
        doc.procText.addElement((int) 'g');
        doc.procText.addElement((int) 'h');
        doc.procText.addElement((int) 'i');
        doc.procText.addElement((int) 'j');
        doc.procText.addElement((int) 'k');
        assertEquals("abcdefghijk", doc.stringify());
    }

    /**
    * Test case for {@link Document#stringify()} method.
    * It tests the case when the document is not empty.
    */
    @Test
    void testStringifyNotEmpty10() {
        Document doc = new Document();
        doc.procText.addElement((int) 'a');
        doc.procText.addElement((int) 'b');
        doc.procText.addElement((int) 'c');
        doc.procText.addElement((int) 'd');
        doc.procText.addElement((int) 'e');
        doc.procText.addElement((int) 'f');
        doc.procText.addElement((int) 'g');
        doc.procText.addElement((int) 'h');
        doc.procText.addElement((int) 'i');
        doc.procText.addElement((int) 'j');
        doc.procText.addElement((int) 'k');
        doc.procText.addElement((int) 'l');
        assertEquals("abcdefghijkl", doc.stringify());
    }
}
