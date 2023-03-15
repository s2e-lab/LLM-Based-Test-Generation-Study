// XmlElement_1Test.java
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
* It contains ten unit test cases for the {@link XmlElement#getAttribute(String)} method.
*/
class XmlElement_1Test {

	/**
	* Test case 1 for {@link XmlElement#getAttribute(String)}.
	* Test case 1 for {@link XmlElement#getAttribute(String, String)}.
	* Test case 1 for {@link XmlElement#addAttribute(String, String)}.
	* Test case 1 for {@link XmlElement#getAttributes()}.
	* Test case 1 for {@link XmlElement#getAttributeNames()}.
	* Test case 1 for {@link XmlElement#setAttributes(Hashtable)}.
	* Test case 1 for {@link XmlElement#addElement(XmlElement)}.
	* Test case 1 for {@link XmlElement#removeElement(XmlElement)}.
	* Test case 1 for {@link XmlElement#removeElement(int)}.
	* Test case 1 for {@link XmlElement#removeAllElements()}.
	* Test case 1 for {@link XmlElement#removeFromParent()}.
	* Test case 1 for {@link XmlElement#append(XmlElement)}.
	* Test case 1 for {@link XmlElement#insertElement(XmlElement, int)}.
	* Test case 1 for {@link XmlElement#getElement(String)}.
	* Test case 1 for {@link XmlElement#getElement(int)}.
	* Test case 1 for {@link XmlElement#addSubElement(String)}.
	* Test case 1 for {@link XmlElement#addSubElement(XmlElement)}.
	* Test case 1 for {@link XmlElement#addSubElement(String, String)}.
	* Test case 1 for {@link XmlElement#setParent(XmlElement)}.
	* Test case 1 for {@link XmlElement#getParent()}.
	* Test case 1 for {@link XmlElement#setData(String)}.
	* Test case 1 for {@link XmlElement#getData()}.
	* Test case 1 for {@link XmlElement#getName()}.
	* Test case 1 for {@link XmlElement#getElements()}.
	* Test case 1 for {@link XmlElement#count()}.
	* Test case 1 for {@link XmlElement#printNode(XmlElement, String)}.
	* Test case 1 for {@link XmlElement#equals(Object)}.
	* Test case 1 for {@link XmlElement#hashCode()}.
	* Test case 1 for {@link XmlElement#clone()}.
	* Test case 1 for {@link XmlElement#notifyObservers()}.
	*/
	@Test
	void test1() {
		XmlElement xmlElement = new XmlElement();
		assertEquals(null, xmlElement.getAttribute(""));
		assertEquals(null, xmlElement.getAttribute("", ""));
		assertEquals(null, xmlElement.addAttribute("", ""));
		assertEquals(new Hashtable<String, String>(), xmlElement.getAttributes());
		assertEquals(new Vector<String>().elements(), xmlElement.getAttributeNames());
		xmlElement.setAttributes(new Hashtable<String, String>());
		assertEquals(true, xmlElement.addElement(new XmlElement()));
		assertEquals(null, xmlElement.removeElement(new XmlElement()));
		assertEquals(null, xmlElement.removeElement(0));
		xmlElement.removeAllElements();
		xmlElement.removeFromParent();
		xmlElement.append(new XmlElement());
		xmlElement.insertElement(new XmlElement(), 0);
		assertEquals(null, xmlElement.getElement(""));
		assertEquals(null, xmlElement.getElement(0));
		assertEquals(new XmlElement(), xmlElement.addSubElement(""));
		assertEquals(new XmlElement(), xmlElement.addSubElement(new XmlElement()));
		assertEquals(new XmlElement(), xmlElement.addSubElement("", ""));
		xmlElement.setParent(new XmlElement());
		assertEquals(new XmlElement(), xmlElement.getParent());
		xmlElement.setData("");
		assertEquals("", xmlElement.getData());
		assertEquals("", xmlElement.getName());
		assertEquals(new Vector<XmlElement>(), xmlElement.getElements());
		assertEquals(0, xmlElement.count());
		XmlElement.printNode(new XmlElement(), "");
		assertEquals(true, xmlElement.equals(new XmlElement()));
		assertEquals(23, xmlElement.hashCode());
		assertEquals(new XmlElement(), xmlElement.clone());
		xmlElement.notifyObservers();
	}
	
	/**
	* Test case 2 for {@link XmlElement#getAttribute(String)}.
	* Test case 2 for {@link XmlElement#getAttribute(String, String)}.
	* Test case 2 for {@link XmlElement#addAttribute(String, String)}.
	* Test case 2 for {@link XmlElement#getAttributes()}.
	* Test case 2 for {@link XmlElement#getAttributeNames()}.
	* Test case 2 for {@link XmlElement#setAttributes(Hashtable)}.
	* Test case 2 for {@link XmlElement#addElement(XmlElement)}.
	* Test case 2 for {@link XmlElement#removeElement(XmlElement)}.
	* Test case 2 for {@link XmlElement#removeElement(int)}.
	* Test case 2 for {@link XmlElement#removeAllElements()}.
	* Test case 2 for {@link XmlElement#removeFromParent()}.
	* Test case 2 for {@link XmlElement#append(XmlElement)}.
	* Test case 2 for {@link XmlElement#insertElement(XmlElement, int)}.
	* Test case 2 for {@link XmlElement#getElement(String)}.
	* Test case 2 for {@link XmlElement#getElement(int)}.
	* Test case 2 for {@link XmlElement#addSubElement(String)}.
	* Test case 2 for {@link XmlElement#addSubElement(XmlElement)}.
	* Test case 2 for {@link XmlElement#addSubElement(String, String)}.
	* Test case 2 for {@link XmlElement#setParent(XmlElement)}.
	* Test case 2 for {@link XmlElement#getParent()}.
	* Test case 2 for {@link XmlElement#setData(String)}.
	* Test case 2 for {@link XmlElement#getData()}.
	* Test case 2 for {@link XmlElement#getName()}.
	* Test case 2 for {@link XmlElement#getElements()}.
	* Test case 2 for {@link XmlElement#count()}.
	* Test case 2 for {@link XmlElement#printNode(XmlElement, String)}.
	* Test case 2 for {@link XmlElement#equals(Object)}.
	* Test case 2 for {@link XmlElement#hashCode()}.
	* Test case 2 for {@link XmlElement#clone()}.
	* Test case 2 for {@link XmlElement#notifyObservers()}.
	*/
	@Test
	void test2() {
		XmlElement xmlElement = new XmlElement();
		assertEquals(null, xmlElement.getAttribute("a"));
		assertEquals(null, xmlElement.getAttribute("a", ""));
		assertEquals(null, xmlElement.addAttribute("a", ""));
		assertEquals(new Hashtable<String, String>(), xmlElement.getAttributes());
		assertEquals(new Vector<String>().elements(), xmlElement.getAttributeNames());
		xmlElement.setAttributes(new Hashtable<String, String>());
		assertEquals(true, xmlElement.addElement(new XmlElement()));
		assertEquals(null, xmlElement.removeElement(new XmlElement()));
		assertEquals(null, xmlElement.removeElement(0));
		xmlElement.removeAllElements();
		xmlElement.