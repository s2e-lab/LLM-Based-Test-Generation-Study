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
				assertEquals("chairs", Inflection.pluralize("chair"));
		}
}

// Inflection_6Test.java
package net.sourceforge.schemaspy.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Inflection}.
* It contains ten unit test cases for the {@link Inflection#singularize(String)} method.
*/
class Inflection_6Test {
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests if the method returns "equipment" for the word "equipments".
		*/
		@Test
		void testSingularize_equipments() {
				assertEquals("equipment", Inflection.singularize("equipments"));
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests if the method returns "information" for the word "informations".
		*/
		@Test
		void testSingularize_informations() {
				assertEquals("information", Inflection.singularize("informations"));
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests if the method returns "rice" for the word "rices".
		*/
		@Test
		void testSingularize_rices() {
				assertEquals("rice", Inflection.singularize("rices"));
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests if the method returns "money" for the word "moneys".
		*/
		@Test
		void testSingularize_moneys() {
				assertEquals("money", Inflection.singularize("moneys"));
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests if the method returns "species" for the word "species".
		*/
		@Test
		void testSingularize_species() {
				assertEquals("species", Inflection.singularize("species"));
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests if the method returns "series" for the word "series".
		*/
		@Test
		void testSingularize_series() {
				assertEquals("series", Inflection.singularize("series"));
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests if the method returns "fish" for the word "fish".
		*/
		@Test
		void testSingularize_fish() {
				assertEquals("fish", Inflection.singularize("fish"));
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests if the method returns "sheep" for the word "sheep".
		*/
		@Test
		void testSingularize_sheep() {
				assertEquals("sheep", Inflection.singularize("sheep"));
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests if the method returns "table" for the word "tables".
		*/
		@Test
		void testSingularize_tables() {
				assertEquals("table", Inflection.singularize("tables"));
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests if the method returns "chair" for the word "chairs".
		*/
		@Test
		void testSingularize_chairs() {
				assertEquals("chair", Inflection.singularize("chairs"));
		}
}

// Inflection_7Test.java
package net.sourceforge.schemaspy.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Inflection}.
* It contains ten unit test cases for the {@link Inflection#match(String)} method.
*/
class Inflection_7Test {
		
		/**
		* Test case for the {@link Inflection#match(String)} method.
		* It tests if the method returns true for the word "equipment".
		*/
		@Test
		void testMatch_equipment() {
				assertTrue(Inflection.match("equipment"));
		}
		
		/**
		* Test case for the {@link Inflection#match(String)} method.
		* It tests if the method returns true for the word "information".
		*/
		@Test
		void testMatch_information() {
				assertTrue(Inflection.match("information"));
		}
		
		/**
		* Test case for the {@link Inflection#match(String)} method.
		* It tests if the method returns true for the word "rice".
		*/
		@Test
		void testMatch_rice() {
				assertTrue(Inflection.match("rice"));
		}
		
		/**
		* Test case for the {@link Inflection#match(String)} method.
		* It tests if the method returns true for the word "money".
		*/
		@Test
		void testMatch_money() {
				assertTrue(Inflection.match("money"));
		}
		
		/**
		* Test case for the {@link Inflection#match(String)} method.
		* It tests if the method returns true for the word "species".
		*/
		@Test
		void testMatch_species() {
				assertTrue(Inflection.match("species"));
		}
		
		/**
		* Test case for the {@link Inflection#match(String)} method.
		* It tests if the method returns true for the word "series".
		*/
		@Test
		void testMatch_series() {
				assertTrue(Inflection.match("series"));
		}
		
		/**
		* Test case for the {@link Inflection#match(String)} method.
		* It tests if the method returns true for the word "fish".
		*/
		@Test
		void testMatch_fish() {
				assertTrue(Inflection.match("fish"));
		}
		
		/**
		* Test case for the {@link Inflection#match(String)} method.
		* It tests if the method returns true for the word "sheep".
		*/
		@Test
		void testMatch_sheep() {
				assertTrue(Inflection.match("sheep"));
		}
		
		/**
		* Test case for the {@link Inflection#match(String)} method.
		* It tests if the method returns false for the word "table".
		*/
		@Test
		void testMatch_table() {
				assertFalse(Inflection.match("table"));