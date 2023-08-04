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

    @Test
    void testReadLine() throws IOException {
        ByteBufferInputStream bbis = new ByteBufferInputStream();
        bbis.setClientHandler(new ClientHandler());
        bbis.setByteBufferList(new ArrayList<ByteBuffer>());
        bbis.setCharset(Charset.forName("UTF-8"));
        bbis.setStrings(new StringBuilder());
        bbis.setStart(0);
        bbis.setPos(0);
        bbis.setIndex(-1);
        bbis.setLineDelimiter(System.getProperty("line.separator"));
        bbis.setLineDelimiterBytes(System.getProperty("line.separator").getBytes());
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);
        bbis.setLineDelimiterBytesLength(System.getProperty("line.separator").getBytes().length);