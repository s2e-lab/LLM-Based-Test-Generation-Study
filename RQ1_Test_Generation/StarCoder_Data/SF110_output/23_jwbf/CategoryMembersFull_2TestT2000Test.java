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
* It contains ten unit test cases for the {@link CategoryMembersFull#hasNext()} method.
*/
class CategoryMembersFull_2Test {
	/**
			* Test method for {@link net.sourceforge.jwbf.mediawiki.actions.queries.CategoryMembersFull#hasNext()}.
			* @throws JwbfException 
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext_001() throws JwbfException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki-japi-test/api.php");
				CategoryMembersFull testee = new CategoryMembersFull(bot, "Category:Test_Category_Members_Full_2");
				assertTrue(testee.hasNext());
			}

			/**
			* Test method for {@link net.sourceforge.jwbf.mediawiki.actions.queries.CategoryMembersFull#hasNext()}.
			* @throws JwbfException 
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext_002() throws JwbfException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki-japi-test/api.php");
				CategoryMembersFull testee = new CategoryMembersFull(bot, "Category:Test_Category_Members_Full_2");
				testee.next();
				assertTrue(testee.hasNext());
			}

			/**
			* Test method for {@link net.sourceforge.jwbf.mediawiki.actions.queries.CategoryMembersFull#hasNext()}.
			* @throws JwbfException 
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext_003() throws JwbfException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki-japi-test/api.php");
				CategoryMembersFull testee = new CategoryMembersFull(bot, "Category:Test_Category_Members_Full_2");
				testee.next();
				testee.next();
				assertTrue(testee.hasNext());
			}

			/**
			* Test method for {@link net.sourceforge.jwbf.mediawiki.actions.queries.CategoryMembersFull#hasNext()}.
			* @throws JwbfException 
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext_004() throws JwbfException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki-japi-test/api.php");
				CategoryMembersFull testee = new CategoryMembersFull(bot, "Category:Test_Category_Members_Full_2");
				testee.next();
				testee.next();
				testee.next();
				assertTrue(testee.hasNext());
			}

			/**
			* Test method for {@link net.sourceforge.jwbf.mediawiki.actions.queries.CategoryMembersFull#hasNext()}.
			* @throws JwbfException 
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext_005() throws JwbfException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki-japi-test/api.php");
				CategoryMembersFull testee = new CategoryMembersFull(bot, "Category:Test_Category_Members_Full_2");
				testee.next();
				testee.next();
				testee.next();
				testee.next();
				assertTrue(testee.hasNext());
			}

			/**
			* Test method for {@link net.sourceforge.jwbf.mediawiki.actions.queries.CategoryMembersFull#hasNext()}.
			* @throws JwbfException 
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext_006() throws JwbfException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki-japi-test/api.php");
				CategoryMembersFull testee = new CategoryMembersFull(bot, "Category:Test_Category_Members_Full_2");
				testee.next();
				testee.next();
				testee.next();
				testee.next();
				testee.next();
				assertTrue(testee.hasNext());
			}

			/**
			* Test method for {@link net.sourceforge.jwbf.mediawiki.actions.queries.CategoryMembersFull#hasNext()}.
			* @throws JwbfException 
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext_007() throws JwbfException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki-japi-test/api.php");
				CategoryMembersFull testee = new CategoryMembersFull(bot, "Category:Test_Category_Members_Full_2");
				testee.next();
				testee.next();
				testee.next();
				testee.next();
				testee.next();
				testee.next();
				assertTrue(testee.hasNext());
			}

			/**
			* Test method for {@link net.sourceforge.jwbf.mediawiki.actions.queries.CategoryMembersFull#hasNext()}.
			* @throws JwbfException 
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext_008() throws JwbfException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki-japi-test/api.php");
				CategoryMembersFull testee = new CategoryMembersFull(bot, "Category:Test_Category_Members_Full_2");
				testee.next();
				testee.next();
				testee.next();
				testee.next();
				testee.next();
				testee.next();
				testee.next();
				assertTrue(testee.hasNext());
			}

			/**
			* Test method for {@link net.sourceforge.jwbf.mediawiki.actions.queries.CategoryMembersFull#hasNext()}.
			* @throws JwbfException 
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext_009() throws JwbfException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki-japi-test/api.php");
				CategoryMembersFull testee = new CategoryMembersFull(bot, "Category:Test_Category_Members_Full_2");
				testee.next();
				testee.next();
				testee.next();
				testee.next();
				testee.next();
				testee.next();
				testee.next();
				testee.next();
				assertTrue(testee.hasNext());
			}

			/**
			* Test method for {@link net.sourceforge.jwbf.mediawiki.actions.queries.CategoryMembersFull#hasNext()}.
			* @throws JwbfException 
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext_010() throws JwbfException {
				MediaWikiBot bot = new MediaWikiBot("http