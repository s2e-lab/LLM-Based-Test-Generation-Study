// Map_3Test.java
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
* It contains ten unit test cases for the {@link Map#worldTransform(float, float)} method.
*/
class Map_3Test {

	/**
	* Test case 1 for {@link Map#worldTransform(float, float)}.
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
	void testWorldTransform_1() {
		float x = 0;
		float y = 0;
		Point expected = new Point(0, 0);
		Point actual = Map.worldTransform(x, y);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link Map#worldTransform(float, float)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = 1</li>
	* 	<li>y = 1</li>
	* </ul>
	* and the expected return value:
	* <ul>
	* 	<li>expected = new Point(8, 4)</li>
	* </ul>
	*/
	@Test
	void testWorldTransform_2() {
		float x = 1;
		float y = 1;
		Point expected = new Point(8, 4);
		Point actual = Map.worldTransform(x, y);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link Map#worldTransform(float, float)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = -1</li>
	* 	<li>y = -1</li>
	* </ul>
	* and the expected return value:
	* <ul>
	* 	<li>expected = new Point(-8, -4)</li>
	* </ul>
	*/
	@Test
	void testWorldTransform_3() {
		float x = -1;
		float y = -1;
		Point expected = new Point(-8, -4);
		Point actual = Map.worldTransform(x, y);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link Map#worldTransform(float, float)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = 0</li>
	* 	<li>y = 1</li>
	* </ul>
	* and the expected return value:
	* <ul>
	* 	<li>expected = new Point(0, 4)</li>
	* </ul>
	*/
	@Test
	void testWorldTransform_4() {
		float x = 0;
		float y = 1;
		Point expected = new Point(0, 4);
		Point actual = Map.worldTransform(x, y);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link Map#worldTransform(float, float)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = 1</li>
	* 	<li>y = 0</li>
	* </ul>
	* and the expected return value:
	* <ul>
	* 	<li>expected = new Point(8, 0)</li>
	* </ul>
	*/
	@Test
	void testWorldTransform_5() {
		float x = 1;
		float y = 0;
		Point expected = new Point(8, 0);
		Point actual = Map.worldTransform(x, y);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link Map#worldTransform(float, float)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = -1</li>
	* 	<li>y = 0</li>
	* </ul>
	* and the expected return value:
	* <ul>
	* 	<li>expected = new Point(-8, 0)</li>
	* </ul>
	*/
	@Test
	void testWorldTransform_6() {
		float x = -1;
		float y = 0;
		Point expected = new Point(-8, 0);
		Point actual = Map.worldTransform(x, y);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link Map#worldTransform(float, float)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = 0</li>
	* 	<li>y = -1</li>
	* </ul>
	* and the expected return value:
	* <ul>
	* 	<li>expected = new Point(0, -4)</li>
	* </ul>
	*/
	@Test
	void testWorldTransform_7() {
		float x = 0;
		float y = -1;
		Point expected = new Point(0, -4);
		Point actual = Map.worldTransform(x, y);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link Map#worldTransform(float, float)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = 1</li>
	* 	<li>y = -1</li>
	* </ul>
	* and the expected return value:
	* <ul>
	* 	<li>expected = new Point(8, -4)</li>
	* </ul>
	*/
	@Test
	void testWorldTransform_8() {
		float x = 1;
		float y = -1;
		Point expected = new Point(8, -4);
		Point actual = Map.worldTransform(x, y);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link Map#worldTransform(float, float)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = -1</li>
	* 	<li>y = 1</li>
	* </ul>
	* and the expected return value:
	* <ul>
	* 	<li>expected = new Point(-8, 4)</li>
	* </ul>
	*/
	@Test
	void testWorldTransform_9() {
		float x = -1;
		float y = 1;
		Point expected = new Point(-8, 4);
		Point actual = Map.worldTransform(x, y);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link Map#worldTransform(float, float)}.
	* It tests the method with the following input values:
	* <ul>
	* 	<li>x = -1</li>
	* 	<li>y = -1</li>
	* </ul>
	* and the expected return value:
	* <ul>
	* 	<li>expected = new Point(-8, -4)</li>
	* </ul>
	*/
	@Test
	void testWorldTransform_10() {
		float x = -1;
		float y = -1;
		Point expected = new Point(-8, -4);
		Point actual = Map.worldTransform(x, y);
		assertEquals(expected, actual);
	}
}