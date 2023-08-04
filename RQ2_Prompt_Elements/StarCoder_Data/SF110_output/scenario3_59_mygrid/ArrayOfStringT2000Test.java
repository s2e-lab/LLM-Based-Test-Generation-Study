// ArrayOfStringTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains ten unit test cases for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfStringTest {

    /**
    * Test case for {@link ArrayOfString#getTypeDesc()} method.
    */
    @Test
    void getTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = ArrayOfString.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("ArrayOfString", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getPackageName());
        assertEquals("mygrid.web.ArrayOfString", typeDesc.getFullName());
        assertEquals("mygrid.web.ArrayOfString", typeDesc.getXmlType().getName());
        assertEquals(0, typeDesc.getXmlType().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getURI());
        assertEquals(0, typeDesc.getXmlType().getNS());
        assertEquals(0, typeDesc.getXmlType().getNSURI());
        assertEquals(0, typeDesc.getXmlType().getNSIndex());
        assertEquals(0, typeDesc.getXmlType().getNSCount());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getURI());
        assertEquals(0, typeDesc.getXmlType().getQName().getNS());
        assertEquals(0, typeDesc.getXmlType().getQName().getNSURI());
        assertEquals(0, typeDesc.getXmlType().getQName().getNSIndex());
        assertEquals(0, typeDesc.getXmlType().getQName().getNSCount());
        assertEquals(0, typeDesc.getXmlType().getQName().getNamespaceURI());
        assertEquals(0, typeDesc.getXmlType().getQName().getLocalPart());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc.getXmlType().getQName().getPrefix());
        assertEquals(0, typeDesc