// Inflection_4Test.java
package net.sourceforge.schemaspy.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Inflection}.
* It contains ten unit test cases for the {@link Inflection#isUncountable(String)} method.
*/
class Inflection_4Test {

		/**
		* Test case for the {@link Inflection#isUncountable(String)} method.
		* It tests if the method returns true for the word "equipment".
		*/
		@Test
		void testIsUncountable_equipment() {
				assertTrue(Inflection.isUncountable("equipment"));
		}
		
		/**
		* Test case for the {@link Inflection#isUncountable(String)} method.
		* It tests if the method returns true for the word "information".
		*/
		@Test
		void testIsUncountable_information() {
				assertTrue(Inflection.isUncountable("information"));
		}
		
		/**
		* Test case for the {@link Inflection#isUncountable(String)} method.
		* It tests if the method returns true for the word "rice".
		*/
		@Test
		void testIsUncountable_rice() {
				assertTrue(Inflection.isUncountable("rice"));
		}
		
		/**
		* Test case for the {@link Inflection#isUncountable(String)} method.
		* It tests if the method returns true for the word "money".
		*/
		@Test
		void testIsUncountable_money() {
				assertTrue(Inflection.isUncountable("money"));
		}
		
		/**
		* Test case for the {@link Inflection#isUncountable(String)} method.
		* It tests if the method returns true for the word "species".
		*/
		@Test
		void testIsUncountable_species() {
				assertTrue(Inflection.isUncountable("species"));
		}
		
		/**
		* Test case for the {@link Inflection#isUncountable(String)} method.
		* It tests if the method returns true for the word "series".
		*/
		@Test
		void testIsUncountable_series() {
				assertTrue(Inflection.isUncountable("series"));
		}
		
		/**
		* Test case for the {@link Inflection#isUncountable(String)} method.
		* It tests if the method returns true for the word "fish".
		*/
		@Test
		void testIsUncountable_fish() {
				assertTrue(Inflection.isUncountable("fish"));
		}
		
		/**
		* Test case for the {@link Inflection#isUncountable(String)} method.
		* It tests if the method returns true for the word "sheep".
		*/
		@Test
		void testIsUncountable_sheep() {
				assertTrue(Inflection.isUncountable("sheep"));
		}
		
		/**
		* Test case for the {@link Inflection#isUncountable(String)} method.
		* It tests if the method returns false for the word "table".
		*/
		@Test
		void testIsUncountable_table() {
				assertFalse(Inflection.isUncountable("table"));
		}
		
		/**
		* Test case for the {@link Inflection#isUncountable(String)} method.
		* It tests if the method returns false for the word "chair".
		*/
		@Test
		void testIsUncountable_chair() {
				assertFalse(Inflection.isUncountable("chair"));
		}
}

// Inflection_5Test.java
package net.sourceforge.schemaspy.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Inflection}.
* It contains ten unit test cases for the {@link Inflection#pluralize(String)} method.
*/
class Inflection_5Test {
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests if the method returns "equipments" for the word "equipment".
		*/
		@Test
		void testPluralize_equipment() {
				assertEquals("equipments", Inflection.pluralize("equipment"));
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests if the method returns "informations" for the word "information".
		*/
		@Test
		void testPluralize_information() {
				assertEquals("informations", Inflection.pluralize("information"));
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests if the method returns "rices" for the word "rice".
		*/
		@Test
		void testPluralize_rice() {
				assertEquals("rices", Inflection.pluralize("rice"));
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests if the method returns "moneys" for the word "money".
		*/
		@Test
		void testPluralize_money() {
				assertEquals("moneys", Inflection.pluralize("money"));
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests if the method returns "species" for the word "species".
		*/
		@Test
		void testPluralize_species() {
				assertEquals("species", Inflection.pluralize("species"));
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests if the method returns "series" for the word "series".
		*/
		@Test
		void testPluralize_series() {
				assertEquals("series", Inflection.pluralize("series"));
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests if the method returns "fish" for the word "fish".
		*/
		@Test
		void testPluralize_fish() {
				assertEquals("fish", Inflection.pluralize("fish"));
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests if the method returns "sheep" for the word "sheep".
		*/
		@Test
		void testPluralize_sheep() {
				assertEquals("sheep", Inflection.pluralize("sheep"));
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests if the method returns "tables" for the word "table".
		*/
		@Test
		void testPluralize_table() {
				assertEquals("tables", Inflection.pluralize("table"));
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests if the method returns "chairs" for the word "chair".
		*/
		@Test
		void testPluralize_chair() {
				assertEqu