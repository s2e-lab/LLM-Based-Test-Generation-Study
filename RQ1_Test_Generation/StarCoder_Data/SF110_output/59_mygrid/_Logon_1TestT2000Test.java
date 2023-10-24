// _Logon_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#getTypeDesc()} method.
*/
class _Logon_1Test {

    /**
    * Test {@link _Logon#getTypeDesc()} for the type metadata.
    */
    @Test
    void getTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _Logon.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("http://tempuri.org/", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("Logon", typeDesc.getXmlType().getLocalPart());
        assertEquals(1, typeDesc.getFields().length);
        org.apache.axis.description.ElementDesc elemField = typeDesc.getFields()[0];
        assertEquals("clusterUrl", elemField.getFieldName());
        assertEquals("clusterUrl", elemField.getXmlName().getLocalPart());
        assertEquals("http://www.w3.org/2001/XMLSchema", elemField.getXmlName().getNamespaceURI());
        assertEquals("string", elemField.getXmlType().getLocalPart());
        assertEquals("http://www.w3.org/2001/XMLSchema", elemField.getXmlType().getNamespaceURI());
        assertEquals(0, elemField.getMinOccurs());
    }
}

// _Logon_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _Logon_2Test {
		
    /**
    * Test {@link _Logon#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} for the serializer.
    */
    @Test
    void getSerializer() {
        org.apache.axis.encoding.Serializer serializer = _Logon.getSerializer(null, null, null);
        assertNotNull(serializer);
    }
}

// _Logon_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _Logon_3Test {
		
    /**
    * Test {@link _Logon#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} for the deserializer.
    */
    @Test
    void getDeserializer() {
        org.apache.axis.encoding.Deserializer deserializer = _Logon.getDeserializer(null, null, null);
        assertNotNull(deserializer);
    }
}

// _Logon_4Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#equals(java.lang.Object)} method.
*/
class _Logon_4Test {
		
    /**
    * Test {@link _Logon#equals(java.lang.Object)} for the equality.
    */
    @Test
    void equals() {
        _Logon obj1 = new _Logon();
        obj1.setClusterUrl("clusterUrl");
        obj1.setUser("user");
        obj1.setPassword("password");
        _Logon obj2 = new _Logon();
        obj2.setClusterUrl("clusterUrl");
        obj2.setUser("user");
        obj2.setPassword("password");
        assertTrue(obj1.equals(obj2));
    }
}

// _Logon_5Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#hashCode()} method.
*/
class _Logon_5Test {
		
    /**
    * Test {@link _Logon#hashCode()} for the hash code.
    */
    @Test
    void hashCode() {
        _Logon obj1 = new _Logon();
        obj1.setClusterUrl("clusterUrl");
        obj1.setUser("user");
        obj1.setPassword("password");
        _Logon obj2 = new _Logon();
        obj2.setClusterUrl("clusterUrl");
        obj2.setUser("user");
        obj2.setPassword("password");
        assertEquals(obj1.hashCode(), obj2.hashCode());
    }
}

// _Logon_6Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#setClusterUrl(java.lang.String)} method.
*/
class _Logon_6Test {
		
    /**
    * Test {@link _Logon#setClusterUrl(java.lang.String)} for the setter.
    */
    @Test
    void setClusterUrl() {
        _Logon obj = new _Logon();
        obj.setClusterUrl("clusterUrl");
        assertEquals("clusterUrl", obj.getClusterUrl());
    }
}

// _Logon_7Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#setUser(java.lang.String)} method.
*/
class _Logon_7Test {
		
    /**
    * Test {@link _Logon#setUser(java.lang.String)} for the setter.
    */
    @Test
    void setUser() {
        _Logon obj = new _Logon();
        obj.setUser("user");
        assertEquals("user", obj.getUser());
    }
}

// _Logon_8Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#setPassword(java.lang.String)} method.
*/
class _Logon_8Test {
		
    /**
    * Test {@link _Logon#setPassword(java.lang.String)} for the setter.
    */
    @Test
    void setPassword() {
        _Logon obj = new _Logon();
        obj.setPassword("password");
        assertEquals("password", obj.getPassword());
    }
}

// _Logon_9Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#getClusterUrl()} method.
*/
class _Logon_9Test {
		
    /**
    * Test {@link _Logon#getClusterUrl()} for the getter.
    */
    @Test
    void getClusterUrl() {
        _Logon obj = new _Logon();
        obj.setClusterUrl("clusterUrl");
        assertEquals("clusterUrl", obj.getClusterUrl());
    }
}

// _Logon_10Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#getUser()} method.
*/
class _Logon_10Test {
		
    /**
    * Test {@link _Logon#getUser()} for the getter.
    */
    @Test
    void getUser() {
        _Logon obj = new _Logon();
        obj.setUser("user");
        assertEquals("user", obj.getUser());
    }
}

// _Logon_11Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#getPassword()} method.
*/
class _Logon_11Test {
		
    /**
    * Test {@link _Logon#getPassword()} for the getter.
    */
    @Test
    void getPassword() {
       