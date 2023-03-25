package scenario1;

import java.util.ArrayList;
import java.util.List;
import original.Bf;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BfTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList("Saturn", "Uranus"), scenario1.Bf.bf("Jupiter", "Neptune"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList("Venus"), scenario1.Bf.bf("Earth", "Mercury"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList("Venus", "Earth", "Mars", "Jupiter", "Saturn"), scenario1.Bf.bf("Mercury", "Uranus"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(Arrays.asList("Earth", "Mars", "Jupiter", "Saturn", "Uranus"), scenario1.Bf.bf("Neptune", "Venus"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(Arrays.asList(), scenario1.Bf.bf("Earth", "Earth"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(Arrays.asList(), scenario1.Bf.bf("Mars", "Earth"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(Arrays.asList(), scenario1.Bf.bf("Jupiter", "Makemake"));
	}

	
}