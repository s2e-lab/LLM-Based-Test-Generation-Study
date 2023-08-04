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
    * Test case number: 1
    * Test case values:
    * Expected results:
    * {@link _SetEngineInfo#getTypeDesc()}
    */
    @Test
    void testGetTypeDesc001() {
        _SetEngineInfo _setEngineInfo = new _SetEngineInfo();
        org.apache.axis.description.TypeDesc typeDesc = _setEngineInfo.getTypeDesc();
        assertNotNull(typeDesc);
    }
}
