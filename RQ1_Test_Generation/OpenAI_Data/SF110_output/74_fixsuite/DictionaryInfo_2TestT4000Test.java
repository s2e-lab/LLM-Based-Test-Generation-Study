// DictionaryInfo_2Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getComponent(int)} method.
*/
class DictionaryInfo_2Test {

		/**
		 * Test case 1 for method getComponent(int).
		 * 
		 * Test case 1 covers the following requirements:
		 * 
		 * 		- The method returns null if the dictionary is not loaded.
		 * 		- The method returns null if the dictionary is loaded but the component is not found.
		 * 
		 * Test case 1 is a negative test case.
		 */
		@Test
		void testGetComponent_1() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				assertNull(dictionaryInfo.getComponent(1));
				dictionaryInfo.incrementLoadCount();
				assertNull(dictionaryInfo.getComponent(1));
		}
		
		/**
		 * Test case 2 for method getComponent(int).
		 * 
		 * Test case 2 covers the following requirements:
		 * 
		 * 		- The method returns the component if the dictionary is loaded and the component is found.
		 * 
		 * Test case 2 is a positive test case.
		 */
		@Test
		void testGetComponent_2() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				ComponentInfo componentInfo = new ComponentInfo(1, "TestComponent");
				dictionaryInfo.addComponent(componentInfo);
				assertEquals(componentInfo, dictionaryInfo.getComponent(1));
		}
		
		/**
		 * Test case 3 for method getComponent(int).
		 * 
		 * Test case 3 covers the following requirements:
		 * 
		 * 		- The method returns the component if the dictionary is loaded and the component is found.
		 * 
		 * Test case 3 is a positive test case.
		 */
		@Test
		void testGetComponent_3() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				ComponentInfo componentInfo = new ComponentInfo(1, "TestComponent");
				dictionaryInfo.addComponent(componentInfo);
				assertEquals(componentInfo, dictionaryInfo.getComponent(1));
		}
		
		/**
		 * Test case 4 for method getComponent(int).
		 * 
		 * Test case 4 covers the following requirements:
		 * 
		 * 		- The method returns the component if the dictionary is loaded and the component is found.
		 * 
		 * Test case 4 is a positive test case.
		 */
		@Test
		void testGetComponent_4() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				ComponentInfo componentInfo = new ComponentInfo(1, "TestComponent");
				dictionaryInfo.addComponent(componentInfo);
				assertEquals(componentInfo, dictionaryInfo.getComponent(1));
		}
		
		/**
		 * Test case 5 for method getComponent(int).
		 * 
		 * Test case 5 covers the following requirements:
		 * 
		 * 		- The method returns the component if the dictionary is loaded and the component is found.
		 * 
		 * Test case 5 is a positive test case.
		 */
		@Test
		void testGetComponent_5() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				ComponentInfo componentInfo = new ComponentInfo(1, "TestComponent");
				dictionaryInfo.addComponent(componentInfo);
				assertEquals(componentInfo, dictionaryInfo.getComponent(1));
		}
		
		/**
		 * Test case 6 for method getComponent(int).
		 * 
		 * Test case 6 covers the following requirements:
		 * 
		 * 		- The method returns the component if the dictionary is loaded and the component is found.
		 * 
		 * Test case 6 is a positive test case.
		 */
		@Test
		void testGetComponent_6() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				ComponentInfo componentInfo = new ComponentInfo(1, "TestComponent");
				dictionaryInfo.addComponent(componentInfo);
				assertEquals(componentInfo, dictionaryInfo.getComponent(1));
		}
		
		/**
		 * Test case 7 for method getComponent(int).
		 * 
		 * Test case 7 covers the following requirements:
		 * 
		 * 		- The method returns the component if the dictionary is loaded and the component is found.
		 * 
		 * Test case 7 is a positive test case.
		 */
		@Test
		void testGetComponent_7() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				ComponentInfo componentInfo = new ComponentInfo(1, "TestComponent");
				dictionaryInfo.addComponent(componentInfo);
				assertEquals(componentInfo, dictionaryInfo.getComponent(1));
		}
		
		/**
		 * Test case 8 for method getComponent(int).
		 * 
		 * Test case 8 covers the following requirements:
		 * 
		 * 		- The method returns the component if the dictionary is loaded and the component is found.
		 * 
		 * Test case 8 is a positive test case.
		 */
		@Test
		void testGetComponent_8() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				ComponentInfo componentInfo = new ComponentInfo(1, "TestComponent");
				dictionaryInfo.addComponent(componentInfo);
				assertEquals(componentInfo, dictionaryInfo.getComponent(1));
		}
		
		/**
		 * Test case 9 for method getComponent(int).
		 * 
		 * Test case 9 covers the following requirements:
		 * 
		 * 		- The method returns the component if the dictionary is loaded and the component is found.
		 * 
		 * Test case 9 is a positive test case.
		 */
		@Test
		void testGetComponent_9() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				ComponentInfo componentInfo = new ComponentInfo(1, "TestComponent");
				dictionaryInfo.addComponent(componentInfo);
				assertEquals(componentInfo, dictionaryInfo.getComponent(1));
		}
		
		/**
		 * Test case 10 for method getComponent(int).
		 * 
		 * Test case 10 covers the following requirements:
		 * 
		 * 		- The method returns the component if the dictionary is loaded and the component is found.
		 * 
		 * Test case 10 is a positive test case.
		 */
		@Test
		void testGetComponent_10() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				ComponentInfo componentInfo = new ComponentInfo(1, "TestComponent");
				dictionaryInfo.addComponent(componentInfo);
				assertEquals(componentInfo, dictionaryInfo.getComponent(1));
		}
}

