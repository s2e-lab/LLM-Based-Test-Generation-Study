// TracWikiBot_0Test.java
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
class TracWikiBot_0Test {

	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_0() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracWiki");
		assertEquals("TracWiki", article.getTitle());
		assertEquals("TracWiki", article.getText());
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_1() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("WikiStart");
		assertEquals("WikiStart", article.getTitle());
		assertEquals("WikiStart", article.getText());
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_2() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("WikiFormatting");
		assertEquals("WikiFormatting", article.getTitle());
		assertEquals("WikiFormatting", article.getText());
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_3() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("WikiRestructuredText");
		assertEquals("WikiRestructuredText", article.getTitle());
		assertEquals("WikiRestructuredText", article.getText());
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_4() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("WikiHtml");
		assertEquals("WikiHtml", article.getTitle());
		assertEquals("WikiHtml", article.getText());
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_5() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("WikiMacros");
		assertEquals("WikiMacros", article.getTitle());
		assertEquals("WikiMacros", article.getText());
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_6() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("WikiProcessors");
		assertEquals("WikiProcessors", article.getTitle());
		assertEquals("WikiProcessors", article.getText());
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_7() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("WikiCreole");
		assertEquals("WikiCreole", article.getTitle());
		assertEquals("WikiCreole", article.getText());
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_8() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("WikiTocMacro");
		assertEquals("WikiTocMacro", article.getTitle());
		assertEquals("WikiTocMacro", article.getText());
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_9() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("WikiTocMacro");
		assertEquals("WikiTocMacro", article.getTitle());
		assertEquals("WikiTocMacro", article.getText());
	}
	
}

// TracWikiBot_1Test.java
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
* It contains ten unit test cases for the {@link TracWikiBot#readContent(String, int)} method.
*/
class TracWikiBot_1Test {
		
	/**
	* Test case for {@link TracWikiBot#readContent(String, int)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_0() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracWiki", 0);
		assertEquals("TracWiki", article.getTitle());
		assertEquals("TracWiki", article.getText());
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String, int)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_1() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("WikiStart", 0);
		assertEquals("WikiStart", article.getTitle());
		assertEquals("WikiStart", article.getText());
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String, int)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_2() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("WikiFormatting", 0);
		assertEquals("WikiFormatting", article.getTitle());
		assertEquals("WikiFormatting", article.getText());
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String, int)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_3() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("WikiRestructuredText", 0);
		assertEquals("WikiRestructuredText", article.getTitle());
		assertEquals("WikiRestructuredText", article.getText());
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String, int)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_4() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("WikiHtml", 0);
		assertEquals("WikiHtml", article.getTitle());
		assertEquals("WikiHtml", article.getText());
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String, int)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_5() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("WikiMacros", 0);
		assertEquals("WikiMacros", article.getTitle());
		assertEquals("WikiMacros", article.getText());
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String, int)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_6() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("WikiProcessors", 0);
		assertEquals("WikiProcessors", article.getTitle());
		assertEquals("WikiProcessors", article.getText());
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String, int)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_7() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("WikiCreole", 0);
		assertEquals("WikiCreole", article.getTitle());
		assertEquals("WikiCreole", article.getText());
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String, int)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_8() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("WikiTocMacro", 0);
		assertEquals("WikiTocMacro", article.getTitle());
		assertEquals("WikiTocMacro", article.getText());
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String, int)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_9() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("WikiTocMacro", 0);
		assertEquals("WikiTocMacro", article.getTitle());
		assertEquals("WikiTocMacro", article.getText());
	}
	
}

// TracWikiBot_2Test.java
package net.sourceforge.jwbf