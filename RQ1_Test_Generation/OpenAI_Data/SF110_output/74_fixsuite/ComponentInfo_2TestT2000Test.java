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
				
				ComponentInfo componentInfo3 = new ComponentInfo();
				componentInfo3.setId(3);
				componentInfo3.setName("name3");
				componentInfo3.setComponentType("componentType3");
				componentInfo3.setCategory("category3");
				componentInfo3.setAbbreviation("abbreviation3");
				componentInfo3.setNotRequiredXml(true);
				componentInfo3.setRequired(true);
				
				componentInfo.addComponent(componentInfo3, 2.0);
				
				ComponentInfo componentInfo4 = new ComponentInfo();
				componentInfo4.setId(4);
				componentInfo4.setName("name4");
				componentInfo4.setComponentType("componentType4");
				componentInfo4.setCategory("category4");
				componentInfo4.setAbbreviation("abbreviation4");
				componentInfo4.setNotRequiredXml(false);
				componentInfo4.setRequired(false);
				
				componentInfo.addComponent(componentInfo4, 3.0);
				
				ComponentInfo componentInfo5 = new ComponentInfo();
				componentInfo5.setId(5);
				componentInfo5.setName("name5");
				componentInfo5.setComponentType("componentType5");
				componentInfo5.setCategory("category5");
				componentInfo5.setAbbreviation("abbreviation5");
				componentInfo5.setNotRequiredXml(true);
				componentInfo5.setRequired(true);
				
				componentInfo.addComponent(componentInfo5, 4.0);
				
				ComponentInfo componentInfo6 = new ComponentInfo();
				componentInfo6.setId(6);
				componentInfo6.setName("name6");
				componentInfo6.setComponentType("componentType6");
				componentInfo6.setCategory("category6");
				componentInfo6.setAbbreviation("abbreviation6");
				componentInfo6.setNotRequiredXml(false);
				componentInfo6.setRequired(false);
				
				componentInfo.addComponent(componentInfo6, 5.0);
				
				ComponentInfo componentInfo7 = new ComponentInfo();
				componentInfo7.setId(7);
				componentInfo7.setName("name7");
				componentInfo7.setComponentType("componentType7");
				componentInfo7.setCategory("category7");
				componentInfo7.setAbbreviation("abbreviation7");
				componentInfo7.setNotRequiredXml(true);
				componentInfo7.setRequired(true);
				
				componentInfo.addComponent(componentInfo7, 6.0);
				
				ComponentInfo componentInfo8 = new ComponentInfo();
				componentInfo8.setId(8);
				componentInfo8.setName("name8");
				componentInfo8.setComponentType("componentType8");
				componentInfo8.setCategory("category8");
				componentInfo8.setAbbreviation("abbreviation8");
				componentInfo8.setNotRequiredXml(false);
				componentInfo8.setRequired(false);
				
				componentInfo.addComponent(componentInfo8, 7.0);
				
				ComponentInfo componentInfo9 = new ComponentInfo();
				componentInfo9.setId(9);
				componentInfo9.setName("name9");
				componentInfo9.setComponentType("componentType9");
				componentInfo9.setCategory("category9");
				componentInfo9.setAbbreviation("abbreviation9");
				componentInfo9.setNotRequiredXml(true);
				componentInfo9.setRequired(true);
				
				componentInfo.addComponent(componentInfo9, 8.0);
				
				ComponentInfo componentInfo10 = new ComponentInfo();
				componentInfo10.setId(10);
				componentInfo10.setName("name10");
				componentInfo10.setComponentType("componentType10");
				componentInfo10.setCategory("category10");
				componentInfo10.setAbbreviation("abbreviation10");
				componentInfo10.setNotRequiredXml(false);
				componentInfo10.setRequired(false);
				
				componentInfo.addComponent(componentInfo10, 9.0);
				
				ComponentInfo componentInfo11 = new ComponentInfo();
				componentInfo11.setId(11);
				componentInfo11.setName("name11");
				componentInfo11.setComponentType("componentType11");
				componentInfo11.setCategory("category11");
				componentInfo11.setAbbreviation("abbreviation11");
				componentInfo11.setNotRequiredXml(true);
				componentInfo11.setRequired(true);
				
				componentInfo.addComponent(componentInfo11, 10.0);
				
				ComponentInfo componentInfo12 = new ComponentInfo();
				componentInfo12.setId(12);
				componentInfo12.setName("name12");
				componentInfo12.setComponentType("componentType12");
				componentInfo12.setCategory("category12");
				componentInfo12.setAbbreviation("abbreviation12");
				componentInfo12.setNotRequiredXml(false);
				componentInfo12.setRequired(false);
				
				componentInfo.addComponent(componentInfo12, 11.0);
				
				ComponentInfo componentInfo13 = new ComponentInfo();
				componentInfo13.setId(13);
				componentInfo13.setName("name13");
				componentInfo13.setComponentType("componentType13");
				componentInfo13.setCategory("category13");
				componentInfo13.setAbbreviation("abbreviation13");
				componentInfo13.setNotRequiredXml(true);
				componentInfo