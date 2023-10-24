// _AvailableJobsResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains ten unit test cases for the {@link _AvailableJobsResponse#getTypeDesc()} method.
*/
class _AvailableJobsResponse_1Test {

    /**
    * Test {@link _AvailableJobsResponse#getTypeDesc()} for type metadata.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _AvailableJobsResponse.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("http://tempuri.org/", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("AvailableJobsResponse", typeDesc.getXmlType().getLocalPart());
    }
}

// _AvailableJobsResponse_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains ten unit test cases for the {@link _AvailableJobsResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _AvailableJobsResponse_2Test {
		
    /**
    * Test {@link _AvailableJobsResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} for serializer.
    */
    @Test
    void testGetSerializer() {
        org.apache.axis.encoding.Serializer serializer = _AvailableJobsResponse.getSerializer(null, null, null);
        assertNotNull(serializer);
    }
}

// _AvailableJobsResponse_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains ten unit test cases for the {@link _AvailableJobsResponse#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _AvailableJobsResponse_3Test {
		
    /**
    * Test {@link _AvailableJobsResponse#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} for deserializer.
    */
    @Test
    void testGetDeserializer() {
        org.apache.axis.encoding.Deserializer deserializer = _AvailableJobsResponse.getDeserializer(null, null, null);
        assertNotNull(deserializer);
    }
}

// _AvailableJobsResponse_4Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains ten unit test cases for the {@link _AvailableJobsResponse#equals(java.lang.Object)} method.
*/
class _AvailableJobsResponse_4Test {
		
    /**
    * Test {@link _AvailableJobsResponse#equals(java.lang.Object)} for equality.
    */
    @Test
    void testEquals() {
        _AvailableJobsResponse obj1 = new _AvailableJobsResponse();
        _AvailableJobsResponse obj2 = new _AvailableJobsResponse();
        assertTrue(obj1.equals(obj2));
    }
}

// _AvailableJobsResponse_5Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains ten unit test cases for the {@link _AvailableJobsResponse#equals(java.lang.Object)} method.
*/
class _AvailableJobsResponse_5Test {
		
    /**
    * Test {@link _AvailableJobsResponse#equals(java.lang.Object)} for equality.
    */
    @Test
    void testEquals() {
        _AvailableJobsResponse obj1 = new _AvailableJobsResponse();
        obj1.setAvailableJobsResult(new mygrid.web.ArrayOfJob());
        _AvailableJobsResponse obj2 = new _AvailableJobsResponse();
        obj2.setAvailableJobsResult(new mygrid.web.ArrayOfJob());
        assertTrue(obj1.equals(obj2));
    }
}

// _AvailableJobsResponse_6Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains ten unit test cases for the {@link _AvailableJobsResponse#equals(java.lang.Object)} method.
*/
class _AvailableJobsResponse_6Test {
		
    /**
    * Test {@link _AvailableJobsResponse#equals(java.lang.Object)} for equality.
    */
    @Test
    void testEquals() {
        _AvailableJobsResponse obj1 = new _AvailableJobsResponse();
        obj1.setAvailableJobsResult(new mygrid.web.ArrayOfJob());
        _AvailableJobsResponse obj2 = new _AvailableJobsResponse();
        obj2.setAvailableJobsResult(new mygrid.web.ArrayOfJob());
        assertTrue(obj1.equals(obj2));
    }
}

// _AvailableJobsResponse_7Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains ten unit test cases for the {@link _AvailableJobsResponse#equals(java.lang.Object)} method.
*/
class _AvailableJobsResponse_7Test {
		
    /**
    * Test {@link _AvailableJobsResponse#equals(java.lang.Object)} for equality.
    */
    @Test
    void testEquals() {
        _AvailableJobsResponse obj1 = new _AvailableJobsResponse();
        obj1.setAvailableJobsResult(new mygrid.web.ArrayOfJob());
        _AvailableJobsResponse obj2 = new _AvailableJobsResponse();
        obj2.setAvailableJobsResult(new mygrid.web.ArrayOfJob());
        assertTrue(obj1.equals(obj2));
    }
}

// _AvailableJobsResponse_8Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains ten unit test cases for the {@link _AvailableJobsResponse#equals(java.lang.Object)} method.
*/
class _AvailableJobsResponse_8Test {
		
    /**
    * Test {@link _AvailableJobsResponse#equals(java.lang.Object)} for equality.
    */
    @Test
    void testEquals() {
        _AvailableJobsResponse obj1 = new _AvailableJobsResponse();
        obj1.setAvailableJobsResult(new mygrid.web.ArrayOfJob());
        _AvailableJobsResponse obj2 = new _AvailableJobsResponse();
        obj2.setAvailableJobsResult(new mygrid.web.ArrayOfJob());
        assertTrue(obj1.equals(obj2));
    }
}

// _AvailableJobsResponse_9Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains ten unit test cases for the {@link _AvailableJobsResponse#equals(java.lang.Object)} method.
*/
class _AvailableJobsResponse_9Test {
		
    /**
    * Test {@link _AvailableJobsResponse#equals(java.lang.Object)} for equality.
    */
    @Test
    void testEquals() {
        _AvailableJobsResponse obj1 = new _AvailableJobsResponse();
        obj1.setAvailableJobsResult(new mygrid.web.ArrayOfJob());
        _AvailableJobsResponse obj2 = new _AvailableJobsResponse();
        obj2.setAvailableJobsResult(new mygrid.web.ArrayOfJob());
        assertTrue(obj1.equals(obj2));
    }
}

// _AvailableJobsResponse_10Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains ten unit test cases for the {@link _AvailableJobsResponse#equals(java.lang.Object)} method.
*/
class _AvailableJobsResponse_10Test {
		
    /**
    * Test {@link _AvailableJobsResponse#equals(java.lang.Object)} for equality.
    */
    @Test
    void testEquals() {
        _AvailableJobsResponse obj1 = new _AvailableJobsResponse();
        obj1.setAvailableJobsResult(new mygrid.web.ArrayOfJob());
        _AvailableJobsResponse obj2 = new _AvailableJobsResponse();
        obj2.setAvailableJobsResult(new mygrid.web.ArrayOfJob());
        assertTrue(obj1.equals(obj2));
    }
}

// _AvailableJobsResponse_11Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api