package scenario2;


import original.TriangleArea1;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleArea1Test {
    @Test
	public void test1() throws Exception {
		assertEquals(6.0, scenario2.TriangleArea1.triangleArea(3, 4, 5));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(-1, scenario2.TriangleArea1.triangleArea(1, 2, 10));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(8.18, scenario2.TriangleArea1.triangleArea(4, 8, 5));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(1.73, scenario2.TriangleArea1.triangleArea(2, 2, 2));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(-1, scenario2.TriangleArea1.triangleArea(1, 2, 3));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(16.25, scenario2.TriangleArea1.triangleArea(10, 5, 7));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(-1, scenario2.TriangleArea1.triangleArea(2, 6, 3));
	}

	@Test
	public void test8() throws Exception {
		assertEquals(0.43, scenario2.TriangleArea1.triangleArea(1, 1, 1));
	}

	@Test
	public void test9() throws Exception {
		assertEquals(-1, scenario2.TriangleArea1.triangleArea(2, 2, 10));
	}

	
}