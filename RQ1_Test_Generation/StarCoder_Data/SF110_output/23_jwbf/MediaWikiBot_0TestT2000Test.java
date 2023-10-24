// MediaWikiBot_0Test.java
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
* It contains ten unit test cases for the {@link MediaWikiBot#getArticle(String, int)} method.
*/
class MediaWikiBot_0Test {
	@Inject
			private HttpActionClient client;

			@Inject
			private HttpBot bot;

			@Inject
			private MediaWikiBot bot2;

			@Test
			void test0() {
				// Arrange
				bot = new HttpBot(client);
				bot2 = new MediaWikiBot(bot);
				// Act
				bot2.login("test", "test");
				// Assert
				assertTrue(bot2.isLoggedIn());
			}

			@Test
			void test1() {
				// Arrange
				bot = new HttpBot(client);
				bot2 = new MediaWikiBot(bot);
				// Act
				bot2.login("test", "test");
				// Assert
				assertTrue(bot2.isLoggedIn());
			}

			@Test
			void test2() {
				// Arrange
				bot = new HttpBot(client);
				bot2 = new MediaWikiBot(bot);
				// Act
				bot2.login("test", "test");
				// Assert
				assertTrue(bot2.isLoggedIn());
			}

			@Test
			void test3() {
				// Arrange
				bot = new HttpBot(client);
				bot2 = new MediaWikiBot(bot);
				// Act
				bot2.login("test", "test");
				// Assert
				assertTrue(bot2.isLoggedIn());
			}

			@Test
			void test4() {
				// Arrange
				bot = new HttpBot(client);
				bot2 = new MediaWikiBot(bot);
				// Act
				bot2.login("test", "test");
				// Assert
				assertTrue(bot2.isLoggedIn());
			}

			@Test
			void test5() {
				// Arrange
				bot = new HttpBot(client);
				bot2 = new MediaWikiBot(bot);
				// Act
				bot2.login("test", "test");
				// Assert
				assertTrue(bot2.isLoggedIn());
			}

			@Test
			void test6() {
				// Arrange
				bot = new HttpBot(client);
				bot2 = new MediaWikiBot(bot);
				// Act
				bot2.login("test", "test");
				// Assert
				assertTrue(bot2.isLoggedIn());
			}

			@Test
			void test7() {
				// Arrange
				bot = new HttpBot(client);
				bot2 = new MediaWikiBot(bot);
				// Act
				bot2.login("test", "test");
				// Assert
				assertTrue(bot2.isLoggedIn());
			}

			@Test
			void test8() {
				// Arrange
				bot = new HttpBot(client);
				bot2 = new MediaWikiBot(bot);
				// Act
				bot2.login("test", "test");
				// Assert
				assertTrue(bot2.isLoggedIn());
			}

			@Test
			void test9() {
				// Arrange
				bot = new HttpBot(client);
				bot2 = new MediaWikiBot(bot);
				// Act
				bot2.login("test", "test");
				// Assert
				assertTrue(bot2.isLoggedIn());
			}
}
