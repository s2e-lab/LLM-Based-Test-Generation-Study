// _RequestResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains ten unit test cases for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponseTest {

    /**
    * Test case for {@link _RequestResponse#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _RequestResponse.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// _RequestResponseStub.java
package mygrid.web;

public class _RequestResponseStub extends org.apache.axis.client.Stub implements mygrid.web._RequestResponse {

    private boolean requestResult;

    public _RequestResponseStub() {
    }

    public _RequestResponseStub(org.apache.axis.client.Call _call) {
        super(_call);
    }

    public _RequestResponseStub(java.net.URL endpointURL, javax.xml.rpc.Service service) {
        super(endpointURL, service);
    }

    public _RequestResponseStub(java.net.URL endpointURL, javax.xml.rpc.Service service, java.util.HashMap _headers) {
        super(endpointURL, service, _headers);
    }

    public _RequestResponseStub(java.net.URL endpointURL, javax.xml.rpc.Service service, java.lang.String method) {
        super(endpointURL, service, method);
    }

    public _RequestResponseStub(java.net.URL endpointURL, javax.xml.rpc.Service service, java.lang.String method, java.lang.Object[] args) {
        super(endpointURL, service, method, args);
    }

    public _RequestResponseStub(java.net.URL endpointURL, javax.xml.rpc.Service service, java.lang.String method, java.util.HashMap _headers, java.lang.Object[] args) {
        super(endpointURL, service, method, _headers, args);
    }

    public _RequestResponseStub(javax.xml.rpc.Service service, java.lang.String method) {
        super(service, method);
    }

    public _RequestResponseStub(javax.xml.rpc.Service service, java.lang.String method, java.lang.Object[] args) {
        super(service, method, args);
    }

    public _RequestResponseStub(javax.xml.rpc.Service service, java.lang.String method, java.util.HashMap _headers, java.lang.Object[] args) {
        super(service, method, _headers, args);
    }

    public boolean isRequestResult() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.mygrid.org", "isRequestResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Boolean) _resp).booleanValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
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

    public void setRequestResult(boolean requestResult) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.mygrid.org", "setRequestResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{requestResult});

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

    public void setRequestResult(boolean requestResult, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.mygrid.org", "setRequestResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{requestResult, username, password});

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

    public void setRequestResult(boolean requestResult, java.lang.String username, java.lang.String password, java.lang.String authentication) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(