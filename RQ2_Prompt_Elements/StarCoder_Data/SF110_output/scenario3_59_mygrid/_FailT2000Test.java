// _FailTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Fail}.
* It contains ten unit test cases for the {@link _Fail#getTypeDesc()} method.
*/
class _FailTest {

    /**
    * Test case for {@link _Fail#getTypeDesc()}.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _Fail.getTypeDesc();
        assertNotNull(typeDesc);
    }
}
