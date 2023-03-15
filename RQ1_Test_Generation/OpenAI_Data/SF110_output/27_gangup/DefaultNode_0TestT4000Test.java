// DefaultNode_0Test.java
package map;

import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNode}.
* It contains ten unit test cases for the {@link DefaultNode#getChildNode(int)} method.
*/
class DefaultNode_0Test {

	/**
	* Test case 1 for {@link DefaultNode#getChildNode(int)}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetChildNode_1() {
		DefaultNode node = new DefaultNode();
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		assertNotNull(node.getChildNode(0));
	}
	
	/**
	* Test case 2 for {@link DefaultNode#getChildNode(int)}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetChildNode_2() {
		DefaultNode node = new DefaultNode();
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		assertNotNull(node.getChildNode(9));
	}
	
	/**
	* Test case 3 for {@link DefaultNode#getChildNode(int)}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetChildNode_3() {
		DefaultNode node = new DefaultNode();
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		assertNotNull(node.getChildNode(5));
	}
	
	/**
	* Test case 4 for {@link DefaultNode#getChildNode(int)}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetChildNode_4() {
		DefaultNode node = new DefaultNode();
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		assertNotNull(node.getChildNode(3));
	}
	
	/**
	* Test case 5 for {@link DefaultNode#getChildNode(int)}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetChildNode_5() {
		DefaultNode node = new DefaultNode();
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		assertNotNull(node.getChildNode(7));
	}
	
	/**
	* Test case 6 for {@link DefaultNode#getChildNode(int)}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetChildNode_6() {
		DefaultNode node = new DefaultNode();
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		assertNotNull(node.getChildNode(1));
	}
	
	/**
	* Test case 7 for {@link DefaultNode#getChildNode(int)}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetChildNode_7() {
		DefaultNode node = new DefaultNode();
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		assertNotNull(node.getChildNode(8));
	}
	
	/**
	* Test case 8 for {@link DefaultNode#getChildNode(int)}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetChildNode_8() {
		DefaultNode node = new DefaultNode();
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		assertNotNull(node.getChildNode(4));
	}
	
	/**
	* Test case 9 for {@link DefaultNode#getChildNode(int)}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetChildNode_9() {
		DefaultNode node = new DefaultNode();
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		assertNotNull(node.getChildNode(6));
	}
	
	/**
	* Test case 10 for {@link DefaultNode#getChildNode(int)}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetChildNode_10() {
		DefaultNode node = new DefaultNode();
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		assertNotNull(node.getChildNode(2));
	}
}

// DefaultNode_1Test.java
package map;

import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNode}.
* It contains ten unit test cases for the {@link DefaultNode#getAllChildren()} method.
*/
class DefaultNode_1Test {
		
	/**
	* Test case 1 for {@link DefaultNode#getAllChildren()}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetAllChildren_1() {
		DefaultNode node = new DefaultNode();
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		assertNotNull(node.getAllChildren());
	}
	
	/**
	* Test case 2 for {@link DefaultNode#getAllChildren()}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetAllChildren_2() {
		DefaultNode node = new DefaultNode();
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		assertNotNull(node.getAllChildren());
	}
	
	/**
	* Test case 3 for {@link DefaultNode#getAllChildren()}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetAllChildren_3() {
		DefaultNode node = new DefaultNode();
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		assertNotNull(node.getAllChildren());
	}
	
	/**
	* Test case 4 for {@link DefaultNode#getAllChildren()}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetAllChildren_4() {
		DefaultNode node = new DefaultNode();
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		assertNotNull(node.getAllChildren());
	}
	
	/**
	* Test case 5 for {@link DefaultNode#getAllChildren()}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetAllChildren_5() {
		DefaultNode node = new DefaultNode();
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		assertNotNull(node.getAllChildren());
	}
	
	/**
	* Test case 6 for {@link DefaultNode#getAllChildren()}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetAllChildren_6() {
		DefaultNode node = new DefaultNode();
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		assertNotNull(node.getAllChildren());
	}
	
	/**
	* Test case 7 for {@link DefaultNode#getAllChildren()}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetAllChildren_7() {
		DefaultNode node = new DefaultNode();
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		assertNotNull(node.getAllChildren());
	}
	
	/**
	* Test case 8 for {@link DefaultNode#getAllChildren()}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetAllChildren_8() {
		DefaultNode node = new DefaultNode();
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		node.addChildNode(new DefaultNode());
		assertNotNull(node.getAllChildren());
	}
	
	/**
	* Test case 9 for {@link DefaultNode#getAllChildren()}.
	* It tests the method with a valid index.
	*/
	@Test
	void testGetAllChildren_9() {
		DefaultNode node = new DefaultNode();
		node.addChildNode(new DefaultNode());