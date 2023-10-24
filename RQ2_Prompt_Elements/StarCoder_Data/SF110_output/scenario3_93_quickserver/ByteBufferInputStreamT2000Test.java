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

    /**
     * Tests the {@link ByteBufferInputStream#readLine()} method.
     * It reads a line of String if ready. If line is not yet ready this will
     * block. To find out if the line is ready use <code>isLineReady()</code>
     *
     * @see #isLineReady()
     */
    @Test
    void testReadLine() throws IOException {
        ByteBufferInputStream bbis = new ByteBufferInputStream();
        bbis.setByteBufferList(new ArrayList<ByteBuffer>());
        bbis.setCharset(Charset.forName("UTF-8"));
        bbis.setClientHandler(new ClientHandler());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new ClientData());
        bbis.setClientData(new Client