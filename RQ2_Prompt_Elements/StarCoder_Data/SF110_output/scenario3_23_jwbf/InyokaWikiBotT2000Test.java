// InyokaWikiBotTest.java
package net.sourceforge.jwbf.inyoka.bots;

import java.net.MalformedURLException;
import java.util.Map;
import java.util.Set;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.inyoka.actions.GetRevision;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InyokaWikiBot}.
* It contains ten unit test cases for the {@link InyokaWikiBot#getArticle(String)} method.
*/
class InyokaWikiBotTest {

    /**
    * Test method for {@link InyokaWikiBot#getArticle(String)}.
    * @throws ActionException on problems with http, cookies and io
    * @throws ProcessException on access problems
    */
    @Test
    void testGetArticle() throws ActionException, ProcessException {
        InyokaWikiBot bot = new InyokaWikiBot();
        Article article = bot.getArticle("Test");
        assertNotNull(article);
        assertEquals("Test", article.getTitle());
        assertEquals("Test", article.getText());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.getRevision());
        assertEquals("Test", article.get