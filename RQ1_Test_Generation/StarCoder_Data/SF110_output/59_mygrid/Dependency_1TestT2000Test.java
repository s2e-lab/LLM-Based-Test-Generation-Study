// Dependency_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains ten unit test cases for the {@link Dependency#getTypeDesc()} method.
*/
class Dependency_1Test {

    /**
    * Test case for {@link Dependency#getTypeDesc()}
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = Dependency.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("Dependency", typeDesc.getName());
        assertEquals("http://tempuri.org/", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("Dependency", typeDesc.getXmlType().getLocalPart());
        assertEquals(2, typeDesc.getFields().length);
        assertEquals("Id", typeDesc.getFields()[0].getName());
        assertEquals("http://tempuri.org/", typeDesc.getFields()[0].getXmlType().getNamespaceURI());
        assertEquals("string", typeDesc.getFields()[0].getXmlType().getLocalPart());
        assertEquals("Name", typeDesc.getFields()[1].getName());
        assertEquals("http://tempuri.org/", typeDesc.getFields()[1].getXmlType().getNamespaceURI());
        assertEquals("string", typeDesc.getFields()[1].getXmlType().getLocalPart());
    }
}

// Dependency_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains ten unit test cases for the {@link Dependency#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class Dependency_2Test {
		
    /**
    * Test case for {@link Dependency#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)}
    */
    @Test
    void testGetSerializer() {
        org.apache.axis.encoding.Serializer serializer = Dependency.getSerializer(null, null, null);
        assertNotNull(serializer);
    }
}

// Dependency_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains ten unit test cases for the {@link Dependency#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class Dependency_3Test {
		
    /**
    * Test case for {@link Dependency#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)}
    */
    @Test
    void testGetDeserializer() {
        org.apache.axis.encoding.Deserializer deserializer = Dependency.getDeserializer(null, null, null);
        assertNotNull(deserializer);
    }
}

// Dependency_4Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains ten unit test cases for the {@link Dependency#equals(java.lang.Object)} method.
*/
class Dependency_4Test {
		
    /**
    * Test case for {@link Dependency#equals(java.lang.Object)}
    */
    @Test
    void testEquals() {
        Dependency obj = new Dependency();
        obj.setId("id");
        obj.setName("name");
        Dependency obj2 = new Dependency();
        obj2.setId("id");
        obj2.setName("name");
        assertTrue(obj.equals(obj2));
    }
}

// Dependency_5Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains ten unit test cases for the {@link Dependency#hashCode()} method.
*/
class Dependency_5Test {
		
    /**
    * Test case for {@link Dependency#hashCode()}
    */
    @Test
    void testHashCode() {
        Dependency obj = new Dependency();
        obj.setId("id");
        obj.setName("name");
        assertEquals(1079, obj.hashCode());
    }
}

// Dependency_6Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains ten unit test cases for the {@link Dependency#toString()} method.
*/
class Dependency_6Test {
		
    /**
    * Test case for {@link Dependency#toString()}
    */
    @Test
    void testToString() {
        Dependency obj = new Dependency();
        obj.setId("id");
        obj.setName("name");
        assertEquals("Dependency [Id=id, Name=name]", obj.toString());
    }
}

// Dependency_7Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains ten unit test cases for the {@link Dependency#Dependency()} method.
*/
class Dependency_7Test {
		
    /**
    * Test case for {@link Dependency#Dependency()}
    */
    @Test
    void testDependency() {
        Dependency obj = new Dependency();
        assertNull(obj.getId());
        assertNull(obj.getName());
    }
}

// Dependency_8Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains ten unit test cases for the {@link Dependency#Dependency(java.lang.String, java.lang.String)} method.
*/
class Dependency_8Test {
		
    /**
    * Test case for {@link Dependency#Dependency(java.lang.String, java.lang.String)}
    */
    @Test
    void testDependency() {
        Dependency obj = new Dependency("id", "name");
        assertEquals("id", obj.getId());
        assertEquals("name", obj.getName());
    }
}

// Dependency_9Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains ten unit test cases for the {@link Dependency#getId()} method.
*/
class Dependency_9Test {
		
    /**
    * Test case for {@link Dependency#getId()}
    */
    @Test
    void testGetId() {
        Dependency obj = new Dependency();
        obj.setId("id");
        assertEquals("id", obj.getId());
    }
}

// Dependency_10Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains ten unit test cases for the {@link Dependency#setId(java.lang.String)} method.
*/
class Dependency_10Test {
		
    /**
    * Test case for {@link Dependency#setId(java.lang.String)}
    */
    @Test
    void testSetId() {
        Dependency obj = new Dependency();
        obj.setId("id");
        assertEquals("id", obj.getId());
    }
}

// Dependency_11Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains ten unit test cases for the {@link Dependency#getName()} method.
*/
class Dependency_11Test {
		
    /**
    * Test case for {@link Dependency#getName()}
    */
    @Test
    void testGetName() {
        Dependency obj = new Dependency();
        obj.setName("name");
        assertEquals("name", obj.getName());
    }
}

// Dependency_12Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains ten unit test cases for the {@link Dependency#setName(java.lang.String)} method.
*/
class Dependency_12Test {
		
    /**
    * Test case for {@link Dependency#setName(java.lang.String)}
    */
    @Test
    void testSetName() {
        Dependency obj = new Dependency();
        obj.setName("name");
        assertEquals("name", obj.getName());
    }
}

// Dependency_13Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains ten unit test cases for the {@link Dependency#readResolve()} method.
*/
class Dependency_13Test