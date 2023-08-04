// _Progress_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains ten unit test cases for the {@link _Progress#getTypeDesc()} method.
*/
class _Progress_1Test {

    /**
    * Test {@link _Progress#getTypeDesc()} for the case when the {@link _Progress#job} field is null.
    */
    @Test
    void getTypeDesc_1() {
        _Progress _progress = new _Progress();
        org.apache.axis.description.TypeDesc typeDesc = _progress.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals(1, typeDesc.getFields().length);
        assertEquals("job", typeDesc.getFields()[0].getName());
        assertEquals("http://tempuri.org/", typeDesc.getFields()[0].getXmlType().getNamespaceURI());
        assertEquals("Job", typeDesc.getFields()[0].getXmlType().getLocalPart());
        assertEquals(0, typeDesc.getFields()[0].getMinOccurs());
    }

    /**
    * Test {@link _Progress#getTypeDesc()} for the case when the {@link _Progress#job} field is not null.
    */
    @Test
    void getTypeDesc_2() {
        _Progress _progress = new _Progress();
        _progress.setJob(new mygrid.web.Job());
        org.apache.axis.description.TypeDesc typeDesc = _progress.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals(1, typeDesc.getFields().length);
        assertEquals("job", typeDesc.getFields()[0].getName());
        assertEquals("http://tempuri.org/", typeDesc.getFields()[0].getXmlType().getNamespaceURI());
        assertEquals("Job", typeDesc.getFields()[0].getXmlType().getLocalPart());
        assertEquals(0, typeDesc.getFields()[0].getMinOccurs());
    }
}

// _Progress_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains ten unit test cases for the {@link _Progress#getJob()} method.
*/
class _Progress_2Test {
		
    /**
    * Test {@link _Progress#getJob()} for the case when the {@link _Progress#job} field is null.
    */
    @Test
    void getJob_1() {
        _Progress _progress = new _Progress();
        assertNull(_progress.getJob());
    }

    /**
    * Test {@link _Progress#getJob()} for the case when the {@link _Progress#job} field is not null.
    */
    @Test
    void getJob_2() {
        _Progress _progress = new _Progress();
        _progress.setJob(new mygrid.web.Job());
        assertNotNull(_progress.getJob());
    }
}

// _Progress_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains ten unit test cases for the {@link _Progress#setJob(mygrid.web.Job)} method.
*/
class _Progress_3Test {
		
    /**
    * Test {@link _Progress#setJob(mygrid.web.Job)} for the case when the {@link _Progress#job} field is null.
    */
    @Test
    void setJob_1() {
        _Progress _progress = new _Progress();
        _progress.setJob(new mygrid.web.Job());
        assertNotNull(_progress.getJob());
    }

    /**
    * Test {@link _Progress#setJob(mygrid.web.Job)} for the case when the {@link _Progress#job} field is not null.
    */
    @Test
    void setJob_2() {
        _Progress _progress = new _Progress();
        _progress.setJob(new mygrid.web.Job());
        assertNotNull(_progress.getJob());
    }
}

// _Progress_4Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains ten unit test cases for the {@link _Progress#equals(java.lang.Object)} method.
*/
class _Progress_4Test {
		
    /**
    * Test {@link _Progress#equals(java.lang.Object)} for the case when the {@link _Progress#job} field is null.
    */
    @Test
    void equals_1() {
        _Progress _progress1 = new _Progress();
        _Progress _progress2 = new _Progress();
        assertTrue(_progress1.equals(_progress2));
    }

    /**
    * Test {@link _Progress#equals(java.lang.Object)} for the case when the {@link _Progress#job} field is not null.
    */
    @Test
    void equals_2() {
        _Progress _progress1 = new _Progress();
        _Progress _progress2 = new _Progress();
        _progress1.setJob(new mygrid.web.Job());
        assertFalse(_progress1.equals(_progress2));
    }

    /**
    * Test {@link _Progress#equals(java.lang.Object)} for the case when the {@link _Progress#job} field is null.
    */
    @Test
    void equals_3() {
        _Progress _progress1 = new _Progress();
        _Progress _progress2 = new _Progress();
        _progress2.setJob(new mygrid.web.Job());
        assertFalse(_progress1.equals(_progress2));
    }

    /**
    * Test {@link _Progress#equals(java.lang.Object)} for the case when the {@link _Progress#job} field is not null.
    */
    @Test
    void equals_4() {
        _Progress _progress1 = new _Progress();
        _Progress _progress2 = new _Progress();
        _progress1.setJob(new mygrid.web.Job());
        _progress2.setJob(new mygrid.web.Job());
        assertTrue(_progress1.equals(_progress2));
    }
}

// _Progress_5Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains ten unit test cases for the {@link _Progress#hashCode()} method.
*/
class _Progress_5Test {
		
    /**
    * Test {@link _Progress#hashCode()} for the case when the {@link _Progress#job} field is null.
    */
    @Test
    void hashCode_1() {
        _Progress _progress = new _Progress();
        assertEquals(0, _progress.hashCode());
    }

    /**
    * Test {@link _Progress#hashCode()} for the case when the {@link _Progress#job} field is not null.
    */
    @Test
    void hashCode_2() {
        _Progress _progress = new _Progress();
        _progress.setJob(new mygrid.web.Job());
        assertEquals(1, _progress.hashCode());
    }
}

// _Progress_6Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains ten unit test cases for the {@link _Progress#toString()} method.
*/
class _Progress_6Test {
		
    /**
    * Test {@link _Progress#toString()} for the case when the {@link _Progress#job} field is null.
    */
    @Test
    void toString_1() {
        _Progress _progress = new _Progress();
        assertEquals("mygrid.web._Progress[job=null]", _progress.toString());
    }

    /**
    * Test {@link _Progress#toString()} for the case when the {@link _Progress#job} field is not null.
    */
    @Test
    void toString_2() {
        _Progress _progress = new _Progress();
        _progress.setJob(new mygrid.web.Job());
        assertEquals("mygrid.web._Progress[job=mygrid.web.Job[id=null,status=null,progress=null,message=null]]", _progress.toString());
    }
}

// _Progress_7Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains ten unit test cases for the {@link _Progress#equals(java.lang.Object)} method.
*/
class _Progress_7Test {
		
    /**
    * Test {@link _Progress#equals(java.lang.Object)} for the case when the {@link _Progress#job} field is null.
    */
    @Test
    void equals_1() {
        _Progress _progress1 = new _Progress();
        _Progress _progress2 = new _Progress();
        assertTrue(_progress1.equals(_progress2));
   