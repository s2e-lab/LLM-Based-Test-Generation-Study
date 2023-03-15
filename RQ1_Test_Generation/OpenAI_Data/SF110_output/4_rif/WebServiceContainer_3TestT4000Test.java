// WebServiceContainer_3Test.java
package com.densebrain.rif.server.transport;

import java.net.InetAddress;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.apache.axis2.description.AxisService;
import org.apache.axis2.rpc.receivers.RPCMessageReceiver;
import org.apache.axis2.transport.http.turnup.SimpleHTTPServer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WebServiceContainer}.
* It contains ten unit test cases for the {@link WebServiceContainer#getEPRForService(String, String)} method.
*/
class WebServiceContainer_3Test {

	/**
	* Test case for {@link WebServiceContainer#getEPRForService(String, String)} method.
	*
	* @throws AxisFault
	* @throws RemoteException
	*/
	@Test
	void testGetEPRForService_1() throws AxisFault, RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer container = new WebServiceContainer(configurationContext, "/ws", "localhost", 8080);
		EndpointReference endpointReference = container.getEPRForService("serviceName", "ip");
		assertEquals("http://localhost:8080/ws/serviceName", endpointReference.getAddress());
	}
	
	/**
	* Test case for {@link WebServiceContainer#getEPRForService(String, String)} method.
	*
	* @throws AxisFault
	* @throws RemoteException
	*/
	@Test
	void testGetEPRForService_2() throws AxisFault, RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer container = new WebServiceContainer(configurationContext, "/ws", "localhost", 8080);
		EndpointReference endpointReference = container.getEPRForService("serviceName", "ip");
		assertEquals("http://localhost:8080/ws/serviceName", endpointReference.getAddress());
	}
	
	/**
	* Test case for {@link WebServiceContainer#getEPRForService(String, String)} method.
	*
	* @throws AxisFault
	* @throws RemoteException
	*/
	@Test
	void testGetEPRForService_3() throws AxisFault, RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer container = new WebServiceContainer(configurationContext, "/ws", "localhost", 8080);
		EndpointReference endpointReference = container.getEPRForService("serviceName", "ip");
		assertEquals("http://localhost:8080/ws/serviceName", endpointReference.getAddress());
	}
	
	/**
	* Test case for {@link WebServiceContainer#getEPRForService(String, String)} method.
	*
	* @throws AxisFault
	* @throws RemoteException
	*/
	@Test
	void testGetEPRForService_4() throws AxisFault, RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer container = new WebServiceContainer(configurationContext, "/ws", "localhost", 8080);
		EndpointReference endpointReference = container.getEPRForService("serviceName", "ip");
		assertEquals("http://localhost:8080/ws/serviceName", endpointReference.getAddress());
	}
	
	/**
	* Test case for {@link WebServiceContainer#getEPRForService(String, String)} method.
	*
	* @throws AxisFault
	* @throws RemoteException
	*/
	@Test
	void testGetEPRForService_5() throws AxisFault, RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer container = new WebServiceContainer(configurationContext, "/ws", "localhost", 8080);
		EndpointReference endpointReference = container.getEPRForService("serviceName", "ip");
		assertEquals("http://localhost:8080/ws/serviceName", endpointReference.getAddress());
	}
	
	/**
	* Test case for {@link WebServiceContainer#getEPRForService(String, String)} method.
	*
	* @throws AxisFault
	* @throws RemoteException
	*/
	@Test
	void testGetEPRForService_6() throws AxisFault, RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer container = new WebServiceContainer(configurationContext, "/ws", "localhost", 8080);
		EndpointReference endpointReference = container.getEPRForService("serviceName", "ip");
		assertEquals("http://localhost:8080/ws/serviceName", endpointReference.getAddress());
	}
	
	/**
	* Test case for {@link WebServiceContainer#getEPRForService(String, String)} method.
	*
	* @throws AxisFault
	* @throws RemoteException
	*/
	@Test
	void testGetEPRForService_7() throws AxisFault, RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer container = new WebServiceContainer(configurationContext, "/ws", "localhost", 8080);
		EndpointReference endpointReference = container.getEPRForService("serviceName", "ip");
		assertEquals("http://localhost:8080/ws/serviceName", endpointReference.getAddress());
	}
	
	/**
	* Test case for {@link WebServiceContainer#getEPRForService(String, String)} method.
	*
	* @throws AxisFault
	* @throws RemoteException
	*/
	@Test
	void testGetEPRForService_8() throws AxisFault, RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer container = new WebServiceContainer(configurationContext, "/ws", "localhost", 8080);
		EndpointReference endpointReference = container.getEPRForService("serviceName", "ip");
		assertEquals("http://localhost:8080/ws/serviceName", endpointReference.getAddress());
	}
	
	/**
	* Test case for {@link WebServiceContainer#getEPRForService(String, String)} method.
	*
	* @throws AxisFault
	* @throws RemoteException
	*/
	@Test
	void testGetEPRForService_9() throws AxisFault, RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer container = new WebServiceContainer(configurationContext, "/ws", "localhost", 8080);
		EndpointReference endpointReference = container.getEPRForService("serviceName", "ip");
		assertEquals("http://localhost:8080/ws/serviceName", endpointReference.getAddress());
	}
	
	/**
	* Test case for {@link WebServiceContainer#getEPRForService(String, String)} method.
	*
	* @throws AxisFault
	* @throws RemoteException
	*/
	@Test
	void testGetEPRForService_10() throws AxisFault, RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer container = new WebServiceContainer(configurationContext, "/ws", "localhost", 8080);
		EndpointReference endpointReference = container.getEPRForService("serviceName", "ip");
		assertEquals("http://localhost:8080/ws/serviceName", endpointReference.getAddress());
	}
}