// OptionTest0.java
package de.beiri22.commandline;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Option}.
* It contains ten unit test cases for the {@link Option#isHasArg()} method.
*/
class OptionTest0 {

		/**
		* Test case for the method {@link Option#isHasArg()}.
		*/
		@Test
		public void testIsHasArg0() {
				Option option = new Option("", "", false, "", "");
				boolean result = option.isHasArg();
				assertFalse(result);
		}
		
		/**
		* Test case for the method {@link Option#isHasArg()}.
		*/
		@Test
		public void testIsHasArg1() {
				Option option = new Option("", "", true, "", "");
				boolean result = option.isHasArg();
				assertTrue(result);
		}
		
		/**
		* Test case for the method {@link Option#isHasArg()}.
		*/
		@Test
		public void testIsHasArg2() {
				Option option = new Option("", "", false, "", "");
				boolean result = option.isHasArg();
				assertFalse(result);
		}
		
		/**
		* Test case for the method {@link Option#isHasArg()}.
		*/
		@Test
		public void testIsHasArg3() {
				Option option = new Option("", "", true, "", "");
				boolean result = option.isHasArg();
				assertTrue(result);
		}
		
		/**
		* Test case for the method {@link Option#isHasArg()}.
		*/
		@Test
		public void testIsHasArg4() {
				Option option = new Option("", "", false, "", "");
				boolean result = option.isHasArg();
				assertFalse(result);
		}
		
		/**
		* Test case for the method {@link Option#isHasArg()}.
		*/
		@Test
		public void testIsHasArg5() {
				Option option = new Option("", "", true, "", "");
				boolean result = option.isHasArg();
				assertTrue(result);
		}
		
		/**
		* Test case for the method {@link Option#isHasArg()}.
		*/
		@Test
		public void testIsHasArg6() {
				Option option = new Option("", "", false, "", "");
				boolean result = option.isHasArg();
				assertFalse(result);
		}
		
		/**
		* Test case for the method {@link Option#isHasArg()}.
		*/
		@Test
		public void testIsHasArg7() {
				Option option = new Option("", "", true, "", "");
				boolean result = option.isHasArg();
				assertTrue(result);
		}
		
		/**
		* Test case for the method {@link Option#isHasArg()}.
		*/
		@Test
		public void testIsHasArg8() {
				Option option = new Option("", "", false, "", "");
				boolean result = option.isHasArg();
				assertFalse(result);
		}
		
		/**
		* Test case for the method {@link Option#isHasArg()}.
		*/
		@Test
		public void testIsHasArg9() {
				Option option = new Option("", "", true, "", "");
				boolean result = option.isHasArg();
				assertTrue(result);
		}
		
}

// OptionTest1.java
package de.beiri22.commandline;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Option}.
* It contains ten unit test cases for the {@link Option#is(String)} method.
*/
class OptionTest1 {
		
		/**
		* Test case for the method {@link Option#is(String)}.
		*/
		@Test
		public void testIs0() {
				Option option = new Option("", "", false, "", "");
				boolean result = option.is("");
				assertFalse(result);
		}
		
		/**
		* Test case for the method {@link Option#is(String)}.
		*/
		@Test
		public void testIs1() {
				Option option = new Option("", "", true, "", "");
				boolean result = option.is("");
				assertFalse(result);
		}
		
		/**
		* Test case for the method {@link Option#is(String)}.
		*/
		@Test
		public void testIs2() {
				Option option = new Option("", "", false, "", "");
				boolean result = option.is("");
				assertFalse(result);
		}
		
		/**
		* Test case for the method {@link Option#is(String)}.
		*/
		@Test
		public void testIs3() {
				Option option = new Option("", "", true, "", "");
				boolean result = option.is("");
				assertFalse(result);
		}
		
		/**
		* Test case for the method {@link Option#is(String)}.
		*/
		@Test
		public void testIs4() {
				Option option = new Option("", "", false, "", "");
				boolean result = option.is("");
				assertFalse(result);
		}
		
		/**
		* Test case for the method {@link Option#is(String)}.
		*/
		@Test
		public void testIs5() {
				Option option = new Option("", "", true, "", "");
				boolean result = option.is("");
				assertFalse(result);
		}
		
		/**
		* Test case for the method {@link Option#is(String)}.
		*/
		@Test
		public void testIs6() {
				Option option = new Option("", "", false, "", "");
				boolean result = option.is("");
				assertFalse(result);
		}
		
		/**
		* Test case for the method {@link Option#is(String)}.
		*/
		@Test
		public void testIs7() {
				Option option = new Option("", "", true, "", "");
				boolean result = option.is("");
				assertFalse(result);
		}
		
		/**
		* Test case for the method {@link Option#is(String)}.
		*/
		@Test
		public void testIs8() {
				Option option = new Option("", "", false, "", "");
				boolean result = option.is("");
				assertFalse(result);
		}
		
		/**
		* Test case for the method {@link Option#is(String)}.
		*/
		@Test
		public void testIs9() {
				Option option = new Option("", "", true, "", "");
				boolean result = option.is("");
				assertFalse(result);
		}
		
}

// OptionTest2.java
package de.beiri22.commandline;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
*