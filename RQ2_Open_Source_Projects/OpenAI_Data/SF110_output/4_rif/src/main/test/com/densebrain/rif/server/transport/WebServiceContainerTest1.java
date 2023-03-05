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
	* Run the WebServiceContainer newInstance(ConfigurationContext) method test.
	*
	* @throws Exception
	*
	* @generatedBy CodePro at 9/12/14 9:24 AM
	*/
	@Test
	public void testNewInstance_1()
		throws Exception {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);

		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	* Run the WebServiceContainer newInstance(ConfigurationContext) method test.
	*
	* @throws Exception
	*
	* @generatedBy CodePro at 9/12/14 9:24 AM
	*/
	@Test
	public void testNewInstance_2()
		throws Exception {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);

		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	* Run the WebServiceContainer newInstance(ConfigurationContext) method test.
	*
	* @throws Exception
	*
	* @generatedBy CodePro at 9/12/14 9:24 AM
	*/
	@Test
	public void testNewInstance_3()
		throws Exception {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);

		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	* Run the WebServiceContainer newInstance(ConfigurationContext) method test.
	*
	* @throws Exception
	*
	* @generatedBy CodePro at 9/12/14 9:24 AM
	*/
	@Test
	public void testNewInstance_4()
		throws Exception {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);

		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	* Run the WebServiceContainer newInstance(ConfigurationContext) method test.
	*
	* @throws Exception
	*
	* @generatedBy CodePro at 9/12/14 9:24 AM
	*/
	@Test
	public void testNewInstance_5()
		throws Exception {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);

		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	* Run the WebServiceContainer newInstance(ConfigurationContext) method test.
	*
	* @throws Exception
	*
	* @generatedBy CodePro at 9/12/14 9:24 AM
	*/
	@Test
	public void testNewInstance_6()
		throws Exception {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);

		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	* Run the WebServiceContainer newInstance(ConfigurationContext) method test.
	*
	* @throws Exception
	*
	* @generatedBy CodePro at 9/12/14 9:24 AM
	*/
	@Test
	public void testNewInstance_7()
		throws Exception {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);

		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	* Run the WebServiceContainer newInstance(ConfigurationContext) method test.
	*
	* @throws Exception
	*
	* @generatedBy CodePro at 9/12/14 9:24 AM
	*/
	@Test
	public void testNewInstance_8()
		throws Exception {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);

		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	* Run the WebServiceContainer newInstance(ConfigurationContext) method test.
	*
	* @throws Exception
	*
	* @generatedBy CodePro at 9/12/14 9:24 AM
	*/
	@Test
	public void testNewInstance_9()
		throws Exception {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);

		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	* Run the WebServiceContainer newInstance(ConfigurationContext) method test.
	*
	* @throws Exception
	*
	* @generatedBy CodePro at 9/12/14 9:24 AM
	*/
	@Test
	public void testNewInstance_10()
		throws Exception {
		ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);

		WebServiceContainer result = WebServiceContainer.newInstance(configurationContext);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	* Perform pre-test initialization.
	*
	* @throws Exception
	*         if the initialization fails for some reason
	*
	* @generatedBy CodePro at 9/12/14 9:24 AM
	*/
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	* Perform post-test clean-up.
	*
	* @throws Exception
	*         if the clean-up fails for some reason
	*
	* @generatedBy CodePro at 9/12/14 9:24 AM
	*/
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	* Launch the test.
	*
	* @param args the command line arguments
	*
	* @generatedBy CodePro at 9/12/14 9:24 AM
	*/
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WebServiceContainerTest1.class);
	}
}