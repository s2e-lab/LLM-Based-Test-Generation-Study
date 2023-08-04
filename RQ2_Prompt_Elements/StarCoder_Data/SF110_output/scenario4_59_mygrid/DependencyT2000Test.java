// DependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains ten unit test cases for the {@link Dependency#getTypeDesc()} method.
*/
class DependencyTest {

    /**
    * Test case for the {@link Dependency#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = Dependency.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("Dependency", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("Dependency", typeDesc.getXmlType().getLocalPart());
        assertEquals(1, typeDesc.getFields().length);
        assertEquals("id", typeDesc.getFields()[0].getName());
        assertEquals("http://www.w3.org/2001/XMLSchema", typeDesc.getFields()[0].getXmlType().getNamespaceURI());
        assertEquals("string", typeDesc.getFields()[0].getXmlType().getLocalPart());
    }
}

// DependencyType.java
package mygrid.web;

public class DependencyType implements java.io.Serializable {

    private java.lang.String id;

    private java.lang.String name;

    public DependencyType() {
    }

    public java.lang.String getId();

    public void setId(java.lang.String id);

    public java.lang.String getName();

    public void setName(java.lang.String name);

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj);

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode();

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(DependencyType.class);

    static {
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc();

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType);

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType);
}

// DependencyTypeTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DependencyType}.
* It contains ten unit test cases for the {@link DependencyType#getTypeDesc()} method.
*/
class DependencyTypeTest {
		
    /**
    * Test case for the {@link DependencyType#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = DependencyType.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("DependencyType", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("DependencyType", typeDesc.getXmlType().getLocalPart());
        assertEquals(2, typeDesc.getFields().length);
        assertEquals("id", typeDesc.getFields()[0].getName());
        assertEquals("http://www.w3.org/2001/XMLSchema", typeDesc.getFields()[0].getXmlType().getNamespaceURI());
        assertEquals("string", typeDesc.getFields()[0].getXmlType().getLocalPart());
        assertEquals("name", typeDesc.getFields()[1].getName());
        assertEquals("http://www.w3.org/2001/XMLSchema", typeDesc.getFields()[1].getXmlType().getNamespaceURI());
        assertEquals("string", typeDesc.getFields()[1].getXmlType().getLocalPart());
    }
}

// DependencyTypeTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DependencyType}.
* It contains ten unit test cases for the {@link DependencyType#getTypeDesc()} method.
*/
class DependencyTypeTest {
		
    /**
    * Test case for the {@link DependencyType#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = DependencyType.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("DependencyType", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("DependencyType", typeDesc.getXmlType().getLocalPart());
        assertEquals(2, typeDesc.getFields().length);
        assertEquals("id", typeDesc.getFields()[0].getName());
        assertEquals("http://www.w3.org/2001/XMLSchema", typeDesc.getFields()[0].getXmlType().getNamespaceURI());
        assertEquals("string", typeDesc.getFields()[0].getXmlType().getLocalPart());
        assertEquals("name", typeDesc.getFields()[1].getName());
        assertEquals("http://www.w3.org/2001/XMLSchema", typeDesc.getFields()[1].getXmlType().getNamespaceURI());
        assertEquals("string", typeDesc.getFields()[1].getXmlType().getLocalPart());
    }
}

// DependencyTypeTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DependencyType}.
* It contains ten unit test cases for the {@link DependencyType#getTypeDesc()} method.
*/
class DependencyTypeTest {
		
    /**
    * Test case for the {@link DependencyType#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = DependencyType.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("DependencyType", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("DependencyType", typeDesc.getXmlType().getLocalPart());
        assertEquals(2, typeDesc.getFields().length);
        assertEquals("id", typeDesc.getFields()[0].getName());
        assertEquals("http://www.w3.org/2001/XMLSchema", typeDesc.getFields()[0].getXmlType().getNamespaceURI());
        assertEquals("string", typeDesc.getFields()[0].getXmlType().getLocalPart());
        assertEquals("name", typeDesc.getFields()[1].getName());
        assertEquals("http://www.w3.org/2001/XMLSchema", typeDesc.getFields()[1].getXmlType().getNamespaceURI());
        assertEquals("string", typeDesc.getFields()[1].getXmlType().getLocalPart());
    }
}

// DependencyTypeTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DependencyType}.
* It contains ten unit test cases for the {@link DependencyType#getTypeDesc()} method.
*/
class DependencyTypeTest {
		
    /**
    * Test case for the {@link DependencyType#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = DependencyType.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("DependencyType", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("DependencyType", typeDesc.getXmlType().getLocalPart());
        assertEquals(2, typeDesc.getFields().length);
        assertEquals("id", typeDesc.getFields()[0].getName());
        assertEquals("http://www.w3.org/2001/XMLSchema", typeDesc.getFields()[0].getXmlType().getNamespaceURI());
        assertEquals("string", typeDesc.getFields()[0].getXmlType().getLocalPart());
        assertEquals("name", typeDesc.getFields()[1].getName());
        assertEquals("http://www.w3.org/2001/XMLSchema", typeDesc.getFields()[1].getXmlType().getNamespaceURI());
        assertEquals("string", typeDesc.getFields()[1].getXmlType().getLocalPart());
    }
}

// DependencyTypeTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DependencyType}.
* It contains ten unit test cases for the {@link DependencyType#getTypeDesc()} method.
*/
class DependencyTypeTest {
		
    /**
    * Test case for the {@link DependencyType#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = DependencyType.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("DependencyType", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.get