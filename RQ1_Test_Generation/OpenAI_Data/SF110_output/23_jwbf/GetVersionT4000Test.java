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
		 * Test method for {@link GetVersion#processAllReturningText(String)}.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessAllReturningText() throws ActionException, ProcessException {
				GetVersion gv = new GetVersion();
				String xml = "<?xml version=\"1.0\"?>\n" + 
						"<api>\n" + 
						"  <query>\n" + 
						"    <general generator=\"MediaWiki 1.16alpha\" sitename=\"Wikipedia\" case=\"first-letter\" mainpage=\"Main Page\" base=\"http://de.wikipedia.org/wiki/Wikipedia:Hauptseite\" />\n" + 
						"  </query>\n" + 
						"</api>";
				gv.processAllReturningText(xml);
				assertEquals("Wikipedia", gv.getSitename());
				assertEquals("http://de.wikipedia.org/wiki/Wikipedia:Hauptseite", gv.getBase());
				assertEquals("first-letter", gv.getCase());
				assertEquals("Main Page", gv.getMainpage());
				assertEquals("MediaWiki 1.16alpha", gv.getGenerator());
				assertEquals(Version.DEVELOPMENT, gv.getVersion());
		}
		
		/**
		 * Test method for {@link GetVersion#processAllReturningText(String)}.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessAllReturningText2() throws ActionException, ProcessException {
				GetVersion gv = new GetVersion();
				String xml = "<?xml version=\"1.0\"?>\n" + 
						"<api>\n" + 
						"  <query>\n" + 
						"    <general generator=\"MediaWiki 1.16wmf\" sitename=\"Wikipedia\" case=\"first-letter\" mainpage=\"Main Page\" base=\"http://de.wikipedia.org/wiki/Wikipedia:Hauptseite\" />\n" + 
						"  </query>\n" + 
						"</api>";
				gv.processAllReturningText(xml);
				assertEquals("Wikipedia", gv.getSitename());
				assertEquals("http://de.wikipedia.org/wiki/Wikipedia:Hauptseite", gv.getBase());
				assertEquals("first-letter", gv.getCase());
				assertEquals("Main Page", gv.getMainpage());
				assertEquals("MediaWiki 1.16wmf", gv.getGenerator());
				assertEquals(Version.DEVELOPMENT, gv.getVersion());
		}
		
		/**
		 * Test method for {@link GetVersion#processAllReturningText(String)}.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessAllReturningText3() throws ActionException, ProcessException {
				GetVersion gv = new GetVersion();
				String xml = "<?xml version=\"1.0\"?>\n" + 
						"<api>\n" + 
						"  <query>\n" + 
						"    <general generator=\"MediaWiki 1.16\" sitename=\"Wikipedia\" case=\"first-letter\" mainpage=\"Main Page\" base=\"http://de.wikipedia.org/wiki/Wikipedia:Hauptseite\" />\n" + 
						"  </query>\n" + 
						"</api>";
				gv.processAllReturningText(xml);
				assertEquals("Wikipedia", gv.getSitename());
				assertEquals("http://de.wikipedia.org/wiki/Wikipedia:Hauptseite", gv.getBase());
				assertEquals("first-letter", gv.getCase());
				assertEquals("Main Page", gv.getMainpage());
				assertEquals("MediaWiki 1.16", gv.getGenerator());
				assertEquals(Version.MW1_16, gv.getVersion());
		}
		
		/**
		 * Test method for {@link GetVersion#processAllReturningText(String)}.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessAllReturningText4() throws ActionException, ProcessException {
				GetVersion gv = new GetVersion();
				String xml = "<?xml version=\"1.0\"?>\n" + 
						"<api>\n" + 
						"  <query>\n" + 
						"    <general generator=\"MediaWiki 1.15\" sitename=\"Wikipedia\" case=\"first-letter\" mainpage=\"Main Page\" base=\"http://de.wikipedia.org/wiki/Wikipedia:Hauptseite\" />\n" + 
						"  </query>\n" + 
						"</api>";
				gv.processAllReturningText(xml);
				assertEquals("Wikipedia", gv.getSitename());
				assertEquals("http://de.wikipedia.org/wiki/Wikipedia:Hauptseite", gv.getBase());
				assertEquals("first-letter", gv.getCase());
				assertEquals("Main Page", gv.getMainpage());
				assertEquals("MediaWiki 1.15", gv.getGenerator());
				assertEquals(Version.MW1_15, gv.getVersion());
		}
		
		/**
		 * Test method for {@link GetVersion#processAllReturningText(String)}.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessAllReturningText5() throws ActionException, ProcessException {
				GetVersion gv = new GetVersion();
				String xml = "<?xml version=\"1.0\"?>\n" + 
						"<api>\n" + 
						"  <query>\n" + 
						"    <general generator=\"MediaWiki 1.14\" sitename=\"Wikipedia\" case=\"first-letter\" mainpage=\"Main Page\" base=\"http://de.wikipedia.org/wiki/Wikipedia:Hauptseite\" />\n" + 
						"  </query>\n" + 
						"</api>";
				gv.processAllReturningText(xml);
				assertEquals("Wikipedia", gv.getSitename());
				assertEquals("http://de.wikipedia.org/wiki/Wikipedia:Hauptseite", gv.getBase());
				assertEquals("first-letter", gv.getCase());
				assertEquals("Main Page", gv.getMainpage());
				assertEquals("MediaWiki 1.14", gv.getGenerator());
				assertEquals(Version.MW1_14, gv.getVersion());
		}
		
		/**
		 * Test method for {@link GetVersion#processAllReturningText(String)}.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessAllReturningText6() throws ActionException, ProcessException {
				GetVersion gv = new GetVersion();
				String xml = "<?xml version=\"1.0\"?>\n" + 
						"<api>\n" + 
						"  <query>\n" + 
						"    <general generator=\"MediaWiki 1.13\" sitename=\"Wikipedia\" case=\"first-letter\" mainpage=\"Main Page\" base=\"http://de.wikipedia.org/wiki/Wikipedia:Hauptseite\" />\n" + 
						"  </query>\n" + 
						"</api>";
				gv.processAllReturningText(xml);
				assertEquals("Wikipedia", gv.getSitename());
				assertEquals("http://de.wikipedia.org/wiki/Wikipedia:Hauptseite", gv.getBase());
				assertEquals("first-letter", gv.getCase());
				assertEquals("Main Page", gv.getMainpage());
				assertEquals("MediaWiki 1.13", gv.getGenerator());
				assertEquals(Version.MW1_13, gv.getVersion());
		}
		
		/**
		 * Test method for {@link GetVersion#processAllReturningText(String)}.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessAllReturningText7() throws ActionException, ProcessException {
				GetVersion gv = new GetVersion();
				String xml = "<?xml version=\"1.0\"?>\n" + 
						"<api>\n" + 
						"  <query>\n" + 
						"    <general generator=\"MediaWiki 1.12\" sitename=\"Wikipedia\" case=\"first-letter\" mainpage=\"Main Page\" base=\"http://de.wikipedia.org/wiki/Wikipedia:Hauptseite\" />\n" + 
						"  </query>\n" + 
						"</api>";
				gv.processAllReturningText(xml);
				assertEquals("Wikipedia", gv.getSitename());
				assertEquals("http://de.wikipedia.org/wiki/Wikipedia:Hauptseite", gv.getBase());
				assertEquals("first-letter", gv.getCase());
				assertEquals("Main Page", gv.getMainpage());
				assertEquals("MediaWiki 1.12", gv.getGenerator());
				assertEquals(Version.MW1_12, gv.getVersion());
		}
		
		/**
		 * Test method for {@link GetVersion#processAllReturningText(String)}.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessAllReturningText8() throws ActionException, ProcessException {
				GetVersion gv = new GetVersion();
				String xml = "<?xml version=\"1.0\"?>\n" + 
						"<api>\n" + 
						"  <query>\n" + 
						"    <general generator=\"MediaWiki 1.11\" sitename=\"Wikipedia\" case=\"first-letter\" mainpage=\"Main Page\" base=\"http://de.wikipedia.org/wiki/Wikipedia:Hauptseite\" />\n" + 
						"  </query>\n" + 
						"</api>";
				gv.processAllReturningText(xml);
				assertEquals("Wikipedia", gv.getSitename());
				assertEquals("http://de.wikipedia.org/wiki/Wikipedia:Hauptseite", gv.getBase());
				assertEquals("first-letter", gv.getCase());
				assertEquals("Main Page", gv.getMainpage());
				assertEquals("MediaWiki 1.11", gv.getGenerator());
				assertEquals(Version.MW1_11, gv.getVersion());
		}
		
		/**
		 * Test method for {@link GetVersion#processAllReturningText(String)}.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessAllReturningText9() throws ActionException, ProcessException {
				GetVersion gv = new GetVersion();
				String xml = "<?xml version=\"1.0\"?>\n" + 
						"<api>\n" + 
						"  <query>\n" + 
						"    <general generator=\"MediaWiki 1.10\" sitename=\"Wikipedia\" case=\"first-letter\" mainpage=\"Main Page\" base=\"http://de.wikipedia.org/wiki/Wikipedia:Hauptseite\" />\n" + 
						"  </query>\n" + 
						"</api>";
				gv.processAllReturningText(xml);
				assertEquals("Wikipedia", gv.getSitename());
				assertEquals("http://de.wikipedia.org/wiki/Wikipedia:Hauptseite", gv.getBase());
				assertEquals("first-letter", gv.getCase());
				assertEquals("Main Page", gv.getMainpage());
				assertEquals("MediaWiki 1.10", gv.getGenerator());
				assertEquals(Version.MW1_10, gv.getVersion());
		}
		
		/**
		 * Test method for {@link GetVersion#processAllReturningText(String)}.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessAllReturningText10() throws ActionException, ProcessException {
				GetVersion gv = new GetVersion();
				String xml = "<?xml version=\"1.0\"?>\n" + 
						"<api>\n" + 
						"  <query>\n" + 
						"    <general generator=\"MediaWiki 1.09\" sitename=\"Wikipedia\" case=\"first-letter\" mainpage=\"Main Page\" base=\"http://de.wikipedia.org/wiki/Wikipedia:Hauptseite\" />\n" + 
						"  </query>\n" + 
						"</api>";
				gv.processAllReturningText(xml);
				assertEquals("Wikipedia", gv.getSitename());
				assertEquals("http://de.wikipedia.org/wiki/Wikipedia:Hauptseite", gv.getBase());
				assertEquals("first-letter", gv.getCase());
				assertEquals("Main Page", gv.getMainpage());
				assertEquals("MediaWiki 1.09", gv.getGenerator());
				assertEquals(Version.MW1_09, gv.getVersion());
		}
}

// GetVersionTest.java
package net.sourceforge.jwbf.mediawiki.actions.meta;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.