// _Request_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#getTypeDesc()} method.
*/
class _Request_1Test {

    /**
    * Test {@link _Request#getTypeDesc()} for the case when the {@link _Request} object is null.
    */
    @Test
    void testGetTypeDesc_0() {
        _Request request = null;
        assertNull(request.getTypeDesc());
    }

    /**
    * Test {@link _Request#getTypeDesc()} for the case when the {@link _Request} object is not null.
    */
    @Test
    void testGetTypeDesc_1() {
        _Request request = new _Request();
        assertNotNull(request.getTypeDesc());
    }
}

// _Request_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#getJob()} method.
*/
class _Request_2Test {
		
    /**
    * Test {@link _Request#getJob()} for the case when the {@link _Request} object is null.
    */
    @Test
    void testGetJob_0() {
        _Request request = null;
        assertNull(request.getJob());
    }

    /**
    * Test {@link _Request#getJob()} for the case when the {@link _Request} object is not null.
    */
    @Test
    void testGetJob_1() {
        _Request request = new _Request();
        assertNull(request.getJob());
    }

    /**
    * Test {@link _Request#getJob()} for the case when the {@link _Request} object is not null and the {@link mygrid.web.Job} object is not null.
    */
    @Test
    void testGetJob_2() {
        _Request request = new _Request();
        mygrid.web.Job job = new mygrid.web.Job();
        request.setJob(job);
        assertNotNull(request.getJob());
    }
}

// _Request_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#setJob(mygrid.web.Job)} method.
*/
class _Request_3Test {
		
    /**
    * Test {@link _Request#setJob(mygrid.web.Job)} for the case when the {@link _Request} object is null.
    */
    @Test
    void testSetJob_0() {
        _Request request = null;
        mygrid.web.Job job = new mygrid.web.Job();
        request.setJob(job);
        assertNull(request.getJob());
    }

    /**
    * Test {@link _Request#setJob(mygrid.web.Job)} for the case when the {@link _Request} object is not null.
    */
    @Test
    void testSetJob_1() {
        _Request request = new _Request();
        mygrid.web.Job job = new mygrid.web.Job();
        request.setJob(job);
        assertNotNull(request.getJob());
    }
}

// _Request_4Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#equals(java.lang.Object)} method.
*/
class _Request_4Test {
		
    /**
    * Test {@link _Request#equals(java.lang.Object)} for the case when the {@link _Request} object is null.
    */
    @Test
    void testEquals_0() {
        _Request request = null;
        _Request request2 = null;
        assertTrue(request.equals(request2));
    }

    /**
    * Test {@link _Request#equals(java.lang.Object)} for the case when the {@link _Request} object is not null.
    */
    @Test
    void testEquals_1() {
        _Request request = new _Request();
        _Request request2 = new _Request();
        assertTrue(request.equals(request2));
    }

    /**
    * Test {@link _Request#equals(java.lang.Object)} for the case when the {@link _Request} object is not null and the {@link mygrid.web.Job} object is not null.
    */
    @Test
    void testEquals_2() {
        _Request request = new _Request();
        mygrid.web.Job job = new mygrid.web.Job();
        request.setJob(job);
        _Request request2 = new _Request();
        request2.setJob(job);
        assertTrue(request.equals(request2));
    }

    /**
    * Test {@link _Request#equals(java.lang.Object)} for the case when the {@link _Request} object is not null and the {@link mygrid.web.Job} object is not null.
    */
    @Test
    void testEquals_3() {
        _Request request = new _Request();
        mygrid.web.Job job = new mygrid.web.Job();
        request.setJob(job);
        _Request request2 = new _Request();
        mygrid.web.Job job2 = new mygrid.web.Job();
        request2.setJob(job2);
        assertFalse(request.equals(request2));
    }
}

// _Request_5Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#hashCode()} method.
*/
class _Request_5Test {
		
    /**
    * Test {@link _Request#hashCode()} for the case when the {@link _Request} object is null.
    */
    @Test
    void testHashCode_0() {
        _Request request = null;
        assertEquals(0, request.hashCode());
    }

    /**
    * Test {@link _Request#hashCode()} for the case when the {@link _Request} object is not null.
    */
    @Test
    void testHashCode_1() {
        _Request request = new _Request();
        assertEquals(0, request.hashCode());
    }

    /**
    * Test {@link _Request#hashCode()} for the case when the {@link _Request} object is not null and the {@link mygrid.web.Job} object is not null.
    */
    @Test
    void testHashCode_2() {
        _Request request = new _Request();
        mygrid.web.Job job = new mygrid.web.Job();
        request.setJob(job);
        assertEquals(1, request.hashCode());
    }
}

// _Request_6Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#toString()} method.
*/
class _Request_6Test {
		
    /**
    * Test {@link _Request#toString()} for the case when the {@link _Request} object is null.
    */
    @Test
    void testToString_0() {
        _Request request = null;
        assertEquals("Request", request.toString());
    }

    /**
    * Test {@link _Request#toString()} for the case when the {@link _Request} object is not null.
    */
    @Test
    void testToString_1() {
        _Request request = new _Request();
        assertEquals("Request", request.toString());
    }

    /**
    * Test {@link _Request#toString()} for the case when the {@link _Request} object is not null and the {@link mygrid.web.Job} object is not null.
    */
    @Test
    void testToString_2() {
        _Request request = new _Request();
        mygrid.web.Job job = new mygrid.web.Job();
        request.setJob(job);
        assertEquals("Request", request.toString());
    }
}

// _Request_7Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#getRequest(java.lang.String)} method.
*/
class _Request_7Test {
		
    /**
    * Test {@link _Request#getRequest(java.lang.String)} for the case when the {@link _Request} object is null.
    */
    @Test
    void testGetRequest_0() {
        _Request request = null;
        assertNull(request.getRequest(null));
    }

    /**
    * Test {@link _Request#getRequest(java.lang