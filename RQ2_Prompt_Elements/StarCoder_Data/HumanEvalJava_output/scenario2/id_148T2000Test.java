// BfTest.java
package scenario2;

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
     * It tests the case when the first planet is not in the list.
     */
    @Test
    void testBf1() {
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, Bf.bf("Pluto", "Venus"));
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * It tests the case when the second planet is not in the list.
     */
    @Test
    void testBf2() {
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, Bf.bf("Mercury", "Pluto"));
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * It tests the case when the first planet is the same as the second planet.
     */
    @Test
    void testBf3() {
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, Bf.bf("Mercury", "Mercury"));
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * It tests the case when the first planet is the closest to the Sun.
     */
    @Test
    void testBf4() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("Mercury");
        expected.add("Venus");
        expected.add("Earth");
        assertEquals(expected, Bf.bf("Mercury", "Venus"));
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * It tests the case when the second planet is the closest to the Sun.
     */
    @Test
    void testBf5() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("Mercury");
        expected.add("Venus");
        expected.add("Earth");
        assertEquals(expected, Bf.bf("Venus", "Mercury"));
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * It tests the case when the first planet is the furthest from the Sun.
     */
    @Test
    void testBf6() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("Neptune");
        expected.add("Uranus");
        expected.add("Saturn");
        expected.add("Jupiter");
        expected.add("Mars");
        expected.add("Earth");
        expected.add("Venus");
        expected.add("Mercury");
        assertEquals(expected, Bf.bf("Mercury", "Neptune"));
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * It tests the case when the second planet is the furthest from the Sun.
     */
    @Test
    void testBf7() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("Neptune");
        expected.add("Uranus");
        expected.add("Saturn");
        expected.add("Jupiter");
        expected.add("Mars");
        expected.add("Earth");
        expected.add("Venus");
        expected.add("Mercury");
        assertEquals(expected, Bf.bf("Neptune", "Mercury"));
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * It tests the case when the first planet is the second planet.
     */
    @Test
    void testBf8() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("Mercury");
        expected.add("Venus");
        expected.add("Earth");
        expected.add("Mars");
        expected.add("Jupiter");
        expected.add("Saturn");
        expected.add("Uranus");
        expected.add("Neptune");
        assertEquals(expected, Bf.bf("Mercury", "Neptune"));
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * It tests the case when the second planet is the first planet.
     */
    @Test
    void testBf9() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("Mercury");
        expected.add("Venus");
        expected.add("Earth");
        expected.add("Mars");
        expected.add("Jupiter");
        expected.add("Saturn");
        expected.add("Uranus");
        expected.add("Neptune");
        assertEquals(expected, Bf.bf("Neptune", "Mercury"));
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * It tests the case when the first planet is the third planet.
     */
    @Test
    void testBf10() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("Venus");
        expected.add("Earth");
        expected.add("Mars");
        expected.add("Jupiter");
        expected.add("Saturn");
        expected.add("Uranus");
        expected.add("Neptune");
        assertEquals(expected, Bf.bf("Mercury", "Venus"));
    }
}
