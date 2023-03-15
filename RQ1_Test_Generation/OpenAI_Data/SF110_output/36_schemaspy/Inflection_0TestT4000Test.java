// Inflection_0Test.java
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
class Inflection_0Test {

		private static final List<Inflection> plural = new ArrayList<Inflection>();
		
		private static final List<Inflection> singular = new ArrayList<Inflection>();
		
		private static final List<String> uncountable = new ArrayList<String>();
		
		static {
				// plural is "singular to plural form"
				// singular is "plural to singular form"
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
		
		private final String pattern;
		
		private final String replacement;
		
		private final boolean ignoreCase;
		
		public Inflection_0Test(String pattern) {
				this(pattern, null, true);
		}
		
		public Inflection_0Test(String pattern, String replacement) {
				this(pattern, replacement, true);
		}
		
		public Inflection_0Test(String pattern, String replacement, boolean ignoreCase) {
				this.pattern = pattern;
				this.replacement = replacement;
				this.ignoreCase = ignoreCase;
		}
		
		private static void plural(String pattern, String replacement) {
				plural.add(0, new Inflection_0Test(pattern, replacement));
		}
		
		private static void singular(String pattern, String replacement) {
				singular.add(0, new Inflection_0Test(pattern, replacement));
		}
		
		private static void irregular(String s, String p) {
				plural("(" + s.substring(0, 1) + ")" + s.substring(1) + "$", "$1" + p.substring(1));
				singular("(" + p.substring(0, 1) + ")" + p.substring(1) + "$", "$1" + s.substring(1));
		}
		
		private static void uncountable(String word) {
				uncountable.add(word);
		}
		
		/**
		 * Does the given word match?
		 * @param word The word
		 * @return True if it matches the inflection pattern
		 */
		public boolean match(String word) {
				int flags = 0;
				if (ignoreCase) {
						flags = flags | Pattern.CASE_INSENSITIVE;
				}
				return Pattern.compile(pattern, flags).matcher(word).find();
		}
		
		/**
		 * Replace the word with its pattern.
		 * @param word The word
		 * @return The result
		 */
		public String replace(String word) {
				int flags = 0;
				if (ignoreCase) {
						flags = flags | Pattern.CASE_INSENSITIVE;
				}
				return Pattern.compile(pattern, flags).matcher(word).replaceAll(replacement);
		}
		
		/**
		 * Return the pluralized version of a word.
		 * @param word The word
		 * @return The pluralized word
		 */
		public static String pluralize(String word) {
				if (Inflection_0Test.isUncountable(word)) {
						return word;
				}
				for (Inflection_0Test inflection : plural) {
						if (inflection.match(word)) {
								return inflection.replace(word);
						}
				}
				return word;
		}
		
		/**
		 * Return the singularized version of a word.
		 * @param word The word
		 * @return The singularized word
		 */
		public static String singularize(String word) {
				if (Inflection_0Test.isUncountable(word)) {
						return word;
				}
				for (Inflection_0Test inflection : singular) {
						//System.out.println(word + " matches " + inflection.pattern + "? (ignore case: " + inflection.ignoreCase + ")");
						if (inflection.match(word)) {
								//System.out.println("match!");
								return inflection.replace(word);
						}
				}
				return word;
		}
		
		/**
		 * Return true if the word is uncountable.
		 * @param word The word
		 * @return True if it is uncountable
		 */
		public static boolean isUncountable(String word) {
				for (String w : uncountable) {
						if (w.equalsIgnoreCase(word))
								return true;
				}
				return false;
		}
		
		@Test
		void testMatch_0() {
				Inflection_0Test inflection = new Inflection_0Test("$", "s", true);
				assertTrue(inflection.match(""));
		}
		
		@Test
		void testMatch_1() {
				Inflection_0Test inflection = new Inflection_0Test("s$", "s", true);
				assertTrue(inflection.match("s"));
		}
		
		@Test
		void testMatch_2() {
				Inflection_0Test inflection = new Inflection_0Test("(ax|test)is$", "$1es", true);
				assertTrue(inflection.match("ax"));
		}
		
		@Test
		void testMatch_3() {
				Inflection_0Test inflection = new Inflection_0Test("(octop|vir)us$", "$1i", true);
				assertTrue(inflection.match("octopus"));
		}
		
		@Test
		void testMatch_4() {
				Inflection_0Test inflection = new Inflection_0Test("(alias|status)$", "$1es", true);
				assertTrue(inflection.match("alias"));
		}
		
		@Test
		void testMatch_5() {
				Inflection_0Test inflection = new Inflection_0Test("(bu)s$", "$1ses", true);
				assertTrue(inflection.match("bus"));
		}
		
		@Test
		void testMatch_6() {
				Inflection_0Test inflection = new Inflection_0Test("(buffal|tomat)o$", "$1oes", true);
				assertTrue(inflection.match("tomato"));
		}
		
		@Test
		void testMatch_7() {
				Inflection_0Test inflection = new Inflection_0Test("([ti])um$", "$1a", true);
				assertTrue(inflection.match("tum"));
		}
		
		@Test
		void testMatch_8() {
				Inflection_0Test inflection = new Inflection_0Test("sis$", "ses", true);
				assertTrue(inflection.match("sis"));
		}
		
		@Test
		void testMatch_9() {
				Inflection_0Test inflection = new Inflection_0Test("(?:([^f])fe|([lr])f)$", "$1$2ves", true);
				assertTrue(inflection.match("lf"));
		}
		
		@Test
		void testMatch_10() {
				Inflection_0Test inflection = new Inflection_0Test("(hive)$", "$1s", true);
				assertTrue(inflection.match("hive"));
		}
		
		@Test
		void testMatch_11() {
				Inflection_0Test inflection = new Inflection_0Test("([^aeiouy]|qu)y$", "$1ies", true);
				assertTrue(inflection.match("quy"));
		}
		
		@Test
		void testMatch_12() {
				Inflection_0Test inflection = new Inflection_0Test("(x|ch|ss|sh)$", "$1es", true);
				assertTrue(inflection.match("x"));
		}
		
		@Test
		void testMatch_13() {
				Inflection_0Test inflection = new Inflection_0Test("(matr|vert|ind)ix|ex$", "$1ices", true);
				assertTrue(inflection.match("matrix"));
		}
		
		@Test
		void testMatch_14() {
				Inflection_0Test inflection = new Inflection_0Test("([m|l])ouse$", "$1ice", true);
				assertTrue(inflection.match("mouse"));
		}
		
		@Test
		void testMatch_15() {
				Inflection_0Test inflection = new Inflection_0Test("^(ox)$", "$1en", true);
				assertTrue(inflection.match("ox"));
		}
		
		@Test
		void testMatch_16() {
				Inflection_0Test inflection = new Inflection_0Test("(quiz)$", "$1zes", true);
				assertTrue(inflection.match("quiz"));
		}
		
		@Test
		void testMatch_17() {
				Inflection_0Test inflection = new Inflection_0Test("s$", "", true);
				assertTrue(inflection.match("s"));
		}
		
		@Test
		void testMatch_18() {
				Inflection_0Test inflection = new Inflection_0Test("(n)ews$", "$1ews", true);
				assertTrue(inflection.match("news"));
		}
		
		@Test
		void testMatch_19() {
				Inflection_0Test inflection = new Inflection_0Test("([ti])a$", "$1um", true);
				assertTrue(inflection.match("tia"));
		}
		
		@Test
		void testMatch_20() {
				Inflection_0Test inflection = new Inflection_0Test("((a)naly|(b)a|(d)iagno|(p)arenthe|(p)rogno|(s)ynop|(t)he)ses$", "$1$2sis", true);
				assertTrue(inflection.match("analysis"));
		}
		
		@Test
		void testMatch_21() {
				Inflection_0Test inflection = new Inflection_0Test("(^analy)ses$", "$1sis", true);
				assertTrue(inflection.match("analyses"));
		}
		
		@Test
		void testMatch_22() {
				Inflection_0Test inflection = new Inflection_0Test("([^f])