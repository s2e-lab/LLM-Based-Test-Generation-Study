// OptionTest.java
package de.beiri22.commandline;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Option}.
* It contains ten unit test cases for the {@link Option#is(String)} method.
*/
class OptionTest {

		/**
		* Test case for {@link Option#is(String)} with a short option.
		*/
		@Test
		void testIsShortOption() {
				Option option = new Option("a", "", true, "=", "");
				assertTrue(option.is("-a=test"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a long option.
		*/
		@Test
		void testIsLongOption() {
				Option option = new Option("abc", "", true, "=", "");
				assertTrue(option.is("--abc=test"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a short option and a space as delimiter.
		*/
		@Test
		void testIsShortOptionSpaceDelimiter() {
				Option option = new Option("a", "", true, " ", "");
				assertTrue(option.is("-a test"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a long option and a space as delimiter.
		*/
		@Test
		void testIsLongOptionSpaceDelimiter() {
				Option option = new Option("abc", "", true, " ", "");
				assertTrue(option.is("--abc test"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a short option and a colon as delimiter.
		*/
		@Test
		void testIsShortOptionColonDelimiter() {
				Option option = new Option("a", "", true, ":", "");
				assertTrue(option.is("-a:test"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a long option and a colon as delimiter.
		*/
		@Test
		void testIsLongOptionColonDelimiter() {
				Option option = new Option("abc", "", true, ":", "");
				assertTrue(option.is("--abc:test"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a short option and no delimiter.
		*/
		@Test
		void testIsShortOptionNoDelimiter() {
				Option option = new Option("a", "", false, "", "");
				assertTrue(option.is("-a"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a long option and no delimiter.
		*/
		@Test
		void testIsLongOptionNoDelimiter() {
				Option option = new Option("abc", "", false, "", "");
				assertTrue(option.is("--abc"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a short option and a space as delimiter, but no value.
		*/
		@Test
		void testIsShortOptionSpaceDelimiterNoValue() {
				Option option = new Option("a", "", true, " ", "");
				assertFalse(option.is("-a"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a long option and a space as delimiter, but no value.
		*/
		@Test
		void testIsLongOptionSpaceDelimiterNoValue() {
				Option option = new Option("abc", "", true, " ", "");
				assertFalse(option.is("--abc"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a short option and a colon as delimiter, but no value.
		*/
		@Test
		void testIsShortOptionColonDelimiterNoValue() {
				Option option = new Option("a", "", true, ":", "");
				assertFalse(option.is("-a"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a long option and a colon as delimiter, but no value.
		*/
		@Test
		void testIsLongOptionColonDelimiterNoValue() {
				Option option = new Option("abc", "", true, ":", "");
				assertFalse(option.is("--abc"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a short option and no delimiter, but a value.
		*/
		@Test
		void testIsShortOptionNoDelimiterWithValue() {
				Option option = new Option("a", "", false, "", "");
				assertFalse(option.is("-a test"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a long option and no delimiter, but a value.
		*/
		@Test
		void testIsLongOptionNoDelimiterWithValue() {
				Option option = new Option("abc", "", false, "", "");
				assertFalse(option.is("--abc test"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a short option and a space as delimiter, but a value with a colon.
		*/
		@Test
		void testIsShortOptionSpaceDelimiterWithValueColon() {
				Option option = new Option("a", "", true, " ", "");
				assertFalse(option.is("-a:test"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a long option and a space as delimiter, but a value with a colon.
		*/
		@Test
		void testIsLongOptionSpaceDelimiterWithValueColon() {
				Option option = new Option("abc", "", true, " ", "");
				assertFalse(option.is("--abc:test"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a short option and a colon as delimiter, but a value with a space.
		*/
		@Test
		void testIsShortOptionColonDelimiterWithValueSpace() {
				Option option = new Option("a", "", true, ":", "");
				assertFalse(option.is("-a test"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a long option and a colon as delimiter, but a value with a space.
		*/
		@Test
		void testIsLongOptionColonDelimiterWithValueSpace() {
				Option option = new Option("abc", "", true, ":", "");
				assertFalse(option.is("--abc test"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a short option and a space as delimiter, but a value with a space.
		*/
		@Test
		void testIsShortOptionSpaceDelimiterWithValueSpace() {
				Option option = new Option("a", "", true, " ", "");
				assertFalse(option.is("-a test"));
		}
		
		/**
		* Test case for {@link Option#is(String)} with a long option and a space as delimiter, but a value with a space.
		*/
		