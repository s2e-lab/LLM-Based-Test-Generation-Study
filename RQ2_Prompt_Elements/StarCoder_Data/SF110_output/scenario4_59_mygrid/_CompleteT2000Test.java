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
    * Test {@link _Complete#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _Complete.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// _CompleteStub.java
package mygrid.web;

public class _CompleteStub extends org.apache.axis.client.Stub implements mygrid.web.Complete {

    private static int counter = 0;

    private static final java.lang.String _MYGRID_WEB_COMPLETE_MYGRID_WEB_COMPLETE_SOAP_ACTION = "http://mygrid.mygrid.org:8080/mygrid-webservice/Complete";

    private static final java.lang.String _MYGRID_WEB_COMPLETE_MYGRID_WEB_COMPLETE_SOAP_URI = "http://mygrid.mygrid.org:8080/mygrid-webservice/Complete";

    private static final java.lang.String _MYGRID_WEB_COMPLETE_MYGRID_WEB_COMPLETE_SOAP_ENVELOPE_NAMESPACE_URI = "http://mygrid.mygrid.org:8080/mygrid-webservice";

    private static final java.lang.String _MYGRID_WEB_COMPLETE_MYGRID_WEB_COMPLETE_SOAP_ENVELOPE_LOCAL_NAME = "Complete";

    private static final java.lang.String _MYGRID_WEB_COMPLETE_MYGRID_WEB_COMPLETE_SOAP_FACTORY_KEY = "Complete";

    private static java.lang.String _MYGRID_WEB_COMPLETE_MYGRID_WEB_COMPLETE_SOAP_NAMESPACE_URI = "http://mygrid.mygrid.org:8080/mygrid-webservice";

    private static java.lang.String _MYGRID_WEB_COMPLETE_MYGRID_WEB_COMPLETE_SOAP_LOCAL_NAME = "Complete";

    private static java.lang.String _MYGRID_WEB_COMPLETE_MYGRID_WEB_COMPLETE_SOAP_FACTORY_KEY = "Complete";

    public _CompleteStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public _CompleteStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public _CompleteStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
        qName = new javax.xml.namespace.QName("http://mygrid.mygrid.org:8080/mygrid-webservice", "Job");
        cachedSerQNames.add(qName);
        cls = mygrid.web.Job.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://mygrid.mygrid.org:8080/mygrid-webservice", "JobState");
        cachedSerQNames.add(qName);
        cls = mygrid.web.JobState.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://mygrid.mygrid.org:8080/mygrid-webservice", "JobStateEnumeration");
        cachedSerQNames.add(qName);
        cls = mygrid.web.JobStateEnumeration.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://mygrid.mygrid.org:8080/mygrid-webservice", "JobStateEnumerationWrapper");
        cachedSerQNames.add(qName);
        cls = mygrid.web.JobStateEnumerationWrapper.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://mygrid.mygrid.org:8080/mygrid-webservice", "JobStateWrapper");
        cachedSerQNames.add(qName);
        cls = mygrid.web.JobStateWrapper.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://mygrid.mygrid.org:8080/mygrid-webservice", "JobWrapper");
        cachedSerQNames.add(qName);
        cls = mygrid.web.JobWrapper.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://mygrid.mygrid.org:8080/mygrid-webservice", "ServiceException");
        cachedSerQNames.add(qName);
        cls = mygrid.web.ServiceException.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://mygrid.mygrid.org:8080/mygrid-webservice", "ServiceExceptionWrapper");
        cachedSerQNames.add(qName);
        cls = mygrid.web.