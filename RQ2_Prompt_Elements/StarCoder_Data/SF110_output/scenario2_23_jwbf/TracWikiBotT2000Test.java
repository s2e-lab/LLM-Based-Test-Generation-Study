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
        TracWikiBot bot = new TracWikiBot();
        Article article = bot.readContent("TracWiki");
        assertNotNull(article);
        assertEquals("TracWiki", article.getTitle());
        assertEquals("TracWiki", article.getText());
    }
}

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
        TracWikiBot bot = new TracWikiBot();
        Article article = bot.readContent("TracWiki");
        assertNotNull(article);
        assertEquals("TracWiki", article.getTitle());
        assertEquals("TracWiki", article.getText());
    }
}

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
        TracWikiBot bot = new TracWikiBot();
        Article article = bot.readContent("TracWiki");
        assertNotNull(article);
        assertEquals("TracWiki", article.getTitle());
        assertEquals("TracWiki", article.getText());
    }
}

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
        TracWikiBot bot = new TracWikiBot();
        Article article = bot.readContent("TracWiki");
        assertNotNull(article);
        assertEquals("TracWiki", article.getTitle());
        assertEquals("TracWiki", article.getText());
    }
}

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
        TracWikiBot bot = new TracWikiBot();
        Article article = bot.readContent("TracWiki");
        assertNotNull(article);
        assertEquals("TracWiki", article.getTitle());
        assertEquals("TracWiki", article.getText());
    }
}

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
        TracWikiBot bot = new TracWikiBot();
        Article article = bot.readContent("TracWiki");
        assertNotNull(article);
        assertEquals("TracWiki", article.getTitle());
        assertEquals("TracWiki", article.getText());
    }