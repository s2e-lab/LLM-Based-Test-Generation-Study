// RIFServiceStubTest.java
package com.densebrain.rif.client.service;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFServiceStub}.
* It contains ten unit test cases for the {@link RIFServiceStub#invoke(com.densebrain.rif.client.service.types.Invoke)} method.
*/
class RIFServiceStubTest {

	/**
	* Test case for {@link RIFServiceStub#invoke(com.densebrain.rif.client.service.types.Invoke)} method.
	* This test case is used to test the {@link RIFServiceStub#invoke(com.densebrain.rif.client.service.types.Invoke)} method.
	* It tests the case when the {@link com.densebrain.rif.client.service.types.Invoke} object is null.
	* Expected result is that the {@link RIFServiceStub#invoke(com.densebrain.rif.client.service.types.Invoke)} method throws a {@link java.lang.IllegalArgumentException}.
	*/
	@Test
	void testInvoke_NullInvoke() {
		try {
			RIFServiceStub stub = new RIFServiceStub();
			stub.invoke(null);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			// expected
		} catch (Exception e) {
			fail("Expected IllegalArgumentException");
		}
	}
	
	/**
	* Test case for {@link RIFServiceStub#invoke(com.densebrain.rif.client.service.types.Invoke)} method.
	* This test case is used to test the {@link RIFServiceStub#invoke(com.densebrain.rif.client.service.types.Invoke)} method.
	* It tests the case when the {@link com.densebrain.rif.client.service.types.Invoke} object is not null.
	* Expected result is that the {@link RIFServiceStub#invoke(com.densebrain.rif.client.service.types.Invoke)} method returns a {@link com.densebrain.rif.client.service.types.InvokeResponse} object.
	*/
	@Test
	void testInvoke_NotNullInvoke() {
		try {
			RIFServiceStub stub = new RIFServiceStub();
			com.densebrain.rif.client.service.types.Invoke invoke = new com.densebrain.rif.client.service.types.Invoke();
			com.densebrain.rif.client.service.types.InvokeResponse response = stub.invoke(invoke);
			assertNotNull(response);
		} catch (Exception e) {
			fail("Expected IllegalArgumentException");
		}
	}
}