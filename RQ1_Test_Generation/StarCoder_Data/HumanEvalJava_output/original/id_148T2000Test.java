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

    /** Test case for {@link Bf#bf(String, String)}. */
    @Test
    void testBf() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("Venus");
        assertEquals(expected, Bf.bf("Earth", "Mercury"));

        expected = new ArrayList<Object>();
        expected.add("Venus");
        expected.add("Earth");
        expected.add("Mars");
        expected.add("Jupiter");
        expected.add("Saturn");
        assertEquals(expected, Bf.bf("Mercury", "Uranus"));

        expected = new ArrayList<Object>();
        expected.add("Earth");
        expected.add("Mars");
        expected.add("Jupiter");
        expected.add("Saturn");
        expected.add("Uranus");
        assertEquals(expected, Bf.bf("Neptune", "Venus"));

        expected = new ArrayList<Object>();
        assertEquals(expected, Bf.bf("Earth", "Earth"));

        expected = new ArrayList<Object>();
        assertEquals(expected, Bf.bf("Mars", "Earth"));

        expected = new ArrayList<Object>();
        assertEquals(expected, Bf.bf("Jupiter", "Makemake"));
    }
}
