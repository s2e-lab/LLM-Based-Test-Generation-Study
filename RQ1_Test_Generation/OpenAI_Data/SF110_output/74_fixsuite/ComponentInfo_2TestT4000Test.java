// ComponentInfo_2Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ComponentInfo}.
* It contains ten unit test cases for the {@link ComponentInfo#getComponent(int)} method.
*/
class ComponentInfo_2Test {

		/**
		 * Test case 1 for method getComponent(int).
		 * 
		 * @see ComponentInfo#getComponent(int)
		 */
		@Test
		void testGetComponent_1() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.setId(1);
				componentInfo.setName("name");
				componentInfo.setComponentType("componentType");
				componentInfo.setCategory("category");
				componentInfo.setAbbreviation("abbreviation");
				componentInfo.setNotRequiredXml(true);
				componentInfo.setRequired(true);
				
				ComponentInfo componentInfo2 = new ComponentInfo();
				componentInfo2.setId(2);
				componentInfo2.setName("name2");
				componentInfo2.setComponentType("componentType2");
				componentInfo2.setCategory("category2");
				componentInfo2.setAbbreviation("abbreviation2");
				componentInfo2.setNotRequiredXml(false);
				componentInfo2.setRequired(false);
				
				componentInfo.addComponent(componentInfo2, 1.0);
				
				ComponentInfo result = componentInfo.getComponent(2);
				
				assertEquals(componentInfo2, result);
		}
		
		/**
		 * Test case 2 for method getComponent(int).
		 * 
		 * @see ComponentInfo#getComponent(int)
		 */
		@Test
		void testGetComponent_2() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.setId(1);
				componentInfo.setName("name");
				componentInfo.setComponentType("componentType");
				componentInfo.setCategory("category");
				componentInfo.setAbbreviation("abbreviation");
				componentInfo.setNotRequiredXml(true);
				componentInfo.setRequired(true);
				
				ComponentInfo componentInfo2 = new ComponentInfo();
				componentInfo2.setId(2);
				componentInfo2.setName("name2");
				componentInfo2.setComponentType("componentType2");
				componentInfo2.setCategory("category2");
				componentInfo2.setAbbreviation("abbreviation2");
				componentInfo2.setNotRequiredXml(false);
				componentInfo2.setRequired(false);
				
				componentInfo.addComponent(componentInfo2, 1.0);
				
				ComponentInfo result = componentInfo.getComponent(1);
				
				assertEquals(componentInfo, result);
		}
		
		/**
		 * Test case 3 for method getComponent(int).
		 * 
		 * @see ComponentInfo#getComponent(int)
		 */
		@Test
		void testGetComponent_3() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.setId(1);
				componentInfo.setName("name");
				componentInfo.setComponentType("componentType");
				componentInfo.setCategory("category");
				componentInfo.setAbbreviation("abbreviation");
				componentInfo.setNotRequiredXml(true);
				componentInfo.setRequired(true);
				
				ComponentInfo componentInfo2 = new ComponentInfo();
				componentInfo2.setId(2);
				componentInfo2.setName("name2");
				componentInfo2.setComponentType("componentType2");
				componentInfo2.setCategory("category2");
				componentInfo2.setAbbreviation("abbreviation2");
				componentInfo2.setNotRequiredXml(false);
				componentInfo2.setRequired(false);
				
				componentInfo.addComponent(componentInfo2, 1.0);
				
				ComponentInfo result = componentInfo.getComponent(3);
				
				assertNull(result);
		}
		
		/**
		 * Test case 4 for method getComponent(int).
		 * 
		 * @see ComponentInfo#getComponent(int)
		 */
		@Test
		void testGetComponent_4() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.setId(1);
				componentInfo.setName("name");
				componentInfo.setComponentType("componentType");
				componentInfo.setCategory("category");
				componentInfo.setAbbreviation("abbreviation");
				componentInfo.setNotRequiredXml(true);
				componentInfo.setRequired(true);
				
				ComponentInfo componentInfo2 = new ComponentInfo();
				componentInfo2.setId(2);
				componentInfo2.setName("name2");
				componentInfo2.setComponentType("componentType2");
				componentInfo2.setCategory("category2");
				componentInfo2.setAbbreviation("abbreviation2");
				componentInfo2.setNotRequiredXml(false);
				componentInfo2.setRequired(false);
				
				componentInfo.addComponent(componentInfo2, 1.0);
				
				ComponentInfo result = componentInfo.getComponent(0);
				
				assertNull(result);
		}
		
		/**
		 * Test case 5 for method getComponent(int).
		 * 
		 * @see ComponentInfo#getComponent(int)
		 */
		@Test
		void testGetComponent_5() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.setId(1);
				componentInfo.setName("name");
				componentInfo.setComponentType("componentType");
				componentInfo.setCategory("category");
				componentInfo.setAbbreviation("abbreviation");
				componentInfo.setNotRequiredXml(true);
				componentInfo.setRequired(true);
				
				ComponentInfo componentInfo2 = new ComponentInfo();
				componentInfo2.setId(2);
				componentInfo2.setName("name2");
				componentInfo2.setComponentType("componentType2");
				componentInfo2.setCategory("category2");
				componentInfo2.setAbbreviation("abbreviation2");
				componentInfo2.setNotRequiredXml(false);
				componentInfo2.setRequired(false);
				
				componentInfo.addComponent(componentInfo2, 1.0);
				
				ComponentInfo result = componentInfo.getComponent(2);
				
				assertEquals(componentInfo2, result);
		}
		
		/**
		 * Test case 6 for method getComponent(int).
		 * 
		 * @see ComponentInfo#getComponent(int)
		 */
		@Test
		void testGetComponent_6() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.setId(1);
				componentInfo.setName("name");
				componentInfo.setComponentType("componentType");
				componentInfo.setCategory("category");
				componentInfo.setAbbreviation("abbreviation");
				componentInfo.setNotRequiredXml(true);
				componentInfo.setRequired(true);
				
				ComponentInfo componentInfo2 = new ComponentInfo();
				componentInfo2.setId(2);
				componentInfo2.setName("name2");
				componentInfo2.setComponentType("componentType2");
				componentInfo2.setCategory("category2");
				componentInfo2.setAbbreviation("abbreviation2");
				componentInfo2.setNotRequiredXml(false);
				componentInfo2.setRequired(false);
				
				componentInfo.addComponent(componentInfo2, 1.0);
				
				ComponentInfo result = componentInfo.getComponent(1);
				
				assertEquals(componentInfo, result);
		}
		
		/**
		 * Test case 7 for method getComponent(int).
		 * 
		 * @see ComponentInfo#getComponent(int)
		 */
		@Test
		void testGetComponent_7() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.setId(1);
				componentInfo.setName("name");
				componentInfo.setComponentType("componentType");
				componentInfo.setCategory("category");
				componentInfo.setAbbreviation("abbreviation");
				componentInfo.setNotRequiredXml(true);
				componentInfo.setRequired(true);
				
				ComponentInfo componentInfo2 = new ComponentInfo();
				componentInfo2.setId(2);
				componentInfo2.setName("name2");
				componentInfo2.setComponentType("componentType2");
				componentInfo2.setCategory("category2");
				componentInfo2.setAbbreviation("abbreviation2");
				componentInfo2.setNotRequiredXml(false);
				componentInfo2.setRequired(false);
				
				componentInfo.addComponent(componentInfo2, 1.0);
				
				ComponentInfo result = componentInfo.getComponent(3);
				
				assertNull(result);
		}
		
		/**
		 * Test case 8 for method getComponent(int).
		 * 
		 * @see ComponentInfo#getComponent(int)
		 */
		@Test
		void testGetComponent_8() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.setId(1);
				componentInfo.setName("name");
				componentInfo.setComponentType("componentType");
				componentInfo.setCategory("category");
				componentInfo.setAbbreviation("abbreviation");
				componentInfo.setNotRequiredXml(true);
				componentInfo.setRequired(true);
				
				ComponentInfo componentInfo2 = new ComponentInfo();
				componentInfo2.setId(2);
				componentInfo2.setName("name2");
				componentInfo2.setComponentType("componentType2");
				componentInfo2.setCategory("category2");
				componentInfo2.setAbbreviation("abbreviation2");
				componentInfo2.setNotRequiredXml(false);
				componentInfo2.setRequired(false);
				
				componentInfo.addComponent(componentInfo2, 1.0);
				
				ComponentInfo result = componentInfo.getComponent(0);
				
				assertNull(result);
		}
		
		/**
		 * Test case 9 for method getComponent(int).
		 * 
		 * @see ComponentInfo#getComponent(int)
		 */
		@Test
		void testGetComponent_9() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.setId(1);
				componentInfo.setName("name");
				componentInfo.setComponentType("componentType");
				componentInfo.setCategory("category");
				componentInfo.setAbbreviation("abbreviation");
				componentInfo.setNotRequiredXml(true);
				componentInfo.setRequired(true);
				
				ComponentInfo componentInfo2 = new ComponentInfo();
				componentInfo2.setId(2);
				componentInfo2.setName("name2");
				componentInfo2.setComponentType("componentType2");
				componentInfo2.setCategory("category2");
				componentInfo2.setAbbreviation("abbreviation2");
				componentInfo2.setNotRequiredXml(false);
				componentInfo2.setRequired(false);
				
				componentInfo.addComponent(componentInfo2, 1.0);
				
				ComponentInfo result = componentInfo.getComponent(2);
				
				assertEquals(componentInfo2, result);
		}
		
		/**
		 * Test case 10 for method getComponent(int).
		 * 
		 * @see ComponentInfo#getComponent(int)
		 */
		@Test
		void testGetComponent_10() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.setId(1);
				componentInfo.setName("name");
				componentInfo.setComponentType("componentType");
				componentInfo.setCategory("category");
				componentInfo.setAbbreviation("abbreviation");
				componentInfo.setNotRequiredXml(true);
				componentInfo.setRequired(true);
				
				ComponentInfo componentInfo2 = new ComponentInfo();
				componentInfo2.setId(2);
				componentInfo2.setName("name2");
				componentInfo2.setComponentType("componentType2");
				componentInfo2.setCategory("category2");
				componentInfo2.setAbbreviation("abbreviation2");
				componentInfo2.setNotRequiredXml(false);
				componentInfo2.setRequired(false);
				
				componentInfo.addComponent(componentInfo2, 1.0);
				
				ComponentInfo result = componentInfo.getComponent(1);
				
				assertEquals(componentInfo, result);
		}
}

// ComponentInfo_3Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ComponentInfo}.
* It contains ten unit test cases for the {@link ComponentInfo#getComponent(String)} method.
*/
class ComponentInfo_3Test {
		
		/**
		 * Test case 1 for method getComponent(String).
		 * 
		 * @see ComponentInfo#getComponent(String)
		 */
		@Test
		void testGetComponent_1() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.setId(1);
				componentInfo.setName("name");
				componentInfo.setComponentType("componentType");
				componentInfo.setCategory("category");
				componentInfo.set