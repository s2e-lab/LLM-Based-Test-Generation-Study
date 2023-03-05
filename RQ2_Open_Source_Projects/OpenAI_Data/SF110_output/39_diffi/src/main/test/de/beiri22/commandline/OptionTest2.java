// OptionTest2.java
package de.beiri22.commandline;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Option}.
* It contains ten unit test cases for the {@link Option#is(String)} method.
*/
class OptionTest2 {

		/**
		* Test case for {@link Option#is(String)} with a short option name.
		*/
		@Test
		void testIsShortOption() {
				Option option = new Option("a", "", true, "=", "");
				assertTrue(option.is("-a=value"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a long option name.
		*/
		@Test
		void testIsLongOption() {
				Option option = new Option("abc", "", true, "=", "");
				assertTrue(option.is("--abc=value"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a short option name and a space as delimiter.
		*/
		@Test
		void testIsShortOptionSpaceDelimiter() {
				Option option = new Option("a", "", true, " ", "");
				assertTrue(option.is("-a value"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a long option name and a space as delimiter.
		*/
		@Test
		void testIsLongOptionSpaceDelimiter() {
				Option option = new Option("abc", "", true, " ", "");
				assertTrue(option.is("--abc value"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a short option name and a colon as delimiter.
		*/
		@Test
		void testIsShortOptionColonDelimiter() {
				Option option = new Option("a", "", true, ":", "");
				assertTrue(option.is("-a:value"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a long option name and a colon as delimiter.
		*/
		@Test
		void testIsLongOptionColonDelimiter() {
				Option option = new Option("abc", "", true, ":", "");
				assertTrue(option.is("--abc:value"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a short option name and no delimiter.
		*/
		@Test
		void testIsShortOptionNoDelimiter() {
				Option option = new Option("a", "", false, "", "");
				assertTrue(option.is("-a"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a long option name and no delimiter.
		*/
		@Test
		void testIsLongOptionNoDelimiter() {
				Option option = new Option("abc", "", false, "", "");
				assertTrue(option.is("--abc"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a short option name and a space as delimiter and no value.
		*/
		@Test
		void testIsShortOptionSpaceDelimiterNoValue() {
				Option option = new Option("a", "", true, " ", "");
				assertFalse(option.is("-a"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a long option name and a space as delimiter and no value.
		*/
		@Test
		void testIsLongOptionSpaceDelimiterNoValue() {
				Option option = new Option("abc", "", true, " ", "");
				assertFalse(option.is("--abc"));
		}
		
}

// OptionTest.java
package de.beiri22.commandline;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Option}.
* It contains ten unit test cases for the {@link Option#parse(String)} method.
*/
class OptionTest {
		
		/**
		* Test case for {@link Option#parse(String)} with a short option name.
		*/
		@Test
		void testParseShortOption() {
				Option option = new Option("a", "", true, "=", "");
				option.parse("-a=value");
				assertEquals("value", option.getValue());
		}
		
		/**
		* Test case for {@link Option#parse(String)} with a long option name.
		*/
		@Test
		void testParseLongOption() {
				Option option = new Option("abc", "", true, "=", "");
				option.parse("--abc=value");
				assertEquals("value", option.getValue());
		}
		
		/**
		* Test case for {@link Option#parse(String)} with a short option name and a space as delimiter.
		*/
		@Test
		void testParseShortOptionSpaceDelimiter() {
				Option option = new Option("a", "", true, " ", "");
				option.parse("-a value");
				assertEquals("value", option.getValue());
		}
		
		/**
		* Test case for {@link Option#parse(String)} with a long option name and a space as delimiter.
		*/
		@Test
		void testParseLongOptionSpaceDelimiter() {
				Option option = new Option("abc", "", true, " ", "");
				option.parse("--abc value");
				assertEquals("value", option.getValue());
		}
		
		/**
		* Test case for {@link Option#parse(String)} with a short option name and a colon as delimiter.
		*/
		@Test
		void testParseShortOptionColonDelimiter() {
				Option option = new Option("a", "", true, ":", "");
				option.parse("-a:value");
				assertEquals("value", option.getValue());
		}
		
		/**
		* Test case for {@link Option#parse(String)} with a long option name and a colon as delimiter.
		*/
		@Test
		void testParseLongOptionColonDelimiter() {
				Option option = new Option("abc", "", true, ":", "");
				option.parse("--abc:value");
				assertEquals("value", option.getValue());
		}
		
		/**
		* Test case for {@link Option#parse(String)} with a short option name and no delimiter.
		*/
		@Test
		void testParseShortOptionNoDelimiter() {
				Option option = new Option("a", "", false, "", "");
				option.parse("-a");
				assertEquals("", option.getValue());
		}
		
		/**
		* Test case for {@link Option#parse(String)} with a long option name and no delimiter.
		*/
		@Test
		void testParseLongOptionNoDelimiter() {
				Option option = new Option("abc", "", false, "", "");
				option.parse("--abc");
				assertEquals("", option.getValue());
		}
		
		/**
		* Test case for {@link Option#parse(String)} with a short option name and a space as delimiter and no value.
		*/
		@Test
		void testParseShortOptionSpaceDelimiterNoValue() {
				Option option = new Option("a