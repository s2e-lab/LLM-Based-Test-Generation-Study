// Map_4Test.java
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
* It contains ten unit test cases for the {@link Map#gridTransform(int, int)} method.
*/
class Map_4Test {

	/**
	* Test case 1 for {@link Map#gridTransform(int, int)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = 0</li>
	* 	<li>y = 0</li>
	* </ul>
	* and the expected return value:
	* <ul>
	* 	<li>expected = new Point(0, 0)</li>
	* </ul>
	*/
	@Test
	void testGridTransform_1() {
		int x = 0;
		int y = 0;
		Point expected = new Point(0, 0);
		Point actual = Map.gridTransform(x, y);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link Map#gridTransform(int, int)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = -1</li>
	* 	<li>y = -1</li>
	* </ul>
	* and the expected return value:
	* <ul>
	* 	<li>expected = new Point(-1, -1)</li>
	* </ul>
	*/
	@Test
	void testGridTransform_2() {
		int x = -1;
		int y = -1;
		Point expected = new Point(-1, -1);
		Point actual = Map.gridTransform(x, y);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link Map#gridTransform(int, int)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = -2</li>
	* 	<li>y = -2</li>
	* </ul>
	* and the expected return value:
	* <ul>
	* 	<li>expected = new Point(-1, -1)</li>
	* </ul>
	*/
	@Test
	void testGridTransform_3() {
		int x = -2;
		int y = -2;
		Point expected = new Point(-1, -1);
		Point actual = Map.gridTransform(x, y);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link Map#gridTransform(int, int)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = -3</li>
	* 	<li>y = -3</li>
	* </ul>
	* and the expected return value:
	* <ul>
	* 	<li>expected = new Point(-1, -1)</li>
	* </ul>
	*/
	@Test
	void testGridTransform_4() {
		int x = -3;
		int y = -3;
		Point expected = new Point(-1, -1);
		Point actual = Map.gridTransform(x, y);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link Map#gridTransform(int, int)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = -4</li>
	* 	<li>y = -4</li>
	* </ul>
	* and the expected return value:
	* <ul>
	* 	<li>expected = new Point(-1, -1)</li>
	* </ul>
	*/
	@Test
	void testGridTransform_5() {
		int x = -4;
		int y = -4;
		Point expected = new Point(-1, -1);
		Point actual = Map.gridTransform(x, y);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link Map#gridTransform(int, int)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = -5</li>
	* 	<li>y = -5</li>
	* </ul>
	* and the expected return value:
	* <ul>
	* 	<li>expected = new Point(-1, -1)</li>
	* </ul>
	*/
	@Test
	void testGridTransform_6() {
		int x = -5;
		int y = -5;
		Point expected = new Point(-1, -1);
		Point actual = Map.gridTransform(x, y);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link Map#gridTransform(int, int)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = -6</li>
	* 	<li>y = -6</li>
	* </ul>
	* and the expected return value:
	* <ul>
	* 	<li>expected = new Point(-1, -1)</li>
	* </ul>
	*/
	@Test
	void testGridTransform_7() {
		int x = -6;
		int y = -6;
		Point expected = new Point(-1, -1);
		Point actual = Map.gridTransform(x, y);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link Map#gridTransform(int, int)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = -7</li>
	* 	<li>y = -7</li>
	* </ul>
	* and the expected return value:
	* <ul>
	* 	<li>expected = new Point(-1, -1)</li>
	* </ul>
	*/
	@Test
	void testGridTransform_8() {
		int x = -7;
		int y = -7;
		Point expected = new Point(-1, -1);
		Point actual = Map.gridTransform(x, y);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link Map#gridTransform(int, int)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = -8</li>
	* 	<li>y = -8</li>
	* </ul>
	* and the expected return value:
	* <ul>
	* 	<li>expected = new Point(-1, -1)</li>
	* </ul>
	*/
	@Test
	void testGridTransform_9() {
		int x = -8;
		int y = -8;
		Point expected = new Point(-1, -1);
		Point actual = Map.gridTransform(x, y);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link Map#gridTransform(int, int)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = -9</li>
	* 	<li>y = -9</li>
	* </ul>
	* and the expected return value:
	* <ul>
	* 	<li>expected = new Point(-1, -1)</li>
	* </ul>
	*/
	@Test
	void testGridTransform_10() {
		int x = -9;
		int y = -9;
		Point expected = new Point(-1, -1);
		Point actual = Map.gridTransform(x, y);
		assertEquals(expected, actual);
	}
}