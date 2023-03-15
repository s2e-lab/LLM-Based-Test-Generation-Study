// LogEvents_0Test.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.LogItem;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LogEvents}.
* It contains ten unit test cases for the {@link LogEvents#processAllReturningText(String)} method.
*/
class LogEvents_0Test {

		/**
		 * Test method for {@link LogEvents#processAllReturningText(String)}.
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws VersionException 
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessAllReturningText() throws JDOMException, IOException, ActionException, ProcessException, VersionException {
			
			String xml = "<api><query><logevents letype=\"block\" leuser=\"JWBF\" lelimit=\"10\" lestart=\"2008-01-01T00:00:00Z\" leend=\"2008-01-02T00:00:00Z\" leprop=\"ids|title|type|user|timestamp|comment|details\" leaction=\"block/block\" leid=\"1\" leuserid=\"1\" letimestamp=\"2008-01-01T00:00:00Z\" lecomment=\"\" ledetails=\"\" /></query></api>";
			
			SAXBuilder builder = new SAXBuilder();
			Reader i = new StringReader(xml);
			Document doc = builder.build(new InputSource(i));
			Element root = doc.getRootElement();
			
			LogEvents test = new LogEvents(new MediaWikiBot("http://localhost/w/api.php"), "block");
			test.findContent(root);
			
			Collection<LogItem> logCollection = new Vector<LogItem>();
			logCollection = test.logCollection;
			
			Iterator<LogItem> logIterator = logCollection.iterator();
			
			LogItem logItem = logIterator.next();
			
			assertEquals("block", logItem.getType());
			assertEquals("JWBF", logItem.getUser());
			
		}
		
		/**
		 * Test method for {@link LogEvents#processAllReturningText(String)}.
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws VersionException 
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessAllReturningText2() throws JDOMException, IOException, ActionException, ProcessException, VersionException {
			
			String xml = "<api><query><logevents letype=\"block\" leuser=\"JWBF\" lelimit=\"10\" lestart=\"2008-01-01T00:00:00Z\" leend=\"2008-01-02T00:00:00Z\" leprop=\"ids|title|type|user|timestamp|comment|details\" leaction=\"block/block\" leid=\"1\" leuserid=\"1\" letimestamp=\"2008-01-01T00:00:00Z\" lecomment=\"\" ledetails=\"\" /></query></api>";
			
			SAXBuilder builder = new SAXBuilder();
			Reader i = new StringReader(xml);
			Document doc = builder.build(new InputSource(i));
			Element root = doc.getRootElement();
			
			LogEvents test = new LogEvents(new MediaWikiBot("http://localhost/w/api.php"), "block");
			test.findContent(root);
			
			Collection<LogItem> logCollection = new Vector<LogItem>();
			logCollection = test.logCollection;
			
			Iterator<LogItem> logIterator = logCollection.iterator();
			
			LogItem logItem = logIterator.next();
			
			assertEquals("block", logItem.getType());
			assertEquals("JWBF", logItem.getUser());
			
		}
		
		/**
		 * Test method for {@link LogEvents#processAllReturningText(String)}.
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws VersionException 
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessAllReturningText3() throws JDOMException, IOException, ActionException, ProcessException, VersionException {
			
			String xml = "<api><query><logevents letype=\"block\" leuser=\"JWBF\" lelimit=\"10\" lestart=\"2008-01-01T00:00:00Z\" leend=\"2008-01-02T00:00:00Z\" leprop=\"ids|title|type|user|timestamp|comment|details\" leaction=\"block/block\" leid=\"1\" leuserid=\"1\" letimestamp=\"2008-01-01T00:00:00Z\" lecomment=\"\" ledetails=\"\" /></query></api>";
			
			SAXBuilder builder = new SAXBuilder();
			Reader i = new StringReader(xml);
			Document doc = builder.build(new InputSource(i));
			Element root = doc.getRootElement();
			
			LogEvents test = new LogEvents(new MediaWikiBot("http://localhost/w/api.php"), "block");
			test.findContent(root);
			
			Collection<LogItem> logCollection = new Vector<LogItem>();
			logCollection = test.logCollection;
			
			Iterator<LogItem> logIterator = logCollection.iterator();
			
			LogItem logItem = logIterator.next();
			
			assertEquals("block", logItem.getType());
			assertEquals("JWBF", logItem.getUser());
			
		}
		
		/**
		 * Test method for {@link LogEvents#processAllReturningText(String)}.
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws VersionException 
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessAllReturningText4() throws JDOMException, IOException, ActionException, ProcessException, VersionException {
			
			String xml = "<api><query><logevents letype=\"block\" leuser=\"JWBF\" lelimit=\"10\" lestart=\"2008-01-01T00:00:00Z\" leend=\"2008-01-02T00:00:00Z\" leprop=\"ids|title|type|user|timestamp|comment|details\" leaction=\"block/block\" leid=\"1\" leuserid=\"1\" letimestamp=\"2008-01-01T00:00:00Z\" lecomment=\"\" ledetails=\"\" /></query></api>";
			
			SAXBuilder builder = new SAXBuilder();
			Reader i = new StringReader(xml);
			Document doc = builder.build(new InputSource(i));
			Element root = doc.getRootElement();
			
			LogEvents test = new LogEvents(new MediaWikiBot("http://localhost/w/api.php"), "block");
			test.findContent(root);
			
			Collection<LogItem> logCollection = new Vector<LogItem>();
			logCollection = test.logCollection;
			
			Iterator<LogItem> logIterator = logCollection.iterator();
			
			LogItem logItem = logIterator.next();
			
			assertEquals("block", logItem.getType());
			assertEquals("JWBF", logItem.getUser());
			
		}
		
		/**
		 * Test method for {@link LogEvents#processAllReturningText(String)}.
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws VersionException 
		 * @throws ProcessException 
		 * @th