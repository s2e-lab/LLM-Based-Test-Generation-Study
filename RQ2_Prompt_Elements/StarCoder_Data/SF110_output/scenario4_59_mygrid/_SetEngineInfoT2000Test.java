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
    * Test {@link _SetEngineInfo#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _SetEngineInfo.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("SetEngineInfo", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("SetEngineInfo", typeDesc.getXmlType().getLocalPart());
        assertEquals(1, typeDesc.getFields().length);
        assertEquals("name", typeDesc.getFields()[0].getName());
        assertEquals("http://www.w3.org/2001/XMLSchema", typeDesc.getFields()[0].getXmlType().getNamespaceURI());
        assertEquals("string", typeDesc.getFields()[0].getXmlType().getLocalPart());
    }
}

// _SetEngineInfoStub.java
package mygrid.web;

public class _SetEngineInfoStub extends org.apache.axis.client.Stub implements mygrid.web.SetEngineInfo {

    private java.lang.String name;

    private float cpu;

    private float ram;

    private java.lang.String os;

    public _SetEngineInfoStub() {
        this(null);
    }

    public _SetEngineInfoStub(java.net.URL endpointURL, javax.xml.rpc.Service service) {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public _SetEngineInfoStub(javax.xml.rpc.Service service) {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.2");
    }

    public java.lang.String getName() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperationName(new javax.xml.namespace.QName("http://web.mygrid.org", "getName"));
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.mygrid.org", "getName"));
        _call.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.mygrid.org/SetEngineInfo/getName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.mygrid.org", "getName"));
        _call.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.mygrid.org/SetEngineInfo/getName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.mygrid.org", "getName"));
        _call.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.mygrid.org/SetEngineInfo/getName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.mygrid.org", "getName"));
        _call.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.mygrid.org/SetEngineInfo/getName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.mygrid.org", "getName"));
        _call.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.mygrid.org/SetEngineInfo/getName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.mygrid.org", "getName"));
        _call.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.mygrid.org/SetEngineInfo/getName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.mygrid.org", "getName"));
        _call.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.mygrid.org/SetEngineInfo/getName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.mygrid.org", "getName"));
        _call.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.mygrid.org/SetEngineInfo/getName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.mygrid.org", "getName"));
        _call.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.mygrid.org/SetEngineInfo/getName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_