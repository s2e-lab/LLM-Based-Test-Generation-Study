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
    void testExtractPlainText() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithEmptyContent() throws ContentParserException {
        String textContent = "";
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithNullContent() throws ContentParserException {
        String textContent = null;
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithNullContent2() throws ContentParserException {
        String textContent = null;
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithNullContent3() throws ContentParserException {
        String textContent = null;
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithNullContent4() throws ContentParserException {
        String textContent = null;
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithNullContent5() throws ContentParserException {
        String textContent = null;
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithNullContent6() throws ContentParserException {
        String textContent = null;
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithNullContent7() throws ContentParserException {
        String textContent = null;
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithNullContent8() throws ContentParserException {
        String textContent = null;
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithNullContent9() throws ContentParserException {
        String textContent = null;
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithNullContent10() throws ContentParserException {
        String textContent = null;
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }
}

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
    void testExtractPlainText() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithEmptyContent() throws ContentParserException {
        String textContent = "";
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithNullContent() throws ContentParserException {
        String textContent = null;
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithNullContent2() throws ContentParserException {
        String textContent = null;
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithNullContent3() throws ContentParserException {
        String textContent = null;
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithNullContent4() throws ContentParserException {
        String textContent = null;
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithNullContent5() throws ContentParserException {
        String textContent = null;
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithNullContent6() throws ContentParserException {
        String textContent = null;
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithNullContent7() throws ContentParserException {
        String textContent = null;
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithNullContent8() throws ContentParserException {
        String textContent = null;
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithNullContent9() throws ContentParserException {
        String textContent = null;
        String expected = "";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link