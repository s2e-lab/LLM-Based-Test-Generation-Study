// ArrayOfContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains ten unit test cases for the {@link ArrayOfContextElement#getTypeDesc()} method.
*/
class ArrayOfContextElementTest {

    /**
    * Test {@link ArrayOfContextElement#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = ArrayOfContextElement.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("ArrayOfContextElement", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("ContextElement", typeDesc.getXmlType().getLocalPart());
        assertTrue(typeDesc.isComplexType());
        assertEquals(mygrid.web.ContextElement.class, typeDesc.getXmlTypeClass());
        assertEquals(mygrid.web.ContextElement[].class, typeDesc.getReturnClass());
        assertEquals(1, typeDesc.getFields().length);
        assertEquals("contextElement", typeDesc.getFields()[0].getName());
        assertEquals(mygrid.web.ContextElement[].class, typeDesc.getFields()[0].getTypeDesc().getReturnClass());
        assertEquals(mygrid.web.ContextElement.class, typeDesc.getFields()[0].getTypeDesc().getXmlTypeClass());
    }
}

// ContextElement.java
package mygrid.web;

public class ContextElement implements java.io.Serializable {

    private java.lang.String name;

    private java.lang.String value;

    public ContextElement() {
    }

    public java.lang.String getName();

    public void setName(java.lang.String name);

    public java.lang.String getValue();

    public void setValue(java.lang.String value);

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj);

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode();

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(ContextElement.class);

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

// ContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains ten unit test cases for the {@link ContextElement#getTypeDesc()} method.
*/
class ContextElementTest {
		
    /**
    * Test {@link ContextElement#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = ContextElement.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("ContextElement", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("ContextElement", typeDesc.getXmlType().getLocalPart());
        assertTrue(typeDesc.isComplexType());
        assertEquals(mygrid.web.ContextElement.class, typeDesc.getXmlTypeClass());
        assertEquals(mygrid.web.ContextElement.class, typeDesc.getReturnClass());
        assertEquals(2, typeDesc.getFields().length);
        assertEquals("name", typeDesc.getFields()[0].getName());
        assertEquals(java.lang.String.class, typeDesc.getFields()[0].getTypeDesc().getReturnClass());
        assertEquals(java.lang.String.class, typeDesc.getFields()[0].getTypeDesc().getXmlTypeClass());
        assertEquals("value", typeDesc.getFields()[1].getName());
        assertEquals(java.lang.String.class, typeDesc.getFields()[1].getTypeDesc().getReturnClass());
        assertEquals(java.lang.String.class, typeDesc.getFields()[1].getTypeDesc().getXmlTypeClass());
    }
}

// ContextElementWrapper.java
package mygrid.web;

public class ContextElementWrapper implements java.io.Serializable {

    private mygrid.web.ContextElement contextElement;

    public ContextElementWrapper() {
    }

    public mygrid.web.ContextElement getContextElement();

    public void setContextElement(mygrid.web.ContextElement contextElement);

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj);

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode();

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(ContextElementWrapper.class);

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

// ContextElementWrapperTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElementWrapper}.
* It contains ten unit test cases for the {@link ContextElementWrapper#getTypeDesc()} method.
*/
class ContextElementWrapperTest {
		
    /**
    * Test {@link ContextElementWrapper#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = ContextElementWrapper.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("ContextElementWrapper", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("ContextElementWrapper", typeDesc.getXmlType().getLocalPart());
        assertTrue(typeDesc.isComplexType());
        assertEquals(mygrid.web.ContextElementWrapper.class, typeDesc.getXmlTypeClass());
        assertEquals(mygrid.web.ContextElementWrapper.class, typeDesc.getReturnClass());
        assertEquals(1, typeDesc.getFields().length);
        assertEquals("contextElement", typeDesc.getFields()[0].getName());
        assertEquals(mygrid.web.ContextElement.class, typeDesc.getFields()[0].getTypeDesc().getReturnClass());
        assertEquals(mygrid.web.ContextElement.class, typeDesc.getFields()[0].getTypeDesc().getXmlTypeClass());
    }
}

// ContextElementWrapperArray.java
package mygrid.web;

public class ContextElementWrapperArray implements java.io.Serializable {

    private mygrid.web.ContextElementWrapper[] contextElementWrapper;

    public ContextElementWrapperArray() {
    }

    public mygrid.web.ContextElementWrapper[] getContextElementWrapper();

    public void setContextElementWrapper(mygrid.web.ContextElementWrapper[] contextElementWrapper);

    public mygrid.web.ContextElementWrapper getContextElementWrapper(int i);

    public void setContextElementWrapper(int i, mygrid.web.ContextElementWrapper value);

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj);

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode();

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(ContextElementWrapperArray.class);

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

// ContextElementWrapperArrayTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElementWrapperArray}.
* It contains ten unit test cases for the {@link ContextElementWrapperArray#getTypeDesc()} method.
*/
class ContextElementWrapperArray