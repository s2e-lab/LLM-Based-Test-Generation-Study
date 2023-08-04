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
    void testExtractPlainTextWithExtraTags() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithExtraElements() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithExtraAttributes() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithExtraComments() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithExtraText() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithExtraTextAndExtraTags() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithExtraTextAndExtraElements() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithExtraTextAndExtraAttributes() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithExtraTextAndExtraComments() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link HtmlContentParser#extractPlainText(String)}.
     */
    @Test
    void testExtractPlainTextWithExtraTextAndExtraText() throws ContentParserException {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = new HtmlContentParser().extractPlainText(textContent);
        assertEquals(expected, actual);
    }
}

// StreamContentParser.java
package org.asphodel.parser;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;

/**
 * @author : sunwj
 * @since 0.1
 *        Date: Mar 31, 2007
 *        Time: 10:03:07 PM
 *        <p/>
 *        content parser interface
 */
public interface StreamContentParser {

    /**
     * @param inputStream input stream of the content
     * @return plain text without extra tags or elements
     */
    public String extractPlainText(InputStream inputStream) throws ContentParserException;

    /**
     * @param reader reader of the content
     * @return plain text without extra tags or elements
     */
    public String extractPlainText(Reader reader) throws ContentParserException;

    /**
     * @param url url of the content
     * @return plain text without extra tags or elements
     */
    public String extractPlainText(URL url) throws ContentParserException;
}

// StreamContentParserTest.java
package org.asphodel.parser;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StreamContentParser}.
* It contains ten unit test cases for the {@link StreamContentParser#extractPlainText(InputStream)} method.
*/
class StreamContentParserTest {
		
    private static final Log log = LogFactory.getLog(StreamContentParserTest.class);

    /**
     * Test method for {@link StreamContentParser#extractPlainText(InputStream)}.
     */
    @Test
    void testExtractPlainText() throws ContentParserException {
        InputStream inputStream = null;
        String expected = "test";
        String actual = new StreamContentParser() {
            public String extractPlainText(InputStream inputStream) throws ContentParserException {
                return "test";
            }

            public String extractPlainText(Reader reader) throws ContentParserException {
                return null;
            }

            public String extractPlainText(URL url) throws ContentParserException {
                return null;
            }
        }.extractPlainText(inputStream);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link StreamContentParser#extractPlainText(InputStream)}.
     */
    @Test
    void testExtractPlainTextWithExtraTags() throws ContentParserException {
        InputStream inputStream = null;
        String expected = "test";
        String actual = new StreamContentParser() {
            public String extractPlainText(InputStream inputStream) throws ContentParserException {
                return "test";
            }

            public String extractPlainText(Reader reader) throws ContentParserException {
                return null;
            }

            public String extractPlainText(URL url) throws ContentParserException {
                return null;
            }
        }.extractPlainText(inputStream);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link StreamContentParser#extractPlainText(InputStream)}.
     */
    @Test
    void testExtractPlainTextWithExtraElements() throws ContentParserException {
        InputStream inputStream = null;
        String expected = "test";
        String actual = new StreamContentParser() {
            public String extractPlainText(InputStream inputStream) throws ContentParserException {
                return "test";
            }

            public String extractPlainText(Reader reader) throws ContentParserException {
                return null;
            }

            public String extractPlainText(URL url) throws ContentParserException {
                return null;
            }
        }.extractPlainText(inputStream);
        assertEquals(expected, actual);
    }

    /**
     * Test method for