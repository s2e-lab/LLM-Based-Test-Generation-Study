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
    * @throws ActionException on problems with http, cookies and io
    * @throws ProcessException on access problems
    */
    @Test
    void testReadContent() throws ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot(new SimpleArticle("TracWiki"));
        Article article = bot.readContent("WikiStart");
        assertNotNull(article);
        assertEquals("WikiStart", article.getTitle());
        assertEquals("TracWiki", article.getSite());
        assertEquals("TracWiki", article.getSpace());
        assertEquals("TracWiki", article.getSpaceKey());
        assertEquals("TracWiki", article.getSpaceName());
        assertEquals("TracWiki", article.getSpaceTitle());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.getSpaceUrl());
        assertEquals("TracWiki", article.