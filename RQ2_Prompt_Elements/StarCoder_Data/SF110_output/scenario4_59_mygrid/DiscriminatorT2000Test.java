// DiscriminatorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Discriminator}.
* It contains ten unit test cases for the {@link Discriminator#getTypeDesc()} method.
*/
class DiscriminatorTest {

    /**
    * Test case for {@link Discriminator#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        Discriminator discriminator = new Discriminator();
        org.apache.axis.description.TypeDesc typeDesc = discriminator.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// Processor.java
package mygrid.web;

public class Processor implements java.io.Serializable {

    private mygrid.web.ArrayOfString allowedEngines;

    private mygrid.web.Discriminator discriminator;

    private float CPU;

    private float RAM;

    private java.lang.String OS;

    public Processor() {
    }

    public mygrid.web.ArrayOfString getAllowedEngines();

    public void setAllowedEngines(mygrid.web.ArrayOfString allowedEngines);

    public mygrid.web.Discriminator getDiscriminator();

    public void setDiscriminator(mygrid.web.Discriminator discriminator);

    public float getCPU();

    public void setCPU(float CPU);

    public float getRAM();

    public void setRAM(float RAM);

    public java.lang.String getOS();

    public void setOS(java.lang.String OS);

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj);

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode();

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(Processor.class);

    static {
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc();

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType);

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType);
}

// ProcessorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Processor}.
* It contains ten unit test cases for the {@link Processor#getTypeDesc()} method.
*/
class ProcessorTest {
		
    /**
    * Test case for {@link Processor#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        Processor processor = new Processor();
        org.apache.axis.description.TypeDesc typeDesc = processor.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// ArrayOfString.java
package mygrid.web;

public class ArrayOfString implements java.io.Serializable {

    private java.lang.String[] string;

    public ArrayOfString() {
    }

    public ArrayOfString(java.lang.String[] string) {
        this.string = string;
    }

    public java.lang.String[] getString();

    public void setString(java.lang.String[] string);

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj);

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode();

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(ArrayOfString.class);

    static {
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc();

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType);

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType);
}

// ArrayOfStringTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains ten unit test cases for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfStringTest {
		
    /**
    * Test case for {@link ArrayOfString#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        ArrayOfString arrayOfString = new ArrayOfString();
        org.apache.axis.description.TypeDesc typeDesc = arrayOfString.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// ArrayOfStringTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains ten unit test cases for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfStringTest {
		
    /**
    * Test case for {@link ArrayOfString#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        ArrayOfString arrayOfString = new ArrayOfString();
        org.apache.axis.description.TypeDesc typeDesc = arrayOfString.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// ArrayOfStringTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains ten unit test cases for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfStringTest {
		
    /**
    * Test case for {@link ArrayOfString#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        ArrayOfString arrayOfString = new ArrayOfString();
        org.apache.axis.description.TypeDesc typeDesc = arrayOfString.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// ArrayOfStringTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains ten unit test cases for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfStringTest {
		
    /**
    * Test case for {@link ArrayOfString#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        ArrayOfString arrayOfString = new ArrayOfString();
        org.apache.axis.description.TypeDesc typeDesc = arrayOfString.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// ArrayOfStringTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains ten unit test cases for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfStringTest {
		
    /**
    * Test case for {@link ArrayOfString#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        ArrayOfString arrayOfString = new ArrayOfString();
        org.apache.axis.description.TypeDesc typeDesc = arrayOfString.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// ArrayOfStringTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains ten unit test cases for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfStringTest {
		
    /**
    * Test case for {@link ArrayOfString#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        ArrayOfString arrayOfString = new ArrayOfString();
        org.apache.axis.description.TypeDesc typeDesc = arrayOfString.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// ArrayOfStringTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains ten unit test cases for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfStringTest {
		
    /**
    * Test case for {@link ArrayOfString#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc()