// _GetEngineResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains ten unit test cases for the {@link _GetEngineResponse#getTypeDesc()} method.
*/
class _GetEngineResponse_1Test {

    /**
    * Test {@link _GetEngineResponse#getTypeDesc()} for type {@link _GetEngineResponse}.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _GetEngineResponse.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("http://tempuri.org/", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("GetEngineResponse", typeDesc.getXmlType().getLocalPart());
    }
}

// _GetEngineResponse_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains ten unit test cases for the {@link _GetEngineResponse#getGetEngineResult()} method.
*/
class _GetEngineResponse_2Test {
		
    /**
    * Test {@link _GetEngineResponse#getGetEngineResult()} for type {@link _GetEngineResponse}.
    */
    @Test
    void testGetGetEngineResult() {
        _GetEngineResponse obj = new _GetEngineResponse();
        obj.setGetEngineResult(new mygrid.web.Engine());
        mygrid.web.Engine value = obj.getGetEngineResult();
        assertNotNull(value);
    }
}

// _GetEngineResponse_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains ten unit test cases for the {@link _GetEngineResponse#setGetEngineResult(mygrid.web.Engine)} method.
*/
class _GetEngineResponse_3Test {
		
    /**
    * Test {@link _GetEngineResponse#setGetEngineResult(mygrid.web.Engine)} for type {@link _GetEngineResponse}.
    */
    @Test
    void testSetGetEngineResult() {
        _GetEngineResponse obj = new _GetEngineResponse();
        obj.setGetEngineResult(new mygrid.web.Engine());
        mygrid.web.Engine value = obj.getGetEngineResult();
        assertNotNull(value);
    }
}

// _GetEngineResponse_4Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains ten unit test cases for the {@link _GetEngineResponse#equals(java.lang.Object)} method.
*/
class _GetEngineResponse_4Test {
		
    /**
    * Test {@link _GetEngineResponse#equals(java.lang.Object)} for type {@link _GetEngineResponse}.
    */
    @Test
    void testEquals() {
        _GetEngineResponse obj = new _GetEngineResponse();
        obj.setGetEngineResult(new mygrid.web.Engine());
        _GetEngineResponse value = new _GetEngineResponse();
        value.setGetEngineResult(new mygrid.web.Engine());
        boolean result = obj.equals(value);
        assertTrue(result);
    }
}

// _GetEngineResponse_5Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains ten unit test cases for the {@link _GetEngineResponse#hashCode()} method.
*/
class _GetEngineResponse_5Test {
		
    /**
    * Test {@link _GetEngineResponse#hashCode()} for type {@link _GetEngineResponse}.
    */
    @Test
    void testHashCode() {
        _GetEngineResponse obj = new _GetEngineResponse();
        obj.setGetEngineResult(new mygrid.web.Engine());
        int result = obj.hashCode();
        assertEquals(107269324, result);
    }
}

// _GetEngineResponse_6Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains ten unit test cases for the {@link _GetEngineResponse#toString()} method.
*/
class _GetEngineResponse_6Test {
		
    /**
    * Test {@link _GetEngineResponse#toString()} for type {@link _GetEngineResponse}.
    */
    @Test
    void testToString() {
        _GetEngineResponse obj = new _GetEngineResponse();
        obj.setGetEngineResult(new mygrid.web.Engine());
        String result = obj.toString();
        assertNotNull(result);
    }
}

// _GetEngineResponse_7Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains ten unit test cases for the {@link _GetEngineResponse#getGetEngineResult()} method.
*/
class _GetEngineResponse_7Test {
		
    /**
    * Test {@link _GetEngineResponse#getGetEngineResult()} for type {@link _GetEngineResponse}.
    */
    @Test
    void testGetGetEngineResult() {
        _GetEngineResponse obj = new _GetEngineResponse();
        obj.setGetEngineResult(new mygrid.web.Engine());
        mygrid.web.Engine value = obj.getGetEngineResult();
        assertNotNull(value);
    }
}

// _GetEngineResponse_8Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains ten unit test cases for the {@link _GetEngineResponse#setGetEngineResult(mygrid.web.Engine)} method.
*/
class _GetEngineResponse_8Test {
		
    /**
    * Test {@link _GetEngineResponse#setGetEngineResult(mygrid.web.Engine)} for type {@link _GetEngineResponse}.
    */
    @Test
    void testSetGetEngineResult() {
        _GetEngineResponse obj = new _GetEngineResponse();
        obj.setGetEngineResult(new mygrid.web.Engine());
        mygrid.web.Engine value = obj.getGetEngineResult();
        assertNotNull(value);
    }
}

// _GetEngineResponse_9Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains ten unit test cases for the {@link _GetEngineResponse#equals(java.lang.Object)} method.
*/
class _GetEngineResponse_9Test {
		
    /**
    * Test {@link _GetEngineResponse#equals(java.lang.Object)} for type {@link _GetEngineResponse}.
    */
    @Test
    void testEquals() {
        _GetEngineResponse obj = new _GetEngineResponse();
        obj.setGetEngineResult(new mygrid.web.Engine());
        _GetEngineResponse value = new _GetEngineResponse();
        value.setGetEngineResult(new mygrid.web.Engine());
        boolean result = obj.equals(value);
        assertTrue(result);
    }
}

// _GetEngineResponse_10Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains ten unit test cases for the {@link _GetEngineResponse#hashCode()} method.
*/
class _GetEngineResponse_10Test {
		
    /**
    * Test {@link _GetEngineResponse#hashCode()} for type {@link _GetEngineResponse}.
    */
    @Test
    void testHashCode() {
        _GetEngineResponse obj = new _GetEngineResponse();
        obj.setGetEngineResult(new mygrid.web.Engine());
        int result = obj.hashCode();
        assertEquals(107269324, result);
    }
}

// _GetEngineResponse_11Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains ten unit test cases for the {@link _GetEngineResponse#toString()} method.
*/
class _GetEngineResponse_11Test {
		
    /**
    * Test {@link _GetEngineResponse#toString()} for type {@link _GetEngineResponse}.
    */
    @Test
    void testToString