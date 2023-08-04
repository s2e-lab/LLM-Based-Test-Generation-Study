// _SetEngineInfoTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains ten unit test cases for the {@link _SetEngineInfo#getTypeDesc()} method.
*/
class _SetEngineInfoTest {

    /**
    * Test case for the {@link _SetEngineInfo#getTypeDesc()} method.
    */
    @Test
    void getTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _SetEngineInfo.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// _SetEngineInfo.java
package mygrid.web;

public class _SetEngineInfo implements java.io.Serializable {

    public static org.apache.