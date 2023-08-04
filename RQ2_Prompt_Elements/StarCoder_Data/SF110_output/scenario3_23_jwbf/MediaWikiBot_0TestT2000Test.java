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

    /**
    * Test method for {@link MediaWikiBot#getArticle(String, int)}.
    */
    @Test
    void testGetArticle() {
        // Arrange
        final String name = "Main Page";
        final int properties = 0;
        final Article expected = new SimpleArticle(name, "This is the main page.");
        final MediaWikiBot bot = new MediaWikiBot(new URL("http://www.mediawiki.org/w/"));
        bot.login("JohnDoe", "12345678");

        // Act
        final Article actual = bot.getArticle(name, properties);

        // Assert
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link MediaWikiBot#getArticle(String, int)}.
    */
    @Test
    void testGetArticle_1() {
        // Arrange
        final String name = "Main Page";
        final int properties = 0;
        final Article expected = new SimpleArticle(name, "This is the main page.");
        final MediaWikiBot bot = new MediaWikiBot(new URL("http://www.mediawiki.org/w/"));
        bot.login("JohnDoe", "12345678");

        // Act
        final Article actual = bot.getArticle(name, properties);

        // Assert
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link MediaWikiBot#getArticle(String, int)}.
    */
    @Test
    void testGetArticle_2() {
        // Arrange
        final String name = "Main Page";
        final int properties = 0;
        final Article expected = new SimpleArticle(name, "This is the main page.");
        final MediaWikiBot bot = new MediaWikiBot(new URL("http://www.mediawiki.org/w/"));
        bot.login("JohnDoe", "12345678");

        // Act
        final Article actual = bot.getArticle(name, properties);

        // Assert
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link MediaWikiBot#getArticle(String, int)}.
    */
    @Test
    void testGetArticle_3() {
        // Arrange
        final String name = "Main Page";
        final int properties = 0;
        final Article expected = new SimpleArticle(name, "This is the main page.");
        final MediaWikiBot bot = new MediaWikiBot(new URL("http://www.mediawiki.org/w/"));
        bot.login("JohnDoe", "12345678");

        // Act
        final Article actual = bot.getArticle(name, properties);

        // Assert
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link MediaWikiBot#getArticle(String, int)}.
    */
    @Test
    void testGetArticle_4() {
        // Arrange
        final String name = "Main Page";
        final int properties = 0;
        final Article expected = new SimpleArticle(name, "This is the main page.");
        final MediaWikiBot bot = new MediaWikiBot(new URL("http://www.mediawiki.org/w/"));
        bot.login("JohnDoe", "12345678");

        // Act
        final Article actual = bot.getArticle(name, properties);

        // Assert
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link MediaWikiBot#getArticle(String, int)}.
    */
    @Test
    void testGetArticle_5() {
        // Arrange
        final String name = "Main Page";
        final int properties = 0;
        final Article expected = new SimpleArticle(name, "This is the main page.");
        final MediaWikiBot bot = new MediaWikiBot(new URL("http://www.mediawiki.org/w/"));
        bot.login("JohnDoe", "12345678");

        // Act
        final Article actual = bot.getArticle(name, properties);

        // Assert
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link MediaWikiBot#getArticle(String, int)}.
    */
    @Test
    void testGetArticle_6() {
        // Arrange
        final String name = "Main Page";
        final int properties = 0;
        final Article expected = new SimpleArticle(name, "This is the main page.");
        final MediaWikiBot bot = new MediaWikiBot(new URL("http://www.mediawiki.org/w/"));
        bot.login("JohnDoe", "12345678");

        // Act
        final Article actual = bot.getArticle(name, properties);

        // Assert
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link MediaWikiBot#getArticle(String, int)}.
    */
    @Test
    void testGetArticle_7() {
        // Arrange
        final String name = "Main Page";
        final int properties = 0;
        final Article expected = new SimpleArticle(name, "This is the main page.");
        final MediaWikiBot bot = new MediaWikiBot(new URL("http://www.mediawiki.org/w/"));
        bot.login("JohnDoe", "12345678");

        // Act
        final Article actual = bot.getArticle(name, properties);

        // Assert
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link MediaWikiBot#getArticle(String, int)}.
    */
    @Test
    void testGetArticle_8() {
        // Arrange
        final String name = "Main Page";
        final int properties = 0;
        final Article expected = new SimpleArticle(name, "This is the main page.");
        final MediaWikiBot bot = new MediaWikiBot(new URL("http://www.mediawiki.org/w/"));
        bot.login("JohnDoe", "12345678");

        // Act
        final Article actual = bot.getArticle(name, properties);

        // Assert
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link MediaWikiBot#getArticle(String, int)}.
    */
    @Test
    void testGetArticle_9() {
        // Arrange
        final String name = "Main Page";
        final int properties = 0;
        final Article expected = new SimpleArticle(name, "This is the main page.");
        final MediaWikiBot bot = new MediaWikiBot(new URL("http://www.mediawiki.org/w/"));
        bot.login("JohnDoe", "12345678");

        // Act
        final Article actual = bot.getArticle(name, properties);

        // Assert
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link MediaWikiBot#getArticle(String, int)}.
    */
    @Test
    void testGetArticle_10() {
        // Arrange
        final String name = "Main Page";
        final int properties = 0;
        final Article expected = new SimpleArticle(name, "This is the main page.");
        final MediaWikiBot bot = new MediaWikiBot(new URL("http://www.mediawiki.org/w/"));
        bot.login("JohnDoe", "12345678");

        // Act
        final Article actual = bot.getArticle(name, properties);

        // Assert
        assertEquals(expected, actual);
    }
}

// MediaWikiBot_1Test.java
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
import net.sourceforge