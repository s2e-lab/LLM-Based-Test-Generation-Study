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
    * Test {@link _LogonResponse#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _LogonResponse.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("LogonResponse", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("LogonResponse", typeDesc.getXmlType().getLocalPart());
    }
}

// _LogonResponseStub.java
package mygrid.web;

public class _LogonResponseStub extends org.apache.axis.client.Stub implements mygrid.web._LogonResponse {

    private boolean logonResult;

    public _LogonResponseStub() {
    }

    public _LogonResponseStub(org.apache.axis.client.Call _call) {
        super(_call);
    }

    public _LogonResponseStub(java.net.URL endpointURL, javax.xml.rpc.Service service) {
        super(endpointURL, service);
    }

    public _LogonResponseStub(java.net.URL endpointURL, javax.xml.rpc.Service service, java.util.HashMap _headers) {
        super(endpointURL, service, _headers);
    }

    public _LogonResponseStub(java.net.URL endpointURL, javax.xml.rpc.Service service, java.lang.String method) {
        super(endpointURL, service, method);
    }

    public _LogonResponseStub(java.net.URL endpointURL, javax.xml.rpc.Service service, java.lang.String method, java.lang.Object[] args) {
        super(endpointURL, service, method, args);
    }

    public _LogonResponseStub(java.net.URL endpointURL, javax.xml.rpc.Service service, java.lang.String method, java.util.HashMap _headers, java.lang.Object[] args) {
        super(endpointURL, service, method, _headers, args);
    }

    public _LogonResponseStub(javax.xml.rpc.Service service, java.lang.String method) {
        super(service, method);
    }

    public _LogonResponseStub(javax.xml.rpc.Service service, java.lang.String method, java.lang.Object[] args) {
        super(service, method, args);
    }

    public _LogonResponseStub(javax.xml.rpc.Service service, java.lang.String method, java.util.HashMap _headers, java.lang.Object[] args) {
        super(service, method, _headers, args);
    }

    public boolean isLogonResult() {
        return logonResult;
    }

    public void setLogonResult(boolean logonResult) {
        this.logonResult = logonResult;
    }

    public boolean isLogonResult(java.net.URL portAddress) {
        return logonResult;
    }

    public void setLogonResult(boolean logonResult, java.net.URL portAddress) {
        this.logonResult = logonResult;
    }

    public void setLogonResult(java.lang.String portName, boolean logonResult) throws javax.xml.rpc.ServiceException {
    }

    public void setLogonResult(java.lang.String portName, boolean logonResult, java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
    }

    public boolean isLogonResult(java.lang.String portName) throws javax.xml.rpc.ServiceException {
        return logonResult;
    }

    public boolean isLogonResult(java.lang.String portName, java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        return logonResult;
    }

    public void setLogonResult(org.apache.axis.client.Call _call) throws java.rmi.RemoteException {
    }

    public void setLogonResult(org.apache.axis.client.Call _call, java.net.URL portAddress) throws java.rmi.RemoteException {
    }

    public boolean isLogonResult(org.apache.axis.client.Call _call) throws java.rmi.RemoteException {
        return logonResult;
    }

    public boolean isLogonResult(org.apache.axis.client.Call _call, java.net.URL portAddress) throws java.rmi.RemoteException {
        return logonResult;
    }

    public void setLogonResult(javax.xml.namespace.QName portName, org.apache.axis.client.Call _call) throws java.rmi.RemoteException {
    }

    public void setLogonResult(javax.xml.namespace.QName portName, org.apache.axis.client.Call _call, java.net.URL portAddress) throws java.rmi.RemoteException {
    }

    public boolean isLogonResult(javax.xml.namespace.QName portName, org.apache.axis.client.Call _call) throws java.rmi.RemoteException {
        return logonResult;
    }

    public boolean isLogonResult(javax.xml.namespace.QName portName, org.apache.axis.client.Call _call, java.net.URL portAddress) throws java.rmi.RemoteException {
        return logonResult;
    }

    public void setLogonResult(org.apache.axis.client.Stub _stub) throws java.rmi.RemoteException {
    }

    public void setLogonResult(org.apache.axis.client.Stub _stub, java.net.URL portAddress) throws java.rmi.RemoteException {
    }

    public boolean isLogonResult(org.apache.axis.client.Stub _stub) throws java.rmi.RemoteException {
        return logonResult;
    }

    public boolean isLogonResult(org.apache.axis.client.Stub _stub, java.net.URL portAddress) throws java.rmi.RemoteException {
        return logonResult;
    }

    public void setLogonResult(org.apache.axis.client.PortType _port) throws java.rmi.RemoteException {
    }

    public void setLogonResult(org.apache.axis.client.PortType _port, java.net.URL portAddress) throws java.rmi.RemoteException {
    }

    public boolean isLogonResult(org.apache.axis.client.PortType _port) throws java.rmi.RemoteException {
        return logonResult;
    }

    public boolean isLogonResult(org.apache.axis.client.PortType _port, java.net.URL portAddress) throws java.rmi.RemoteException {
        return logonResult;
    }

    public void setLogonResult(java.lang.String _method) throws java.rmi.RemoteException {
    }

    public void setLogonResult(java.lang.String _method, java.lang.Object[] _args) throws java.rmi.RemoteException {
    }

    public java.lang.Object invoke(java.lang.String _method, java.lang.Object[] _args) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.Object invoke(java.rmi.Remote _obj, java.lang.String _method, java.lang.Object[] _args) throws java.rmi.RemoteException {
        return null;
    }

    public java.rmi.Remote toStub() throws java.rmi.RemoteException {
        return null;
    }

    public void setLogonResult(org.apache.axis.client.Call _call, java.lang.String _method) throws java.rmi.RemoteException {
    }

    public void setLogonResult(org.apache.axis.client.Call _call, java.lang.String _method, java.lang.Object[] _args) throws java.rmi.RemoteException {
    }

    public void setLogonResult(org.apache.axis.client.Call _call, java.lang.String _method, java.util.HashMap _headers, java.lang.Object[] _args) throws java.rmi.RemoteException {
    }

    public void setLogonResult(org.apache.axis.client.Call _call, java.lang.String _method, java.lang.Object[] _args, java.util.HashMap _headers) throws java.rmi.RemoteException {
    }

    public void setLogonResult(org.apache.axis.client.Call _call, java.lang.String _method, java.lang.Object[] _args, java.lang.String[] _sig) throws java.rmi.RemoteException {
    }

    public void setLogonResult(org.apache.axis.client.Call _call, java.lang.String _method, java.lang.Object[] _args, java.lang.String[] _sig, java.util.HashMap _headers) throws java.rmi.RemoteException {
    }

    public void setLogonResult(org.apache.axis.client.Call _call, java.lang.String _method, java.lang.Object[] _args, java.lang.String[] _sig