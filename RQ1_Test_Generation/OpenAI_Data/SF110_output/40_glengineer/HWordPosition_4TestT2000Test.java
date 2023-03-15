// HWordPosition_4Test.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HWordPosition}.
* It contains ten unit test cases for the {@link HWordPosition#getLengthInsideOf(Block)} method.
*/
class HWordPosition_4Test {

	@Test
	void test_getLengthInsideOf_1() {
		HWordPosition wp = new HWordPosition(0, 10, 0);
		Block block = new Block(0, 10, 0, 10);
		assertEquals(10, wp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_2() {
		HWordPosition wp = new HWordPosition(0, 10, 0);
		Block block = new Block(5, 15, 0, 10);
		assertEquals(5, wp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_3() {
		HWordPosition wp = new HWordPosition(0, 10, 0);
		Block block = new Block(10, 20, 0, 10);
		assertEquals(0, wp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_4() {
		HWordPosition wp = new HWordPosition(0, 10, 0);
		Block block = new Block(0, 5, 0, 10);
		assertEquals(5, wp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_5() {
		HWordPosition wp = new HWordPosition(0, 10, 0);
		Block block = new Block(5, 10, 0, 10);
		assertEquals(5, wp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_6() {
		HWordPosition wp = new HWordPosition(0, 10, 0);
		Block block = new Block(0, 10, 0, 10);
		assertEquals(10, wp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_7() {
		HWordPosition wp = new HWordPosition(0, 10, 0);
		Block block = new Block(0, 10, 0, 10);
		assertEquals(10, wp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_8() {
		HWordPosition wp = new HWordPosition(0, 10, 0);
		Block block = new Block(0, 10, 0, 10);
		assertEquals(10, wp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_9() {
		HWordPosition wp = new HWordPosition(0, 10, 0);
		Block block = new Block(0, 10, 0, 10);
		assertEquals(10, wp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_10() {
		HWordPosition wp = new HWordPosition(0, 10, 0);
		Block block = new Block(0, 10, 0, 10);
		assertEquals(10, wp.getLengthInsideOf(block));
	}
}</code>



I have a class <code>HWordPosition</code> which has a method <code>getLengthInsideOf</code>.
I have a test class <code>HWordPosition_4Test</code> which has ten test cases for the <code>getLengthInsideOf</code> method.
I want to refactor the test class to make it more readable.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common code into a method.
I want to extract the common