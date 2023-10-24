// CategoryMembersFull_0Test.java
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
* It contains ten unit test cases for the {@link CategoryMembersFull#iterator()} method.
*/
class CategoryMembersFull_0Test {
	/**
			* Test method for {@link net.sourceforge.jwbf.mediawiki.actions.queries.CategoryMembersFull#iterator()}.
			* @throws JwbfException 
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testIterator_001() throws JwbfException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki-japi-test/api.php");
				CategoryMembersFull instance = new CategoryMembersFull(bot, "Category:Test_Category_001");
				Iterator<CategoryItem> result = instance.iterator();
				assertNotNull(result);
				assertTrue(result.hasNext());
				CategoryItem ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_001", ci.getTitle());
				assertEquals(1, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_002", ci.getTitle());
				assertEquals(2, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_003", ci.getTitle());
				assertEquals(3, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_004", ci.getTitle());
				assertEquals(4, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_005", ci.getTitle());
				assertEquals(5, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_006", ci.getTitle());
				assertEquals(6, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_007", ci.getTitle());
				assertEquals(7, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_008", ci.getTitle());
				assertEquals(8, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_009", ci.getTitle());
				assertEquals(9, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_010", ci.getTitle());
				assertEquals(10, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertFalse(result.hasNext());
			}

			/**
			* Test method for {@link net.sourceforge.jwbf.mediawiki.actions.queries.CategoryMembersFull#iterator()}.
			* @throws JwbfException 
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testIterator_002() throws JwbfException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki-japi-test/api.php");
				CategoryMembersFull instance = new CategoryMembersFull(bot, "Category:Test_Category_002");
				Iterator<CategoryItem> result = instance.iterator();
				assertNotNull(result);
				assertTrue(result.hasNext());
				CategoryItem ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_001", ci.getTitle());
				assertEquals(1, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_002", ci.getTitle());
				assertEquals(2, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_003", ci.getTitle());
				assertEquals(3, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_004", ci.getTitle());
				assertEquals(4, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_005", ci.getTitle());
				assertEquals(5, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_006", ci.getTitle());
				assertEquals(6, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_007", ci.getTitle());
				assertEquals(7, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_008", ci.getTitle());
				assertEquals(8, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_009", ci.getTitle());
				assertEquals(9, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_010", ci.getTitle());
				assertEquals(10, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertFalse(result.hasNext());
			}

			/**
			* Test method for {@link net.sourceforge.jwbf.mediawiki.actions.queries.CategoryMembersFull#iterator()}.
			* @throws JwbfException 
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testIterator_003() throws JwbfException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki-japi-test/api.php");
				CategoryMembersFull instance = new CategoryMembersFull(bot, "Category:Test_Category_003");
				Iterator<CategoryItem> result = instance.iterator();
				assertNotNull(result);
				assertTrue(result.hasNext());
				CategoryItem ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_001", ci.getTitle());
				assertEquals(1, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_002", ci.getTitle());
				assertEquals(2, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_003", ci.getTitle());
				assertEquals(3, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				assertTrue(result.hasNext());
				ci = result.next();
				assertNotNull(ci);
				assertEquals("Test_Page_004", ci.getTitle());
			