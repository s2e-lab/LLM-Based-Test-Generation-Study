// _ProgressTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains ten unit test cases for the {@link _Progress#getTypeDesc()} method.
*/
class _ProgressTest {

    /**
    * Test case for {@link _Progress#getTypeDesc()}.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _Progress.getTypeDesc();
        assertNotNull(typeDesc);
    }
}
