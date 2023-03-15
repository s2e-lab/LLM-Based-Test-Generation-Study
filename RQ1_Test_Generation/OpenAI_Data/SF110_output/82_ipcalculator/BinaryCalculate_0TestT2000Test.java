// BinaryCalculate_0Test.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains ten unit test cases for the {@link BinaryCalculate#addBinary(String, String)} method.
*/
class BinaryCalculate_0Test {

	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* Test case for the addition of two binary numbers.
	*/
	@Test
	void testAddBinary() {
		BinaryCalculate binaryCalculate = new BinaryCalculate();
		assertEquals("11", binaryCalculate.addBinary("10", "01"));
		assertEquals("11", binaryCalculate.addBinary("01", "10"));
		assertEquals("10", binaryCalculate.addBinary("01", "01"));
		assertEquals("100", binaryCalculate.addBinary("10", "10"));
		assertEquals("101", binaryCalculate.addBinary("10", "11"));
		assertEquals("101", binaryCalculate.addBinary("11", "10"));
		assertEquals("110", binaryCalculate.addBinary("11", "11"));
		assertEquals("1101", binaryCalculate.addBinary("101", "10"));
		assertEquals("1101", binaryCalculate.addBinary("10", "101"));
		assertEquals("1110", binaryCalculate.addBinary("101", "11"));
		assertEquals("1110", binaryCalculate.addBinary("11", "101"));
		assertEquals("1111", binaryCalculate.addBinary("101", "101"));
		assertEquals("11111", binaryCalculate.addBinary("1011", "101"));
		assertEquals("11111", binaryCalculate.addBinary("101", "1011"));
		assertEquals("11110", binaryCalculate.addBinary("1011", "11"));
		assertEquals("11110", binaryCalculate.addBinary("11", "1011"));
		assertEquals("11101", binaryCalculate.addBinary("1011", "10"));
		assertEquals("11101", binaryCalculate.addBinary("10", "1011"));
		assertEquals("11100", binaryCalculate.addBinary("1011", "1"));
		assertEquals("11100", binaryCalculate.addBinary("1", "1011"));
		assertEquals("11011", binaryCalculate.addBinary("101", "101"));
		assertEquals("11010", binaryCalculate.addBinary("101", "10"));
		assertEquals("11010", binaryCalculate.addBinary("10", "101"));
		assertEquals("11001", binaryCalculate.addBinary("101", "1"));
		assertEquals("11001", binaryCalculate.addBinary("1", "101"));
		assertEquals("11000", binaryCalculate.addBinary("101", "0"));
		assertEquals("11000", binaryCalculate.addBinary("0", "101"));
		assertEquals("1011", binaryCalculate.addBinary("10", "1"));
		assertEquals("1011", binaryCalculate.addBinary("1", "10"));
		assertEquals("1010", binaryCalculate.addBinary("10", "0"));
		assertEquals("1010", binaryCalculate.addBinary("0", "10"));
		assertEquals("1001", binaryCalculate.addBinary("1", "1"));
		assertEquals("1000", binaryCalculate.addBinary("1", "0"));
		assertEquals("1000", binaryCalculate.addBinary("0", "1"));
		assertEquals("0", binaryCalculate.addBinary("0", "0"));
		assertEquals("11", binaryCalculate.addBinary("1", "1"));
		assertEquals("100", binaryCalculate.addBinary("10", "0"));
		assertEquals("100", binaryCalculate.addBinary("0", "10"));
		assertEquals("101", binaryCalculate.addBinary("10", "1"));
		assertEquals("101", binaryCalculate.addBinary("1", "10"));
		assertEquals("110", binaryCalculate.addBinary("11", "0"));
		assertEquals("110", binaryCalculate.addBinary("0", "11"));
		assertEquals("111", binaryCalculate.addBinary("11", "1"));
		assertEquals("111", binaryCalculate.addBinary("1", "11"));
		assertEquals("1000", binaryCalculate.addBinary("11", "11"));
		assertEquals("1001", binaryCalculate.addBinary("111", "0"));
		assertEquals("1001", binaryCalculate.addBinary("0", "111"));
		assertEquals("1010", binaryCalculate.addBinary("111", "1"));
		assertEquals("1010", binaryCalculate.addBinary("1", "111"));
		assertEquals("1011", binaryCalculate.addBinary("111", "10"));
		assertEquals("1011", binaryCalculate.addBinary("10", "111"));
		assertEquals("1100", binaryCalculate.addBinary("111", "11"));
		assertEquals("1101", binaryCalculate.addBinary("1111", "0"));
		assertEquals("1101", binaryCalculate.addBinary("0", "1111"));
		assertEquals("1110", binaryCalculate.addBinary("1111", "1"));
		assertEquals("1110", binaryCalculate.addBinary("1", "1111"));
		assertEquals("1111", binaryCalculate.addBinary("1111", "10"));
		assertEquals("1111", binaryCalculate.addBinary("10", "1111"));
		assertEquals("10000", binaryCalculate.addBinary("1111", "11"));
		assertEquals("10001", binaryCalculate.addBinary("11111", "0"));
		assertEquals("10001", binaryCalculate.addBinary("0", "11111"));
		assertEquals("10010", binaryCalculate.addBinary("11111", "1"));
		assertEquals("10010", binaryCalculate.addBinary("1", "11111"));
		assertEquals("10011", binaryCalculate.addBinary("11111", "10"));
		assertEquals("10011", binaryCalculate.addBinary("10", "11111"));
		assertEquals("10100", binaryCalculate.addBinary("11111", "11"));
		assertEquals("10101", binaryCalculate.addBinary("111111", "0"));
		assertEquals("10101", binaryCalculate.addBinary("0", "111111"));
		assertEquals("10110", binaryCalculate.addBinary("111111", "1"));
		assertEquals("10110", binaryCalculate.addBinary("1", "111111"));
		assertEquals("10111", binaryCalculate.addBinary("111111", "10"));
		assertEquals("10111", binaryCalculate.addBinary("10", "111111"));
		assertEquals("11000", binaryCalculate.addBinary("111111", "11"));
		assertEquals("11001", binaryCalculate.addBinary("1111111", "0"));
		assertEquals("11001", binaryCalculate.addBinary("0", "1111111"));
		assertEquals("11010", binaryCalculate.addBinary("1111111", "1"));
		assertEquals("11010", binaryCalculate.addBinary("1", "1111111"));
	