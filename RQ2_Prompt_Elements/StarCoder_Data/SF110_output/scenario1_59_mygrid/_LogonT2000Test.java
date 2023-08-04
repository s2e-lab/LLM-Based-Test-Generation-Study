// _LogonTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#getTypeDesc()} method.
*/
class _LogonTest {

    /**
    * Test case for the {@link _Logon#getTypeDesc()} method.
    */
    @Test
    void getTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _Logon.getTypeDesc();
        assertNotNull(typeDesc);
    }
}
