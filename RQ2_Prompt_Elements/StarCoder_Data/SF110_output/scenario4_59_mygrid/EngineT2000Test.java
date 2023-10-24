// EngineTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Engine}.
* It contains ten unit test cases for the {@link Engine#getTypeDesc()} method.
*/
class EngineTest {

    /**
    * Test case for the {@link Engine#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        Engine engine = new Engine();
        assertNotNull(engine.getTypeDesc());
    }
}

// EngineType.java
package mygrid.web;

public class EngineType extends mygrid.web.MarshalByRefObject implements java.io.Serializable {

    private java.lang.String id;

    private java.lang.String name;

    private java.lang.String description;

    public EngineType() {
    }

    public java.lang.String getId();

    public void setId(java.lang.String id);

    public java.lang.String getName();

    public void setName(java.lang.String name);

    public java.lang.String getDescription();

    public void setDescription(java.lang.String description);

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj);

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode();

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(EngineType.class);

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

// EngineTypeTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EngineType}.
* It contains ten unit test cases for the {@link EngineType#getTypeDesc()} method.
*/
class EngineTypeTest {
		
    /**
    * Test case for the {@link EngineType#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        EngineType engineType = new EngineType();
        assertNotNull(engineType.getTypeDesc());
    }
}

// GridResource.java
package mygrid.web;

public class GridResource extends mygrid.web.MarshalByRefObject implements java.io.Serializable {

    private java.lang.String id;

    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String url;

    private java.lang.String type;

    private java.lang.String engineType;

    private java.lang.String engine;

    private java.lang.String owner;

    private java.lang.String ownerEmail;

    private java.lang.String ownerAffiliation;

    private java.lang.String ownerCountry;

    private java.lang.String ownerCity;

    private java.lang.String ownerPostalCode;

    private java.lang.String ownerAddress;

    private java.lang.String ownerPhone;

    private java.lang.String ownerFax;

    private java.lang.String ownerURL;

    private java.lang.String ownerLogoURL;

    private java.lang.String ownerDescription;

    private java.lang.String ownerKeywords;

    private java.lang.String ownerLanguage;

    private java.lang.String ownerLatitude;

    private java.lang.String ownerLongitude;

    private java.lang.String ownerContactName;

    private java.lang.String ownerContactEmail;

    private java.lang.String ownerContactAffiliation;

    private java.lang.String ownerContactCountry;

    private java.lang.String ownerContactCity;

    private java.lang.String ownerContactPostalCode;

    private java.lang.String ownerContactAddress;

    private java.lang.String ownerContactPhone;

    private java.lang.String ownerContactFax;

    private java.lang.String ownerContactURL;

    private java.lang.String ownerContactLogoURL;

    private java.lang.String ownerContactDescription;

    private java.lang.String ownerContactKeywords;

    private java.lang.String ownerContactLanguage;

    private java.lang.String ownerContactLatitude;

    private java.lang.String ownerContactLongitude;

    private java.lang.String ownerContactPosition;

    private java.lang.String ownerContactPositionTitle;

    private java.lang.String ownerContactPositionType;

    private java.lang.String ownerContactPositionStartDate;

    private java.lang.String ownerContactPositionEndDate;

    private java.lang.String ownerContactPositionDescription;

    private java.lang.String ownerContactPositionKeywords;

    private java.lang.String ownerContactPositionLanguage;

    private java.lang.String ownerContactPositionLatitude;

    private java.lang.String ownerContactPositionLongitude;

    private java.lang.String ownerContactPositionContactName;

    private java.lang.String ownerContactPositionContactEmail;

    private java.lang.String ownerContactPositionContactAffiliation;

    private java.lang.String ownerContactPositionContactCountry;

    private java.lang.String ownerContactPositionContactCity;

    private java.lang.String ownerContactPositionContactPostalCode;

    private java.lang.String ownerContactPositionContactAddress;

    private java.lang.String ownerContactPositionContactPhone;

    private java.lang.String ownerContactPositionContactFax;

    private java.lang.String ownerContactPositionContactURL;

    private java.lang.String ownerContactPositionContactLogoURL;

    private java.lang.String ownerContactPositionContactDescription;

    private java.lang.String ownerContactPositionContactKeywords;

    private java.lang.String ownerContactPositionContactLanguage;

    private java.lang.String ownerContactPositionContactLatitude;

    private java.lang.String ownerContactPositionContactLongitude;

    private java.lang.String ownerContactPositionContactPosition;

    private java.lang.String ownerContactPositionContactPositionTitle;

    private java.lang.String ownerContactPositionContactPositionType;

    private java.lang.String ownerContactPositionContactPositionStartDate;

    private java.lang.String ownerContactPositionContactPositionEndDate;

    private java.lang.String ownerContactPositionContactPositionDescription;

    private java.lang.String ownerContactPositionContactPositionKeywords;

    private java.lang.String ownerContactPositionContactPositionLanguage;

    private java.lang.String ownerContactPositionContactPositionLatitude;

    private java.lang.String ownerContactPositionContactPositionLongitude;

    private java.lang.String ownerContactPositionContactPositionContactName;

    private java.lang.String ownerContactPositionContactPositionContactEmail;

    private java.lang.String ownerContactPositionContactPositionContactAffiliation;

    private java.lang.String ownerContactPositionContactPositionContactCountry;

    private java.lang.String ownerContactPositionContactPositionContactCity;

    private java.lang.String ownerContactPositionContactPositionContactPostalCode;

    private java.lang.String ownerContactPositionContactPositionContactAddress;

    private java.lang.String ownerContactPositionContactPositionContactPhone;

    private java.lang.String ownerContactPositionContactPositionContactFax;

    private java.lang.String ownerContactPositionContactPositionContactURL;

    private java.lang.String ownerContactPositionContactPositionContactLogoURL;

    private java.lang.String ownerContactPositionContactPositionContactDescription;

    private java.lang.String ownerContactPositionContactPositionContactKeywords;

    private java.lang.String ownerContactPositionContactPositionContactLanguage;

    private java.lang.String ownerContactPositionContactPositionContactLatitude;

    private java.lang.String ownerContactPositionContactPositionContactLongitude;

    private java.lang.String ownerContactPositionContactPositionContactPosition;

    private java.lang.String ownerContactPositionContactPositionContactPositionTitle;

    private java.lang.String ownerContactPositionContactPositionContactPositionType;

    private java.lang.String ownerContactPositionContactPositionContactPositionStartDate;

    private java.lang.String ownerContactPositionContactPositionContactPositionEndDate;

    private java.lang.String ownerContactPositionContactPositionContactPositionDescription;

    private java.lang.String ownerContactPositionContactPositionContactPositionKeywords;

    private java.lang.String ownerContactPositionContactPositionContactPositionLanguage;

    private java.lang.String ownerContactPositionContactPositionContactPositionLatitude;

    private java.lang.String ownerContactPositionContactPositionContactPositionLongitude;

    private java.lang.String ownerContactPositionContactPositionContactPositionContactName;

    private java.lang.String ownerContactPositionContactPositionContactPositionContactEmail;

    private java.lang.String ownerContactPositionContactPositionContactPositionContactAffiliation;

    private java.lang.String ownerContactPositionContactPositionContactPositionContactCountry;

    private java.lang.String ownerContactPositionContactPositionContactPositionContactCity;

    private java.lang.String ownerContactPositionContactPositionContactPositionContactPostalCode;

    private java.lang.String ownerContactPositionContactPositionContactPositionContactAddress;

    private java.lang.String ownerContactPositionContactPositionContactPositionContactPhone;

    private java.lang.String ownerContactPositionContact