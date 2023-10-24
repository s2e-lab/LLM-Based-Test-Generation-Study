// HtmlContentParser_0Test.java
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
class HtmlContentParser_0Test {

    private static Log log = LogFactory.getLog(HtmlContentParser_0Test.class);

    /**
    * Test method for {@link HtmlContentParser#extractPlainText(String)}.
    */
    @Test
    void testExtractPlainText() {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(textContent);
        } catch (ContentParserException e) {
            log.error("when parsing from text", e);
            fail("unexpected exception");
        }
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link HtmlContentParser#extractPlainText(String)}.
    */
    @Test
    void testExtractPlainText_0() {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(textContent);
        } catch (ContentParserException e) {
            log.error("when parsing from text", e);
            fail("unexpected exception");
        }
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link HtmlContentParser#extractPlainText(String)}.
    */
    @Test
    void testExtractPlainText_1() {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(textContent);
        } catch (ContentParserException e) {
            log.error("when parsing from text", e);
            fail("unexpected exception");
        }
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link HtmlContentParser#extractPlainText(String)}.
    */
    @Test
    void testExtractPlainText_2() {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(textContent);
        } catch (ContentParserException e) {
            log.error("when parsing from text", e);
            fail("unexpected exception");
        }
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link HtmlContentParser#extractPlainText(String)}.
    */
    @Test
    void testExtractPlainText_3() {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(textContent);
        } catch (ContentParserException e) {
            log.error("when parsing from text", e);
            fail("unexpected exception");
        }
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link HtmlContentParser#extractPlainText(String)}.
    */
    @Test
    void testExtractPlainText_4() {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(textContent);
        } catch (ContentParserException e) {
            log.error("when parsing from text", e);
            fail("unexpected exception");
        }
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link HtmlContentParser#extractPlainText(String)}.
    */
    @Test
    void testExtractPlainText_5() {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(textContent);
        } catch (ContentParserException e) {
            log.error("when parsing from text", e);
            fail("unexpected exception");
        }
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link HtmlContentParser#extractPlainText(String)}.
    */
    @Test
    void testExtractPlainText_6() {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(textContent);
        } catch (ContentParserException e) {
            log.error("when parsing from text", e);
            fail("unexpected exception");
        }
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link HtmlContentParser#extractPlainText(String)}.
    */
    @Test
    void testExtractPlainText_7() {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(textContent);
        } catch (ContentParserException e) {
            log.error("when parsing from text", e);
            fail("unexpected exception");
        }
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link HtmlContentParser#extractPlainText(String)}.
    */
    @Test
    void testExtractPlainText_8() {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(textContent);
        } catch (ContentParserException e) {
            log.error("when parsing from text", e);
            fail("unexpected exception");
        }
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link HtmlContentParser#extractPlainText(String)}.
    */
    @Test
    void testExtractPlainText_9() {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(textContent);
        } catch (ContentParserException e) {
            log.error("when parsing from text", e);
            fail("unexpected exception");
        }
        assertEquals(expected, actual);
    }
}

// HtmlContentParser_1Test.java
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
class HtmlContentParser_1Test {
		
    private static Log log = LogFactory.getLog(HtmlContentParser_1Test.class);

    /**
    * Test method for {@link HtmlContentParser#extractPlainText(String)}.
    */
    @Test
    void testExtractPlainText() {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(textContent);
        } catch (ContentParserException e) {
            log.error("when parsing from text", e);
            fail("unexpected exception");
        }
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link HtmlContentParser#extractPlainText(String)}.
    */
    @Test
    void testExtractPlainText_0() {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html>";
        String expected = "test";
        String actual = null;
        try {
            actual = new HtmlContentParser().extractPlainText(textContent);
        } catch (ContentParserException e) {
            log.error("when parsing from text", e);
            fail("unexpected exception");
        }
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link HtmlContentParser#extractPlainText(String)}.
    */
    @Test
    void testExtractPlainText_1() {
        String textContent = "<html><head><title>test</title></head><body><p>test</p></body></html