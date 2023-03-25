package scenario2;

import java.util.List;
import original.ProdSigns;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdSignsTest {
    @Test
	public void test1() throws Exception {
		assertEquals(-9, scenario2.ProdSigns.prodSigns(Arrays.asList(1, 2, 2, -4)));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(0, scenario2.ProdSigns.prodSigns(Arrays.asList(0, 1)));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(-10, scenario2.ProdSigns.prodSigns(Arrays.asList(1, 1, 1, 2, 3, -1, 1)));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(null, scenario2.ProdSigns.prodSigns(Arrays.asList()));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(20, scenario2.ProdSigns.prodSigns(Arrays.asList(2, 4, 1, 2, -1, -1, 9)));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(4, scenario2.ProdSigns.prodSigns(Arrays.asList(-1, 1, -1, 1)));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(-4, scenario2.ProdSigns.prodSigns(Arrays.asList(-1, 1, 1, 1)));
	}

	@Test
	public void test8() throws Exception {
		assertEquals(0, scenario2.ProdSigns.prodSigns(Arrays.asList(-1, 1, 1, 0)));
	}

	
}