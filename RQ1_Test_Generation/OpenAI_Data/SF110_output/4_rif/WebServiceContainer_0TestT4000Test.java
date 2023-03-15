// WebServiceContainer_0Test.java
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
class WebServiceContainer_0Test {

	/**
	* Test case for {@link WebServiceContainer#newInstance(String, int, String)}
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance_0() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link WebServiceContainer#newInstance(String, int, String)}
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance_1() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link WebServiceContainer#newInstance(String, int, String)}
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance_2() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link WebServiceContainer#newInstance(String, int, String)}
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance_3() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link WebServiceContainer#newInstance(String, int, String)}
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance_4() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link WebServiceContainer#newInstance(String, int, String)}
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance_5() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link WebServiceContainer#newInstance(String, int, String)}
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance_6() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link WebServiceContainer#newInstance(String, int, String)}
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance_7() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link WebServiceContainer#newInstance(String, int, String)}
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance_8() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link WebServiceContainer#newInstance(String, int, String)}
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance_9() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
	
}

// WebServiceContainer_1Test.java
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
class WebServiceContainer_1Test {
		
	/**
	* Test case for {@link WebServiceContainer#newInstance(ConfigurationContext)}
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance_0() throws RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link WebServiceContainer#newInstance(ConfigurationContext)}
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance_1() throws RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link WebServiceContainer#newInstance(ConfigurationContext)}
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance_2() throws RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link WebServiceContainer#newInstance(ConfigurationContext)}
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance_3() throws RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link WebServiceContainer#newInstance(ConfigurationContext)}
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance_4() throws RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link WebServiceContainer#newInstance(ConfigurationContext)}
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance_5() throws RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link WebServiceContainer#newInstance(ConfigurationContext)}
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance_6() throws RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link WebServiceContainer#newInstance(ConfigurationContext)}
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance_7() throws RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link WebServiceContainer#newInstance(ConfigurationContext)}
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance_8() throws RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link WebServiceContainer#newInstance(ConfigurationContext)}
	*
	* @throws RemoteException
	*/
	@Test
	void testNewInstance_9() throws RemoteException {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);
		assertNotNull(result);
	}
	
}

// WebServiceContainer_2Test.java
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
* It contains ten unit test cases for the {@link WebServiceContainer#configureService(Class, String, String)} method.
*/
class WebServiceContainer_2Test {
		
	/**
	* Test case for {@link WebServiceContainer#configureService(Class, String, String)}
	*
	* @throws RemoteException
	*/
	@Test
	void testConfigureService_0() throws RemoteException {
		WebServiceContainer fixture = WebServiceContainer.newInstance("localhost", 8080, "/axis2");
		Class serviceClazz = Object.class;
		String targetNamespace = "";
		String typesNamespace = "";
		fixture.configureService(serviceClazz, targetNamespace, typesNamespace);
	}
	
	/**
	* Test case for {@link WebServiceContainer#configureService(Class, String, String)}
	*
	* @throws RemoteException
	*/
	@Test
	void testConfigureService_1() throws RemoteException {
		WebServiceContainer fixture = WebServiceContainer.newInstance("localhost", 8080, "/axis2");
		Class serviceClazz = Object.class;
		String targetNamespace = "";
		String typesNamespace = "";
		fixture.configureService(serviceClazz, targetNamespace, typesNamespace);
	}
	
	/**
	* Test case for {@link WebServiceContainer#configureService(Class, String, String)}
	*
	* @throws RemoteException
	*/
	@Test
	void testConfigureService_2() throws RemoteException {
		WebServiceContainer fixture = WebServiceContainer.newInstance("localhost", 8080, "/axis2");
		Class serviceClazz = Object.class;
		String targetNamespace = "";
		String typesNamespace = "";
		fixture.configureService(serviceClazz, targetNamespace, typesNamespace);
	}
	
	/**
	* Test case for {@link WebServiceContainer#configureService(Class, String, String)}
	*
	* @throws RemoteException
	*/
	@Test
	void testConfigureService_3() throws RemoteException {
		WebServiceContainer fixture = WebServiceContainer.newInstance("localhost", 8080, "/axis2");
		Class serviceClazz = Object.class;
		String targetNamespace = "";
		String typesNamespace = "";
		fixture.configureService(serviceClazz, targetNamespace, typesNamespace);
	}
	
	/**
	* Test case for {@link WebServiceContainer#configureService(Class, String, String)}
	*
	* @throws RemoteException
	*/
	@Test
	void testConfigureService_4() throws RemoteException {
		WebServiceContainer fixture = WebServiceContainer.newInstance("localhost", 8080, "/axis2");
		Class serviceClazz = Object.class;
		String targetNamespace = "";
		String typesNamespace = "";
		fixture.configureService(serviceClazz, targetNamespace, typesNamespace);
	}
	
	/**
	* Test case for {@link WebServiceContainer#configureService(Class, String, String)}
	*
	* @throws RemoteException
	*/
	@Test
	void testConfigureService_5() throws RemoteException {
		WebServiceContainer fixture = WebServiceContainer.newInstance("localhost", 8080, "/axis2");
		Class serviceClazz = Object.class;
		String targetNamespace = "";
		String typesNamespace = "";
		fixture.configureService(serviceClazz, targetNamespace, typesNamespace);
	}
	
	/**
	* Test case for {@link WebServiceContainer#configureService(Class, String, String)}
	*
	* @throws RemoteException
	*/
	@Test
	void testConfigureService_6() throws RemoteException {
		WebServiceContainer fixture = WebServiceContainer.newInstance("localhost", 8080, "/axis2");
		Class serviceClazz = Object.class;
		String targetNamespace = "";
		String typesNamespace = "";
		fixture.configureService(serviceClazz, targetNamespace, typesNamespace);
	}
	
	/**
	* Test case for {@link WebServiceContainer#configureService(Class, String, String)}
	*
	* @throws RemoteException
	*/
	@Test
	void testConfigureService_7() throws RemoteException {
		WebServiceContainer fixture = WebServiceContainer.newInstance("localhost", 8080, "/axis2");
		Class service