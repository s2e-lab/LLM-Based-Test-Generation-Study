// ArrayOfDependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains ten unit test cases for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependencyTest {

    /**
    * Test {@link ArrayOfDependency#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = ArrayOfDependency.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("ArrayOfDependency", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("ArrayOfDependency", typeDesc.getXmlType().getLocalPart());
    }
}

// Dependency.java
package mygrid.web;

public class Dependency implements java.io.Serializable {

    private java.lang.String name;

    private java.lang.String version;

    private java.lang.String type;

    private java.lang.String url;

    public Dependency() {
    }

    public java.lang.String getName();

    public void setName(java.lang.String name);

    public java.lang.String getVersion();

    public void setVersion(java.lang.String version);

    public java.lang.String getType();

    public void setType(java.lang.String type);

    public java.lang.String getUrl();

    public void setUrl(java.lang.String url);

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj);

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode();

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(Dependency.class);

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

// DependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains ten unit test cases for the {@link Dependency#getTypeDesc()} method.
*/
class DependencyTest {
		
    /**
    * Test {@link Dependency#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = Dependency.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("Dependency", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("Dependency", typeDesc.getXmlType().getLocalPart());
    }
}

// GridServiceDescription.java
package mygrid.web;

public class GridServiceDescription implements java.io.Serializable {

    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String url;

    private mygrid.web.ArrayOfDependency dependencies;

    public GridServiceDescription() {
    }

    public java.lang.String getName();

    public void setName(java.lang.String name);

    public java.lang.String getDescription();

    public void setDescription(java.lang.String description);

    public java.lang.String getUrl();

    public void setUrl(java.lang.String url);

    public mygrid.web.ArrayOfDependency getDependencies();

    public void setDependencies(mygrid.web.ArrayOfDependency dependencies);

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj);

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode();

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(GridServiceDescription.class);

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

// GridServiceDescriptionTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GridServiceDescription}.
* It contains ten unit test cases for the {@link GridServiceDescription#getTypeDesc()} method.
*/
class GridServiceDescriptionTest {
		
    /**
    * Test {@link GridServiceDescription#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = GridServiceDescription.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("GridServiceDescription", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("GridServiceDescription", typeDesc.getXmlType().getLocalPart());
    }
}

// GridServiceDescriptionType.java
package mygrid.web;

public class GridServiceDescriptionType implements java.io.Serializable {

    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String url;

    private mygrid.web.ArrayOfDependency dependencies;

    public GridServiceDescriptionType() {
    }

    public java.lang.String getName();

    public void setName(java.lang.String name);

    public java.lang.String getDescription();

    public void setDescription(java.lang.String description);

    public java.lang.String getUrl();

    public void setUrl(java.lang.String url);

    public mygrid.web.ArrayOfDependency getDependencies();

    public void setDependencies(mygrid.web.ArrayOfDependency dependencies);

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj);

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode();

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(GridServiceDescriptionType.class);

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

// GridServiceDescriptionTypeTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GridServiceDescriptionType}.
* It contains ten unit test cases for the {@link GridServiceDescriptionType#getTypeDesc()} method.
*/
class GridServiceDescriptionTypeTest {
		
    /**
    * Test {@link GridServiceDescriptionType#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = GridServiceDescriptionType.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("GridServiceDescriptionType", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("GridServiceDescriptionType", typeDesc.getXmlType().getLocalPart());
    }
}

// GridServiceDescriptionTypeTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GridServiceDescriptionType}.
* It contains ten unit test cases for the {@link GridServiceDescriptionType#getTypeDesc()} method.
*/
class GridServiceDescriptionTypeTest {
		
    /**
    * Test {@link GridServiceDescriptionType#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = GridServiceDescriptionType.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("GridServiceDescriptionType", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getXmlType().getNamespaceURI