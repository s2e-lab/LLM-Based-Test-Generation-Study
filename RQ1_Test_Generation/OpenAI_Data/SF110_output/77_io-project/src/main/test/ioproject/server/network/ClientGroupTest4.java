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

		/**
		 * Tests if the method removes a client from the group.
		 */
		@Test
		void testRemoveClient() {
				ClientGroup group = new ClientGroup(null);
				Client client = new Client(null, null);
				group.add(client);
				group.remove(client);
				assertFalse(group.contains(client));
		}
		
		/**
		 * Tests if the method removes a client from the group and all sub-groups.
		 */
		@Test
		void testRemoveClientFromSubGroup() {
				ClientGroup group = new ClientGroup(null);
				ClientGroup subGroup = group.createSubGroup();
				Client client = new Client(null, null);
				group.add(client);
				subGroup.add(client);
				group.remove(client);
				assertFalse(group.contains(client));
				assertFalse(subGroup.contains(client));
		}
		
		/**
		 * Tests if the method removes a client from the group and all sub-groups.
		 */
		@Test
		void testRemoveClientFromSubSubGroup() {
				ClientGroup group = new ClientGroup(null);
				ClientGroup subGroup = group.createSubGroup();
				ClientGroup subSubGroup = subGroup.createSubGroup();
				Client client = new Client(null, null);
				group.add(client);
				subGroup.add(client);
				subSubGroup.add(client);
				group.remove(client);
				assertFalse(group.contains(client));
				assertFalse(subGroup.contains(client));
				assertFalse(subSubGroup.contains(client));
		}
		
		/**
		 * Tests if the method removes a client from the group and all sub-groups.
		 */
		@Test
		void testRemoveClientFromSubSubSubGroup() {
				ClientGroup group = new ClientGroup(null);
				ClientGroup subGroup = group.createSubGroup();
				ClientGroup subSubGroup = subGroup.createSubGroup();
				ClientGroup subSubSubGroup = subSubGroup.createSubGroup();
				Client client = new Client(null, null);
				group.add(client);
				subGroup.add(client);
				subSubGroup.add(client);
				subSubSubGroup.add(client);
				group.remove(client);
				assertFalse(group.contains(client));
				assertFalse(subGroup.contains(client));
				assertFalse(subSubGroup.contains(client));
				assertFalse(subSubSubGroup.contains(client));
		}
		
		/**
		 * Tests if the method removes a client from the group and all sub-groups.
		 */
		@Test
		void testRemoveClientFromSubSubSubSubGroup() {
				ClientGroup group = new ClientGroup(null);
				ClientGroup subGroup = group.createSubGroup();
				ClientGroup subSubGroup = subGroup.createSubGroup();
				ClientGroup subSubSubGroup = subSubGroup.createSubGroup();
				ClientGroup subSubSubSubGroup = subSubSubGroup.createSubGroup();
				Client client = new Client(null, null);
				group.add(client);
				subGroup.add(client);
				subSubGroup.add(client);
				subSubSubGroup.add(client);
				subSubSubSubGroup.add(client);
				group.remove(client);
				assertFalse(group.contains(client));
				assertFalse(subGroup.contains(client));
				assertFalse(subSubGroup.contains(client));
				assertFalse(subSubSubGroup.contains(client));
				assertFalse(subSubSubSubGroup.contains(client));
		}
		
		/**
		 * Tests if the method removes a client from the group and all sub-groups.
		 */
		@Test
		void testRemoveClientFromSubSubSubSubSubGroup() {
				ClientGroup group = new ClientGroup(null);
				ClientGroup subGroup = group.createSubGroup();
				ClientGroup subSubGroup = subGroup.createSubGroup();
				ClientGroup subSubSubGroup = subSubGroup.createSubGroup();
				ClientGroup subSubSubSubGroup = subSubSubGroup.createSubGroup();
				ClientGroup subSubSubSubSubGroup = subSubSubSubGroup.createSubGroup();
				Client client = new Client(null, null);
				group.add(client);
				subGroup.add(client);
				subSubGroup.add(client);
				subSubSubGroup.add(client);
				subSubSubSubGroup.add(client);
				subSubSubSubSubGroup.add(client);
				group.remove(client);
				assertFalse(group.contains(client));
				assertFalse(subGroup.contains(client));
				assertFalse(subSubGroup.contains(client));
				assertFalse(subSubSubGroup.contains(client));
				assertFalse(subSubSubSubGroup.contains(client));
				assertFalse(subSubSubSubSubGroup.contains(client));
		}
		
		/**
		 * Tests if the method removes a client from the group and all sub-groups.
		 */
		@Test
		void testRemoveClientFromSubSubSubSubSubSubGroup() {
				ClientGroup group = new ClientGroup(null);
				ClientGroup subGroup = group.createSubGroup();
				ClientGroup subSubGroup = subGroup.createSubGroup();
				ClientGroup subSubSubGroup = subSubGroup.createSubGroup();
				ClientGroup subSubSubSubGroup = subSubSubGroup.createSubGroup();
				ClientGroup subSubSubSubSubGroup = subSubSubSubGroup.createSubGroup();
				ClientGroup subSubSubSubSubSubGroup = subSubSubSubSubGroup.createSubGroup();
				Client client = new Client(null, null);
				group.add(client);
				subGroup.add(client);
				subSubGroup.add(client);
				subSubSubGroup.add(client);
				subSubSubSubGroup.add(client);
				subSubSubSubSubGroup.add(client);
				subSubSubSubSubSubGroup.add(client);
				group.remove(client);
				assertFalse(group.contains(client));
				assertFalse(subGroup.contains(client));
				assertFalse(subSubGroup.contains(client));
				assertFalse(subSubSubGroup.contains(client));
				assertFalse(subSubSubSubGroup.contains(client));
				assertFalse(subSubSubSubSubGroup.contains(client));
				assertFalse(subSubSubSubSubSubGroup.contains(client));
		}
		
		/**
		 * Tests if the method removes a client from the group and all sub-groups.
		 */
		@Test
		void testRemoveClientFromSubSubSubSubSubSubSubGroup() {
				ClientGroup group = new ClientGroup(null);
				ClientGroup subGroup = group.createSubGroup();
				ClientGroup subSubGroup = subGroup.createSubGroup();
				ClientGroup subSubSubGroup = subSubGroup.createSubGroup();
				ClientGroup subSubSubSubGroup = subSubSubGroup.createSubGroup();
	