// CategoryMembersFull_1Test.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.CategoryItem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CategoryMembersFull}.
* It contains ten unit test cases for the {@link CategoryMembersFull#processAllReturningText(String)} method.
*/
class CategoryMembersFull_1Test {

		/**
		 * Test case for {@link CategoryMembersFull#processAllReturningText(String)} method.
		 * @throws ActionException on any kind of problems
		 * @throws ProcessException on any kind of problems
		 */
		@Test
		void testProcessAllReturningText() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				String s = cmf.processAllReturningText("");
				assertEquals("", s);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#processAllReturningText(String)} method.
		 * @throws ActionException on any kind of problems
		 * @throws ProcessException on any kind of problems
		 */
		@Test
		void testProcessAllReturningText1() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				String s = cmf.processAllReturningText("<api><query-continue><categorymembers cmcontinue=\"page|2f76657273696f6e3a76657273696f6e2d6d6f6469666965642f76657273696f6e2d6d6f6469666965642d6d65737361676573|\" /></query-continue></api>");
				assertEquals("", s);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#processAllReturningText(String)} method.
		 * @throws ActionException on any kind of problems
		 * @throws ProcessException on any kind of problems
		 */
		@Test
		void testProcessAllReturningText2() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				String s = cmf.processAllReturningText("<api><query><categorymembers><cm pageid=\"1\" ns=\"0\" title=\"Main Page\" /></categorymembers></query></api>");
				assertEquals("", s);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#processAllReturningText(String)} method.
		 * @throws ActionException on any kind of problems
		 * @throws ProcessException on any kind of problems
		 */
		@Test
		void testProcessAllReturningText3() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				String s = cmf.processAllReturningText("<api><query><categorymembers><cm pageid=\"1\" ns=\"0\" title=\"Main Page\" /><cm pageid=\"2\" ns=\"0\" title=\"Test\" /></categorymembers></query></api>");
				assertEquals("", s);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#processAllReturningText(String)} method.
		 * @throws ActionException on any kind of problems
		 * @throws ProcessException on any kind of problems
		 */
		@Test
		void testProcessAllReturningText4() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				String s = cmf.processAllReturningText("<api><query><categorymembers><cm pageid=\"1\" ns=\"0\" title=\"Main Page\" /><cm pageid=\"2\" ns=\"0\" title=\"Test\" /><cm pageid=\"3\" ns=\"0\" title=\"Test1\" /></categorymembers></query></api>");
				assertEquals("", s);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#processAllReturningText(String)} method.
		 * @throws ActionException on any kind of problems
		 * @throws ProcessException on any kind of problems
		 */
		@Test
		void testProcessAllReturningText5() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				String s = cmf.processAllReturningText("<api><query><categorymembers><cm pageid=\"1\" ns=\"0\" title=\"Main Page\" /><cm pageid=\"2\" ns=\"0\" title=\"Test\" /><cm pageid=\"3\" ns=\"0\" title=\"Test1\" /><cm pageid=\"4\" ns=\"0\" title=\"Test2\" /></categorymembers></query></api>");
				assertEquals("", s);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#processAllReturningText(String)} method.
		 * @throws ActionException on any kind of problems
		 * @throws ProcessException on any kind of problems
		 */
		@Test
		void testProcessAllReturningText6() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				String s = cmf.processAllReturningText("<api><query><categorymembers><cm pageid=\"1\" ns=\"0\" title=\"Main Page\" /><cm pageid=\"2\" ns=\"0\" title=\"Test\" /><cm pageid=\"3\" ns=\"0\" title=\"Test1\" /><cm pageid=\"4\" ns=\"0\" title=\"Test2\" /><cm pageid=\"5\" ns=\"0\" title=\"Test3\" /></categorymembers></query></api>");
				assertEquals("", s);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#processAllReturningText(String)} method.
		 * @throws ActionException on any kind of problems
		 * @throws ProcessException on any kind of problems
		 */
		@Test
		void testProcessAllReturningText7() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				String s = cmf.processAllReturningText("<api><query><categorymembers><cm pageid=\"1\" ns=\"0\" title=\"Main Page\" /><cm pageid=\"2\" ns=\"0\" title=\"Test\" /><cm pageid=\"3\" ns=\"0\" title=\"Test1\" /><cm pageid=\"4\" ns=\"0\" title=\"Test2\" /><cm pageid=\"5\" ns=\"0\" title=\"Test3\" /><cm pageid=\"6\" ns=\"0\" title=\"Test4\" /></categorymembers></query></api>");
				assertEquals("", s);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#processAllReturningText(String)} method.
		 * @throws ActionException on any kind of problems
		 * @throws ProcessException on any kind of problems
		 */
		@Test
		void testProcessAllReturningText8() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				String s = cmf.processAllReturningText("<api><query><categorymembers><cm pageid=\"1\" ns=\"0\" title=\"Main Page\" /><cm pageid=\"2\" ns=\"0\" title=\"Test\" /><cm pageid=\"3\" ns=\"0\" title=\"Test1\" /><cm pageid=\"4\" ns=\"0\" title=\"Test2\" /><cm pageid=\"5\" ns=\"0\" title=\"Test3\" /><cm pageid=\"6\" ns=\"0\" title=\"Test4\" /><cm pageid=\"7\" ns=\"0\" title=\"Test5\" /></categorymembers></query></api>");
				assertEquals("", s);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#processAllReturningText(String)} method.
		 * @throws ActionException on any kind of problems
		 * @throws ProcessException on any kind of problems
		 */
		@Test
		void testProcessAllReturningText9() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				String s = cmf.processAllReturningText("<api><query><categorymembers><cm pageid=\"1\" ns=\"0\" title=\"Main Page\" /><cm pageid=\"2\" ns=\"0\" title=\"Test\" /><cm pageid=\"3\" ns=\"0\" title=\"Test1\" /><cm pageid=\"4\" ns=\"0\" title=\"Test2\" /><cm pageid=\"5\" ns=\"0\" title=\"Test3\" /><cm pageid=\"6\" ns=\"0\" title=\"Test4\" /><cm pageid=\"7\" ns=\"0\" title=\"Test5\" /><cm pageid=\"8\" ns=\"0\" title=\"Test6\" /></categorymembers></query></api>");
				assertEquals("", s);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#processAllReturningText(String)} method.
		 * @throws ActionException on any kind of problems
		 * @throws ProcessException on any kind of problems
		 */
		@Test
		void testProcessAllReturningText10() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				String s = cmf.processAllReturningText("<api><query><categorymembers><cm pageid=\"1\" ns=\"0\" title=\"Main Page\" /><cm pageid=\"2\" ns=\"0\" title=\"Test\" /><cm pageid=\"3\" ns=\"0\" title=\"Test1\" /><cm pageid=\"4\" ns=\"0\" title=\"Test2\" /><cm pageid=\"5\" ns=\"0\" title=\"Test3\" /><cm pageid=\"6\" ns=\"0\" title=\"Test4\" /><cm pageid=\"7\" ns=\"0\" title=\"Test5\" /><cm pageid=\"8\" ns=\"0\" title=\"Test6\" /><cm pageid=\"9\" ns=\"0\" title=\"Test7\" /></categorymembers></query></api>");
				assertEquals("", s);
		}
		
}

// CategoryMembersFull_2Test.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.CategoryItem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CategoryMembersFull}.
* It contains ten unit test cases for the {@link CategoryMembersFull#processAllReturningText(String)} method.
*/
class CategoryMembersFull_2Test {
		
		/**
		 * Test case for {@link CategoryMembersFull#processAllReturningText(String)} method.
		 * @throws ActionException on any kind of problems
		 * @throws ProcessException on any kind of problems
		 */
		@Test
		void testProcessAllReturningText() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				String s = cmf.processAllReturningText("");
				assertEquals("", s);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#processAllReturningText(String)} method.
		 * @throws ActionException on any kind of problems
		 * @throws ProcessException on any kind of problems
		 */
		@Test
		void testProcessAllReturningText1() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				String s = cmf.processAllReturningText("<api><query-continue><categorymembers cmcontinue=\"page|2f76657273696f6e3a76657273696f6e2d6d6f6469666965642f76657273696f6e2d6d6f6469666965642d6d65737361676573|\" /></query-continue></api>");
				assertEquals("", s);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#processAllReturningText(String)} method.
		 * @throws ActionException on any kind of problems
		 * @throws ProcessException on any kind of problems
		 */
		@Test
		void testProcessAllReturningText2() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				String s = cmf.processAllReturningText("<api><query><categorymembers><cm pageid=\"1\" ns=\"0\" title=\"Main Page\" /></categorymembers></query></api>");
				assertEquals("", s);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#processAllReturningText(String)} method.
		 * @throws ActionException on any kind of problems
		 * @