// ComponentInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ComponentInfo}.
* It contains ten unit test cases for the {@link ComponentInfo#getField(int)} method.
*/
class ComponentInfo_0Test {

		/**
		 * Test case 1 for method getField(int).
		 * 
		 * @see ComponentInfo#getField(int)
		 */
		@Test
		void testGetField_1() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.setName("name");
				componentInfo.setComponentType("componentType");
				componentInfo.setCategory("category");
				componentInfo.setId(1);
				componentInfo.setAbbreviation("abbreviation");
				componentInfo.setNotRequiredXml(true);
				componentInfo.setRequired(true);
				componentInfo.addField(new FieldInfo(), 1.0);
				componentInfo.addComponent(new ComponentInfo(), 1.0);
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setName("name");
				fieldInfo.setTagNumber(1);
				fieldInfo.setType("type");
				fieldInfo.setAbbreviation("abbreviation");
				fieldInfo.setDescription("description");
				fieldInfo.setEnumeration("enumeration");
				fieldInfo.setNotRequiredXml(true);
				fieldInfo.setRequired(true);
				fieldInfo.setGroup(new GroupInfo());
				componentInfo.addField(fieldInfo, 1.0);
				FieldInfo result = componentInfo.getField(1);
				assertEquals(fieldInfo, result);
		}
		
		/**
		 * Test case 2 for method getField(int).
		 * 
		 * @see ComponentInfo#getField(int)
		 */
		@Test
		void testGetField_2() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.setName("name");
				componentInfo.setComponentType("componentType");
				componentInfo.setCategory("category");
				componentInfo.setId(1);
				componentInfo.setAbbreviation("abbreviation");
				componentInfo.setNotRequiredXml(true);
				componentInfo.setRequired(true);
				componentInfo.addField(new FieldInfo(), 1.0);
				componentInfo.addComponent(new ComponentInfo(), 1.0);
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setName("name");
				fieldInfo.setTagNumber(1);
				fieldInfo.setType("type");
				fieldInfo.setAbbreviation("abbreviation");
				fieldInfo.setDescription("description");
				fieldInfo.setEnumeration("enumeration");
				fieldInfo.setNotRequiredXml(true);
				fieldInfo.setRequired(true);
				fieldInfo.setGroup(new GroupInfo());
				componentInfo.addField(fieldInfo, 1.0);
				FieldInfo result = componentInfo.getField(2);
				assertNull(result);
		}
		
		/**
		 * Test case 3 for method getField(int).
		 * 
		 * @see ComponentInfo#getField(int)
		 */
		@Test
		void testGetField_3() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.setName("name");
				componentInfo.setComponentType("componentType");
				componentInfo.setCategory("category");
				componentInfo.setId(1);
				componentInfo.setAbbreviation("abbreviation");
				componentInfo.setNotRequiredXml(true);
				componentInfo.setRequired(true);
				componentInfo.addField(new FieldInfo(), 1.0);
				componentInfo.addComponent(new ComponentInfo(), 1.0);
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setName("name");
				fieldInfo.setTagNumber(1);
				fieldInfo.setType("type");
				fieldInfo.setAbbreviation("abbreviation");
				fieldInfo.setDescription("description");
				fieldInfo.setEnumeration("enumeration");
				fieldInfo.setNotRequiredXml(true);
				fieldInfo.setRequired(true);
				fieldInfo.setGroup(new GroupInfo());
				componentInfo.addField(fieldInfo, 1.0);
				FieldInfo result = componentInfo.getField(0);
				assertNull(result);
		}
		
		/**
		 * Test case 4 for method getField(int).
		 * 
		 * @see ComponentInfo#getField(int)
		 */
		@Test
		void testGetField_4() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.setName("name");
				componentInfo.setComponentType("componentType");
				componentInfo.setCategory("category");
				componentInfo.setId(1);
				componentInfo.setAbbreviation("abbreviation");
				componentInfo.setNotRequiredXml(true);
				componentInfo.setRequired(true);
				componentInfo.addField(new FieldInfo(), 1.0);
				componentInfo.addComponent(new ComponentInfo(), 1.0);
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setName("name");
				fieldInfo.setTagNumber(1);
				fieldInfo.setType("type");
				fieldInfo.setAbbreviation("abbreviation");
				fieldInfo.setDescription("description");
				fieldInfo.setEnumeration("enumeration");
				fieldInfo.setNotRequiredXml(true);
				fieldInfo.setRequired(true);
				fieldInfo.setGroup(new GroupInfo());
				componentInfo.addField(fieldInfo, 1.0);
				FieldInfo result = componentInfo.getField(3);
				assertNull(result);
		}
		
		/**
		 * Test case 5 for method getField(int).
		 * 
		 * @see ComponentInfo#getField(int)
		 */
		@Test
		void testGetField_5() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.setName("name");
				componentInfo.setComponentType("componentType");
				componentInfo.setCategory("category");
				componentInfo.setId(1);
				componentInfo.setAbbreviation("abbreviation");
				componentInfo.setNotRequiredXml(true);
				componentInfo.setRequired(true);
				componentInfo.addField(new FieldInfo(), 1.0);
				componentInfo.addComponent(new ComponentInfo(), 1.0);
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setName("name");
				fieldInfo.setTagNumber(1);
				fieldInfo.setType("type");
				fieldInfo.setAbbreviation("abbreviation");
				fieldInfo.setDescription("description");
				fieldInfo.setEnumeration("enumeration");
				fieldInfo.setNotRequiredXml(true);
				fieldInfo.setRequired(true);
				fieldInfo.setGroup(new GroupInfo());
				componentInfo.addField(fieldInfo, 1.0);