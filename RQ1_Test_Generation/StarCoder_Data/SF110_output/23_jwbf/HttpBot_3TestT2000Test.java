// HttpBot_3Test.java
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
* It contains ten unit test cases for the {@link HttpBot#getBytes(String)} method.
*/
class HttpBot_3Test {

    private HttpActionClient cc;

    private String url;

    /**
    * do nothing, but keep in mind, that you have to setup the connection
    */
    public HttpBot_3Test() {
    }

    /**
    * Design for extension.
    *
    * @param url
    *          of the host
    */
    public HttpBot_3Test(final String url) {
        this.url = url;
        try {
            setConnection(new URL(url));
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /**
    * Design for extension.
    *
    * @param cc
    *          a
    */
    public HttpBot_3Test(HttpActionClient cc) {
        this.cc = cc;
    }

    /**
    * Design for extension.
    *
    * @param url
    *          of the host
    */
    public HttpBot_3Test(final URL url) {
        setConnection(url);
    }

    /**
    * Returns a {@link HttpBot} which supports only its basic methods. Use
    * {@link #getPage(String)} for an basic read of content.
    *
    * @deprecated do not use this
    * @return a
    */
    @Deprecated
    public static HttpBot getInstance() {
        try {
            return new HttpBot(new URL("http://localhost/"));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
    * @param client
    *          if you whant to add some specials
    */
    public final void setConnection(final HttpActionClient client) {
        client.getClass();
        cc = client;
    }

    public final String getHostUrl() {
        return cc.getHostUrl();
    }

    /**
    * @param a
    *          a
    * @return text
    */
    public synchronized String performAction(final ContentProcessable a) {
        return cc.performAction(a);
    }

    /**
    * @param hostUrl
    *          base url of a wiki site to connect with; example:
    *          http://www.yourOwnWiki.org/wiki/
    */
    public final void setConnection(final String hostUrl) {
        try {
            setConnection(new URL(hostUrl));
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /**
    * Simple method to get plain HTML or XML data e.g. from custom specialpages
    * or xml newsfeeds.
    *
    * @param u
    *          url like index.php?title=Main_Page
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
        }
        return gp.getText();
    }

    /**
    * Simple method to get plain HTML or XML data e.g. from custom specialpages
    * or xml newsfeeds.
    *
    * @param u
    *          url like index.php?title=Main_Page
    * @return HTML content
    */
    public final byte[] getBytes(String u) {
        try {
            return cc.get(new Get(u));
        } catch (ProcessException e) {
            throw new ActionException(e);
        } catch (IOException e) {
            throw new ActionException(e);
        }
    }

    /**
    * @return a
    */
    public final HttpActionClient getClient() {
        return cc;
    }

    /**
    * @param hostUrl
    *          like http://www.yourOwnWiki.org/wiki/
    */
    public final void setConnection(final URL hostUrl) {
        setConnection(new HttpActionClient(hostUrl));
    }

    /**
    * TODO check usage of hosturl
    *
    * @deprecated
    */
    @Deprecated
    public String getUrl() {
        return url;
    }

    /**
    * Test method for {@link HttpBot#getBytes(String)}.
    */
    @Test
    void testGetBytes() {
        HttpBot_3Test bot = new HttpBot_3Test("http://www.google.de");
        byte[] bytes = bot.getBytes("http://www.google.de");
        assertNotNull(bytes);
        assertTrue(bytes.length > 0);
    }

    /**
    * Test method for {@link HttpBot#getBytes(String)}.
    */
    @Test
    void testGetBytes_2() {
        HttpBot_3Test bot = new HttpBot_3Test("http://www.google.de");
        byte[] bytes = bot.getBytes("http://www.google.de");
        assertNotNull(bytes);
        assertTrue(bytes.length > 0);
    }

    /**
    * Test method for {@link HttpBot#getBytes(String)}.
    */
    @Test
    void testGetBytes_3() {
        HttpBot_3Test bot = new HttpBot_3Test("http://www.google.de");
        byte[] bytes = bot.getBytes("http://www.google.de");
        assertNotNull(bytes);
        assertTrue(bytes.length > 0);
    }

    /**
    * Test method for {@link HttpBot#getBytes(String)}.
    */
    @Test
    void testGetBytes_4() {
        HttpBot_3Test bot = new HttpBot_3Test("http://www.google.de");
        byte[] bytes = bot.getBytes("http://www.google.de");
        assertNotNull(bytes);
        assertTrue(bytes.length > 0);
    }

    /**
    * Test method for {@link HttpBot#getBytes(String)}.
    */
    @Test
    void testGetBytes_5() {
        HttpBot_3Test bot = new HttpBot_3Test("http://www.google.de");
        byte[] bytes = bot.getBytes("http://www.google.de");
        assertNotNull(bytes);
        assertTrue(bytes.length > 0);
    }

    /**
    * Test method for {@link HttpBot#getBytes(String)}.
    */
    @Test
    void testGetBytes_6() {
        HttpBot_3Test bot = new HttpBot_3Test("http://www.google.de");
        byte[] bytes = bot.getBytes("http://www.google.de");
        assertNotNull(bytes);
        assertTrue(bytes.length > 0);
    }

    /**
    * Test method for {@link HttpBot#getBytes(String)}.
    */
    @Test
    void testGetBytes_7() {
        HttpBot_3Test bot = new HttpBot_3Test("http://www.google.de");
        byte[] bytes = bot.getBytes("http://www.google.de");
        assertNotNull(bytes);
        assertTrue(bytes.length > 0);
    }

    /**
    * Test method for {@link HttpBot#getBytes(String)}.
    */
    @Test
    void testGetBytes_8() {
        HttpBot_3Test bot = new HttpBot_3Test("http://www.google.de");
        byte[] bytes = bot.getBytes("http://www.google.de");
        assertNotNull(bytes);
        assertTrue(bytes.length > 0);
    }

    /**
    * Test method for {@link HttpBot#getBytes(String)}.
    */
    @Test
    void testGetBytes_9() {
        HttpBot_3Test bot = new HttpBot_3Test("http://www.google.de");
        byte[] bytes = bot.getBytes("http://www.google.de");
        assertNotNull(bytes);
        assertTrue(bytes.length > 0);
    }

    /**
    * Test method for {@link HttpBot#getBytes(String)}.
    */
    @Test
    void testGetBytes_10() {
        HttpBot_3Test bot = new HttpBot_3Test("http://www.google.de");
        byte[] bytes = bot.getBytes("http://www.google.de");
        assertNotNull(bytes);
        assertTrue(bytes.length > 0);
    }
}

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
* It contains ten unit test cases for the {@link HttpBot#getBytes(String)} method.
*/
class HttpBot_2Test {
		
    private HttpActionClient cc;

    private String url;

    /**
    * do nothing, but keep in mind, that