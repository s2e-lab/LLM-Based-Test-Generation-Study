// PlayerTreeModel_2Test.java
package gui;

import javax.swing.tree.*;
import javax.swing.event.*;
import state.*;
import java.util.Vector;
import java.util.LinkedList;
import java.util.Observer;
import java.util.Observable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerTreeModel}.
* It contains ten unit test cases for the {@link PlayerTreeModel#getIndexOfChild(Object, Object)} method.
*/
class PlayerTreeModel_2Test {

		/**
		* Test case 1 for {@link PlayerTreeModel#getIndexOfChild(Object, Object)}.
		* This test case checks if the method returns -1 when the parent is null.
		*/
		@Test
		void testGetIndexOfChild_1() {
				PlayerTreeModel ptm = new PlayerTreeModel();
				assertEquals(-1, ptm.getIndexOfChild(null, null));
		}
		
		/**
		* Test case 2 for {@link PlayerTreeModel#getIndexOfChild(Object, Object)}.
		* This test case checks if the method returns -1 when the child is null.
		*/
		@Test
		void testGetIndexOfChild_2() {
				PlayerTreeModel ptm = new PlayerTreeModel();
				assertEquals(-1, ptm.getIndexOfChild(new Party(), null));
		}
		
		/**
		* Test case 3 for {@link PlayerTreeModel#getIndexOfChild(Object, Object)}.
		* This test case checks if the method returns -1 when the parent is not part of the model.
		*/
		@Test
		void testGetIndexOfChild_3() {
				PlayerTreeModel ptm = new PlayerTreeModel();
				assertEquals(-1, ptm.getIndexOfChild(new Party(), new Party()));
		}
		
		/**
		* Test case 4 for {@link PlayerTreeModel#getIndexOfChild(Object, Object)}.
		* This test case checks if the method returns -1 when the child is not part of the model.
		*/
		@Test
		void testGetIndexOfChild_4() {
				PlayerTreeModel ptm = new PlayerTreeModel();
				assertEquals(-1, ptm.getIndexOfChild(new Party(), new Party()));
		}
		
		/**
		* Test case 5 for {@link PlayerTreeModel#getIndexOfChild(Object, Object)}.
		* This test case checks if the method returns -1 when the parent is not part of the model.
		*/
		@Test
		void testGetIndexOfChild_5() {
				PlayerTreeModel ptm = new PlayerTreeModel();
				assertEquals(-1, ptm.getIndexOfChild(new Party(), new Party()));
		}
		
		/**
		* Test case 6 for {@link PlayerTreeModel#getIndexOfChild(Object, Object)}.
		* This test case checks if the method returns -1 when the child is not part of the model.
		*/
		@Test
		void testGetIndexOfChild_6() {
				PlayerTreeModel ptm = new PlayerTreeModel();
				assertEquals(-1, ptm.getIndexOfChild(new Party(), new Party()));
		}
		
		/**
		* Test case 7 for {@link PlayerTreeModel#getIndexOfChild(Object, Object)}.
		* This test case checks if the method returns -1 when the parent is not part of the model.
		*/
		@Test
		void testGetIndexOfChild_7() {
				PlayerTreeModel ptm = new PlayerTreeModel();
				assertEquals(-1, ptm.getIndexOfChild(new Party(), new Party()));
		}
		
		/**
		* Test case 8 for {@link PlayerTreeModel#getIndexOfChild(Object, Object)}.
		* This test case checks if the method returns -1 when the child is not part of the model.
		*/
		@Test
		void testGetIndexOfChild_8() {
				PlayerTreeModel ptm = new PlayerTreeModel();
				assertEquals(-1, ptm.getIndexOfChild(new Party(), new Party()));
		}
		
		/**
		* Test case 9 for {@link PlayerTreeModel#getIndexOfChild(Object, Object)}.
		* This test case checks if the method returns -1 when the parent is not part of the model.
		*/
		@Test
		void testGetIndexOfChild_9() {
				PlayerTreeModel ptm = new PlayerTreeModel();
				assertEquals(-1, ptm.getIndexOfChild(new Party(), new Party()));
		}
		
		/**
		* Test case 10 for {@link PlayerTreeModel#getIndexOfChild(Object, Object)}.
		* This test case checks if the method returns -1 when the child is not part of the model.
		*/
		@Test
		void testGetIndexOfChild_10() {
				PlayerTreeModel ptm = new PlayerTreeModel();
				assertEquals(-1, ptm.getIndexOfChild(new Party(), new Party()));
		}
}