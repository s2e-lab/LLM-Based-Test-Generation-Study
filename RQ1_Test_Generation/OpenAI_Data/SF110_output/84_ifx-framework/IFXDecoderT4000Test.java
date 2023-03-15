// IFXDecoderTest.java
package org.sourceforge.ifx.utils;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.sourceforge.ifx.basetypes.IFXString;
import org.sourceforge.ifx.basetypes.IBaseType;
import org.jdom.Element;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDecoder}.
* It contains ten unit test cases for the {@link IFXDecoder#decode(Element)} method.
*/
class IFXDecoderTest {

	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with no children.
	*/
	@Test
	void testDecodeElementWithNoChildren() throws Exception {
		Element element = new Element("IFX");
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(element);
		assertEquals("org.sourceforge.ifx.framework.IFX", ifxObject.getClass().getName());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with one child.
	*/
	@Test
	void testDecodeElementWithOneChild() throws Exception {
		Element element = new Element("IFX");
		Element childElement = new Element("SignonRq");
		element.addContent(childElement);
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(element);
		assertEquals("org.sourceforge.ifx.framework.IFX", ifxObject.getClass().getName());
		Method accessorMethod = getAccessor(ifxObject, childElement);
		Object retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with two children.
	*/
	@Test
	void testDecodeElementWithTwoChildren() throws Exception {
		Element element = new Element("IFX");
		Element childElement1 = new Element("SignonRq");
		Element childElement2 = new Element("SignonRs");
		element.addContent(childElement1);
		element.addContent(childElement2);
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(element);
		assertEquals("org.sourceforge.ifx.framework.IFX", ifxObject.getClass().getName());
		Method accessorMethod1 = getAccessor(ifxObject, childElement1);
		Object retValObj1 = accessorMethod1.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj1.getClass().getName());
		Method accessorMethod2 = getAccessor(ifxObject, childElement2);
		Object retValObj2 = accessorMethod2.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRs", retValObj2.getClass().getName());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with three children.
	*/
	@Test
	void testDecodeElementWithThreeChildren() throws Exception {
		Element element = new Element("IFX");
		Element childElement1 = new Element("SignonRq");
		Element childElement2 = new Element("SignonRs");
		Element childElement3 = new Element("BankingRq");
		element.addContent(childElement1);
		element.addContent(childElement2);
		element.addContent(childElement3);
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(element);
		assertEquals("org.sourceforge.ifx.framework.IFX", ifxObject.getClass().getName());
		Method accessorMethod1 = getAccessor(ifxObject, childElement1);
		Object retValObj1 = accessorMethod1.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj1.getClass().getName());
		Method accessorMethod2 = getAccessor(ifxObject, childElement2);
		Object retValObj2 = accessorMethod2.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRs", retValObj2.getClass().getName());
		Method accessorMethod3 = getAccessor(ifxObject, childElement3);
		Object retValObj3 = accessorMethod3.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.BankingRq", retValObj3.getClass().getName());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with four children.
	*/
	@Test
	void testDecodeElementWithFourChildren() throws Exception {
		Element element = new Element("IFX");
		Element childElement1 = new Element("SignonRq");
		Element childElement2 = new Element("SignonRs");
		Element childElement3 = new Element("BankingRq");
		Element childElement4 = new Element("BankingRs");
		element.addContent(childElement1);
		element.addContent(childElement2);
		element.addContent(childElement3);
		element.addContent(childElement4);
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(element);
		assertEquals("org.sourceforge.ifx.framework.IFX", ifxObject.getClass().getName());
		Method accessorMethod1 = getAccessor(ifxObject, childElement1);
		Object retValObj1 = accessorMethod1.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj1.getClass().getName());
		Method accessorMethod2 = getAccessor(ifxObject, childElement2);
		Object retValObj2 = accessorMethod2.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRs", retValObj2.getClass().getName());
		Method accessorMethod3 = getAccessor(ifxObject, childElement3);
		Object retValObj3 = accessorMethod3.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.BankingRq", retValObj3.getClass().getName());
		Method accessorMethod4 = getAccessor(ifxObject, childElement4);
		Object retValObj4 = accessorMethod4.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.BankingRs", retValObj4.getClass().getName());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with five children.
	*/
	@Test
	void testDecodeElementWithFiveChildren() throws Exception {
		Element element = new Element("IFX");
		Element childElement1 = new Element("SignonRq");
		Element childElement2 = new Element("SignonRs");
		Element childElement3 = new Element("BankingRq");
		Element childElement4 = new Element("BankingRs");
		Element childElement5 = new Element("BankingSvcRq");
		element.addContent(childElement1);
		element.addContent(childElement2);
		element.addContent(childElement3);
		element.addContent(childElement4);
		element.addContent(childElement5);
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(element);
		assertEquals("org.sourceforge.ifx.framework.IFX", ifxObject.getClass().getName());
		Method accessorMethod1 = getAccessor(ifxObject, childElement1);
		Object retValObj1 = accessorMethod1.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj1.getClass().getName());
		Method accessorMethod2 = getAccessor(ifxObject, childElement2);
		Object retValObj2 = accessorMethod2.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRs", retValObj2.getClass().getName());
		Method accessorMethod3 = getAccessor(ifxObject, childElement3);
		Object retValObj3 = accessorMethod3.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.BankingRq", retValObj3.getClass().getName());
		Method accessorMethod4 = getAccessor(ifxObject, childElement4);
		Object retValObj4 = accessorMethod4.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.BankingRs", retValObj4.getClass().getName());
		Method accessorMethod5 = getAccessor(ifxObject, childElement5);
		Object retValObj5 = accessorMethod5.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.BankingSvcRq", retValObj5.getClass().getName());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with six children.
	*/
	@Test
	void testDecodeElementWithSixChildren() throws Exception {
		Element element = new Element("IFX");
		Element childElement1 = new Element("SignonRq");
		Element childElement2 = new Element("SignonRs");
		Element childElement3 = new Element("BankingRq");
		Element childElement4 = new Element("BankingRs");
		Element childElement5 = new Element("BankingSvcRq");
		Element childElement6 = new Element("BankingSvcRs");
		element.addContent(childElement1);
		element.addContent(childElement2);
		element.addContent(childElement3);
		element.addContent(childElement4);
		element.addContent(childElement5);
		element.addContent(childElement6);
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(element);
		assertEquals("org.sourceforge.ifx.framework.IFX", ifxObject.getClass().getName());
		Method accessorMethod1 = getAccessor(ifxObject, childElement1);
		Object retValObj1 = accessorMethod1.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj1.getClass().getName());
		Method accessorMethod2 = getAccessor(ifxObject, childElement2);
		Object retValObj2 = accessorMethod2.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRs", retValObj2.getClass().getName());
		Method accessorMethod3 = getAccessor(ifxObject, childElement3);
		Object retValObj3 = accessorMethod3.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.BankingRq", retValObj3.getClass().getName());
		Method accessorMethod4 = getAccessor(ifxObject, childElement4);
		Object retValObj4 = accessorMethod4.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.BankingRs", retValObj4.getClass().getName());
		Method accessorMethod5 = getAccessor(ifxObject, childElement5);
		Object retValObj5 = accessorMethod5.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.BankingSvcRq", retValObj5.getClass().getName());
		Method accessorMethod6 = getAccessor(ifxObject, childElement6);
		Object retValObj6 = accessorMethod6.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.BankingSvcRs", retValObj6.getClass().getName());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with seven children.
	*/
	@Test
	void testDecodeElementWithSevenChildren() throws Exception {
		Element element = new Element("IFX");
		Element childElement1 = new Element("SignonRq");
		Element childElement2 = new Element("SignonRs");
		Element childElement3 = new Element("BankingRq");
		Element childElement4 = new Element("BankingRs");
		Element childElement5 = new Element("BankingSvcRq");
		Element childElement6 = new Element("BankingSvcRs");
		Element childElement7 = new Element("BankingSvcInfoRq");
		element.addContent(childElement1);
		element.addContent(childElement2);
		element.addContent(childElement3);
		element.addContent(childElement4);
		element.addContent(childElement5);
		element.addContent(childElement6);
		element.addContent(childElement7);
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(element);
		assertEquals("org.sourceforge.ifx.framework.IFX", ifxObject.getClass().getName());
		Method accessorMethod1 = getAccessor(ifxObject, childElement1);
		Object retValObj1 = accessorMethod1.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj1.getClass().getName());
		Method accessorMethod2 = getAccessor(ifxObject, childElement2);
		Object retValObj2 = accessorMethod2.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRs", retValObj2.getClass().getName());
		Method accessorMethod3 = getAccessor(ifxObject, childElement3);
		Object retValObj3 = accessorMethod3.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.BankingRq", retValObj3.getClass().getName());
		Method accessorMethod4 = getAccessor(ifxObject, childElement4);
		Object retValObj4 = accessorMethod4.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.BankingRs", retValObj4.getClass().getName());
		Method accessorMethod5 = getAccessor(ifxObject, childElement5);
		Object retValObj5 = accessorMethod5.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.BankingSvcRq", retValObj5.getClass().getName());
		Method accessorMethod6 = getAccessor(ifxObject, childElement6);
		Object retValObj6 = accessorMethod6.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.BankingSvcRs", retValObj6.getClass().getName());
		Method accessorMethod7 = getAccessor(ifxObject, childElement7);
		Object retValObj7 = accessorMethod7.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.