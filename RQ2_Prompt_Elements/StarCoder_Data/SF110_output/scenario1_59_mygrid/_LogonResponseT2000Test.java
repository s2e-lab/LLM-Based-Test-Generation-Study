// _LogonResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _LogonResponse}.
* It contains ten unit test cases for the {@link _LogonResponse#getTypeDesc()} method.
*/
class _LogonResponseTest {

    /**
    * Test case for the {@link _LogonResponse#getTypeDesc()} method.
    */
    @Test
    void getTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _LogonResponse.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// _LogonResponse.java
package mygrid.web;

public class _LogonResponse implements java.io.Serializable {

    public static org.apache.