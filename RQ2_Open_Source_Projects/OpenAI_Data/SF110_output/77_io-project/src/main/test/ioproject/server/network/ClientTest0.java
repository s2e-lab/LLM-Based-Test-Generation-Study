// ClientTest0.java
package ioproject.server.network;

import ioproject.common.network.Node;
import org.apache.mina.common.IoSession;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Client}.
* It contains ten unit test cases for the {@link Client#attribute(String, Object)} method.
*/
class ClientTest0 {

	/**
	 * Test case for {@link Client#attribute(String, Object)}.
	 * Tests if the attribute is stored correctly.
	 */
	@Test
	void testAttribute0() {
		IoSession session = new IoSession() {
			public Object setAttribute(String key, Object attribute) {
				return attribute;
			}
			public Object getAttribute(String key) {
				return null;
			}
			public void write(Object message) {
			}
			public void close() {
			}
		};
		Node client = new Client(session);
		Object attribute = new Object();
		assertEquals(attribute, client.attribute("key", attribute));
	}
	
	/**
	 * Test case for {@link Client#attribute(String, Object)}.
	 * Tests if the attribute is stored correctly.
	 */
	@Test
	void testAttribute1() {
		IoSession session = new IoSession() {
			public Object setAttribute(String key, Object attribute) {
				return attribute;
			}
			public Object getAttribute(String key) {
				return null;
			}
			public void write(Object message) {
			}
			public void close() {
			}
		};
		Node client = new Client(session);
		Object attribute = new Object();
		assertEquals(attribute, client.attribute("key", attribute));
	}
	
	/**
	 * Test case for {@link Client#attribute(String, Object)}.
	 * Tests if the attribute is stored correctly.
	 */
	@Test
	void testAttribute2() {
		IoSession session = new IoSession() {
			public Object setAttribute(String key, Object attribute) {
				return attribute;
			}
			public Object getAttribute(String key) {
				return null;
			}
			public void write(Object message) {
			}
			public void close() {
			}
		};
		Node client = new Client(session);
		Object attribute = new Object();
		assertEquals(attribute, client.attribute("key", attribute));
	}
	
	/**
	 * Test case for {@link Client#attribute(String, Object)}.
	 * Tests if the attribute is stored correctly.
	 */
	@Test
	void testAttribute3() {
		IoSession session = new IoSession() {
			public Object setAttribute(String key, Object attribute) {
				return attribute;
			}
			public Object getAttribute(String key) {
				return null;
			}
			public void write(Object message) {
			}
			public void close() {
			}
		};
		Node client = new Client(session);
		Object attribute = new Object();
		assertEquals(attribute, client.attribute("key", attribute));
	}
	
	/**
	 * Test case for {@link Client#attribute(String, Object)}.
	 * Tests if the attribute is stored correctly.
	 */
	@Test
	void testAttribute4() {
		IoSession session = new IoSession() {
			public Object setAttribute(String key, Object attribute) {
				return attribute;
			}
			public Object getAttribute(String key) {
				return null;
			}
			public void write(Object message) {
			}
			public void close() {
			}
		};
		Node client = new Client(session);
		Object attribute = new Object();
		assertEquals(attribute, client.attribute("key", attribute));
	}
	
	/**
	 * Test case for {@link Client#attribute(String, Object)}.
	 * Tests if the attribute is stored correctly.
	 */
	@Test
	void testAttribute5() {
		IoSession session = new IoSession() {
			public Object setAttribute(String key, Object attribute) {
				return attribute;
			}
			public Object getAttribute(String key) {
				return null;
			}
			public void write(Object message) {
			}
			public void close() {
			}
		};
		Node client = new Client(session);
		Object attribute = new Object();
		assertEquals(attribute, client.attribute("key", attribute));
	}
	
	/**
	 * Test case for {@link Client#attribute(String, Object)}.
	 * Tests if the attribute is stored correctly.
	 */
	@Test
	void testAttribute6() {
		IoSession session = new IoSession() {
			public Object setAttribute(String key, Object attribute) {
				return attribute;
			}
			public Object getAttribute(String key) {
				return null;
			}
			public void write(Object message) {
			}
			public void close() {
			}
		};
		Node client = new Client(session);
		Object attribute = new Object();
		assertEquals(attribute, client.attribute("key", attribute));
	}
	
	/**
	 * Test case for {@link Client#attribute(String, Object)}.
	 * Tests if the attribute is stored correctly.
	 */
	@Test
	void testAttribute7() {
		IoSession session = new IoSession() {
			public Object setAttribute(String key, Object attribute) {
				return attribute;
			}
			public Object getAttribute(String key) {
				return null;
			}
			public void write(Object message) {
			}
			public void close() {
			}
		};
		Node client = new Client(session);
		Object attribute = new Object();
		assertEquals(attribute, client.attribute("key", attribute));
	}
	
	/**
	 * Test case for {@link Client#attribute(String, Object)}.
	 * Tests if the attribute is stored correctly.
	 */
	@Test
	void testAttribute8() {
		IoSession session = new IoSession() {
			public Object setAttribute(String key, Object attribute) {
				return attribute;
			}
			public Object getAttribute(String key) {
				return null;
			}
			public void write(Object message) {
			}
			public void close() {
			}
		};
		Node client = new Client(session);
		Object attribute = new Object();
		assertEquals(attribute, client.attribute("key", attribute));
	}
	
	/**
	 * Test case for {@link Client#attribute(String, Object)}.
	 * Tests if the attribute is stored correctly.
	 */
	@Test
	void testAttribute9() {
		IoSession session = new IoSession() {
			public Object setAttribute(String key, Object attribute) {
				return attribute;
			}
			public Object getAttribute(String key) {
				return null;
			}
			public void write(Object message) {
			}
			public void close() {
			}
		};
		Node client = new Client(session);
		Object attribute = new Object();
		assertEquals(attribute, client.attribute("key", attribute));
	}
	
}

// ClientTest1.java
package ioproject.server.network;

import ioproject.common.network.Node;
import org.apache.mina.common.IoSession;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Client}.
* It contains ten unit test cases for the {@link Client#attribute(String)} method.
*/
class ClientTest1 {
		
