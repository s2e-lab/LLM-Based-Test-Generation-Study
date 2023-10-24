// TracWikiBotTest.java
package net.sourceforge.jwbf.trac.bots;

import java.net.MalformedURLException;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.ContentAccessable;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.trac.actions.GetRevision;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TracWikiBot}.
* It contains ten unit test cases for the {@link TracWikiBot#readContent(String)} method.
*/
class TracWikiBotTest {

    /**
    * Test method for {@link TracWikiBot#readContent(String)}.
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testReadContent() throws ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/wiki/");
        Article article = bot.readContent("TracWiki");
        assertNotNull(article);
    }

    /**
    * Test method for {@link TracWikiBot#readContent(String)}.
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testReadContent2() throws ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/wiki/");
        Article article = bot.readContent("WikiStart");
        assertNotNull(article);
    }

    /**
    * Test method for {@link TracWikiBot#readContent(String)}.
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testReadContent3() throws ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/wiki/");
        Article article = bot.readContent("TracWiki", 0);
        assertNotNull(article);
    }

    /**
    * Test method for {@link TracWikiBot#readContent(String)}.
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testReadContent4() throws ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/wiki/");
        Article article = bot.readContent("WikiStart", 0);
        assertNotNull(article);
    }

    /**
    * Test method for {@link TracWikiBot#readContent(String)}.
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testReadContent5() throws ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/wiki/");
        Article article = bot.readContent("TracWiki", 1);
        assertNotNull(article);
    }

    /**
    * Test method for {@link TracWikiBot#readContent(String)}.
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testReadContent6() throws ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/wiki/");
        Article article = bot.readContent("WikiStart", 1);
        assertNotNull(article);
    }

    /**
    * Test method for {@link TracWikiBot#readContent(String)}.
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testReadContent7() throws ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/wiki/");
        Article article = bot.readContent("TracWiki", 2);
        assertNotNull(article);
    }

    /**
    * Test method for {@link TracWikiBot#readContent(String)}.
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testReadContent8() throws ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/wiki/");
        Article article = bot.readContent("WikiStart", 2);
        assertNotNull(article);
    }

    /**
    * Test method for {@link TracWikiBot#readContent(String)}.
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testReadContent9() throws ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/wiki/");
        Article article = bot.readContent("TracWiki", 3);
        assertNotNull(article);
    }

    /**
    * Test method for {@link TracWikiBot#readContent(String)}.
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testReadContent10() throws ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/wiki/");
        Article article = bot.readContent("WikiStart", 3);
        assertNotNull(article);
    }
}
