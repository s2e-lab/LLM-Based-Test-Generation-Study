// _ProgressResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _ProgressResponse}.
* It contains ten unit test cases for the {@link _ProgressResponse#getTypeDesc()} method.
*/
class _ProgressResponse_1Test {

    /**
    * Test {@link _ProgressResponse#getTypeDesc()} for the following conditions:
    * <ul>
    * <li>
    * <code>getTypeDesc().getXmlType().getNamespaceURI()</code>
    * </li>
    * <li>
    * <code>getTypeDesc().getXmlType().getLocalPart()</code>
    * </li>
    * </ul>
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _ProgressResponse.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("http://tempuri.org/", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("ProgressResponse", typeDesc.getXmlType().getLocalPart());
    }
}

// _ProgressResponse_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _ProgressResponse}.
* It contains ten unit test cases for the {@link _ProgressResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _ProgressResponse_2Test {
		
    /**
    * Test {@link _ProgressResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} for the following conditions:
    * <ul>
    * <li>
    * <code>getSerializer("xml", _ProgressResponse.class, null)</code>
    * </li>
    * <li>
    * <code>getSerializer("xml", _ProgressResponse.class, null).getClass()</code>
    * </li>
    * </ul>
    */
    @Test
    void testGetSerializer() {
        org.apache.axis.encoding.Serializer serializer = _ProgressResponse.getSerializer("xml", _ProgressResponse.class, null);
        assertNotNull(serializer);
        assertEquals("org.apache.axis.encoding.ser.BeanSerializer", serializer.getClass().getName());
    }
}

// _ProgressResponse_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _ProgressResponse}.
* It contains ten unit test cases for the {@link _ProgressResponse#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _ProgressResponse_3Test {
		
    /**
    * Test {@link _ProgressResponse#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} for the following conditions:
    * <ul>
    * <li>
    * <code>getDeserializer("xml", _ProgressResponse.class, null)</code>
    * </li>
    * <li>
    * <code>getDeserializer("xml", _ProgressResponse.class, null).getClass()</code>
    * </li>
    * </ul>
    */
    @Test
    void testGetDeserializer() {
        org.apache.axis.encoding.Deserializer deserializer = _ProgressResponse.getDeserializer("xml", _ProgressResponse.class, null);
        assertNotNull(deserializer);
        assertEquals("org.apache.axis.encoding.ser.BeanDeserializer", deserializer.getClass().getName());
    }
}

// _ProgressResponse_4Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _ProgressResponse}.
* It contains ten unit test cases for the {@link _ProgressResponse#equals(java.lang.Object)} method.
*/
class _ProgressResponse_4Test {
		
    /**
    * Test {@link _ProgressResponse#equals(java.lang.Object)} for the following conditions:
    * <ul>
    * <li>
    * <code>equals(null)</code>
    * </li>
    * <li>
    * <code>equals(new Object())</code>
    * </li>
    * <li>
    * <code>equals(new _ProgressResponse())</code>
    * </li>
    * </ul>
    */
    @Test
    void testEquals() {
        _ProgressResponse obj = new _ProgressResponse();
        assertNotNull(obj);
        assertFalse(obj.equals(null));
        assertFalse(obj.equals(new Object()));
        assertTrue(obj.equals(new _ProgressResponse()));
    }
}

// _ProgressResponse_5Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _ProgressResponse}.
* It contains ten unit test cases for the {@link _ProgressResponse#hashCode()} method.
*/
class _ProgressResponse_5Test {
		
    /**
    * Test {@link _ProgressResponse#hashCode()} for the following conditions:
    * <ul>
    * <li>
    * <code>hashCode()</code>
    * </li>
    * </ul>
    */
    @Test
    void testHashCode() {
        _ProgressResponse obj = new _ProgressResponse();
        assertNotNull(obj);
        assertEquals(0, obj.hashCode());
    }
}

// _ProgressResponse_6Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _ProgressResponse}.
* It contains ten unit test cases for the {@link _ProgressResponse#toString()} method.
*/
class _ProgressResponse_6Test {
		
    /**
    * Test {@link _ProgressResponse#toString()} for the following conditions:
    * <ul>
    * <li>
    * <code>toString()</code>
    * </li>
    * </ul>
    */
    @Test
    void testToString() {
        _ProgressResponse obj = new _ProgressResponse();
        assertNotNull(obj);
        assertEquals("mygrid.web._ProgressResponse", obj.toString());
    }
}

// _ProgressResponse_7Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _ProgressResponse}.
* It contains ten unit test cases for the {@link _ProgressResponse#ProgressResponse()} method.
*/
class _ProgressResponse_7Test {
		
    /**
    * Test {@link _ProgressResponse#ProgressResponse()} for the following conditions:
    * <ul>
    * <li>
    * <code>ProgressResponse()</code>
    * </li>
    * </ul>
    */
    @Test
    void testProgressResponse() {
        _ProgressResponse obj = new _ProgressResponse();
        assertNotNull(obj);
    }
}

// _ProgressResponse_8Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _ProgressResponse}.
* It contains ten unit test cases for the {@link _ProgressResponse#ProgressResponse(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang