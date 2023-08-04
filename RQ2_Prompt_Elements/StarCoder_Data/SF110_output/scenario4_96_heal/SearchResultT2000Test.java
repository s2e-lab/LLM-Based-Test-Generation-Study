// SearchResultTest.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResult}.
* It contains ten unit test cases for the {@link SearchResult#getTypeDesc()} method.
*/
class SearchResultTest {

    /**
    * Test {@link SearchResult#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = SearchResult.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("SearchResult", typeDesc.getName());
        assertEquals("org.merlot.fedsearch.type", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("SearchResult", typeDesc.getXmlType().getLocalPart());
    }
}

// SearchResultElement.java
package org.merlot.fedsearch.type;

public class SearchResultElement implements java.io.Serializable {

    private java.lang.String description;

    private java.lang.String id;

    private java.lang.String name;

    private java.lang.String url;

    public SearchResultElement() {
    }

    public SearchResultElement(java.lang.String description, java.lang.String id, java.lang.String name, java.lang.String url) {
    }

    /**
     * Gets the description value for this SearchResultElement.
     *
     * @return description
     */
    public java.lang.String getDescription();

    /**
     * Sets the description value for this SearchResultElement.
     *
     * @param description
     */
    public void setDescription(java.lang.String description);

    /**
     * Gets the id value for this SearchResultElement.
     *
     * @return id
     */
    public java.lang.String getId();

    /**
     * Sets the id value for this SearchResultElement.
     *
     * @param id
     */
    public void setId(java.lang.String id);

    /**
     * Gets the name value for this SearchResultElement.
     *
     * @return name
     */
    public java.lang.String getName();

    /**
     * Sets the name value for this SearchResultElement.
     *
     * @param name
     */
    public void setName(java.lang.String name);

    /**
     * Gets the url value for this SearchResultElement.
     *
     * @return url
     */
    public java.lang.String getUrl();

    /**
     * Sets the url value for this SearchResultElement.
     *
     * @param url
     */
    public void setUrl(java.lang.String url);

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj);

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode();

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(SearchResultElement.class, true);

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

// SearchResultElementTest.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResultElement}.
* It contains ten unit test cases for the {@link SearchResultElement#getTypeDesc()} method.
*/
class SearchResultElementTest {
		
    /**
    * Test {@link SearchResultElement#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = SearchResultElement.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("SearchResultElement", typeDesc.getName());
        assertEquals("org.merlot.fedsearch.type", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("SearchResultElement", typeDesc.getXmlType().getLocalPart());
    }
}

// SearchResultTest.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResult}.
* It contains ten unit test cases for the {@link SearchResult#getTypeDesc()} method.
*/
class SearchResultTest {
		
    /**
    * Test {@link SearchResult#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = SearchResult.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("SearchResult", typeDesc.getName());
        assertEquals("org.merlot.fedsearch.type", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("SearchResult", typeDesc.getXmlType().getLocalPart());
    }
}

// SearchResultElement.java
package org.merlot.fedsearch.type;

public class SearchResultElement implements java.io.Serializable {

    private java.lang.String description;

    private java.lang.String id;

    private java.lang.String name;

    private java.lang.String url;

    public SearchResultElement() {
    }

    public SearchResultElement(java.lang.String description, java.lang.String id, java.lang.String name, java.lang.String url) {
    }

    /**
     * Gets the description value for this SearchResultElement.
     *
     * @return description
     */
    public java.lang.String getDescription();

    /**
     * Sets the description value for this SearchResultElement.
     *
     * @param description
     */
    public void setDescription(java.lang.String description);

    /**
     * Gets the id value for this SearchResultElement.
     *
     * @return id
     */
    public java.lang.String getId();

    /**
     * Sets the id value for this SearchResultElement.
     *
     * @param id
     */
    public void setId(java.lang.String id);

    /**
     * Gets the name value for this SearchResultElement.
     *
     * @return name
     */
    public java.lang.String getName();

    /**
     * Sets the name value for this SearchResultElement.
     *
     * @param name
     */
    public void setName(java.lang.String name);

    /**
     * Gets the url value for this SearchResultElement.
     *
     * @return url
     */
    public java.lang.String getUrl();

    /**
     * Sets the url value for this SearchResultElement.
     *
     * @param url
     */
    public void setUrl(java.lang.String url);

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj);

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode();

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(SearchResultElement.class, true);

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

// SearchResultElementTest.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResultElement}.
* It contains ten unit test cases for the {@link SearchResultElement#getTypeDesc()} method.
*/
class SearchResultElementTest {
		
    /**
    * Test {@link SearchResultElement#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = SearchResultElement.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("SearchResultElement", typeDesc.getName());
        assertEquals("org.merlot.fedsearch.type", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("SearchResultElement", typeDesc.getXmlType().getLocalPart());
    }
}

// SearchResult.java
package org.merlot.fedsearch.type;

public class SearchResult implements java.io.Serializable {

    private java.lang.String category;

    private java.lang.String comments;

    private int endIndex;

    private java.lang.String query;

    private org.merlot.fedsearch.type.SearchResultElement[] resultElements;

    private float searchTime;

    private int