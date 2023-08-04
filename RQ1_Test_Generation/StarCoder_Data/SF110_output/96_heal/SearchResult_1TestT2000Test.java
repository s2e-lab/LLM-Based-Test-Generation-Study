// SearchResult_1Test.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResult}.
* It contains ten unit test cases for the {@link SearchResult#getTypeDesc()} method.
*/
class SearchResult_1Test {

    /**
    * Test {@link SearchResult#getTypeDesc()} for the following inputs:
    * <ul>
    * <li>category</li>
    * <li>comments</li>
    * <li>endIndex</li>
    * <li>query</li>
    * <li>resultElements</li>
    * <li>searchTime</li>
    * <li>startIndex</li>
    * <li>totalResultsCount</li>
    * </ul>
    */
    @Test
    void getTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = SearchResult.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("SearchResult", typeDesc.getName());
        assertEquals("http://fedsearch.merlot.org/type", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("SearchResult", typeDesc.getXmlType().getLocalPart());
        assertEquals(1, typeDesc.getFields().length);
        org.apache.axis.description.ElementDesc elemField = typeDesc.getFields()[0];
        assertEquals("category", elemField.getFieldName());
        assertEquals("http://www.w3.org/2001/XMLSchema", elemField.getXmlType().getNamespaceURI());
        assertEquals("string", elemField.getXmlType().getLocalPart());
        assertEquals(false, elemField.isNillable());
    }
}

// SearchResult_2Test.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResult}.
* It contains ten unit test cases for the {@link SearchResult#getTypeDesc()} method.
*/
class SearchResult_2Test {
		
    /**
    * Test {@link SearchResult#getTypeDesc()} for the following inputs:
    * <ul>
    * <li>category</li>
    * <li>comments</li>
    * <li>endIndex</li>
    * <li>query</li>
    * <li>resultElements</li>
    * <li>searchTime</li>
    * <li>startIndex</li>
    * <li>totalResultsCount</li>
    * </ul>
    */
    @Test
    void getTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = SearchResult.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("SearchResult", typeDesc.getName());
        assertEquals("http://fedsearch.merlot.org/type", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("SearchResult", typeDesc.getXmlType().getLocalPart());
        assertEquals(1, typeDesc.getFields().length);
        org.apache.axis.description.ElementDesc elemField = typeDesc.getFields()[0];
        assertEquals("comments", elemField.getFieldName());
        assertEquals("http://www.w3.org/2001/XMLSchema", elemField.getXmlType().getNamespaceURI());
        assertEquals("string", elemField.getXmlType().getLocalPart());
        assertEquals(false, elemField.isNillable());
    }
}

// SearchResult_3Test.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResult}.
* It contains ten unit test cases for the {@link SearchResult#getTypeDesc()} method.
*/
class SearchResult_3Test {
		
    /**
    * Test {@link SearchResult#getTypeDesc()} for the following inputs:
    * <ul>
    * <li>category</li>
    * <li>comments</li>
    * <li>endIndex</li>
    * <li>query</li>
    * <li>resultElements</li>
    * <li>searchTime</li>
    * <li>startIndex</li>
    * <li>totalResultsCount</li>
    * </ul>
    */
    @Test
    void getTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = SearchResult.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("SearchResult", typeDesc.getName());
        assertEquals("http://fedsearch.merlot.org/type", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("SearchResult", typeDesc.getXmlType().getLocalPart());
        assertEquals(1, typeDesc.getFields().length);
        org.apache.axis.description.ElementDesc elemField = typeDesc.getFields()[0];
        assertEquals("endIndex", elemField.getFieldName());
        assertEquals("http://www.w3.org/2001/XMLSchema", elemField.getXmlType().getNamespaceURI());
        assertEquals("int", elemField.getXmlType().getLocalPart());
        assertEquals(false, elemField.isNillable());
    }
}

// SearchResult_4Test.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResult}.
* It contains ten unit test cases for the {@link SearchResult#getTypeDesc()} method.
*/
class SearchResult_4Test {
		
    /**
    * Test {@link SearchResult#getTypeDesc()} for the following inputs:
    * <ul>
    * <li>category</li>
    * <li>comments</li>
    * <li>endIndex</li>
    * <li>query</li>
    * <li>resultElements</li>
    * <li>searchTime</li>
    * <li>startIndex</li>
    * <li>totalResultsCount</li>
    * </ul>
    */
    @Test
    void getTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = SearchResult.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("SearchResult", typeDesc.getName());
        assertEquals("http://fedsearch.merlot.org/type", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("SearchResult", typeDesc.getXmlType().getLocalPart());
        assertEquals(1, typeDesc.getFields().length);
        org.apache.axis.description.ElementDesc elemField = typeDesc.getFields()[0];
        assertEquals("query", elemField.getFieldName());
        assertEquals("http://www.w3.org/2001/XMLSchema", elemField.getXmlType().getNamespaceURI());
        assertEquals("string", elemField.getXmlType().getLocalPart());
        assertEquals(false, elemField.isNillable());
    }
}

// SearchResult_5Test.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResult}.
* It contains ten unit test cases for the {@link SearchResult#getTypeDesc()} method.
*/
class SearchResult_5Test {
		
    /**
    * Test {@link SearchResult#getTypeDesc()} for the following inputs:
    * <ul>
    * <li>category</li>
    * <li>comments</li>
    * <li>endIndex</li>
    * <li>query</li>
    * <li>resultElements</li>
    * <li>searchTime</li>
    * <li>startIndex</li>
    * <li>totalResultsCount</li>
    * </ul>
    */
    @Test
    void getTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = SearchResult.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("SearchResult", typeDesc.getName());
        assertEquals("http://fedsearch.merlot.org/type", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("SearchResult", typeDesc.getXmlType().getLocalPart());
        assertEquals(1, typeDesc.getFields().length);
        org.apache.axis.description.ElementDesc elemField = typeDesc.getFields()[0];
        assertEquals("resultElements", elemField.getFieldName());
        assertEquals("http://fedsearch.merlot.org/type", elemField.getXmlType().getNamespaceURI());
        assertEquals("SearchResultElement", elemField.getXmlType().getLocalPart());
        assertEquals(false, elemField.isNillable());
    }
}

// SearchResult_6Test.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResult}.
* It contains ten unit test cases for the {@link SearchResult#getTypeDesc()} method.
*/
class SearchResult_6Test {
		
    /**
    * Test {@link SearchResult#getTypeDesc()} for the following inputs:
    * <ul>
    * <li>category</li>
    * <li>comments</li>
    * <li>endIndex</li>
    * <li>