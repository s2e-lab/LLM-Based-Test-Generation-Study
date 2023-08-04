// _FailResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains ten unit test cases for the {@link _FailResponse#getTypeDesc()} method.
*/
class _FailResponseTest {

    /**
    * Test case for {@link _FailResponse#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _FailResponse.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("mygrid.web._FailResponse", typeDesc.getXmlType().getLocalPart());
    }
}

// _GridService.java
package mygrid.web;

public interface _GridService extends javax.xml.rpc.Service {

    public java.lang.String get_GridServicePortAddress();

    public mygrid.web._GridServicePortType get_GridServicePort() throws javax.xml.rpc.ServiceException;

    public mygrid.web._GridServicePortType get_GridServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

// _GridServiceLocator.java
package mygrid.web;

public class _GridServiceLocator extends org.apache.axis.client.Service implements mygrid.web._GridService {

    public _GridServiceLocator() {
    }

    public _GridServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public _GridServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for _GridServicePortType
    private java.lang.String _get_GridServicePortAddress() {
        return "http://localhost:8080/axis/services/GridService";
    }

    public mygrid.web._GridServicePortType get_GridServicePort() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(_get_GridServicePortAddress());
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return get_GridServicePort(endpoint);
    }

    public mygrid.web._GridServicePortType get_GridServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mygrid.web._GridServiceSoapBindingStub _stub = new mygrid.web._GridServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(get_GridServicePortWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void set_GridServicePortEndpointAddress(java.lang.String address) {
        _GridServicePortWSDDAddress = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mygrid.web._GridServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mygrid.web._GridServiceSoapBindingStub _stub = new mygrid.web._GridServiceSoapBindingStub(new java.net.URL(_GridServicePortWSDDAddress), this);
                _stub.setPortName(get_GridServicePortWSDDServiceName());
                return _stub;
            }
        } catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GridServicePort".equals(inputPortName)) {
            return get_GridServicePort();
        }
        else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://web.mygrid.org", "GridService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://web.mygrid.org", "GridServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

        if ("GridServicePort".equals(portName)) {
            _GridServicePortWSDDAddress = address;
        }
        else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

    /**
    * For the given interface, get the endpoint address.
    */
    public java.lang.String getEndpointAddress(java.lang.String portName) throws javax.xml.rpc.ServiceException {

        if ("GridServicePort".equals(portName)) {
            return _GridServicePortWSDDAddress;
        }
        else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot get Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * For the given interface, get the endpoint address.
    */
    public java.lang.String getEndpointAddress(javax.xml.namespace.QName portName) throws javax.xml.rpc.ServiceException {
        return getEndpointAddress(portName.getLocalPart());
    }

    /**
    * Returns the WSDD service name.
    */
    public java.lang.String get_GridServicePortWSDDServiceName() {
        return "GridServicePort";
    }

    public javax.xml.namespace.QName get_GridServicePortWSDDServiceQName() {
        return new javax.xml.namespace.QName("http://web.mygrid.org", "GridServicePort");
    }

    public javax.xml.namespace.QName get_GridServicePortWSDDPortQName() {
        return new javax.xml.namespace.QName("http://web.mygrid.org", "GridServicePort");
    }

    public java.lang.String get_GridServicePortWSDDAddress() {
        return _GridServicePortWSDDAddress;
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void set_GridServicePortWSDDAddress(java.lang.String address) {
        _GridServicePortWSDDAddress = address;
    }

}

// _GridServicePortType.java
package mygrid.web;

public interface _GridServicePortType extends java.rmi.Remote {

    public mygrid.web._GridServicePortType_getGrid getGrid(java.lang.String arg0) throws java.rmi.RemoteException;

    public mygrid.web._GridServicePortType_getGrids getGrids() throws java.rmi.RemoteException;

    public mygrid.web._GridServicePortType_getGridsForProject getGridsForProject(java.lang.String arg0) throws java.rmi.RemoteException;

    public mygrid.web._GridServicePortType_getGridsForProjects getGridsForProjects(java.lang.String[] arg0) throws java.rmi.RemoteException;

    public mygrid.web._GridServicePortType_getGridsForProjectsAndUser getGridsForProjectsAndUser(java.lang.String[] arg0, java.lang.String arg1) throws java.rmi.RemoteException;

    public mygrid.web._GridServicePortType_getGridsForProjectsAndUserAndRole getGridsForProjectsAndUserAndRole(java.lang.String[] arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;

    public mygrid.web._GridServicePortType_getGridsForProjectsAndUserAndRoleAndCapability getGridsForProjectsAndUserAndRoleAndCapability(java.lang.String[] arg0