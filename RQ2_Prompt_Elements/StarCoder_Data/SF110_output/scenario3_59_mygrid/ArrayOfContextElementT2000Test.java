// ArrayOfContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains ten unit test cases for the {@link ArrayOfContextElement#getTypeDesc()} method.
*/
class ArrayOfContextElementTest {

    /**
    * Test case for {@link ArrayOfContextElement#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = ArrayOfContextElement.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("ArrayOfContextElement", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getPackageName());
        assertEquals("mygrid.web.ContextElement", typeDesc.getXmlType().getName());
        assertEquals(0, typeDesc.getFields().length);
    }
}

// ContextElement.java
package mygrid.web;

public class ContextElement implements java.io.Serializable {

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc();
}

// ContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains ten unit test cases for the {@link ContextElement#getTypeDesc()} method.
*/
class ContextElementTest {
		
    /**
    * Test case for {@link ContextElement#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = ContextElement.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("ContextElement", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getPackageName());
        assertEquals("mygrid.web.ContextElement", typeDesc.getXmlType().getName());
        assertEquals(0, typeDesc.getFields().length);
    }
}

// ContextElementResponse.java
package mygrid.web;

public class ContextElementResponse implements java.io.Serializable {

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc();
}

// ContextElementResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElementResponse}.
* It contains ten unit test cases for the {@link ContextElementResponse#getTypeDesc()} method.
*/
class ContextElementResponseTest {
		
    /**
    * Test case for {@link ContextElementResponse#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = ContextElementResponse.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("ContextElementResponse", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getPackageName());
        assertEquals("mygrid.web.ContextElementResponse", typeDesc.getXmlType().getName());
        assertEquals(0, typeDesc.getFields().length);
    }
}

// ContextMetadata.java
package mygrid.web;

public class ContextMetadata implements java.io.Serializable {

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc();
}

// ContextMetadataTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextMetadata}.
* It contains ten unit test cases for the {@link ContextMetadata#getTypeDesc()} method.
*/
class ContextMetadataTest {
		
    /**
    * Test case for {@link ContextMetadata#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = ContextMetadata.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("ContextMetadata", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getPackageName());
        assertEquals("mygrid.web.ContextMetadata", typeDesc.getXmlType().getName());
        assertEquals(0, typeDesc.getFields().length);
    }
}

// ContextMetadataResponse.java
package mygrid.web;

public class ContextMetadataResponse implements java.io.Serializable {

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc();
}

// ContextMetadataResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextMetadataResponse}.
* It contains ten unit test cases for the {@link ContextMetadataResponse#getTypeDesc()} method.
*/
class ContextMetadataResponseTest {
		
    /**
    * Test case for {@link ContextMetadataResponse#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = ContextMetadataResponse.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("ContextMetadataResponse", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getPackageName());
        assertEquals("mygrid.web.ContextMetadataResponse", typeDesc.getXmlType().getName());
        assertEquals(0, typeDesc.getFields().length);
    }
}

// ContextRegistration.java
package mygrid.web;

public class ContextRegistration implements java.io.Serializable {

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc();
}

// ContextRegistrationTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextRegistration}.
* It contains ten unit test cases for the {@link ContextRegistration#getTypeDesc()} method.
*/
class ContextRegistrationTest {
		
    /**
    * Test case for {@link ContextRegistration#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = ContextRegistration.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("ContextRegistration", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getPackageName());
        assertEquals("mygrid.web.ContextRegistration", typeDesc.getXmlType().getName());
        assertEquals(0, typeDesc.getFields().length);
    }
}

// ContextRegistrationResponse.java
package mygrid.web;

public class ContextRegistrationResponse implements java.io.Serializable {

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc();
}

// ContextRegistrationResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextRegistrationResponse}.
* It contains ten unit test cases for the {@link ContextRegistrationResponse#getTypeDesc()} method.
*/
class ContextRegistrationResponseTest {
		
    /**
    * Test case for {@link ContextRegistrationResponse#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = ContextRegistrationResponse.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("ContextRegistrationResponse", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getPackageName());
        assertEquals("mygrid.web.ContextRegistrationResponse", typeDesc.getXmlType().getName());
        assertEquals(0, typeDesc.getFields().length);
    }
}

// ContextRegistrationStatus.java
package mygrid.web;

public class ContextRegistrationStatus implements java.io.Serializable {

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc();
}

// ContextRegistrationStatusTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextRegistrationStatus}.
* It contains ten unit test cases for the {@link ContextRegistrationStatus#getTypeDesc()} method.
*/
class ContextRegistrationStatusTest {
		
    /**
    * Test case for {@link ContextRegistrationStatus#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = ContextRegistrationStatus.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("ContextRegistrationStatus", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getPackageName());
        assertEquals("mygrid.web.ContextRegistrationStatus", typeDesc.getXmlType().getName());
        assertEquals(0, typeDesc.getFields().length);
    }
}

// ContextRegistrationStatusResponse.java
package mygrid.web;

public class ContextRegistrationStatusResponse implements java.io.Serializable {

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc();
}

