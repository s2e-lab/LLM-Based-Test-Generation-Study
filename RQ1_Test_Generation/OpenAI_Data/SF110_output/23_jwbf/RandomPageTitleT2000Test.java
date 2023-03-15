// RandomPageTitleTest.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import java.io.ByteArrayInputStream;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RandomPageTitle}.
* It contains ten unit test cases for the {@link RandomPageTitle#processAllReturningText(String)} method.
*/
class RandomPageTitleTest {

	/**
	 * Test case for {@link RandomPageTitle#processAllReturningText(String)}
	 * @throws VersionException if not supported
	 */
	@Test
	void testProcessAllReturningText() throws VersionException {
		
		// Test case 1
		String testCase1 = "<?xml version=\"1.0\"?>\n" + 
				"<api>\n" + 
				"  <query>\n" + 
				"    <random>\n" + 
				"      <page id=\"1\" ns=\"0\" title=\"Main Page\" />\n" + 
				"    </random>\n" + 
				"  </query>\n" + 
				"</api>";
		
		// Test case 2
		String testCase2 = "<?xml version=\"1.0\"?>\n" + 
				"<api>\n" + 
				"  <query>\n" + 
				"    <random>\n" + 
				"      <page id=\"1\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"2\" ns=\"0\" title=\"Main Page\" />\n" + 
				"    </random>\n" + 
				"  </query>\n" + 
				"</api>";
		
		// Test case 3
		String testCase3 = "<?xml version=\"1.0\"?>\n" + 
				"<api>\n" + 
				"  <query>\n" + 
				"    <random>\n" + 
				"      <page id=\"1\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"2\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"3\" ns=\"0\" title=\"Main Page\" />\n" + 
				"    </random>\n" + 
				"  </query>\n" + 
				"</api>";
		
		// Test case 4
		String testCase4 = "<?xml version=\"1.0\"?>\n" + 
				"<api>\n" + 
				"  <query>\n" + 
				"    <random>\n" + 
				"      <page id=\"1\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"2\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"3\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"4\" ns=\"0\" title=\"Main Page\" />\n" + 
				"    </random>\n" + 
				"  </query>\n" + 
				"</api>";
		
		// Test case 5
		String testCase5 = "<?xml version=\"1.0\"?>\n" + 
				"<api>\n" + 
				"  <query>\n" + 
				"    <random>\n" + 
				"      <page id=\"1\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"2\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"3\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"4\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"5\" ns=\"0\" title=\"Main Page\" />\n" + 
				"    </random>\n" + 
				"  </query>\n" + 
				"</api>";
		
		// Test case 6
		String testCase6 = "<?xml version=\"1.0\"?>\n" + 
				"<api>\n" + 
				"  <query>\n" + 
				"    <random>\n" + 
				"      <page id=\"1\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"2\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"3\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"4\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"5\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"6\" ns=\"0\" title=\"Main Page\" />\n" + 
				"    </random>\n" + 
				"  </query>\n" + 
				"</api>";
		
		// Test case 7
		String testCase7 = "<?xml version=\"1.0\"?>\n" + 
				"<api>\n" + 
				"  <query>\n" + 
				"    <random>\n" + 
				"      <page id=\"1\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"2\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"3\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"4\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"5\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"6\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"7\" ns=\"0\" title=\"Main Page\" />\n" + 
				"    </random>\n" + 
				"  </query>\n" + 
				"</api>";
		
		// Test case 8
		String testCase8 = "<?xml version=\"1.0\"?>\n" + 
				"<api>\n" + 
				"  <query>\n" + 
				"    <random>\n" + 
				"      <page id=\"1\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"2\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"3\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"4\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"5\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"6\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"7\" ns=\"0\" title=\"Main Page\" />\n" + 
				"      <page id=\"8\" ns=\"0\" title=\"Main Page\" />\n" + 
				"    </random>\n" + 
				"  </query>\n" + 
	