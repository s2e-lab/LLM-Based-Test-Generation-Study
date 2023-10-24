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
    * Test case number: 1
    * Test case values:
    * Expected results:
    * {@link org.apache.axis.description.TypeDesc#getTypeName()}
    * {@link org.apache.axis.description.TypeDesc#getXmlType()}
    * {@link org.apache.axis.description.TypeDesc#getXmlTypeDesc()}
    * {@link org.apache.axis.description.TypeDesc#getXmlTypeLib()}
    * {@link org.apache.axis.description.TypeDesc#getXmlTypeLibURI()}
    * {@link org.apache.axis.description.TypeDesc#getXmlTypePrefix()}
    * {@link org.apache.axis.description.TypeDesc#getXmlTypeURI()}
    * {@link org.apache.axis.description.TypeDesc#getXmlTypeLocalName()}
    * {@link org.apache.axis.description.TypeDesc#getXmlTypeUnqualifiedName()}
    */
    @Test
    void test1() {
        _SetEngineInfoResponse _setEngineInfoResponse = new _SetEngineInfoResponse();
        org.apache.axis.description.TypeDesc typeDesc = _setEngineInfoResponse.getTypeDesc();
        assertEquals("mygrid.web._SetEngineInfoResponse", typeDesc.getTypeName());
        assertEquals("mygrid.web._SetEngineInfoResponse", typeDesc.getXmlType());
        assertEquals("mygrid.web._SetEngineInfoResponse", typeDesc.getXmlTypeDesc());
        assertEquals("http://webservice.mygrid.org.uk/", typeDesc.getXmlTypeLib());
        assertEquals("http://webservice.mygrid.org.uk/", typeDesc.getXmlTypeLibURI());
        assertEquals("mygrid.web._SetEngineInfoResponse", typeDesc.getXmlTypePrefix());
        assertEquals("http://webservice.mygrid.org.uk/", typeDesc.getXmlTypeURI());
        assertEquals("_SetEngineInfoResponse", typeDesc.getXmlTypeLocalName());
        assertEquals("_SetEngineInfoResponse", typeDesc.getXmlTypeUnqualifiedName());
    }
}
