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
				componentInfo.setName("name");
				componentInfo.setComponentType("componentType");
				componentInfo.setCategory("category");
				componentInfo.setId(1);
				componentInfo.setAbbreviation("abbreviation");
				componentInfo.setNotRequiredXml(true);
				componentInfo.setRequired(true);
				
				FieldInfo fieldInfo1 = new FieldInfo();
				fieldInfo1.setName("name1");
				fieldInfo1.setTagNumber(1);
				fieldInfo1.setType("type1");
				fieldInfo1.setDescription("description1");
				fieldInfo1.setAbbreviation("abbreviation1");
				fieldInfo1.setNotRequiredXml(true);
				fieldInfo1.setRequired(true);
				fieldInfo1.setValue("value1");
				fieldInfo1.setEnumeration("enumeration1");
				fieldInfo1.setMinLength(1);
				fieldInfo1.setMaxLength(1);
				fieldInfo1.setMinValue("minValue1");
				fieldInfo1.setMaxValue("maxValue1");
				fieldInfo1.setMinInclusive(true);
				fieldInfo1.setMaxInclusive(true);
				fieldInfo1.setCharacterEncoding("characterEncoding1");
				fieldInfo1.setDataType("dataType1");
				fieldInfo1.setSemanticType("semanticType1");
				fieldInfo1.setPresence("presence1");
				fieldInfo1.setFixVersion("fixVersion1");
				fieldInfo1.setComponentType("componentType1");
				fieldInfo1.setCategory("category1");
				fieldInfo1.setAbbreviation("abbreviation1");
				fieldInfo1.setNotRequiredXml(true);
				fieldInfo1.setRequired(true);
				fieldInfo1.setValue("value1");
				fieldInfo1.setEnumeration("enumeration1");
				fieldInfo1.setMinLength(1);
				fieldInfo1.setMaxLength(1);
				fieldInfo1.setMinValue("minValue1");
				fieldInfo1.setMaxValue("maxValue1");
				fieldInfo1.setMinInclusive(true);
				fieldInfo1.setMaxInclusive(true);
				fieldInfo1.setCharacterEncoding("characterEncoding1");
				fieldInfo1.setDataType("dataType1");
				fieldInfo1.setSemanticType("semanticType1");
				fieldInfo1.setPresence("presence1");
				fieldInfo1.setFixVersion("fixVersion1");
				fieldInfo1.setComponentType("componentType1");
				fieldInfo1.setCategory("category1");
				fieldInfo1.setAbbreviation("abbreviation1");
				fieldInfo1.setNotRequiredXml(true);
				fieldInfo1.setRequired(true);
				fieldInfo1.setValue("value1");
				fieldInfo1.setEnumeration("enumeration1");
				fieldInfo1.setMinLength(1);
				fieldInfo1.setMaxLength(1);
				fieldInfo1.setMinValue("minValue1");
				fieldInfo1.setMaxValue("maxValue1");
				fieldInfo1.setMinInclusive(true);
				fieldInfo1.setMaxInclusive(true);
				fieldInfo1.setCharacterEncoding("characterEncoding1");
				fieldInfo1.setDataType("dataType1");
				fieldInfo1.setSemanticType("semanticType1");
				fieldInfo1.setPresence("presence1");
				fieldInfo1.setFixVersion("fixVersion1");
				fieldInfo1.setComponentType("componentType1");
				fieldInfo1.setCategory("category1");
				fieldInfo1.setAbbreviation("abbreviation1");
				fieldInfo1.setNotRequiredXml(true);
				fieldInfo1.setRequired(true);
				fieldInfo1.setValue("value1");
				fieldInfo1.setEnumeration("enumeration1");
				fieldInfo1.setMinLength(1);
				fieldInfo1.setMaxLength(1);
				fieldInfo1.setMinValue("minValue1");
				fieldInfo1.setMaxValue("maxValue1");
				fieldInfo1.setMinInclusive(true);
				fieldInfo1.setMaxInclusive(true);
				fieldInfo1.setCharacterEncoding("characterEncoding1");
				fieldInfo1.setDataType("dataType1");
				fieldInfo1.setSemanticType("semanticType1");
				fieldInfo1.setPresence("presence1");
				fieldInfo1.setFixVersion("fixVersion1");
				fieldInfo1.setComponentType("componentType1");
				fieldInfo1.setCategory("category1");
				fieldInfo1.setAbbreviation("abbreviation1");
				fieldInfo1.setNotRequiredXml(true);
				fieldInfo1.setRequired(true);
				fieldInfo1.setValue("value1");
				fieldInfo1.setEnumeration("enumeration1");
				fieldInfo1.setMinLength(1);
				fieldInfo1.setMaxLength(1);
				fieldInfo1.setMinValue("minValue1");
				fieldInfo1.setMaxValue("maxValue1");
				fieldInfo1.setMinInclusive(true);
				fieldInfo1.setMaxInclusive(true);
				fieldInfo1.setCharacterEncoding("characterEncoding1");
				fieldInfo1.setDataType("dataType1");
				fieldInfo1.setSemanticType("semanticType1");
				fieldInfo1.setPresence("presence1");
				fieldInfo1.setFixVersion("fixVersion1");
				fieldInfo1.setComponentType("componentType1");
				fieldInfo1.setCategory("category1");
				fieldInfo1.setAbbreviation("abbreviation1");
				fieldInfo1.setNotRequiredXml(true);
				fieldInfo1.setRequired(true);
				fieldInfo1.setValue("value1");
				fieldInfo1.setEnumeration("enumeration1");
				fieldInfo1.setMinLength(1);
				fieldInfo1.setMaxLength(1);
				fieldInfo1.setMinValue("minValue1");
				fieldInfo1.setMaxValue("maxValue1");
				fieldInfo1.setMinInclusive(true);
				fieldInfo1.setMaxInclusive(true);
				fieldInfo1.setCharacterEncoding("characterEncoding1");
				fieldInfo1.setDataType("dataType1");
				fieldInfo1.setSemanticType("semanticType1");
				fieldInfo1.