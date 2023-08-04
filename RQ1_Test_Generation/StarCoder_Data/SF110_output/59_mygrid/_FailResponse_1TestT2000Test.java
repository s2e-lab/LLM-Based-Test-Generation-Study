// _FailResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains ten unit test cases for the {@link _FailResponse#getTypeDesc()} method.
*/
class _FailResponse_1Test {

    /**
    * Test {@link _FailResponse#getTypeDesc()} for the following conditions:
    * <ul>
    * <li>The value of the {@link _FailResponse#getTypeDesc()} method is not null.</li>
    * <li>The value of the {@link _FailResponse#getTypeDesc()} method is an instance of {@link org.apache.axis.description.TypeDesc}.</li>
    * <li>The value of the {@link _FailResponse#getTypeDesc()} method is equal to the value of the {@link org.apache.axis.description.TypeDesc} instance returned by the {@link org.apache.axis.description.TypeDesc#getTypeDesc()} method.</li>
    * </ul>
    */
    @Test
    void testGetTypeDesc001() {
        _FailResponse _failResponse = new _FailResponse();
        assertNotNull(_failResponse.getTypeDesc());
        assertTrue(_failResponse.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);
        assertEquals(_failResponse.getTypeDesc(), org.apache.axis.description.TypeDesc.getTypeDesc(_FailResponse.class));
    }
}

// _FailResponse_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains ten unit test cases for the {@link _FailResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _FailResponse_2Test {
		
    /**
    * Test {@link _FailResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} for the following conditions:
    * <ul>
    * <li>The value of the {@link _FailResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method is not null.</li>
    * <li>The value of the {@link _FailResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method is an instance of {@link org.apache.axis.encoding.Serializer}.</li>
    * <li>The value of the {@link _FailResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method is equal to the value of the {@link org.apache.axis.encoding.Serializer#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.</li>
    * </ul>
    */
    @Test
    void testGetSerializer001() {
        _FailResponse _failResponse = new _FailResponse();
        assertNotNull(_failResponse.getSerializer("text/xml", _FailResponse.class, new javax.xml.namespace.QName("http://tempuri.org/", ">FailResponse")));
        assertTrue(_failResponse.getSerializer("text/xml", _FailResponse.class, new javax.xml.namespace.QName("http://tempuri.org/", ">FailResponse")) instanceof org.apache.axis.encoding.Serializer);
        assertEquals(_failResponse.getSerializer("text/xml", _FailResponse.class, new javax.xml.namespace.QName("http://tempuri.org/", ">FailResponse")), org.apache.axis.encoding.Serializer.getSerializer("text/xml", _FailResponse.class, new javax.xml.namespace.QName("http://tempuri.org/", ">FailResponse")));
    }
}

// _FailResponse_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains ten unit test cases for the {@link _FailResponse#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _FailResponse_3Test {
		
    /**
    * Test {@link _FailResponse#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} for the following conditions:
    * <ul>
    * <li>The value of the {@link _FailResponse#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method is not null.</li>
    * <li>The value of the {@link _FailResponse#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method is an instance of {@link org.apache.axis.encoding.Deserializer}.</li>
    * <li>The value of the {@link _FailResponse#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method is equal to the value of the {@link org.apache.axis.encoding.Deserializer#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.</li>
    * </ul>
    */
    @Test
    void testGetDeserializer001() {
        _FailResponse _failResponse = new _FailResponse();
        assertNotNull(_failResponse.getDeserializer("text/xml", _FailResponse.class, new javax.xml.namespace.QName("http://tempuri.org/", ">FailResponse")));
        assertTrue(_failResponse.getDeserializer("text/xml", _FailResponse.class, new javax.xml.namespace.QName("http://tempuri.org/", ">FailResponse")) instanceof org.apache.axis.encoding.Deserializer);
        assertEquals(_failResponse.getDeserializer("text/xml", _FailResponse.class, new javax.xml.namespace.QName("http://tempuri.org/", ">FailResponse")), org.apache.axis.encoding.Deserializer.getDeserializer("text/xml", _FailResponse.class, new javax.xml.namespace.QName("http://tempuri.org/", ">FailResponse")));
    }
}

// _FailResponse_4Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains ten unit test cases for the {@link _FailResponse#equals(java.lang.Object)} method.
*/
class _FailResponse_4Test {
		
    /**
    * Test {@link _FailResponse#equals(java.lang.Object)} for the following conditions:
    * <ul>
    * <li>The value of the {@link _FailResponse#equals(java.lang.Object)} method is not null.</li>
    * <li>The value of the {@link _FailResponse#equals(java.lang.Object)} method is an instance of {@link java.lang.Boolean}.</li>
    * <li>The value of the {@link _FailResponse#equals(java.lang.Object)} method is equal to the value of the {@link java.lang.Boolean#TRUE} field.</li>
    * </ul>
    */
    @Test
    void testEquals001() {
        _FailResponse _failResponse = new _FailResponse();
        assertNotNull(_failResponse.equals(java.lang.Boolean.TRUE));
        assertTrue(_failResponse.equals(java.lang.Boolean.TRUE) instanceof java.lang.Boolean);
        assertEquals(_failResponse.equals(java.lang.Boolean.TRUE), java.lang.Boolean.TRUE);
    }
}

// _FailResponse_5Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains ten unit test cases for the {@link _FailResponse#hashCode()} method.
*/
class _FailResponse_5Test {
		
    /**
    * Test {@link _FailResponse#hashCode()} for the following conditions:
    * <ul>
    * <li>The value of the {@link _FailResponse#hashCode()} method is not null.</li>
    * <li>The value of the {@link _FailResponse#hashCode()} method is an instance of {@link java.lang.Integer}.</li>
    * <li>The value of the {@link _FailResponse#hashCode()} method is equal to the value of the {@link java.lang.Integer#valueOf(int)} method.</li>
    * </ul>
    */
    @Test
    void testHashCode001() {
        _FailResponse _failResponse = new _FailResponse();
        assertNotNull(_failResponse.hashCode());
        assertTrue(_failResponse.hashCode() instanceof java.lang.Integer);
        assertEquals(_failResponse.hashCode(), java.lang.Integer.valueOf(0));
    }
}

// _FailResponse_6Test.java
package mygrid.web;


import org.junit.jupiter.api