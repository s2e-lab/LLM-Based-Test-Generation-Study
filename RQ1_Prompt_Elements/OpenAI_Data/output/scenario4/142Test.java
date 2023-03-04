// SumSquares1Test.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares1}.
* It contains ten unit test cases for the {@link SumSquares1#sumSquares(List)} method.
*/
class SumSquares1Test {

	@Test
	void testSumSquares1() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		assertEquals(6, SumSquares1.sumSquares(lst));
	}
	
	@Test
	void testSumSquares2() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(4);
		lst.add(9);
		assertEquals(14, SumSquares1.sumSquares(lst));
	}
	
	@Test
	void testSumSquares3() {
		List<Object> lst = new ArrayList<Object>();
		assertEquals(0, SumSquares1.sumSquares(lst));
	}
	
	@Test
	void testSumSquares4() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(1);
		lst.add(1);
		lst.add(1);
		lst.add(1);
		lst.add(1);
		lst.add(1);
		lst.add(1);
		lst.add(1);
		assertEquals(9, SumSquares1.sumSquares(lst));
	}
	
	@Test
	void testSumSquares5() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		assertEquals(-3, SumSquares1.sumSquares(lst));
	}
	
	@Test
	void testSumSquares6() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(0);
		assertEquals(0, SumSquares1.sumSquares(lst));
	}
	
	@Test
	void testSumSquares7() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-1);
		lst.add(-5);
		lst.add(2);
		lst.add(-1);
		lst.add(-5);
		assertEquals(-126, SumSquares1.sumSquares(lst));
	}
	
	@Test
	void testSumSquares8() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-56);
		lst.add(-99);
		lst.add(1);
		lst.add(0);
		lst.add(-2);
		assertEquals(3030, SumSquares1.sumSquares(lst));
	}
	
	@Test
	void testSumSquares9() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-1);
		lst.add(0);
		lst.add(0);
		lst.add(0);
		lst.add(0);
		lst.add(0);
		lst.add(0);
		lst.add(0);
		lst.add(-1);
		assertEquals(0, SumSquares1.sumSquares(lst));
	}
	
	@Test
	void testSumSquares10() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-16);
		lst.add(-9);
		lst.add(-2);
		lst.add(36);
		lst.add(36);
		lst.add(26);
		lst.add(-20);
		lst.add(25);
		lst.add(-40);
		lst.add(20);
		lst.add(-4);
		lst.add(12);
		lst.add(-26);
		lst.add(35);
		lst.add(37);
		assertEquals(-14196, SumSquares1.sumSquares(lst));
	}
	
	@Test
	void testSumSquares11() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-1);
		lst.add(-3);
		lst.add(17);
		lst.add(-1);
		lst.add(-15);
		lst.add(13);
		lst.add(-1);
		lst.add(14);
		lst.add(-14);
		lst.add(-12);
		lst.add(-5);
		lst.add(14);
		lst.add(-14);
		lst.add(6);
		lst.add(13);
		lst.add(11);
		lst.add(16);
		lst.add(16);
		lst.add(4);
		lst.add(10);
		assertEquals(-1448, SumSquares1.sumSquares(lst));
	}
}