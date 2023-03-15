// PostLogin_0Test.java
package net.sourceforge.jwbf.mediawiki.actions.login;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Post;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.contentRep.LoginData;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PostLogin}.
* It contains ten unit test cases for the {@link PostLogin#processAllReturningText(String)} method.
*/
class PostLogin_0Test {

		/**
		* Test case for {@link PostLogin#processAllReturningText(String)}
		* with the following input:
		* <ul>
		* 	<li>username: "test"</li>
		* 	<li>pw: "test"</li>
		* 	<li>domain: "test"</li>
		* 	<li>login: null</li>
		* 	<li>s: "&lt;api&gt;&lt;login result=\"NeedToken\" token=\"test\" cookieprefix=\"test\" sessionid=\"test\"&gt;&lt;/login&gt;&lt;/api&gt;"</li>
		* </ul>
		* @throws ProcessException 
		*/
		@Test
		void testProcessAllReturningText_0() throws ProcessException {
			// Arrange
			String username = "test";
			String pw = "test";
			String domain = "test";
			LoginData login = null;
			PostLogin postLogin = new PostLogin(username, pw, domain, login);
			String s = "&lt;api&gt;&lt;login result=\"NeedToken\" token=\"test\" cookieprefix=\"test\" sessionid=\"test\"&gt;&lt;/login&gt;&lt;/api&gt;";
			
			// Act
			String actual = postLogin.processAllReturningText(s);
			
			// Assert
			assertEquals(s, actual);
		}
		
		/**
		* Test case for {@link PostLogin#processAllReturningText(String)}
		* with the following input:
		* <ul>
		* 	<li>username: "test"</li>
		* 	<li>pw: "test"</li>
		* 	<li>domain: "test"</li>
		* 	<li>login: null</li>
		* 	<li>s: "&lt;api&gt;&lt;login result=\"Success\" lguserid=\"test\" lgusername=\"test\" lgtoken=\"test\" cookieprefix=\"test\" sessionid=\"test\"&gt;&lt;/login&gt;&lt;/api&gt;"</li>
		* </ul>
		* @throws ProcessException 
		*/
		@Test
		void testProcessAllReturningText_1() throws ProcessException {
			// Arrange
			String username = "test";
			String pw = "test";
			String domain = "test";
			LoginData login = null;
			PostLogin postLogin = new PostLogin(username, pw, domain, login);
			String s = "&lt;api&gt;&lt;login result=\"Success\" lguserid=\"test\" lgusername=\"test\" lgtoken=\"test\" cookieprefix=\"test\" sessionid=\"test\"&gt;&lt;/login&gt;&lt;/api&gt;";
			
			// Act
			String actual = postLogin.processAllReturningText(s);
			
			// Assert
			assertEquals(s, actual);
		}
		
		/**
		* Test case for {@link PostLogin#processAllReturningText(String)}
		* with the following input:
		* <ul>
		* 	<li>username: "test"</li>
		* 	<li>pw: "test"</li>
		* 	<li>domain: "test"</li>
		* 	<li>login: null</li>
		* 	<li>s: "&lt;api&gt;&lt;login result=\"WrongPass\" lguserid=\"test\" lgusername=\"test\" lgtoken=\"test\" cookieprefix=\"test\" sessionid=\"test\"&gt;&lt;/login&gt;&lt;/api&gt;"</li>
		* </ul>
		* @throws ProcessException 
		*/
		@Test
		void testProcessAllReturningText_2() throws ProcessException {
			// Arrange
			String username = "test";
			String pw = "test";
			String domain = "test";
			LoginData login = null;
			PostLogin postLogin = new PostLogin(username, pw, domain, login);
			String s = "&lt;api&gt;&lt;login result=\"WrongPass\" lguserid=\"test\" lgusername=\"test\" lgtoken=\"test\" cookieprefix=\"test\" sessionid=\"test\"&gt;&lt;/login&gt;&lt;/api&gt;";
			
			// Act
			String actual = postLogin.processAllReturningText(s);
			
			// Assert
			assertEquals(s, actual);
		}
		
		/**
		* Test case for {@link PostLogin#processAllReturningText(String)}
		* with the following input:
		* <ul>
		* 	<li>username: "test"</li>
		* 	<li>pw: "test"</li>
		* 	<li>domain: "test"</li>
		* 	<li>login: null</li>
		* 	<li>s: "&lt;api&gt;&lt;login result=\"NotExists\" lguserid=\"test\" lgusername=\"test\" lgtoken=\"test\" cookieprefix=\"test\" sessionid=\"test\"&gt;&lt;/login&gt;&lt;/api&gt;"</li>
		* </ul>
		* @throws ProcessException 
		*/
		@Test
		void testProcessAllReturningText_3() throws ProcessException {
			// Arrange
			String username = "test";
			String pw = "test";
			String domain = "test";
			LoginData login = null;
			PostLogin postLogin = new PostLogin(username, pw, domain, login);
			String s = "&lt;api&gt;&lt;login result=\"NotExists\" lguserid=\"test\" lgusername=\"test\" lgtoken=\"test\" cookieprefix=\"test\" sessionid=\"test\"&gt;&lt;/login&gt;&lt;/api&gt;";
			
			// Act
			String actual = postLogin.processAllReturningText(s);
			
			// Assert
			assertEquals(s, actual);
		}
		
		/**
		* Test case for {@link PostLogin#processAllReturningText(String)}
		* with the following input:
		* <ul>
		* 	<li>username: "test"</li>
		* 	<li>pw: "test"</li>
		* 	<li>domain: "test"</li>
		* 	<li>login: null</li>
		* 	<li>s: "&lt;api&gt;&lt;login result=\"NeedToken\" token=\"test\" cookieprefix=\"test\" sessionid=\"test\"&gt;&lt;/login&gt;&lt;/api&gt;"</li>
		* </ul>
		* @throws ProcessException 
		*/
		@Test
		void testProcessAllReturningText_4() throws ProcessException {
			// Arrange
			String username = "test";
			String pw = "test";
			String domain = "test";
			LoginData login = null;
			PostLogin postLogin = new PostLogin(username, pw, domain, login);
			String s = "&lt;api&gt;&lt;login