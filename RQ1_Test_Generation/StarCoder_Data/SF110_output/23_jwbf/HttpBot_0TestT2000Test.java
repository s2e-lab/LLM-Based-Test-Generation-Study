// HttpBot_0Test.java
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
* It contains ten unit test cases for the {@link HttpBot#getInstance()} method.
*/
class HttpBot_0Test {

    /**
    * Test method for {@link HttpBot#getInstance()}.
    */
    @Test
    void testGetInstance() {
        HttpBot bot = HttpBot.getInstance();
        assertNotNull(bot);
    }

    /**
    * Test method for {@link HttpBot#performAction(ContentProcessable)}.
    */
    @Test
    void testPerformAction() {
        HttpBot bot = HttpBot.getInstance();
        ContentProcessable action = new GetPage("Main_Page");
        String result = bot.performAction(action);
        assertNotNull(result);
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    */
    @Test
    void testGetPage() {
        HttpBot bot = HttpBot.getInstance();
        String result = bot.getPage("Main_Page");
        assertNotNull(result);
    }

    /**
    * Test method for {@link HttpBot#getBytes(String)}.
    */
    @Test
    void testGetBytes() {
        HttpBot bot = HttpBot.getInstance();
        byte[] result = bot.getBytes("Main_Page");
        assertNotNull(result);
    }

    /**
    * Test method for {@link HttpBot#setConnection(HttpActionClient)}.
    */
    @Test
    void testSetConnection() {
        HttpBot bot = HttpBot.getInstance();
        HttpActionClient client = new HttpActionClient(new URL("http://localhost/"));
        bot.setConnection(client);
        assertEquals(client, bot.getClient());
    }

    /**
    * Test method for {@link HttpBot#setConnection(String)}.
    */
    @Test
    void testSetConnectionString() {
        HttpBot bot = HttpBot.getInstance();
        bot.setConnection("http://localhost/");
        assertEquals("http://localhost/", bot.getHostUrl());
    }

    /**
    * Test method for {@link HttpBot#setConnection(URL)}.
    */
    @Test
    void testSetConnectionURL() {
        HttpBot bot = HttpBot.getInstance();
        URL url = null;
        try {
            url = new URL("http://localhost/");
        } catch (MalformedURLException e) {
            fail(e.getMessage());
        }
        bot.setConnection(url);
        assertEquals(url.toString(), bot.getHostUrl());
    }

    /**
    * Test method for {@link HttpBot#getHostUrl()}.
    */
    @Test
    void testGetHostUrl() {
        HttpBot bot = HttpBot.getInstance();
        String result = bot.getHostUrl();
        assertNotNull(result);
    }
}
