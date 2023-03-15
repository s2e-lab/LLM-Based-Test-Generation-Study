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
		String testCase1 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected1 = "Test";
		String actual1 = processAllReturningText(testCase1);
		assertEquals(expected1, actual1);
		
		// Test case 2
		String testCase2 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected2 = "Test";
		String actual2 = processAllReturningText(testCase2);
		assertEquals(expected2, actual2);
		
		// Test case 3
		String testCase3 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected3 = "Test";
		String actual3 = processAllReturningText(testCase3);
		assertEquals(expected3, actual3);
		
		// Test case 4
		String testCase4 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected4 = "Test";
		String actual4 = processAllReturningText(testCase4);
		assertEquals(expected4, actual4);
		
		// Test case 5
		String testCase5 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected5 = "Test";
		String actual5 = processAllReturningText(testCase5);
		assertEquals(expected5, actual5);
		
		// Test case 6
		String testCase6 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected6 = "Test";
		String actual6 = processAllReturningText(testCase6);
		assertEquals(expected6, actual6);
		
		// Test case 7
		String testCase7 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected7 = "Test";
		String actual7 = processAllReturningText(testCase7);
		assertEquals(expected7, actual7);
		
		// Test case 8
		String testCase8 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected8 = "Test";
		String actual8 = processAllReturningText(testCase8);
		assertEquals(expected8, actual8);
		
		// Test case 9
		String testCase9 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected9 = "Test";
		String actual9 = processAllReturningText(testCase9);
		assertEquals(expected9, actual9);
		
		// Test case 10
		String testCase10 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected10 = "Test";
		String actual10 = processAllReturningText(testCase10);
		assertEquals(expected10, actual10);
		
	}
	
	/**
	 * Helper method for {@link RandomPageTitle#processAllReturningText(String)}
	 * @param s
	 * @return
	 * @throws ProcessException
	 */
	private String processAllReturningText(String s) throws ProcessException {
		XPath parser = XPathFactory.newInstance().newXPath();
		String title = "";
		try {
			XPathExpression titleParser = parser.compile("/api/query/random/page/@title");
			InputSource contenido = new InputSource(new ByteArrayInputStream(s.getBytes(MediaWiki.getCharset())));
			title = titleParser.evaluate(contenido);
		} catch (Exception e) {
			throw new ProcessException("Error parsing the title of the Random Page" + e.toString());
		}
		log.debug("Title: " + title);
		return title;
	}
	
}

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
		String testCase1 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected1 = "Test";
		String actual1 = processAllReturningText(testCase1);
		assertEquals(expected1, actual1);
		
		// Test case 2
		String testCase2 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected2 = "Test";
		String actual2 = processAllReturningText(testCase2);
		assertEquals(expected2, actual2);
		
		// Test case 3
		String testCase3 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected3 = "Test";
		String actual3 = processAllReturningText(testCase3);
		assertEquals(expected3, actual3);
		
		// Test case 4
		String testCase4 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected4 = "Test";
		String actual4 = processAllReturningText(testCase4);
		assertEquals(expected4, actual4);
		
		// Test case 5
		String testCase5 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected5 = "Test";
		String actual5 = processAllReturningText(testCase5);
		assertEquals(expected5, actual5);
		
		// Test case 6
		String testCase6 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected6 = "Test";
		String actual6 = processAllReturningText(testCase6);
		assertEquals(expected6, actual6);
		
		// Test case 7
		String testCase7 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected7 = "Test";
		String actual7 = processAllReturningText(testCase7);
		assertEquals(expected7, actual7);
		
		// Test case 8
		String testCase8 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected8 = "Test";
		String actual8 = processAllReturningText(testCase8);
		assertEquals(expected8, actual8);
		
		// Test case 9
		String testCase9 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected9 = "Test";
		String actual9 = processAllReturningText(testCase9);
		assertEquals(expected9, actual9);
		
		// Test case 10
		String testCase10 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected10 = "Test";
		String actual10 = processAllReturningText(testCase10);
		assertEquals(expected10, actual10);
		
	}
	
	/**
	 * Helper method for {@link RandomPageTitle#processAllReturningText(String)}
	 * @param s
	 * @return
	 * @throws ProcessException
	 */
	private String processAllReturningText(String s) throws ProcessException {
		XPath parser = XPathFactory.newInstance().newXPath();
		String title = "";
		try {
			XPathExpression titleParser = parser.compile("/api/query/random/page/@title");
			InputSource contenido = new InputSource(new ByteArrayInputStream(s.getBytes(MediaWiki.getCharset())));
			title = titleParser.evaluate(contenido);
		} catch (Exception e) {
			throw new ProcessException("Error parsing the title of the Random Page" + e.toString());
		}
		log.debug("Title: " + title);
		return title;
	}
	
}

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
		String testCase1 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected1 = "Test";
		String actual1 = processAllReturningText(testCase1);
		assertEquals(expected1, actual1);
		
		// Test case 2
		String testCase2 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected2 = "Test";
		String actual2 = processAllReturningText(testCase2);
		assertEquals(expected2, actual2);
		
		// Test case 3
		String testCase3 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected3 = "Test";
		String actual3 = processAllReturningText(testCase3);
		assertEquals(expected3, actual3);
		
		// Test case 4
		String testCase4 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected4 = "Test";
		String actual4 = processAllReturningText(testCase4);
		assertEquals(expected4, actual4);
		
		// Test case 5
		String testCase5 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected5 = "Test";
		String actual5 = processAllReturningText(testCase5);
		assertEquals(expected5, actual5);
		
		// Test case 6
		String testCase6 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected6 = "Test";
		String actual6 = processAllReturningText(testCase6);
		assertEquals(expected6, actual6);
		
		// Test case 7
		String testCase7 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected7 = "Test";
		String actual7 = processAllReturningText(testCase7);
		assertEquals(expected7, actual7);
		
		// Test case 8
		String testCase8 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected8 = "Test";
		String actual8 = processAllReturningText(testCase8);
		assertEquals(expected8, actual8);
		
		// Test case 9
		String testCase9 = "<api><query><random><page title=\"Test\" /></random></query></api>";
		String expected9 = "Test";
		String actual9 = processAllReturningText(testCase9);
		assertEquals(expected9, actual9);
		
		// Test case 10
		String testCase10 = "<