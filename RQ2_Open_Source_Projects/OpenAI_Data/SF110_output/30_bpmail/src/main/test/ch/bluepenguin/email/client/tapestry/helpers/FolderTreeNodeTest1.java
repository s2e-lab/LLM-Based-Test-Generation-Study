// FolderTreeNodeTest1.java
package ch.bluepenguin.email.client.tapestry.helpers;

import org.apache.tapestry.contrib.tree.model.IMutableTreeNode;
import org.apache.tapestry.contrib.tree.simple.TreeNode;
import ch.bluepenguin.email.client.Folder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FolderTreeNode}.
* It contains ten unit test cases for the {@link FolderTreeNode#equals(Object)} method.
*/
class FolderTreeNodeTest1 {

	/**
	* Test case 1 for {@link FolderTreeNode#equals(Object)}.
	* This test case tests the normal case.
	*/
	@Test
	public void testEquals1() {
		FolderTreeNode node1 = new FolderTreeNode(new Folder("test"));
		FolderTreeNode node2 = new FolderTreeNode(new Folder("test"));
		assertTrue(node1.equals(node2));
	}
	
	/**
	* Test case 2 for {@link FolderTreeNode#equals(Object)}.
	* This test case tests the normal case.
	*/
	@Test
	public void testEquals2() {
		FolderTreeNode node1 = new FolderTreeNode(new Folder("test"));
		FolderTreeNode node2 = new FolderTreeNode(new Folder("test"));
		node2.setParent(new TreeNode());
		assertTrue(node1.equals(node2));
	}
	
	/**
	* Test case 3 for {@link FolderTreeNode#equals(Object)}.
	* This test case tests the normal case.
	*/
	@Test
	public void testEquals3() {
		FolderTreeNode node1 = new FolderTreeNode(new Folder("test"));
		FolderTreeNode node2 = new FolderTreeNode(new Folder("test"));
		node1.setParent(new TreeNode());
		assertTrue(node1.equals(node2));
	}
	
	/**
	* Test case 4 for {@link FolderTreeNode#equals(Object)}.
	* This test case tests the normal case.
	*/
	@Test
	public void testEquals4() {
		FolderTreeNode node1 = new FolderTreeNode(new Folder("test"));
		FolderTreeNode node2 = new FolderTreeNode(new Folder("test"));
		node1.setParent(new TreeNode());
		node2.setParent(new TreeNode());
		assertTrue(node1.equals(node2));
	}
	
	/**
	* Test case 5 for {@link FolderTreeNode#equals(Object)}.
	* This test case tests the normal case.
	*/
	@Test
	public void testEquals5() {
		FolderTreeNode node1 = new FolderTreeNode(new Folder("test"));
		FolderTreeNode node2 = new FolderTreeNode(new Folder("test"));
		node1.setParent(new TreeNode());
		node2.setParent(new TreeNode());
		node1.setParent(null);
		assertTrue(node1.equals(node2));
	}
	
	/**
	* Test case 6 for {@link FolderTreeNode#equals(Object)}.
	* This test case tests the normal case.
	*/
	@Test
	public void testEquals6() {
		FolderTreeNode node1 = new FolderTreeNode(new Folder("test"));
		FolderTreeNode node2 = new FolderTreeNode(new Folder("test"));
		node1.setParent(new TreeNode());
		node2.setParent(new TreeNode());
		node2.setParent(null);
		assertTrue(node1.equals(node2));
	}
	
	/**
	* Test case 7 for {@link FolderTreeNode#equals(Object)}.
	* This test case tests the normal case.
	*/
	@Test
	public void testEquals7() {
		FolderTreeNode node1 = new FolderTreeNode(new Folder("test"));
		FolderTreeNode node2 = new FolderTreeNode(new Folder("test"));
		node1.setParent(new TreeNode());
		node2.setParent(new TreeNode());
		node1.setParent(null);
		node2.setParent(null);
		assertTrue(node1.equals(node2));
	}
	
	/**
	* Test case 8 for {@link FolderTreeNode#equals(Object)}.
	* This test case tests the normal case.
	*/
	@Test
	public void testEquals8() {
		FolderTreeNode node1 = new FolderTreeNode(new Folder("test"));
		FolderTreeNode node2 = new FolderTreeNode(new Folder("test"));
		node1.setParent(new TreeNode());
		node2.setParent(new TreeNode());
		node1.setParent(null);
		node2.setParent(null);
		node1.setFolder(null);
		assertFalse(node1.equals(node2));
	}
	
	/**
	* Test case 9 for {@link FolderTreeNode#equals(Object)}.
	* This test case tests the normal case.
	*/
	@Test
	public void testEquals9() {
		FolderTreeNode node1 = new FolderTreeNode(new Folder("test"));
		FolderTreeNode node2 = new FolderTreeNode(new Folder("test"));
		node1.setParent(new TreeNode());
		node2.setParent(new TreeNode());
		node1.setParent(null);
		node2.setParent(null);
		node2.setFolder(null);
		assertFalse(node1.equals(node2));
	}
	
	/**
	* Test case 10 for {@link FolderTreeNode#equals(Object)}.
	* This test case tests the normal case.
	*/
	@Test
	public void testEquals10() {
		FolderTreeNode node1 = new FolderTreeNode(new Folder("test"));
		FolderTreeNode node2 = new FolderTreeNode(new Folder("test"));
		node1.setParent(new TreeNode());
		node2.setParent(new TreeNode());
		node1.setParent(null);
		node2.setParent(null);
		node1.setFolder(null);
		node2.setFolder(null);
		assertTrue(node1.equals(node2));
	}
	
}

// FolderTreeNodeTest2.java
package ch.bluepenguin.email.client.tapestry.helpers;

import org.apache.tapestry.contrib.tree.model.IMutableTreeNode;
import org.apache.tapestry.contrib.tree.simple.TreeNode;
import ch.bluepenguin.email.client.Folder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FolderTreeNode}.
* It contains ten unit test cases for the {@link FolderTreeNode#hashCode()} method.
*/
class FolderTreeNodeTest2 {
		
	/**
	* Test case 1 for {@link FolderTreeNode#hashCode()}.
	* This test case tests the normal case.
	*/
	@Test
	public void testHashCode1() {
		FolderTreeNode node1 = new FolderTreeNode(new Folder("test"));
		FolderTreeNode node2 = new FolderTreeNode(new Folder("test"));
		assertEquals(node1.hashCode(), node2.hashCode());
	}
	
	/**
	* Test case 2 for {@link FolderTreeNode#hashCode()}.
	* This test case tests the normal case.
	*/
	@Test
	public void testHashCode2() {
		FolderTreeNode node1 = new FolderTreeNode(new Folder("test"));
		FolderTreeNode node2 = new FolderTreeNode(new Folder("test"));
		node2.setParent(new TreeNode());
		assertEquals(node1.hashCode(), node2.hashCode());
	}
	
	/**
	* Test case 3 for {@link FolderTreeNode#hashCode()}.
	* This test case tests the normal case.
	*/
	@Test
	public void testHashCode3() {
		FolderTreeNode node1 = new FolderTreeNode(new Folder("test"));
		FolderTreeNode node2 = new FolderTreeNode(new Folder("test"));
		node1.setParent(new TreeNode());
		assertEquals(node1.hashCode(), node2.hashCode());
	}
	
	/**
	* Test case 4 for {@link FolderTreeNode#hashCode()}.
	* This test case tests the normal case.
	*/
	@