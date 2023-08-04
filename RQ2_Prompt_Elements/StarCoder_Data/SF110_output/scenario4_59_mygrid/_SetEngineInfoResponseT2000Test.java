// _SetEngineInfoResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfoResponse}.
* It contains ten unit test cases for the {@link _SetEngineInfoResponse#getTypeDesc()} method.
*/
class _SetEngineInfoResponseTest {

    /**
    * Test {@link _SetEngineInfoResponse#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _SetEngineInfoResponse.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("mygrid.web._SetEngineInfoResponse", typeDesc.getXmlType().getLocalPart());
    }
}

// _SetEngineInfoResponse.java
package mygrid.web;

public class _SetEngineInfoResponse implements java.io.Serializable {

    public _SetEngineInfoResponse() {
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj);

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode();

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(_SetEngineInfoResponse.class);

    static {
    }

    /**
     * Return type metadata object
     */