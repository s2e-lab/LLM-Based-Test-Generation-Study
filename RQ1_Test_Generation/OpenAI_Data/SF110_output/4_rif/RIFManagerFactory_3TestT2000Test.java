// RIFManagerFactory_3Test.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManagerFactory}.
* It contains ten unit test cases for the {@link RIFManagerFactory#getImpl(String, Class)} method.
*/
class RIFManagerFactory_3Test {

	/**
	* Test case for {@link RIFManagerFactory#getImpl(String, Class)} method.
	* This test case tests the {@link RIFManagerFactory#getImpl(String, Class)} method with the following parameters:
	* <ul>
	* <li>url: "http://localhost:8080"</li>
	* <li>interfaceClazz: {@link com.densebrain.rif.client.RIFManagerFactory}</li>
	* </ul>
	* The expected result is that the method returns an instance of {@link com.densebrain.rif.client.RIFManagerFactory}.
	* @throws RemoteException
	*/
	@Test
	void testGetImpl_1() throws RemoteException {
		String url = "http://localhost:8080";
		Class interfaceClazz = com.densebrain.rif.client.RIFManagerFactory.class;
		Object result = RIFManagerFactory.getInstance().getImpl(url, interfaceClazz);
		assertTrue(result instanceof com.densebrain.rif.client.RIFManagerFactory);
	}
	
	/**
	* Test case for {@link RIFManagerFactory#getImpl(String, Class)} method.
	* This test case tests the {@link RIFManagerFactory#getImpl(String, Class)} method with the following parameters:
	* <ul>
	* <li>url: "http://localhost:8080"</li>
	* <li>interfaceClazz: {@link com.densebrain.rif.client.RIFManager}</li>
	* </ul>
	* The expected result is that the method returns an instance of {@link com.densebrain.rif.client.RIFManager}.
	* @throws RemoteException
	*/
	@Test
	void testGetImpl_2() throws RemoteException {
		String url = "http://localhost:8080";
		Class interfaceClazz = com.densebrain.rif.client.RIFManager.class;
		Object result = RIFManagerFactory.getInstance().getImpl(url, interfaceClazz);
		assertTrue(result instanceof com.densebrain.rif.client.RIFManager);
	}
	
	/**
	* Test case for {@link RIFManagerFactory#getImpl(String, Class)} method.
	* This test case tests the {@link RIFManagerFactory#getImpl(String, Class)} method with the following parameters:
	* <ul>
	* <li>url: "http://localhost:8080"</li>
	* <li>interfaceClazz: {@link com.densebrain.rif.client.RIFInvoker}</li>
	* </ul>
	* The expected result is that the method returns an instance of {@link com.densebrain.rif.client.RIFInvoker}.
	* @throws RemoteException
	*/
	@Test
	void testGetImpl_3() throws RemoteException {
		String url = "http://localhost:8080";
		Class interfaceClazz = com.densebrain.rif.client.RIFInvoker.class;
		Object result = RIFManagerFactory.getInstance().getImpl(url, interfaceClazz);
		assertTrue(result instanceof com.densebrain.rif.client.RIFInvoker);
	}
	
	/**
	* Test case for {@link RIFManagerFactory#getImpl(String, Class)} method.
	* This test case tests the {@link RIFManagerFactory#getImpl(String, Class)} method with the following parameters:
	* <ul>
	* <li>url: "http://localhost:8080"</li>
	* <li>interfaceClazz: {@link java.lang.Object}</li>
	* </ul>
	* The expected result is that the method returns an instance of {@link java.lang.Object}.
	* @throws RemoteException
	*/
	@Test
	void testGetImpl_4() throws RemoteException {
		String url = "http://localhost:8080";
		Class interfaceClazz = java.lang.Object.class;
		Object result = RIFManagerFactory.getInstance().getImpl(url, interfaceClazz);
		assertTrue(result instanceof java.lang.Object);
	}
	
	/**
	* Test case for {@link RIFManagerFactory#getImpl(String, Class)} method.
	* This test case tests the {@link RIFManagerFactory#getImpl(String, Class)} method with the following parameters:
	* <ul>
	* <li>url: "http://localhost:8080"</li>
	* <li>interfaceClazz: {@link java.lang.String}</li>
	* </ul>
	* The expected result is that the method returns an instance of {@link java.lang.String}.
	* @throws RemoteException
	*/
	@Test
	void testGetImpl_5() throws RemoteException {
		String url = "http://localhost:8080";
		Class interfaceClazz = java.lang.String.class;
		Object result = RIFManagerFactory.getInstance().getImpl(url, interfaceClazz);
		assertTrue(result instanceof java.lang.String);
	}
	
	/**
	* Test case for {@link RIFManagerFactory#getImpl(String, Class)} method.
	* This test case tests the {@link RIFManagerFactory#getImpl(String, Class)} method with the following parameters:
	* <ul>
	* <li>url: "http://localhost:8080"</li>
	* <li>interfaceClazz: {@link java.lang.Integer}</li>
	* </ul>
	* The expected result is that the method returns an instance of {@link java.lang.Integer}.
	* @throws RemoteException
	*/
	@Test
	void testGetImpl_6() throws RemoteException {
		String url = "http://localhost:8080";
		Class interfaceClazz = java.lang.Integer.class;
		Object result = RIFManagerFactory.getInstance().getImpl(url, interfaceClazz);
		assertTrue(result instanceof java.lang.Integer);
	}
	
	/**
	* Test case for {@link RIFManagerFactory#getImpl(String, Class)} method.
	* This test case tests the {@link RIFManagerFactory#getImpl(String, Class)} method with the following parameters:
	* <ul>
	* <li>url: "http://localhost:8080"</li>
	* <li>interfaceClazz: {@link java.lang.Boolean}</li>
	* </ul>
	* The expected result is that the method returns an instance of {@link java.lang.Boolean}.
	* @throws RemoteException
	*/
	@Test
	void testGetImpl_7() throws RemoteException {
		String url = "http://localhost:8080";
		Class interfaceClazz = java.lang.Boolean.class;
		Object result = RIFManagerFactory.getInstance().getImpl(url, interfaceClazz);
		assertTrue(result instanceof java.lang.Boolean);
	}
	
	/**
	* Test case for {@link RIFManagerFactory#getImpl(String, Class)} method.
	* This test case tests the {@link RIFManagerFactory#getImpl(String, Class)} method with the following parameters:
	* <ul>
	* <li>url: "http://localhost:8080"</li>
	* <li>interfaceClazz: {@link java.lang.Long}</li>
	* </ul>
	* The expected result is that the method returns an instance of {@link java.lang.Long}.
	* @throws RemoteException
	*/
	@Test
	void testGetImpl_8() throws RemoteException {
		String url = "http://localhost:8080";
		Class interfaceClazz = java.lang.Long.class;
		Object result = RIFManagerFactory.getInstance().getImpl(url, interfaceClazz);
		assertTrue(result instanceof java.lang.Long);
	}
	
	/**
	* Test case for {@link RIFManagerFactory#getImpl(String, Class)}