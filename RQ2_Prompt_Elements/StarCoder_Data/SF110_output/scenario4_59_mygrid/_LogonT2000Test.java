// _LogonTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#getTypeDesc()} method.
*/
class _LogonTest {

    /**
    * Test {@link _Logon#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _Logon.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("Logon", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("Logon", typeDesc.getXmlType().getLocalPart());
        assertEquals(1, typeDesc.getFields().length);
        assertEquals("clusterUrl", typeDesc.getFields()[0].getName());
        assertEquals("http://www.w3.org/2001/XMLSchema", typeDesc.getFields()[0].getXmlType().getNamespaceURI());
        assertEquals("string", typeDesc.getFields()[0].getXmlType().getLocalPart());
    }
}
