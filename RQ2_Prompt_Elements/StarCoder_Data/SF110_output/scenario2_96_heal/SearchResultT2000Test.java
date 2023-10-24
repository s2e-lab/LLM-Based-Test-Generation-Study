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
     * Test case for {@link SearchResult#getTypeDesc()} method.
     */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = SearchResult.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// SearchResult.