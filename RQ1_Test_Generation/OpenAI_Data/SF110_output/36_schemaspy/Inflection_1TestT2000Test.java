// Inflection_1Test.java
package net.sourceforge.schemaspy.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Inflection}.
* It contains ten unit test cases for the {@link Inflection#replace(String)} method.
*/
class Inflection_1Test {

		private static final List<Inflection> plural = new ArrayList<Inflection>();
		private static final List<Inflection> singular = new ArrayList<Inflection>();
		private static final List<String> uncountable = new ArrayList<String>();
		
		static {
				plural("$", "s");
				plural("s$", "s");
				plural("(ax|test)is$", "$1es");
				plural("(octop|vir)us$", "$1i");
				plural("(alias|status)$", "$1es");
				plural("(bu)s$", "$1ses");
				plural("(buffal|tomat)o$", "$1oes");
				plural("([ti])um$", "$1a");
				plural("sis$", "ses");
				plural("(?:([^f])fe|([lr])f)$", "$1$2ves");
				plural("(hive)$", "$1s");
				plural("([^aeiouy]|qu)y$", "$1ies");
				//plural("([^aeiouy]|qu)ies$", "$1y");
				plural("(x|ch|ss|sh)$", "$1es");
				plural("(matr|vert|ind)ix|ex$", "$1ices");
				plural("([m|l])ouse$", "$1ice");
				plural("^(ox)$", "$1en");
				plural("(quiz)$", "$1zes");
				singular("s$", "");
				singular("(n)ews$", "$1ews");
				singular("([ti])a$", "$1um");
				singular("((a)naly|(b)a|(d)iagno|(p)arenthe|(p)rogno|(s)ynop|(t)he)ses$", "$1$2sis");
				singular("(^analy)ses$", "$1sis");
				singular("([^f])ves$", "$1fe");
				singular("(hive)s$", "$1");
				singular("(tive)s$", "$1");
				singular("([lr])ves$", "$1f");
				singular("([^aeiouy]|qu)ies$", "$1y");
				singular("(s)eries$", "$1eries");
				singular("(m)ovies$", "$1ovie");
				singular("(x|ch|ss|sh)es$", "$1");
				singular("([m|l])ice$", "$1ouse");
				singular("(bus)es$", "$1");
				singular("(o)es$", "$1");
				singular("(shoe)s$", "$1");
				singular("(cris|ax|test)es$", "$1is");
				singular("(octop|vir)i$", "$1us");
				singular("(alias|status)es$", "$1");
				singular("^(ox)en", "$1");
				singular("(vert|ind)ices$", "$1ex");
				singular("(matr)ices$", "$1ix");
				singular("(quiz)zes$", "$1");
				// irregular
				irregular("person", "people");
				irregular("man", "men");
				irregular("child", "children");
				irregular("sex", "sexes");
				irregular("move", "moves");
				uncountable("equipment");
				uncountable("information");
				uncountable("rice");
				uncountable("money");
				uncountable("species");
				uncountable("series");
				uncountable("fish");
				uncountable("sheep");
				//Collections.reverse(singular);
				//Collections.reverse(plural);
		}
		
		private static void plural(String pattern, String replacement) {
				plural.add(0, new Inflection(pattern, replacement));
		}
		
		private static void singular(String pattern, String replacement) {
				singular.add(0, new Inflection(pattern, replacement));
		}
		
		private static void irregular(String s, String p) {
				plural("(" + s.substring(0, 1) + ")" + s.substring(1) + "$", "$1" + p.substring(1));
				singular("(" + p.substring(0, 1) + ")" + p.substring(1) + "$", "$1" + s.substring(1));
		}
		
		private static void uncountable(String word) {
				uncountable.add(word);
		}
		
		/**
		* Test method for {@link Inflection#replace(String)}.
		*/
		@Test
		void testReplace_1() {
				Inflection inflection = new Inflection("s$", "");
				assertEquals("", inflection.replace("s"));
		}
		
		/**
		* Test method for {@link Inflection#replace(String)}.
		*/
		@Test
		void testReplace_2() {
				Inflection inflection = new Inflection("(n)ews$", "$1ews");
				assertEquals("news", inflection.replace("news"));
		}
		
		/**
		* Test method for {@link Inflection#replace(String)}.
		*/
		@Test
		void testReplace_3() {
				Inflection inflection = new Inflection("([ti])a$", "$1um");
				assertEquals("tum", inflection.replace("ta"));
		}
		
		/**
		* Test method for {@link Inflection#replace(String)}.
		*/
		@Test
		void testReplace_4() {
				Inflection inflection = new Inflection("((a)naly|(b)a|(d)iagno|(p)arenthe|(p)rogno|(s)ynop|(t)he)ses$", "$1$2sis");
				assertEquals("analysis", inflection.replace("analyses"));
		}
		
		/**
		* Test method for {@link Inflection#replace(String)}.
		*/
		@Test
		void testReplace_5() {
				Inflection inflection = new Inflection("(^analy)ses$", "$1sis");
				assertEquals("analysis", inflection.replace("analyses"));
		}
		
		/**
		* Test method for {@link Inflection#replace(String)}.
		*/
		@Test
		void testReplace_6() {
				Inflection inflection = new Inflection("([^f])ves$", "$1fe");
				assertEquals("wife", inflection.replace("wives"));
		}
		
		/**
		* Test method for {@link Inflection#replace(String)}.
		*/
		@Test
		void testReplace_7() {
				Inflection inflection = new Inflection("(h