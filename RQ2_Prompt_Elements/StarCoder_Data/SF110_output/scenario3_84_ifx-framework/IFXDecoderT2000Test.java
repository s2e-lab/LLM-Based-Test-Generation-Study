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
     * Test method for {@link IFXDecoder#decode(Element)}.
     *
     * @throws IFXException wrapper for underlying exception.
     */
    @Test
    void testDecode() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        IFXObject obj = decoder.decode(null);
        assertNull(obj);
    }
}

// IFXDecoder.java
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

/**
 * Decodes an IFX XML String to its equivalent Framework bean.
 *
 * @author Sujit Pal (spal@users.sourceforge.net)
 * @version $Revision: 1.3 $
 */
public class IFXDecoder {

    /**
     * Decodes the element into its equivalent IFX XML representation.
     *
     * @param element the Element to decode.
     * @return an IFXObject.
     * @exception IFXException wrapper for underlying exception.
     */
    public IFXObject decode(Element element) throws IFXException {
        if (element == null) {
            return null;
        }
        String name = element.getName();
        if (name.equals("IFX")) {
            return decodeIFX(element);
        } else if (name.equals("IFX_OBJECT")) {
            return decodeIFXObject(element);
        } else if (name.equals("IFX_STRING")) {
            return decodeIFXString(element);
        } else {
            throw new IFXException("Unknown element: " + name);
        }
    }

    /**
     * Decodes the IFX element into its equivalent IFX XML representation.
     *
     * @param element the IFX element to decode.
     * @return an IFXObject.
     * @exception IFXException wrapper for underlying exception.
     */
    private IFXObject decodeIFX(Element element) throws IFXException {
        IFXObject obj = null;
        List children = element.getChildren();
        Iterator iter = children.iterator();
        while (iter.hasNext()) {
            Element child = (Element) iter.next();
            String name = child.getName();
            if (name.equals("IFX_OBJECT")) {
                obj = decodeIFXObject(child);
            } else {
                throw new IFXException("Unknown element: " + name);
            }
        }
        return obj;
    }

    /**
     * Decodes the IFX_OBJECT element into its equivalent IFX XML representation.
     *
     * @param element the IFX_OBJECT element to decode.
     * @return an IFXObject.
     * @exception IFXException wrapper for underlying exception.
     */
    private IFXObject decodeIFXObject(Element element) throws IFXException {
        IFXObject obj = null;
        List children = element.getChildren();
        Iterator iter = children.iterator();
        while (iter.hasNext()) {
            Element child = (Element) iter.next();
            String name = child.getName();
            if (name.equals("IFX_STRING")) {
                obj = decodeIFXString(child);
            } else {
                throw new IFXException("Unknown element: " + name);
            }
        }
        return obj;
    }

    /**
     * Decodes the IFX_STRING element into its equivalent IFX XML representation.
     *
     * @param element the IFX_STRING element to decode.
     * @return an IFXObject.
     * @exception IFXException wrapper for underlying exception.
     */
    private IFXObject decodeIFXString(Element element) throws IFXException {
        IFXString obj = null;
        List children = element.getChildren();
        Iterator iter = children.iterator();
        while (iter.hasNext()) {
            Element child = (Element) iter.next();
            String name = child.getName();
            if (name.equals("VALUE")) {
                obj = decodeValue(child);
            } else {
                throw new IFXException("Unknown element: " + name);
            }
        }
        return obj;
    }

    /**
     * Decodes the VALUE element into its equivalent IFX XML representation.
     *
     * @param element the VALUE element to decode.
     * @return an IFXObject.
     * @exception IFXException wrapper for underlying exception.
     */
    private IFXString decodeValue(Element element) throws IFXException {
        IFXString obj = null;
        List children = element.getChildren();
        Iterator iter = children.iterator();
        while (iter.hasNext()) {
            Element child = (Element) iter.next();
            String name = child.getName();
            if (name.equals("VALUE")) {
                obj = decodeValue(child);
            } else {
                throw new IFXException("Unknown element: " + name);
            }
        }
        return obj;
    }
}

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
     * Test method for {@link IFXDecoder#decode(Element)}.
     *
     * @throws IFXException wrapper for underlying exception.
     */
    @Test
    void testDecode() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        IFXObject obj = decoder.decode(null);
        assertNull(obj);
    }
}

// IFXDecoder.java
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

/**
 * Decodes an IFX XML String to its equivalent Framework bean.
 *
 * @author Sujit Pal (spal@users.sourceforge.net)
 * @version $Revision: 1.3 $
 */
public class IFXDecoder {

    /**
     * Decodes the element into its equivalent IFX XML representation.
     *
     * @param element the Element to decode.
     * @return an IFXObject.
     * @exception IFXException wrapper for underlying exception.
     */
    public IFXObject decode(Element element) throws IFXException {
        if (element == null) {
            return null;
        }
        String name = element.getName();
        if (name.equals("IFX")) {
            return decodeIFX(element);
        } else if (name.equals("IFX_OBJECT")) {
            return decodeIFXObject(element);
        } else if (name.equals("IFX_STRING")) {
            return decodeIFXString(element);
        } else {
            throw new IFXException("Unknown element: " + name);
        }
    }

    /**
     * Decodes the IFX element into its equivalent IFX XML representation.
     *
     * @param element the IFX element to decode.
     * @return an IFXObject.
     * @exception IFXException wrapper for underlying exception.
     */
    private IFXObject decodeIFX(Element element) throws IFXException {
        IFXObject obj = null;
        List children = element.getChildren();
        Iterator iter = children.iterator();
        while (iter.hasNext()) {
            Element child = (Element) iter.next();
            String name = child.getName();
            if (name.equals("IFX_OBJECT")) {
                obj = decodeIFXObject(child);
            } else {
                throw new IFXException("Unknown element: " + name);
            }
        }
        return obj;
    }

    /**
     * Decodes the IFX_OBJECT element into its equivalent IFX XML representation.
     *
     * @param element the IFX_OBJECT element to decode.
     * @return an