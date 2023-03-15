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
	* This test case tests the {@link TextMessage#pack()} method with a message containing only ASCII characters.
	* The expected result is a byte array containing the same characters as the message.
	*/
	@Test
	void testPack_1() {
		TextMessage msg = new TextMessage(1, 2, 3, "abc");
		byte[] expected = {1, 2, 3, 'a', 'b', 'c'};
		byte[] actual = msg.pack();
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link TextMessage#pack()}.
	* This test case tests the {@link TextMessage#pack()} method with a message containing only ASCII characters.
	* The expected result is a byte array containing the same characters as the message.
	*/
	@Test
	void testPack_2() {
		TextMessage msg = new TextMessage(1, 2, 3, "abcdefghijklmnopqrstuvwxyz");
		byte[] expected = {1, 2, 3, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		byte[] actual = msg.pack();
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link TextMessage#pack()}.
	* This test case tests the {@link TextMessage#pack()} method with a message containing only ASCII characters.
	* The expected result is a byte array containing the same characters as the message.
	*/
	@Test
	void testPack_3() {
		TextMessage msg = new TextMessage(1, 2, 3, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		byte[] expected = {1, 2, 3, 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		byte[] actual = msg.pack();
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link TextMessage#pack()}.
	* This test case tests the {@link TextMessage#pack()} method with a message containing only ASCII characters.
	* The expected result is a byte array containing the same characters as the message.
	*/
	@Test
	void testPack_4() {
		TextMessage msg = new TextMessage(1, 2, 3, "0123456789");
		byte[] expected = {1, 2, 3, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		byte[] actual = msg.pack();
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link TextMessage#pack()}.
	* This test case tests the {@link TextMessage#pack()} method with a message containing only ASCII characters.
	* The expected result is a byte array containing the same characters as the message.
	*/
	@Test
	void testPack_5() {
		TextMessage msg = new TextMessage(1, 2, 3, "!\"#¤%&/()=?`*'_:;,.-");
		byte[] expected = {1, 2, 3, '!', '"', '#', '¤', '%', '&', '/', '(', ')', '=', '?', '`', '*', '\'', '_', ':', ';', ',', '.', '-'};
		byte[] actual = msg.pack();
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link TextMessage#pack()}.
	* This test case tests the {@link TextMessage#pack()} method with a message containing only ASCII characters.
	* The expected result is a byte array containing the same characters as the message.
	*/
	@Test
	void testPack_6() {
		TextMessage msg = new TextMessage(1, 2, 3, " ");
		byte[] expected = {1, 2, 3, ' '};
		byte[] actual = msg.pack();
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link TextMessage#pack()}.
	* This test case tests the {@link TextMessage#pack()} method with a message containing only ASCII characters.
	* The expected result is a byte array containing the same characters as the message.
	*/
	@Test
	void testPack_7() {
		TextMessage msg = new TextMessage(1, 2, 3, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#¤%&/()=?`*'_:;,.- ");
		byte[] expected = {1, 2, 3, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '"', '#', '¤', '%', '&', '/', '(', ')', '=', '?', '`', '*', '\'', '_', ':', ';', ',', '.', '-', ' '};
		byte[] actual = msg.pack();
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link TextMessage#pack()}.
	* This test case tests the {@link TextMessage#pack()} method with a message containing only ASCII characters.
	* The expected result is a byte array containing the same characters as the message.
	*/
	@Test
	void testPack_8() {
		TextMessage msg = new TextMessage(1, 2, 3, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#¤%&/()=?`*'_:;,.- ");
		byte[] expected = {1, 2, 3, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '"', '#', '¤', '%', '&', '/', '(', ')', '=', '?', '`', '*', '\'', '_', ':', ';', ',', '.', '-', ' '};
		byte[] actual = msg.pack();
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link TextMessage#pack()}.
	* This test case tests the {@link TextMessage#pack()} method with a message containing only ASCII characters.
	* The expected result is a byte array containing the same characters as the message.
	*/
	@Test
	void testPack_9() {
		TextMessage msg = new TextMessage(1, 2, 3, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#¤%&/()=?`*'_:;,.- ");
		byte[] expected = {1, 2, 3, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '"', '#', '¤', '%', '&', '/', '(', ')', '=', '?', '`', '*', '\'', '_', ':', ';', ',', '.', '-', ' '};
		byte[] actual = msg.pack();
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link TextMessage#pack()}.
	* This test case tests the {@link TextMessage#pack()} method with a message containing only ASCII characters.
	* The expected result is a byte array containing the same characters as the message.
	*/
	@Test
	void testPack_10() {
		TextMessage msg = new TextMessage(1, 2, 3, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#¤%&/()=?`*'_:;,.- ");
		byte[] expected = {1, 2, 3, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '"', '#', '¤', '%', '&', '/', '(', ')', '=', '?', '`', '*', '\'', '_', ':', ';', ',', '.', '-', ' '};
		byte[] actual = msg.pack();
		assertArrayEquals(expected, actual);
	}
	
}

// TextMessage_2Test.java
package state;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TextMessage}.
* It contains ten unit test cases for the {@link TextMessage#unpack(byte[])} method.
*/
class TextMessage_2Test {
		
	/**
	* Test case 1 for {@link TextMessage#unpack(byte[])}.
	* This test case tests the {@link TextMessage#unpack(byte[])} method with a byte array containing only ASCII characters.
	* The expected result is a message containing the same characters as the byte array.
	*/
	@Test
	void testUnpack_1() {
		TextMessage msg = new TextMessage();
		byte[] data = {1, 2, 3, 'a', 'b', 'c'};
		msg.unpack(data);
		String expected = "abc";
		String actual = msg.getText();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link TextMessage#unpack(byte[])}.
	* This test case tests the {@link TextMessage#unpack(byte[])} method with a byte array containing only ASCII characters.
	* The expected result is a message containing the same characters as the byte array.
	*/
	@Test
	void testUnpack_2() {
		TextMessage msg = new TextMessage();
		byte[] data = {1, 2, 3, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		msg.unpack(data);
		String expected = "abcdefghijklmnopqrstuvwxyz";
		String actual = msg.getText();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link TextMessage#unpack(byte[])}.
	* This test case tests the {@link TextMessage#unpack(byte[])} method with a byte array containing only ASCII characters.
	* The expected result is a message containing the same characters as the byte array.
	*/
	@Test
	void testUnpack_3() {
		TextMessage msg = new TextMessage();
		byte[] data = {1, 2, 3, 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		msg.unpack(data);
		String expected = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String actual = msg.getText();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link TextMessage#unpack(byte[])}.
	* This test case tests the {@link TextMessage#unpack(byte[])} method with a byte array containing only ASCII characters.
	* The expected result is a message containing the same characters as the byte array.
	*/
	@Test
	void testUnpack_4() {
		TextMessage msg = new TextMessage();
		byte[] data = {1, 2, 3, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		msg.unpack(data);
		String expected = "0123456789";
		String actual = msg.getText();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link TextMessage#unpack(byte[])}.
	* This test case tests the {@link TextMessage#unpack(byte[])} method with a byte array containing only ASCII characters.
	* The expected result is a message containing the same characters as the byte array.
	*/
	@Test
	void testUnpack_5() {
		TextMessage msg = new Text