// RIFManagerTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import com.densebrain.rif.client.service.RIFService;
import com.densebrain.rif.client.service.RIFServiceStub;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManager}.
* It contains ten unit test cases for the {@link RIFManager#getInvoker(Class)} method.
*/
class RIFManagerTest {

	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_FirstTime() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker = manager.getInvoker(TestInterface.class);
		assertNotNull(invoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the second time.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns the same {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_SecondTime() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker1 = manager.getInvoker(TestInterface.class);
		RIFInvoker invoker2 = manager.getInvoker(TestInterface.class);
		assertSame(invoker1, invoker2);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_FirstTime_DifferentInterface() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker1 = manager.getInvoker(TestInterface.class);
		RIFInvoker invoker2 = manager.getInvoker(TestInterface2.class);
		assertNotSame(invoker1, invoker2);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the second time.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns the same {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_SecondTime_DifferentInterface() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker1 = manager.getInvoker(TestInterface.class);
		RIFInvoker invoker2 = manager.getInvoker(TestInterface2.class);
		RIFInvoker invoker3 = manager.getInvoker(TestInterface.class);
		RIFInvoker invoker4 = manager.getInvoker(TestInterface2.class);
		assertSame(invoker1, invoker3);
		assertSame(invoker2, invoker4);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_FirstTime_DifferentManager() throws RemoteException {
		RIFManager manager1 = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFManager manager2 = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker1 = manager1.getInvoker(TestInterface.class);
		RIFInvoker invoker2 = manager2.getInvoker(TestInterface.class);
		assertNotSame(invoker1, invoker2);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the second time.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns the same {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_SecondTime_DifferentManager() throws RemoteException {
		RIFManager manager1 = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFManager manager2 = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker1 = manager1.getInvoker(TestInterface.class);
		RIFInvoker invoker2 = manager2.getInvoker(TestInterface.class);
		RIFInvoker invoker3 = manager1.getInvoker(TestInterface.class);
		RIFInvoker invoker4 = manager2.getInvoker(TestInterface.class);
		assertSame(invoker1, invoker3);
		assertSame(invoker2, invoker4);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_FirstTime_DifferentManager_DifferentInterface() throws RemoteException {
		RIFManager manager1 = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFManager manager2 = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker1 = manager1.getInvoker(TestInterface.class);
		RIFInvoker invoker2 = manager2.getInvoker(TestInterface2.class);
		assertNotSame(invoker1, invoker2);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the second time.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns the same {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_SecondTime_DifferentManager_DifferentInterface() throws RemoteException {
		RIFManager manager1 = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFManager manager2 = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker1 = manager1.getInvoker(TestInterface.class);
		RIFInvoker invoker2 = manager2.getInvoker(TestInterface2.class);
		RIFInvoker invoker3 = manager1.getInvoker(TestInterface.class);
		RIFInvoker invoker4 = manager2.getInvoker(TestInterface2.class);
		assertSame(invoker1, invoker3);
		assertSame(invoker2, invoker4);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_FirstTime_DifferentManager_DifferentInterface_DifferentURL() throws RemoteException {
		RIFManager manager1 = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFManager manager2 = new RIFManager("http://localhost:8080/axis/services/RIFService2");
		RIFInvoker invoker1 = manager1.getInvoker(TestInterface.class);
		RIFInvoker invoker2 = manager2.getInvoker(TestInterface2.class);
		assertNotSame(invoker1, invoker2);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the second time.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns the same {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_SecondTime_DifferentManager_DifferentInterface_DifferentURL() throws RemoteException {
		RIFManager manager1 = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFManager manager2 = new RIFManager("http://localhost:8080/axis/services/RIFService2");
		RIFInvoker invoker1 = manager1.getInvoker(TestInterface.class);
		RIFInvoker invoker2 = manager2.getInvoker(TestInterface2.class);
		RIFInvoker invoker3 = manager1.getInvoker(TestInterface.class);
		RIFInvoker invoker4 = manager2.getInvoker(TestInterface2.class);
		assertSame(invoker1, invoker3);
		assertSame(invoker2, invoker4);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_FirstTime_DifferentManager_DifferentInterface_DifferentURL_DifferentInterface() throws RemoteException {
		RIFManager manager1 = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFManager manager2 = new RIFManager("http://localhost:8080/axis/services/RIFService2");
		RIFInvoker invoker1 = manager1.getInvoker(TestInterface.class);
		RIFInvoker invoker2 = manager2.getInvoker(TestInterface2.class);
		RIFInvoker invoker3 = manager1.getInvoker(TestInterface3.class);
		RIFInvoker invoker4 = manager2.getInvoker(TestInterface4.class);
		assertNotSame(invoker1, invoker2);
		assertNotSame(invoker1, invoker3);
		assertNotSame(invoker1, invoker4);
		assertNotSame(invoker2, invoker3);
		assertNotSame(invoker2, invoker4);
		assertNotSame(invoker3, invoker4);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the second time.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns the same {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_SecondTime_DifferentManager_DifferentInterface_DifferentURL_DifferentInterface() throws RemoteException {
		RIFManager manager1 = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFManager manager2 = new RIFManager("http://localhost:8080/axis/services/RIFService2");
		RIFInvoker invoker1 = manager1.getInvoker(TestInterface.class);
		RIFInvoker invoker2 = manager2.getInvoker(TestInterface2.class);
		RIFInvoker invoker3 = manager1.getInvoker(TestInterface3.class);
		RIFInvoker invoker4 = manager2.getInvoker(TestInterface4.class);
		RIFInvoker invoker5 = manager1.getInvoker(TestInterface.class);
		RIFInvoker invoker6 = manager2.getInvoker(TestInterface2.class);
		RIFInvoker invoker7 = manager1.getInvoker(TestInterface3.class);
		RIFInvoker invoker8 = manager2.getInvoker(TestInterface4.class);
		assertSame(invoker1, invoker5);
		assertSame(invoker2, invoker6);
		assertSame(invoker3, invoker7);
		assertSame(invoker4, invoker8);
	}
	
	/**
	* Test interface for the {@link RIFManagerTest} class.
	*/
	interface TestInterface {
		
	}
	
	/**
	* Test interface for the {@link RIFManagerTest} class.
	*/
	interface TestInterface2 {
		
	}
	
	/**
	* Test interface for the {@link RIFManagerTest} class.
	*/
	interface TestInterface3 {
		
	}
	
	/**
	* Test interface for the {@link RIFManagerTest} class.
	*/
	interface TestInterface4 {
		
	}
}

// RIFService.java
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
package com.densebrain.rif.client.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * The RIFService is the web service that the client side RIFInvoker will call to invoke the
 * methods on the server side.
 *
 * @author Jonathan Glanz
 * @copyright Desnbrain, Inc @ 2006
 */
public interface RIFService extends Remote {

    /**
     * Invoke a method on the server