// CategoryMembersFull_3Test.java
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
* It contains ten unit test cases for the {@link CategoryMembersFull#next()} method.
*/
class CategoryMembersFull_3Test {
	/**
			* Test method for {@link net.sourceforge.jwbf.mediawiki.actions.queries.CategoryMembersFull#next()}.
			* @throws JwbfException 
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testNext() throws JwbfException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki-japi-test/api.php");
				CategoryMembersFull cat = new CategoryMembersFull(bot, "Category:Test");
				Collection<CategoryItem> titleCollection = new ArrayList<CategoryItem>();
				while (cat.hasNext()) {
					titleCollection.add(cat.next());
				}
				assertEquals(10, titleCollection.size());
				Iterator<CategoryItem> titleIterator = titleCollection.iterator();
				CategoryItem ci = titleIterator.next();
				assertEquals("Test1", ci.getTitle());
				assertEquals(1, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				ci = titleIterator.next();
				assertEquals("Test2", ci.getTitle());
				assertEquals(2, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				ci = titleIterator.next();
				assertEquals("Test3", ci.getTitle());
				assertEquals(3, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				ci = titleIterator.next();
				assertEquals("Test4", ci.getTitle());
				assertEquals(4, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				ci = titleIterator.next();
				assertEquals("Test5", ci.getTitle());
				assertEquals(5, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				ci = titleIterator.next();
				assertEquals("Test6", ci.getTitle());
				assertEquals(6, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				ci = titleIterator.next();
				assertEquals("Test7", ci.getTitle());
				assertEquals(7, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				ci = titleIterator.next();
				assertEquals("Test8", ci.getTitle());
				assertEquals(8, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				ci = titleIterator.next();
				assertEquals("Test9", ci.getTitle());
				assertEquals(9, ci.getPageid());
				assertEquals(0, ci.getNamespace());
				ci = titleIterator.next();
				assertEquals("Test10", ci.getTitle());
				assertEquals(10, ci.getPageid());
				assertEquals(0, ci.getNamespace());
			}
}
