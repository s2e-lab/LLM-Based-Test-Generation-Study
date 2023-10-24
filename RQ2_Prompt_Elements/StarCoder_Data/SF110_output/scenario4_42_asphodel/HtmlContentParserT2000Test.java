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

    private static Log log = LogFactory.getLog(HtmlContentParserTest.class);

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
    void testExtractPlainText2() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainText3() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainText4() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainText5() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainText6() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainText7() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainText8() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainText9() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainText10() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
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
		
    private static Log log = LogFactory.getLog(HtmlContentParserTest.class);

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
    void testExtractPlainText2() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainText3() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainText4() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainText5() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainText6() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainText7() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainText8() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainText9() throws