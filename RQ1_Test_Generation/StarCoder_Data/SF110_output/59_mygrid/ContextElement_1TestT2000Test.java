// ContextElement_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains ten unit test cases for the {@link ContextElement#getTypeDesc()} method.
*/
class ContextElement_1Test {

    /**
    * Test case for {@link ContextElement#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        ContextElement contextElement = new ContextElement();
        org.apache.axis.description.TypeDesc typeDesc = contextElement.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("ContextElement", typeDesc.getName());
        assertEquals("http://tempuri.org/", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("ContextElement", typeDesc.getXmlType().getLocalPart());
        assertEquals(2, typeDesc.getFields().length);
        assertEquals("Name", typeDesc.getFields()[0].getName());
        assertEquals("http://tempuri.org/", typeDesc.getFields()[0].getXmlType().getNamespaceURI());
        assertEquals("string", typeDesc.getFields()[0].getXmlType().getLocalPart());
        assertEquals("Content", typeDesc.getFields()[1].getName());
        assertEquals("http://tempuri.org/", typeDesc.getFields()[1].getXmlType().getNamespaceURI());
        assertEquals("string", typeDesc.getFields()[1].getXmlType().getLocalPart());
    }
}

// ContextElement_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains ten unit test cases for the {@link ContextElement#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class ContextElement_2Test {
		
    /**
    * Test case for {@link ContextElement#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
    */
    @Test
    void testGetSerializer() {
        ContextElement contextElement = new ContextElement();
        org.apache.axis.encoding.Serializer serializer = contextElement.getSerializer(null, null, null);
        assertNotNull(serializer);
        assertEquals("ContextElement", serializer.getTypeDesc().getName());
        assertEquals("http://tempuri.org/", serializer.getTypeDesc().getXmlType().getNamespaceURI());
        assertEquals("ContextElement", serializer.getTypeDesc().getXmlType().getLocalPart());
        assertEquals(2, serializer.getTypeDesc().getFields().length);
        assertEquals("Name", serializer.getTypeDesc().getFields()[0].getName());
        assertEquals("http://tempuri.org/", serializer.getTypeDesc().getFields()[0].getXmlType().getNamespaceURI());
        assertEquals("string", serializer.getTypeDesc().getFields()[0].getXmlType().getLocalPart());
        assertEquals("Content", serializer.getTypeDesc().getFields()[1].getName());
        assertEquals("http://tempuri.org/", serializer.getTypeDesc().getFields()[1].getXmlType().getNamespaceURI());
        assertEquals("string", serializer.getTypeDesc().getFields()[1].getXmlType().getLocalPart());
    }
}

// ContextElement_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains ten unit test cases for the {@link ContextElement#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class ContextElement_3Test {
		
    /**
    * Test case for {@link ContextElement#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
    */
    @Test
    void testGetDeserializer() {
        ContextElement contextElement = new ContextElement();
        org.apache.axis.encoding.Deserializer deserializer = contextElement.getDeserializer(null, null, null);
        assertNotNull(deserializer);
        assertEquals("ContextElement", deserializer.getTypeDesc().getName());
        assertEquals("http://tempuri.org/", deserializer.getTypeDesc().getXmlType().getNamespaceURI());
        assertEquals("ContextElement", deserializer.getTypeDesc().getXmlType().getLocalPart());
        assertEquals(2, deserializer.getTypeDesc().getFields().length);
        assertEquals("Name", deserializer.getTypeDesc().getFields()[0].getName());
        assertEquals("http://tempuri.org/", deserializer.getTypeDesc().getFields()[0].getXmlType().getNamespaceURI());
        assertEquals("string", deserializer.getTypeDesc().getFields()[0].getXmlType().getLocalPart());
        assertEquals("Content", deserializer.getTypeDesc().getFields()[1].getName());
        assertEquals("http://tempuri.org/", deserializer.getTypeDesc().getFields()[1].getXmlType().getNamespaceURI());
        assertEquals("string", deserializer.getTypeDesc().getFields()[1].getXmlType().getLocalPart());
    }
}

// ContextElement_4Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains ten unit test cases for the {@link ContextElement#equals(java.lang.Object)} method.
*/
class ContextElement_4Test {
		
    /**
    * Test case for {@link ContextElement#equals(java.lang.Object)} method.
    */
    @Test
    void testEquals() {
        ContextElement contextElement = new ContextElement();
        contextElement.setName("name");
        contextElement.setContent("content");
        ContextElement contextElement2 = new ContextElement();
        contextElement2.setName("name");
        contextElement2.setContent("content");
        assertTrue(contextElement.equals(contextElement2));
    }
}

// ContextElement_5Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains ten unit test cases for the {@link ContextElement#hashCode()} method.
*/
class ContextElement_5Test {
		
    /**
    * Test case for {@link ContextElement#hashCode()} method.
    */
    @Test
    void testHashCode() {
        ContextElement contextElement = new ContextElement();
        contextElement.setName("name");
        contextElement.setContent("content");
        ContextElement contextElement2 = new ContextElement();
        contextElement2.setName("name");
        contextElement2.setContent("content");
        assertEquals(contextElement.hashCode(), contextElement2.hashCode());
    }
}

// ContextElement_6Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains ten unit test cases for the {@link ContextElement#toString()} method.
*/
class ContextElement_6Test {
		
    /**
    * Test case for {@link ContextElement#toString()} method.
    */
    @Test
    void testToString() {
        ContextElement contextElement = new ContextElement();
        contextElement.setName("name");
        contextElement.setContent("content");
        assertEquals("ContextElement [name=name, content=content]", contextElement.toString());
    }
}

// ContextElement_7Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains ten unit test cases for the {@link ContextElement#getName()} method.
*/
class ContextElement_7Test {
		
    /**
    * Test case for {@link ContextElement#getName()} method.
    */
    @Test
    void testGetName() {
        ContextElement contextElement = new ContextElement();
        contextElement.setName("name");
        assertEquals("name", contextElement.getName());
    }
}

// ContextElement_8Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains ten unit test cases for the {@link ContextElement#setContent(java.lang.String)} method.
*/
class ContextElement_8Test {
		
    /**
    * Test case for {@link ContextElement#setContent(java.lang.String)} method.
    */
    @Test
    void testSetContent() {
        ContextElement contextElement = new ContextElement();
        contextElement.setContent("content");
        assertEquals("content", contextElement.getContent());
    }
}

// ContextElement_9Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains ten unit test cases for the {@link ContextElement#getContent()} method.
*/
class ContextElement_9Test {
		
    /**
    * Test case for {@link ContextElement#getContent()} method.
    */
   