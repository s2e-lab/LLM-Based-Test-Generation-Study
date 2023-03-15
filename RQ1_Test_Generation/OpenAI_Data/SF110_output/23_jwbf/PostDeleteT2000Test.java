// PostDeleteTest.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.StringReader;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Post;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PostDelete}.
* It contains ten unit test cases for the {@link PostDelete#processReturningText(String, HttpAction)} method.
*/
class PostDeleteTest {

		/**
		 * Test case for {@link PostDelete#processReturningText(String, HttpAction)} method.
		 * It tests if the method returns the correct value for a successful delete action.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessReturningTextSuccess() throws ProcessException, ActionException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				PostDelete postDelete = new PostDelete(bot, "Test");
				String xml = "&lt;api&gt;&lt;delete title=\"Test\" reason=\"\" &gt;&lt;/delete&gt;&lt;/api&gt;";
				String result = postDelete.processReturningText(xml, new Post(""));
				assertEquals("", result);
		}
		
		/**
		 * Test case for {@link PostDelete#processReturningText(String, HttpAction)} method.
		 * It tests if the method returns the correct value for a successful delete action.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessReturningTextSuccess2() throws ProcessException, ActionException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				PostDelete postDelete = new PostDelete(bot, "Test");
				String xml = "&lt;api&gt;&lt;delete title=\"Test\" reason=\"\" &gt;&lt;/delete&gt;&lt;/api&gt;";
				String result = postDelete.processReturningText(xml, new Post(""));
				assertEquals("", result);
		}
		
		/**
		 * Test case for {@link PostDelete#processReturningText(String, HttpAction)} method.
		 * It tests if the method returns the correct value for a successful delete action.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessReturningTextSuccess3() throws ProcessException, ActionException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				PostDelete postDelete = new PostDelete(bot, "Test");
				String xml = "&lt;api&gt;&lt;delete title=\"Test\" reason=\"\" &gt;&lt;/delete&gt;&lt;/api&gt;";
				String result = postDelete.processReturningText(xml, new Post(""));
				assertEquals("", result);
		}
		
		/**
		 * Test case for {@link PostDelete#processReturningText(String, HttpAction)} method.
		 * It tests if the method returns the correct value for a successful delete action.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessReturningTextSuccess4() throws ProcessException, ActionException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				PostDelete postDelete = new PostDelete(bot, "Test");
				String xml = "&lt;api&gt;&lt;delete title=\"Test\" reason=\"\" &gt;&lt;/delete&gt;&lt;/api&gt;";
				String result = postDelete.processReturningText(xml, new Post(""));
				assertEquals("", result);
		}
		
		/**
		 * Test case for {@link PostDelete#processReturningText(String, HttpAction)} method.
		 * It tests if the method returns the correct value for a successful delete action.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessReturningTextSuccess5() throws ProcessException, ActionException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				PostDelete postDelete = new PostDelete(bot, "Test");
				String xml = "&lt;api&gt;&lt;delete title=\"Test\" reason=\"\" &gt;&lt;/delete&gt;&lt;/api&gt;";
				String result = postDelete.processReturningText(xml, new Post(""));
				assertEquals("", result);
		}
		
		/**
		 * Test case for {@link PostDelete#processReturningText(String, HttpAction)} method.
		 * It tests if the method returns the correct value for a successful delete action.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessReturningTextSuccess6() throws ProcessException, ActionException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				PostDelete postDelete = new PostDelete(bot, "Test");
				String xml = "&lt;api&gt;&lt;delete title=\"Test\" reason=\"\" &gt;&lt;/delete&gt;&lt;/api&gt;";
				String result = postDelete.processReturningText(xml, new Post(""));
				assertEquals("", result);
		}
		
		/**
		 * Test case for {@link PostDelete#processReturningText(String, HttpAction)} method.
		 * It tests if the method returns the correct value for a successful delete action.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessReturningTextSuccess7() throws ProcessException, ActionException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				PostDelete postDelete = new PostDelete(bot, "Test");
				String xml = "&lt;api&gt;&lt;delete title=\"Test\" reason=\"\" &gt;&lt;/delete&gt;&lt;/api&gt;";
				String result = postDelete.processReturningText(xml, new Post(""));
				assertEquals("", result);
		}
		
		/**
		 * Test case for {@link PostDelete#processReturningText(String, HttpAction)} method.
		 * It tests if the method returns the correct value for a successful delete action.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessReturningTextSuccess8() throws ProcessException, ActionException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				PostDelete postDelete = new PostDelete(bot, "Test");
				String xml = "&lt;api&gt;&lt;delete title=\"Test\" reason=\"\" &gt;&lt;/delete&gt;&lt;/api&gt;";
				String result = postDelete.processReturningText(xml, new Post(""));
				assertEquals("", result);
		}
		
		/**
		 * Test case for {@link PostDelete#processReturningText(String, HttpAction)} method.
		 * It tests if the method returns the correct value for a successful delete action.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessReturningTextSuccess9() throws ProcessException, ActionException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				PostDelete postDelete = new PostDelete(bot, "Test");
				String xml = "&lt;api&gt;&lt;delete