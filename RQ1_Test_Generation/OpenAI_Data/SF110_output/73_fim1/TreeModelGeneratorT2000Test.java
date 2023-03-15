// TreeModelGeneratorTest.java
package osa.ora.server.client.ui.utils;

import java.util.Vector;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import osa.ora.server.beans.Group;
import osa.ora.server.beans.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeModelGenerator}.
* It contains ten unit test cases for the {@link TreeModelGenerator#getModel(String, Vector, Vector, User, boolean, boolean)} method.
*/
class TreeModelGeneratorTest {

	/**
	 * Test case for {@link TreeModelGenerator#getModel(String, Vector, Vector, User, boolean, boolean)} method.
	 * Test data:
	 * <ul>
	 * <li>rootNodeStr = "root"</li>
	 * <li>groups = null</li>
	 * <li>rooms = null</li>
	 * <li>user = null</li>
	 * <li>showOnlineOnly = false</li>
	 * <li>showUsersOnly = false</li>
	 * </ul>
	 * Expected result:
	 * <ul>
	 * <li>root node is "root"</li>
	 * <li>no child nodes</li>
	 * </ul>
	 */
	@Test
	void testGetModel_1() {
		String rootNodeStr = "root";
		Vector groups = null;
		Vector rooms = null;
		User user = null;
		boolean showOnlineOnly = false;
		boolean showUsersOnly = false;
		DefaultTreeModel result = TreeModelGenerator.getModel(rootNodeStr, groups, rooms, user, showOnlineOnly, showUsersOnly);
		DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode) result.getRoot();
		assertEquals("root", rootNode.getUserObject());
		assertEquals(0, rootNode.getChildCount());
	}
	
	/**
	 * Test case for {@link TreeModelGenerator#getModel(String, Vector, Vector, User, boolean, boolean)} method.
	 * Test data:
	 * <ul>
	 * <li>rootNodeStr = "root"</li>
	 * <li>groups = null</li>
	 * <li>rooms = null</li>
	 * <li>user = null</li>
	 * <li>showOnlineOnly = true</li>
	 * <li>showUsersOnly = false</li>
	 * </ul>
	 * Expected result:
	 * <ul>
	 * <li>root node is "root"</li>
	 * <li>no child nodes</li>
	 * </ul>
	 */
	@Test
	void testGetModel_2() {
		String rootNodeStr = "root";
		Vector groups = null;
		Vector rooms = null;
		User user = null;
		boolean showOnlineOnly = true;
		boolean showUsersOnly = false;
		DefaultTreeModel result = TreeModelGenerator.getModel(rootNodeStr, groups, rooms, user, showOnlineOnly, showUsersOnly);
		DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode) result.getRoot();
		assertEquals("root", rootNode.getUserObject());
		assertEquals(0, rootNode.getChildCount());
	}
	
	/**
	 * Test case for {@link TreeModelGenerator#getModel(String, Vector, Vector, User, boolean, boolean)} method.
	 * Test data:
	 * <ul>
	 * <li>rootNodeStr = "root"</li>
	 * <li>groups = null</li>
	 * <li>rooms = null</li>
	 * <li>user = null</li>
	 * <li>showOnlineOnly = false</li>
	 * <li>showUsersOnly = true</li>
	 * </ul>
	 * Expected result:
	 * <ul>
	 * <li>root node is "root"</li>
	 * <li>no child nodes</li>
	 * </ul>
	 */
	@Test
	void testGetModel_3() {
		String rootNodeStr = "root";
		Vector groups = null;
		Vector rooms = null;
		User user = null;
		boolean showOnlineOnly = false;
		boolean showUsersOnly = true;
		DefaultTreeModel result = TreeModelGenerator.getModel(rootNodeStr, groups, rooms, user, showOnlineOnly, showUsersOnly);
		DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode) result.getRoot();
		assertEquals("root", rootNode.getUserObject());
		assertEquals(0, rootNode.getChildCount());
	}
	
	/**
	 * Test case for {@link TreeModelGenerator#getModel(String, Vector, Vector, User, boolean, boolean)} method.
	 * Test data:
	 * <ul>
	 * <li>rootNodeStr = "root"</li>
	 * <li>groups = null</li>
	 * <li>rooms = null</li>
	 * <li>user = null</li>
	 * <li>showOnlineOnly = true</li>
	 * <li>showUsersOnly = true</li>
	 * </ul>
	 * Expected result:
	 * <ul>
	 * <li>root node is "root"</li>
	 * <li>no child nodes</li>
	 * </ul>
	 */
	@Test
	void testGetModel_4() {
		String rootNodeStr = "root";
		Vector groups = null;
		Vector rooms = null;
		User user = null;
		boolean showOnlineOnly = true;
		boolean showUsersOnly = true;
		DefaultTreeModel result = TreeModelGenerator.getModel(rootNodeStr, groups, rooms, user, showOnlineOnly, showUsersOnly);
		DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode) result.getRoot();
		assertEquals("root", rootNode.getUserObject());
		assertEquals(0, rootNode.getChildCount());
	}
	
	/**
	 * Test case for {@link TreeModelGenerator#getModel(String, Vector, Vector, User, boolean, boolean)} method.
	 * Test data:
	 * <ul>
	 * <li>rootNodeStr = "root"</li>
	 * <li>groups = empty vector</li>
	 * <li>rooms = null</li>
	 * <li>user = null</li>
	 * <li>showOnlineOnly = false</li>
	 * <li>showUsersOnly = false</li>
	 * </ul>
	 * Expected result:
	 * <ul>
	 * <li>root node is "root"</li>
	 * <li>no child nodes</li>
	 * </ul>
	 */
	@Test
	void testGetModel_5() {
		String rootNodeStr = "root";
		Vector groups = new Vector();
		Vector rooms = null;
		User user = null;
		boolean showOnlineOnly = false;
		boolean showUsersOnly = false;
		DefaultTreeModel result = TreeModelGenerator.getModel(rootNodeStr, groups, rooms, user, showOnlineOnly, showUsersOnly);
		DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode) result.getRoot();
		assertEquals("root", rootNode.getUserObject());
		assertEquals(0, rootNode.getChildCount());
	}
	
	/**
	 * Test case for {@link TreeModelGenerator#getModel(String, Vector, Vector, User, boolean, boolean)} method.
	 * Test data:
	 * <ul>
	 * <li>rootNodeStr = "root"</li>
	 * <li>groups = empty vector</li>
	 * <li>rooms = null</li>
	 * <li>user = null</li>
	 * <li>showOnlineOnly = true</li>
	 * <li>showUsersOnly = false</li>
	 * </ul>
	 * Expected result:
	 * <ul>
	 * <li>root node is "root"</li>
	 * <li>no child nodes</li>
	 * </ul>
	 */
	@Test
	void testGetModel_6() {
		String rootNodeStr = "root";
		Vector groups = new Vector();
		Vector rooms = null;
		User user = null;
		boolean showOnlineOnly = true;
		boolean showUsersOnly = false;
		DefaultTreeModel result = TreeModelGenerator.get