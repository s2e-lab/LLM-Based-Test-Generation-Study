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

    private ResourceBundle bundle;

    /**
    * Creates an IFXDecoderTest object.
    */
    public IFXDecoderTest() {
        try {
            bundle = ResourceBundle.getBundle("org.sourceforge.ifx.framework.elementmap");
        } catch (MissingResourceException e) {
            e.printStackTrace();
            // :NOTE: should never happen
        }
    }

    /**
    * Tests the decode method for a simple bean.
    */
    @Test
    void testDecodeSimpleBean() {
        try {
            String beanClassName = "org.sourceforge.ifx.basetypes.IFXString";
            IFXObject obj = (IFXObject) Class.forName(beanClassName).newInstance();
            Element element = new Element("IFXString");
            element.setText("Hello World");
            IFXObject decodedObj = new IFXDecoder().decode(element);
            assertEquals(obj, decodedObj);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    /**
    * Tests the decode method for a bean with a single child.
    */
    @Test
    void testDecodeSingleChildBean() {
        try {
            String beanClassName = "org.sourceforge.ifx.basetypes.IFXString";
            IFXObject obj = (IFXObject) Class.forName(beanClassName).newInstance();
            Element element = new Element("IFXString");
            Element childElement = new Element("IFXString");
            childElement.setText("Hello World");
            element.addContent(childElement);
            IFXObject decodedObj = new IFXDecoder().decode(element);
            assertEquals(obj, decodedObj);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    /**
    * Tests the decode method for a bean with a single child.
    */
    @Test
    void testDecodeSingleChildBeanWithId() {
        try {
            String beanClassName = "org.sourceforge.ifx.basetypes.IFXString";
            IFXObject obj = (IFXObject) Class.forName(beanClassName).newInstance();
            Element element = new Element("IFXString");
            element.setAttribute("Id", "12345");
            Element childElement = new Element("IFXString");
            childElement.setText("Hello World");
            element.addContent(childElement);
            IFXObject decodedObj = new IFXDecoder().decode(element);
            assertEquals(obj, decodedObj);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    /**
    * Tests the decode method for a bean with a single child.
    */
    @Test
    void testDecodeSingleChildBeanWithIdAndOtherAttributes() {
        try {
            String beanClassName = "org.sourceforge.ifx.basetypes.IFXString";
            IFXObject obj = (IFXObject) Class.forName(beanClassName).newInstance();
            Element element = new Element("IFXString");
            element.setAttribute("Id", "12345");
            element.setAttribute("other", "other");
            Element childElement = new Element("IFXString");
            childElement.setText("Hello World");
            element.addContent(childElement);
            IFXObject decodedObj = new IFXDecoder().decode(element);
            assertEquals(obj, decodedObj);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    /**
    * Tests the decode method for a bean with a single child.
    */
    @Test
    void testDecodeSingleChildBeanWithOtherAttributes() {
        try {
            String beanClassName = "org.sourceforge.ifx.basetypes.IFXString";
            IFXObject obj = (IFXObject) Class.forName(beanClassName).newInstance();
            Element element = new Element("IFXString");
            element.setAttribute("other", "other");
            Element childElement = new Element("IFXString");
            childElement.setText("Hello World");
            element.addContent(childElement);
            IFXObject decodedObj = new IFXDecoder().decode(element);
            assertEquals(obj, decodedObj);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    /**
    * Tests the decode method for a bean with a single child.
    */
    @Test
    void testDecodeSingleChildBeanWithIdAndOtherAttributesAndChild() {
        try {
            String beanClassName = "org.sourceforge.ifx.basetypes.IFXString";
            IFXObject obj = (IFXObject) Class.forName(beanClassName).newInstance();
            Element element = new Element("IFXString");
            element.setAttribute("Id", "12345");
            element.setAttribute("other", "other");
            Element childElement = new Element("IFXString");
            childElement.setText("Hello World");
            element.addContent(childElement);
            Element childElement2 = new Element("IFXString");
            childElement2.setText("Hello World");
            element.addContent(childElement2);
            IFXObject decodedObj = new IFXDecoder().decode(element);
            assertEquals(obj, decodedObj);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    /**
    * Tests the decode method for a bean with a single child.
    */
    @Test
    void testDecodeSingleChildBeanWithIdAndOtherAttributesAndChildWithId() {
        try {
            String beanClassName = "org.sourceforge.ifx.basetypes.IFXString";
            IFXObject obj = (IFXObject) Class.forName(beanClassName).newInstance();
            Element element = new Element("IFXString");
            element.setAttribute("Id", "12345");
            element.setAttribute("other", "other");
            Element childElement = new Element("IFXString");
            childElement.setText("Hello World");
            childElement.setAttribute("Id", "12345");
            element.addContent(childElement);
            Element childElement2 = new Element("IFXString");
            childElement2.setText("Hello World");
            element.addContent(childElement2);
            IFXObject decodedObj = new IFXDecoder().decode(element);
            assertEquals(obj, decodedObj);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    /**
    * Tests the decode method for a bean with a single child.
    */
    @Test
    void testDecodeSingleChildBeanWithIdAndOtherAttributesAndChildWithIdAndOtherAttributes() {
        try {
            String beanClassName = "org.sourceforge.ifx.basetypes.IFXString";
            IFXObject obj = (IFXObject) Class.forName(beanClassName).newInstance();
            Element element = new Element("IFXString");
            element.setAttribute("Id", "12345");
            element.setAttribute("other", "other");
            Element childElement = new Element("IFXString");
            childElement.setText("Hello World");
            childElement.setAttribute("Id", "12345");
            childElement.setAttribute("other", "other");
            element.addContent(childElement);
            Element childElement2 = new Element("IFXString");
            childElement2.setText("Hello World");
            element.addContent(childElement2);
            IFXObject decodedObj = new IFXDecoder().decode(element);
            assertEquals(obj, decodedObj);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    /**
    * Tests the decode method for a bean with a single child.
    */
    @Test
    void testDecodeSingleChildBeanWithIdAndOtherAttributesAndChildWithOtherAttributes() {
        try {
            String beanClassName = "org.sourceforge.ifx.basetypes.IFXString";
            IFXObject obj = (IFXObject) Class.forName(beanClassName).newInstance();
            Element element = new Element("IFXString");
            element.setAttribute("Id", "12345");
            element.setAttribute("other", "other");
            Element childElement = new Element("IFXString");
            childElement.setText("Hello World");
            childElement.setAttribute("other", "other");
            element.addContent(childElement);
            Element childElement2 = new Element("IFXString");
            childElement2.setText("Hello World");
            element.addContent(childElement2);
            IFXObject decodedObj = new IFXDecoder().decode(element);
            assertEquals(obj, decodedObj);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    /**
    * Tests the decode method for a bean with a single child.
    */
    @Test
    void testDecodeSingleChildBeanWithIdAndOtherAttributesAndChildWithIdAndOtherAttributesAndChild() {
        try {
            String beanClassName = "org.sourceforge.ifx.basetypes.IFXString";
            IFXObject obj = (IFXObject) Class.forName(beanClassName).newInstance();
            Element element = new Element("IFXString");
            element.setAttribute("Id", "12345");
           