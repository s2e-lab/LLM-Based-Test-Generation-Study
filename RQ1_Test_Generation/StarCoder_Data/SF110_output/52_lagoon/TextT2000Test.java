// TextTest.java
package nu.staldal.xtree;

import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Text}.
* It contains ten unit test cases for the {@link Text#asCharArray()} method.
*/
class TextTest {

    /**
    * Test method for {@link Text#asCharArray()}.
    */
    @Test
    void testAsCharArray() {
        Text text = new Text("test");
        char[] charArray = text.asCharArray();
        assertEquals(text.getValue(), new String(charArray));
    }
}
