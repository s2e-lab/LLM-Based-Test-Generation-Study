// _AvailableJobs_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains ten unit test cases for the {@link _AvailableJobs#getTypeDesc()} method.
*/
class _AvailableJobs_1Test {

    /**
    * Test {@link _AvailableJobs#getTypeDesc()} for the following conditions:
    * <ul>
    * <li>The value of the {@link _AvailableJobs#getTypeDesc()} method is not null.</li>
    * <li>The value of the {@link _AvailableJobs#getTypeDesc()} method is an instance of {@link org.apache.axis.description.TypeDesc}.</li>
    * <li>The value of the {@link _AvailableJobs#getTypeDesc()} method is equal to the value of the {@link org.apache.axis.description.TypeDesc} instance returned by the {@link org.apache.axis.description.TypeDesc#getTypeDesc()} method.</li>
    * </ul>
    */
    @Test
    void testGetTypeDesc_0() {
        _AvailableJobs obj = new _AvailableJobs();
        assertNotNull(obj.getTypeDesc());
        assertTrue(obj.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);
        assertEquals(obj.getTypeDesc(), org.apache.axis.description.TypeDesc.getTypeDesc());
    }
}

// _AvailableJobs_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains ten unit test cases for the {@link _AvailableJobs#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _AvailableJobs_2Test {
		
    /**
    * Test {@link _AvailableJobs#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} for the following conditions:
    * <ul>
    * <li>The value of the {@link _AvailableJobs#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method is not null.</li>
    * <li>The value of the {@link _AvailableJobs#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method is an instance of {@link org.apache.axis.encoding.Serializer}.</li>
    * <li>The value of the {@link _AvailableJobs#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method is equal to the value of the {@link org.apache.axis.encoding.Serializer#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.</li>
    * </ul>
    */
    @Test
    void testGetSerializer_0() {
        _AvailableJobs obj = new _AvailableJobs();
        assertNotNull(obj.getSerializer("1", null, null));
        assertTrue(obj.getSerializer("1", null, null) instanceof org.apache.axis.encoding.Serializer);
        assertEquals(obj.getSerializer("1", null, null), org.apache.axis.encoding.Serializer.getSerializer("1", null, null));
    }
}

// _AvailableJobs_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains ten unit test cases for the {@link _AvailableJobs#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _AvailableJobs_3Test {
		
    /**
    * Test {@link _AvailableJobs#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} for the following conditions:
    * <ul>
    * <li>The value of the {@link _AvailableJobs#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method is not null.</li>
    * <li>The value of the {@link _AvailableJobs#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method is an instance of {@link org.apache.axis.encoding.Deserializer}.</li>
    * <li>The value of the {@link _AvailableJobs#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method is equal to the value of the {@link org.apache.axis.encoding.Deserializer#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.</li>
    * </ul>
    */
    @Test
    void testGetDeserializer_0() {
        _AvailableJobs obj = new _AvailableJobs();
        assertNotNull(obj.getDeserializer("1", null, null));
        assertTrue(obj.getDeserializer("1", null, null) instanceof org.apache.axis.encoding.Deserializer);
        assertEquals(obj.getDeserializer("1", null, null), org.apache.axis.encoding.Deserializer.getDeserializer("1", null, null));
    }
}

// _AvailableJobs_4Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains ten unit test cases for the {@link _AvailableJobs#equals(java.lang.Object)} method.
*/
class _AvailableJobs_4Test {
		
    /**
    * Test {@link _AvailableJobs#equals(java.lang.Object)} for the following conditions:
    * <ul>
    * <li>The value of the {@link _AvailableJobs#equals(java.lang.Object)} method is not null.</li>
    * <li>The value of the {@link _AvailableJobs#equals(java.lang.Object)} method is an instance of {@link _AvailableJobs}.</li>
    * <li>The value of the {@link _AvailableJobs#equals(java.lang.Object)} method is equal to the value of the {@link _AvailableJobs#equals(java.lang.Object)} method.</li>
    * </ul>
    */
    @Test
    void testEquals_0() {
        _AvailableJobs obj = new _AvailableJobs();
        assertNotNull(obj.equals(new _AvailableJobs()));
        assertTrue(obj.equals(new _AvailableJobs()) instanceof _AvailableJobs);
        assertEquals(obj.equals(new _AvailableJobs()), new _AvailableJobs().equals(new _AvailableJobs()));
    }
}

// _AvailableJobs_5Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains ten unit test cases for the {@link _AvailableJobs#hashCode()} method.
*/
class _AvailableJobs_5Test {
		
    /**
    * Test {@link _AvailableJobs#hashCode()} for the following conditions:
    * <ul>
    * <li>The value of the {@link _AvailableJobs#hashCode()} method is not null.</li>
    * <li>The value of the {@link _AvailableJobs#hashCode()} method is an instance of {@link Integer}.</li>
    * <li>The value of the {@link _AvailableJobs#hashCode()} method is equal to the value of the {@link Integer#hashCode()} method.</li>
    * </ul>
    */
    @Test
    void testHashCode_0() {
        _AvailableJobs obj = new _AvailableJobs();
        assertNotNull(obj.hashCode());
        assertTrue(obj.hashCode() instanceof Integer);
        assertEquals(obj.hashCode(), new Integer(new _AvailableJobs().hashCode()));
    }
}

// _AvailableJobs_6Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains ten unit test cases for the {@link _AvailableJobs#toString()} method.
*/
class _AvailableJobs_6Test {
		
    /**
    * Test {@link _AvailableJobs#toString()} for the following conditions:
    * <ul>
    * <li>The value of the {@link _AvailableJobs#toString()} method is not null.</li>
    * <li>The value of the {@link _AvailableJobs#toString()} method is an instance of {@link String}.</li>
    * <li>The value of the {@link _AvailableJobs#toString()} method is equal to the value of the {@link String#toString()} method.</li>
    * </ul>
    */
    @Test
    void testToString_0() {
        _AvailableJobs obj = new _AvailableJobs();
        assertNotNull(obj.toString());
        assertTrue(obj.toString() instanceof String);
        assertEquals(obj.toString(), new String(new _AvailableJobs().toString()));
    }
}

// _AvailableJobs