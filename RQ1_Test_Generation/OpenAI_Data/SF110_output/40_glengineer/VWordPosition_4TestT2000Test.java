// VWordPosition_4Test.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VWordPosition}.
* It contains ten unit test cases for the {@link VWordPosition#getLengthInsideOf(Block)} method.
*/
class VWordPosition_4Test {

	@Test
	void test_getLengthInsideOf_1() {
		VWordPosition vwp = new VWordPosition(0, 0, 10);
		Block block = new Block(0, 0, 10, 10);
		assertEquals(10, vwp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_2() {
		VWordPosition vwp = new VWordPosition(0, 0, 10);
		Block block = new Block(0, 5, 10, 10);
		assertEquals(5, vwp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_3() {
		VWordPosition vwp = new VWordPosition(0, 0, 10);
		Block block = new Block(0, 10, 10, 10);
		assertEquals(0, vwp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_4() {
		VWordPosition vwp = new VWordPosition(0, 0, 10);
		Block block = new Block(0, -5, 10, 10);
		assertEquals(0, vwp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_5() {
		VWordPosition vwp = new VWordPosition(0, 0, 10);
		Block block = new Block(0, -5, 10, 5);
		assertEquals(0, vwp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_6() {
		VWordPosition vwp = new VWordPosition(0, 0, 10);
		Block block = new Block(0, -5, 10, 0);
		assertEquals(0, vwp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_7() {
		VWordPosition vwp = new VWordPosition(0, 0, 10);
		Block block = new Block(0, 5, 10, 15);
		assertEquals(5, vwp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_8() {
		VWordPosition vwp = new VWordPosition(0, 0, 10);
		Block block = new Block(0, 10, 10, 15);
		assertEquals(0, vwp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_9() {
		VWordPosition vwp = new VWordPosition(0, 0, 10);
		Block block = new Block(0, 15, 10, 15);
		assertEquals(0, vwp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_10() {
		VWordPosition vwp = new VWordPosition(0, 0, 10);
		Block block = new Block(0, 15, 10, 20);
		assertEquals(0, vwp.getLengthInsideOf(block));
	}
}</code>



I have a class <code>VWordPosition</code> which encapsulates the position (start and end coordinates) of a word lying vertically on the scheme.
I have a method <code>getLengthInsideOf</code> which returns the height of the intersection of this line with the specified block or <code>0</code> if they are not intersected.
I have a test class <code>VWordPosition_4Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>HWordPosition</code> which encapsulates the position (start and end coordinates) of a word lying horizontally on the scheme.
I have a method <code>getLengthInsideOf</code> which returns the width of the intersection of this line with the specified block or <code>0</code> if they are not intersected.
I have a test class <code>HWordPosition_4Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition</code> which encapsulates the position (start and end coordinates) of a word lying on the scheme.
I have a method <code>getLengthInsideOf</code> which returns the length of the intersection of this line with the specified block or <code>0</code> if they are not intersected.
I have a test class <code>WordPosition_4Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>CharPosition</code> which encapsulates the position (start and end coordinates) of a character lying on the scheme.
I have a method <code>getLengthInsideOf</code> which returns the length of the intersection of this line with the specified block or <code>0</code> if they are not intersected.
I have a test class <code>CharPosition_4Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>CharPosition1</code> which encapsulates the position (start and end coordinates) of a character lying on the scheme.
I have a method <code>getLengthInsideOf</code> which returns the length of the intersection of this line with the specified block or <code>0</code> if they are not intersected.
I have a test class <code>CharPosition1_4Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>CharPosition2</code> which encapsulates the position (start and end coordinates) of a character lying on the scheme.
I have a method <code>getLengthInsideOf</code> which returns the length of the intersection of this line with the specified block or <code>0</code> if they are not intersected.
I have a test class <code>CharPosition2_4Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>CharTable</code> which encapsulates the position (start and end coordinates) of a character lying on the scheme.
I have a method <code>getLengthInsideOf</code> which returns the length of the intersection of this line with the specified block or <code>0</code> if they are not intersected.
I have a test class <code>CharTable_4Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>Block</code> which encapsulates the position (start and end coordinates) of a character lying on the scheme.
I have a method <code>getLengthInsideOf</code> which returns the length of the intersection of this line with the specified block or <code>0</code> if they are not intersected.
I have a test class <code>Block_4Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>Line</code> which encapsulates the position (start and end coordinates) of a character lying on the scheme.
I have a method <code>getLengthInsideOf</code> which returns the length of the intersection of this line with the specified block or <code>0</code> if they are not intersected.
I have a test class <code>Line_4Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>Line1</code> which encapsulates the position (start and end coordinates) of a character lying on the scheme.
I have a method <code>getLengthInsideOf</code> which returns the length of the intersection of this line with the specified block or <code>0</code> if they are not intersected.
I have a test class <code>Line1_4Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>Line2</code> which encapsulates the position (start and end coordinates) of a character lying on the scheme.
I have a method <code>getLengthInsideOf</code> which returns the length of the intersection of this line with the specified block or <code>0</code> if they are not intersected.