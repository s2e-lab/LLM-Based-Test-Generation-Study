// GetVersionTest.java
package net.sourceforge.jwbf.mediawiki.actions.meta;

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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.JWBF;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version;
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
* Test class of {@link GetVersion}.
* It contains ten unit test cases for the {@link GetVersion#processAllReturningText(String)} method.
*/
class GetVersionTest {

		/**
		* Test case for {@link GetVersion#processAllReturningText(String)} method.
		* It tests the case when the MediaWiki version is 1.9.
		*/
		@Test
		void testProcessAllReturningText_1_9() {
				String xml = "<?xml version=\"1.0\"?>\n" +
						"<api>\n" +
						"  <query>\n" +
						"    <general generator=\"MediaWiki 1.9\" sitename=\"Wikipedia\" case=\"first-letter\" mainpage=\"Main Page\" base=\"http://en.wikipedia.org/wiki/Main_Page\" />\n" +
						"  </query>\n" +
						"</api>";
				GetVersion getVersion = new GetVersion();
				try {
						getVersion.processAllReturningText(xml);
				} catch (ProcessException e) {
						fail("Exception thrown");
				}
				assertEquals(MW1_09, getVersion.getVersion());
		}
		
		/**
		* Test case for {@link GetVersion#processAllReturningText(String)} method.
		* It tests the case when the MediaWiki version is 1.10.
		*/
		@Test
		void testProcessAllReturningText_1_10() {
				String xml = "<?xml version=\"1.0\"?>\n" +
						"<api>\n" +
						"  <query>\n" +
						"    <general generator=\"MediaWiki 1.10\" sitename=\"Wikipedia\" case=\"first-letter\" mainpage=\"Main Page\" base=\"http://en.wikipedia.org/wiki/Main_Page\" />\n" +
						"  </query>\n" +
						"</api>";
				GetVersion getVersion = new GetVersion();
				try {
						getVersion.processAllReturningText(xml);
				} catch (ProcessException e) {
						fail("Exception thrown");
				}
				assertEquals(MW1_10, getVersion.getVersion());
		}
		
		/**
		* Test case for {@link GetVersion#processAllReturningText(String)} method.
		* It tests the case when the MediaWiki version is 1.11.
		*/
		@Test
		void testProcessAllReturningText_1_11() {
				String xml = "<?xml version=\"1.0\"?>\n" +
						"<api>\n" +
						"  <query>\n" +
						"    <general generator=\"MediaWiki 1.11\" sitename=\"Wikipedia\" case=\"first-letter\" mainpage=\"Main Page\" base=\"http://en.wikipedia.org/wiki/Main_Page\" />\n" +
						"  </query>\n" +
						"</api>";
				GetVersion getVersion = new GetVersion();
				try {
						getVersion.processAllReturningText(xml);
				} catch (ProcessException e) {
						fail("Exception thrown");
				}
				assertEquals(MW1_11, getVersion.getVersion());
		}
		
		/**
		* Test case for {@link GetVersion#processAllReturningText(String)} method.
		* It tests the case when the MediaWiki version is 1.12.
		*/
		@Test
		void testProcessAllReturningText_1_12() {
				String xml = "<?xml version=\"1.0\"?>\n" +
						"<api>\n" +
						"  <query>\n" +
						"    <general generator=\"MediaWiki 1.12\" sitename=\"Wikipedia\" case=\"first-letter\" mainpage=\"Main Page\" base=\"http://en.wikipedia.org/wiki/Main_Page\" />\n" +
						"  </query>\n" +
						"</api>";
				GetVersion getVersion = new GetVersion();
				try {
						getVersion.processAllReturningText(xml);
				} catch (ProcessException e) {
						fail("Exception thrown");
				}
				assertEquals(MW1_12, getVersion.getVersion());
		}
		
		/**
		* Test case for {@link GetVersion#processAllReturningText(String)} method.
		* It tests the case when the MediaWiki version is 1.13.
		*/
		@Test
		void testProcessAllReturningText_1_13() {
				String xml = "<?xml version=\"1.0\"?>\n" +
						"<api>\n" +
						"  <query>\n" +
						"    <general generator=\"MediaWiki 1.13\" sitename=\"Wikipedia\" case=\"first-letter\" mainpage=\"Main Page\" base=\"http://en.wikipedia.org/wiki/Main_Page\" />\n" +
						"  </query>\n" +
						"</api>";
				GetVersion getVersion = new GetVersion();
				try {
						getVersion.processAllReturningText(xml);
				} catch (ProcessException e) {
						fail("Exception thrown");
				}
				assertEquals(MW1_13, getVersion.getVersion());
		}
		
		/**
		* Test case for {@link GetVersion#processAllReturningText(String)} method.
		* It tests the case when the MediaWiki version is 1.14.
		*/
		@Test
		void testProcessAllReturningText_1_14() {
				String xml = "<?xml version=\"1.0\"?>\n" +
						"<api>\n" +
						"  <query>\n" +
						"    <general generator=\"MediaWiki 1.14\" sitename=\"Wikipedia\" case=\"first-letter\" mainpage=\"Main Page\" base=\"http://en.wikipedia.org/wiki/Main_Page\" />\n" +
						"  </query>\n" +
						"</api>";
				GetVersion getVersion = new GetVersion();
				try {
						getVersion.processAllReturningText(xml);
				} catch (ProcessException e) {
						fail("Exception thrown");
				}
				assertEquals(MW1_14, getVersion.getVersion());
		}
		
		/**
		* Test case for {@link GetVersion#processAllReturningText(String)} method.
		* It tests the case when the MediaWiki version is 1.15.
		*/
		@Test
		void testProcessAllReturningText_1_15() {
				String xml = "<?xml version=\"1.0\"?>\n" +
						"<api>\n" +
						"  <query>\n" +
						"    <general generator=\"MediaWiki 1.15\" sitename=\"Wikipedia\" case=\"first-letter\" mainpage=\"Main Page\" base=\"http://