// BfTest.java
package scenario2;

import java.util.ArrayList;
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
    void testBfWithCorrectPlanets() {
        List<Object> expected = new ArrayList<Object>(Arrays.asList("Venus", "Earth", "Mars"));
        List<Object> actual = Bf.bf("Venus", "Mars");
        assertEquals(expected, actual);
    }

    @Test
    void testBfWithSamePlanets() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = Bf.bf("Earth", "Earth");
        assertEquals(expected, actual);
    }

    @Test
    void testBfWithIncorrectPlanet1() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = Bf.bf("Pluto", "Mars");
        assertEquals(expected, actual);
    }

    @Test
    void testBfWithIncorrectPlanet2() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = Bf.bf("Venus", "Pluto");
        assertEquals(expected, actual);
    }

    @Test
    void testBfWithIncorrectPlanets() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = Bf.bf("Pluto", "Uranus");
        assertEquals(expected, actual);
    }

    @Test
    void testBfWithPlanetsInReverseOrder() {
        List<Object> expected = new ArrayList<Object>(Arrays.asList("Venus", "Earth", "Mars"));
        List<Object> actual = Bf.bf("Mars", "Venus");
        assertEquals(expected, actual);
    }

    @Test
    void testBfWithPlanetsInRandomOrder() {
        List<Object> expected = new ArrayList<Object>(Arrays.asList("Venus", "Earth", "Mars"));
        List<Object> actual = Bf.bf("Mars", "Venus");
        assertEquals(expected, actual);
    }

    @Test
    void testBfWithPlanetsNotInOrder() {
        List<Object> expected = new ArrayList<Object>(Arrays.asList("Venus", "Earth", "Mars"));
        List<Object> actual = Bf.bf("Mars", "Venus");
        assertEquals(expected, actual);
    }

    @Test
    void testBfWithPlanetsNotInList() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = Bf.bf("Pluto", "Ceres");
        assertEquals(expected, actual);
    }

    @Test
    void testBfWithPlanetsInListButNotInOrder() {
        List<Object> expected = new ArrayList<Object>(Arrays.asList("Venus", "Earth", "Mars"));
        List<Object> actual = Bf.bf("Mars", "Venus");
        assertEquals(expected, actual);
    }
}