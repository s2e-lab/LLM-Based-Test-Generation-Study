// UniqueDigitsTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UniqueDigits}.
* It contains ten unit test cases for the {@link UniqueDigits#uniqueDigits(List)} method.
*/
class UniqueDigitsTest {
/**
	* Test case 1.
	* Test method with following arguments:
	* <ul>
	* 	<li>List: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]</li>
	* </ul>
	* and following expectations:
	* <ul>
	* 	<li>List: [1, 3, 5, 7, 9]</li>
	* </ul>
	*/
	@Test
	public void testCase1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(9);
		List<Object> actual = UniqueDigits.uniqueDigits(list);
		assertEquals(expected, actual);
	}
		
	/**
	* Test case 2.
	* Test method with following arguments:
	* <ul>
	* 	<li>List: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]</li>
	* </ul>
	* and following expectations:
	* <ul>
	* 	<li>List: [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]</li>
	* </ul>
	*/
	@Test
	public void testCase2() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		list.add(20);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(9);
		expected.add(11);
		expected.add(13);
		expected.add(15);
		expected.add(17);
		expected.add(19);
		List<Object> actual = UniqueDigits.uniqueDigits(list);
		assertEquals(expected, actual);
	}
		
	/**
	* Test case 3.
	* Test method with following arguments:
	* <ul>
	* 	<li>List: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]</li>
	* </ul>
	* and following expectations:
	* <ul>
	* 	<li>List: [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49]</li>
	* </ul>
	*/
	@Test
	public void testCase3() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		list.add(20);
		list.add(21);
		list.add(22);
		list.add(23);
		list.add(24);
		list.add(25);
		list.add(26);
		list.add(27);
		list.add(28);
		list.add(29);
		list.add(30);
		list.add(31);
		list.add(32);
		list.add(33);
		list.add(34);
		list.add(35);
		list.add(36);
		list.add(37);
		list.add(38);
		list.add(39);
		list.add(40);
		list.add(41);
		list.add(42);
		list.add(43);
		list.add(44);
		list.add(45);
		list.add(46);
		list.add(47);
		list.add(48);
		list.add(49);
		list.add(50);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(9);
		expected.add(11);
		expected.add(13);
		expected.add(15);
		expected.add(17);
		expected.add(19);
		expected.add(21);
		expected.add(23);
		expected.add(25);
		expected.add(27);
		expected.add(29);
		expected.add(31);
		expected.add(33);
		expected.add(35);
		expected.add(37);
		expected.add(39);
		expected.add(41);
		expected.add(43);
		expected.add(45);
		expected.add(47);
		expected.add(49);
		List<Object> actual = UniqueDigits.uniqueDigits(list);
		assertEquals(expected, actual);
	}
		
	/**
	* Test case 4.
	* Test method with following arguments:
	* <ul>
	* 	<li>List: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]</li>
	* </ul>
	* and following expectations:
	* <ul>
	* 	<li>List: [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99]</li>
	* </ul>
	*/
	@Test
	public void testCase4() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		list.add(20);
		list.add(21);
		list.add(22);
		list.add(23);
		list.add(24);
		list.add(25);
		list.add(26);
		list.add(27);
		list.add(28);
		list.add(29);
		list.add(30);
		list.add(31);
		list.add(32);
		list.add(33);
		list.add(34);
		list.add(35);
		list.add(36);
		list.add(37);
		list.add(38);
		list.add(39);
		list.add(40);
		list.add(41);
		list.add(42);
		list.add(43);
		list.add(44);
		list.add(45);
		list.add(46);
		list.add(47);
		list.add(48);
		list.add(49);
		list.add(50);
		list.add(51);
		list.add(52);
		list.add(53);
		list.add(54);
		list.add(55);
		list.add(56);
		list.add(57);
		list.add(58);
		list.add(59);
		list.add(60);
		list.add(61);
		list.add(62);
		list.add(63);
		list.add(64);
		list.add(65);
		list.add(66);
		list.add(67);
		list.add(68);
		list.add(69);
		list.add(70);
		list.add(71);
		list.add(72);
		list.add(73);
		list.add(74);
		list.add(75);
		list.add(76);
		list.add(77);
		list.add(78);
		list.add(79);
		list.add(80);
		list.add(81);
		list.add(82);
		list.add(83);
		list.add(84);
		list.add(85);
		list.add(86);
		list.add(87);
		list.add(88);
		list.add(89);
		list.add(90);
		list.add(91);
		list.add(92);
		list.add(93);
		list.add(94);
		list.add(95);
		list.add(96);
		list.add(97);
		list.add(98);
		list.add(99);
		list.add(100);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(9);
		expected.add(11);
		expected.add(13);
		expected.add(15);
		expected.add(17);
		expected.add(19);
		expected.add(21);
		expected.add(23);
		expected.add(25);
		expected.add(27);
		expected.add(29);
		expected.add(31);
		expected.add(33);
		expected.add(35);
		expected.add(37);
		expected.add(39);
		expected.add(41);
		expected.add(43);
		expected.add(45);
		expected.add(47);
		expected.add(49);
		expected.add(51);
		expected.add(53);
		expected.add(55);
		expected.add(57);
		expected.add(59);
		expected.add(61);
		expected.add(63);
		expected.add(65);
		expected.add(67);
		expected.add(69);
		expected.add(71);
		expected.add(73);
		expected.add(75);
		expected.add(77);
		expected.add(79);
		expected.add(81);
		expected.add(83);
		expected.add(85);
		expected.add(87);
		expected.add(89);
		expected.add(91);
		expected.add(93);
		expected.add(95);
		expected.add(97);
		expected.add(99);
		List<Object> actual = UniqueDigits.uniqueDigits(list);
		assertEquals(expected, actual);
	}
		
	/**
	* Test case 5.
	* Test method with following arguments:
	* <ul>
	* 	<li>List: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150]</li>
	* </ul>
	* and following expectations:
	* <ul>
	* 	<li>List: [1, 3, 5, 7, 9, 11, 13