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
    * Test {@link _GetEngineResponse#getTypeDesc()} method for the following conditions:
    * <ul>
    * <li>The value of the field <code>getEngineResult</code> is <code>null</code>.</li>
    * </ul>
    */
    @Test
    void testGetTypeDesc00() {
        _GetEngineResponse target = new _GetEngineResponse();
        target.setGetEngineResult(null);
        org.apache.axis.description.TypeDesc typeDesc = target.getTypeDesc();
        assertTrue(typeDesc.getFields().length == 1);
        assertTrue(typeDesc.getFieldNames().length == 1);
        assertTrue(typeDesc.getField("getEngineResult").getType().equals(new mygrid.web.Engine().getClass()));
    }

    /**
    * Test {@link _GetEngineResponse#getTypeDesc()} method for the following conditions:
    * <ul>
    * <li>The value of the field <code>getEngineResult</code> is not <code>null</code>.</li>
    * </ul>
    */
    @Test
    void testGetTypeDesc01() {
        _GetEngineResponse target = new _GetEngineResponse();
        target.setGetEngineResult(new mygrid.web.Engine());
        org.apache.axis.description.TypeDesc typeDesc = target.getTypeDesc();
        assertTrue(typeDesc.getFields().length == 1);
        assertTrue(typeDesc.getFieldNames().length == 1);
        assertTrue(typeDesc.getField("getEngineResult").getType().equals(new mygrid.web.Engine().getClass()));
    }
}

// _GetEngineResponseStub.java
package mygrid.web;

public class _GetEngineResponseStub extends org.apache.axis.client.Stub implements mygrid.web.GetEngineResponse {

    private mygrid.web.Engine getEngineResult;

    public _GetEngineResponseStub() {
    }

    public _GetEngineResponseStub(org.apache.axis.client.Call _call) {
        super(_call);
    }

    public mygrid.web.Engine getGetEngineResult() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.cs.man.ac.uk/~horridgm/mygrid/GetEngineResponse/getEngineResult");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.cs.man.ac.uk/~horridgm/mygrid/", "getEngineResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{});
            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (mygrid.web.Engine) _resp;
                } catch (java.lang.Exception _exception) {
                    return (mygrid.web.Engine) org.apache.axis.utils.JavaUtils.convert(_resp, mygrid.web.Engine.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof mygrid.web.ServiceException) {
                    throw (mygrid.web.ServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public void setGetEngineResult(mygrid.web.Engine getEngineResult) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.cs.man.ac.uk/~horridgm/mygrid/GetEngineResponse/setGetEngineResult");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.cs.man.ac.uk/~horridgm/mygrid/", "setGetEngineResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{getEngineResult});
            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof mygrid.web.ServiceException) {
                    throw (mygrid.web.ServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public void setGetEngineResult(mygrid.web.Engine getEngineResult, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.cs.man.ac.uk/~horridgm/mygrid/GetEngineResponse/setGetEngineResult");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.cs.man.ac.uk/~horridgm/mygrid/", "setGetEngineResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{getEngineResult, username, password});
            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof mygrid.web.ServiceException) {
                    throw (mygrid.web.ServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public void setGetEngineResult(mygrid.web.Engine getEngineResult, java.lang.String username, java.lang.String password, java.lang.String endpoint) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.cs.man.ac.uk/~horridgm/mygrid/GetEngine