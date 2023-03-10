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
* It contains ten unit test cases for the {@link ClientGroup#createSubGroup()} method.
*/
class ClientGroupTest5 {

		@Test
		void testCreateSubGroup() {
				ClientGroup group = new ClientGroup(null);
				ClientGroup subGroup = group.createSubGroup();
				assertEquals(group, subGroup.parentGroup());
				assertEquals(1, group.subGroups().size());
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup)));
		}
		
		@Test
		void testCreateSubGroup2() {
				ClientGroup group = new ClientGroup(null);
				ClientGroup subGroup = group.createSubGroup();
				ClientGroup subGroup2 = group.createSubGroup();
				assertEquals(group, subGroup.parentGroup());
				assertEquals(group, subGroup2.parentGroup());
				assertEquals(2, group.subGroups().size());
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup)));
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup2)));
		}
		
		@Test
		void testCreateSubGroup3() {
				ClientGroup group = new ClientGroup(null);
				ClientGroup subGroup = group.createSubGroup();
				ClientGroup subGroup2 = group.createSubGroup();
				ClientGroup subGroup3 = group.createSubGroup();
				assertEquals(group, subGroup.parentGroup());
				assertEquals(group, subGroup2.parentGroup());
				assertEquals(group, subGroup3.parentGroup());
				assertEquals(3, group.subGroups().size());
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup)));
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup2)));
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup3)));
		}
		
		@Test
		void testCreateSubGroup4() {
				ClientGroup group = new ClientGroup(null);
				ClientGroup subGroup = group.createSubGroup();
				ClientGroup subGroup2 = group.createSubGroup();
				ClientGroup subGroup3 = group.createSubGroup();
				ClientGroup subGroup4 = group.createSubGroup();
				assertEquals(group, subGroup.parentGroup());
				assertEquals(group, subGroup2.parentGroup());
				assertEquals(group, subGroup3.parentGroup());
				assertEquals(group, subGroup4.parentGroup());
				assertEquals(4, group.subGroups().size());
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup)));
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup2)));
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup3)));
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup4)));
		}
		
		@Test
		void testCreateSubGroup5() {
				ClientGroup group = new ClientGroup(null);
				ClientGroup subGroup = group.createSubGroup();
				ClientGroup subGroup2 = group.createSubGroup();
				ClientGroup subGroup3 = group.createSubGroup();
				ClientGroup subGroup4 = group.createSubGroup();
				ClientGroup subGroup5 = group.createSubGroup();
				assertEquals(group, subGroup.parentGroup());
				assertEquals(group, subGroup2.parentGroup());
				assertEquals(group, subGroup3.parentGroup());
				assertEquals(group, subGroup4.parentGroup());
				assertEquals(group, subGroup5.parentGroup());
				assertEquals(5, group.subGroups().size());
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup)));
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup2)));
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup3)));
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup4)));
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup5)));
		}
		
		@Test
		void testCreateSubGroup6() {
				ClientGroup group = new ClientGroup(null);
				ClientGroup subGroup = group.createSubGroup();
				ClientGroup subGroup2 = group.createSubGroup();
				ClientGroup subGroup3 = group.createSubGroup();
				ClientGroup subGroup4 = group.createSubGroup();
				ClientGroup subGroup5 = group.createSubGroup();
				ClientGroup subGroup6 = group.createSubGroup();
				assertEquals(group, subGroup.parentGroup());
				assertEquals(group, subGroup2.parentGroup());
				assertEquals(group, subGroup3.parentGroup());
				assertEquals(group, subGroup4.parentGroup());
				assertEquals(group, subGroup5.parentGroup());
				assertEquals(group, subGroup6.parentGroup());
				assertEquals(6, group.subGroups().size());
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup)));
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup2)));
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup3)));
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup4)));
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup5)));
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup6)));
		}
		
		@Test
		void testCreateSubGroup7() {
				ClientGroup group = new ClientGroup(null);
				ClientGroup subGroup = group.createSubGroup();
				ClientGroup subGroup2 = group.createSubGroup();
				ClientGroup subGroup3 = group.createSubGroup();
				ClientGroup subGroup4 = group.createSubGroup();
				ClientGroup subGroup5 = group.createSubGroup();
				ClientGroup subGroup6 = group.createSubGroup();
				ClientGroup subGroup7 = group.createSubGroup();
				assertEquals(group, subGroup.parentGroup());
				assertEquals(group, subGroup2.parentGroup());
				assertEquals(group, subGroup3.parentGroup());
				assertEquals(group, subGroup4.parentGroup());
				assertEquals(group, subGroup5.parentGroup());
				assertEquals(group, subGroup6.parentGroup());
				assertEquals(group, subGroup7.parentGroup());
				assertEquals(7, group.subGroups().size());
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup)));
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup2)));
				assertTrue(group.subGroups().contains(new WeakReference<ClientGroup>(subGroup3)));
	