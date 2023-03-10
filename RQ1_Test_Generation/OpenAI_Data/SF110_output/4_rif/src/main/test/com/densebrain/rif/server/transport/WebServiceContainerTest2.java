// WebServiceContainerTest2.java
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
class WebServiceContainerTest2 {

		private static final Log logger = LogFactory.getLog(WebServiceContainerTest2.class);
		
		/**
		* Test case for {@link WebServiceContainer#restartContainer()} method.
		* It tests the case when the container is not started.
		*/
		@Test
		public void testRestartContainer1() throws RemoteException {
				WebServiceContainer container = WebServiceContainer.newInstance("localhost", 8080, "/axis2");
				container.restartContainer();
				assertTrue(container.isStarted());
		}
		
		/**
		* Test case for {@link WebServiceContainer#restartContainer()} method.
		* It tests the case when the container is started.
		*/
		@Test
		public void testRestartContainer2() throws RemoteException {
				WebServiceContainer container = WebServiceContainer.newInstance("localhost", 8080, "/axis2");
				container.startContainer();
				container.restartContainer();
				assertTrue(container.isStarted());
		}
		
		/**
		* Test case for {@link WebServiceContainer#restartContainer()} method.
		* It tests the case when the container is stopped.
		*/
		@Test
		public void testRestartContainer3() throws RemoteException {
				WebServiceContainer container = WebServiceContainer.newInstance("localhost", 8080, "/axis2");
				container.startContainer();
				container.stopContainer();
				container.restartContainer();
				assertTrue(container.isStarted());
		}
		
		/**
		* Test case for {@link WebServiceContainer#restartContainer()} method.
		* It tests the case when the container is started and stopped.
		*/
		@Test
		public void testRestartContainer4() throws RemoteException {
				WebServiceContainer container = WebServiceContainer.newInstance("localhost", 8080, "/axis2");
				container.startContainer();
				container.stopContainer();
				container.startContainer();
				container.restartContainer();
				assertTrue(container.isStarted());
		}
		
		/**
		* Test case for {@link WebServiceContainer#restartContainer()} method.
		* It tests the case when the container is started and stopped and started.
		*/
		@Test
		public void testRestartContainer5() throws RemoteException {
				WebServiceContainer container = WebServiceContainer.newInstance("localhost", 8080, "/axis2");
				container.startContainer();
				container.stopContainer();
				container.startContainer();
				container.stopContainer();
				container.restartContainer();
				assertTrue(container.isStarted());
		}
		
		/**
		* Test case for {@link WebServiceContainer#restartContainer()} method.
		* It tests the case when the container is started and stopped and started and stopped.
		*/
		@Test
		public void testRestartContainer6() throws RemoteException {
				WebServiceContainer container = WebServiceContainer.newInstance("localhost", 8080, "/axis2");
				container.startContainer();
				container.stopContainer();
				container.startContainer();
				container.stopContainer();
				container.startContainer();
				container.restartContainer();
				assertTrue(container.isStarted());
		}
		
		/**
		* Test case for {@link WebServiceContainer#restartContainer()} method.
		* It tests the case when the container is started and stopped and started and stopped and started.
		*/
		@Test
		public void testRestartContainer7() throws RemoteException {
				WebServiceContainer container = WebServiceContainer.newInstance("localhost", 8080, "/axis2");
				container.startContainer();
				container.stopContainer();
				container.startContainer();
				container.stopContainer();
				container.startContainer();
				container.stopContainer();
				container.restartContainer();
				assertTrue(container.isStarted());
		}
		
		/**
		* Test case for {@link WebServiceContainer#restartContainer()} method.
		* It tests the case when the container is started and stopped and started and stopped and started and stopped.
		*/
		@Test
		public void testRestartContainer8() throws RemoteException {
				WebServiceContainer container = WebServiceContainer.newInstance("localhost", 8080, "/axis2");
				container.startContainer();
				container.stopContainer();
				container.startContainer();
				container.stopContainer();
				container.startContainer();
				container.stopContainer();
				container.startContainer();
				container.restartContainer();
				assertTrue(container.isStarted());
		}
		
		/**
		* Test case for {@link WebServiceContainer#restartContainer()} method.
		* It tests the case when the container is started and stopped and started and stopped and started and stopped and started.
		*/
		@Test
		public void testRestartContainer9() throws RemoteException {
				WebServiceContainer container = WebServiceContainer.newInstance("localhost", 8080, "/axis2");
				container.startContainer();
				container.stopContainer();
				container.startContainer();
				container.stopContainer();
				container.startContainer();
				container.stopContainer();
				container.startContainer();
				container.stopContainer();
				container.restartContainer();
				assertTrue(container.isStarted());
		}
		
		/**
		* Test case for {@link WebServiceContainer#restartContainer()} method.
		* It tests the case when the container is started and stopped and started and stopped and started and stopped and started and stopped.
		*/
		@Test
		public void testRestartContainer10() throws RemoteException {
				WebServiceContainer container = WebServiceContainer.newInstance("localhost", 8080, "/axis2");
				container.startContainer();
				container.stopContainer();
				container.startContainer();
				container.stopContainer();
				container.startContainer();
				container.stopContainer();
				container.startContainer();
				container.stopContainer();
				container.startContainer();
				container.restartContainer();
				assertTrue(container.isStarted());
		}
}