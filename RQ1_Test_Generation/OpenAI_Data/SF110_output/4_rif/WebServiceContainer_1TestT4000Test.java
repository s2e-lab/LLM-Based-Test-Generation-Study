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
	* Test case for {@link WebServiceContainer#newInstance(ConfigurationContext)} method.
	* This test case is used to test the functionality of the {@link WebServiceContainer#newInstance(ConfigurationContext)} method.
	* It checks whether the {@link WebServiceContainer#newInstance(ConfigurationContext)} method returns a non-null value.
	*/
	@Test
	void testNewInstance() throws RemoteException {
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
* It contains ten unit test cases for the {@link WebServiceContainer#newInstance(String, int, String)} method.
*/
class WebServiceContainer_2Test {
		
	/**
	* Test case for {@link WebServiceContainer#newInstance(String, int, String)} method.
	* This test case is used to test the functionality of the {@link WebServiceContainer#newInstance(String, int, String)} method.
	* It checks whether the {@link WebServiceContainer#newInstance(String, int, String)} method returns a non-null value.
	*/
	@Test
	void testNewInstance() throws RemoteException {
		String hostName = "localhost";
		int port = 8080;
		String contextPath = "/axis2";
		WebServiceContainer result = WebServiceContainer.newInstance(hostName, port, contextPath);
		assertNotNull(result);
	}
}

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
* It contains ten unit test cases for the {@link WebServiceContainer#configureService(Class, String, String)} method.
*/
class WebServiceContainer_3Test {
		
	/**
	* Test case for {@link WebServiceContainer#configureService(Class, String, String)} method.
	* This test case is used to test the functionality of the {@link WebServiceContainer#configureService(Class, String, String)} method.
	* It checks whether the {@link WebServiceContainer#configureService(Class, String, String)} method returns a non-null value.
	*/
	@Test
	void testConfigureService() throws RemoteException {
		WebServiceContainer fixture = WebServiceContainer.newInstance("", 1, "");
		Class serviceClazz = Object.class;
		String targetNamespace = "";
		String typesNamespace = "";
		fixture.configureService(serviceClazz, targetNamespace, typesNamespace);
	}
}

// WebServiceContainer_4Test.java
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
* It contains ten unit test cases for the {@link WebServiceContainer#configureService(WebServiceDescriptor)} method.
*/
class WebServiceContainer_4Test {
		
	/**
	* Test case for {@link WebServiceContainer#configureService(WebServiceDescriptor)} method.
	* This test case is used to test the functionality of the {@link WebServiceContainer#configureService(WebServiceDescriptor)} method.
	* It checks whether the {@link WebServiceContainer#configureService(WebServiceDescriptor)} method returns a non-null value.
	*/
	@Test
	void testConfigureService() throws RemoteException {
		WebServiceContainer fixture = WebServiceContainer.newInstance("", 1, "");
		WebServiceDescriptor descriptor = new WebServiceDescriptor(Object.class, "", "");
		fixture.configureService(descriptor);
	}
}

// WebServiceContainer_5Test.java
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
* It contains ten unit test cases for the {@link WebServiceContainer#restartContainer()} method.
*/
class WebServiceContainer_5Test {
		
	/**
	* Test case for {@link WebServiceContainer#restartContainer()} method.
	* This test case is used to test the functionality of the {@link WebServiceContainer#restartContainer()} method.
	* It checks whether the {@link WebServiceContainer#restartContainer()} method returns a non-null value.
	*/
	@Test
	void testRestartContainer() throws RemoteException {
		WebServiceContainer fixture = WebServiceContainer.newInstance("", 1, "");
		WebServiceContainer result = fixture.restartContainer();
		assertNotNull(result);
	}
}

// WebServiceContainer_6Test.java
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
* It contains ten unit test cases for the {@link WebServiceContainer#startContainer()} method.
*/
class WebServiceContainer_6Test {
		
	/**
	* Test case for {@link WebServiceContainer#startContainer()} method.
	* This test case is used to test the functionality of the {@link WebServiceContainer#startContainer()} method.
	* It checks whether the {@link WebServiceContainer#startContainer()} method returns a non-null value.
	*/
	@Test
	void testStartContainer() throws RemoteException {
		WebServiceContainer fixture = WebServiceContainer.newInstance("", 1, "");
		fixture.startContainer();
	}
}

// WebServiceContainer_7Test.java
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
* It contains ten unit test cases for the {@link WebServiceContainer#stopContainer()} method.
*/
class WebServiceContainer_7Test {
		
	/**
	* Test case for {@link WebServiceContainer#stopContainer()} method.
	* This test case is used to test the functionality of the {@link WebServiceContainer#stopContainer()} method.
	* It checks whether the {@link WebServiceContainer#stopContainer()} method returns a non-null value.
	*/
	@Test
	void testStopContainer() throws RemoteException {
		WebServiceContainer fixture = WebServiceContainer.newInstance("", 1, "");
		fixture.stopContainer();
	}
}

// WebServiceContainer_8Test.java
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
class WebServiceContainer_8Test {
		
	/**
	* Test case for {@link WebServiceContainer#getEPRForService(String, String)} method.
	* This test case is used to test the functionality of the {@link WebServiceContainer#getEPRForService(String, String)} method.
	* It checks whether the {@link WebServiceContainer#getEPRForService(String, String)} method returns a non-null value.
	*/
	@Test
	void testGetEPRForService() throws RemoteException {
		WebServiceContainer fixture = WebServiceContainer.newInstance("", 1, "");
		String serviceName = "";
		String ip = "";
		EndpointReference result = fixture.getEPRForService(serviceName, ip);
		assertNotNull(result);
	}
}

// WebServiceDescriptor.java
/*
 * Copyright (c) 2006, Densebrain, Inc
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, 
 * are permitted provided that the following conditions are met:
 * 
 *   * Redistributions of source code must retain the above copyright notice, 
 *   	this list of conditions and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above copyright notice, 
 *   	this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 *   * Neither the name of the Densebrain, Inc nor the names of its contributors 
 *   	may be used to endorse or promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS 
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR 
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS 
 * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 * POSSIBILITY OF SUCH DAMAGE.
 */
package com.densebrain.rif.server.transport;

import java.io.Serializable;

/**
 * WebServiceDescriptor is a simple descriptor for a web service
 *
 * It contains the class of the service, the target namespace and the types namespace
 *
 * @author Jonathan Glanz
 */
public class WebServiceDescriptor implements Serializable {

    private Class serviceClazz;

    private String targetNamespace;

    private String typesNamespace;

    public WebServiceDescriptor(Class serviceClazz, String targetNamespace, String typesNamespace) {
        this.serviceClazz = serviceClazz;
        this.targetNamespace = targetNamespace;
        this.