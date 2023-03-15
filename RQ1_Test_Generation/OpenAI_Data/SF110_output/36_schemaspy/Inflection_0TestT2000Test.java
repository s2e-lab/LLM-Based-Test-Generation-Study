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
		 * Return the