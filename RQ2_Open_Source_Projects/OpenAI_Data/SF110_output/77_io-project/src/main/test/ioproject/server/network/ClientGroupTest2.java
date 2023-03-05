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
				assertEquals(0, group.size());
				
				Client client = new Client(null, null);
				group.add(client);
				assertEquals(1, group.size());
				
				group.remove(client);
				assertEquals(0, group.size());
				
				ClientGroup subGroup = group.createSubGroup();
				group.add(client);
				assertEquals(1, group.size());
				assertEquals(0, subGroup.size());
				
				subGroup.add(client);
				assertEquals(1, group.size());
				assertEquals(1, subGroup.size());
				
				group.remove(client);
				assertEquals(0, group.size());
				assertEquals(0, subGroup.size());
				
				group.add(client);
				assertEquals(1, group.size());
				assertEquals(0, subGroup.size());
				
				subGroup.add(client);
				assertEquals(1, group.size());
				assertEquals(1, subGroup.size());
				
				subGroup.remove(client);
				assertEquals(1, group.size());
				assertEquals(0, subGroup.size());
				
				group.remove(client);
				assertEquals(0, group.size());
				assertEquals(0, subGroup.size());
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
* It contains ten unit test cases for the {@link ClientGroup#contains(Client)} method.
*/
class ClientGroupTest3 {
		
		@Test
		void testContains() {
				ClientGroup group = new ClientGroup(null);
				Client client = new Client(null, null);
				assertFalse(group.contains(client));
				
				group.add(client);
				assertTrue(group.contains(client));
				
				group.remove(client);
				assertFalse(group.contains(client));
				
				ClientGroup subGroup = group.createSubGroup();
				group.add(client);
				assertTrue(group.contains(client));
				assertFalse(subGroup.contains(client));
				
				subGroup.add(client);
				assertTrue(group.contains(client));
				assertTrue(subGroup.contains(client));
				
				group.remove(client);
				assertFalse(group.contains(client));
				assertFalse(subGroup.contains(client));
				
				group.add(client);
				assertTrue(group.contains(client));
				assertFalse(subGroup.contains(client));
				
				subGroup.add(client);
				assertTrue(group.contains(client));
				assertTrue(subGroup.contains(client));
				
				subGroup.remove(client);
				assertTrue(group.contains(client));
				assertFalse(subGroup.contains(client));
				
				group.remove(client);
				assertFalse(group.contains(client));
				assertFalse(subGroup.contains(client));
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
* It contains ten unit test cases for the {@link ClientGroup#add(Client)} method.
*/
class ClientGroupTest4 {
		
		@Test
		void testAdd() {
				ClientGroup group = new ClientGroup(null);
				Client client = new Client(null, null);
				assertTrue(group.add(client));
				assertFalse(group.add(client));
				
				group.remove(client);
				assertTrue(group.add(client));
				assertFalse(group.add(client));
				
				ClientGroup subGroup = group.createSubGroup();
				group.add(client);
				assertTrue(group.add(client));
				assertFalse(subGroup.add(client));
				
				subGroup.add(client);
				assertTrue(group.add(client));
				assertFalse(subGroup.add(client));
				
				group.remove(client);
				assertTrue(group.add(client));
				assertFalse(subGroup.add(client));
				
				group.add(client);
				assertTrue(group.add(client));
				assertFalse(subGroup.add(client));
				
				subGroup.add(client);
				assertTrue(group.add(client));
				assertFalse(subGroup.add(client));
				
				subGroup.remove(client);
				assertTrue(group.add(client));
				assertFalse(subGroup.add(client));
				
				group.remove(client);
				assertTrue(group.add(client));
				assertFalse(subGroup.add(client));
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
* It contains ten unit test cases for the {@link ClientGroup#remove(Client)} method.
*/
class ClientGroupTest5 {
		
		@Test
		void testRemove() {
				ClientGroup group = new ClientGroup(null);
				Client client = new Client(null, null);
				assertFalse(group.remove(client));
				
				group.add(client);
				assertTrue(group.remove(client));
				assertFalse(group.remove(client));
				
				group.add(client);
				assertTrue(group.remove(client));
				assertFalse(group.remove(client));
				
				ClientGroup subGroup = group.createSubGroup();
				group.add(client);
				assertTrue(group.remove(client));
				assertFalse(