// WebServiceContainerTest0.java
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
* It contains ten unit test cases for the {@link WebServiceContainer#newInstance(String, int, String)} method.
*/
class WebServiceContainerTest0 {

	/**
	* Test case for the {@link WebServiceContainer#newInstance(String, int, String)} method.
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance0() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link WebServiceContainer#newInstance(String, int, String)} method.
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance1() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link WebServiceContainer#newInstance(String, int, String)} method.
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance2() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link WebServiceContainer#newInstance(String, int, String)} method.
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance3() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link WebServiceContainer#newInstance(String, int, String)} method.
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance4() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link WebServiceContainer#newInstance(String, int, String)} method.
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance5() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link WebServiceContainer#newInstance(String, int, String)} method.
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance6() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link WebServiceContainer#newInstance(String, int, String)} method.
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance7() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link WebServiceContainer#newInstance(String, int, String)} method.
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance8() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link WebServiceContainer#newInstance(String, int, String)} method.
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance9() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
	
}

// WebServiceContainerTest1.java
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
* It contains ten unit test cases for the {@link WebServiceContainer#newInstance(ConfigurationContext)} method.
*/
class WebServiceContainerTest1 {
		
	/**
	* Test case for the {@link WebServiceContainer#newInstance(ConfigurationContext)} method.
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance0() throws RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link WebServiceContainer#newInstance(ConfigurationContext)} method.
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance1() throws RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link WebServiceContainer#newInstance(ConfigurationContext)} method.
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance2() throws RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link WebServiceContainer#newInstance(ConfigurationContext)} method.
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance3() throws RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link WebServiceContainer#newInstance(ConfigurationContext)} method.
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance4() throws RemoteException {