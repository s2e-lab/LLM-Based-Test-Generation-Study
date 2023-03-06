// OptionTest1.java
package de.beiri22.commandline;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Option}.
* It contains ten unit test cases for the {@link Option#isIsSet()} method.
*/
class OptionTest1 {

		/**
		* Test case for {@link Option#isIsSet()}.
		* It tests if the method returns false if the option is not set.
		*/
		@Test
		void testIsIsSet1() {
				Option option = new Option("test");
				assertFalse(option.isIsSet());
		}
		
		/**
		* Test case for {@link Option#isIsSet()}.
		* It tests if the method returns true if the option is set.
		*/
		@Test
		void testIsIsSet2() {
				Option option = new Option("test");
				option.parse("test");
				assertTrue(option.isIsSet());
		}
		
		/**
		* Test case for {@link Option#isIsSet()}.
		* It tests if the method returns false if the option is not set.
		*/
		@Test
		void testIsIsSet3() {
				Option option = new Option("test", "test", true, "=", "test");
				assertFalse(option.isIsSet());
		}
		
		/**
		* Test case for {@link Option#isIsSet()}.
		* It tests if the method returns true if the option is set.
		*/
		@Test
		void testIsIsSet4() {
				Option option = new Option("test", "test", true, "=", "test");
				option.parse("test=test");
				assertTrue(option.isIsSet());
		}
		
		/**
		* Test case for {@link Option#isIsSet()}.
		* It tests if the method returns false if the option is not set.
		*/
		@Test
		void testIsIsSet5() {
				Option option = new Option("test", "test", true, "=", "test");
				assertFalse(option.isIsSet());
		}
		
		/**
		* Test case for {@link Option#isIsSet()}.
		* It tests if the method returns true if the option is set.
		*/
		@Test
		void testIsIsSet6() {
				Option option = new Option("test", "test", true, "=", "test");
				option.parse("test=test");
				assertTrue(option.isIsSet());
		}
		
		/**
		* Test case for {@link Option#isIsSet()}.
		* It tests if the method returns false if the option is not set.
		*/
		@Test
		void testIsIsSet7() {
				Option option = new Option("test", "test", true, "=", "test");
				assertFalse(option.isIsSet());
		}
		
		/**
		* Test case for {@link Option#isIsSet()}.
		* It tests if the method returns true if the option is set.
		*/
		@Test
		void testIsIsSet8() {
				Option option = new Option("test", "test", true, "=", "test");
				option.parse("test=test");
				assertTrue(option.isIsSet());
		}
		
		/**
		* Test case for {@link Option#isIsSet()}.
		* It tests if the method returns false if the option is not set.
		*/
		@Test
		void testIsIsSet9() {
				Option option = new Option("test", "test", true, "=", "test");
				assertFalse(option.isIsSet());
		}
		
		/**
		* Test case for {@link Option#isIsSet()}.
		* It tests if the method returns true if the option is set.
		*/
		@Test
		void testIsIsSet10() {
				Option option = new Option("test", "test", true, "=", "test");
				option.parse("test=test");
				assertTrue(option.isIsSet());
		}
		
}

// OptionTest2.java
package de.beiri22.commandline;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Option}.
* It contains ten unit test cases for the {@link Option#getValue()} method.
*/
class OptionTest2 {
		
		/**
		* Test case for {@link Option#getValue()}.
		* It tests if the method returns the correct value if the option is set.
		*/
		@Test
		void testGetValue1() {
				Option option = new Option("test", "test", true, "=", "test");
				option.parse("test=test");
				assertEquals("test", option.getValue());
		}
		
		/**
		* Test case for {@link Option#getValue()}.
		* It tests if the method returns the correct value if the option is set.
		*/
		@Test
		void testGetValue2() {
				Option option = new Option("test", "test", true, "=", "test");
				option.parse("test=test");
				assertEquals("test", option.getValue());
		}
		
		/**
		* Test case for {@link Option#getValue()}.
		* It tests if the method returns the correct value if the option is set.
		*/
		@Test
		void testGetValue3() {
				Option option = new Option("test", "test", true, "=", "test");
				option.parse("test=test");
				assertEquals("test", option.getValue());
		}
		
		/**
		* Test case for {@link Option#getValue()}.
		* It tests if the method returns the correct value if the option is set.
		*/
		@Test
		void testGetValue4() {
				Option option = new Option("test", "test", true, "=", "test");
				option.parse("test=test");
				assertEquals("test", option.getValue());
		}
		
		/**
		* Test case for {@link Option#getValue()}.
		* It tests if the method returns the correct value if the option is set.
		*/
		@Test
		void testGetValue5() {
				Option option = new Option("test", "test", true, "=", "test");
				option.parse("test=test");
				assertEquals("test", option.getValue());
		}
		
		/**
		* Test case for {@link Option#getValue()}.
		* It tests if the method returns the correct value if the option is set.
		*/
		@Test
		void testGetValue6() {
				Option option = new Option("test", "test", true, "=", "test");
				option.parse("test=test");
				assertEquals("test", option.getValue());
		}
		
		/**
		* Test case for {@link Option#getValue()}.
		* It tests if the method returns the correct value if the option is set.
		*/
		@Test
		void testGetValue7() {
				Option option = new Option("test", "test", true, "=", "test");
				option.parse("test=test");
				assertEquals("test", option.getValue());
		}
		
		/**
		* Test case for {@link Option#getValue()}.
		* It tests if the method returns the correct value if the option is set.
		*/
		@