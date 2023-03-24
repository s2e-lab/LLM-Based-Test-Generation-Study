// BfTest.java
package original;

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
    void testBf1() {
        List<Object> expected = new ArrayList<Object>(Arrays.asList("Saturn", "Uranus"));
        List<Object> actual = Bf.bf("Jupiter", "Neptune");
        assertEquals(expected, actual);
    }
    
    @Test
    void testBf2() {
        List<Object> expected = new ArrayList<Object>(Arrays.asList("Venus"));
        List<Object> actual = Bf.bf("Earth", "Mercury");
        assertEquals(expected, actual);
    }
    
    @Test
    void testBf3() {
        List<Object> expected = new ArrayList<Object>(Arrays.asList("Venus", "Earth", "Mars", "Jupiter", "Saturn"));
        List<Object> actual = Bf.bf("Mercury", "Uranus");
        assertEquals(expected, actual);
    }
    
    @Test
    void testBf4() {
        List<Object> expected = new ArrayList<Object>(Arrays.asList("Earth", "Mars", "Jupiter", "Saturn", "Uranus"));
        List<Object> actual = Bf.bf("Neptune", "Venus");
        assertEquals(expected, actual);
    }
    
    @Test
    void testBf5() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = Bf.bf("Earth", "Earth");
        assertEquals(expected, actual);
    }
    
    @Test
    void testBf6() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = Bf.bf("Mars", "Earth");
        assertEquals(expected, actual);
    }
    
    @Test
    void testBf7() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = Bf.bf("Jupiter", "Makemake");
        assertEquals(expected, actual);
    }
    
    @Test
    void testBf8() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = Bf.bf("Makemake", "Jupiter");
        assertEquals(expected, actual);
    }
    
    @Test
    void testBf9() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = Bf.bf("Pluto", "Mars");
        assertEquals(expected, actual);
    }
    
    @Test
    void testBf10() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = Bf.bf("Venus", "Pluto");
        assertEquals(expected, actual);
    }
}