// HttpBot_1Test.java
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
* It contains ten unit test cases for the {@link HttpBot#performAction(ContentProcessable)} method.
*/
class HttpBot_1Test {

    /**
    * Test method for {@link HttpBot#performAction(ContentProcessable)}.
    * @throws MalformedURLException if the URL is malformed
    * @throws IOException if the URL is malformed
    * @throws ProcessException if the URL is malformed
    * @throws ActionException if the URL is malformed
    */
    @Test
    void testPerformAction() throws MalformedURLException, IOException, ProcessException, ActionException {
        HttpBot bot = new HttpBot();
        String url = "http://www.google.de";
        GetPage get = new GetPage(new URL(url));
        String result = bot.performAction(get);
        assertTrue(result.contains("Google"));
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
* It contains ten unit test cases for the {@link HttpBot#performAction(ContentProcessable)} method.
*/
class HttpBot_2Test {
		
    /**
    * Test method for {@link HttpBot#performAction(ContentProcessable)}.
    * @throws MalformedURLException if the URL is malformed
    * @throws IOException if the URL is malformed
    * @throws ProcessException if the URL is malformed
    * @throws ActionException if the URL is malformed
    */
    @Test
    void testPerformAction() throws MalformedURLException, IOException, ProcessException, ActionException {
        HttpBot bot = new HttpBot();
        String url = "http://www.google.de";
        Get get = new Get(new URL(url));
        String result = bot.performAction(get);
        assertTrue(result.contains("Google"));
    }
}

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
* It contains ten unit test cases for the {@link HttpBot#performAction(ContentProcessable)} method.
*/
class HttpBot_3Test {
		
    /**
    * Test method for {@link HttpBot#performAction(ContentProcessable)}.
    * @throws MalformedURLException if the URL is malformed
    * @throws IOException if the URL is malformed
    * @throws ProcessException if the URL is malformed
    * @throws ActionException if the URL is malformed
    */
    @Test
    void testPerformAction() throws MalformedURLException, IOException, ProcessException, ActionException {
        HttpBot bot = new HttpBot();
        String url = "http://www.google.de";
        GetPage get = new GetPage(new URL(url));
        String result = bot.performAction(get);
        assertTrue(result.contains("Google"));
    }
}

// HttpBot_4Test.java
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
* It contains ten unit test cases for the {@link HttpBot#performAction(ContentProcessable)} method.
*/
class HttpBot_4Test {
		
    /**
    * Test method for {@link HttpBot#performAction(ContentProcessable)}.
    * @throws MalformedURLException if the URL is malformed
    * @throws IOException if the URL is malformed
    * @throws ProcessException if the URL is malformed
    * @throws ActionException if the URL is malformed
    */
    @Test
    void testPerformAction() throws MalformedURLException, IOException, ProcessException, ActionException {
        HttpBot bot = new HttpBot();
        String url = "http://www.google.de";
        Get get = new Get(new URL(url));
        String result = bot.performAction(get);
        assertTrue(result.contains("Google"));
    }
}

// HttpBot_5Test.java
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
* It contains ten unit test cases for the {@link HttpBot#performAction(ContentProcessable)} method.
*/
class HttpBot_5Test {
		
    /**
    * Test method for {@link HttpBot#performAction(ContentProcessable)}.
    * @throws MalformedURLException if the URL is malformed
    * @throws IOException if the URL is malformed
    * @throws ProcessException if the URL is malformed
    * @throws ActionException if the URL is malformed
    */
    @Test
    void testPerformAction() throws MalformedURLException, IOException, ProcessException, ActionException {
        HttpBot bot = new HttpBot();
        String url = "http://www.google.de";
        GetPage get = new GetPage(new URL(url));
        String result = bot.performAction(get);
        assertTrue(result.contains("Google"));
    }
}

// HttpBot_6Test.java
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
* It contains ten unit test cases for the {@link HttpBot#performAction(ContentProcessable)} method.
*/
class HttpBot_6Test {
		
    /**
    * Test method for {@link HttpBot#performAction(ContentProcessable)}.
    * @throws MalformedURLException if the URL is malformed
    * @throws IOException if the URL is malformed
    * @throws ProcessException if the URL is malformed
    * @throws ActionException if the URL is malformed
    */
    @Test
    void testPerformAction() throws MalformedURLException, IOException, ProcessException, ActionException {
        HttpBot bot = new HttpBot();
        String url = "http://www.google.de";
        Get get = new Get(new URL(url));
        String result = bot.performAction(get);
        assertTrue(result.contains("Google"));
    }
}

// HttpBot_7Test.