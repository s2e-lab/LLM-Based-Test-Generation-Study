package scenario2;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BfTest {

    @Test
    public void test() throws Exception{

        assertEquals(Arrays.asList("Saturn", "Uranus"), scenario2.Bf.bf("Jupiter", "Neptune"));
		assertEquals(Arrays.asList("Venus"), scenario2.Bf.bf("Earth", "Mercury"));
		assertEquals(Arrays.asList("Venus", "Earth", "Mars", "Jupiter", "Saturn"), scenario2.Bf.bf("Mercury", "Uranus"));
		assertEquals(Arrays.asList("Earth", "Mars", "Jupiter", "Saturn", "Uranus"), scenario2.Bf.bf("Neptune", "Venus"));
		assertEquals(Arrays.asList(), scenario2.Bf.bf("Earth", "Earth"));
		assertEquals(Arrays.asList(), scenario2.Bf.bf("Mars", "Earth"));
		assertEquals(Arrays.asList(), scenario2.Bf.bf("Jupiter", "Makemake"));
		
    }

}