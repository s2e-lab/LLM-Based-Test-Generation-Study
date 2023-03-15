// ByteBufferInputStream_0Test.java
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
* It contains ten unit test cases for the {@link ByteBufferInputStream#isLoggable(Level)} method.
*/
class ByteBufferInputStream_0Test {

	@Test
	void testIsLoggable_0() {
		ByteBufferInputStream.setDebug(true);
		assertTrue(ByteBufferInputStream.isLoggable(Level.FINEST));
	}
	
	@Test
	void testIsLoggable_1() {
		ByteBufferInputStream.setDebug(false);
		assertTrue(ByteBufferInputStream.isLoggable(Level.INFO));
	}
	
	@Test
	void testIsLoggable_2() {
		ByteBufferInputStream.setDebug(true);
		assertTrue(ByteBufferInputStream.isLoggable(Level.INFO));
	}
	
	@Test
	void testIsLoggable_3() {
		ByteBufferInputStream.setDebug(false);
		assertFalse(ByteBufferInputStream.isLoggable(Level.FINEST));
	}
	
	@Test
	void testIsLoggable_4() {
		ByteBufferInputStream.setDebug(true);
		assertTrue(ByteBufferInputStream.isLoggable(Level.WARNING));
	}
	
	@Test
	void testIsLoggable_5() {
		ByteBufferInputStream.setDebug(false);
		assertTrue(ByteBufferInputStream.isLoggable(Level.WARNING));
	}
	
	@Test
	void testIsLoggable_6() {
		ByteBufferInputStream.setDebug(true);
		assertTrue(ByteBufferInputStream.isLoggable(Level.SEVERE));
	}
	
	@Test
	void testIsLoggable_7() {
		ByteBufferInputStream.setDebug(false);
		assertTrue(ByteBufferInputStream.isLoggable(Level.SEVERE));
	}
	
	@Test
	void testIsLoggable_8() {
		ByteBufferInputStream.setDebug(true);
		assertTrue(ByteBufferInputStream.isLoggable(Level.CONFIG));
	}
	
	@Test
	void testIsLoggable_9() {
		ByteBufferInputStream.setDebug(false);
		assertTrue(ByteBufferInputStream.isLoggable(Level.CONFIG));
	}
	
}

// ByteBufferInputStream_1Test.java
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
* It contains ten unit test cases for the {@link ByteBufferInputStream#available()} method.
*/
class ByteBufferInputStream_1Test {
		
	@Test
	void testAvailable_0() throws IOException {
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new ClientHandler();
		ByteBufferInputStream byteBufferInputStream = new ByteBufferInputStream(bufferList, handler, "UTF-8");
		assertEquals(0, byteBufferInputStream.available());
	}
	
	@Test
	void testAvailable_1() throws IOException {
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new ClientHandler();
		ByteBufferInputStream byteBufferInputStream = new ByteBufferInputStream(bufferList, handler, "UTF-8");
		ByteBuffer byteBuffer = ByteBuffer.wrap("Hello".getBytes());
		bufferList.add(byteBuffer);
		assertEquals(5, byteBufferInputStream.available());
	}
	
	@Test
	void testAvailable_2() throws IOException {
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new ClientHandler();
		ByteBufferInputStream byteBufferInputStream = new ByteBufferInputStream(bufferList, handler, "UTF-8");
		ByteBuffer byteBuffer = ByteBuffer.wrap("Hello".getBytes());
		bufferList.add(byteBuffer);
		byteBufferInputStream.read();
		assertEquals(4, byteBufferInputStream.available());
	}
	
	@Test
	void testAvailable_3() throws IOException {
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new ClientHandler();
		ByteBufferInputStream byteBufferInputStream = new ByteBufferInputStream(bufferList, handler, "UTF-8");
		ByteBuffer byteBuffer = ByteBuffer.wrap("Hello".getBytes());
		bufferList.add(byteBuffer);
		byteBufferInputStream.read();
		byteBufferInputStream.read();
		assertEquals(3, byteBufferInputStream.available());
	}
	
	@Test
	void testAvailable_4() throws IOException {
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new ClientHandler();
		ByteBufferInputStream byteBufferInputStream = new ByteBufferInputStream(bufferList, handler, "UTF-8");
		ByteBuffer byteBuffer = ByteBuffer.wrap("Hello".getBytes());
		bufferList.add(byteBuffer);
		byteBufferInputStream.read();
		byteBufferInputStream.read();
		byteBufferInputStream.read();
		assertEquals(2, byteBufferInputStream.available());
	}
	
	@Test
	void testAvailable_5() throws IOException {
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new ClientHandler();
		ByteBufferInputStream byteBufferInputStream = new ByteBufferInputStream(bufferList, handler, "UTF-8");
		ByteBuffer byteBuffer = ByteBuffer.wrap("Hello".getBytes());
		bufferList.add(byteBuffer);
		byteBufferInputStream.read();
		byteBufferInputStream.read();
		byteBufferInputStream.read();
		byteBufferInputStream.read();
		assertEquals(1, byteBufferInputStream.available());
	}
	
	@Test
	void testAvailable_6() throws IOException {
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new ClientHandler();
		ByteBufferInputStream byteBufferInputStream = new ByteBufferInputStream(bufferList, handler, "UTF-8");
		ByteBuffer byteBuffer = ByteBuffer.wrap("Hello".getBytes());
		bufferList.add(byteBuffer);
		byteBufferInputStream.read();
		byteBufferInputStream.read();
		byteBufferInputStream.read();
		byteBufferInputStream.read();
		byteBufferInputStream.read();
		assertEquals(0, byteBufferInputStream.available());
	}
	
	@Test
	void testAvailable_7() throws IOException {
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new ClientHandler();
		ByteBufferInputStream byteBufferInputStream = new ByteBufferInputStream(bufferList, handler, "UTF-8");
		ByteBuffer byteBuffer = ByteBuffer.wrap("Hello".getBytes());
		bufferList.add(byteBuffer);
		byteBufferInputStream.read();
		byteBufferInputStream.read();
		byteBufferInputStream.read();
		byteBufferInputStream.read();
		byteBufferInputStream.read();
		byteBufferInputStream.read();
		assertEquals(0, byteBufferInputStream.available());
	}
	
	@Test
	void testAvailable_8() throws IOException {
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new ClientHandler();
		ByteBufferInputStream byteBufferInputStream = new ByteBufferInputStream(bufferList, handler, "UTF-8");
		ByteBuffer byteBuffer = ByteBuffer.wrap("Hello".getBytes());
		bufferList.add(byteBuffer);
		byteBufferInputStream.read();
		byteBufferInputStream.read();
		byteBufferInputStream.read();
		byteBufferInputStream.read();
		byteBufferInputStream.read();
		byteBufferInputStream.