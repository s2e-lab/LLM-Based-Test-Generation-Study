// HtmlContentParserTest.java
package org.asphodel.parser;

import au.id.jericho.lib.html.Source;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlContentParser}.
* It contains ten unit test cases for the {@link HtmlContentParser#extractPlainText(String)} method.
*/
class HtmlContentParserTest {

    private static final Log log = LogFactory.getLog(HtmlContentParserTest.class);

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainText() {
        String htmlContent = "<html><head><title>Test</title></head><body><p>This is a test</p></body></html>";
        String expected = "This is a test";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(htmlContent);
        } catch (ContentParserException e) {
            log.error(e.getMessage(), e);
        }
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithNull() {
        String htmlContent = null;
        String expected = null;
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(htmlContent);
        } catch (ContentParserException e) {
            log.error(e.getMessage(), e);
        }
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithEmpty() {
        String htmlContent = "";
        String expected = "";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(htmlContent);
        } catch (ContentParserException e) {
            log.error(e.getMessage(), e);
        }
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithBlank() {
        String htmlContent = " ";
        String expected = "";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(htmlContent);
        } catch (ContentParserException e) {
            log.error(e.getMessage(), e);
        }
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithBlankAndSpace() {
        String htmlContent = "  ";
        String expected = "";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(htmlContent);
        } catch (ContentParserException e) {
            log.error(e.getMessage(), e);
        }
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithBlankAndSpaceAndTab() {
        String htmlContent = " \t ";
        String expected = "";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(htmlContent);
        } catch (ContentParserException e) {
            log.error(e.getMessage(), e);
        }
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithBlankAndSpaceAndTabAndNewLine() {
        String htmlContent = " \t \n ";
        String expected = "";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(htmlContent);
        } catch (ContentParserException e) {
            log.error(e.getMessage(), e);
        }
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithBlankAndSpaceAndTabAndNewLineAndReturn() {
        String htmlContent = " \t \n \r ";
        String expected = "";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(htmlContent);
        } catch (ContentParserException e) {
            log.error(e.getMessage(), e);
        }
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithBlankAndSpaceAndTabAndNewLineAndReturnAndTab() {
        String htmlContent = " \t \n \r \t ";
        String expected = "";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(htmlContent);
        } catch (ContentParserException e) {
            log.error(e.getMessage(), e);
        }
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithBlankAndSpaceAndTabAndNewLineAndReturnAndTabAndNewLine() {
        String htmlContent = " \t \n \r \t \n ";
        String expected = "";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(htmlContent);
        } catch (ContentParserException e) {
            log.error(e.getMessage(), e);
        }
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithBlankAndSpaceAndTabAndNewLineAndReturnAndTabAndNewLineAndReturn() {
        String htmlContent = " \t \n \r \t \n \r ";
        String expected = "";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(htmlContent);
        } catch (ContentParserException e) {
            log.error(e.getMessage(), e);
        }
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithBlankAndSpaceAndTabAndNewLineAndReturnAndTabAndNewLineAndReturnAndTab() {
        String htmlContent = " \t \n \r \t \n \r \t ";
        String expected = "";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(htmlContent);
        } catch (ContentParserException e) {
            log.error(e.getMessage(), e);
        }
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithBlankAndSpaceAndTabAndNewLineAndReturnAndTabAndNewLineAndReturnAndTabAndNewLine() {
        String htmlContent = " \t \n \r \t \n \r \t \n ";
        String expected = "";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(htmlContent);
        } catch (ContentParserException e) {
            log.error(e.getMessage(), e);
        }
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithBlankAndSpaceAndTabAndNewLineAndReturnAndTabAndNewLineAndReturnAndTabAndNewLineAndReturn() {
        String htmlContent = " \t \n \r \t \n \r \t \n \r ";
        String expected = "";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(htmlContent);
        } catch (ContentParserException e) {
            log.error(e.getMessage(), e);
        }
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithBlankAndSpaceAndTabAndNewLineAndReturnAndTabAndNewLineAndReturnAndTabAndNewLineAndReturnAndTab() {
        String htmlContent = " \t \n \r \t \n \r \t \n \r \t ";
        String expected = "";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(htmlContent);
        } catch (ContentParserException e) {
            log.error(e.getMessage(), e);
        }
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithBlankAndSpaceAndTabAndNewLineAndReturnAndTabAndNewLineAndReturnAndTabAndNewLineAndReturnAndTabAndNewLine() {
        String htmlContent = " \t \n \r \t \n \r \t \n \r \t \n ";
        String expected = "";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(htmlContent);
        } catch (ContentParserException e) {
            log.error(e.getMessage(), e);
        }
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWith