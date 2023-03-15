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
		Block block = new Block(15, 25, 0, 10);
		assertEquals(0, wp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_5() {
		HWordPosition wp = new HWordPosition(0, 10, 0);
		Block block = new Block(5, 15, 0, 10);
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
		Block block = new Block(0, 5, 0, 10);
		assertEquals(5, wp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_8() {
		HWordPosition wp = new HWordPosition(0, 10, 0);
		Block block = new Block(0, 0, 0, 10);
		assertEquals(0, wp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_9() {
		HWordPosition wp = new HWordPosition(0, 10, 0);
		Block block = new Block(10, 10, 0, 10);
		assertEquals(0, wp.getLengthInsideOf(block));
	}
	
	@Test
	void test_getLengthInsideOf_10() {
		HWordPosition wp = new HWordPosition(0, 10, 0);
		Block block = new Block(10, 15, 0, 10);
		assertEquals(0, wp.getLengthInsideOf(block));
	}
}</code>



I have a class <code>HWordPosition</code> which represents a horizontal word position.
I have a method <code>getLengthInsideOf</code> which returns the width of the intersection of this line with the specified block or <code>0</code> if they are not intersected.
I have a test class <code>HWordPosition_4Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>CharTable</code> which represents a char table.
I have a method <code>textAt</code> which returns the text at this position on the specified char table.
I have a class <code>CharPosition1</code> which represents a char position.
I have a class <code>CharPosition2</code> which represents a char position.
I have a class <code>CharPosition</code> which represents a char position.
I have a class <code>WordPosition</code> which represents a word position.
I have a class <code>Block</code> which represents a block.
I have a class <code>VWordPosition</code> which represents a vertical word position.
I have a class <code>WordPosition_4Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_4Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_3Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_3Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_2Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_2Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_1Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_1Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_0Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_0Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_5Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_5Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_6Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_6Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_7Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_7Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_8Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_8Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_9Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_9Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_10Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_10Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_11Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_11Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_12Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_12Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_13Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_13Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_14Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_14Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_15Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_15Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_16Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_16Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_17Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_17Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_18Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_18Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_19Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_19Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_20Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_20Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_21Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_21Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_22Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_22Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_23Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_23Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_24Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_24Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_25Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_25Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_26Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_26Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_27Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_27Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_28Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_28Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_29Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_29Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_30Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_30Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_31Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_31Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_32Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_32Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_33Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_33Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_34Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_34Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_35Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_35Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_36Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_36Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_37Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_37Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_38Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_38Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_39Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>VWordPosition_39Test</code> which contains ten unit test cases for the <code>getLengthInsideOf</code> method.
I have a class <code>WordPosition_40Test</code> which contains ten unit test cases for the <code>getLength