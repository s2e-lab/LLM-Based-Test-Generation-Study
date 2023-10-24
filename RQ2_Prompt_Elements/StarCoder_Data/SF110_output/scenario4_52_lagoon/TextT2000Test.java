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
        assertEquals(text.getValue().length(), charArray.length);
        assertEquals(text.getValue(), new String(charArray));
    }

    /**
    * Test method for {@link Text#asCharArray()}.
    */
    @Test
    void testAsCharArray2() {
        Text text = new Text("test");
        char[] charArray = text.asCharArray();
        assertEquals(text.getValue().length(), charArray.length);
        assertEquals(text.getValue(), new String(charArray));
    }

    /**
    * Test method for {@link Text#asCharArray()}.
    */
    @Test
    void testAsCharArray3() {
        Text text = new Text("test");
        char[] charArray = text.asCharArray();
        assertEquals(text.getValue().length(), charArray.length);
        assertEquals(text.getValue(), new String(charArray));
    }

    /**
    * Test method for {@link Text#asCharArray()}.
    */
    @Test
    void testAsCharArray4() {
        Text text = new Text("test");
        char[] charArray = text.asCharArray();
        assertEquals(text.getValue().length(), charArray.length);
        assertEquals(text.getValue(), new String(charArray));
    }

    /**
    * Test method for {@link Text#asCharArray()}.
    */
    @Test
    void testAsCharArray5() {
        Text text = new Text("test");
        char[] charArray = text.asCharArray();
        assertEquals(text.getValue().length(), charArray.length);
        assertEquals(text.getValue(), new String(charArray));
    }

    /**
    * Test method for {@link Text#asCharArray()}.
    */
    @Test
    void testAsCharArray6() {
        Text text = new Text("test");
        char[] charArray = text.asCharArray();
        assertEquals(text.getValue().length(), charArray.length);
        assertEquals(text.getValue(), new String(charArray));
    }

    /**
    * Test method for {@link Text#asCharArray()}.
    */
    @Test
    void testAsCharArray7() {
        Text text = new Text("test");
        char[] charArray = text.asCharArray();
        assertEquals(text.getValue().length(), charArray.length);
        assertEquals(text.getValue(), new String(charArray));
    }

    /**
    * Test method for {@link Text#asCharArray()}.
    */
    @Test
    void testAsCharArray8() {
        Text text = new Text("test");
        char[] charArray = text.asCharArray();
        assertEquals(text.getValue().length(), charArray.length);
        assertEquals(text.getValue(), new String(charArray));
    }

    /**
    * Test method for {@link Text#asCharArray()}.
    */
    @Test
    void testAsCharArray9() {
        Text text = new Text("test");
        char[] charArray = text.asCharArray();
        assertEquals(text.getValue().length(), charArray.length);
        assertEquals(text.getValue(), new String(charArray));
    }

    /**
    * Test method for {@link Text#asCharArray()}.
    */
    @Test
    void testAsCharArray10() {
        Text text = new Text("test");
        char[] charArray = text.asCharArray();
        assertEquals(text.getValue().length(), charArray.length);
        assertEquals(text.getValue(), new String(charArray));
    }
}
