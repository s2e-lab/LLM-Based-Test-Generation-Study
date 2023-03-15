// RIFImplementationManager_1Test.java
package com.densebrain.rif.server;

import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFImplementationManager}.
* It contains ten unit test cases for the {@link RIFImplementationManager#invoke(String, String, Object[])} method.
*/
class RIFImplementationManager_1Test {

	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the interface name is null.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testInvoke_1() throws Exception {
		// Arrange
		RIFImplementationManager rIFImplementationManager = new RIFImplementationManager();
		String interfaceName = null;
		String methodName = "methodName";
		Object[] params = new Object[] {};
		
		// Act
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			rIFImplementationManager.invoke(interfaceName, methodName, params);
		});
		
		// Assert
		assertEquals("interfaceName cannot be null", exception.getMessage());
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the interface name is empty.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testInvoke_2() throws Exception {
		// Arrange
		RIFImplementationManager rIFImplementationManager = new RIFImplementationManager();
		String interfaceName = "";
		String methodName = "methodName";
		Object[] params = new Object[] {};
		
		// Act
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			rIFImplementationManager.invoke(interfaceName, methodName, params);
		});
		
		// Assert
		assertEquals("interfaceName cannot be empty", exception.getMessage());
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the interface name is not registered.
	* Expected result: {@link RemoteException} is thrown.
	*/
	@Test
	void testInvoke_3() throws Exception {
		// Arrange
		RIFImplementationManager rIFImplementationManager = new RIFImplementationManager();
		String interfaceName = "interfaceName";
		String methodName = "methodName";
		Object[] params = new Object[] {};
		
		// Act
		Throwable exception = assertThrows(RemoteException.class, () -> {
			rIFImplementationManager.invoke(interfaceName, methodName, params);
		});
		
		// Assert
		assertEquals("Not registered: interfaceName", exception.getMessage());
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the method name is null.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testInvoke_4() throws Exception {
		// Arrange
		RIFImplementationManager rIFImplementationManager = new RIFImplementationManager();
		String interfaceName = "interfaceName";
		String methodName = null;
		Object[] params = new Object[] {};
		
		// Act
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			rIFImplementationManager.invoke(interfaceName, methodName, params);
		});
		
		// Assert
		assertEquals("methodName cannot be null", exception.getMessage());
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the method name is empty.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testInvoke_5() throws Exception {
		// Arrange
		RIFImplementationManager rIFImplementationManager = new RIFImplementationManager();
		String interfaceName = "interfaceName";
		String methodName = "";
		Object[] params = new Object[] {};
		
		// Act
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			rIFImplementationManager.invoke(interfaceName, methodName, params);
		});
		
		// Assert
		assertEquals("methodName cannot be empty", exception.getMessage());
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the method name is not registered.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testInvoke_6() throws Exception {
		// Arrange
		RIFImplementationManager rIFImplementationManager = new RIFImplementationManager();
		String interfaceName = "interfaceName";
		String methodName = "methodName";
		Object[] params = new Object[] {};
		
		// Act
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			rIFImplementationManager.invoke(interfaceName, methodName, params);
		});
		
		// Assert
		assertEquals("Unknown method methodName on interfaceName", exception.getMessage());
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the method name is registered but the method throws an exception.
	* Expected result: {@link RemoteException} is thrown.
	*/
	@Test
	void testInvoke_7() throws Exception {
		// Arrange
		RIFImplementationManager rIFImplementationManager = new RIFImplementationManager();
		String interfaceName = "interfaceName";
		String methodName = "methodName";
		Object[] params = new Object[] {};
		
		// Act
		Throwable exception = assertThrows(RemoteException.class, () -> {
			rIFImplementationManager.invoke(interfaceName, methodName, params);
		});
		
		// Assert
		assertEquals("Error occured while invoking interfaceName.methodName: java.lang.Exception: exception", exception.getMessage());
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the method name is registered and the method returns a value.
	* Expected result: the returned value is returned.
	*/
	@Test
	void testInvoke_8() throws Exception {
		// Arrange
		RIFImplementationManager rIFImplementationManager = new RIFImplementationManager();
		String interfaceName = "interfaceName";
		String methodName = "methodName";
		Object[] params = new Object[] {};
		
		// Act
		Object result = rIFImplementationManager.invoke(interfaceName, methodName, params);
		
		// Assert
		assertEquals("result", result);
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the method name is registered and the method returns a value.
	* Expected result: the returned value is returned.
	*/
	@Test
	void testInvoke_9() throws Exception {
		// Arrange
		RIFImplementationManager rIFImplementationManager = new RIFImplementationManager();
		String interfaceName = "interfaceName";
		String methodName = "methodName";
		Object[] params = new Object[] {};
		
		// Act
		Object result = rIFImplementationManager.invoke(interfaceName, methodName, params);
		
		// Assert
		assertEquals("result", result);
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the method name is registered and the method returns a value.
	* Expected result: the returned value is returned.
	*/
	@Test
	void testInvoke_10() throws Exception {
		// Arrange
		RIFImplementationManager rIFImplementationManager = new RIFImplementationManager();
		String interfaceName = "interfaceName";
		String methodName = "methodName";
		Object[] params = new Object[] {};
		
		// Act
		Object result = rIFImplementationManager.invoke(interfaceName, methodName, params);
		
		// Assert
		assertEquals("result", result);
	}
	
}

// RIFServer.java
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
package com.densebrain.rif.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Hashtable;
import java.util.Map;

import com.densebrain.rif.server.RIFImplementationManager;
import com.densebrain.rif.server.RIFService;

/**
 * The RIFServer is the main entry point for the RIFServer.  It is responsible for
 * accepting connections from the RIFClient and then dispatching the request to the
 * RIFService.
 *
 * The RIFServer is a singleton and is accessed through the static getInstance() method.
 *
 * @author Jonathan Glanz
 */
public class RIFServer {

    private static RIFServer instance = new RIFServer();

    /**
     * Retrieve the singleton RIFServer instance.
     *
     * @return
     */
    public static RIFServer getInstance() {
        return instance;
    }

    private Hashtable<String, RIFService> serviceMap = new Hashtable<String, RIFService>();

    private RIFServer() {
    }

    /**
     * Register a RIFService to be served from this JVM
     *
     * @param serviceName - the name of the service
     * @param service - the service to be served
     */
    public void registerService(String serviceName, RIFService service) {
        serviceMap.put(serviceName, service);
    }

    /**
     * Start the RIFServer.  This method will block until the server is stopped.
     *
     * @param port - the port to listen on
     * @throws IOException
     */
    public void start(int port) throws IOException {
        Socket socket = null;
        try {
            socket = new Socket("localhost", port);
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            byte[] buffer = new byte[1024];
            int read = in.read(buffer);
            String request = new String(buffer, 0, read);
            String[] parts = request.split(" ");
            String serviceName = parts[0];
            String methodName = parts[1];
            RIFService service = serviceMap.get(serviceName);
            if (service == null)
                throw new IOException("Unknown service: " + serviceName);
            Object[] params = new Object[parts.length - 2];
            for (int i = 2; i < parts.length; i++) {
                params[i - 2] = parts[i];
            }
            Object result = service.invoke(methodName, params);
            out.write(result.toString().getBytes());
        } finally {
            if (socket != null)
                socket.close();
        }
    }
}

// RIFServer_1Test.java
package com.densebrain.rif.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Hashtable;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFServer}.
* It contains ten unit test cases for the {@link RIFServer#start(int)} method.
*/
class RIFServer_1Test {
		
	/**
	* Test case for {@link RIFServer#start(int)} method.
	* It tests the case when the port is negative.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testStart_1() throws Exception {
		// Arrange
		RIFServer rIFServer = new RIFServer();
		int port = -1;
		
		// Act
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			rIFServer.start(port);
		});
		
		// Assert
		assertEquals("port cannot be negative", exception.getMessage());
	}
	
	/**
	* Test case for {@link RIFServer#start(int)} method.
	* It tests the case when the port is zero.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testStart_2() throws Exception {
		// Arrange
		RIFServer rIFServer = new RIFServer();
		int port = 0;
		
		// Act
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			rIFServer.start(port);
		});
		
		// Assert
		assertEquals("port cannot be zero", exception.getMessage());
	}
	
	/**
	* Test case for {@link RIFServer#start(int)} method.
	* It tests the case when the port is positive.
	* Expected result: {@link IOException} is thrown.
	*/
	@Test
	void testStart_3() throws Exception {
		// Arrange
		RIFServer rIFServer = new RIFServer();
		int port = 1;
		
		// Act
		Throwable exception = assertThrows(IOException.class, () -> {
			rIFServer.start(port);
		});
		
		// Ass