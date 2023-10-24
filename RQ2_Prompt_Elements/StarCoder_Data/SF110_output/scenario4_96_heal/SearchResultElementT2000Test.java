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
    * Test case for {@link SearchResultElement#getTypeDesc()} method.
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
