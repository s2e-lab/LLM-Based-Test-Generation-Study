// ByteBufferInputStream_8Test.java
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
class ByteBufferInputStream_8Test {
	private static final Logger logger = Logger.getLogger(ByteBufferInputStream_8Test.class.getName());

			static {
				logger.setLevel(Level.INFO);
			}

			/**
			 * Sets the debug flag.
			 */
			public static void setDebug(boolean flag) {
				if (flag)
					logger.setLevel(Level.FINEST);
				else
					logger.setLevel(Level.INFO);
			}

			/**
			 * @since 1.4.7
			 */
			public static boolean isLoggable(Level level) {
				return logger.isLoggable(level);
			}

			@Test
			void testReadLine1() throws Exception {
				ArrayList bufferList = new ArrayList();
				ClientHandler handler = new ClientHandler();
				String charset = "UTF-8";
				ByteBufferInputStream inputStream = new ByteBufferInputStream(bufferList, handler, charset);
				String line = inputStream.readLine();
				assertNull(line);
			}

			@Test
			void testReadLine2() throws Exception {
				ArrayList bufferList = new ArrayList();
				ClientHandler handler = new ClientHandler();
				String charset = "UTF-8";
				ByteBufferInputStream inputStream = new ByteBufferInputStream(bufferList, handler, charset);
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				String line = inputStream.readLine();
				assertEquals("1234567890", line);
			}

			@Test
			void testReadLine3() throws Exception {
				ArrayList bufferList = new ArrayList();
				ClientHandler handler = new ClientHandler();
				String charset = "UTF-8";
				ByteBufferInputStream inputStream = new ByteBufferInputStream(bufferList, handler, charset);
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				String line = inputStream.readLine();
				assertEquals("1234567890", line);
			}

			@Test
			void testReadLine4() throws Exception {
				ArrayList bufferList = new ArrayList();
				ClientHandler handler = new ClientHandler();
				String charset = "UTF-8";
				ByteBufferInputStream inputStream = new ByteBufferInputStream(bufferList, handler, charset);
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				String line = inputStream.readLine();
				assertEquals("1234567890", line);
			}

			@Test
			void testReadLine5() throws Exception {
				ArrayList bufferList = new ArrayList();
				ClientHandler handler = new ClientHandler();
				String charset = "UTF-8";
				ByteBufferInputStream inputStream = new ByteBufferInputStream(bufferList, handler, charset);
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				String line = inputStream.readLine();
				assertEquals("1234567890", line);
			}

			@Test
			void testReadLine6() throws Exception {
				ArrayList bufferList = new ArrayList();
				ClientHandler handler = new ClientHandler();
				String charset = "UTF-8";
				ByteBufferInputStream inputStream = new ByteBufferInputStream(bufferList, handler, charset);
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				String line = inputStream.readLine();
				assertEquals("1234567890", line);
			}

			@Test
			void testReadLine7() throws Exception {
				ArrayList bufferList = new ArrayList();
				ClientHandler handler = new ClientHandler();
				String charset = "UTF-8";
				ByteBufferInputStream inputStream = new ByteBufferInputStream(bufferList, handler, charset);
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				String line = inputStream.readLine();
				assertEquals("1234567890", line);
			}

			@Test
			void testReadLine8() throws Exception {
				ArrayList bufferList = new ArrayList();
				ClientHandler handler = new ClientHandler();
				String charset = "UTF-8";
				ByteBufferInputStream inputStream = new ByteBufferInputStream(bufferList, handler, charset);
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				String line = inputStream.readLine();
				assertEquals("1234567890", line);
			}

			@Test
			void testReadLine9() throws Exception {
				ArrayList bufferList = new ArrayList();
				ClientHandler handler = new ClientHandler();
				String charset = "UTF-8";
				ByteBufferInputStream inputStream = new ByteBufferInputStream(bufferList, handler, charset);
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				String line = inputStream.readLine();
				assertEquals("1234567890", line);
			}

			@Test
			void testReadLine10() throws Exception {
				ArrayList bufferList = new ArrayList();
				ClientHandler handler = new ClientHandler();
				String charset = "UTF-8";
				ByteBufferInputStream inputStream = new ByteBufferInputStream(bufferList, handler, charset);
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				bufferList.add(ByteBuffer.wrap("1234567890".getBytes()));
				buffer