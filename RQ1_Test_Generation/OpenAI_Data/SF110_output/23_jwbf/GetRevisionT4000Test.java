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
		* It tests the case when the content of the article is retrieved.
		*/
		@Test
		void testProcessReturningText_Content() {
				
				// Arrange
				String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\"><revisions><rev revid=\"1\" parentid=\"0\" minor=\"\" user=\"MediaWiki default\" timestamp=\"2007-12-22T22:59:59Z\" comment=\"\" /></revisions></page></pages></query></api>";
				GetRevision gr = new GetRevision(MW1_09, "Main Page", GetRevision.CONTENT);
				
				// Act
				gr.processReturningText(xml, null);
				
				// Assert
				assertEquals("", gr.getArticle().getText());
		}
		
		/**
		* Test case for {@link GetRevision#processReturningText(String, HttpAction)} method.
		* It tests the case when the timestamp of the article is retrieved.
		*/
		@Test
		void testProcessReturningText_Timestamp() {
				
				// Arrange
				String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\"><revisions><rev revid=\"1\" parentid=\"0\" minor=\"\" user=\"MediaWiki default\" timestamp=\"2007-12-22T22:59:59Z\" comment=\"\" /></revisions></page></pages></query></api>";
				GetRevision gr = new GetRevision(MW1_09, "Main Page", GetRevision.TIMESTAMP);
				
				// Act
				gr.processReturningText(xml, null);
				
				// Assert
				assertEquals("2007-12-22T22:59:59Z", gr.getArticle().getEditTimestamp());
		}
		
		/**
		* Test case for {@link GetRevision#processReturningText(String, HttpAction)} method.
		* It tests the case when the user of the article is retrieved.
		*/
		@Test
		void testProcessReturningText_User() {
				
				// Arrange
				String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\"><revisions><rev revid=\"1\" parentid=\"0\" minor=\"\" user=\"MediaWiki default\" timestamp=\"2007-12-22T22:59:59Z\" comment=\"\" /></revisions></page></pages></query></api>";
				GetRevision gr = new GetRevision(MW1_09, "Main Page", GetRevision.USER);
				
				// Act
				gr.processReturningText(xml, null);
				
				// Assert
				assertEquals("MediaWiki default", gr.getArticle().getEditor());
		}
		
		/**
		* Test case for {@link GetRevision#processReturningText(String, HttpAction)} method.
		* It tests the case when the comment of the article is retrieved.
		*/
		@Test
		void testProcessReturningText_Comment() {
				
				// Arrange
				String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\"><revisions><rev revid=\"1\" parentid=\"0\" minor=\"\" user=\"MediaWiki default\" timestamp=\"2007-12-22T22:59:59Z\" comment=\"\" /></revisions></page></pages></query></api>";
				GetRevision gr = new GetRevision(MW1_09, "Main Page", GetRevision.COMMENT);
				
				// Act
				gr.processReturningText(xml, null);
				
				// Assert
				assertEquals("", gr.getArticle().getEditSummary());
		}
		
		/**
		* Test case for {@link GetRevision#processReturningText(String, HttpAction)} method.
		* It tests the case when the revision id of the article is retrieved.
		*/
		@Test
		void testProcessReturningText_RevisionId() {
				
				// Arrange
				String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\"><revisions><rev revid=\"1\" parentid=\"0\" minor=\"\" user=\"MediaWiki default\" timestamp=\"2007-12-22T22:59:59Z\" comment=\"\" /></revisions></page></pages></query></api>";
				GetRevision gr = new GetRevision(MW1_09, "Main Page", GetRevision.IDS);
				
				// Act
				gr.processReturningText(xml, null);
				
				// Assert
				assertEquals("1", gr.getArticle().getRevisionId());
		}
		
		/**
		* Test case for {@link GetRevision#processReturningText(String, HttpAction)} method.
		* It tests the case when the flags of the article is retrieved.
		*/
		@Test
		void testProcessReturningText_Flags() {
				
				// Arrange
				String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\"><revisions><rev revid=\"1\" parentid=\"0\" minor=\"\" user=\"MediaWiki default\" timestamp=\"2007-12-22T22:59:59Z\" comment=\"\" /></revisions></page></pages></query></api>";
				GetRevision gr = new GetRevision(MW1_09, "Main Page", GetRevision.FLAGS);
				
				// Act
				gr.processReturningText(xml, null);
				
				// Assert
				assertFalse(gr.getArticle().isMinorEdit());
		}
		
		/**
		* Test case for {@link GetRevision#processReturningText(String, HttpAction)} method.
		* It tests the case when the first revision of the article is retrieved.
		*/
		@Test
		void testProcessReturningText_First() {
				
				// Arrange
				String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\"><revisions><rev revid=\"1\" parentid=\"0\" minor=\"\" user=\"MediaWiki default\" timestamp=\"2007-12-22T22:59:59Z\" comment=\"\" /></revisions></page></pages></query></api>";
				GetRevision gr = new GetRevision(MW1_09, "Main Page", GetRevision.FIRST);
				
				// Act
				gr.processReturningText(xml, null);
				
				// Assert
				assertEquals("1", gr.getArticle().getRevisionId());
		}
		
		/**
		* Test case for {@link GetRevision#processReturningText(String, HttpAction)} method.
		* It tests the case when the last revision of the article is retrieved.
		*/
		@Test
		void testProcessReturningText_Last() {
				
				// Arrange
				String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\"><revisions><rev revid=\"1\" parentid=\"0\" minor=\"\" user=\"MediaWiki default\" timestamp=\"2007-12-22T22:59:59Z\" comment=\"\" /></revisions></page></pages></query></api>";
				GetRevision gr = new GetRevision(MW1_09, "Main Page", GetRevision.LAST);
				
				// Act
				gr.processReturningText(xml, null);
				
				// Assert
				assertEquals("1", gr.getArticle().getRevisionId());
		}
		
		/**
		* Test case for {@link GetRevision#processReturningText(String, HttpAction)} method.
		* It tests the case when the content, timestamp, user, comment, revision id and flags of the article are retrieved.
		*/
		@Test
		void testProcessReturningText_All() {
				
				// Arrange
				String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\"><revisions><rev revid=\"1\" parentid=\"0\" minor=\"\" user=\"MediaWiki default\" timestamp=\"2007-12-22T22:59:59Z\" comment=\"\" /></revisions></page></pages></query></api>";
				GetRevision gr = new GetRevision(MW1_09, "Main Page", GetRevision.CONTENT | GetRevision.TIMESTAMP | GetRevision.USER | GetRevision.COMMENT | GetRevision.IDS | GetRevision.FLAGS);
				
				// Act
				gr.processReturningText(xml, null);
				
				// Assert
				assertEquals("", gr.getArticle().getText());
				assertEquals("2007-12-22T22:59:59Z", gr.getArticle().getEditTimestamp());
				assertEquals("MediaWiki default", gr.getArticle().getEditor());
				assertEquals("", gr.getArticle().getEditSummary());
				assertEquals("1", gr.getArticle().getRevisionId());
				assertFalse(gr.getArticle().isMinorEdit());
		}
		
		/**
		* Test case for {@link GetRevision#processReturningText(String, HttpAction)} method.
		* It tests the case when the content, timestamp, user, comment, revision id and flags of the article are retrieved.
		*/
		@Test
		void testProcessReturningText_All_MW1_11() {
				
				// Arrange
				String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\"><revisions><rev revid=\"1\" parentid=\"0\" minor=\"\" user=\"MediaWiki default\" timestamp=\"2007-12-22T22:59:59Z\" comment=\"\" /></revisions></page></pages></query></api>";
				GetRevision gr = new GetRevision(MW1_11, "Main Page", GetRevision.CONTENT | GetRevision.TIMESTAMP | GetRevision.USER | GetRevision.COMMENT | GetRevision.IDS | GetRevision.FLAGS);
				
				// Act
				gr.processReturningText(xml, null);
				
				// Assert
				assertEquals("", gr.getArticle().getText());
				assertEquals("2007-12-22T22:59:59Z", gr.getArticle().getEditTimestamp());
				assertEquals("MediaWiki default", gr.getArticle().getEditor());
				assertEquals("", gr.getArticle().getEditSummary());
				assertEquals("1", gr.getArticle().getRevisionId());
				assertFalse(gr.getArticle().isMinorEdit());
		}
		
		/**
		* Test case for {@link GetRevision#processReturningText(String, HttpAction)} method.
		* It tests the case when the content, timestamp, user, comment, revision id and flags of the article are retrieved.
		*/
		@Test
		void testProcessReturningText_All_MW1_12() {
				
				// Arrange
				String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\"><revisions><rev revid=\"1\" parentid=\"0\" minor=\"\" user=\"MediaWiki default\" timestamp=\"2007-12-22T22:59:59Z\" comment=\"\" /></revisions></page></pages></query></api>";
				GetRevision gr = new GetRevision(MW1_12, "Main Page", GetRevision.CONTENT | GetRevision.TIMESTAMP | GetRevision.USER | GetRevision.COMMENT | GetRevision.IDS | GetRevision.FLAGS);
				
				// Act
				gr.processReturningText(xml, null);
				
				// Assert
				assertEquals("", gr.getArticle().getText());
				assertEquals("2007-12-22T22:59:59Z", gr.getArticle().getEditTimestamp());
				assertEquals("MediaWiki default", gr.getArticle().getEditor());
				assertEquals("", gr.getArticle().getEditSummary());
				assertEquals("1", gr.getArticle().getRevisionId());
				assertFalse(gr.getArticle().isMinorEdit());
		}
		
		/**
		* Test case for {@link GetRevision#processReturningText(String, HttpAction)} method.
		* It tests the case when the content, timestamp, user, comment, revision id and flags of the article are retrieved.
		*/
		@Test
		void testProcessReturningText_All_MW1_13() {
				
				// Arrange
				String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\"><revisions><rev revid=\"1\" parentid=\"0\" minor=\"\" user=\"MediaWiki default\" timestamp=\"2007-12-22T22:59:59Z\" comment=\"\" /></revisions></page></pages></query></api>";
				GetRevision gr = new GetRevision(MW1_13, "Main Page", GetRevision.CONTENT | GetRevision.TIMESTAMP | GetRevision.USER | GetRevision.COMMENT | GetRevision.IDS | GetRevision.FLAGS);
				
				// Act
				gr.processReturningText(xml, null);
				
				// Assert
				assertEquals("", gr.getArticle().getText());
				assertEquals("2007-12-22T22:59:59Z", gr.getArticle().getEditTimestamp());
				assertEquals("MediaWiki default", gr.getArticle().getEditor());
				assertEquals("", gr.getArticle().getEditSummary());
				assertEquals("1", gr.getArticle().getRevisionId());
				assertFalse(gr.getArticle().isMinorEdit());
		}
		
		/**
		* Test case for {@link GetRevision#processReturningText(String, HttpAction)} method.
		* It tests the case when the content, timestamp, user, comment, revision id and flags of the article are retrieved.
		*/
		@Test
		void testProcessReturningText_All_MW1_14() {
				
				// Arrange
				String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\"><revisions><rev revid=\"