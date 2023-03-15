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
				
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setName("name");
				fieldInfo.setTagNumber(1);
				fieldInfo.setType("type");
				fieldInfo.setDescription("description");
				fieldInfo.setAbbreviation("abbreviation");
				fieldInfo.setNotRequiredXml(true);
				fieldInfo.setRequired(true);
				fieldInfo.setValue("value");
				fieldInfo.setEnumeration("enumeration");
				fieldInfo.setMinLength(1);
				fieldInfo.setMaxLength(1);
				fieldInfo.setMinValue("minValue");
				fieldInfo.setMaxValue("maxValue");
				fieldInfo.setMinInclusive(true);
				fieldInfo.setMaxInclusive(true);
				fieldInfo.setCharacterEncoding("characterEncoding");
				fieldInfo.setDataType("dataType");
				fieldInfo.setFormat("format");
				fieldInfo.setLengthId("lengthId");
				fieldInfo.setLengthUsage("lengthUsage");
				fieldInfo.setMaxOccurs("maxOccurs");
				fieldInfo.setMinOccurs("minOccurs");
				fieldInfo.setOrder("order");
				fieldInfo.setPresence("presence");
				fieldInfo.setText("text");
				fieldInfo.setType("type");
				fieldInfo.setUsageLength("usageLength");
				fieldInfo.setUsageType("usageType");
				fieldInfo.setValue("value");
				fieldInfo.setValueRef("valueRef");
				fieldInfo.setValueType("valueType");
				fieldInfo.setValueTypeId("valueTypeId");
				fieldInfo.setValueTypeVersion("valueTypeVersion");
				fieldInfo.setValueVersion("valueVersion");
				fieldInfo.setXmlAttribute(true);
				fieldInfo.setXmlElement(true);
				fieldInfo.setXmlEncoding("xmlEncoding");
				fieldInfo.setXmlNamespace("xmlNamespace");
				fieldInfo.setXmlPrefix("xmlPrefix");
				fieldInfo.setXmlType("xmlType");
				fieldInfo.setXmlValue("xmlValue");
				fieldInfo.setXmlValueRef("xmlValueRef");
				fieldInfo.setXmlValueType("xmlValueType");
				fieldInfo.setXmlValueTypeId("xmlValueTypeId");
				fieldInfo.setXmlValueTypeVersion("xmlValueTypeVersion");
				fieldInfo.setXmlValueVersion("xmlValueVersion");
				fieldInfo.setXmlVersion("xmlVersion");
				fieldInfo.setXmlVersionId("xmlVersionId");
				fieldInfo.setXmlVersionValue("xmlVersionValue");
				fieldInfo.setXmlVersionValueId("xmlVersionValueId");
				fieldInfo.setXmlVersionValueType("xmlVersionValueType");
				fieldInfo.setXmlVersionValueTypeId("xmlVersionValueTypeId");
				fieldInfo.setXmlVersionValueTypeVersion("xmlVersionValueTypeVersion");
				fieldInfo.setXmlVersionValueVersion("xmlVersionValueVersion");
				fieldInfo.setXmlVersionXmlAttribute(true);
				fieldInfo.setXmlVersionXmlElement(true);
				fieldInfo.setXmlVersionXmlEncoding("xmlVersionXmlEncoding");
				fieldInfo.setXmlVersionXmlNamespace("xmlVersionXmlNamespace");
				fieldInfo.setXmlVersionXmlPrefix("xmlVersionXmlPrefix");
				fieldInfo.setXmlVersionXmlType("xmlVersionXmlType");
				fieldInfo.setXmlVersionXmlValue("xmlVersionXmlValue");
				fieldInfo.setXmlVersionXmlValueRef("xmlVersionXmlValueRef");
				fieldInfo.setXmlVersionXmlValueType("xmlVersionXmlValueType");
				fieldInfo.setXmlVersionXmlValueTypeId("xmlVersionXmlValueTypeId");
				fieldInfo.setXmlVersionXmlValueTypeVersion("xmlVersionXmlValueTypeVersion");
				fieldInfo.setXmlVersionXmlValueVersion("xmlVersionXmlValueVersion");
				fieldInfo.setXmlVersionXmlVersion("xmlVersionXmlVersion");
				fieldInfo.setXmlVersionXmlVersionId("xmlVersionXmlVersionId");
				fieldInfo.setXmlVersionXmlVersionValue("xmlVersionXmlVersionValue");
				fieldInfo.setXmlVersionXmlVersionValueId("xmlVersionXmlVersionValueId");
				fieldInfo.setXmlVersionXmlVersionValueType("xmlVersionXmlVersionValueType");
				fieldInfo.setXmlVersionXmlVersionValueTypeId("xmlVersionXmlVersionValueTypeId");
				fieldInfo.setXmlVersionXmlVersionValueTypeVersion("xmlVersionXmlVersionValueTypeVersion");
				fieldInfo.setXmlVersionXmlVersionValueVersion("xmlVersionXmlVersionValueVersion");
				fieldInfo.setXmlVersionXmlVersionXmlAttribute(true);
				fieldInfo.setXmlVersionXmlVersionXmlElement(true);
				fieldInfo.setXmlVersionXmlVersionXmlEncoding("xmlVersionXmlVersionXmlEncoding");
				fieldInfo.setXmlVersionXmlVersionXmlNamespace("xmlVersionXmlVersionXmlNamespace");
				fieldInfo.setXmlVersionXmlVersionXmlPrefix("xmlVersionXmlVersionXmlPrefix");
				fieldInfo.setXmlVersionXmlVersionXmlType("xmlVersionXmlVersionXmlType");
				fieldInfo.setXmlVersionXmlVersionXmlValue("xmlVersionXmlVersionXmlValue");
				fieldInfo.setXmlVersionXmlVersionXmlValueRef("xmlVersionXmlVersionXmlValueRef");
				fieldInfo.setXmlVersionXmlVersionXmlValueType("xmlVersionXmlVersionXmlValueType");
				fieldInfo.setXmlVersionXmlVersionXmlValueTypeId("xmlVersionXmlVersionXmlValueTypeId");
				fieldInfo.setXmlVersionXmlVersionXmlValueTypeVersion("xmlVersionXmlVersionXmlValueTypeVersion");
				fieldInfo.setXmlVersionXmlVersionXmlValueVersion("xmlVersionXmlVersionXmlValueVersion");
				fieldInfo.setXmlVersionXmlVersionXmlVersion("xmlVersionXmlVersionXmlVersion");
				fieldInfo.setXmlVersionXmlVersionXmlVersionId("xmlVersionXmlVersionXmlVersionId");
				fieldInfo.setXmlVersionXmlVersionXmlVersionValue("xmlVersionXmlVersionXmlVersionValue");
				fieldInfo.setXmlVersionXmlVersionXmlVersionValueId("xmlVersionXmlVersionXmlVersionValueId");
				fieldInfo.setXmlVersionXmlVersionXmlVersionValueType("xmlVersionXmlVersionXmlVersionValueType");
				fieldInfo.setXmlVersionXmlVersionXmlVersionValueTypeId("xmlVersionXmlVersionXmlVersionValueTypeId");
				fieldInfo.setXmlVersionXmlVersionXmlVersionValueTypeVersion("xmlVersionXmlVersionXmlVersionValueTypeVersion");
				fieldInfo.setXmlVersionXmlVersionXmlVersionValueVersion("xmlVersionXmlVersionXmlVersionValueVersion");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlAttribute(true);
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlElement(true);
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlEncoding("xmlVersionXmlVersionXmlVersionXmlEncoding");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlNamespace("xmlVersionXmlVersionXmlVersionXmlNamespace");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlPrefix("xmlVersionXmlVersionXmlVersionXmlPrefix");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlType("xmlVersionXmlVersionXmlVersionXmlType");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlValue("xmlVersionXmlVersionXmlVersionXmlValue");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlValueRef("xmlVersionXmlVersionXmlVersionXmlValueRef");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlValueType("xmlVersionXmlVersionXmlVersionXmlValueType");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlValueTypeId("xmlVersionXmlVersionXmlVersionXmlValueTypeId");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlValueTypeVersion("xmlVersionXmlVersionXmlVersionXmlValueTypeVersion");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlValueVersion("xmlVersionXmlVersionXmlVersionXmlValueVersion");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersion("xmlVersionXmlVersionXmlVersionXmlVersion");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionId("xmlVersionXmlVersionXmlVersionXmlVersionId");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionValue("xmlVersionXmlVersionXmlVersionXmlVersionValue");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionValueId("xmlVersionXmlVersionXmlVersionXmlVersionValueId");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionValueType("xmlVersionXmlVersionXmlVersionXmlVersionValueType");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionValueTypeId("xmlVersionXmlVersionXmlVersionXmlVersionValueTypeId");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionValueTypeVersion("xmlVersionXmlVersionXmlVersionXmlVersionValueTypeVersion");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionValueVersion("xmlVersionXmlVersionXmlVersionXmlVersionValueVersion");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlAttribute(true);
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlElement(true);
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlEncoding("xmlVersionXmlVersionXmlVersionXmlVersionXmlEncoding");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlNamespace("xmlVersionXmlVersionXmlVersionXmlVersionXmlNamespace");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlPrefix("xmlVersionXmlVersionXmlVersionXmlVersionXmlPrefix");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlType("xmlVersionXmlVersionXmlVersionXmlVersionXmlType");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlValue("xmlVersionXmlVersionXmlVersionXmlVersionXmlValue");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlValueRef("xmlVersionXmlVersionXmlVersionXmlVersionXmlValueRef");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlValueType("xmlVersionXmlVersionXmlVersionXmlVersionXmlValueType");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlValueTypeId("xmlVersionXmlVersionXmlVersionXmlVersionXmlValueTypeId");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlValueTypeVersion("xmlVersionXmlVersionXmlVersionXmlVersionXmlValueTypeVersion");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlValueVersion("xmlVersionXmlVersionXmlVersionXmlVersionXmlValueVersion");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlVersion("xmlVersionXmlVersionXmlVersionXmlVersionXmlVersion");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlVersionId("xmlVersionXmlVersionXmlVersionXmlVersionXmlVersionId");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlVersionValue("xmlVersionXmlVersionXmlVersionXmlVersionXmlVersionValue");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlVersionValueId("xmlVersionXmlVersionXmlVersionXmlVersionXmlVersionValueId");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlVersionValueType("xmlVersionXmlVersionXmlVersionXmlVersionXmlVersionValueType");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlVersionValueTypeId("xmlVersionXmlVersionXmlVersionXmlVersionXmlVersionValueTypeId");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlVersionValueTypeVersion("xmlVersionXmlVersionXmlVersionXmlVersionXmlVersionValueTypeVersion");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlVersionValueVersion("xmlVersionXmlVersionXmlVersionXmlVersionXmlVersionValueVersion");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlVersionXmlAttribute(true);
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlVersionXmlElement(true);
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlVersionXmlEncoding("xmlVersionXmlVersionXmlVersionXmlVersionXmlVersionXmlEncoding");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlVersionXmlNamespace("xmlVersionXmlVersionXmlVersionXmlVersionXmlVersionXmlNamespace");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlVersionXmlPrefix("xmlVersionXmlVersionXmlVersionXmlVersionXmlVersionXmlPrefix");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlVersionXmlType("xmlVersionXmlVersionXmlVersionXmlVersionXmlVersionXmlType");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlVersionXmlValue("xmlVersionXmlVersionXmlVersionXmlVersionXmlVersionXmlValue");
				fieldInfo.setXmlVersionXmlVersionXmlVersionXmlVersionXmlVersionXmlValueRef("xmlVersionXmlVersionXmlVersionXmlVersionXml