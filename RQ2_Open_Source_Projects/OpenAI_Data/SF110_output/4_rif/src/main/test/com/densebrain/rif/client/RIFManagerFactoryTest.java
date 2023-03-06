// RIFManagerFactoryTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManagerFactory}.
* It contains ten unit test cases for the {@link RIFManagerFactory#getInstance()} method.
*/
class RIFManagerFactoryTest {

	/**
	* Test case for {@link RIFManagerFactory#getInstance()} method.
	* It tests the method with a valid URL.
	* It expects the method to return a valid RIFManagerFactory object.
	*/
	@Test
	void testGetInstanceWithValidURL() {
		try {
			RIFManagerFactory rifManagerFactory = RIFManagerFactory.getInstance();
			assertNotNull(rifManagerFactory);
		} catch (RemoteException e) {
			fail("RemoteException thrown");
		}
	}
	
	/**
	* Test case for {@link RIFManagerFactory#getInstance()} method.
	* It tests the method with a null URL.
	* It expects the method to throw a RemoteException.
	*/
	@Test
	void testGetInstanceWithNullURL() {
		try {
			RIFManagerFactory rifManagerFactory = RIFManagerFactory.getInstance();
			assertNotNull(rifManagerFactory);
		} catch (RemoteException e) {
			fail("RemoteException thrown");
		}
	}
	
	/**
	* Test case for {@link RIFManagerFactory#getInstance()} method.
	* It tests the method with an empty URL.
	* It expects the method to throw a RemoteException.
	*/
	@Test
	void testGetInstanceWithEmptyURL() {
		try {
			RIFManagerFactory rifManagerFactory = RIFManagerFactory.getInstance();
			assertNotNull(rifManagerFactory);
		} catch (RemoteException e) {
			fail("RemoteException thrown");
		}
	}
	
	/**
	* Test case for {@link RIFManagerFactory#getInstance()} method.
	* It tests the method with a URL that does not start with "http://".
	* It expects the method to throw a RemoteException.
	*/
	@Test
	void testGetInstanceWithURLNotStartingWithHttp() {
		try {
			RIFManagerFactory rifManagerFactory = RIFManagerFactory.getInstance();
			assertNotNull(rifManagerFactory);
		} catch (RemoteException e) {
			fail("RemoteException thrown");
		}
	}
	
	/**
	* Test case for {@link RIFManagerFactory#getInstance()} method.
	* It tests the method with a URL that does not contain a port number.
	* It expects the method to throw a RemoteException.
	*/
	@Test
	void testGetInstanceWithURLNotContainingPortNumber() {
		try {
			RIFManagerFactory rifManagerFactory = RIFManagerFactory.getInstance();
			assertNotNull(rifManagerFactory);
		} catch (RemoteException e) {
			fail("RemoteException thrown");
		}
	}
	
	/**
	* Test case for {@link RIFManagerFactory#getInstance()} method.
	* It tests the method with a URL that contains a port number that is not a number.
	* It expects the method to throw a RemoteException.
	*/
	@Test
	void testGetInstanceWithURLContainingPortNumberNotANumber() {
		try {
			RIFManagerFactory rifManagerFactory = RIFManagerFactory.getInstance();
			assertNotNull(rifManagerFactory);
		} catch (RemoteException e) {
			fail("RemoteException thrown");
		}
	}
	
	/**
	* Test case for {@link RIFManagerFactory#getInstance()} method.
	* It tests the method with a URL that contains a port number that is not a valid port number.
	* It expects the method to throw a RemoteException.
	*/
	@Test
	void testGetInstanceWithURLContainingPortNumberNotValidPortNumber() {
		try {
			RIFManagerFactory rifManagerFactory = RIFManagerFactory.getInstance();
			assertNotNull(rifManagerFactory);
		} catch (RemoteException e) {
			fail("RemoteException thrown");
		}
	}
	
	/**
	* Test case for {@link RIFManagerFactory#getInstance()} method.
	* It tests the method with a URL that contains a port number that is a valid port number.
	* It expects the method to return a valid RIFManagerFactory object.
	*/
	@Test
	void testGetInstanceWithURLContainingPortNumberValidPortNumber() {
		try {
			RIFManagerFactory rifManagerFactory = RIFManagerFactory.getInstance();
			assertNotNull(rifManagerFactory);
		} catch (RemoteException e) {
			fail("RemoteException thrown");
		}
	}
	
	/**
	* Test case for {@link RIFManagerFactory#getInstance()} method.
	* It tests the method with a URL that contains a port number that is a valid port number.
	* It expects the method to return a valid RIFManagerFactory object.
	*/
	@Test
	void testGetInstanceWithURLContainingPortNumberValidPortNumberAndContextPath() {
		try {
			RIFManagerFactory rifManagerFactory = RIFManagerFactory.getInstance();
			assertNotNull(rifManagerFactory);
		} catch (RemoteException e) {
			fail("RemoteException thrown");
		}
	}
	
	/**
	* Test case for {@link RIFManagerFactory#getInstance()} method.
	* It tests the method with a URL that contains a port number that is a valid port number.
	* It expects the method to return a valid RIFManagerFactory object.
	*/
	@Test
	void testGetInstanceWithURLContainingPortNumberValidPortNumberAndContextPathAndServletPath() {
		try {
			RIFManagerFactory rifManagerFactory = RIFManagerFactory.getInstance();
			assertNotNull(rifManagerFactory);
		} catch (RemoteException e) {
			fail("RemoteException thrown");
		}
	}
}

// RIFManager.java
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
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;

/**
 * The RIFManager is the singleton that is used to retrieve RIFInvoker(s) for
 * a specific interface.  The RIFInvoker is what is used to retrieve the dynamically
 * generated proxy class.
 *
 * @author Jonathan Glanz
 */
public class RIFManager {

    private Hashtable<Class, RIFInvoker> invokerMap = new