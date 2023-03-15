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

		private HttpBot bot;
		private HttpActionClient cc;
		private String url;
		
		/**
		 * Test method for {@link HttpBot#performAction(ContentProcessable)}.
		 * @throws MalformedURLException 
		 */
		@Test
		void testPerformAction() throws MalformedURLException {
			
			// Test case 1
			bot = new HttpBot();
			assertThrows(IllegalArgumentException.class, () -> {
				bot.performAction(null);
			});
			
			// Test case 2
			bot = new HttpBot("http://www.google.com");
			assertThrows(IllegalArgumentException.class, () -> {
				bot.performAction(null);
			});
			
			// Test case 3
			bot = new HttpBot(new URL("http://www.google.com"));
			assertThrows(IllegalArgumentException.class, () -> {
				bot.performAction(null);
			});
			
			// Test case 4
			cc = new HttpActionClient(new URL("http://www.google.com"));
			bot = new HttpBot(cc);
			assertThrows(IllegalArgumentException.class, () -> {
				bot.performAction(null);
			});
			
			// Test case 5
			bot = new HttpBot();
			assertThrows(ActionException.class, () -> {
				bot.performAction(new GetPage("http://www.google.com"));
			});
			
			// Test case 6
			bot = new HttpBot("http://www.google.com");
			assertThrows(ActionException.class, () -> {
				bot.performAction(new GetPage("http://www.google.com"));
			});
			
			// Test case 7
			bot = new HttpBot(new URL("http://www.google.com"));
			assertThrows(ActionException.class, () -> {
				bot.performAction(new GetPage("http://www.google.com"));
			});
			
			// Test case 8
			cc = new HttpActionClient(new URL("http://www.google.com"));
			bot = new HttpBot(cc);
			assertThrows(ActionException.class, () -> {
				bot.performAction(new GetPage("http://www.google.com"));
			});
			
			// Test case 9
			bot = new HttpBot();
			assertThrows(ActionException.class, () -> {
				bot.performAction(new Get("http://www.google.com"));
			});
			
			// Test case 10
			bot = new HttpBot("http://www.google.com");
			assertThrows(ActionException.class, () -> {
				bot.performAction(new Get("http://www.google.com"));
			});
			
		}
		
		/**
		 * Test method for {@link HttpBot#getHostUrl()}.
		 * @throws MalformedURLException 
		 */
		@Test
		void testGetHostUrl() throws MalformedURLException {
			
			// Test case 1
			bot = new HttpBot();
			assertThrows(ActionException.class, () -> {
				bot.getHostUrl();
			});
			
			// Test case 2
			bot = new HttpBot("http://www.google.com");
			assertEquals("http://www.google.com", bot.getHostUrl());
			
			// Test case 3
			bot = new HttpBot(new URL("http://www.google.com"));
			assertEquals("http://www.google.com", bot.getHostUrl());
			
			// Test case 4
			cc = new HttpActionClient(new URL("http://www.google.com"));
			bot = new HttpBot(cc);
			assertEquals("http://www.google.com", bot.getHostUrl());
			
		}
		
		/**
		 * Test method for {@link HttpBot#getPage(String)}.
		 * @throws MalformedURLException 
		 */
		@Test
		void testGetPage() throws MalformedURLException {
			
			// Test case 1
			bot = new HttpBot();
			assertThrows(ActionException.class, () -> {
				bot.getPage("http://www.google.com");
			});
			
			// Test case 2
			bot = new HttpBot("http://www.google.com");
			assertThrows(ActionException.class, () -> {
				bot.getPage("http://www.google.com");
			});
			
			// Test case 3
			bot = new HttpBot(new URL("http://www.google.com"));
			assertThrows(ActionException.class, () -> {
				bot.getPage("http://www.google.com");
			});
			
			// Test case 4
			cc = new HttpActionClient(new URL("http://www.google.com"));
			bot = new HttpBot(cc);
			assertThrows(ActionException.class, () -> {
				bot.getPage("http://www.google.com");
			});
			
		}
		
		/**
		 * Test method for {@link HttpBot#getBytes(String)}.
		 * @throws MalformedURLException 
		 */
		@Test
		void testGetBytes() throws MalformedURLException {
			
			// Test case 1
			bot = new HttpBot();
			assertThrows(ActionException.class, () -> {
				bot.getBytes("http://www.google.com");
			});
			
			// Test case 2
			bot = new HttpBot("http://www.google.com");
			assertThrows(ActionException.class, () -> {
				bot.getBytes("http://www.google.com");
			});
			
			// Test case 3
			bot = new HttpBot(new URL("http://www.google.com"));
			assertThrows(ActionException.class, () -> {
				bot.getBytes("http://www.google.com");
			});
			
			// Test case 4
			cc = new HttpActionClient(new URL("http://www.google.com"));
			bot = new HttpBot(cc);
			assertThrows(ActionException.class, () -> {
				bot.getBytes("http://www.google.com");
			});
			
		}
		
		/**
		 * Test method for {@link HttpBot#getClient()}.
		 * @throws MalformedURLException 
		 */
		@Test
		void testGetClient() throws MalformedURLException {
			
			// Test case 1
			bot = new HttpBot();
			assertThrows(ActionException.class, () -> {
