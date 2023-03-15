// MediaWikiBot_2Test.java
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
* It contains ten unit test cases for the {@link MediaWikiBot#readData(String)} method.
*/
class MediaWikiBot_2Test {

		private MediaWikiBot bot;
		
		public MediaWikiBot_2Test() {
				bot = new MediaWikiBot();
		}
		
		@Test
		void testReadData() {
				String result = bot.readData("Main Page");
				assertNotNull(result);
				assertTrue(result.length() > 0);
		}
		
		@Test
		void testReadData_2() {
				String result = bot.readData("Main Page");
				assertNotNull(result);
				assertTrue(result.length() > 0);
		}
		
		@Test
		void testReadData_3() {
				String result = bot.readData("Main Page");
				assertNotNull(result);
				assertTrue(result.length() > 0);
		}
		
		@Test
		void testReadData_4() {
				String result = bot.readData("Main Page");
				assertNotNull(result);
				assertTrue(result.length() > 0);
		}
		
		@Test
		void testReadData_5() {
				String result = bot.readData("Main Page");
				assertNotNull(result);
				assertTrue(result.length() > 0);
		}
		
		@Test
		void testReadData_6() {
				String result = bot.readData("Main Page");
				assertNotNull(result);
				assertTrue(result.length() > 0);
		}
		
		@Test
		void testReadData_7() {
				String result = bot.readData("Main Page");
				assertNotNull(result);
				assertTrue(result.length() > 0);
		}
		
		@Test
		void testReadData_8() {
				String result = bot.readData("Main Page");
				assertNotNull(result);
				assertTrue(result.length() > 0);
		}
		
		@Test
		void testReadData_9() {
				String result = bot.readData("Main Page");
				assertNotNull(result);
				assertTrue(result.length() > 0);
		}
		
		@Test
		void testReadData_10() {
				String result = bot.readData("Main Page");
				assertNotNull(result);
				assertTrue(result.length() > 0);
		}
}

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
* It contains ten unit test cases for the {@link MediaWikiBot#readData(String)} method.
*/
class MediaWikiBot_3Test {
		
		private MediaWikiBot bot;
		
		public MediaWikiBot_3Test() {
				bot = new MediaWikiBot();
		}
		
		@Test
		void testReadData() {
				String result = bot.readData("Main Page");
				assertNotNull(result);
				assertTrue(result.length() > 0);
		}
		
		@Test
		void testReadData_2() {
				String result = bot.readData("Main Page");
				assertNotNull(result);
				assertTrue(result.length() > 0);
		}
		
		@Test
		void testReadData_3() {
				String result = bot.readData("Main Page");
				assertNotNull(result);
				assertTrue(result.length() > 0);
		}
		
		@Test
		void testReadData_4() {
				String result = bot.readData("Main Page");
				assertNotNull(result);
				assertTrue(result.length() > 0);
		}
		
		@Test
		void testReadData_5() {
				String result = bot.readData("Main Page");
				assertNotNull(result);
				assertTrue(result.length() > 0);
		}
		
		@Test
		void testReadData_6() {
				String result = bot.readData("Main Page");
				assertNotNull(result);
				assertTrue(result.length() > 0);
		}
		
		@Test
		void testReadData_7() {
				String result = bot.readData("Main Page");
				assertNotNull(result);
				assertTrue(result.length() > 0);
		}
		
		@Test
		void testReadData_8() {
				String result = bot.readData("Main Page");
				assertNotNull(result);
				assertTrue(result.length() > 0);
		}
		
		@Test
		void testReadData_9() {
				String result = bot.readData("Main Page");
				assertNotNull(result);
				assertTrue(result.length() > 0);
		}
		
		@Test
		void testReadData_10() {
				String result = bot