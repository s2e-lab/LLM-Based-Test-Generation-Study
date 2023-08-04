// _CompleteTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains ten unit test cases for the {@link _Complete#getTypeDesc()} method.
*/
class _CompleteTest {

    /**
    * Test case for {@link _Complete#getTypeDesc()} method.
    */
    @Test
    void getTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _Complete.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// _CompleteStub.java
package mygrid.web;

public class _CompleteStub extends org.apache.axis.client.Stub implements mygrid.web._Complete {
    private static int counter = 0;
    private static final long serialVersionUID = 20050618L;
    protected org.apache.axis.client.Call _call;
    protected org.apache.axis.client.Service _service;
    protected java.lang.String _endpointURL;
    protected javax.xml.namespace.QName _operationName;
    protected org.apache.axis.encoding.DimeEncodingType _encodingStyle;
    protected java.lang.String _nameSpace;
    public _CompleteStub() throws org.apache.axis.AxisFault {
        this(null);
    }
    public _CompleteStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        _endpointURL = endpointURL.toString();
    }
    public _CompleteStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
    }
    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }
    public java.lang.String getEndpointURL() {
        return _endpointURL;
    }
    public void setEndpointURL(java.lang.String endpointURL) {
        _endpointURL = endpointURL;
    }
    public javax.xml.namespace.QName getOperationName() {
        return _operationName;
    }
    public void setOperationName(javax.xml.namespace.QName operationName) {
        _operationName = operationName;
    }
    public org.apache.axis.encoding.DimeEncodingType getEncodingStyle() {
        return _encodingStyle;
    }
    public void setEncodingStyle(org.apache.axis.encoding.DimeEncodingType encodingStyle) {
        _encodingStyle = encodingStyle;
    }
    public java.lang.String getStyleSheet() {
        return _styleSheet;
    }
    public void setStyleSheet(java.lang.String styleSheet) {
        _styleSheet = styleSheet;
    }
    public java.lang.String getSoapActionURI() {
        return _soapActionURI;
    }
    public void setSoapActionURI(java.lang.String soapActionURI) {
        _soapActionURI = soapActionURI;
    }
    public java.lang.String getEndpointAddress() {
        return _endpointAddress;
    }
    public void setEndpointAddress(java.lang.String endpointAddress) {
        _endpointAddress = endpointAddress;
    }
    public boolean getMaintainSession() {
        return _maintainSession;
    }
    public void setMaintainSession(boolean maintainSession) {
        _maintainSession = maintainSession;
    }
    public java.lang.String getUsername() {
        return _username;
    }
    public void setUsername(java.lang.String username) {
        _username = username;
    }
    public java.lang.String getPassword() {
        return _password;
    }
    public void setPassword(java.lang.String password) {
        _password = password;
    }
    public int getTimeout() {
        return _timeout;
    }
    public void setTimeout(int timeout) {
        _timeout = timeout;
    }
    public java.lang.String getPortName() {
        return _portName;
    }
    public void setPortName(java.lang.String portName) {
        _portName = portName;
    }
    public java.util.Iterator getProperties() {
        return _properties.values().iterator();
    }
    public void setProperty(java.lang.String name, java.lang.Object value) {
        _properties.put(name, value);
    }
    public java.lang.Object getProperty(java.lang.String name) {
        return _properties.get(name);
    }
    public void setSession(org.apache.axis.client.Call _call) {
        super._call = _call;
    }
    public void setProperty(java.lang.String name, java.lang.Object value) {
        super.setProperty(name, value);
    }
    public java.lang.Object getProperty(java.lang.String name) {
        return super.getProperty(name);
    }
    public org.apache.axis.client.Call getCall() {
        if (super._call == null) {
            try {
                super._call = createCall();
            }
            catch (java.rmi.RemoteException _t) {
                throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
            }
        }
        return super._call;
    }
    public void setEncodingStyle(java.lang.String encodingStyle) {
        super._encodingStyle = org.apache.axis.encoding.XMLType.toDimeEncodingType(encodingStyle);
    }
    public java.lang.String getEncodingStyle() {
        return super._encodingStyle.toString();
    }
    public void setMaintainSession(boolean maintainSession) {
        super._maintainSession = maintainSession;
    }
    public boolean getMaintainSession() {
        return super._maintainSession;
    }
    public void setUsername(java.lang.String username) {
        super._username = username;
    }
    public java.lang.String getUsername() {
        return super._username;
    }
    public void setPassword(java.lang.String password) {
        super._password = password;
    }
    public java.lang.String getPassword() {
        return super._password;
    }
    public void setTimeout(int timeout) {
        super._timeout = timeout;
    }
    public int getTimeout() {
        return super._timeout;
    }
    public void setPortName(java.lang.String portName) {
        super._portName = portName;
    }
    public java.lang.String getPortName() {
        return super._portName;
    }
    public void setEndpointAddress(java.lang.String endpointAddress) {
        super._endpointAddress = endpointAddress;
    }
    public java.lang.String getEndpointAddress() {
        return super._endpointAddress;
    }
    public void setStylesheet(java.lang.String stylesheet) {
        super._styleSheet = stylesheet;
    }
    public java.lang.String getStylesheet() {
        return super._styleSheet;
    }
    public void setSoapActionURI(java.lang.String soapActionURI) {
        super._soapActionURI = soapActionURI;
    }
    public java.lang.String getSoapActionURI() {
        return super._soapActionURI;
    }
    public void setService(org.apache.axis.client.Service service) {
        super._service = service;
    }
    public org.apache.axis.client.Service getService() {
        if (super._service == null) {
            super._service = new org.apache.axis.client.Service();
        }
        return super._service;
    }
    public void setCall(org.apache.axis.client.Call call) {
        super._call = call;
    }
    public org.apache.axis.client.Call getCall() {
        if (super._call == null) {
            try {
                super._call = createCall();
            }
           