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
     * Test case for {@link IFXDecoder#decode(Element)}.
     *
     * @throws IFXException wrapper for underlying exception.
     */
    @Test
    void testDecode() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
    }

    /**
     * Test case for {@link IFXDecoder#decode(Element)}.
     *
     * @throws IFXException wrapper for underlying exception.
     */
    @Test
    void testDecode1() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        element.setAttribute("Id", "123");
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
    }

    /**
     * Test case for {@link IFXDecoder#decode(Element)}.
     *
     * @throws IFXException wrapper for underlying exception.
     */
    @Test
    void testDecode2() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        element.setAttribute("Id", "123");
        element.addContent("abc");
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
    }

    /**
     * Test case for {@link IFXDecoder#decode(Element)}.
     *
     * @throws IFXException wrapper for underlying exception.
     */
    @Test
    void testDecode3() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        element.setAttribute("Id", "123");
        element.addContent("abc");
        element.addContent("def");
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
    }

    /**
     * Test case for {@link IFXDecoder#decode(Element)}.
     *
     * @throws IFXException wrapper for underlying exception.
     */
    @Test
    void testDecode4() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        element.setAttribute("Id", "123");
        element.addContent("abc");
        element.addContent("def");
        element.addContent("ghi");
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
    }

    /**
     * Test case for {@link IFXDecoder#decode(Element)}.
     *
     * @throws IFXException wrapper for underlying exception.
     */
    @Test
    void testDecode5() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        element.setAttribute("Id", "123");
        element.addContent("abc");
        element.addContent("def");
        element.addContent("ghi");
        element.addContent("jkl");
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
    }

    /**
     * Test case for {@link IFXDecoder#decode(Element)}.
     *
     * @throws IFXException wrapper for underlying exception.
     */
    @Test
    void testDecode6() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        element.setAttribute("Id", "123");
        element.addContent("abc");
        element.addContent("def");
        element.addContent("ghi");
        element.addContent("jkl");
        element.addContent("mno");
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
    }

    /**
     * Test case for {@link IFXDecoder#decode(Element)}.
     *
     * @throws IFXException wrapper for underlying exception.
     */
    @Test
    void testDecode7() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        element.setAttribute("Id", "123");
        element.addContent("abc");
        element.addContent("def");
        element.addContent("ghi");
        element.addContent("jkl");
        element.addContent("mno");
        element.addContent("pqr");
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
    }

    /**
     * Test case for {@link IFXDecoder#decode(Element)}.
     *
     * @throws IFXException wrapper for underlying exception.
     */
    @Test
    void testDecode8() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        element.setAttribute("Id", "123");
        element.addContent("abc");
        element.addContent("def");
        element.addContent("ghi");
        element.addContent("jkl");
        element.addContent("mno");
        element.addContent("pqr");
        element.addContent("stu");
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
    }

    /**
     * Test case for {@link IFXDecoder#decode(Element)}.
     *
     * @throws IFXException wrapper for underlying exception.
     */
    @Test
    void testDecode9() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        element.setAttribute("Id", "123");
        element.addContent("abc");
        element.addContent("def");
        element.addContent("ghi");
        element.addContent("jkl");
        element.addContent("mno");
        element.addContent("pqr");
        element.addContent("stu");
        element.addContent("vwx");
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
    }

    /**
     * Test case for {@link IFXDecoder#decode(Element)}.
     *
     * @throws IFXException wrapper for underlying exception.
     */
    @Test
    void testDecode10() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("Test");
        element.setAttribute("Id", "123");
        element.addContent("abc");
        element.addContent("def");
        element.addContent("ghi");
        element.addContent("jkl");
        element.addContent("mno");
        element.addContent("pqr");
        element.addContent("stu");
        element.addContent("vwx");
        element.addContent("yz");
        IFXObject obj = decoder.decode(element);
        assertNotNull(obj);
    }
}
