// _ProgressResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _ProgressResponse}.
* It contains ten unit test cases for the {@link _ProgressResponse#getTypeDesc()} method.
*/
class _ProgressResponseTest {

    /**
    * Test case for {@link _ProgressResponse#getTypeDesc()} method.
    */
    @Test
    void getTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _ProgressResponse.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// _ProgressResponseStub.java
package mygrid.web;

public class _ProgressResponseStub extends org.apache.axis.client.Stub implements mygrid.web._ProgressResponse {
    private boolean _is_local_stub;

    public _ProgressResponseStub() {
        this(null);
    }

    public _ProgressResponseStub(org.apache.axis.client.Call _call) {
        super(_call);
        _is_local_stub = false;
    }

    public _ProgressResponseStub(java.net.URL endpointURL, javax.xml.rpc.Service service) {
        super(endpointURL, service);
        _is_local_stub = false;
    }

    public _ProgressResponseStub(java.net.URL endpointURL, javax.xml.rpc.Service service, java.util.ResourceBundle resourceBundle) {
        super(endpointURL, service, resourceBundle);
        _is_local_stub = false;
    }

    public _ProgressResponseStub(javax.xml.rpc.Service service) {
        super(service);
        _is_local_stub = false;
    }

    public _ProgressResponseStub(javax.xml.rpc.Service service, java.util.ResourceBundle resourceBundle) {
        super(service, resourceBundle);
        _is_local_stub = false;
    }

    public java.lang.String getProgress() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_ProgressResponse.class.getMethods()[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://mygrid.org/getProgress");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mygrid.org", "getProgress"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (java.lang.String) _resp;
                } catch (java.lang.Exception _exception) {
                    return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof java.lang.Exception) {
                    throw (java.lang.Exception) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public void setProgress(java.lang.String progress) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_ProgressResponse.class.getMethods()[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://mygrid.org/setProgress");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mygrid.org", "setProgress"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{progress});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof java.lang.Exception) {
                    throw (java.lang.Exception) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public void setProgress(java.lang.String progress, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_ProgressResponse.class.getMethods()[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://mygrid.org/setProgress");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mygrid.org", "setProgress"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{progress, sessionId});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof java.lang.Exception) {
                    throw (java.lang.Exception) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public void setProgress(java.lang.String progress, java.lang.String sessionId, java.lang.String taskId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_ProgressResponse.class.getMethods()[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://mygrid.org/setProgress");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mygrid.org", "setProgress"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{progress, sessionId, taskId});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java