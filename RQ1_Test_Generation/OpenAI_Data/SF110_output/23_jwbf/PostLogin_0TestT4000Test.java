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
		* <li>{@link PostLogin#processAllReturningText(String)}</li>
		* <li>{@link PostLogin#processAllReturningText(String)}</li>
		* <li>{@link PostLogin#processAllReturningText(String)}</li>
		* <li>{@link PostLogin#processAllReturningText(String)}</li>
		* <li>{@link PostLogin#processAllReturningText(String)}</li>
		* <li>{@link PostLogin#processAllReturningText(String)}</li>
		* <li>{@link PostLogin#processAllReturningText(String)}</li>
		* <li>{@link PostLogin#processAllReturningText(String)}</li>
		* <li>{@link PostLogin#processAllReturningText(String)}</li>
		* <li>{@link PostLogin#processAllReturningText(String)}</li>
		* </ul>
		* @throws ProcessException 
		* @throws ActionException 
		* @throws IOException 
		* @throws JDOMException 
		*/
		@Test
		void testProcessAllReturningText() throws ProcessException, ActionException, JDOMException, IOException {
				// TODO Auto-generated method stub
				PostLogin testSubject;
				String s;
				String result;
				
				// default test
				testSubject = createTestSubject();
				s = "";
				result = testSubject.processAllReturningText(s);
				assertEquals("", result);
				
				// test 1
				testSubject = createTestSubject();
				s = "";
				result = testSubject.processAllReturningText(s);
				assertEquals("", result);
				
				// test 2
				testSubject = createTestSubject();
				s = "";
				result = testSubject.processAllReturningText(s);
				assertEquals("", result);
				
				// test 3
				testSubject = createTestSubject();
				s = "";
				result = testSubject.processAllReturningText(s);
				assertEquals("", result);
				
				// test 4
				testSubject = createTestSubject();
				s = "";
				result = testSubject.processAllReturningText(s);
				assertEquals("", result);
				
				// test 5
				testSubject = createTestSubject();
				s = "";
				result = testSubject.processAllReturningText(s);
				assertEquals("", result);
				
				// test 6
				testSubject = createTestSubject();
				s = "";
				result = testSubject.processAllReturningText(s);
				assertEquals("", result);
				
				// test 7
				testSubject = createTestSubject();
				s = "";
				result = testSubject.processAllReturningText(s);
				assertEquals("", result);
				
				// test 8
				testSubject = createTestSubject();
				s = "";
				result = testSubject.processAllReturningText(s);
				assertEquals("", result);
				
				// test 9
				testSubject = createTestSubject();
				s = "";
				result = testSubject.processAllReturningText(s);
				assertEquals("", result);
		}
		
		/**
		* Test case for {@link PostLogin#findContent(Element)}
		* with the following input:
		* <ul>
		* <li>{@link PostLogin#findContent(Element)}</li>
		* <li>{@link PostLogin#findContent(Element)}</li>
		* <li>{@link PostLogin#findContent(Element)}</li>
		* <li>{@link PostLogin#findContent(Element)}</li>
		* <li>{@link PostLogin#findContent(Element)}</li>
		* <li>{@link PostLogin#findContent(Element)}</li>
		* <li>{@link PostLogin#findContent(Element)}</li>
		* <li>{@link PostLogin#findContent(Element)}</li>
		* <li>{@link PostLogin#findContent(Element)}</li>
		* <li>{@link PostLogin#findContent(Element)}</li>
		* </ul>
		* @throws ProcessException 
		* @throws ActionException 
		* @throws IOException 
		* @throws JDOMException 
		*/
		@Test
		void testFindContent() throws ProcessException, ActionException, JDOMException, IOException {
				// TODO Auto-generated method stub
				PostLogin testSubject;
				Element startElement;
				
				// default test
				testSubject = createTestSubject();
				startElement = null;
				testSubject.findContent(startElement);
				
				// test 1
				testSubject = createTestSubject();
				startElement = null;
				testSubject.findContent(startElement);
				
				// test 2
				testSubject = createTestSubject();
				startElement = null;
				testSubject.findContent(startElement);
				
				// test 3
				testSubject = createTestSubject();
				startElement = null;
				testSubject.findContent(startElement);
				
				// test 4
				testSubject = createTestSubject();
				startElement = null;
				testSubject.findContent(startElement);
				
				// test 5
				testSubject = createTestSubject();
				startElement = null;
				testSubject.findContent(startElement);
				
				// test 6
				testSubject = createTestSubject();
				startElement = null;
				testSubject.findContent(startElement);
				
				// test 7
				testSubject = createTestSubject();
				startElement = null;
				testSubject.findContent(startElement);
				
				// test 8
				testSubject = createTestSubject();
				startElement = null;
				testSubject.findContent(startElement);
				
				// test 9
				testSubject = createTestSubject();
				startElement = null;
				testSubject.findContent(startElement);
		}
		
		/**
		* Test case for {@link PostLogin#getNextMessage()}
		* with the following input:
		* <ul>
		* <li>{@link PostLogin#getNextMessage()}</li>
		* <li>{@link PostLogin#getNextMessage()}</li>
		* <li>{@link PostLogin#getNextMessage()}</li>
		* <li>{@link PostLogin#getNextMessage()}</li>
		* <li>{@link PostLogin#getNextMessage()}</li>
		* <li>{@link PostLogin#getNextMessage()}</li>
		* <li>{@link PostLogin#getNextMessage()}</li>
		* <li>{@link PostLogin#getNextMessage()}</li>
		* <li>{@link PostLogin#getNextMessage()}</li>
		* <li>{@link PostLogin#getNextMessage()}</li>
		* </ul>
		*/
		@Test
		void testGetNextMessage() {
				// TODO Auto-generated method stub
				PostLogin testSubject;
				HttpAction result;
				
				// default test
				testSubject = createTestSubject();
				result = testSubject.getNextMessage();
				assertEquals(null, result);
				
				// test 1
				testSubject = createTestSubject();
				result = testSubject.getNextMessage();
				assertEquals(null, result);
				
				// test 2
				testSubject = createTestSubject();
				result = testSubject.getNextMessage();
				assertEquals(null, result);
				
				// test 3
				testSubject = createTestSubject();
				result = testSubject.getNextMessage();
				assertEquals(null, result);
				
				// test 4
				testSubject = createTestSubject();
				result = testSubject.getNextMessage();
				assertEquals(null, result);
				
				// test 5
				testSubject = createTestSubject();
				result = testSubject.getNextMessage();
				assertEquals(null, result);
				
				// test 6
				testSubject = createTestSubject();
				result = testSubject.getNextMessage();
				assertEquals(null, result);
				
				// test 7
				testSubject = createTestSubject();
				result = testSubject.getNextMessage();
				assertEquals(null, result);
				
				// test 8
				testSubject = createTestSubject();
				result = testSubject.getNextMessage();
				assertEquals(null, result);
				
				// test 9
				testSubject = createTestSubject();
				result = testSubject.getNextMessage();
				assertEquals(null, result);
		}
		
		/**
		* Test case for {@link PostLogin#hasMoreMessages()}
		* with the following input:
		* <ul>
		* <li>{@link PostLogin#hasMoreMessages()}</li>
		* <li>{@link PostLogin#hasMoreMessages()}</li>
		* <li>{@link PostLogin#hasMoreMessages()}</li>
		* <li>{@link PostLogin#hasMoreMessages()}</li>
		* <li>{@link PostLogin#hasMoreMessages()}</li>
		* <li>{@link PostLogin#hasMoreMessages()}</li>
		* <li>{@link PostLogin#hasMoreMessages()}</li>
		* <li>{@link PostLogin#hasMoreMessages()}</li>
		* <li>{@link PostLogin#hasMoreMessages()}</li>
		* <li>{@link PostLogin#hasMoreMessages()}</li>
		* </ul>
		*/
		@Test
		void testHasMoreMessages() {
				// TODO Auto-generated method stub
				PostLogin testSubject;
				boolean result;
				
				// default test
				testSubject = createTestSubject();
				result = testSubject.hasMoreMessages();
				assertEquals(false, result);
				
				// test 1
				testSubject = createTestSubject();
				result = testSubject.hasMoreMessages();
				assertEquals(false, result);
				
				// test 2
				testSubject = createTestSubject();
				result = testSubject.hasMoreMessages();
				assertEquals(false, result);
				
				// test 3
				testSubject = createTestSubject();
				result = testSubject.hasMoreMessages();
				assertEquals(false, result);
				
				// test 4
				testSubject = createTestSubject();
				result = testSubject.hasMoreMessages();
				assertEquals(false, result);
				
				// test 5
				testSubject = createTestSubject();
				result = testSubject.hasMoreMessages();
				assertEquals(false, result);
				
				// test 6
				testSubject = createTestSubject();
				result = testSubject.hasMoreMessages();
				assertEquals(false, result);
				
				// test 7
				testSubject = createTestSubject();
				result = testSubject.hasMoreMessages();
				assertEquals(false, result);
				
				// test 8
				testSubject = createTestSubject();
				result = testSubject.hasMoreMessages();
				assertEquals(false, result);
				
				// test 9
				testSubject = createTestSubject();
				result = testSubject.hasMoreMessages();
				assertEquals(false, result);
		}
		
		/**
		* Test case for {@link PostLogin#getLoginMsg(String, String, String, String)}
		* with the following input:
		* <ul>
		* <li>{@link PostLogin#getLoginMsg(String, String, String, String)}</li>
		* <li>{@link PostLogin#getLoginMsg(String, String, String, String)}</li>
		* <li>{@link PostLogin#getLoginMsg(String, String, String, String)}</li>
		* <li>{@link PostLogin#getLoginMsg(String, String, String, String)}</li>
		* <li>{@link PostLogin#getLoginMsg(String, String, String, String)}</li>
		* <li>{@link PostLogin#getLoginMsg(String, String, String, String)}</li>
		* <li>{@link PostLogin#getLoginMsg(String, String, String, String)}</li>
		* <li>{@link PostLogin#getLoginMsg(String, String, String, String)}</li>
		* <li>{@link PostLogin#getLoginMsg(String, String, String, String)}</li>
		* <li>{@link PostLogin#getLoginMsg(String, String, String, String)}</li>
		* </ul>
		*/
		@Test
		void testGetLoginMsg() {
				// TODO Auto-generated method stub
				PostLogin testSubject;
				String username;
				String pw;
				String domain;
				String token;