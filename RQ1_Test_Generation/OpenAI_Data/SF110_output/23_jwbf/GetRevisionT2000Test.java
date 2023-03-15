// GetRevisionTest.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_10;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.text.ParseException;
import java.util.Iterator;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version;
import net.sourceforge.jwbf.mediawiki.actions.util.ApiException;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetRevision}.
* It contains ten unit test cases for the {@link GetRevision#processReturningText(String, HttpAction)} method.
*/
class GetRevisionTest {

		/**
		* Test case for {@link GetRevision#processReturningText(String, HttpAction)} method.
		* It tests the case when the xml returned by the MediaWiki API contains the following elements:
		* <pre>
		* &lt;api&gt;
		* 	&lt;query&gt;
		* 		&lt;pages&gt;
		* 			&lt;page pageid="1" ns="0" title="Main Page"&gt;
		* 				&lt;revisions&gt;
		* 					&lt;rev revid="1" parentid="0" minor="false" user="127.0.0.1" timestamp="2007-12-22T19:58:00Z" comment="/* Main Page */ new"&gt;
		* 						&lt;text xml:space="preserve" bytes="0"&gt;
		* 							&lt;/text&gt;
		* 					&lt;/rev&gt;
		* 				&lt;/revisions&gt;
		* 			&lt;/page&gt;
		* 		&lt;/pages&gt;
		* 	&lt;/query&gt;
		* &lt;/api&gt;
		* </pre>
		* @throws IOException
		* @throws JDOMException
		* @throws ParseException
		* @throws ProcessException
		* @throws ActionException
		*/
		@Test
		void testProcessReturningText_1() throws IOException, JDOMException, ParseException, ProcessException, ActionException {
				String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\"><revisions><rev revid=\"1\" parentid=\"0\" minor=\"false\" user=\"127.0.0.1\" timestamp=\"2007-12-22T19:58:00Z\" comment=\"/* Main Page */ new\"><text xml:space=\"preserve\" bytes=\"0\"></text></rev></revisions></page></pages></query></api>";
				GetRevision gr = new GetRevision(MW1_09, "Main Page", GetRevision.CONTENT | GetRevision.TIMESTAMP | GetRevision.USER | GetRevision.COMMENT | GetRevision.IDS | GetRevision.FLAGS);
				gr.processReturningText(xml, new HttpAction());
				SimpleArticle sa = gr.getArticle();
				assertEquals("", sa.getText());
				assertEquals("1", sa.getRevisionId());
				assertEquals("/* Main Page */ new", sa.getEditSummary());
				assertEquals("127.0.0.1", sa.getEditor());
				assertEquals("2007-12-22T19:58:00Z", sa.getEditTimestamp());
				assertFalse(sa.isMinorEdit());
		}
		
		/**
		* Test case for {@link GetRevision#processReturningText(String, HttpAction)} method.
		* It tests the case when the xml returned by the MediaWiki API contains the following elements:
		* <pre>
		* &lt;api&gt;
		* 	&lt;query&gt;
		* 		&lt;pages&gt;
		* 			&lt;page pageid="1" ns="0" title="Main Page"&gt;
		* 				&lt;revisions&gt;
		* 					&lt;rev revid="1" parentid="0" minor="false" user="127.0.0.1" timestamp="2007-12-22T19:58:00Z" comment="/* Main Page */ new"&gt;
		* 						&lt;text xml:space="preserve" bytes="0"&gt;
		* 							&lt;/text&gt;
		* 					&lt;/rev&gt;
		* 				&lt;/revisions&gt;
		* 			&lt;/page&gt;
		* 		&lt;/pages&gt;
		* 	&lt;/query&gt;
		* &lt;/api&gt;
		* </pre>
		* @throws IOException
		* @throws JDOMException
		* @throws ParseException
		* @throws ProcessException
		* @throws ActionException
		*/
		@Test
		void testProcessReturningText_2() throws IOException, JDOMException, ParseException, ProcessException, ActionException {
				String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\"><revisions><rev revid=\"1\" parentid=\"0\" minor=\"false\" user=\"127.0.0.1\" timestamp=\"2007-12-22T19:58:00Z\" comment=\"/* Main Page */ new\"><text xml:space=\"preserve\" bytes=\"0\"></text></rev></revisions></page></pages></query></api>";
				GetRevision gr = new GetRevision(MW1_10, "Main Page", GetRevision.CONTENT | GetRevision.TIMESTAMP | GetRevision.USER | GetRevision.COMMENT | GetRevision.IDS | GetRevision.FLAGS);
				gr.processReturningText(xml, new HttpAction());
				SimpleArticle sa = gr.getArticle();
				assertEquals("", sa.getText());
				assertEquals("1", sa.getRevisionId());
				assertEquals("/* Main Page */ new", sa.getEditSummary());
				assertEquals("127.0.0.1", sa.getEditor());
				assertEquals("2007-12-22T19:58:00Z", sa.getEditTimestamp());
				assertFalse(sa.isMinorEdit());
		}
		
		/**
		* Test case for {@link GetRevision#processReturningText(String, HttpAction)} method.
		* It tests the case when the xml returned by the MediaWiki API contains the following elements:
		* <pre>
		* &lt;api&gt;
		* 	&lt;query&gt;
		* 		&lt;pages&gt;
		* 			&lt;page pageid="1" ns="0" title="Main Page"&gt;
		* 				&lt;revisions&gt;
		* 					&lt;rev revid="1" parentid="0" minor="false" user="127.0.0.1" timestamp="2007-12-22T19:58:00Z" comment="/* Main Page */ new"&gt;
		* 						&lt;text xml:space="preserve" bytes="0"&gt;
		* 							&lt;/text&gt;
		* 					&lt;/rev&gt;
		* 				&lt;/revisions&gt;
		* 			&lt;/page&gt;
		* 		&lt;/pages&gt;
		* 	&lt;/query&gt;
		* &lt;/api&gt;
		* </pre>
		* @throws IOException
		* @throws JDOMException
		* @throws ParseException
		* @throws ProcessException
		* @throws ActionException
		*/
		@Test
		void testProcessReturningText_3() throws IOException, JDOMException, ParseException, ProcessException,