// BfTest.java
package original;


import java.util.ArrayList;
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
        List<String> expected = new ArrayList<String>();
        expected.add("Saturn");
        expected.add("Uranus");
        List<String> actual = Bf.bf("Jupiter", "Neptune");
        assertEquals(expected, actual);
    }
    
    @Test
    void testBf2() {
        List<String> expected = new ArrayList<String>();
        expected.add("Venus");
        List<String> actual = Bf.bf("Earth", "Mercury");
        assertEquals(expected, actual);
    }
    
    @Test
    void testBf3() {
        List<String> expected = new ArrayList<String>();
        expected.add("Venus");
        expected.add("Earth");
        expected.add("Mars");
        expected.add("Jupiter");
        expected.add("Saturn");
        List<String> actual = Bf.bf("Mercury", "Uranus");
        assertEquals(expected, actual);
    }
    
    @Test
    void testBf4() {
        List<String> expected = new ArrayList<String>();
        expected.add("Earth");
        expected.add("Mars");
        expected.add("Jupiter");
        expected.add("Saturn");
        expected.add("Uranus");
        List<String> actual = Bf.bf("Neptune", "Venus");
        assertEquals(expected, actual);
    }
    
    @Test
    void testBf5() {
        List<String> expected = new ArrayList<String>();
        List<String> actual = Bf.bf("Earth", "Earth");
        assertEquals(expected, actual);
    }
    
    @Test
    void testBf6() {
        List<String> expected = new ArrayList<String>();
        List<String> actual = Bf.bf("Mars", "Earth");
        assertEquals(expected, actual);
    }
    
    @Test
    void testBf7() {
        List<String> expected = new ArrayList<String>();
        List<String> actual = Bf.bf("Jupiter", "Makemake");
        assertEquals(expected, actual);
    }
    
    @Test
    void testBf8() {
        List<String> expected = new ArrayList<String>();
        List<String> actual = Bf.bf("Makemake", "Jupiter");
        assertEquals(expected, actual);
    }
    
    @Test
    void testBf9() {
        List<String> expected = new ArrayList<String>();
        expected.add("Venus");
        expected.add("Earth");
        expected.add("Mars");
        expected.add("Jupiter");
        expected.add("Saturn");
        expected.add("Uranus");
        expected.add("Neptune");
        List<String> actual = Bf.bf("Mercury", "Neptune");
        assertEquals(expected, actual);
    }
    
    @Test
    void testBf10() {
        List<String> expected = new ArrayList<String>();
        expected.add("Neptune");
        expected.add("Uranus");
        expected.add("Saturn");
        expected.add("Jupiter");
        expected.add("Mars");
        expected.add("Earth");
        expected.add("Venus");
        expected.add("Mercury");
        List<String> actual = Bf.bf("Neptune", "Mercury");
        assertEquals(expected, actual);
    }
}