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
* It contains ten unit test cases for the {@link CategoryMembersFull#next()} method.
*/
class CategoryMembersFull_2Test {

    private CategoryMembersFull testee;
    private MediaWikiBot bot;
    private String categoryName;
    private int[] namespaces;
    private Collection<CategoryItem> titleCollection = new ArrayList<CategoryItem>();
    private Iterator<CategoryItem> titleIterator;

    /**
    * Test method for {@link CategoryMembersFull#next()}.
    */
    @Test
    void testNext() {
        try {
            testee = new CategoryMembersFull(bot, categoryName, namespaces);
            titleIterator = testee.iterator();
            while (titleIterator.hasNext()) {
                titleCollection.add(titleIterator.next());
            }
        } catch (ProcessException e) {
            log.error(e.getMessage());
        }
    }

    /**
    * Test method for {@link CategoryMembersFull#next()}.
    */
    @Test
    void testNext_0() {
        try {
            testee = new CategoryMembersFull(bot, categoryName, namespaces);
            titleIterator = testee.iterator();
            while (titleIterator.hasNext()) {
                titleCollection.add(titleIterator.next());
            }
        } catch (ProcessException e) {
            log.error(e.getMessage());
        }
    }

    /**
    * Test method for {@link CategoryMembersFull#next()}.
    */
    @Test
    void testNext_1() {
        try {
            testee = new CategoryMembersFull(bot, categoryName, namespaces);
            titleIterator = testee.iterator();
            while (titleIterator.hasNext()) {
                titleCollection.add(titleIterator.next());
            }
        } catch (ProcessException e) {
            log.error(e.getMessage());
        }
    }

    /**
    * Test method for {@link CategoryMembersFull#next()}.
    */
    @Test
    void testNext_2() {
        try {
            testee = new CategoryMembersFull(bot, categoryName, namespaces);
            titleIterator = testee.iterator();
            while (titleIterator.hasNext()) {
                titleCollection.add(titleIterator.next());
            }
        } catch (ProcessException e) {
            log.error(e.getMessage());
        }
    }

    /**
    * Test method for {@link CategoryMembersFull#next()}.
    */
    @Test
    void testNext_3() {
        try {
            testee = new CategoryMembersFull(bot, categoryName, namespaces);
            titleIterator = testee.iterator();
            while (titleIterator.hasNext()) {
                titleCollection.add(titleIterator.next());
            }
        } catch (ProcessException e) {
            log.error(e.getMessage());
        }
    }

    /**
    * Test method for {@link CategoryMembersFull#next()}.
    */
    @Test
    void testNext_4() {
        try {
            testee = new CategoryMembersFull(bot, categoryName, namespaces);
            titleIterator = testee.iterator();
            while (titleIterator.hasNext()) {
                titleCollection.add(titleIterator.next());
            }
        } catch (ProcessException e) {
            log.error(e.getMessage());
        }
    }

    /**
    * Test method for {@link CategoryMembersFull#next()}.
    */
    @Test
    void testNext_5() {
        try {
            testee = new CategoryMembersFull(bot, categoryName, namespaces);
            titleIterator = testee.iterator();
            while (titleIterator.hasNext()) {
                titleCollection.add(titleIterator.next());
            }
        } catch (ProcessException e) {
            log.error(e.getMessage());
        }
    }

    /**
    * Test method for {@link CategoryMembersFull#next()}.
    */
    @Test
    void testNext_6() {
        try {
            testee = new CategoryMembersFull(bot, categoryName, namespaces);
            titleIterator = testee.iterator();
            while (titleIterator.hasNext()) {
                titleCollection.add(titleIterator.next());
            }
        } catch (ProcessException e) {
            log.error(e.getMessage());
        }
    }

    /**
    * Test method for {@link CategoryMembersFull#next()}.
    */
    @Test
    void testNext_7() {
        try {
            testee = new CategoryMembersFull(bot, categoryName, namespaces);
            titleIterator = testee.iterator();
            while (titleIterator.hasNext()) {
                titleCollection.add(titleIterator.next());
            }
        } catch (ProcessException e) {
            log.error(e.getMessage());
        }
    }

    /**
    * Test method for {@link CategoryMembersFull#next()}.
    */
    @Test
    void testNext_8() {
        try {
            testee = new CategoryMembersFull(bot, categoryName, namespaces);
            titleIterator = testee.iterator();
            while (titleIterator.hasNext()) {
                titleCollection.add(titleIterator.next());
            }
        } catch (ProcessException e) {
            log.error(e.getMessage());
        }
    }

    /**
    * Test method for {@link CategoryMembersFull#next()}.
    */
    @Test
    void testNext_9() {
        try {
            testee = new CategoryMembersFull(bot, categoryName, namespaces);
            titleIterator = testee.iterator();
            while (titleIterator.hasNext()) {
                titleCollection.add(titleIterator.next());
            }
        } catch (ProcessException e) {
            log.error(e.getMessage());
        }
    }
}

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
		
    private CategoryMembersFull testee;
    private MediaWikiBot bot;
    private String categoryName;
    private int[] namespaces;
    private Collection<CategoryItem> titleCollection = new ArrayList<CategoryItem>();
    private Iterator<CategoryItem> titleIterator;

    /**
    * Test method for {@link CategoryMembersFull#next()}.
    */
    @Test
    void testNext() {
        try {
            testee = new CategoryMembersFull(bot, categoryName, namespaces);
            titleIterator = testee.iterator();
            while (titleIterator.hasNext()) {
                titleCollection.add(titleIterator.next());
            }
        } catch (ProcessException e) {
            log.error(e.getMessage());
        }
    }

    /**
    * Test method for {@link CategoryMembersFull#next()}.
    */
    @Test
    void testNext_0() {
        try {
            testee = new CategoryMembersFull(bot, categoryName, namespaces);
            titleIterator = testee.iterator();
            while (titleIterator.hasNext()) {
                titleCollection.add(titleIterator.next());
            }
        } catch (ProcessException e) {
            log.error(e.getMessage());
        }
    }

    /**
    * Test method for {@link CategoryMembersFull#next()}.
    */
    @Test
    void testNext_1() {
        try {
            testee = new CategoryMembersFull(bot, categoryName, namespaces);
            titleIterator = testee.iterator();
            while (titleIterator.hasNext()) {
                titleCollection.add(titleIterator.next());
            }
        } catch (ProcessException e) {
            log.error(e.getMessage());
        }
    }

    /**
    * Test method for {@link CategoryMembersFull#next()}.
    */
    @Test
    void testNext_2() {
        try {
            testee = new CategoryMembersFull(bot, categoryName, namespaces);
            titleIterator