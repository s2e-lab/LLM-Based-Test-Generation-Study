// XPathReaderFactory_1Test.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;
import org.saxpath.SAXPathException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XPathReaderFactory}.
* It contains ten unit test cases for the {@link XPathReaderFactory#createReader(String)} method.
*/
class XPathReaderFactory_1Test {

    @Test
    void testCreateReader() throws SAXPathException {
        XPathReader reader = XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderFactory_2");
        assertNotNull(reader);
    }
}

// XPathReaderFactory_2.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;
import org.saxpath.SAXPathException;

/**
* This class is used to test the {@link XPathReaderFactory#createReader(String)} method.
*/
class XPathReaderFactory_2 implements XPathReader {

    public XPathReaderFactory_2() {
    }

    public void setXPath(String xpath) {
    }

    public void setNamespaceContext(NamespaceContext context) {
    }

    public void setVariable(String name, Object value) {
    }

    public void setFunction(String name, Function function) {
    }

    public void setFunction(String name, int numArgs, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, int numArgs4, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, int numArgs4, int numArgs5, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, int numArgs4, int numArgs5, int numArgs6, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, int numArgs4, int numArgs5, int numArgs6, int numArgs7, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, int numArgs4, int numArgs5, int numArgs6, int numArgs7, int numArgs8, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, int numArgs4, int numArgs5, int numArgs6, int numArgs7, int numArgs8, int numArgs9, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, int numArgs4, int numArgs5, int numArgs6, int numArgs7, int numArgs8, int numArgs9, int numArgs10, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, int numArgs4, int numArgs5, int numArgs6, int numArgs7, int numArgs8, int numArgs9, int numArgs10, int numArgs11, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, int numArgs4, int numArgs5, int numArgs6, int numArgs7, int numArgs8, int numArgs9, int numArgs10, int numArgs11, int numArgs12, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, int numArgs4, int numArgs5, int numArgs6, int numArgs7, int numArgs8, int numArgs9, int numArgs10, int numArgs11, int numArgs12, int numArgs13, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, int numArgs4, int numArgs5, int numArgs6, int numArgs7, int numArgs8, int numArgs9, int numArgs10, int numArgs11, int numArgs12, int numArgs13, int numArgs14, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, int numArgs4, int numArgs5, int numArgs6, int numArgs7, int numArgs8, int numArgs9, int numArgs10, int numArgs11, int numArgs12, int numArgs13, int numArgs14, int numArgs15, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, int numArgs4, int numArgs5, int numArgs6, int numArgs7, int numArgs8, int numArgs9, int numArgs10, int numArgs11, int numArgs12, int numArgs13, int numArgs14, int numArgs15, int numArgs16, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, int numArgs4, int numArgs5, int numArgs6, int numArgs7, int numArgs8, int numArgs9, int numArgs10, int numArgs11, int numArgs12, int numArgs13, int numArgs14, int numArgs15, int numArgs16, int numArgs17, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, int numArgs4, int numArgs5, int numArgs6, int numArgs7, int numArgs8, int numArgs9, int numArgs10, int numArgs11, int numArgs12, int numArgs13, int numArgs14, int numArgs15, int numArgs16, int numArgs17, int numArgs18, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, int numArgs4, int numArgs5, int numArgs6, int numArgs7, int numArgs8, int numArgs9, int numArgs10, int numArgs11, int numArgs12, int numArgs13, int numArgs14, int numArgs15, int numArgs16, int numArgs17, int numArgs18, int numArgs19, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, int numArgs4, int numArgs5, int numArgs6, int numArgs7, int numArgs8, int numArgs9, int numArgs10, int numArgs11, int numArgs12, int numArgs13, int numArgs14, int numArgs15, int numArgs16, int numArgs17, int numArgs18, int numArgs19, int numArgs20, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, int numArgs4, int numArgs5, int numArgs6, int numArgs7, int numArgs8, int numArgs9, int numArgs10, int numArgs11, int numArgs12, int numArgs13, int numArgs14, int numArgs15, int numArgs16, int numArgs17, int numArgs18, int numArgs19, int numArgs20, int numArgs21, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, int numArgs4, int numArgs5, int numArgs6, int numArgs7, int numArgs8, int numArgs9, int numArgs10, int numArgs11, int numArgs12, int numArgs13, int numArgs14, int numArgs15, int numArgs16, int numArgs17, int numArgs18, int numArgs19, int numArgs20, int numArgs21, int numArgs22, Function function) {
    }

    public void setFunction(String name, int numArgs, int numArgs2, int numArgs3, int numArgs4, int numArgs5, int numArgs6, int numArgs7, int numArgs8, int numArgs9, int numArgs10, int numArgs11, int numArgs12, int numArgs13, int numArgs14, int numArgs15, int numArgs16, int numArgs17, int numArgs18, int numArgs19, int numArgs20, int numArgs21, int numArgs22, int numArgs23, Function function) {
   