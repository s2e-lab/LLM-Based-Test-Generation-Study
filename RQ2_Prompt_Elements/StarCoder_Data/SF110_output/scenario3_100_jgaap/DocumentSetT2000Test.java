// DocumentSetTest.java


import java.util.Vector;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DocumentSet}.
* It contains ten unit test cases for the {@link DocumentSet#documentCount()} method.
*/
class DocumentSetTest {

    /**
    * Test case for {@link DocumentSet#documentCount()} method.
    * It tests the case when the document set is empty.
    */
    @Test
    void testDocumentCountEmpty() {
        DocumentSet documentSet = new DocumentSet();
        assertEquals(0, documentSet.documentCount());
    }

    /**
    * Test case for {@link DocumentSet#documentCount()} method.
    * It tests the case when the document set contains one document.
    */
    @Test
    void testDocumentCountOne() {
        DocumentSet documentSet = new DocumentSet();
        documentSet.addDocument("1");
        assertEquals(1, documentSet.documentCount());
    }

    /**
    * Test case for {@link DocumentSet#documentCount()} method.
    * It tests the case when the document set contains two documents.
    */
    @Test
    void testDocumentCountTwo() {
        DocumentSet documentSet = new DocumentSet();
        documentSet.addDocument("1");
        documentSet.addDocument("2");
        assertEquals(2, documentSet.documentCount());
    }

    /**
    * Test case for {@link DocumentSet#documentCount()} method.
    * It tests the case when the document set contains three documents.
    */
    @Test
    void testDocumentCountThree() {
        DocumentSet documentSet = new DocumentSet();
        documentSet.addDocument("1");
        documentSet.addDocument("2");
        documentSet.addDocument("3");
        assertEquals(3, documentSet.documentCount());
    }

    /**
    * Test case for {@link DocumentSet#documentCount()} method.
    * It tests the case when the document set contains four documents.
    */
    @Test
    void testDocumentCountFour() {
        DocumentSet documentSet = new DocumentSet();
        documentSet.addDocument("1");
        documentSet.addDocument("2");
        documentSet.addDocument("3");
        documentSet.addDocument("4");
        assertEquals(4, documentSet.documentCount());
    }

    /**
    * Test case for {@link DocumentSet#documentCount()} method.
    * It tests the case when the document set contains five documents.
    */
    @Test
    void testDocumentCountFive() {
        DocumentSet documentSet = new DocumentSet();
        documentSet.addDocument("1");
        documentSet.addDocument("2");
        documentSet.addDocument("3");
        documentSet.addDocument("4");
        documentSet.addDocument("5");
        assertEquals(5, documentSet.documentCount());
    }

    /**
    * Test case for {@link DocumentSet#documentCount()} method.
    * It tests the case when the document set contains six documents.
    */
    @Test
    void testDocumentCountSix() {
        DocumentSet documentSet = new DocumentSet();
        documentSet.addDocument("1");
        documentSet.addDocument("2");
        documentSet.addDocument("3");
        documentSet.addDocument("4");
        documentSet.addDocument("5");
        documentSet.addDocument("6");
        assertEquals(6, documentSet.documentCount());
    }

    /**
    * Test case for {@link DocumentSet#documentCount()} method.
    * It tests the case when the document set contains seven documents.
    */
    @Test
    void testDocumentCountSeven() {
        DocumentSet documentSet = new DocumentSet();
        documentSet.addDocument("1");
        documentSet.addDocument("2");
        documentSet.addDocument("3");
        documentSet.addDocument("4");
        documentSet.addDocument("5");
        documentSet.addDocument("6");
        documentSet.addDocument("7");
        assertEquals(7, documentSet.documentCount());
    }

    /**
    * Test case for {@link DocumentSet#documentCount()} method.
    * It tests the case when the document set contains eight documents.
    */
    @Test
    void testDocumentCountEight() {
        DocumentSet documentSet = new DocumentSet();
        documentSet.addDocument("1");
        documentSet.addDocument("2");
        documentSet.addDocument("3");
        documentSet.addDocument("4");
        documentSet.addDocument("5");
        documentSet.addDocument("6");
        documentSet.addDocument("7");
        documentSet.addDocument("8");
        assertEquals(8, documentSet.documentCount());
    }

    /**
    * Test case for {@link DocumentSet#documentCount()} method.
    * It tests the case when the document set contains nine documents.
    */
    @Test
    void testDocumentCountNine() {
        DocumentSet documentSet = new DocumentSet();
        documentSet.addDocument("1");
        documentSet.addDocument("2");
        documentSet.addDocument("3");
        documentSet.addDocument("4");
        documentSet.addDocument("5");
        documentSet.addDocument("6");
        documentSet.addDocument("7");
        documentSet.addDocument("8");
        documentSet.addDocument("9");
        assertEquals(9, documentSet.documentCount());
    }

    /**
    * Test case for {@link DocumentSet#documentCount()} method.
    * It tests the case when the document set contains ten documents.
    */
    @Test
    void testDocumentCountTen() {
        DocumentSet documentSet = new DocumentSet();
        documentSet.addDocument("1");
        documentSet.addDocument("2");
        documentSet.addDocument("3");
        documentSet.addDocument("4");
        documentSet.addDocument("5");
        documentSet.addDocument("6");
        documentSet.addDocument("7");
        documentSet.addDocument("8");
        documentSet.addDocument("9");
        documentSet.addDocument("10");
        assertEquals(10, documentSet.documentCount());
    }
}
