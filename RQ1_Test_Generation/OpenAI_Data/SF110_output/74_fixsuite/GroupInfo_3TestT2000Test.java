// GroupInfo_3Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GroupInfo}.
* It contains ten unit test cases for the {@link GroupInfo#getComponent(String)} method.
*/
class GroupInfo_3Test {

		/**
		 * Test case 1 for method getComponent(String).
		 * 
		 * Test case 1 is a positive test case.
		 * 
		 * Test case 1 tests the normal case.
		 * 
		 * Test case 1 expects the method to return the component with the specified name.
		 */
		@Test
		void testGetComponent_1() {
				// Create a new GroupInfo object.
				GroupInfo groupInfo = new GroupInfo(new FieldInfo());
				
				// Create a new ComponentInfo object.
				ComponentInfo componentInfo = new ComponentInfo();
				
				// Set the name of the ComponentInfo object.
				componentInfo.setName("componentInfo");
				
				// Add the ComponentInfo object to the GroupInfo object.
				groupInfo.addComponent(componentInfo, 0.0);
				
				// Call the method to be tested.
				ComponentInfo result = groupInfo.getComponent("componentInfo");
				
				// Assert that the result is not null.
				assertNotNull(result);
				
				// Assert that the result is the same as the ComponentInfo object.
				assertSame(componentInfo, result);
		}
		
		/**
		 * Test case 2 for method getComponent(String).
		 * 
		 * Test case 2 is a negative test case.
		 * 
		 * Test case 2 tests the case where the specified name is null.
		 * 
		 * Test case 2 expects the method to return null.
		 */
		@Test
		void testGetComponent_2() {
				// Create a new GroupInfo object.
				GroupInfo groupInfo = new GroupInfo(new FieldInfo());
				
				// Create a new ComponentInfo object.
				ComponentInfo componentInfo = new ComponentInfo();
				
				// Set the name of the ComponentInfo object.
				componentInfo.setName("componentInfo");
				
				// Add the ComponentInfo object to the GroupInfo object.
				groupInfo.addComponent(componentInfo, 0.0);
				
				// Call the method to be tested.
				ComponentInfo result = groupInfo.getComponent(null);
				
				// Assert that the result is null.
				assertNull(result);
		}
		
		/**
		 * Test case 3 for method getComponent(String).
		 * 
		 * Test case 3 is a negative test case.
		 * 
		 * Test case 3 tests the case where the specified name is empty.
		 * 
		 * Test case 3 expects the method to return null.
		 */
		@Test
		void testGetComponent_3() {
				// Create a new GroupInfo object.
				GroupInfo groupInfo = new GroupInfo(new FieldInfo());
				
				// Create a new ComponentInfo object.
				ComponentInfo componentInfo = new ComponentInfo();
				
				// Set the name of the ComponentInfo object.
				componentInfo.setName("componentInfo");
				
				// Add the ComponentInfo object to the GroupInfo object.
				groupInfo.addComponent(componentInfo, 0.0);
				
				// Call the method to be tested.
				ComponentInfo result = groupInfo.getComponent("");
				
				// Assert that the result is null.
				assertNull(result);
		}
		
		/**
		 * Test case 4 for method getComponent(String).
		 * 
		 * Test case 4 is a negative test case.
		 * 
		 * Test case 4 tests the case where the specified name is a blank string.
		 * 
		 * Test case 4 expects the method to return null.
		 */
		@Test
		void testGetComponent_4() {
				// Create a new GroupInfo object.
				GroupInfo groupInfo = new GroupInfo(new FieldInfo());
				
				// Create a new ComponentInfo object.
				ComponentInfo componentInfo = new ComponentInfo();
				
				// Set the name of the ComponentInfo object.
				componentInfo.setName("componentInfo");
				
				// Add the ComponentInfo object to the GroupInfo object.
				groupInfo.addComponent(componentInfo, 0.0);
				
				// Call the method to be tested.
				ComponentInfo result = groupInfo.getComponent(" ");
				
				// Assert that the result is null.
				assertNull(result);
		}
		
		/**
		 * Test case 5 for method getComponent(String).
		 * 
		 * Test case 5 is a negative test case.
		 * 
		 * Test case 5 tests the case where the specified name is a string of spaces.
		 * 
		 * Test case 5 expects the method to return null.
		 */
		@Test
		void testGetComponent_5() {
				// Create a new GroupInfo object.
				GroupInfo groupInfo = new GroupInfo(new FieldInfo());
				
				// Create a new ComponentInfo object.
				ComponentInfo componentInfo = new ComponentInfo();
				
				// Set the name of the ComponentInfo object.
				componentInfo.setName("componentInfo");
				
				// Add the ComponentInfo object to the GroupInfo object.
				groupInfo.addComponent(componentInfo, 0.0);
				
				// Call the method to be tested.
				ComponentInfo result = groupInfo.getComponent("  ");
				
				// Assert that the result is null.
				assertNull(result);
		}
		
		/**
		 * Test case 6 for method getComponent(String).
		 * 
		 * Test case 6 is a negative test case.
		 * 
		 * Test case 6 tests the case where the specified name is a string of tabs.
		 * 
		 * Test case 6 expects the method to return null.
		 */
		@Test
		void testGetComponent_6() {
				// Create a new GroupInfo object.
				GroupInfo groupInfo = new GroupInfo(new FieldInfo());
				
				// Create a new ComponentInfo object.
				ComponentInfo componentInfo = new ComponentInfo();
				
				// Set the name of the ComponentInfo object.
				componentInfo.setName("componentInfo");
				
				// Add the ComponentInfo object to the GroupInfo object.
				groupInfo.addComponent(componentInfo, 0.0);
				
				// Call the method to be tested.
				ComponentInfo result = groupInfo.getComponent("\t\t");
				
				// Assert that the result is null.
				assertNull(result);
		}
		
		/**
		 * Test case 7 for method getComponent(String).
		 * 
		 * Test case 7 is a negative test case.
		 * 
		 * Test case 7 tests the case where the specified name is a string of newline characters.
		 * 
		 * Test case 7 expects the method to return null.
		 */
		@Test
		void testGetComponent_7() {
				// Create a new GroupInfo object.
		