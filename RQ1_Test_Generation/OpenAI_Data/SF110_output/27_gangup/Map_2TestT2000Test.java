// Map_2Test.java
package gui;

import static java.lang.Math.max;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Hashtable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.StreamTokenizer;
import java.io.IOException;
import java.awt.*;
import state.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Map}.
* It contains ten unit test cases for the {@link Map#pixelTransform(int, int, int)} method.
*/
class Map_2Test {

	/**
	* Test case 1 for {@link Map#pixelTransform(int, int, int)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = 0</li>
	* 	<li>y = 0</li>
	* 	<li>z = 0</li>
	* </ul>
	* and the expected output value:
	* <ul>
	* 	<li>expected = new Point(0, 0)</li>
	* </ul>
	*/
	@Test
	void test1() {
		int x = 0;
		int y = 0;
		int z = 0;
		Point expected = new Point(0, 0);
		Point actual = Map.pixelTransform(x, y, z);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link Map#pixelTransform(int, int, int)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = 1</li>
	* 	<li>y = 1</li>
	* 	<li>z = 1</li>
	* </ul>
	* and the expected output value:
	* <ul>
	* 	<li>expected = new Point(2, 0)</li>
	* </ul>
	*/
	@Test
	void test2() {
		int x = 1;
		int y = 1;
		int z = 1;
		Point expected = new Point(2, 0);
		Point actual = Map.pixelTransform(x, y, z);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link Map#pixelTransform(int, int, int)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = -1</li>
	* 	<li>y = -1</li>
	* 	<li>z = -1</li>
	* </ul>
	* and the expected output value:
	* <ul>
	* 	<li>expected = new Point(-2, 0)</li>
	* </ul>
	*/
	@Test
	void test3() {
		int x = -1;
		int y = -1;
		int z = -1;
		Point expected = new Point(-2, 0);
		Point actual = Map.pixelTransform(x, y, z);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link Map#pixelTransform(int, int, int)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = 0</li>
	* 	<li>y = 0</li>
	* 	<li>z = 1</li>
	* </ul>
	* and the expected output value:
	* <ul>
	* 	<li>expected = new Point(1, 0)</li>
	* </ul>
	*/
	@Test
	void test4() {
		int x = 0;
		int y = 0;
		int z = 1;
		Point expected = new Point(1, 0);
		Point actual = Map.pixelTransform(x, y, z);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link Map#pixelTransform(int, int, int)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = 0</li>
	* 	<li>y = 0</li>
	* 	<li>z = -1</li>
	* </ul>
	* and the expected output value:
	* <ul>
	* 	<li>expected = new Point(-1, 0)</li>
	* </ul>
	*/
	@Test
	void test5() {
		int x = 0;
		int y = 0;
		int z = -1;
		Point expected = new Point(-1, 0);
		Point actual = Map.pixelTransform(x, y, z);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link Map#pixelTransform(int, int, int)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = 1</li>
	* 	<li>y = 1</li>
	* 	<li>z = 0</li>
	* </ul>
	* and the expected output value:
	* <ul>
	* 	<li>expected = new Point(1, 1)</li>
	* </ul>
	*/
	@Test
	void test6() {
		int x = 1;
		int y = 1;
		int z = 0;
		Point expected = new Point(1, 1);
		Point actual = Map.pixelTransform(x, y, z);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link Map#pixelTransform(int, int, int)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = -1</li>
	* 	<li>y = -1</li>
	* 	<li>z = 0</li>
	* </ul>
	* and the expected output value:
	* <ul>
	* 	<li>expected = new Point(-1, -1)</li>
	* </ul>
	*/
	@Test
	void test7() {
		int x = -1;
		int y = -1;
		int z = 0;
		Point expected = new Point(-1, -1);
		Point actual = Map.pixelTransform(x, y, z);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link Map#pixelTransform(int, int, int)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = 1</li>
	* 	<li>y = 1</li>
	* 	<li>z = -1</li>
	* </ul>
	* and the expected output value:
	* <ul>
	* 	<li>expected = new Point(0, 1)</li>
	* </ul>
	*/
	@Test
	void test8() {
		int x = 1;
		int y = 1;
		int z = -1;
		Point expected = new Point(0, 1);
		Point actual = Map.pixelTransform(x, y, z);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link Map#pixelTransform(int, int, int)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = -1</li>
	* 	<li>y = -1</li>
	* 	<li>z = 1</li>
	* </ul>
	* and the expected output value:
	* <ul>
	* 	<li>expected = new Point(0, -1)</li>
	* </ul>
	*/
	@Test
	void test9() {
		int x = -1;
		int y = -1;
		int z = 1;
		Point expected = new Point(0, -1);
		Point actual = Map.pixelTransform(x, y, z);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link Map#pixelTransform(int, int, int)}.
	* It tests the method with the