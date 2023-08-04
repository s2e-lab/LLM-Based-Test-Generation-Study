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
    * It tests the method with a text node that contains a single character.
    */
    @Test
    void testAsCharArraySingleChar() {
        Text text = new Text("a");
        char[] expected = {'a'};
        char[] actual = text.asCharArray();
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains a single character.
    */
    @Test
    void testAsCharArrayMultipleChars() {
        Text text = new Text("abc");
        char[] expected = {'a', 'b', 'c'};
        char[] actual = text.asCharArray();
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains a single character.
    */
    @Test
    void testAsCharArrayEmpty() {
        Text text = new Text("");
        char[] expected = {};
        char[] actual = text.asCharArray();
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains a single character.
    */
    @Test
    void testAsCharArrayNull() {
        Text text = new Text(null);
        char[] expected = {};
        char[] actual = text.asCharArray();
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link Text#asCharArray()} method.
    * It tests the method with a text node that contains a single character.
    */
    @Test
    void testAsCharArrayNullContent() {
        Text text = new Text(null);
        char[] expected = {};
        char[] actual = text.asCharArray();
        assertArrayEquals(expected, actual);
    }
}
