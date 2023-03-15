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
		void testReplace() {
				Inflection inflection = new Inflection("s$", "");
				assertEquals("", inflection.replace("s"));
				assertEquals("", inflection.replace("ss"));
				assertEquals("", inflection.replace("sss"));
				assertEquals("", inflection.replace("ssss"));
				assertEquals("", inflection.replace("sssss"));
				assertEquals("", inflection.replace("ssssss"));
				assertEquals("", inflection.replace("sssssss"));
				assertEquals("", inflection.replace("ssssssss"));
				assertEquals("", inflection.replace("sssssssss"));
				assertEquals("", inflection.replace("ssssssssss"));
		}
		
		/**
		* Test method for {@link Inflection#replace(String)}.
		*/
		@Test
		void testReplace2() {
				Inflection inflection = new Inflection("s$", "ss");
				assertEquals("ss", inflection.replace("s"));
				assertEquals("sss", inflection.replace("ss"));
				assertEquals("ssss", inflection.replace("sss"));
				assertEquals("sssss", inflection.replace("ssss"));
				assertEquals("ssssss", inflection.replace("sssss"));
				assertEquals("sssssss", inflection.replace("ssssss"));
				assertEquals("ssssssss", inflection.replace("sssssss"));
				assertEquals("sssssssss", inflection.replace("ssssssss"));
				assertEquals("ssssssssss", inflection.replace("sssssssss"));
				assertEquals("sssssssssss", inflection.replace("ssssssssss"));
		}
		
		/**
		* Test method for {@link Inflection#replace(String)}.
		*/
		@Test
		void testReplace3() {
				Inflection inflection = new Inflection("s$", "sss");
				assertEquals("sss", inflection.replace("s"));
				assertEquals("ssss", inflection.replace("ss"));
				assertEquals("sssss", inflection.replace("sss"));
				assertEquals("ssssss", inflection.replace("ssss"));
				assertEquals("sssssss", inflection.replace("sssss"));
				assertEquals("ssssssss", inflection.replace("ssssss"));
				assertEquals("sssssssss", inflection.replace("sssssss"));
				assertEquals("ssssssssss", inflection.replace("ssssssss"));
				assertEquals("sssssssssss", inflection.replace("sssssssss"));
				assertEquals("ssssssssssss", inflection.replace("ssssssssss"));
		}
		
		/**
		* Test method for {@link Inflection#replace(String)}.
		*/
		@Test
		void testReplace4() {
				Inflection inflection = new Inflection("s$", "ssss");
				assertEquals("ssss", inflection.replace("s"));
				assertEquals("sssss", inflection.replace("ss"));
				assertEquals("ssssss", inflection.replace("sss"));
				assertEquals("sssssss", inflection.replace("ssss"));
				assertEquals("ssssssss", inflection.replace("sssss"));
				assertEquals("sssssssss", inflection.replace("ssssss"));
				assertEquals("ssssssssss", inflection.replace("sssssss"));
				assertEquals("sssssssssss", inflection.replace("ssssssss"));
				assertEquals("ssssssssssss", inflection.replace("sssssssss"));
				assertEquals("sssssssssssss", inflection.replace("ssssssssss"));
		}
		
		/**
		* Test method for {@link Inflection#replace(String)}.
		*/
		@Test
		void testReplace5() {
				Inflection inflection = new Inflection("s$", "sssss");
				assertEquals("sssss", inflection.replace("s"));
				assertEquals("ssssss", inflection.replace("ss"));
				assertEquals("sssssss", inflection.replace("sss"));
				assertEquals("ssssssss", inflection.replace("ssss"));
				assertEquals("sssssssss", inflection.replace("sssss"));
				assertEquals("ssssssssss", inflection.replace("ssssss"));
				assertEquals("sssssssssss", inflection.replace("sssssss"));
				assertEquals("ssssssssssss", inflection.replace("ssssssss"));
				assertEquals("sssssssssssss", inflection.replace("sssssssss"));
				assertEquals("ssssssssssssss", inflection.replace("ssssssssss"));
		}
		
		/**
		* Test method for {@link Inflection#replace(String)}.
		*/
		@Test
		void testReplace6() {
				Inflection inflection = new Inflection("s$", "ssssss");
				assertEquals("ssssss", inflection.replace("s"));
				assertEquals("sssssss", inflection.replace("ss"));
				assertEquals("ssssssss", inflection.replace("sss"));
				assertEquals("sssssssss", inflection.replace("ssss"));
				assertEquals("ssssssssss", inflection.replace("sssss"));
				assertEquals("sssssssssss", inflection.replace("ssssss"));
				assertEquals("ssssssssssss", inflection.replace("sssssss"));
				assertEquals("sssssssssssss", inflection.replace("ssssssss"));
				assertEquals("ssssssssssssss", inflection.replace("sssssssss"));
				assertEquals("sssssssssssssss", inflection.replace("ssssssssss"));
		}
		
		/**
		* Test method for {@link Inflection#replace(String)}.
		*/
		@Test
		void testReplace7() {
				Inflection inflection = new Inflection("s$", "sssssss");
				assertEquals("sssssss", inflection.replace("s"));
				assertEquals("ssssssss", inflection.replace("ss"));
				assertEquals("sssssssss", inflection.replace("sss"));
				assertEquals("ssssssssss", inflection.replace("ssss"));
				assertEquals("sssssssssss", inflection.replace("sssss"));
				assertEquals("ssssssssssss", inflection.replace("ssssss"));
				assertEquals("sssssssssssss", inflection.replace("sssssss"));
				assertEquals("ssssssssssssss", inflection.replace("ssssssss"));
				assertEquals("sssssssssssssss", inflection.replace("sssssssss"));
				assertEquals("ssssssssssssssss", inflection.replace("ssssssssss"));
		}
		
		/**
		* Test method for {@link Inflection#replace(String)}.
		*/
		@Test
		void testReplace8() {
				Inflection inflection = new Inflection("s$", "ssssssss");
				assertEquals("ssssssss", inflection.replace("s"));
				assertEquals("sssssssss", inflection.replace("ss"));
				assertEquals("ssssssssss", inflection.replace("sss"));
				assertEquals("sssssssssss", inflection.replace("ssss"));
				assertEquals("ssssssssssss", inflection.replace("sssss"));
				assertEquals("sssssssssssss", inflection.replace("ssssss"));
				assertEquals("ssssssssssssss", inflection.replace("sssssss"));
				assertEquals("sssssssssssssss", inflection.replace("ssssssss"));
				assertEquals("ssssssssssssssss", inflection.replace("sssssssss"));
				assertEquals("sssssssssssssssss", inflection.replace("ssssssssss"));
		}
		
		/**
		* Test method for {@link Inflection#replace(String)}.
		*/
		@Test
		void testReplace9() {
				Inflection inflection = new Inflection("s$", "sssssssss");
				assertEquals("sssssssss", inflection.replace("s"));
				assertEquals("ssssssssss", inflection.replace("ss"));
				assertEquals("sssssssssss", inflection.replace("sss"));
				assertEquals("