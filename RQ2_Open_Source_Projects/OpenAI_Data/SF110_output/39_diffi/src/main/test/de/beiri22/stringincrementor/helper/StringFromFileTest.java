// StringFromFileTest.java
package de.beiri22.stringincrementor.helper;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringFromFile}.
* It contains ten unit test cases for the {@link StringFromFile#readString(String)} method.
*/
class StringFromFileTest {

	/**
	* Test case for {@link StringFromFile#readString(String)} method.
	* It tests if the method returns the correct string.
	*/
	@Test
	void testReadString() throws IOException {
		String expected = "Hello World!";
		String actual = StringFromFile.readString("test.txt");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link StringFromFile#readString(String)} method.
	* It tests if the method returns the correct string.
	*/
	@Test
	void testReadString2() throws IOException {
		String expected = "Hello World!\n";
		String actual = StringFromFile.readString("test2.txt");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link StringFromFile#readString(String)} method.
	* It tests if the method returns the correct string.
	*/
	@Test
	void testReadString3() throws IOException {
		String expected = "Hello World!\nHello World!\n";
		String actual = StringFromFile.readString("test3.txt");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link StringFromFile#readString(String)} method.
	* It tests if the method returns the correct string.
	*/
	@Test
	void testReadString4() throws IOException {
		String expected = "Hello World!\nHello World!\nHello World!\n";
		String actual = StringFromFile.readString("test4.txt");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link StringFromFile#readString(String)} method.
	* It tests if the method returns the correct string.
	*/
	@Test
	void testReadString5() throws IOException {
		String expected = "Hello World!\nHello World!\nHello World!\nHello World!\n";
		String actual = StringFromFile.readString("test5.txt");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link StringFromFile#readString(String)} method.
	* It tests if the method returns the correct string.
	*/
	@Test
	void testReadString6() throws IOException {
		String expected = "Hello World!\nHello World!\nHello World!\nHello World!\nHello World!\n";
		String actual = StringFromFile.readString("test6.txt");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link StringFromFile#readString(String)} method.
	* It tests if the method returns the correct string.
	*/
	@Test
	void testReadString7() throws IOException {
		String expected = "Hello World!\nHello World!\nHello World!\nHello World!\nHello World!\nHello World!\n";
		String actual = StringFromFile.readString("test7.txt");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link StringFromFile#readString(String)} method.
	* It tests if the method returns the correct string.
	*/
	@Test
	void testReadString8() throws IOException {
		String expected = "Hello World!\nHello World!\nHello World!\nHello World!\nHello World!\nHello World!\nHello World!\n";
		String actual = StringFromFile.readString("test8.txt");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link StringFromFile#readString(String)} method.
	* It tests if the method returns the correct string.
	*/
	@Test
	void testReadString9() throws IOException {
		String expected = "Hello World!\nHello World!\nHello World!\nHello World!\nHello World!\nHello World!\nHello World!\nHello World!\n";
		String actual = StringFromFile.readString("test9.txt");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link StringFromFile#readString(String)} method.
	* It tests if the method returns the correct string.
	*/
	@Test
	void testReadString10() throws IOException {
		String expected = "Hello World!\nHello World!\nHello World!\nHello World!\nHello World!\nHello World!\nHello World!\nHello World!\nHello World!\n";
		String actual = StringFromFile.readString("test10.txt");
		assertEquals(expected, actual);
	}
}