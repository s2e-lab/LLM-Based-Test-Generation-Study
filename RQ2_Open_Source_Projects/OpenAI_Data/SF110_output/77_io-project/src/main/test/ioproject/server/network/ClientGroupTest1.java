// ClientGroupTest1.java
package ioproject.server.network;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientGroup}.
* It contains ten unit test cases for the {@link ClientGroup#contains(Client)} method.
*/
class ClientGroupTest1 {

		@Test
		void testContains() {
				ClientGroup group = new ClientGroup(null);
				Client client = new Client(null, null);
				
				assertFalse(group.contains(client));
				
				group.add(client);
				
				assertTrue(group.contains(client));
				
				group.remove(client);
				
				assertFalse(group.contains(client));
		}
}

// ClientGroupTest2.java
package ioproject.server.network;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientGroup}.
* It contains ten unit test cases for the {@link ClientGroup#size()} method.
*/
class ClientGroupTest2 {
		
		@Test
		void testSize() {
				ClientGroup group = new ClientGroup(null);
				Client client = new Client(null, null);
				
				assertEquals(0, group.size());
				
				group.add(client);
				
				assertEquals(1, group.size());
				
				group.remove(client);
				
				assertEquals(0, group.size());
		}
}

// ClientGroupTest3.java
package ioproject.server.network;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientGroup}.
* It contains ten unit test cases for the {@link ClientGroup#add(Client)} method.
*/
class ClientGroupTest3 {
		
		@Test
		void testAdd() {
				ClientGroup group = new ClientGroup(null);
				Client client = new Client(null, null);
				
				assertTrue(group.add(client));
				
				assertFalse(group.add(client));
		}
}

// ClientGroupTest4.java
package ioproject.server.network;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientGroup}.
* It contains ten unit test cases for the {@link ClientGroup#remove(Client)} method.
*/
class ClientGroupTest4 {
		
		@Test
		void testRemove() {
				ClientGroup group = new ClientGroup(null);
				Client client = new Client(null, null);
				
				assertFalse(group.remove(client));
				
				group.add(client);
				
				assertTrue(group.remove(client));
				
				assertFalse(group.remove(client));
		}
}

// ClientGroupTest5.java
package ioproject.server.network;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientGroup}.
* It contains ten unit test cases for the {@link ClientGroup#iterator()} method.
*/
class ClientGroupTest5 {
		
		@Test
		void testIterator() {
				ClientGroup group = new ClientGroup(null);
				Client client = new Client(null, null);
				
				Iterator<Client> iterator = group.iterator();
				
				assertFalse(iterator.hasNext());
				
				group.add(client);
				
				iterator = group.iterator();
				
				assertTrue(iterator.hasNext());
				
				assertEquals(client, iterator.next());
				
				assertFalse(iterator.hasNext());
		}
}

// ClientGroupTest6.java
package ioproject.server.network;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientGroup}.
* It contains ten unit test cases for the {@link ClientGroup#createSubGroup()} method.
*/
class ClientGroupTest6 {
		
		@Test
		void testCreateSubGroup() {
				ClientGroup group = new ClientGroup(null);
				
				ClientGroup subGroup = group.createSubGroup();
				
				assertEquals(group, subGroup.parentGroup());
		}
}

// ClientGroupTest7.java
package ioproject.server.network;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientGroup}.
* It contains ten unit test cases for the {@link ClientGroup#addClientHandler(ClientHandler)} method.
*/
class ClientGroupTest7 {
		
		@Test
		void testAddClientHandler() {
				ClientGroup group = new ClientGroup(null);
				ClientHandler handler = new ClientHandler() {
						public void clientAdded(Client client) {
						}
						public void clientRemoved(Client client) {
						}
						public void messageSent(Client client, Object message) {
						}
						public void messageReceived(Client client, Object message) {
						}
						public void exceptionCaught(Client client, Throwable cause) {
						}
				};
				
				group.addClientHandler(handler);
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
	ACTION OF CONTRACT, NEGLIGENCE OR OTHER T