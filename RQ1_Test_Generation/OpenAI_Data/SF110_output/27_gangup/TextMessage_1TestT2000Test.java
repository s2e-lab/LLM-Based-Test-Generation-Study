// TextMessage_1Test.java
package state;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TextMessage}.
* It contains ten unit test cases for the {@link TextMessage#pack()} method.
*/
class TextMessage_1Test {

	/**
	* Test case 1 for {@link TextMessage#pack()}.
	* This test case tests the pack method with a TextMessage object with the following values:
	* actor = 1
	* target = 2
	* messagetype = 3
	* text = "Hello World!"
	* The expected result is a byte array with the following values:
	* data[0] = 1
	* data[1] = 2
	* data[2] = 3
	* data[3] = 72
	* data[4] = 101
	* data[5] = 108
	* data[6] = 108
	* data[7] = 111
	* data[8] = 32
	* data[9] = 87
	* data[10] = 111
	* data[11] = 114
	* data[12] = 108
	* data[13] = 100
	* data[14] = 33
	*/
	@Test
	void testPack1() throws UnsupportedEncodingException {
		TextMessage msg = new TextMessage(1, 2, 3, "Hello World!");
		byte[] data = msg.pack();
		assertEquals(1, data[0]);
		assertEquals(2, data[1]);
		assertEquals(3, data[2]);
		assertEquals(72, data[3]);
		assertEquals(101, data[4]);
		assertEquals(108, data[5]);
		assertEquals(108, data[6]);
		assertEquals(111, data[7]);
		assertEquals(32, data[8]);
		assertEquals(87, data[9]);
		assertEquals(111, data[10]);
		assertEquals(114, data[11]);
		assertEquals(108, data[12]);
		assertEquals(100, data[13]);
		assertEquals(33, data[14]);
	}
	
	/**
	* Test case 2 for {@link TextMessage#pack()}.
	* This test case tests the pack method with a TextMessage object with the following values:
	* actor = -1
	* target = -2
	* messagetype = -3
	* text = "Hello World!"
	* The expected result is a byte array with the following values:
	* data[0] = -1
	* data[1] = -2
	* data[2] = -3
	* data[3] = 72
	* data[4] = 101
	* data[5] = 108
	* data[6] = 108
	* data[7] = 111
	* data[8] = 32
	* data[9] = 87
	* data[10] = 111
	* data[11] = 114
	* data[12] = 108
	* data[13] = 100
	* data[14] = 33
	*/
	@Test
	void testPack2() throws UnsupportedEncodingException {
		TextMessage msg = new TextMessage(-1, -2, -3, "Hello World!");
		byte[] data = msg.pack();
		assertEquals(-1, data[0]);
		assertEquals(-2, data[1]);
		assertEquals(-3, data[2]);
		assertEquals(72, data[3]);
		assertEquals(101, data[4]);
		assertEquals(108, data[5]);
		assertEquals(108, data[6]);
		assertEquals(111, data[7]);
		assertEquals(32, data[8]);
		assertEquals(87, data[9]);
		assertEquals(111, data[10]);
		assertEquals(114, data[11]);
		assertEquals(108, data[12]);
		assertEquals(100, data[13]);
		assertEquals(33, data[14]);
	}
	
	/**
	* Test case 3 for {@link TextMessage#pack()}.
	* This test case tests the pack method with a TextMessage object with the following values:
	* actor = 0
	* target = 0
	* messagetype = 0
	* text = "Hello World!"
	* The expected result is a byte array with the following values:
	* data[0] = 0
	* data[1] = 0
	* data[2] = 0
	* data[3] = 72
	* data[4] = 101
	* data[5] = 108
	* data[6] = 108
	* data[7] = 111
	* data[8] = 32
	* data[9] = 87
	* data[10] = 111
	* data[11] = 114
	* data[12] = 108
	* data[13] = 100
	* data[14] = 33
	*/
	@Test
	void testPack3() throws UnsupportedEncodingException {
		TextMessage msg = new TextMessage(0, 0, 0, "Hello World!");
		byte[] data = msg.pack();
		assertEquals(0, data[0]);
		assertEquals(0, data[1]);
		assertEquals(0, data[2]);
		assertEquals(72, data[3]);
		assertEquals(101, data[4]);
		assertEquals(108, data[5]);
		assertEquals(108, data[6]);
		assertEquals(111, data[7]);
		assertEquals(32, data[8]);
		assertEquals(87, data[9]);
		assertEquals(111, data[10]);
		assertEquals(114, data[11]);
		assertEquals(108, data[12]);
		assertEquals(100, data[13]);
		assertEquals(33, data[14]);
	}
	
	/**
	* Test case 4 for {@link TextMessage#pack()}.
	* This test case tests the pack method with a TextMessage object with the following values:
	* actor = 1
	* target = 2
	* messagetype = 3
	* text = "Hello World!"
	* The expected result is a byte array with the following values:
	* data[0] = 1
	* data[1] = 2
	* data[2] = 3
	* data[3] = 72
	* data[4] = 101
	* data[5] = 108
	* data[6] = 108
	* data[7] = 111
	* data[8] = 32
	* data[9] = 87
	* data[10] = 111
	* data[11] = 114
	* data[12] = 108
	* data[13] = 100
	* data[14] = 33
	*/
	@Test
	void testPack4() throws UnsupportedEncodingException {
		TextMessage msg = new TextMessage(1, 2, 3, "Hello World!");
		byte[] data = msg.pack();
		assertEquals(1, data[0]);
		assertEquals(2, data[1]);
		assertEquals(3, data[2]);
		assertEquals(72, data[3]);
		assertEquals(101, data[4]);
		assertEquals(108, data[5]);
		assertEquals(108, data[6]);
		assertEquals(111, data[7]);
		assertEquals(32, data[8]);
		assertEquals(87, data[9]);
		assertEquals(111, data[10]);
		assertEquals(114, data[11]);
		assertEquals(108, data[12]);
		assertEquals(100, data[13]);
		assertEquals(33, data[14]);
	}
	
	/**
	* Test case 5 for {@link TextMessage#pack()}.
	* This test case tests the pack method with a TextMessage object with the following values:
	* actor = 1
	* target = 2
	* messagetype = 3
	* text = "Hello World!"
	* The expected result is a byte array with the following values:
	* data[0] = 1
	* data[1]