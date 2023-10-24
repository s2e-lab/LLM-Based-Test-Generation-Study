// HTMLOutputStreamTest.java
package bible.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLOutputStream}.
* It contains ten unit test cases for the {@link HTMLOutputStream#reset()} method.
*/
class HTMLOutputStreamTest {

    /**
     * Test case for {@link HTMLOutputStream#reset()}.
     * It tests the reset method for the case when the buffer is empty.
     */
    @Test
    void testResetEmptyBuffer() {
        HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
        String result = htmlOutputStream.reset();
        assertEquals("", result);
    }

    /**
     * Test case for {@link HTMLOutputStream#reset()}.
     * It tests the reset method for the case when the buffer is not empty.
     */
    @Test
    void testResetNotEmptyBuffer() {
        HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
        htmlOutputStream.write("Hello World");
        String result = htmlOutputStream.reset();
        assertEquals("Hello World", result);
    }

    /**
     * Test case for {@link HTMLOutputStream#reset()}.
     * It tests the reset method for the case when the buffer is not empty.
     */
    @Test
    void testResetNotEmptyBufferWithNewLine() {
        HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
        htmlOutputStream.write("Hello World\n");
        String result = htmlOutputStream.reset();
        assertEquals("Hello World", result);
    }

    /**
     * Test case for {@link HTMLOutputStream#reset()}.
     * It tests the reset method for the case when the buffer is not empty.
     */
    @Test
    void testResetNotEmptyBufferWithNewLineAndSpaces() {
        HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
        htmlOutputStream.write("Hello World\n\n\n");
        String result = htmlOutputStream.reset();
        assertEquals("Hello World", result);
    }

    /**
     * Test case for {@link HTMLOutputStream#reset()}.
     * It tests the reset method for the case when the buffer is not empty.
     */
    @Test
    void testResetNotEmptyBufferWithNewLineAndSpacesAndTabs() {
        HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
        htmlOutputStream.write("Hello World\n\n\n\t\t\t");
        String result = htmlOutputStream.reset();
        assertEquals("Hello World", result);
    }

    /**
     * Test case for {@link HTMLOutputStream#reset()}.
     * It tests the reset method for the case when the buffer is not empty.
     */
    @Test
    void testResetNotEmptyBufferWithNewLineAndSpacesAndTabsAndSpaces() {
        HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
        htmlOutputStream.write("Hello World\n\n\n\t\t\t\t\t");
        String result = htmlOutputStream.reset();
        assertEquals("Hello World", result);
    }

    /**
     * Test case for {@link HTMLOutputStream#reset()}.
     * It tests the reset method for the case when the buffer is not empty.
     */
    @Test
    void testResetNotEmptyBufferWithNewLineAndSpacesAndTabsAndSpacesAndNewLine() {
        HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
        htmlOutputStream.write("Hello World\n\n\n\t\t\t\t\t\n");
        String result = htmlOutputStream.reset();
        assertEquals("Hello World", result);
    }

    /**
     * Test case for {@link HTMLOutputStream#reset()}.
     * It tests the reset method for the case when the buffer is not empty.
     */
    @Test
    void testResetNotEmptyBufferWithNewLineAndSpacesAndTabsAndSpacesAndNewLineAndSpaces() {
        HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
        htmlOutputStream.write("Hello World\n\n\n\t\t\t\t\t\n\n\n");
        String result = htmlOutputStream.reset();
        assertEquals("Hello World", result);
    }

    /**
     * Test case for {@link HTMLOutputStream#reset()}.
     * It tests the reset method for the case when the buffer is not empty.
     */
    @Test
    void testResetNotEmptyBufferWithNewLineAndSpacesAndTabsAndSpacesAndNewLineAndSpacesAndTabs() {
        HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
        htmlOutputStream.write("Hello World\n\n\n\t\t\t\t\t\n\n\n\t\t\t");
        String result = htmlOutputStream.reset();
        assertEquals("Hello World", result);
    }

    /**
     * Test case for {@link HTMLOutputStream#reset()}.
     * It tests the reset method for the case when the buffer is not empty.
     */
    @Test
    void testResetNotEmptyBufferWithNewLineAndSpacesAndTabsAndSpacesAndNewLineAndSpacesAndTabsAndSpaces() {
        HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
        htmlOutputStream.write("Hello World\n\n\n\t\t\t\t\t\n\n\n\t\t\t\t\t");
        String result = htmlOutputStream.reset();
        assertEquals("Hello World", result);
    }

    /**
     * Test case for {@link HTMLOutputStream#reset()}.
     * It tests the reset method for the case when the buffer is not empty.
     */
    @Test
    void testResetNotEmptyBufferWithNewLineAndSpacesAndTabsAndSpacesAndNewLineAndSpacesAndTabsAndSpacesAndNewLine() {
        HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
        htmlOutputStream.write("Hello World\n\n\n\t\t\t\t\t\n\n\n\t\t\t\t\t\n");
        String result = htmlOutputStream.reset();
        assertEquals("Hello World", result);
    }

    /**
     * Test case for {@link HTMLOutputStream#reset()}.
     * It tests the reset method for the case when the buffer is not empty.
     */
    @Test
    void testResetNotEmptyBufferWithNewLineAndSpacesAndTabsAndSpacesAndNewLineAndSpacesAndTabsAndSpacesAndNewLineAndSpaces() {
        HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
        htmlOutputStream.write("Hello World\n\n\n\t\t\t\t\t\n\n\n\t\t\t\t\t\n\n\n");
        String result = htmlOutputStream.reset();
        assertEquals("Hello World", result);
    }

    /**
     * Test case for {@link HTMLOutputStream#reset()}.
     * It tests the reset method for the case when the buffer is not empty.
     */
    @Test
    void testResetNotEmptyBufferWithNewLineAndSpacesAndTabsAndSpacesAndNewLineAndSpacesAndTabsAndSpacesAndNewLineAndSpacesAndTabs() {
        HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
        htmlOutputStream.write("Hello World\n\n\n\t\t\t\t\t\n\n\n\t\t\t\t\t\n\n\n\t\t\t");
        String result = htmlOutputStream.reset();
        assertEquals("Hello World", result);
    }

    /**
     * Test case for {@link HTMLOutputStream#reset()}.
     * It tests the reset method for the case when the buffer is not empty.
     */
    @Test
    void testResetNotEmptyBufferWithNewLineAndSpacesAndTabsAndSpacesAndNewLineAndSpacesAndTabsAndSpacesAndNewLineAndSpacesAndTabsAndSpaces() {
        HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
        htmlOutputStream.write("Hello World\n\n\n\t\t\t\t\t\n\n\n\t\t\t\t\t\n\n\n\t\t\t\t\t");
        String result = htmlOutputStream.reset();
        assertEquals("Hello World", result);
    }
}
