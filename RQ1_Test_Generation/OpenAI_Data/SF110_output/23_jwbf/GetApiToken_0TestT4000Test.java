// GetApiToken_0Test.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.StringReader;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetApiToken}.
* It contains ten unit test cases for the {@link GetApiToken#processReturningText(String, HttpAction)} method.
*/
class GetApiToken_0Test {

		/**
		* Test case for {@link GetApiToken#processReturningText(String, HttpAction)} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testProcessReturningText_0() throws VersionException, IOException, JDOMException, ProcessException {
				
				// Arrange
				String s = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\" contentmodel=\"wikitext\" pagelanguage=\"en\" touched=\"2010-11-15T13:12:10Z\" lastrevid=\"1\" counter=\"\" length=\"0\" new=\"\" /></pages></query></api>";
				HttpAction hm = new HttpAction(null, null, null);
				GetApiToken getApiToken = new GetApiToken(GetApiToken.Intoken.DELETE, "Main Page", MW1_12, new Userinfo());
				
				// Act
				String actual = getApiToken.processReturningText(s, hm);
				
				// Assert
				assertEquals("", actual);
		}
		
		/**
		* Test case for {@link GetApiToken#processReturningText(String, HttpAction)} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testProcessReturningText_1() throws VersionException, IOException, JDOMException, ProcessException {
				
				// Arrange
				String s = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\" contentmodel=\"wikitext\" pagelanguage=\"en\" touched=\"2010-11-15T13:12:10Z\" lastrevid=\"1\" counter=\"\" length=\"0\" new=\"\" /></pages></query></api>";
				HttpAction hm = new HttpAction(null, null, null);
				GetApiToken getApiToken = new GetApiToken(GetApiToken.Intoken.DELETE, "Main Page", MW1_13, new Userinfo());
				
				// Act
				String actual = getApiToken.processReturningText(s, hm);
				
				// Assert
				assertEquals("", actual);
		}
		
		/**
		* Test case for {@link GetApiToken#processReturningText(String, HttpAction)} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testProcessReturningText_2() throws VersionException, IOException, JDOMException, ProcessException {
				
				// Arrange
				String s = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\" contentmodel=\"wikitext\" pagelanguage=\"en\" touched=\"2010-11-15T13:12:10Z\" lastrevid=\"1\" counter=\"\" length=\"0\" new=\"\" /></pages></query></api>";
				HttpAction hm = new HttpAction(null, null, null);
				GetApiToken getApiToken = new GetApiToken(GetApiToken.Intoken.DELETE, "Main Page", MW1_14, new Userinfo());
				
				// Act
				String actual = getApiToken.processReturningText(s, hm);
				
				// Assert
				assertEquals("", actual);
		}
		
		/**
		* Test case for {@link GetApiToken#processReturningText(String, HttpAction)} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testProcessReturningText_3() throws VersionException, IOException, JDOMException, ProcessException {
				
				// Arrange
				String s = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\" contentmodel=\"wikitext\" pagelanguage=\"en\" touched=\"2010-11-15T13:12:10Z\" lastrevid=\"1\" counter=\"\" length=\"0\" new=\"\" /></pages></query></api>";
				HttpAction hm = new HttpAction(null, null, null);
				GetApiToken getApiToken = new GetApiToken(GetApiToken.Intoken.DELETE, "Main Page", MW1_15, new Userinfo());
				
				// Act
				String actual = getApiToken.processReturningText(s, hm);
				
				// Assert
				assertEquals("", actual);
		}
		
		/**
		* Test case for {@link GetApiToken#processReturningText(String, HttpAction)} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testProcessReturningText_4() throws VersionException, IOException, JDOMException, ProcessException {
				
				// Arrange
				String s = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\" contentmodel=\"wikitext\" pagelanguage=\"en\" touched=\"2010-11-15T13:12:10Z\" lastrevid=\"1\" counter=\"\" length=\"0\" new=\"\" /></pages></query></api>";
				HttpAction hm = new HttpAction(null, null, null);
				GetApiToken getApiToken = new GetApiToken(GetApiToken.Intoken.DELETE, "Main Page", MW1_16, new Userinfo());
				
				// Act
				String actual = getApiToken.processReturningText(s, hm);
				
				// Assert
				assertEquals("", actual);
		}
		
		/**
		* Test case for {@link GetApiToken#processReturningText(String, HttpAction)} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testProcessReturningText_5() throws VersionException, IOException, JDOMException, ProcessException {
				
				// Arrange
				String s = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\" contentmodel=\"wikitext\" pagelanguage=\"en\" touched=\"2010-11-15T13:12:10Z\" lastrevid=\"1\" counter=\"\" length=\"0\" new=\"\" /></pages></query></api>";
				HttpAction hm = new HttpAction(null, null, null);
				GetApiToken getApiToken = new GetApiToken(GetApiToken.Intoken.EDIT, "Main Page", MW1_12, new Userinfo());
				
				// Act
				String actual = getApiToken.processReturningText(s, hm);
				
				// Assert
				assertEquals("", actual);
		}
		
		/**
		* Test case for {@link GetApiToken#processReturningText(String, HttpAction)} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testProcessReturningText_6() throws VersionException, IOException, JDOMException, ProcessException {
				
				// Arrange
				String s = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\" contentmodel=\"wikitext\" pagelanguage=\"en\" touched=\"2010-11-15T13:12:10Z\" lastrevid=\"1\" counter=\"\" length=\"0\" new=\"\" /></pages></query></api>";
				HttpAction hm = new HttpAction(null, null, null);
				GetApiToken getApiToken = new GetApiToken(GetApiToken.Intoken.EDIT, "Main Page", MW1_13, new Userinfo());
				
				// Act
				String actual = getApiToken.processReturningText(s, hm);
				
				// Assert
				assertEquals("", actual);
		}
		
		/**
		* Test case for {@link GetApiToken#processReturningText(String, HttpAction)} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testProcessReturningText_7() throws VersionException, IOException, JDOMException, ProcessException {
				
				// Arrange
				String s = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\" contentmodel=\"wikitext\" pagelanguage=\"en\" touched=\"2010-11-15T13:12:10Z\" lastrevid=\"1\" counter=\"\" length=\"0\" new=\"\" /></pages></query></api>";
				HttpAction hm = new HttpAction(null, null, null);
				GetApiToken getApiToken = new GetApiToken(GetApiToken.Intoken.EDIT, "Main Page", MW1_14, new Userinfo());
				
				// Act
				String actual = getApiToken.processReturningText(s, hm);
				
				// Assert
				assertEquals("", actual);
		}
		
		/**
		* Test case for {@link GetApiToken#processReturningText(String, HttpAction)} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testProcessReturningText_8() throws VersionException, IOException, JDOMException, ProcessException {
				
				// Arrange
				String s = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\" contentmodel=\"wikitext\" pagelanguage=\"en\" touched=\"2010-11-15T13:12:10Z\" lastrevid=\"1\" counter=\"\" length=\"0\" new=\"\" /></pages></query></api>";
				HttpAction hm = new HttpAction(null, null, null);
				GetApiToken getApiToken = new GetApiToken(GetApiToken.Intoken.EDIT, "Main Page", MW1_15, new Userinfo());
				
				// Act
				String actual = getApiToken.processReturningText(s, hm);
				
				// Assert
				assertEquals("", actual);
		}
		
		/**
		* Test case for {@link GetApiToken#processReturningText(String, HttpAction)} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testProcessReturningText_9() throws VersionException, IOException, JDOMException, ProcessException {
				
				// Arrange
				String s = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\" contentmodel=\"wikitext\" pagelanguage=\"en\" touched=\"2010-11-15T13:12:10Z\" lastrevid=\"1\" counter=\"\" length=\"0\" new=\"\" /></pages></query></api>";
				HttpAction hm = new HttpAction(null, null, null);
				GetApiToken getApiToken = new GetApiToken(GetApiToken.Intoken.EDIT, "Main Page", MW1_16, new Userinfo());
				
				// Act
				String actual = getApiToken.processReturningText(s, hm);
				
				// Assert
				assertEquals("", actual);
		}
		
}

// GetApiToken_1Test.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.StringReader;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
