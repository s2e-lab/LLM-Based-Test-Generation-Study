// XmlElement_12Test.java
package com.allenstudio.ir.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlElement}.
* It contains ten unit test cases for the {@link XmlElement#clone()} method.
*/
class XmlElement_12Test {

	/**
	 * Test case for {@link XmlElement#clone()}.
	 * <p>
	 * Test case for the case that the <code>XmlElement</code> object to be cloned is null.
	 * <p>
	 * Expected result: the cloned object is null.
	 */
	@Test
	void testClone_Null() {
		XmlElement xmlElement = null;
		XmlElement clone = (XmlElement) xmlElement.clone();
		assertNull(clone);
	}
	
	/**
	 * Test case for {@link XmlElement#clone()}.
	 * <p>
	 * Test case for the case that the <code>XmlElement</code> object to be cloned has no sub elements.
	 * <p>
	 * Expected result: the cloned object is not null and has the same name, data and attributes as the original object.
	 */
	@Test
	void testClone_NoSubElements() {
		XmlElement xmlElement = new XmlElement("name");
		xmlElement.setData("data");
		Hashtable<String, String> attributes = new Hashtable<String, String>();
		attributes.put("key1", "value1");
		attributes.put("key2", "value2");
		xmlElement.setAttributes(attributes);
		XmlElement clone = (XmlElement) xmlElement.clone();
		assertNotNull(clone);
		assertEquals(xmlElement.getName(), clone.getName());
		assertEquals(xmlElement.getData(), clone.getData());
		assertEquals(xmlElement.getAttributes(), clone.getAttributes());
	}
	
	/**
	 * Test case for {@link XmlElement#clone()}.
	 * <p>
	 * Test case for the case that the <code>XmlElement</code> object to be cloned has one sub element.
	 * <p>
	 * Expected result: the cloned object is not null and has the same name, data and attributes as the original object.
	 * The cloned object has one sub element which is a clone of the sub element of the original object.
	 */
	@Test
	void testClone_OneSubElement() {
		XmlElement xmlElement = new XmlElement("name");
		xmlElement.setData("data");
		Hashtable<String, String> attributes = new Hashtable<String, String>();
		attributes.put("key1", "value1");
		attributes.put("key2", "value2");
		xmlElement.setAttributes(attributes);
		XmlElement subElement = new XmlElement("subName");
		subElement.setData("subData");
		Hashtable<String, String> subAttributes = new Hashtable<String, String>();
		subAttributes.put("subKey1", "subValue1");
		subAttributes.put("subKey2", "subValue2");
		subElement.setAttributes(subAttributes);
		xmlElement.addSubElement(subElement);
		XmlElement clone = (XmlElement) xmlElement.clone();
		assertNotNull(clone);
		assertEquals(xmlElement.getName(), clone.getName());
		assertEquals(xmlElement.getData(), clone.getData());
		assertEquals(xmlElement.getAttributes(), clone.getAttributes());
		assertEquals(xmlElement.getElements().size(), clone.getElements().size());
		assertEquals(xmlElement.getElements().get(0), clone.getElements().get(0));
	}
	
	/**
	 * Test case for {@link XmlElement#clone()}.
	 * <p>
	 * Test case for the case that the <code>XmlElement</code> object to be cloned has two sub elements.
	 * <p>
	 * Expected result: the cloned object is not null and has the same name, data and attributes as the original object.
	 * The cloned object has two sub elements which are clones of the sub elements of the original object.
	 */
	@Test
	void testClone_TwoSubElements() {
		XmlElement xmlElement = new XmlElement("name");
		xmlElement.setData("data");
		Hashtable<String, String> attributes = new Hashtable<String, String>();
		attributes.put("key1", "value1");
		attributes.put("key2", "value2");
		xmlElement.setAttributes(attributes);
		XmlElement subElement1 = new XmlElement("subName1");
		subElement1.setData("subData1");
		Hashtable<String, String> subAttributes1 = new Hashtable<String, String>();
		subAttributes1.put("subKey1", "subValue1");
		subAttributes1.put("subKey2", "subValue2");
		subElement1.setAttributes(subAttributes1);
		xmlElement.addSubElement(subElement1);
		XmlElement subElement2 = new XmlElement("subName2");
		subElement2.setData("subData2");
		Hashtable<String, String> subAttributes2 = new Hashtable<String, String>();
		subAttributes2.put("subKey3", "subValue3");
		subAttributes2.put("subKey4", "subValue4");
		subElement2.setAttributes(subAttributes2);
		xmlElement.addSubElement(subElement2);
		XmlElement clone = (XmlElement) xmlElement.clone();
		assertNotNull(clone);
		assertEquals(xmlElement.getName(), clone.getName());
		assertEquals(xmlElement.getData(), clone.getData());
		assertEquals(xmlElement.getAttributes(), clone.getAttributes());
		assertEquals(xmlElement.getElements().size(), clone.getElements().size());
		assertEquals(xmlElement.getElements().get(0), clone.getElements().get(0));
		assertEquals(xmlElement.getElements().get(1), clone.getElements().get(1));
	}
	
	/**
	 * Test case for {@link XmlElement#clone()}.
	 * <p>
	 * Test case for the case that the <code>XmlElement</code> object to be cloned has one sub element which has one sub element.
	 * <p>
	 * Expected result: the cloned object is not null and has the same name, data and attributes as the original object.
	 * The cloned object has one sub element which is a clone of the sub element of the original object.
	 * The sub element of the cloned object has one sub element which is a clone of the sub element of the sub element of the original object.
	 */
	@Test
	void testClone_OneSubElement_OneSubElement() {
		XmlElement xmlElement = new XmlElement("name");
		xmlElement.setData("data");
		Hashtable<String, String> attributes = new Hashtable<String, String>();
		attributes.put("key1", "value1");
		attributes.put("key2", "value2");
		xmlElement.setAttributes(attributes);
		XmlElement subElement1 = new XmlElement("subName1");
		subElement1.setData("subData1");
		Hashtable<String, String> subAttributes1 = new Hashtable<String, String>();
		subAttributes1.put("subKey1", "subValue1");
		subAttributes1.put("subKey2", "subValue2");
		subElement1.setAttributes(subAttributes1);
		xmlElement.addSubElement(subElement1);
		XmlElement subElement2 = new XmlElement("subName2");
		subElement2.setData("subData2");
		Hashtable<String, String> subAttributes2 = new Hashtable<String, String>();
		subAttributes2.put("subKey3", "subValue3");
		subAttributes2.put("subKey4", "subValue4");
		subElement2.setAttributes(subAttributes2);