// DictionaryInfo_3Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getComponent(String)} method.
*/
class DictionaryInfo_3Test {
		
		/**
		 * Test case 1 for method getComponent(String).
		 * 
		 * Test case 1 covers the following requirements:
		 * 
		 * 		- The method returns null if the dictionary is not loaded.
		 * 		- The method returns null if the dictionary is loaded but the component is not found.
		 * 
		 * Test case 1 is a negative test case.
		 */
		@Test
		void testGetComponent_1() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				assertNull(dictionaryInfo.getComponent("TestComponent"));
				dictionaryInfo.incrementLoadCount();
				assertNull(dictionaryInfo.getComponent("TestComponent"));
		}
		
		/**
		 * Test case 2 for method getComponent(String).
		 * 
		 * Test case 2 covers the following requirements:
		 * 
		 * 		- The method returns the component if the dictionary is loaded and the component is found.
		 * 
		 * Test case 2 is a positive test case.
		 */
		@Test
		void testGetComponent_2() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				ComponentInfo componentInfo = new ComponentInfo(1, "TestComponent");
				dictionaryInfo.addComponent(componentInfo);
				assertEquals(componentInfo, dictionaryInfo.getComponent("TestComponent"));
		}
		
		/**
		 * Test case 3 for method getComponent(String).
		 * 
		 * Test case 3 covers the following requirements:
		 * 
		 * 		- The method returns the component if the dictionary is loaded and the component is found.
		 * 
		 * Test case 3 is a positive test case.
		 */
		@Test
		void testGetComponent_3() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				ComponentInfo componentInfo = new ComponentInfo(1, "TestComponent");
				dictionaryInfo.addComponent(componentInfo);
				assertEquals(componentInfo, dictionaryInfo.getComponent("TestComponent"));
		}
		
		/**
		 * Test case 4 for method getComponent(String).
		 * 
		 * Test case 4 covers the following requirements:
		 * 
		 * 		- The method returns the component if the dictionary is loaded and the component is found.
		 * 
		 * Test case 4 is a positive test case.
		 */
		@Test
		void testGetComponent_4() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				ComponentInfo componentInfo = new ComponentInfo(1, "TestComponent");
				dictionaryInfo.addComponent(componentInfo);
				assertEquals(componentInfo, dictionaryInfo.getComponent("TestComponent"));
		}
		
		/**
		 * Test case 5 for method getComponent(String).
		 * 
		 * Test case 5 covers the following requirements:
		 * 
		 * 		- The method returns the component if the dictionary is loaded and the component is found.
		 * 
		 * Test case 5 is a positive test case.
		 */
		@Test
		void testGetComponent_5() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				ComponentInfo componentInfo = new ComponentInfo(1, "TestComponent");
				dictionaryInfo.addComponent(componentInfo);
				assertEquals(componentInfo, dictionaryInfo.getComponent("TestComponent"));
		}
		
		/**
		 * Test case 6 for method getComponent(String).
		 * 
		 * Test case 6 covers the following requirements:
		 * 
		 * 		- The method returns the component if the dictionary is loaded and the component is found.
		 * 
		 * Test case 6 is a positive test case.
		 */
		@Test
		void testGetComponent_6() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoad