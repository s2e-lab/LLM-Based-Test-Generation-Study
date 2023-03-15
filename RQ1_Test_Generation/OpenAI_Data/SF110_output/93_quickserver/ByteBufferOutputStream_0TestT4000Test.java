// ByteBufferOutputStream_0Test.java
package org.quickserver.util.io;

import java.io.*;
import java.nio.*;
import java.util.*;
import org.apache.commons.pool.ObjectPool;
import org.quickserver.net.server.ClientHandler;
import org.quickserver.net.server.impl.NonBlockingClientHandler;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteBufferOutputStream}.
* It contains ten unit test cases for the {@link ByteBufferOutputStream#isLoggable(Level)} method.
*/
class ByteBufferOutputStream_0Test {

	@Test
	void testIsLoggable_0() {
		ByteBufferOutputStream.setDebug(true);
		assertTrue(ByteBufferOutputStream.isLoggable(Level.FINEST));
	}
	
	@Test
	void testIsLoggable_1() {
		ByteBufferOutputStream.setDebug(false);
		assertTrue(ByteBufferOutputStream.isLoggable(Level.INFO));
	}
	
	@Test
	void testIsLoggable_2() {
		ByteBufferOutputStream.setDebug(true);
		assertTrue(ByteBufferOutputStream.isLoggable(Level.INFO));
	}
	
	@Test
	void testIsLoggable_3() {
		ByteBufferOutputStream.setDebug(false);
		assertFalse(ByteBufferOutputStream.isLoggable(Level.FINEST));
	}
	
	@Test
	void testIsLoggable_4() {
		ByteBufferOutputStream.setDebug(true);
		assertTrue(ByteBufferOutputStream.isLoggable(Level.FINE));
	}
	
	@Test
	void testIsLoggable_5() {
		ByteBufferOutputStream.setDebug(false);
		assertTrue(ByteBufferOutputStream.isLoggable(Level.WARNING));
	}
	
	@Test
	void testIsLoggable_6() {
		ByteBufferOutputStream.setDebug(true);
		assertTrue(ByteBufferOutputStream.isLoggable(Level.WARNING));
	}
	
	@Test
	void testIsLoggable_7() {
		ByteBufferOutputStream.setDebug(false);
		assertFalse(ByteBufferOutputStream.isLoggable(Level.FINE));
	}
	
	@Test
	void testIsLoggable_8() {
		ByteBufferOutputStream.setDebug(true);
		assertTrue(ByteBufferOutputStream.isLoggable(Level.SEVERE));
	}
	
	@Test
	void testIsLoggable_9() {
		ByteBufferOutputStream.setDebug(false);
		assertTrue(ByteBufferOutputStream.isLoggable(Level.SEVERE));
	}
	
}

// ByteBufferOutputStream_1Test.java
package org.quickserver.util.io;

import java.io.*;
import java.nio.*;
import java.util.*;
import org.apache.commons.pool.ObjectPool;
import org.quickserver.net.server.ClientHandler;
import org.quickserver.net.server.impl.NonBlockingClientHandler;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteBufferOutputStream}.
* It contains ten unit test cases for the {@link ByteBufferOutputStream#close()} method.
*/
class ByteBufferOutputStream_1Test {
		
	@Test
	void testClose_0() {
		ByteBufferOutputStream.setDebug(true);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		byteBufferOutputStream.close();
	}
	
	@Test
	void testClose_1() {
		ByteBufferOutputStream.setDebug(false);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		byteBufferOutputStream.close();
	}
	
	@Test
	void testClose_2() {
		ByteBufferOutputStream.setDebug(true);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		byteBufferOutputStream.close();
	}
	
	@Test
	void testClose_3() {
		ByteBufferOutputStream.setDebug(false);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		byteBufferOutputStream.close();
	}
	
	@Test
	void testClose_4() {
		ByteBufferOutputStream.setDebug(true);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		byteBufferOutputStream.close();
	}
	
	@Test
	void testClose_5() {
		ByteBufferOutputStream.setDebug(false);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		byteBufferOutputStream.close();
	}
	
	@Test
	void testClose_6() {
		ByteBufferOutputStream.setDebug(true);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		byteBufferOutputStream.close();
	}
	
	@Test
	void testClose_7() {
		ByteBufferOutputStream.setDebug(false);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		byteBufferOutputStream.close();
	}
	
	@Test
	void testClose_8() {
		ByteBufferOutputStream.setDebug(true);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		byteBufferOutputStream.close();
	}
	
	@Test
	void testClose_9() {
		ByteBufferOutputStream.setDebug(false);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		byteBufferOutputStream.close();
	}
	
}

// ByteBufferOutputStream_2Test.java
package org.quickserver.util.io;

import java.io.*;
import java.nio.*;
import java.util.*;
import org.apache.commons.pool.ObjectPool;
import org.quickserver.net.server.ClientHandler;
import org.quickserver.net.server.impl.NonBlockingClientHandler;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteBufferOutputStream}.
* It contains ten unit test cases for the {@link ByteBufferOutputStream#flush()} method.
*/
class ByteBufferOutputStream_2Test {
		
	@Test
	void testFlush_0() {
		ByteBufferOutputStream.setDebug(true);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		try {
			byteBufferOutputStream.flush();
		} catch (IOException e) {
			fail("Unexpected exception: " + e);
		}
	}
	
	@Test
	void testFlush_1() {
		ByteBufferOutputStream.setDebug(false);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		try {
			byteBufferOutputStream.flush();
		} catch (IOException e) {
			fail("Unexpected exception: " + e);
		}
	}
	
	@Test
	void testFlush_2() {
		ByteBufferOutputStream.setDebug(true);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		try {
			byteBufferOutputStream.flush();
		} catch (IOException e) {
			fail("Unexpected exception: " + e);
		}
	}
	
	@Test
	void testFlush_3() {
		ByteBufferOutputStream.setDebug(false);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		try {
			byteBufferOutputStream.flush();
		} catch (IOException e) {
			fail("Unexpected exception: " + e);
		}
	}
	
	@Test
	void testFlush_4() {
		ByteBufferOutputStream.setDebug(true);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		try {
			byteBufferOutputStream.flush();
		} catch (IOException e) {
			fail("Unexpected exception: " + e);
		}
	}
	
	@Test
	void testFlush_5() {
		ByteBufferOutputStream.setDebug(false);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		try {
			byteBufferOutputStream.flush();
		} catch (IOException e) {
			fail("Unexpected exception: " + e);
		}
	}
	
	@Test
	void testFlush_6() {
		ByteBufferOutputStream.setDebug(true);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		try {
			byteBufferOutputStream.flush();
		} catch (IOException e) {
			fail("Unexpected exception: " + e);
		}
	}
	
	@Test
	void testFlush_7() {
		ByteBufferOutputStream.setDebug(false);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		try {
			byteBufferOutputStream.flush();
		} catch (IOException e) {
			fail("Unexpected exception: " + e);
		}
	}
	
	@Test
	void testFlush_8() {
		ByteBufferOutputStream.setDebug(true);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		try {
			byteBufferOutputStream.flush();
		} catch (IOException e) {
			fail("Unexpected exception: " + e);
		}
	}
	
	@Test
	void testFlush_9() {
		ByteBufferOutputStream.setDebug(false);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		try {
			byteBufferOutputStream.flush();
		} catch (IOException e) {
			fail("Unexpected exception: " + e);
		}
	}
	
}

// ByteBufferOutputStream_3Test.java
package org.quickserver.util.io;

import java.io.*;
import java.nio.*;
import java.util.*;
import org.apache.commons.pool.ObjectPool;
import org.quickserver.net.server.ClientHandler;
import org.quickserver.net.server.impl.NonBlockingClientHandler;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteBufferOutputStream}.
* It contains ten unit test cases for the {@link ByteBufferOutputStream#write(int)} method.
*/
class ByteBufferOutputStream_3Test {
		
	@Test
	void testWrite_0() {
		ByteBufferOutputStream.setDebug(true);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		try {
			byteBufferOutputStream.write(0);
		} catch (IOException e) {
			fail("Unexpected exception: " + e);
		}
	}
	
	@Test
	void testWrite_1() {
		ByteBufferOutputStream.setDebug(false);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		try {
			byteBufferOutputStream.write(0);
		} catch (IOException e) {
			fail("Unexpected exception: " + e);
		}
	}
	
	@Test
	void testWrite_2() {
		ByteBufferOutputStream.setDebug(true);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		try {
			byteBufferOutputStream.write(0);
		} catch (IOException e) {
			fail("Unexpected exception: " + e);
		}
	}
	
	@Test
	void testWrite_3() {
		ByteBufferOutputStream.setDebug(false);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		try {
			byteBufferOutputStream.write(0);
		} catch (IOException e) {
			fail("Unexpected exception: " + e);
		}
	}
	
	@Test
	void testWrite_4() {
		ByteBufferOutputStream.setDebug(true);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		try {
			byteBufferOutputStream.write(0);
		} catch (IOException e) {
			fail("Unexpected exception: " + e);
		}
	}
	
	@Test
	void testWrite_5() {
		ByteBufferOutputStream.setDebug(false);
		ArrayList bufferList = new ArrayList();
		ClientHandler handler = new NonBlockingClientHandler();
		ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream(bufferList, handler);
		