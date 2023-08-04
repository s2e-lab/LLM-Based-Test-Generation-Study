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
    * Test {@link _ProgressResponse#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _ProgressResponse.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("mygrid.web._ProgressResponse", typeDesc.getXmlType().getLocalPart());
    }
}

// _ProgressResponseStub.java
package mygrid.web;

public class _ProgressResponseStub extends org.apache.axis.client.Stub implements mygrid.web._ProgressResponse {

    private static int counter = 0;

    private static final java.lang.String _MYGRID_WEB__PROGRESSRESPONSE_MYGRID_WEB__PROGRESSRESPONSE_SOAP_ACTION = "http://mygrid.esys.esa.int/ProgressResponse";

    private static final java.lang.String _MYGRID_WEB__PROGRESSRESPONSE_MYGRID_WEB__PROGRESSRESPONSE_SOAP_URI = "http://mygrid.esys.esa.int/ProgressResponse";

    private static final java.lang.String _MYGRID_WEB__PROGRESSRESPONSE_MYGRID_WEB__PROGRESSRESPONSE_SOAP_ENVELOPE_NAMESPACE_URI = "http://mygrid.esys.esa.int/ProgressResponse";

    private static final java.lang.String _MYGRID_WEB__PROGRESSRESPONSE_MYGRID_WEB__PROGRESSRESPONSE_SOAP_ENVELOPE_LOCAL_NAME = "ProgressResponse";

    private static final java.lang.String _MYGRID_WEB__PROGRESSRESPONSE_MYGRID_WEB__PROGRESSRESPONSE_SOAP_BODY_LOCAL_NAME = "ProgressResponse";

    private static final java.lang.String _MYGRID_WEB__PROGRESSRESPONSE_MYGRID_WEB__PROGRESSRESPONSE_SOAP_HEADER_LOCAL_NAME = "ProgressResponse";

    private static org.apache.axis.description.OperationDesc[] _MYGRID_WEB__PROGRESSRESPONSE_MYGRID_WEB__PROGRESSRESPONSE_OPERATIONS;

    private static org.apache.axis.description.FaultDesc[] _MYGRID_WEB__PROGRESSRESPONSE_MYGRID_WEB__PROGRESSRESPONSE_FAULTS;

    private static org.apache.axis.description.ParameterDesc[] _MYGRID_WEB__PROGRESSRESPONSE_MYGRID_WEB__PROGRESSRESPONSE_PARAMETERS;

    private static org.apache.axis.description.TypeDesc _MYGRID_WEB__PROGRESSRESPONSE_MYGRID_WEB__PROGRESSRESPONSE_TYPEDESC;

    private static boolean _MYGRID_WEB__PROGRESSRESPONSE_MYGRID_WEB__PROGRESSRESPONSE_TYPEDESC_REGISTERED = false;

    public _ProgressResponseStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public _ProgressResponseStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public _ProgressResponseStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.2");
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
        addBindings5();
        addBindings6();
        addBindings7();
        addBindings8();
        addBindings9();
    }

    private void addBindings0() {
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://mygrid.esys.esa.int", "ProgressResponse");
        cachedSerQNames.add(qName);
        cls = mygrid.web._ProgressResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);
        cachedSerFactories.add(arraysf);
        cachedDeserFactories.add(arraydf);
        cachedSerFactories.add(simplesf);
        cachedDeserFactories.add(simpledf);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);
        qName = new javax.xml.namespace.QName("http://mygrid.esys.esa.int", "ProgressResponse");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());
    }

    private void addBindings1() {
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://mygrid.esys.esa.int", "ProgressResponse");
        cachedSerQNames.add(qName);
        cls = mygrid.web._ProgressResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beand