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
		 * Test case for {@link CategoryMembersFull#iterator()}
		 * @throws ProcessException 
		 * @throws ActionException 
		 * @throws JwbfException 
		 */
		@Test
		void testIterator() throws JwbfException, ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Main_topic_classifications");
				Iterator<CategoryItem> it = cmf.iterator();
				assertTrue(it.hasNext());
				CategoryItem ci = it.next();
				assertEquals("Category:Main topic classifications", ci.getTitle());
				assertEquals(14, ci.getPageid());
				assertEquals(14, ci.getNamespace());
				assertTrue(it.hasNext());
				ci = it.next();
				assertEquals("Category:Wikipedia categories", ci.getTitle());
				assertEquals(15, ci.getPageid());
				assertEquals(14, ci.getNamespace());
				assertTrue(it.hasNext());
				ci = it.next();
				assertEquals("Category:Wikipedia categories by topic", ci.getTitle());
				assertEquals(16, ci.getPageid());
				assertEquals(14, ci.getNamespace());
				assertTrue(it.hasNext());
				ci = it.next();
				assertEquals("Category:Wikipedia categories by topic with auto-assessed-class articles", ci.getTitle());
				assertEquals(17, ci.getPageid());
				assertEquals(14, ci.getNamespace());
				assertTrue(it.hasNext());
				ci = it.next();
				assertEquals("Category:Wikipedia categories by topic with auto-assessed-class articles and importance parameters", ci.getTitle());
				assertEquals(18, ci.getPageid());
				assertEquals(14, ci.getNamespace());
				assertTrue(it.hasNext());
				ci = it.next();
				assertEquals("Category:Wikipedia categories by topic with auto-assessed-class articles and importance parameters - top", ci.getTitle());
				assertEquals(19, ci.getPageid());
				assertEquals(14, ci.getNamespace());
				assertTrue(it.hasNext());
				ci = it.next();
				assertEquals("Category:Wikipedia categories by topic with auto-assessed-class articles and importance parameters - high", ci.getTitle());
				assertEquals(20, ci.getPageid());
				assertEquals(14, ci.getNamespace());
				assertTrue(it.hasNext());
				ci = it.next();
				assertEquals("Category:Wikipedia categories by topic with auto-assessed-class articles and importance parameters - mid", ci.getTitle());
				assertEquals(21, ci.getPageid());
				assertEquals(14, ci.getNamespace());
				assertTrue(it.hasNext());
				ci = it.next();
				assertEquals("Category:Wikipedia categories by topic with auto-assessed-class articles and importance parameters - low", ci.getTitle());
				assertEquals(22, ci.getPageid());
				assertEquals(14, ci.getNamespace());
				assertTrue(it.hasNext());
				ci = it.next();
				assertEquals("Category:Wikipedia categories by topic with auto-assessed-class articles and importance parameters - bottom", ci.getTitle());
				assertEquals(23, ci.getPageid());
				assertEquals(14, ci.getNamespace());
				assertTrue(it.hasNext());
				ci = it.next();
				assertEquals("Category:Wikipedia categories by topic with auto-assessed-class articles and importance parameters - NA", ci.getTitle());
				assertEquals(24, ci.getPageid());
				assertEquals(14, ci.getNamespace());
				assertTrue(it.hasNext());
				ci = it.next();
				assertEquals("Category:Wikipedia categories by topic with auto-assessed-class articles and importance parameters - NA-top", ci.getTitle());
				assertEquals(25, ci.getPageid());
				assertEquals(14, ci.getNamespace());
				assertTrue(it.hasNext());
				ci = it.next();
				assertEquals("Category:Wikipedia categories by topic with auto-assessed-class articles and importance parameters - NA-high", ci.getTitle());
				assertEquals(26, ci.getPageid());
				assertEquals(14, ci.getNamespace());
				assertTrue(it.hasNext());
				ci = it.next();
				assertEquals("Category:Wikipedia categories by topic with auto-assessed-class articles and importance parameters - NA-mid", ci.getTitle());
				assertEquals(27, ci.getPageid());
				assertEquals(14, ci.getNamespace());
				assertTrue(it.hasNext());
				ci = it.next();
				assertEquals("Category:Wikipedia categories by topic with auto-assessed-class articles and importance parameters - NA-low", ci.getTitle());
				assertEquals(28, ci.getPageid());
				assertEquals(14, ci.getNamespace());
				assertTrue(it.hasNext());
				ci = it.next();
				assertEquals("Category:Wikipedia categories by topic with auto-assessed-class articles and importance parameters - NA-bottom", ci.getTitle());
				assertEquals(29, ci.getPageid());
				assertEquals(14, ci.getNamespace());
				assertTrue(it.hasNext());
				ci = it.next();
				assertEquals("Category:Wikipedia categories by topic with auto-assessed-class articles and importance parameters - unassessed", ci.getTitle());
				assertEquals(30, ci.getPageid());
				assertEquals(14, ci.getNamespace());
				assertTrue(it.hasNext());
				ci = it.next();
				assertEquals("Category:Wikipedia categories by topic with auto-assessed-class articles and importance parameters - unassessed-top", ci.getTitle());
				assertEquals(31, ci.getPageid());
				assertEquals(14, ci.getNamespace());
				assertTrue(it.hasNext());
				ci = it.next();
				assertEquals("Category:Wikipedia categories by topic with auto-assessed-class articles and importance parameters - unassessed-high", ci.getTitle());
				assertEquals(32, ci.getPageid());
				assertEquals(14, ci.getNamespace());
				assertTrue(it.hasNext());
				ci = it.next();
				assertEquals("Category:Wikipedia categories by topic with auto-assessed-class articles and importance parameters - unassessed-mid", ci.getTitle());
				assert