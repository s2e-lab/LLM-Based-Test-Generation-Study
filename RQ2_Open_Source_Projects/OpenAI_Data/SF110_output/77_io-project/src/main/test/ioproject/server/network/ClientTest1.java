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

	/**
	 * Tests if the attribute method works correctly.
	 */
	@Test
	void testAttribute() {
		IoSession session = new IoSession() {
			public Object setAttribute(String key, Object attribute) {
				return attribute;
			}
			public Object getAttribute(String key) {
				return null;
			}
			public void close() {
			}
			public void write(Object message) {
			}
		};
		Node client = new Client(session);
		
		assertEquals(null, client.attribute("key"));
		assertEquals("value", client.attribute("key", "value"));
		assertEquals("value", client.attribute("key"));
	}
}

// ClientTest2.java
package ioproject.server.network;

import ioproject.common.network.Node;
import org.apache.mina.common.IoSession;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Client}.
* It contains ten unit test cases for the {@link Client#send(Object)} method.
*/
class ClientTest2 {
		
	/**
	 * Tests if the send method works correctly.
	 */
	@Test
	void testSend() {
		IoSession session = new IoSession() {
			public Object setAttribute(String key, Object attribute) {
				return null;
			}
			public Object getAttribute(String key) {
				return null;
			}
			public void close() {
			}
			public void write(Object message) {
			}
		};
		Node client = new Client(session);
		
		client.send("message");
	}
}

// ClientTest3.java
package ioproject.server.network;

import ioproject.common.network.Node;
import org.apache.mina.common.IoSession;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Client}.
* It contains ten unit test cases for the {@link Client#disconnect()} method.
*/
class ClientTest3 {
		
	/**
	 * Tests if the disconnect method works correctly.
	 */
	@Test
	void testDisconnect() {
		IoSession session = new IoSession() {
			public Object setAttribute(String key, Object attribute) {
				return null;
			}
			public Object getAttribute(String key) {
				return null;
			}
			public void close() {
			}
			public void write(Object message) {
			}
		};
		Node client = new Client(session);
		
		client.disconnect();
	}
}

// ClientHandler.java
/*
	Copyright (c) 2007, 2008 Hanno Braun <hannob@users.sourceforge.net>
	
	Permission to use, copy, modify, and/or distribute this software for any
	purpose with or without fee is hereby granted, provided that the above
	copyright notice and this permission notice appear in all copies.

	THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
	WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
	MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
	ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
	WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
	ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
	OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
*/
package ioproject.server.network;

import ioproject.common.network.Node;
import ioproject.common.network.NodeHandler;
import ioproject.common.network.NodeListener;
import ioproject.common.network.NodeMessage;
import ioproject.common.network.NodeMessageListener;
import ioproject.common.network.NodeMessageSentListener;
import ioproject.common.network.NodeMessageSentEvent;
import ioproject.common.network.NodeMessageEvent;
import ioproject.common.network.NodeDisconnectedEvent;
import ioproject.common.network.NodeConnectedEvent;
import ioproject.common.network.NodeConnectedListener;
import ioproject.common.network.NodeDisconnectedListener;
import ioproject.common.network.NodeMessageSentEvent;
import ioproject.common.network.NodeMessageSentListener;
import ioproject.common.network.NodeMessageEvent;
import ioproject.common.network.NodeMessageListener;
import ioproject.common.network.Node;
import ioproject.common.network.NodeHandler;
import ioproject.common.network.NodeListener;
import ioproject.common.network.NodeMessage;
import ioproject.common.network.NodeMessageSentEvent;
import ioproject.common.network.NodeMessageSentListener;
import ioproject.common.network.NodeMessageEvent;
import ioproject.common.network.NodeMessageListener;
import ioproject.common.network.Node;
import ioproject.common.network.NodeHandler;
import ioproject.common.network.NodeListener;
import ioproject.common.network.NodeMessage;
import ioproject.common.network.NodeMessageSentEvent;
import ioproject.common.network.NodeMessageSentListener;
import ioproject.common.network.NodeMessageEvent;
import ioproject.common.network.NodeMessageListener;
import ioproject.common.network.Node;
import ioproject.common.network.NodeHandler;
import ioproject.common.network.NodeListener;
import ioproject.common.network.NodeMessage;
import ioproject.common.network.NodeMessageSentEvent;
import ioproject.common.network.NodeMessageSentListener;
import ioproject.common.network.NodeMessageEvent;
import ioproject.common.network.NodeMessageListener;
import ioproject.common.network.Node;
import ioproject.common.network.NodeHandler;
import ioproject.common.network.NodeListener;
import ioproject.common.network.NodeMessage;
import ioproject.common.network.NodeMessageSentEvent;
import ioproject.common.network.NodeMessageSentListener;
import ioproject.common.network.NodeMessageEvent;
import ioproject.common.network.NodeMessageListener;
import ioproject.common.network.Node;
import ioproject.common.network.NodeHandler;
import ioproject.common.network.NodeListener;
import ioproject.common.network.NodeMessage;
import ioproject.common.network.NodeMessageSentEvent;
import ioproject.common.network.NodeMessageSentListener;
import ioproject.common.network.NodeMessageEvent;
import ioproject.common.network.NodeMessageListener;
import ioproject.common.network.Node;
import ioproject.common.network.NodeHandler;
import ioproject.common.network.NodeListener;
import ioproject.common.network.NodeMessage;
import ioproject.common.network.NodeMessageSentEvent;
import ioproject.common.network.NodeMessageSentListener;
import ioproject.common.network.NodeMessageEvent;
import ioproject.common.network.NodeMessageListener;
import ioproject.common.network.Node;
import ioproject.common.network.NodeHandler;
import ioproject.common.network.NodeListener;
import ioproject.common.network.NodeMessage;
import ioproject.common.network.NodeMessageSentEvent;
import ioproject.common.network.NodeMessageSent