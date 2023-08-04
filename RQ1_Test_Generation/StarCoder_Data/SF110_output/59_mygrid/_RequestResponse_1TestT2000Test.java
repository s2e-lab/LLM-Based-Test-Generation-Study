// _RequestResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains ten unit test cases for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponse_1Test {

    /**
    * Test {@link _RequestResponse#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _RequestResponse.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals(typeDesc.getXmlType(), new javax.xml.namespace.QName("http://tempuri.org/", ">RequestResponse"));
        assertEquals(typeDesc.getFieldCount(), 1);
        org.apache.axis.description.ElementDesc elemField = typeDesc.getFieldDesc(0);
        assertNotNull(elemField);
        assertEquals(elemField.getXmlName(), new javax.xml.namespace.QName("http://tempuri.org/", "RequestResult"));
        assertEquals(elemField.getXmlType(), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
    }
}

// _RequestResponse_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains ten unit test cases for the {@link _RequestResponse#equals(java.lang.Object)} method.
*/
class _RequestResponse_2Test {
		
    /**
    * Test {@link _RequestResponse#equals(java.lang.Object)} method.
    */
    @Test
    void testEquals() {
        _RequestResponse obj1 = new _RequestResponse();
        obj1.setRequestResult(true);
        _RequestResponse obj2 = new _RequestResponse();
        obj2.setRequestResult(true);
        assertTrue(obj1.equals(obj2));
    }
}

// _RequestResponse_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains ten unit test cases for the {@link _RequestResponse#hashCode()} method.
*/
class _RequestResponse_3Test {
		
    /**
    * Test {@link _RequestResponse#hashCode()} method.
    */
    @Test
    void testHashCode() {
        _RequestResponse obj1 = new _RequestResponse();
        obj1.setRequestResult(true);
        _RequestResponse obj2 = new _RequestResponse();
        obj2.setRequestResult(true);
        assertEquals(obj1.hashCode(), obj2.hashCode());
    }
}

// _RequestResponse_4Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains ten unit test cases for the {@link _RequestResponse#getRequestResult()} method.
*/
class _RequestResponse_4Test {
		
    /**
    * Test {@link _RequestResponse#getRequestResult()} method.
    */
    @Test
    void testGetRequestResult() {
        _RequestResponse obj = new _RequestResponse();
        obj.setRequestResult(true);
        assertEquals(true, obj.getRequestResult());
    }
}

// _RequestResponse_5Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains ten unit test cases for the {@link _RequestResponse#setRequestResult(boolean)} method.
*/
class _RequestResponse_5Test {
		
    /**
    * Test {@link _RequestResponse#setRequestResult(boolean)} method.
    */
    @Test
    void testSetRequestResult() {
        _RequestResponse obj = new _RequestResponse();
        obj.setRequestResult(true);
        assertEquals(true, obj.getRequestResult());
    }
}

// _RequestResponse_6Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains ten unit test cases for the {@link _RequestResponse#toString()} method.
*/
class _RequestResponse_6Test {
		
    /**
    * Test {@link _RequestResponse#toString()} method.
    */
    @Test
    void testToString() {
        _RequestResponse obj = new _RequestResponse();
        obj.setRequestResult(true);
        String string = obj.toString();
        assertNotNull(string);
        assertTrue(string.length() > 0);
    }
}

// _RequestResponse_7Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains ten unit test cases for the {@link _RequestResponse#getRequestResult()} method.
*/
class _RequestResponse_7Test {
		
    /**
    * Test {@link _RequestResponse#getRequestResult()} method.
    */
    @Test
    void testGetRequestResult() {
        _RequestResponse obj = new _RequestResponse();
        obj.setRequestResult(true);
        assertEquals(true, obj.getRequestResult());
    }
}

// _RequestResponse_8Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains ten unit test cases for the {@link _RequestResponse#setRequestResult(boolean)} method.
*/
class _RequestResponse_8Test {
		
    /**
    * Test {@link _RequestResponse#setRequestResult(boolean)} method.
    */
    @Test
    void testSetRequestResult() {
        _RequestResponse obj = new _RequestResponse();
        obj.setRequestResult(true);
        assertEquals(true, obj.getRequestResult());
    }
}

// _RequestResponse_9Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains ten unit test cases for the {@link _RequestResponse#toString()} method.
*/
class _RequestResponse_9Test {
		
    /**
    * Test {@link _RequestResponse#toString()} method.
    */
    @Test
    void testToString() {
        _RequestResponse obj = new _RequestResponse();
        obj.setRequestResult(true);
        String string = obj.toString();
        assertNotNull(string);
        assertTrue(string.length() > 0);
    }
}

// _RequestResponse_10Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains ten unit test cases for the {@link _RequestResponse#equals(java.lang.Object)} method.
*/
class _RequestResponse_10Test {
		
    /**
    * Test {@link _RequestResponse#equals(java.lang.Object)} method.
    */
    @Test
    void testEquals() {
        _RequestResponse obj1 = new _RequestResponse();
        obj1.setRequestResult(true);
        _RequestResponse obj2 = new _RequestResponse();
        obj2.setRequestResult(true);
        assertTrue(obj1.equals(obj2));
    }
}

// _RequestResponse_11Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains ten unit test cases for the {@link _RequestResponse#hashCode()} method.
*/
class _RequestResponse_11Test {
		
    /**
    * Test {@link _RequestResponse#hashCode()} method.
    */
    @Test
    void testHashCode() {
        _RequestResponse obj1 = new _RequestResponse();
        obj1.setRequestResult(true);
        _RequestResponse obj2 = new _RequestResponse();
        obj2.setRequestResult(true);
        assertEquals(obj1.hashCode(), obj2.hashCode());
    }
}

// _RequestResponse_12Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains ten unit test cases for the {@link _RequestResponse#getRequestResult()} method.
*/
class _RequestResponse_12Test {
		
    /**
    * Test {@link _RequestResponse#getRequestResult()} method.
    */
    @Test
    void testGetRequestResult() {
        _RequestResponse obj = new _RequestResponse();
        obj.setRequestResult