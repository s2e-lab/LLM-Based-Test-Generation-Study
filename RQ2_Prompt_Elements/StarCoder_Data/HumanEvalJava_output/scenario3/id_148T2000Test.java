// BfTest.java
package scenario3;

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
     * Tests that the method returns an empty list if the first planet is not
     * in the solar system.
     */
    @Test
    void testBf1() {
        List<Object> actual = Bf.bf("Mars", "Earth");
        assertTrue(actual.isEmpty());
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * Tests that the method returns an empty list if the second planet is not
     * in the solar system.
     */
    @Test
    void testBf2() {
        List<Object> actual = Bf.bf("Earth", "Mars");
        assertTrue(actual.isEmpty());
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * Tests that the method returns an empty list if the first planet is the
     * same as the second planet.
     */
    @Test
    void testBf3() {
        List<Object> actual = Bf.bf("Earth", "Earth");
        assertTrue(actual.isEmpty());
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * Tests that the method returns the correct list if the first planet is
     * the closest to the sun and the second planet is the furthest from the sun.
     */
    @Test
    void testBf4() {
        List<Object> actual = Bf.bf("Mercury", "Uranus");
        List<Object> expected = List.of("Venus", "Earth", "Mars", "Jupiter", "Saturn");
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * Tests that the method returns the correct list if the first planet is
     * the furthest from the sun and the second planet is the closest to the sun.
     */
    @Test
    void testBf5() {
        List<Object> actual = Bf.bf("Uranus", "Mercury");
        List<Object> expected = List.of("Venus", "Earth", "Mars", "Jupiter", "Saturn");
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * Tests that the method returns the correct list if the first planet is
     * the closest to the sun and the second planet is the second closest to the sun.
     */
    @Test
    void testBf6() {
        List<Object> actual = Bf.bf("Mercury", "Venus");
        List<Object> expected = List.of("Venus");
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * Tests that the method returns the correct list if the first planet is
     * the second closest to the sun and the second planet is the closest to the sun.
     */
    @Test
    void testBf7() {
        List<Object> actual = Bf.bf("Venus", "Mercury");
        List<Object> expected = List.of("Venus");
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * Tests that the method returns the correct list if the first planet is
     * the closest to the sun and the second planet is the third closest to the sun.
     */
    @Test
    void testBf8() {
        List<Object> actual = Bf.bf("Mercury", "Earth");
        List<Object> expected = List.of("Venus");
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * Tests that the method returns the correct list if the first planet is
     * the third closest to the sun and the second planet is the closest to the sun.
     */
    @Test
    void testBf9() {
        List<Object> actual = Bf.bf("Earth", "Mercury");
        List<Object> expected = List.of("Venus");
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * Tests that the method returns the correct list if the first planet is
     * the closest to the sun and the second planet is the fourth closest to the sun.
     */
    @Test
    void testBf10() {
        List<Object> actual = Bf.bf("Mercury", "Mars");
        List<Object> expected = List.of("Venus");
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * Tests that the method returns the correct list if the first planet is
     * the fourth closest to the sun and the second planet is the closest to the sun.
     */
    @Test
    void testBf11() {
        List<Object> actual = Bf.bf("Mars", "Mercury");
        List<Object> expected = List.of("Venus");
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * Tests that the method returns the correct list if the first planet is
     * the closest to the sun and the second planet is the fifth closest to the sun.
     */
    @Test
    void testBf12() {
        List<Object> actual = Bf.bf("Mercury", "Jupiter");
        List<Object> expected = List.of("Venus", "Earth", "Mars");
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * Tests that the method returns the correct list if the first planet is
     * the fifth closest to the sun and the second planet is the closest to the sun.
     */
    @Test
    void testBf13() {
        List<Object> actual = Bf.bf("Jupiter", "Mercury");
        List<Object> expected = List.of("Venus", "Earth", "Mars");
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * Tests that the method returns the correct list if the first planet is
     * the closest to the sun and the second planet is the sixth closest to the sun.
     */
    @Test
    void testBf14() {
        List<Object> actual = Bf.bf("Mercury", "Saturn");
        List<Object> expected = List.of("Venus", "Earth", "Mars", "Jupiter");
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * Tests that the method returns the correct list if the first planet is
     * the sixth closest to the sun and the second planet is the closest to the sun.
     */
    @Test
    void testBf15() {
        List<Object> actual = Bf.bf("Saturn", "Mercury");
        List<Object> expected = List.of("Venus", "Earth", "Mars", "Jupiter");
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * Tests that the method returns the correct list if the first planet is
     * the closest to the sun and the second planet is the seventh closest to the sun.
     */
    @Test
    void testBf16() {
        List<Object> actual = Bf.bf("Mercury", "Uranus");
        List<Object> expected = List.of("Venus", "Earth", "Mars", "Jupiter", "Saturn");
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * Tests that the method returns the correct list if the first planet is
     * the seventh closest to the sun and the second planet is the closest to the sun.
     */
    @Test
    void testBf17() {
        List<Object> actual = Bf.bf("Uranus", "Mercury");
        List<Object> expected = List.of("Venus", "Earth", "Mars", "Jupiter", "Saturn");
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Bf#bf(String, String)} method.
     * Tests that the method returns the correct list if the first planet is
     * the closest to the sun and the second planet is the eighth closest to the sun.
     */
    @Test
    void testBf18() {
        List<Object> actual = Bf.bf("Mercury", "Neptune");
        List<Object> expected = List.of("Venus", "Earth", "