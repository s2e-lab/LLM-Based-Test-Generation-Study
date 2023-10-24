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

    private HttpBot bot;

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    *
    * @throws MalformedURLException
    * @throws IOException
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testGetPage() throws MalformedURLException, IOException, ActionException, ProcessException {
        bot = new HttpBot("http://www.yourOwnWiki.org/wiki/");
        String result = bot.getPage("index.php?title=Main_Page");
        assertNotNull(result);
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    *
    * @throws MalformedURLException
    * @throws IOException
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testGetPage_2() throws MalformedURLException, IOException, ActionException, ProcessException {
        bot = new HttpBot("http://www.yourOwnWiki.org/wiki/");
        String result = bot.getPage("index.php?title=Main_Page");
        assertNotNull(result);
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    *
    * @throws MalformedURLException
    * @throws IOException
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testGetPage_3() throws MalformedURLException, IOException, ActionException, ProcessException {
        bot = new HttpBot("http://www.yourOwnWiki.org/wiki/");
        String result = bot.getPage("index.php?title=Main_Page");
        assertNotNull(result);
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    *
    * @throws MalformedURLException
    * @throws IOException
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testGetPage_4() throws MalformedURLException, IOException, ActionException, ProcessException {
        bot = new HttpBot("http://www.yourOwnWiki.org/wiki/");
        String result = bot.getPage("index.php?title=Main_Page");
        assertNotNull(result);
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    *
    * @throws MalformedURLException
    * @throws IOException
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testGetPage_5() throws MalformedURLException, IOException, ActionException, ProcessException {
        bot = new HttpBot("http://www.yourOwnWiki.org/wiki/");
        String result = bot.getPage("index.php?title=Main_Page");
        assertNotNull(result);
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    *
    * @throws MalformedURLException
    * @throws IOException
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testGetPage_6() throws MalformedURLException, IOException, ActionException, ProcessException {
        bot = new HttpBot("http://www.yourOwnWiki.org/wiki/");
        String result = bot.getPage("index.php?title=Main_Page");
        assertNotNull(result);
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    *
    * @throws MalformedURLException
    * @throws IOException
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testGetPage_7() throws MalformedURLException, IOException, ActionException, ProcessException {
        bot = new HttpBot("http://www.yourOwnWiki.org/wiki/");
        String result = bot.getPage("index.php?title=Main_Page");
        assertNotNull(result);
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    *
    * @throws MalformedURLException
    * @throws IOException
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testGetPage_8() throws MalformedURLException, IOException, ActionException, ProcessException {
        bot = new HttpBot("http://www.yourOwnWiki.org/wiki/");
        String result = bot.getPage("index.php?title=Main_Page");
        assertNotNull(result);
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    *
    * @throws MalformedURLException
    * @throws IOException
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testGetPage_9() throws MalformedURLException, IOException, ActionException, ProcessException {
        bot = new HttpBot("http://www.yourOwnWiki.org/wiki/");
        String result = bot.getPage("index.php?title=Main_Page");
        assertNotNull(result);
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    *
    * @throws MalformedURLException
    * @throws IOException
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testGetPage_10() throws MalformedURLException, IOException, ActionException, ProcessException {
        bot = new HttpBot("http://www.yourOwnWiki.org/wiki/");
        String result = bot.getPage("index.php?title=Main_Page");
        assertNotNull(result);
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
		
    private HttpBot bot;

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    *
    * @throws MalformedURLException
    * @throws IOException
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testGetPage() throws MalformedURLException, IOException, ActionException, ProcessException {
        bot = new HttpBot("http://www.yourOwnWiki.org/wiki/");
        String result = bot.getPage("index.php?title=Main_Page");
        assertNotNull(result);
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    *
    * @throws MalformedURLException
    * @throws IOException
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testGetPage_2() throws MalformedURLException, IOException, ActionException, ProcessException {
        bot = new HttpBot("http://www.yourOwnWiki.org/wiki/");
        String result = bot.getPage("index.php?title=Main_Page");
        assertNotNull(result);
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    *
    * @throws MalformedURLException
    * @throws IOException
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testGetPage_3() throws MalformedURLException, IOException, ActionException, ProcessException {
        bot = new HttpBot("http://www.yourOwnWiki.org/wiki/");
        String result = bot.getPage("index.php?title=Main_Page");
        assertNotNull(result);
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    *
    * @throws MalformedURLException
    * @throws IOException
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testGetPage_4() throws MalformedURLException, IOException, ActionException, ProcessException {
        bot = new HttpBot("http://www.yourOwnWiki.org/wiki/");
        String result = bot.getPage("index.php?title=Main_Page");
        assertNotNull(result);
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    *
    * @throws MalformedURLException
    * @throws IOException
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testGetPage_5() throws MalformedURLException, IOException, ActionException, ProcessException {
        bot = new HttpBot("http://www.yourOwnWiki.org/wiki/");
        String result = bot.getPage("index.php?title=Main_Page");
        assertNotNull(result);
    }

    /**
    * Test method for {@link HttpBot#getPage(String)}.
    *
    * @throws MalformedURLException
    * @throws IOException
    * @throws ActionException
    * @throws ProcessException
    */
    @Test
    void testGetPage_6() throws MalformedURLException, IOException, ActionException, ProcessException {
        bot = new HttpBot("http://www.yourOwnWiki.org/wiki/");
        String result = bot.getPage("index.php?title=Main_Page");
        assertNotNull