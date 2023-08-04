// _GetEngineResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains ten unit test cases for the {@link _GetEngineResponse#getTypeDesc()} method.
*/
class _GetEngineResponseTest {

    /**
    * Test case for the {@link _GetEngineResponse#getTypeDesc()} method.
    */
    @Test
    void getTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _GetEngineResponse.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// _GetEngineResponse.java
package mygrid.web;

public class _GetEngineResponse implements java.io.Serializable {

    public static org.apache.