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

    @Test
    void testDecode() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
    }

    @Test
    void testDecodeWithId() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        element.setAttribute("Id", "12345");
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
        assertEquals("12345", obj.getId());
    }

    @Test
    void testDecodeWithText() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        element.setText("Hello World");
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
        assertEquals("Hello World", obj.getString());
    }

    @Test
    void testDecodeWithChild() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        Element childElement = new Element("Child");
        element.addContent(childElement);
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
        assertNotNull(obj.getChild());
        assertEquals("Child", obj.getChild().getName());
    }

    @Test
    void testDecodeWithChildWithId() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        Element childElement = new Element("Child");
        childElement.setAttribute("Id", "12345");
        element.addContent(childElement);
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
        assertNotNull(obj.getChild());
        assertEquals("12345", obj.getChild().getId());
    }

    @Test
    void testDecodeWithChildWithText() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        Element childElement = new Element("Child");
        childElement.setText("Hello World");
        element.addContent(childElement);
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
        assertNotNull(obj.getChild());
        assertEquals("Hello World", obj.getChild().getString());
    }

    @Test
    void testDecodeWithChildWithChild() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        Element childElement = new Element("Child");
        Element grandChildElement = new Element("GrandChild");
        childElement.addContent(grandChildElement);
        element.addContent(childElement);
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
        assertNotNull(obj.getChild());
        assertNotNull(obj.getChild().getChild());
        assertEquals("GrandChild", obj.getChild().getChild().getName());
    }

    @Test
    void testDecodeWithChildWithChildWithId() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        Element childElement = new Element("Child");
        Element grandChildElement = new Element("GrandChild");
        grandChildElement.setAttribute("Id", "12345");
        childElement.addContent(grandChildElement);
        element.addContent(childElement);
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
        assertNotNull(obj.getChild());
        assertNotNull(obj.getChild().getChild());
        assertEquals("12345", obj.getChild().getChild().getId());
    }

    @Test
    void testDecodeWithChildWithChildWithText() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        Element childElement = new Element("Child");
        Element grandChildElement = new Element("GrandChild");
        grandChildElement.setText("Hello World");
        childElement.addContent(grandChildElement);
        element.addContent(childElement);
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
        assertNotNull(obj.getChild());
        assertNotNull(obj.getChild().getChild());
        assertEquals("Hello World", obj.getChild().getChild().getString());
    }

    @Test
    void testDecodeWithChildWithChildWithChild() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        Element childElement = new Element("Child");
        Element grandChildElement = new Element("GrandChild");
        Element greatGrandChildElement = new Element("GreatGrandChild");
        grandChildElement.addContent(greatGrandChildElement);
        childElement.addContent(grandChildElement);
        element.addContent(childElement);
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
        assertNotNull(obj.getChild());
        assertNotNull(obj.getChild().getChild());
        assertNotNull(obj.getChild().getChild().getChild());
        assertEquals("GreatGrandChild", obj.getChild().getChild().getChild().getName());
    }

    @Test
    void testDecodeWithChildWithChildWithChildWithId() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        Element childElement = new Element("Child");
        Element grandChildElement = new Element("GrandChild");
        Element greatGrandChildElement = new Element("GreatGrandChild");
        greatGrandChildElement.setAttribute("Id", "12345");
        grandChildElement.addContent(greatGrandChildElement);
        childElement.addContent(grandChildElement);
        element.addContent(childElement);
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
        assertNotNull(obj.getChild());
        assertNotNull(obj.getChild().getChild());
        assertNotNull(obj.getChild().getChild().getChild());
        assertEquals("12345", obj.getChild().getChild().getChild().getId());
    }

    @Test
    void testDecodeWithChildWithChildWithChildWithText() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        Element childElement = new Element("Child");
        Element grandChildElement = new Element("GrandChild");
        Element greatGrandChildElement = new Element("GreatGrandChild");
        greatGrandChildElement.setText("Hello World");
        grandChildElement.addContent(greatGrandChildElement);
        childElement.addContent(grandChildElement);
        element.addContent(childElement);
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
        assertNotNull(obj.getChild());
        assertNotNull(obj.getChild().getChild());
        assertNotNull(obj.getChild().getChild().getChild());
        assertEquals("Hello World", obj.getChild().getChild().getChild().getString());
    }

    @Test
    void testDecodeWithChildWithChildWithChildWithChild() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        Element childElement = new Element("Child");
        Element grandChildElement = new Element("GrandChild");
        Element greatGrandChildElement = new Element("GreatGrandChild");
        Element greatGreatGrandChildElement = new Element("GreatGreatGrandChild");
        greatGrandChildElement.addContent(greatGreatGrandChildElement);
        grandChildElement.addContent(greatGrandChildElement);
        childElement.addContent(grandChildElement);
        element.addContent(childElement);
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
        assertNotNull(obj.getChild());
        assertNotNull(obj.getChild().getChild());
        assertNotNull(obj.getChild().getChild().getChild());
        assertNotNull(obj.getChild().getChild().getChild().getChild());
        assertEquals("GreatGreatGrandChild", obj.getChild().getChild().getChild().getChild().getName());
    }

    @Test
    void testDecodeWithChildWithChildWithChildWithChildWithId() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        Element childElement = new Element("Child");
        Element grandChildElement = new Element("GrandChild");
        Element greatGrandChildElement = new Element("GreatGrandChild");
        Element greatGreatGrandChildElement = new Element("GreatGreatGrandChild");
        greatGreatGrandChildElement.setAttribute("Id", "12345");
        greatGrandChildElement.addContent(greatGreatGrandChildElement);
        grandChildElement.addContent(greatGrandChildElement);
        childElement.addContent(grandChildElement);
        element.addContent(childElement);
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
        assertNotNull(obj.getChild());
        assertNotNull(obj.getChild().getChild());
        assertNotNull(obj.getChild().getChild().getChild());
        assertNotNull(obj.getChild().getChild().getChild().getChild());
        assertEquals("12345", obj.getChild().getChild().getChild().getChild().getId());
    }

    @Test
    void testDecodeWithChildWithChildWithChildWithChildWithText() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        Element childElement = new Element("Child");
        Element grandChildElement = new Element("GrandChild");