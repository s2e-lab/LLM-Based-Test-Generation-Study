// InspirentoUtilities_1Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains ten unit test cases for the {@link InspirentoUtilities#tokenize(String, String)} method.
*/
class InspirentoUtilities_1Test {

	/**
	* Test case 1 for {@link InspirentoUtilities#tokenize(String, String)}.
	* It tests the method with a string containing only one token.
	*/
	@Test
	void testTokenize_1() {
		String input = "file";
		String[] expected = {"file"};
		String[] actual = InspirentoUtilities.tokenize(input, " ");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link InspirentoUtilities#tokenize(String, String)}.
	* It tests the method with a string containing two tokens.
	*/
	@Test
	void testTokenize_2() {
		String input = "file edit";
		String[] expected = {"file", "edit"};
		String[] actual = InspirentoUtilities.tokenize(input, " ");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link InspirentoUtilities#tokenize(String, String)}.
	* It tests the method with a string containing three tokens.
	*/
	@Test
	void testTokenize_3() {
		String input = "file edit view";
		String[] expected = {"file", "edit", "view"};
		String[] actual = InspirentoUtilities.tokenize(input, " ");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link InspirentoUtilities#tokenize(String, String)}.
	* It tests the method with a string containing four tokens.
	*/
	@Test
	void testTokenize_4() {
		String input = "file edit view help";
		String[] expected = {"file", "edit", "view", "help"};
		String[] actual = InspirentoUtilities.tokenize(input, " ");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link InspirentoUtilities#tokenize(String, String)}.
	* It tests the method with a string containing five tokens.
	*/
	@Test
	void testTokenize_5() {
		String input = "file edit view help window";
		String[] expected = {"file", "edit", "view", "help", "window"};
		String[] actual = InspirentoUtilities.tokenize(input, " ");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link InspirentoUtilities#tokenize(String, String)}.
	* It tests the method with a string containing six tokens.
	*/
	@Test
	void testTokenize_6() {
		String input = "file edit view help window tools";
		String[] expected = {"file", "edit", "view", "help", "window", "tools"};
		String[] actual = InspirentoUtilities.tokenize(input, " ");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link InspirentoUtilities#tokenize(String, String)}.
	* It tests the method with a string containing seven tokens.
	*/
	@Test
	void testTokenize_7() {
		String input = "file edit view help window tools format";
		String[] expected = {"file", "edit", "view", "help", "window", "tools", "format"};
		String[] actual = InspirentoUtilities.tokenize(input, " ");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link InspirentoUtilities#tokenize(String, String)}.
	* It tests the method with a string containing eight tokens.
	*/
	@Test
	void testTokenize_8() {
		String input = "file edit view help window tools format table";
		String[] expected = {"file", "edit", "view", "help", "window", "tools", "format", "table"};
		String[] actual = InspirentoUtilities.tokenize(input, " ");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link InspirentoUtilities#tokenize(String, String)}.
	* It tests the method with a string containing nine tokens.
	*/
	@Test
	void testTokenize_9() {
		String input = "file edit view help window tools format table insert";
		String[] expected = {"file", "edit", "view", "help", "window", "tools", "format", "table", "insert"};
		String[] actual = InspirentoUtilities.tokenize(input, " ");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link InspirentoUtilities#tokenize(String, String)}.
	* It tests the method with a string containing ten tokens.
	*/
	@Test
	void testTokenize_10() {
		String input = "file edit view help window tools format table insert page";
		String[] expected = {"file", "edit", "view", "help", "window", "tools", "format", "table", "insert", "page"};
		String[] actual = InspirentoUtilities.tokenize(input, " ");
		assertArrayEquals(expected, actual);
	}
}

// InspirentoUtilities_2Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains ten unit test cases for the {@link InspirentoUtilities#tokenize(String)} method.
*/
class InspirentoUtilities_2Test {
		
	/**
	* Test case 1 for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the method with a string containing only one token.
	*/
	@Test
	void testTokenize_1() {
		String input = "file";
		String[] expected = {"file"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the method with a string containing two tokens.
	*/
	@Test
	void testTokenize_2() {
		String input = "file edit";
		String[] expected = {"file", "edit"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the method with a string containing three tokens.
	*/
	@Test
	void testTokenize_3() {
		String input = "file edit view";
		String[] expected = {"file", "edit", "view"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the method with a string containing four tokens.
	*/
	@Test
	void testTokenize_4() {
		String input = "file edit view help";
		String[] expected = {"file", "edit", "view", "help"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link InspirentoUtilities#tokenize