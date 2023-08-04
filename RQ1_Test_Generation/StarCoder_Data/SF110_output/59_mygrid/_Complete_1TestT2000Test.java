// _Complete_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains ten unit test cases for the {@link _Complete#getTypeDesc()} method.
*/
class _Complete_1Test {

    /**
    * Test {@link _Complete#getTypeDesc()} for the property {@link _Complete#job}.
    */
    @Test
    void getTypeDesc_job() {
        org.apache.axis.description.TypeDesc typeDesc = _Complete.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals(1, typeDesc.getFields().length);
        org.apache.axis.description.ElementDesc elemField = typeDesc.getFields()[0];
        assertNotNull(elemField);
        assertEquals("job", elemField.getFieldName());
        assertEquals("http://tempuri.org/", elemField.getXmlName().getNamespaceURI());
        assertEquals("Job", elemField.getXmlType().getName());
        assertEquals(0, elemField.getMinOccurs());
    }
}

// _Complete_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains ten unit test cases for the {@link _Complete#getJob()} method.
*/
class _Complete_2Test {
		
    /**
    * Test {@link _Complete#getJob()} for the property {@link _Complete#job}.
    */
    @Test
    void getJob() {
        _Complete obj = new _Complete();
        obj.setJob(new mygrid.web.Job());
        assertNotNull(obj.getJob());
    }
}

// _Complete_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains ten unit test cases for the {@link _Complete#setJob(mygrid.web.Job)} method.
*/
class _Complete_3Test {
		
    /**
    * Test {@link _Complete#setJob(mygrid.web.Job)} for the property {@link _Complete#job}.
    */
    @Test
    void setJob() {
        _Complete obj = new _Complete();
        obj.setJob(new mygrid.web.Job());
        assertNotNull(obj.getJob());
    }
}

// _Complete_4Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains ten unit test cases for the {@link _Complete#equals(java.lang.Object)} method.
*/
class _Complete_4Test {
		
    /**
    * Test {@link _Complete#equals(java.lang.Object)} for the property {@link _Complete#job}.
    */
    @Test
    void equals_job() {
        _Complete obj = new _Complete();
        obj.setJob(new mygrid.web.Job());
        _Complete obj2 = new _Complete();
        obj2.setJob(new mygrid.web.Job());
        assertTrue(obj.equals(obj2));
    }
}

// _Complete_5Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains ten unit test cases for the {@link _Complete#hashCode()} method.
*/
class _Complete_5Test {
		
    /**
    * Test {@link _Complete#hashCode()} for the property {@link _Complete#job}.
    */
    @Test
    void hashCode_job() {
        _Complete obj = new _Complete();
        obj.setJob(new mygrid.web.Job());
        int result = obj.hashCode();
        assertEquals(1231, result);
    }
}

// _Complete_6Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains ten unit test cases for the {@link _Complete#toString()} method.
*/
class _Complete_6Test {
		
    /**
    * Test {@link _Complete#toString()} for the property {@link _Complete#job}.
    */
    @Test
    void toString_job() {
        _Complete obj = new _Complete();
        obj.setJob(new mygrid.web.Job());
        String result = obj.toString();
        assertNotNull(result);
    }
}

// _Complete_7Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains ten unit test cases for the {@link _Complete#equals(java.lang.Object)} method.
*/
class _Complete_7Test {
		
    /**
    * Test {@link _Complete#equals(java.lang.Object)} for the property {@link _Complete#job}.
    */
    @Test
    void equals_job_null() {
        _Complete obj = new _Complete();
        obj.setJob(null);
        _Complete obj2 = new _Complete();
        obj2.setJob(null);
        assertTrue(obj.equals(obj2));
    }
}

// _Complete_8Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains ten unit test cases for the {@link _Complete#hashCode()} method.
*/
class _Complete_8Test {
		
    /**
    * Test {@link _Complete#hashCode()} for the property {@link _Complete#job}.
    */
    @Test
    void hashCode_job_null() {
        _Complete obj = new _Complete();
        obj.setJob(null);
        int result = obj.hashCode();
        assertEquals(1231, result);
    }
}

// _Complete_9Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains ten unit test cases for the {@link _Complete#toString()} method.
*/
class _Complete_9Test {
		
    /**
    * Test {@link _Complete#toString()} for the property {@link _Complete#job}.
    */
    @Test
    void toString_job_null() {
        _Complete obj = new _Complete();
        obj.setJob(null);
        String result = obj.toString();
        assertNotNull(result);
    }
}

// _Complete_10Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains ten unit test cases for the {@link _Complete#equals(java.lang.Object)} method.
*/
class _Complete_10Test {
		
    /**
    * Test {@link _Complete#equals(java.lang.Object)} for the property {@link _Complete#job}.
    */
    @Test
    void equals_job_not_equal() {
        _Complete obj = new _Complete();
        obj.setJob(new mygrid.web.Job());
        _Complete obj2 = new _Complete();
        obj2.setJob(new mygrid.web.Job());
        assertFalse(obj.equals(obj2));
    }
}

// _Complete_11Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains ten unit test cases for the {@link _Complete#hashCode()} method.
*/
class _Complete_11Test {
		
    /**
    * Test {@link _Complete#hashCode()} for the property {@link _Complete#job}.
    */
    @Test
    void hashCode_job_not_equal() {
        _Complete obj = new _Complete();
        obj.setJob(new mygrid.web.Job());
        _Complete obj2 = new _Complete();
        obj2.setJob(new mygrid.web.Job());
        assertFalse(obj.hashCode() == obj2.hashCode());
    }
}

// _Complete_12Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains ten unit test cases for the {@link _Complete#toString()} method.
*/
class _Complete_12Test {
		
    /**
    * Test {@link _Complete#toString()}