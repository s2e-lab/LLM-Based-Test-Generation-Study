// TabbedPaneTest.java
package ghm.follow.gui;

import ghm.follow.config.FollowAppAttributes;
import java.awt.Component;
import java.awt.Container;
import java.io.File;
import javax.swing.JTabbedPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TabbedPane}.
* It contains ten unit test cases for the {@link TabbedPane#findComponentAt(int, int)} method.
*/
class TabbedPaneTest {

		private FollowAppAttributes attributes = null;
		private TabbedPane tabbedPane = null;
		
		public TabbedPaneTest() {
				attributes = new FollowAppAttributes();
				tabbedPane = new TabbedPane(attributes);
		}
		
		/**
		* Test of findComponentAt method, of class TabbedPane.
		*/
		@Test
		public void testFindComponentAt() {
				System.out.println("findComponentAt");
				
				// Test case 1
				int x = 0;
				int y = 0;
				Component expResult = tabbedPane;
				Component result = tabbedPane.findComponentAt(x, y);
				assertEquals(expResult, result);
				
				// Test case 2
				x = -1;
				y = -1;
				expResult = null;
				result = tabbedPane.findComponentAt(x, y);
				assertEquals(expResult, result);
				
				// Test case 3
				x = 1;
				y = 1;
				expResult = tabbedPane;
				result = tabbedPane.findComponentAt(x, y);
				assertEquals(expResult, result);
				
				// Test case 4
				x = -1;
				y = 1;
				expResult = null;
				result = tabbedPane.findComponentAt(x, y);
				assertEquals(expResult, result);
				
				// Test case 5
				x = 1;
				y = -1;
				expResult = null;
				result = tabbedPane.findComponentAt(x, y);
				assertEquals(expResult, result);
				
				// Test case 6
				x = 0;
				y = 1;
				expResult = tabbedPane;
				result = tabbedPane.findComponentAt(x, y);
				assertEquals(expResult, result);
				
				// Test case 7
				x = 1;
				y = 0;
				expResult = tabbedPane;
				result = tabbedPane.findComponentAt(x, y);
				assertEquals(expResult, result);
				
				// Test case 8
				x = 0;
				y = -1;
				expResult = null;
				result = tabbedPane.findComponentAt(x, y);
				assertEquals(expResult, result);
				
				// Test case 9
				x = -1;
				y = 0;
				expResult = null;
				result = tabbedPane.findComponentAt(x, y);
				assertEquals(expResult, result);
				
				// Test case 10
				x = -1;
				y = 1;
				expResult = null;
				result = tabbedPane.findComponentAt(x, y);
				assertEquals(expResult, result);
		}
}