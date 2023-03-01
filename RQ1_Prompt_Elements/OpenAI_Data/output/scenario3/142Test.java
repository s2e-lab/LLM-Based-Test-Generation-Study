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

	/**
	* Test case 1.
	* The input list is [1, 2, 3].
	* The expected output is 6.
	*/
	@Test
	void testSumSquares1() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		assertEquals(6, SumSquares1.sumSquares(lst));
	}
	
	/**
	* Test case 2.
	* The input list is [1, 4, 9].
	* The expected output is 14.
	*/
	@Test
	void testSumSquares2() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(4);
		lst.add(9);
		assertEquals(14, SumSquares1.sumSquares(lst));
	}
	
	/**
	* Test case 3.
	* The input list is [].
	* The expected output is 0.
	*/
	@Test
	void testSumSquares3() {
		List<Object> lst = new ArrayList<Object>();
		assertEquals(0, SumSquares1.sumSquares(lst));
	}
	
	/**
	* Test case 4.
	* The input list is [1, 1, 1, 1, 1, 1, 1, 1, 1].
	* The expected output is 9.
	*/
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
	
	/**
	* Test case 5.
	* The input list is [-1, -1, -1, -1, -1, -1, -1, -1, -1].
	* The expected output is -3.
	*/
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
	
	/**
	* Test case 6.
	* The input list is [0].
	* The expected output is 0.
	*/
	@Test
	void testSumSquares6() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(0);
		assertEquals(0, SumSquares1.sumSquares(lst));
	}
	
	/**
	* Test case 7.
	* The input list is [-1, -5, 2, -1, -5].
	* The expected output is -126.
	*/
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
	
	/**
	* Test case 8.
	* The input list is [-56, -99, 1, 0, -2].
	* The expected output is 3030.
	*/
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
	
	/**
	* Test case 9.
	* The input list is [-1, 0, 0, 0, 0, 0, 0, 0, -1].
	* The expected output is 0.
	*/
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
	
	/**
	* Test case 10.
	* The input list is [-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37].
	* The expected output is -14196.
	*/
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
}