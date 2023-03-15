// Inflection_3Test.java
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
class Inflection_3Test {

		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests the singularization of the word "people".
		*/
		@Test
		void testSingularize_people() {
				String word = "people";
				String expected = "person";
				String actual = Inflection.singularize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests the singularization of the word "men".
		*/
		@Test
		void testSingularize_men() {
				String word = "men";
				String expected = "man";
				String actual = Inflection.singularize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests the singularization of the word "children".
		*/
		@Test
		void testSingularize_children() {
				String word = "children";
				String expected = "child";
				String actual = Inflection.singularize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests the singularization of the word "sexes".
		*/
		@Test
		void testSingularize_sexes() {
				String word = "sexes";
				String expected = "sex";
				String actual = Inflection.singularize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests the singularization of the word "moves".
		*/
		@Test
		void testSingularize_moves() {
				String word = "moves";
				String expected = "move";
				String actual = Inflection.singularize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests the singularization of the word "equipment".
		*/
		@Test
		void testSingularize_equipment() {
				String word = "equipment";
				String expected = "equipment";
				String actual = Inflection.singularize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests the singularization of the word "information".
		*/
		@Test
		void testSingularize_information() {
				String word = "information";
				String expected = "information";
				String actual = Inflection.singularize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests the singularization of the word "rice".
		*/
		@Test
		void testSingularize_rice() {
				String word = "rice";
				String expected = "rice";
				String actual = Inflection.singularize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests the singularization of the word "money".
		*/
		@Test
		void testSingularize_money() {
				String word = "money";
				String expected = "money";
				String actual = Inflection.singularize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests the singularization of the word "species".
		*/
		@Test
		void testSingularize_species() {
				String word = "species";
				String expected = "species";
				String actual = Inflection.singularize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests the singularization of the word "series".
		*/
		@Test
		void testSingularize_series() {
				String word = "series";
				String expected = "series";
				String actual = Inflection.singularize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests the singularization of the word "fish".
		*/
		@Test
		void testSingularize_fish() {
				String word = "fish";
				String expected = "fish";
				String actual = Inflection.singularize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#singularize(String)} method.
		* It tests the singularization of the word "sheep".
		*/
		@Test
		void testSingularize_sheep() {
				String word = "sheep";
				String expected = "sheep";
				String actual = Inflection.singularize(word);
				assertEquals(expected, actual);
		}
		
}

// Inflection_4Test.java
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
class Inflection_4Test {
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests the pluralization of the word "person".
		*/
		@Test
		void testPluralize_person() {
				String word = "person";
				String expected = "people";
				String actual = Inflection.pluralize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests the pluralization of the word "man".
		*/
		@Test
		void testPluralize_man() {
				String word = "man";
				String expected = "men";
				String actual = Inflection.pluralize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests the pluralization of the word "child".
		*/
		@Test
		void testPluralize_child() {
				String word = "child";
				String expected = "children";
				String actual = Inflection.pluralize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests the pluralization of the word "sex".
		*/
		@Test
		void testPluralize_sex() {
				String word = "sex";
				String expected = "sexes";
				String actual = Inflection.pluralize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests the pluralization of the word "move".
		*/
		@Test
		void testPluralize_move() {
				String word = "move";
				String expected = "moves";
				String actual = Inflection.pluralize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests the pluralization of the word "equipment".
		*/
		@Test
		void testPluralize_equipment() {
				String word = "equipment";
				String expected = "equipment";
				String actual = Inflection.pluralize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests the pluralization of the word "information".
		*/
		@Test
		void testPluralize_information() {
				String word = "information";
				String expected = "information";
				String actual = Inflection.pluralize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests the pluralization of the word "rice".
		*/
		@Test
		void testPluralize_rice() {
				String word = "rice";
				String expected = "rice";
				String actual = Inflection.pluralize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests the pluralization of the word "money".
		*/
		@Test
		void testPluralize_money() {
				String word = "money";
				String expected = "money";
				String actual = Inflection.pluralize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests the pluralization of the word "species".
		*/
		@Test
		void testPluralize_species() {
				String word = "species";
				String expected = "species";
				String actual = Inflection.pluralize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests the pluralization of the word "series".
		*/
		@Test
		void testPluralize_series() {
				String word = "series";
				String expected = "series";
				String actual = Inflection.pluralize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests the pluralization of the word "fish".
		*/
		@Test
		void testPluralize_fish() {
				String word = "fish";
				String expected = "fish";
				String actual = Inflection.pluralize(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#pluralize(String)} method.
		* It tests the pluralization of the word "sheep".
		*/
		@Test
		void testPluralize_sheep() {
				String word = "sheep";
				String expected = "sheep";
				String actual = Inflection.pluralize(word);
				assertEquals(expected, actual);
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
* It contains ten unit test cases for the {@link Inflection#isUncountable(String)} method.
*/
class Inflection_5Test {
		
		/**
		* Test case for the {@link Inflection#isUncountable(String)} method.
		* It tests the uncountability of the word "equipment".
		*/
		@Test
		void testIsUncountable_equipment() {
				String word = "equipment";
				boolean expected = true;
				boolean actual = Inflection.isUncountable(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#isUncountable(String)} method.
		* It tests the uncountability of the word "information".
		*/
		@Test
		void testIsUncountable_information() {
				String word = "information";
				boolean expected = true;
				boolean actual = Inflection.isUncountable(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#isUncountable(String)} method.
		* It tests the uncountability of the word "rice".
		*/
		@Test
		void testIsUncountable_rice() {
				String word = "rice";
				boolean expected = true;
				boolean actual = Inflection.isUncountable(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#isUncountable(String)} method.
		* It tests the uncountability of the word "money".
		*/
		@Test
		void testIsUncountable_money() {
				String word = "money";
				boolean expected = true;
				boolean actual = Inflection.isUncountable(word);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Inflection#isUncountable(String)} method.
		* It tests the uncountability of the word "species".
		