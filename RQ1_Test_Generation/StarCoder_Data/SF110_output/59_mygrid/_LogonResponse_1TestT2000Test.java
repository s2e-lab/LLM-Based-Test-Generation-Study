// _LogonResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _LogonResponse}.
* It contains ten unit test cases for the {@link _LogonResponse#getTypeDesc()} method.
*/
class _LogonResponse_1Test {

    /**
    * Test {@link _LogonResponse#getTypeDesc()} for the type metadata.
    */
    @Test
    void getTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _LogonResponse.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("http://tempuri.org/", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("LogonResponse", typeDesc.getXmlType().getLocalPart());
        assertEquals(1, typeDesc.getFields().length);
        org.apache.axis.description.ElementDesc elemField = typeDesc.getFields()[0];
        assertEquals("LogonResult", elemField.getFieldName());
        assertEquals("LogonResult", elemField.getXmlName().getLocalPart());
        assertEquals("http://www.w3.org/2001/XMLSchema", elemField.getXmlName().getNamespaceURI());
        assertEquals("boolean", elemField.getXmlType().getNamespaceURI());
        assertEquals("boolean", elemField.getXmlType().getLocalPart());
    }
}

// _LogonResponse_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _LogonResponse}.
* It contains ten unit test cases for the {@link _LogonResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _LogonResponse_2Test {
		
    /**
    * Test {@link _LogonResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} for the serializer.
    */
    @Test
    void getSerializer() {
        org.apache.axis.encoding.Serializer serializer = _LogonResponse.getSerializer(null, null, null);
        assertNotNull(serializer);
    }
}

// _LogonResponse_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _LogonResponse}.
* It contains ten unit test cases for the {@link _LogonResponse#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _LogonResponse_3Test {
		
    /**
    * Test {@link _LogonResponse#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} for the deserializer.
    */
    @Test
    void getDeserializer() {
        org.apache.axis.encoding.Deserializer deserializer = _LogonResponse.getDeserializer(null, null, null);
        assertNotNull(deserializer);
    }
}

// _LogonResponse_4Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _LogonResponse}.
* It contains ten unit test cases for the {@link _LogonResponse#equals(java.lang.Object)} method.
*/
class _LogonResponse_4Test {
		
    /**
    * Test {@link _LogonResponse#equals(java.lang.Object)} for the equality.
    */
    @Test
    void equals() {
        _LogonResponse obj1 = new _LogonResponse();
        obj1.setLogonResult(true);
        _LogonResponse obj2 = new _LogonResponse();
        obj2.setLogonResult(true);
        assertTrue(obj1.equals(obj2));
    }
}

// _LogonResponse_5Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _LogonResponse}.
* It contains ten unit test cases for the {@link _LogonResponse#hashCode()} method.
*/
class _LogonResponse_5Test {
		
    /**
    * Test {@link _LogonResponse#hashCode()} for the hash code.
    */
    @Test
    void hashCode() {
        _LogonResponse obj1 = new _LogonResponse();
        obj1.setLogonResult(true);
        _LogonResponse obj2 = new _LogonResponse();
        obj2.setLogonResult(true);
        assertEquals(obj1.hashCode(), obj2.hashCode());
    }
}

// _LogonResponse_6Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _LogonResponse}.
* It contains ten unit test cases for the {@link _LogonResponse#toString()} method.
*/
class _LogonResponse_6Test {
		
    /**
    * Test {@link _LogonResponse#toString()} for the string representation.
    */
    @Test
    void toStringTest() {
        _LogonResponse obj1 = new _LogonResponse();
        obj1.setLogonResult(true);
        String string = obj1.toString();
        assertNotNull(string);
        assertTrue(string.contains("LogonResult"));
        assertTrue(string.contains("true"));
    }
}

// _LogonResponse_7Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _LogonResponse}.
* It contains ten unit test cases for the {@link _LogonResponse#setLogonResult(boolean)} method.
*/
class _LogonResponse_7Test {
		
    /**
    * Test {@link _LogonResponse#setLogonResult(boolean)} for the setter.
    */
    @Test
    void setLogonResult() {
        _LogonResponse obj1 = new _LogonResponse();
        obj1.setLogonResult(true);
        assertEquals(true, obj1.isLogonResult());
    }
}

// _LogonResponse_8Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _LogonResponse}.
* It contains ten unit test cases for the {@link _LogonResponse#getLogonResult()} method.
*/
class _LogonResponse_8Test {
		
    /**
    * Test {@link _LogonResponse#getLogonResult()} for the getter.
    */
    @Test
    void getLogonResult() {
        _LogonResponse obj1 = new _LogonResponse();
        obj1.setLogonResult(true);
        assertEquals(true, obj1.getLogonResult());
    }
}

// _LogonResponse_9Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _LogonResponse}.
* It contains ten unit test cases for the {@link _LogonResponse#isLogonResult()} method.
*/
class _LogonResponse_9Test {
		
    /**
    * Test {@link _LogonResponse#isLogonResult()} for the getter.
    */
    @Test
    void isLogonResult() {
        _LogonResponse obj1 = new _LogonResponse();
        obj1.setLogonResult(true);
        assertEquals(true, obj1.isLogonResult());
    }
}

// _LogonResponse_10Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _LogonResponse}.
* It contains ten unit test cases for the {@link _LogonResponse#setLogonResult(boolean)} method.
*/
class _LogonResponse_10Test {
		
    /**
    * Test {@link _LogonResponse#setLogonResult(boolean)} for the setter.
    */
    @Test
    void setLogonResult() {
        _LogonResponse obj1 = new _LogonResponse();
        obj1.setLogonResult(true);
        assertEquals(true, obj1.isLogonResult());
    }
}

// _LogonResponse_11Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _LogonResponse}.
* It contains ten unit test cases for the {@link _LogonResponse#getLogonResult()} method.
*/
class _LogonResponse_11Test {
		
   