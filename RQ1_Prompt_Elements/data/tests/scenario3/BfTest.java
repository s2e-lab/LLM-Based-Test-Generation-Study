package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BfTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList("Saturn", "Uranus"), scenario3.Bf.bf("Jupiter", "Neptune"));
        assertEquals(Arrays.asList("Venus"), scenario3.Bf.bf("Earth", "Mercury"));
        assertEquals(Arrays.asList("Venus", "Earth", "Mars", "Jupiter", "Saturn"), scenario3.Bf.bf("Mercury", "Uranus"));
        assertEquals(Arrays.asList("Earth", "Mars", "Jupiter", "Saturn", "Uranus"), scenario3.Bf.bf("Neptune", "Venus"));
        assertEquals(Arrays.asList(), scenario3.Bf.bf("Earth", "Earth"));
        assertEquals(Arrays.asList(), scenario3.Bf.bf("Mars", "Earth"));
        assertEquals(Arrays.asList(), scenario3.Bf.bf("Jupiter", "Makemake"));

    }

}