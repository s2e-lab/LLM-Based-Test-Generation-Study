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
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains only white spaces.
    */
    @Test
    void testAsCharArrayWithOnlyWhiteSpaces() {
        Text text = new Text("   ");
        char[] charArray = text.asCharArray();
        assertEquals(3, charArray.length);
        assertEquals(' ', charArray[0]);
        assertEquals(' ', charArray[1]);
        assertEquals(' ', charArray[2]);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains only white spaces.
    */
    @Test
    void testAsCharArrayWithOnlyWhiteSpacesAndNewLine() {
        Text text = new Text("   \n");
        char[] charArray = text.asCharArray();
        assertEquals(4, charArray.length);
        assertEquals(' ', charArray[0]);
        assertEquals(' ', charArray[1]);
        assertEquals(' ', charArray[2]);
        assertEquals('\n', charArray[3]);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains only white spaces.
    */
    @Test
    void testAsCharArrayWithOnlyWhiteSpacesAndCarriageReturn() {
        Text text = new Text("   \r");
        char[] charArray = text.asCharArray();
        assertEquals(4, charArray.length);
        assertEquals(' ', charArray[0]);
        assertEquals(' ', charArray[1]);
        assertEquals(' ', charArray[2]);
        assertEquals('\r', charArray[3]);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains only white spaces.
    */
    @Test
    void testAsCharArrayWithOnlyWhiteSpacesAndCarriageReturnAndNewLine() {
        Text text = new Text("   \r\n");
        char[] charArray = text.asCharArray();
        assertEquals(5, charArray.length);
        assertEquals(' ', charArray[0]);
        assertEquals(' ', charArray[1]);
        assertEquals(' ', charArray[2]);
        assertEquals('\r', charArray[3]);
        assertEquals('\n', charArray[4]);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains only white spaces.
    */
    @Test
    void testAsCharArrayWithOnlyWhiteSpacesAndNewLineAndCarriageReturn() {
        Text text = new Text("   \n\r");
        char[] charArray = text.asCharArray();
        assertEquals(5, charArray.length);
        assertEquals(' ', charArray[0]);
        assertEquals(' ', charArray[1]);
        assertEquals(' ', charArray[2]);
        assertEquals('\n', charArray[3]);
        assertEquals('\r', charArray[4]);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains only white spaces.
    */
    @Test
    void testAsCharArrayWithOnlyWhiteSpacesAndNewLineAndCarriageReturnAndNewLine() {
        Text text = new Text("   \n\r\n");
        char[] charArray = text.asCharArray();
        assertEquals(6, charArray.length);
        assertEquals(' ', charArray[0]);
        assertEquals(' ', charArray[1]);
        assertEquals(' ', charArray[2]);
        assertEquals('\n', charArray[3]);
        assertEquals('\r', charArray[4]);
        assertEquals('\n', charArray[5]);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains only white spaces.
    */
    @Test
    void testAsCharArrayWithOnlyWhiteSpacesAndCarriageReturnAndNewLineAndNewLine() {
        Text text = new Text("   \r\n\n");
        char[] charArray = text.asCharArray();
        assertEquals(6, charArray.length);
        assertEquals(' ', charArray[0]);
        assertEquals(' ', charArray[1]);
        assertEquals(' ', charArray[2]);
        assertEquals('\r', charArray[3]);
        assertEquals('\n', charArray[4]);
        assertEquals('\n', charArray[5]);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains only white spaces.
    */
    @Test
    void testAsCharArrayWithOnlyWhiteSpacesAndCarriageReturnAndNewLineAndNewLineAndCarriageReturn() {
        Text text = new Text("   \r\n\n\r");
        char[] charArray = text.asCharArray();
        assertEquals(7, charArray.length);
        assertEquals(' ', charArray[0]);
        assertEquals(' ', charArray[1]);
        assertEquals(' ', charArray[2]);
        assertEquals('\r', charArray[3]);
        assertEquals('\n', charArray[4]);
        assertEquals('\n', charArray[5]);
        assertEquals('\r', charArray[6]);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains only white spaces.
    */
    @Test
    void testAsCharArrayWithOnlyWhiteSpacesAndCarriageReturnAndNewLineAndNewLineAndCarriageReturnAndNewLine() {
        Text text = new Text("   \r\n\n\r\n");
        char[] charArray = text.asCharArray();
        assertEquals(8, charArray.length);
        assertEquals(' ', charArray[0]);
        assertEquals(' ', charArray[1]);
        assertEquals(' ', charArray[2]);
        assertEquals('\r', charArray[3]);
        assertEquals('\n', charArray[4]);
        assertEquals('\n', charArray[5]);
        assertEquals('\r', charArray[6]);
        assertEquals('\n', charArray[7]);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains only white spaces.
    */
    @Test
    void testAsCharArrayWithOnlyWhiteSpacesAndCarriageReturnAndNewLineAndNewLineAndCarriageReturnAndNewLineAndCarriageReturn() {
        Text text = new Text("   \r\n\n\r\n\r");
        char[] charArray = text.asCharArray();
        assertEquals(9, charArray.length);
        assertEquals(' ', charArray[0]);
        assertEquals(' ', charArray[1]);
        assertEquals(' ', charArray[2]);
        assertEquals('\r', charArray[3]);
        assertEquals('\n', charArray[4]);
        assertEquals('\n', charArray[5]);
        assertEquals('\r', charArray[6]);
        assertEquals('\n', charArray[7]);
        assertEquals('\r', charArray[8]);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains only white spaces.
    */
    @Test
    void testAsCharArrayWithOnlyWhiteSpacesAndCarriageReturnAndNewLineAndNewLineAndCarriageReturnAndNewLineAndCarriageReturnAndNewLine() {
        Text text = new Text("   \r\n\n\r\n\r\n");
        char[] charArray = text.asCharArray();
        assertEquals(10, charArray.length);
        assertEquals(' ', charArray[0]);
        assertEquals(' ', charArray[1]);
        assertEquals(' ', charArray[2]);
        assertEquals('\r', charArray[3]);
        assertEquals('\n', charArray[4]);
        assertEquals('\n', charArray[5]);
        assertEquals('\r', charArray[6]);
        assertEquals('\n', charArray[7]);
        assertEquals('\r', charArray[8]);
        assertEquals('\n', charArray[9]);
    }
}
