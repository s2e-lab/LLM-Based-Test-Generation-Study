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
    * It tests the method with an empty document set.
    */
    @Test
    void testDocumentCountEmpty() {
        DocumentSet documentSet = new DocumentSet();
        assertEquals(0, documentSet.documentCount());
    }

    /**
    * Test case for {@link DocumentSet#documentCount()} method.
    * It tests the method with a document set containing one document.
    */
    @Test
    void testDocumentCountOne() {
        DocumentSet documentSet = new DocumentSet();
        documentSet.addDocument("document1");
        assertEquals(1, documentSet.documentCount());
    }

    /**
    * Test case for {@link DocumentSet#documentCount()} method.
    * It tests the method with a document set containing two documents.
    */
    @Test
    void testDocumentCountTwo() {
        DocumentSet documentSet = new DocumentSet();
        documentSet.addDocument("document1");
        documentSet.addDocument("document2");
        assertEquals(2, documentSet.documentCount());
    }

    /**
    * Test case for {@link DocumentSet#documentCount()} method.
    * It tests the method with a document set containing ten documents.
    */
    @Test
    void testDocumentCountTen() {
        DocumentSet documentSet = new DocumentSet();
        documentSet.addDocument("document1");
        documentSet.addDocument("document2");
        documentSet.addDocument("document3");
        documentSet.addDocument("document4");
        documentSet.addDocument("document5");
        documentSet.addDocument("document6");
        documentSet.addDocument("document7");
        documentSet.addDocument("document8");
        documentSet.addDocument("document9");
        documentSet.addDocument("document10");
        assertEquals(10, documentSet.documentCount());
    }
}
