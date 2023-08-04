// BfTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Bf}.
* It contains ten unit test cases for the {@link Bf#bf(String, String)} method.
*/
class BfTest {

    /**
    * Test case for the {@link Bf#bf(String, String)} method.
    */
    @Test
    void testBf() {
        List<Object> result = Bf.bf("Mercury", "Venus");
        List<Object> expected = new ArrayList<Object>();
        expected.add("Earth");
        expected.add("Mars");
        expected.add("Jupiter");
        expected.add("Saturn");
        expected.add("Uranus");
        expected.add("Neptune");
        assertEquals(expected, result);
    }

    /**
    * Test case for the {@link Bf#bf(String, String)} method.
    */
    @Test
    void testBf2() {
        List<Object> result = Bf.bf("Venus", "Mercury");
        List<Object> expected = new ArrayList<Object>();
        expected.add("Earth");
        expected.add("Mars");
        expected.add("Jupiter");
        expected.add("Saturn");
        expected.add("Uranus");
        expected.add("Neptune");
        assertEquals(expected, result);
    }

    /**
    * Test case for the {@link Bf#bf(String, String)} method.
    */
    @Test
    void testBf3() {
        List<Object> result = Bf.bf("Venus", "Earth");
        List<Object> expected = new ArrayList<Object>();
        expected.add("Mars");
        expected.add("Jupiter");
        expected.add("Saturn");
        expected.add("Uranus");
        expected.add("Neptune");
        assertEquals(expected, result);
    }

    /**
    * Test case for the {@link Bf#bf(String, String)} method.
    */
    @Test
    void testBf4() {
        List<Object> result = Bf.bf("Venus", "Mars");
        List<Object> expected = new ArrayList<Object>();
        expected.add("Jupiter");
        expected.add("Saturn");
        expected.add("Uranus");
        expected.add("Neptune");
        assertEquals(expected, result);
    }

    /**
    * Test case for the {@link Bf#bf(String, String)} method.
    */
    @Test
    void testBf5() {
        List<Object> result = Bf.bf("Venus", "Jupiter");
        List<Object> expected = new ArrayList<Object>();
        expected.add("Saturn");
        expected.add("Uranus");
        expected.add("Neptune");
        assertEquals(expected, result);
    }

    /**
    * Test case for the {@link Bf#bf(String, String)} method.
    */
    @Test
    void testBf6() {
        List<Object> result = Bf.bf("Venus", "Saturn");
        List<Object> expected = new ArrayList<Object>();
        expected.add("Uranus");
        expected.add("Neptune");
        assertEquals(expected, result);
    }

    /**
    * Test case for the {@link Bf#bf(String, String)} method.
    */
    @Test
    void testBf7() {
        List<Object> result = Bf.bf("Venus", "Uranus");
        List<Object> expected = new ArrayList<Object>();
        expected.add("Neptune");
        assertEquals(expected, result);
    }

    /**
    * Test case for the {@link Bf#bf(String, String)} method.
    */
    @Test
    void testBf8() {
        List<Object> result = Bf.bf("Venus", "Neptune");
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, result);
    }

    /**
    * Test case for the {@link Bf#bf(String, String)} method.
    */
    @Test
    void testBf9() {
        List<Object> result = Bf.bf("Earth", "Mercury");
        List<Object> expected = new ArrayList<Object>();
        expected.add("Mars");
        expected.add("Jupiter");
        expected.add("Saturn");
        expected.add("Uranus");
        expected.add("Neptune");
        assertEquals(expected, result);
    }

    /**
    * Test case for the {@link Bf#bf(String, String)} method.
    */
    @Test
    void testBf10() {
        List<Object> result = Bf.bf("Earth", "Venus");
        List<Object> expected = new ArrayList<Object>();
        expected.add("Mars");
        expected.add("Jupiter");
        expected.add("Saturn");
        expected.add("Uranus");
        expected.add("Neptune");
        assertEquals(expected, result);
    }
}
