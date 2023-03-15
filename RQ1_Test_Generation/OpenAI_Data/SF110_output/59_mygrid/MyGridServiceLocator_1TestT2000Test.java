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
	* It tests the case that the portName is null and the serviceEndpointInterface is null and expects ServiceException.
	*/
	@Test
	public void testGetPort_NullPortNameNullServiceEndpointInterface() throws Exception {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			locator.getPort(null, null);
			fail("Expects ServiceException");
		} catch (javax.xml.rpc.ServiceException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the portName is null and the serviceEndpointInterface is not null and expects ServiceException.
	*/
	@Test
	public void testGetPort_NullPortNameNotNullServiceEndpointInterface() throws Exception {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			locator.getPort(null, MyGridServiceSoap.class);
			fail("Expects ServiceException");
		} catch (javax.xml.rpc.ServiceException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the portName is not null and the serviceEndpointInterface is null and expects ServiceException.
	*/
	@Test
	public void testGetPort_NotNullPortNameNullServiceEndpointInterface() throws Exception {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			locator.getPort(new javax.xml.namespace.QName("MyGridServiceSoap"), null);
			fail("Expects ServiceException");
		} catch (javax.xml.rpc.ServiceException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the portName is not null and the serviceEndpointInterface is not null and expects ServiceException.
	*/
	@Test
	public void testGetPort_NotNullPortNameNotNullServiceEndpointInterface() throws Exception {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			locator.getPort(new javax.xml.namespace.QName("MyGridServiceSoap"), MyGridServiceSoap.class);
			fail("Expects ServiceException");
		} catch (javax.xml.rpc.ServiceException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the portName is null and the serviceEndpointInterface is not null and expects ServiceException.
	*/
	@Test
	public void testGetPort_NullPortNameNotNullServiceEndpointInterface2() throws Exception {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			locator.getPort(null, MyGridServiceSoap.class);
			fail("Expects ServiceException");
		} catch (javax.xml.rpc.ServiceException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the portName is not null and the serviceEndpointInterface is null and expects ServiceException.
	*/
	@Test
	public void testGetPort_NotNullPortNameNullServiceEndpointInterface2() throws Exception {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			locator.getPort(new javax.xml.namespace.QName("MyGridServiceSoap"), null);
			fail("Expects ServiceException");
		} catch (javax.xml.rpc.ServiceException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the portName is not null and the serviceEndpointInterface is not null and expects ServiceException.
	*/
	@Test
	public void testGetPort_NotNullPortNameNotNullServiceEndpointInterface2() throws Exception {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			locator.getPort(new javax.xml.namespace.QName("MyGridServiceSoap"), MyGridServiceSoap.class);
			fail("Expects ServiceException");
		} catch (javax.xml.rpc.ServiceException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the portName is null and the serviceEndpointInterface is not null and expects ServiceException.
	*/
	@Test
	public void testGetPort_NullPortNameNotNullServiceEndpointInterface3() throws Exception {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			locator.getPort(null, MyGridServiceSoap.class);
			fail("Expects ServiceException");
		} catch (javax.xml.rpc.ServiceException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the portName is not null and the serviceEndpointInterface is null and expects ServiceException.
	*/
	@Test
	public void testGetPort_NotNullPortNameNullServiceEndpointInterface3() throws Exception {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			locator.getPort(new javax.xml.namespace.QName("MyGridServiceSoap"), null);
			fail("Expects ServiceException");
		} catch (javax.xml.rpc.ServiceException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link MyGridServiceLocator#getPort(Class)} method.
	* It tests the case that the portName is not null and the serviceEndpointInterface is not null and expects ServiceException.
	*/
	@Test
	public void testGetPort_NotNullPortNameNotNullServiceEndpointInterface3() throws Exception {
		MyGridServiceLocator locator = new MyGridServiceLocator();
		try {
			locator.getPort(new javax.xml.namespace.QName("MyGridServiceSoap"), MyGridServiceSoap.class);
			fail("Expects ServiceException");
		} catch (javax.xml.rpc.ServiceException e) {
			// expected
		}
	}
	
}