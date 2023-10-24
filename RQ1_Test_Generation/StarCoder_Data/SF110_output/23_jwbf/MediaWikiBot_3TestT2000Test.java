// MediaWikiBot_3Test.java
package net.sourceforge.jwbf.mediawiki.bots;

import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.ContentAccessable;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version;
import net.sourceforge.jwbf.mediawiki.actions.editing.GetRevision;
import net.sourceforge.jwbf.mediawiki.actions.editing.PostDelete;
import net.sourceforge.jwbf.mediawiki.actions.editing.PostModifyContent;
import net.sourceforge.jwbf.mediawiki.actions.login.PostLogin;
import net.sourceforge.jwbf.mediawiki.actions.login.PostLoginOld;
import net.sourceforge.jwbf.mediawiki.actions.meta.GetUserinfo;
import net.sourceforge.jwbf.mediawiki.actions.meta.GetVersion;
import net.sourceforge.jwbf.mediawiki.actions.meta.Siteinfo;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.contentRep.LoginData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWikiBot}.
* It contains ten unit test cases for the {@link MediaWikiBot#getArticle(String)} method.
*/
class MediaWikiBot_3Test {
	@Inject
			private HttpBot bot;

			/**
			* Test method for {@link MediaWikiBot#getArticle(String)}.
			* @throws JwbfException 
			*/
			@Test
			void testGetArticle() throws JwbfException {
				MediaWikiBot bot = new MediaWikiBot(new HttpActionClient(new URL("http://www.mediawiki.org/w/api.php")));
				bot.login("JohnDoe", "12345678");
				Article article = bot.getArticle("Main Page");
				assertNotNull(article);
				assertEquals("Main Page", article.getTitle());
				assertEquals("Main Page", article.getText());
				assertEquals("JohnDoe", article.getUser());
				assertEquals(1, article.getRevisions().size());
				assertEquals(1, article.getRevisions().get(0).getId());
				assertEquals("Main Page", article.getRevisions().get(0).getText());
				assertEquals("JohnDoe", article.getRevisions().get(0).getUser());
				assertEquals(1, article.getRevisions().get(0).getRevid());
				assertEquals(1, article.getRevisions().get(0).getMinor());
				assertEquals(1, article.getRevisions().get(0).getFlags());
				assertEquals(1, article.getRevisions().get(0).getTimestamp());
				assertEquals(1, article.getRevisions().get(0).getComment());
				assertEquals(1, article.getRevisions().get(0).getIds().size());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getId());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals("Main Page", article.getRevisions().get(0).getIds().get(0).getText());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.getRevisions().get(0).getIds().get(0).getNs());
				assertEquals(1, article.get