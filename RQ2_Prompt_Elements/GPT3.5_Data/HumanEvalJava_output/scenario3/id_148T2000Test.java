// Bf.java
package scenario3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Bf {

    /**
     * * There are eight planets in our solar system: the closest to the Sun
     * is Mercury, the next one is Venus, then Earth, Mars, Jupiter, Saturn,
     * Uranus, Neptune.
     * Write a function that takes two planet names as strings planet1 and planet2.
     * The function should return a tuple containing all planets whose orbits are
     * located between the orbit of planet1 and the orbit of planet2, sorted by
     * the proximity to the sun.
     * The function should return an empty tuple if planet1 or planet2
     * are not correct planet names.
     * Examples
     * bf("Jupiter", "Neptune") ==> ("Saturn", "Uranus")
     * bf("Earth", "Mercury") ==> ("Venus")
     * bf("Mercury", "Uranus") ==> ("Venus", "Earth", "Mars", "Jupiter", "Saturn")
     *
     * > bf("Jupiter", "Neptune")
     * ["Saturn", "Uranus"]
     * > bf("Earth", "Mercury")
     * ["Venus"]
     * > bf("Mercury", "Uranus")
     * ["Venus", "Earth", "Mars", "Jupiter", "Saturn"]
     * > bf("Neptune", "Venus")
     * ["Earth", "Mars", "Jupiter", "Saturn", "Uranus"]
     * > bf("Earth", "Earth")
     * []
     * > bf("Mars", "Earth")
     * []
     * > bf("Jupiter", "Makemake")
     * []
     */
    public static List<String> bf(String planet1, String planet2) {
        List<String> planets = Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
        List<String> result = new ArrayList<>();
        int index1 = planets.indexOf(planet1);
        int index2 = planets.indexOf(planet2);
        if (index1 == -1 || index2 == -1 || index1 == index2) {
            return result;
        }
        int start = Math.min(index1, index2);
        int end = Math.max(index1, index2);
        for (int i = start + 1; i < end; i++) {
            result.add(planets.get(i));
        }
        return result;
    }
}

// BfTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Bf}.
* It contains ten unit test cases for the {@link Bf#bf(String, String)} method.
*/
class BfTest {

    @Test
    void testBf1() {
        List<String> expected = Arrays.asList("Saturn", "Uranus");
        List<String> actual = Bf.bf("Jupiter", "Neptune");
        assertEquals(expected, actual);
    }

    @Test
    void testBf2() {
        List<String> expected = Arrays.asList("Venus");
        List<String> actual = Bf.bf("Earth", "Mercury");
        assertEquals(expected, actual);
    }

    @Test
    void testBf3() {
        List<String> expected = Arrays.asList("Venus", "Earth", "Mars", "Jupiter", "Saturn");
        List<String> actual = Bf.bf("Mercury", "Uranus");
        assertEquals(expected, actual);
    }

    @Test
    void testBf4() {
        List<String> expected = Arrays.asList("Earth", "Mars", "Jupiter", "Saturn", "Uranus");
        List<String> actual = Bf.bf("Neptune", "Venus");
        assertEquals(expected, actual);
    }

    @Test
    void testBf5() {
        List<String> expected = Arrays.asList();
        List<String> actual = Bf.bf("Earth", "Earth");
        assertEquals(expected, actual);
    }

    @Test
    void testBf6() {
        List<String> expected = Arrays.asList();
        List<String> actual = Bf.bf("Mars", "Earth");
        assertEquals(expected, actual);
    }

    @Test
    void testBf7() {
        List<String> expected = Arrays.asList();
        List<String> actual = Bf.bf("Jupiter", "Makemake");
        assertEquals(expected, actual);
    }

    @Test
    void testBf8() {
        List<String> expected = Arrays.asList();
        List<String> actual = Bf.bf("Makemake", "Jupiter");
        assertEquals(expected, actual);
    }

    @Test
    void testBf9() {
        List<String> expected = Arrays.asList();
        List<String> actual = Bf.bf("Pluto", "Mars");
        assertEquals(expected, actual);
    }

    @Test
    void testBf10() {
        List<String> expected = Arrays.asList();
        List<String> actual = Bf.bf("Mars", "Pluto");
        assertEquals(expected, actual);
    }
}