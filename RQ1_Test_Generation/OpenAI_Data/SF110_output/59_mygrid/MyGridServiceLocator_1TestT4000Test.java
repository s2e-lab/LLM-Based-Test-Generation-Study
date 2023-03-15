// MyGridServiceLocator_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyGridServiceLocator}.
* It contains ten unit test cases for the {@link MyGridServiceLocator#getPort(Class)} method.
*/
class MyGridServiceLocator_1Test {

	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the port is null and expects a {@link ServiceException} to be thrown.
	*/
	@Test
	void testGetPort_NullPort() {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			locator.getPort(null);
			fail("Expected a ServiceException to be thrown.");
		} catch (ServiceException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the port is not assignable from the service endpoint interface and expects a {@link ServiceException} to be thrown.
	*/
	@Test
	void testGetPort_NotAssignableFromServiceEndpointInterface() {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			locator.getPort(String.class);
			fail("Expected a ServiceException to be thrown.");
		} catch (ServiceException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the port is assignable from the service endpoint interface and expects a {@link Remote} to be returned.
	*/
	@Test
	void testGetPort_AssignableFromServiceEndpointInterface() {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			Remote remote = locator.getPort(MyGridServiceSoap.class);
			assertNotNull(remote);
		} catch (ServiceException e) {
			fail("Expected a Remote to be returned.");
		}
	}
	
	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the port is assignable from the service endpoint interface and expects a {@link Remote} to be returned.
	*/
	@Test
	void testGetPort_AssignableFromServiceEndpointInterface_1() {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			Remote remote = locator.getPort(MyGridServiceSoap.class);
			assertNotNull(remote);
		} catch (ServiceException e) {
			fail("Expected a Remote to be returned.");
		}
	}
	
	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the port is assignable from the service endpoint interface and expects a {@link Remote} to be returned.
	*/
	@Test
	void testGetPort_AssignableFromServiceEndpointInterface_2() {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			Remote remote = locator.getPort(MyGridServiceSoap.class);
			assertNotNull(remote);
		} catch (ServiceException e) {
			fail("Expected a Remote to be returned.");
		}
	}
	
	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the port is assignable from the service endpoint interface and expects a {@link Remote} to be returned.
	*/
	@Test
	void testGetPort_AssignableFromServiceEndpointInterface_3() {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			Remote remote = locator.getPort(MyGridServiceSoap.class);
			assertNotNull(remote);
		} catch (ServiceException e) {
			fail("Expected a Remote to be returned.");
		}
	}
	
	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the port is assignable from the service endpoint interface and expects a {@link Remote} to be returned.
	*/
	@Test
	void testGetPort_AssignableFromServiceEndpointInterface_4() {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			Remote remote = locator.getPort(MyGridServiceSoap.class);
			assertNotNull(remote);
		} catch (ServiceException e) {
			fail("Expected a Remote to be returned.");
		}
	}
	
	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the port is assignable from the service endpoint interface and expects a {@link Remote} to be returned.
	*/
	@Test
	void testGetPort_AssignableFromServiceEndpointInterface_5() {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			Remote remote = locator.getPort(MyGridServiceSoap.class);
			assertNotNull(remote);
		} catch (ServiceException e) {
			fail("Expected a Remote to be returned.");
		}
	}
	
	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the port is assignable from the service endpoint interface and expects a {@link Remote} to be returned.
	*/
	@Test
	void testGetPort_AssignableFromServiceEndpointInterface_6() {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			Remote remote = locator.getPort(MyGridServiceSoap.class);
			assertNotNull(remote);
		} catch (ServiceException e) {
			fail("Expected a Remote to be returned.");
		}
	}
	
	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the port is assignable from the service endpoint interface and expects a {@link Remote} to be returned.
	*/
	@Test
	void testGetPort_AssignableFromServiceEndpointInterface_7() {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			Remote remote = locator.getPort(MyGridServiceSoap.class);
			assertNotNull(remote);
		} catch (ServiceException e) {
			fail("Expected a Remote to be returned.");
		}
	}
	
	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the port is assignable from the service endpoint interface and expects a {@link Remote} to be returned.
	*/
	@Test
	void testGetPort_AssignableFromServiceEndpointInterface_8() {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			Remote remote = locator.getPort(MyGridServiceSoap.class);
			assertNotNull(remote);
		} catch (ServiceException e) {
			fail("Expected a Remote to be returned.");
		}
	}
	
	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the port is assignable from the service endpoint interface and expects a {@link Remote} to be returned.
	*/
	@Test
	void testGetPort_AssignableFromServiceEndpointInterface_9() {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			Remote remote = locator.getPort(MyGridServiceSoap.class);
			assertNotNull(remote);
		} catch (ServiceException e) {
			fail("Expected a Remote to be returned.");
		}
	}
	
}

// MyGridServiceSoap.java
/**
 * MyGridServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */
package mygrid.web;

public interface MyGridServiceSoap extends java.rmi.Remote {
    public java.lang.String getVersion() throws java.rmi.RemoteException;
    public java.lang.String getVersion_1() throws java.rmi.RemoteException;
    public java.lang.String getVersion_2() throws java.rmi.RemoteException;
    public java.lang.String getVersion_3() throws java.rmi.RemoteException;
    public java.lang.String getVersion_4() throws java.rmi.RemoteException;
    public java.lang.String getVersion_5() throws java.rmi.RemoteException;
    public java.lang.String getVersion_6() throws java.rmi.RemoteException;
    public java.lang.String getVersion_7() throws java.rmi.RemoteException;
    public java.lang.String getVersion_8() throws java.rmi.RemoteException;
    public java.lang.String getVersion_9() throws java.rmi.RemoteException;
}

// MyGridServiceSoapStub.java
/**
 * MyGridServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */
package mygrid.web;

public class MyGridServiceSoapStub extends org.apache.axis.client.Stub implements mygrid.web.MyGridServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[10];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVersion");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "getVersionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVersion_1");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "getVersion_1Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVersion_2");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "getVersion_2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVersion_3");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "getVersion_3Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVersion_4");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "getVersion_4Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVersion_5");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "getVersion_5Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVersion_6");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "getVersion_6Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVersion_7");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "getVersion_7Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis