// HttpBot_2Test.java
package net.sourceforge.jwbf.core.bots;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.GetPage;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpBot}.
* It contains ten unit test cases for the {@link HttpBot#getPage(String)} method.
*/
class HttpBot_2Test {

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage() {
        HttpBot bot = new HttpBot();
        String result = bot.getPage("http://www.wikipedia.org/wiki/Main_Page");
        assertTrue(result.contains("Wikipedia"));
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage_2() {
        HttpBot bot = new HttpBot();
        String result = bot.getPage("http://de.wikipedia.org/wiki/Hauptseite");
        assertTrue(result.contains("Wikipedia"));
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage_3() {
        HttpBot bot = new HttpBot();
        String result = bot.getPage("http://de.wikipedia.org/wiki/Hauptseite");
        assertTrue(result.contains("Wikipedia"));
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage_4() {
        HttpBot bot = new HttpBot();
        String result = bot.getPage("http://de.wikipedia.org/wiki/Hauptseite");
        assertTrue(result.contains("Wikipedia"));
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage_5() {
        HttpBot bot = new HttpBot();
        String result = bot.getPage("http://de.wikipedia.org/wiki/Hauptseite");
        assertTrue(result.contains("Wikipedia"));
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage_6() {
        HttpBot bot = new HttpBot();
        String result = bot.getPage("http://de.wikipedia.org/wiki/Hauptseite");
        assertTrue(result.contains("Wikipedia"));
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage_7() {
        HttpBot bot = new HttpBot();
        String result = bot.getPage("http://de.wikipedia.org/wiki/Hauptseite");
        assertTrue(result.contains("Wikipedia"));
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage_8() {
        HttpBot bot = new HttpBot();
        String result = bot.getPage("http://de.wikipedia.org/wiki/Hauptseite");
        assertTrue(result.contains("Wikipedia"));
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage_9() {
        HttpBot bot = new HttpBot();
        String result = bot.getPage("http://de.wikipedia.org/wiki/Hauptseite");
        assertTrue(result.contains("Wikipedia"));
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage_10() {
        HttpBot bot = new HttpBot();
        String result = bot.getPage("http://de.wikipedia.org/wiki/Hauptseite");
        assertTrue(result.contains("Wikipedia"));
    }
}

// HttpBot_Test.java
package net.sourceforge.jwbf.core.bots;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.GetPage;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpBot}.
* It contains ten unit test cases for the {@link HttpBot#getPage(String)} method.
*/
class HttpBot_Test {
		
    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage() {
        HttpBot bot = new HttpBot();
        String result = bot.getPage("http://www.wikipedia.org/wiki/Main_Page");
        assertTrue(result.contains("Wikipedia"));
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage_2() {
        HttpBot bot = new HttpBot();
        String result = bot.getPage("http://de.wikipedia.org/wiki/Hauptseite");
        assertTrue(result.contains("Wikipedia"));
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage_3() {
        HttpBot bot = new HttpBot();
        String result = bot.getPage("http://de.wikipedia.org/wiki/Hauptseite");
        assertTrue(result.contains("Wikipedia"));
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage_4() {
        HttpBot bot = new HttpBot();
        String result = bot.getPage("http://de.wikipedia.org/wiki/Hauptseite");
        assertTrue(result.contains("Wikipedia"));
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage_5() {
        HttpBot bot = new HttpBot();
        String result = bot.getPage("http://de.wikipedia.org/wiki/Hauptseite");
        assertTrue(result.contains("Wikipedia"));
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage_6() {
        HttpBot bot = new HttpBot();
        String result = bot.getPage("http://de.wikipedia.org/wiki/Hauptseite");
        assertTrue(result.contains("Wikipedia"));
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage_7() {
        HttpBot bot = new HttpBot();
        String result = bot.getPage("http://de.wikipedia.org/wiki/Hauptseite");
        assertTrue(result.contains("Wikipedia"));
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage_8() {
        HttpBot bot = new HttpBot();
        String result = bot.getPage("http://de.wikipedia.org/wiki/Hauptseite");
        assertTrue(result.contains("Wikipedia"));
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage_9() {
        HttpBot bot = new HttpBot();
        String result = bot.getPage("http://de.wikipedia.org/wiki/Hauptseite");
        assertTrue(result.contains("Wikipedia"));
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage_10() {
        HttpBot bot = new HttpBot();
        String result = bot.getPage("http://de.wikipedia.org/wiki/Hauptseite");
        assertTrue(result.contains("Wikipedia"));
    }
}

// HttpBot.java
package net.sourceforge.jwbf.core.bots;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.GetPage;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;

public class HttpBot {

    /**
     * Simple method to get plain HTML or XML data e.g. from custom specialpages
     * or xml newsfeeds.
     *
     * @param u url like index.php?title=Main_Page
     * @return HTML content
     */
    public final String getPage(String u) {
        try {
            URL url = new URL(u);
            setConnection(url.getProtocol() + "://" + url.getHost());
        } catch (MalformedURLException e) {
            throw new ActionException(e);
        }
        GetPage gp = new GetPage(u);
        try {
            performAction(gp);
        } catch (ProcessException e) {
            throw new ActionException(e);