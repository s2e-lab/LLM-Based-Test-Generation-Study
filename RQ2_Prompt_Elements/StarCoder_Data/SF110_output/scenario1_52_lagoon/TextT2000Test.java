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
    void testAsCharArrayWithOnlyWhiteSpacesAndCarriageReturnAndNewLineAndTab() {
        Text text = new Text("   \r\n\t");
        char[] charArray = text.asCharArray();
        assertEquals(6, charArray.length);
        assertEquals(' ', charArray[0]);
        assertEquals(' ', charArray[1]);
        assertEquals(' ', charArray[2]);
        assertEquals('\r', charArray[3]);
        assertEquals('\n', charArray[4]);
        assertEquals('\t', charArray[5]);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains only white spaces.
    */
    @Test
    void testAsCharArrayWithOnlyWhiteSpacesAndCarriageReturnAndNewLineAndTabAndNewLine() {
        Text text = new Text("   \r\n\t\n");
        char[] charArray = text.asCharArray();
        assertEquals(7, charArray.length);
        assertEquals(' ', charArray[0]);
        assertEquals(' ', charArray[1]);
        assertEquals(' ', charArray[2]);
        assertEquals('\r', charArray[3]);
        assertEquals('\n', charArray[4]);
        assertEquals('\t', charArray[5]);
        assertEquals('\n', charArray[6]);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains only white spaces.
    */
    @Test
    void testAsCharArrayWithOnlyWhiteSpacesAndCarriageReturnAndNewLineAndTabAndNewLineAndCarriageReturn() {
        Text text = new Text("   \r\n\t\r");
        char[] charArray = text.asCharArray();
        assertEquals(7, charArray.length);
        assertEquals(' ', charArray[0]);
        assertEquals(' ', charArray[1]);
        assertEquals(' ', charArray[2]);
        assertEquals('\r', charArray[3]);
        assertEquals('\n', charArray[4]);
        assertEquals('\t', charArray[5]);
        assertEquals('\r', charArray[6]);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains only white spaces.
    */
    @Test
    void testAsCharArrayWithOnlyWhiteSpacesAndCarriageReturnAndNewLineAndTabAndNewLineAndCarriageReturnAndNewLine() {
        Text text = new Text("   \r\n\t\r\n");
        char[] charArray = text.asCharArray();
        assertEquals(8, charArray.length);
        assertEquals(' ', charArray[0]);
        assertEquals(' ', charArray[1]);
        assertEquals(' ', charArray[2]);
        assertEquals('\r', charArray[3]);
        assertEquals('\n', charArray[4]);
        assertEquals('\t', charArray[5]);
        assertEquals('\r', charArray[6]);
        assertEquals('\n', charArray[7]);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains only white spaces.
    */
    @Test
    void testAsCharArrayWithOnlyWhiteSpacesAndCarriageReturnAndNewLineAndTabAndNewLineAndCarriageReturnAndNewLineAndTab() {
        Text text = new Text("   \r\n\t\r\n\t");
        char[] charArray = text.asCharArray();
        assertEquals(9, charArray.length);
        assertEquals(' ', charArray[0]);
        assertEquals(' ', charArray[1]);
        assertEquals(' ', charArray[2]);
        assertEquals('\r', charArray[3]);
        assertEquals('\n', charArray[4]);
        assertEquals('\t', charArray[5]);
        assertEquals('\r', charArray[6]);
        assertEquals('\n', charArray[7]);
        assertEquals('\t', charArray[8]);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains only white spaces.
    */
    @Test
    void testAsCharArrayWithOnlyWhiteSpacesAndCarriageReturnAndNewLineAndTabAndNewLineAndCarriageReturnAndNewLineAndTabAndNewLine() {
        Text text = new Text("   \r\n\t\r\n\t\n");
        char[] charArray = text.asCharArray();
        assertEquals(10, charArray.length);
        assertEquals(' ', charArray[0]);
        assertEquals(' ', charArray[1]);
        assertEquals(' ', charArray[2]);
        assertEquals('\r', charArray[3]);
        assertEquals('\n', charArray[4]);
        assertEquals('\t', charArray[5]);
        assertEquals('\r', charArray[6]);
        assertEquals('\n', charArray[7]);
        assertEquals('\t', charArray[8]);
        assertEquals('\n', charArray[9]);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains only white spaces.
    */
    @Test
    void testAsCharArrayWithOnlyWhiteSpacesAndCarriageReturnAndNewLineAndTabAndNewLineAndCarriageReturnAndNewLineAndTabAndNewLineAndCarriageReturn() {
        Text text = new Text("   \r\n\t\r\n\t\r");
        char[] charArray = text.asCharArray();
        assertEquals(10, charArray.length);
        assertEquals(' ', charArray[0]);
        assertEquals(' ', charArray[1]);
        assertEquals(' ', charArray[2]);
        assertEquals('\r', charArray[3]);
        assertEquals('\n', charArray[4]);
        assertEquals('\t', charArray[5]);
        assertEquals('\r', charArray[6]);
        assertEquals('\n', charArray[7]);
        assertEquals('\t', charArray[8]);
        assertEquals('\r', charArray[9]);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains only white spaces.
    */
    @Test
    void testAsCharArrayWithOnlyWhiteSpacesAndCarriageReturnAndNewLineAndTabAndNewLineAndCarriageReturnAndNewLineAndTabAndNewLineAndCarriageReturnAndNewLine() {
        Text text = new Text("   \r\n\t\r\n\t\r\n");
        char[] charArray = text.asCharArray();
        assertEquals(11, charArray.length);
        assertEquals(' ', charArray[0]);
        assertEquals(' ', charArray[1]);
        assertEquals(' ', charArray[2]);
        assertEquals('\r', charArray[3]);
        assertEquals('\n', charArray[4]);
        assertEquals('\t', charArray[5]);
        assertEquals('\r', charArray[6]);
        assertEquals('\n', charArray[7]);
        assertEquals('\t', charArray[8]);
        assertEquals('\r', charArray[9]);
        assertEquals('\n', charArray[10]);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains only white spaces.
    */
    @Test
    void testAsCharArrayWithOnlyWhiteSpacesAndCarriageReturnAndNewLineAndTabAndNewLineAndCarriageReturnAndNewLineAndTabAndNewLineAndCarriageReturnAndNewLineAndTab() {
        Text text = new Text("   \r\n\t\r\n\t