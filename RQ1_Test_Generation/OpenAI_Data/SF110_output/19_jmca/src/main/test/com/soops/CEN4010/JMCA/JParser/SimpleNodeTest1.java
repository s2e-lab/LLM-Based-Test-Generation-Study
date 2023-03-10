// SimpleNodeTest1.java
package com.soops.CEN4010.JMCA.JParser;

import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleNode}.
* It contains ten unit test cases for the {@link SimpleNode#jjtGetChild(int)} method.
*/
class SimpleNodeTest1 {

		/**
		* Test case 1 for {@link SimpleNode#jjtGetChild(int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testJjtGetChild1() {
				SimpleNode node = new SimpleNode(1);
				SimpleNode child = new SimpleNode(2);
				node.jjtAddChild(child, 0);
				assertEquals(child, node.jjtGetChild(0));
		}
		
		/**
		* Test case 2 for {@link SimpleNode#jjtGetChild(int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testJjtGetChild2() {
				SimpleNode node = new SimpleNode(1);
				SimpleNode child = new SimpleNode(2);
				node.jjtAddChild(child, 1);
				assertEquals(child, node.jjtGetChild(1));
		}
		
		/**
		* Test case 3 for {@link SimpleNode#jjtGetChild(int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testJjtGetChild3() {
				SimpleNode node = new SimpleNode(1);
				SimpleNode child = new SimpleNode(2);
				node.jjtAddChild(child, 2);
				assertEquals(child, node.jjtGetChild(2));
		}
		
		/**
		* Test case 4 for {@link SimpleNode#jjtGetChild(int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testJjtGetChild4() {
				SimpleNode node = new SimpleNode(1);
				SimpleNode child = new SimpleNode(2);
				node.jjtAddChild(child, 3);
				assertEquals(child, node.jjtGetChild(3));
		}
		
		/**
		* Test case 5 for {@link SimpleNode#jjtGetChild(int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testJjtGetChild5() {
				SimpleNode node = new SimpleNode(1);
				SimpleNode child = new SimpleNode(2);
				node.jjtAddChild(child, 4);
				assertEquals(child, node.jjtGetChild(4));
		}
		
		/**
		* Test case 6 for {@link SimpleNode#jjtGetChild(int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testJjtGetChild6() {
				SimpleNode node = new SimpleNode(1);
				SimpleNode child = new SimpleNode(2);
				node.jjtAddChild(child, 5);
				assertEquals(child, node.jjtGetChild(5));
		}
		
		/**
		* Test case 7 for {@link SimpleNode#jjtGetChild(int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testJjtGetChild7() {
				SimpleNode node = new SimpleNode(1);
				SimpleNode child = new SimpleNode(2);
				node.jjtAddChild(child, 6);
				assertEquals(child, node.jjtGetChild(6));
		}
		
		/**
		* Test case 8 for {@link SimpleNode#jjtGetChild(int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testJjtGetChild8() {
				SimpleNode node = new SimpleNode(1);
				SimpleNode child = new SimpleNode(2);
				node.jjtAddChild(child, 7);
				assertEquals(child, node.jjtGetChild(7));
		}
		
		/**
		* Test case 9 for {@link SimpleNode#jjtGetChild(int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testJjtGetChild9() {
				SimpleNode node = new SimpleNode(1);
				SimpleNode child = new SimpleNode(2);
				node.jjtAddChild(child, 8);
				assertEquals(child, node.jjtGetChild(8));
		}
		
		/**
		* Test case 10 for {@link SimpleNode#jjtGetChild(int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testJjtGetChild10() {
				SimpleNode node = new SimpleNode(1);
				SimpleNode child = new SimpleNode(2);
				node.jjtAddChild(child, 9);
				assertEquals(child, node.jjtGetChild(9));
		}
}

// SimpleNodeTest2.java
package com.soops.CEN4010.JMCA.JParser;

import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleNode}.
* It contains ten unit test cases for the {@link SimpleNode#jjtGetChild(int)} method.
*/
class SimpleNodeTest2 {
		
		/**
		* Test case 1 for {@link SimpleNode#jjtGetChild(int)}.
		* It tests the method with an invalid index.
		*/
		@Test
		void testJjtGetChild1() {
				SimpleNode node = new SimpleNode(1);
				SimpleNode child = new SimpleNode(2);
				node.jjtAddChild(child, 0);
				assertThrows(ArrayIndexOutOfBoundsException.class, () -> node.jjtGetChild(1));
		}
		
		/**
		* Test case 2 for {@link SimpleNode#jjtGetChild(int)}.
		* It tests the method with an invalid index.
		*/
		@Test
		void testJjtGetChild2() {
				SimpleNode node = new SimpleNode(1);
				SimpleNode child = new SimpleNode(2);
				node.jjtAddChild(child, 1);
				assertThrows(ArrayIndexOutOfBoundsException.class, () -> node.jjtGetChild(2));
		}
		
		/**
		* Test case 3 for {@link SimpleNode#jjtGetChild(int)}.
		* It tests the method with an invalid index.
		*/
		@Test
		void testJjtGetChild3() {
				SimpleNode node = new SimpleNode(1);
				SimpleNode child = new SimpleNode(2);
				node.jjtAddChild(child, 2);
				assertThrows(ArrayIndexOutOfBoundsException.class, () -> node.jjtGetChild(3));
		}
		
		/**
		* Test case 4 for {@link SimpleNode#jjtGetChild(int)}.
		* It tests the method with an invalid index.
		*/
		@Test
		void testJjtGetChild4() {
				SimpleNode node = new SimpleNode(1);
				SimpleNode child = new SimpleNode(2);
				node.jjtAddChild(child, 3);
				assertThrows(ArrayIndexOutOfBoundsException.class, () -> node.jjtGetChild(4));
		}
		
		/**
		*