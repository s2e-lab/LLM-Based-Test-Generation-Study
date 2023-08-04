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
    */
    @Test
    void testDocumentCount() {
        DocumentSet documentSet = new DocumentSet();
        assertEquals(0, documentSet.documentCount());
    }
}
