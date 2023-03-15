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
		* It tests the