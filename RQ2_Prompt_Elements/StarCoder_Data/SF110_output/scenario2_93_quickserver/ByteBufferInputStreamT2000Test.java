// ByteBufferInputStreamTest.java
package org.quickserver.util.io;

import java.io.*;
import java.nio.*;
import java.nio.charset.*;
import java.util.*;
import org.quickserver.net.server.ClientHandler;
import java.util.logging.*;
import org.quickserver.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteBufferInputStream}.
* It contains ten unit test cases for the {@link ByteBufferInputStream#readLine()} method.
*/
class ByteBufferInputStreamTest {

    private static final Logger logger = Logger.getLogger(ByteBufferInputStreamTest.class.getName());

    /**
     * Tests the {@link ByteBufferInputStream#readLine()} method.
     * It reads a line of String if ready. If line is not yet ready this will
     * block. To find out if the line is ready use <code>isLineReady()</code>
     *
     * @see #isLineReady()
     */
    @Test
    void testReadLine() {
        ByteBufferInputStream byteBufferInputStream = new ByteBufferInputStream();
        String line = null;
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertNull(line);

        byteBufferInputStream.add(ByteBuffer.wrap("Hello".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("Hello", line);

        byteBufferInputStream.add(ByteBuffer.wrap("World".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("World", line);

        byteBufferInputStream.add(ByteBuffer.wrap("!".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("!", line);

        byteBufferInputStream.add(ByteBuffer.wrap("".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("", line);

        byteBufferInputStream.add(ByteBuffer.wrap(" ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals(" ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("  ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("  ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("   ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("   ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("    ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("    ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("     ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("     ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("      ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("      ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("       ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("       ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("        ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("        ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("         ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("         ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("          ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("          ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("           ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("           ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("            ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("            ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("             ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("             ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("              ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("              ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("               ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("               ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("                ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("                ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("                 ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("                 ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("                  ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("                  ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("                   ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("                   ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("                    ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("                    ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("                     ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("                     ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("                      ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("                      ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("                       ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("                       ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("                        ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("                        ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("                         ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("                         ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("                          ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("                          ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("                           ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("                           ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("                            ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("                            ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("                             ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning("IOException: " + e);
        }
        assertEquals("                             ", line);

        byteBufferInputStream.add(ByteBuffer.wrap("                              ".getBytes()));
        try {
            line = byteBufferInputStream.readLine();
        } catch (IOException e) {
            logger.warning