// WebServiceDescriptorTest1.java
package com.densebrain.rif.server.transport;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WebServiceDescriptor}.
* It contains ten unit test cases for the {@link WebServiceDescriptor#equals(Object)} method.
*/
class WebServiceDescriptorTest1 {

	/**
	* Test case 1:
	* This test case tests the {@link WebServiceDescriptor#equals(Object)} method
	* with two equal objects.
	*/
	@Test
	void testEquals1() {
		WebServiceDescriptor wsd1 = new WebServiceDescriptor(WebServiceDescriptorTest1.class, "http://www.densebrain.com/rif/server/transport", "http://www.densebrain.com/rif/server/transport");
		WebServiceDescriptor wsd2 = new WebServiceDescriptor(WebServiceDescriptorTest1.class, "http://www.densebrain.com/rif/server/transport", "http://www.densebrain.com/rif/server/transport");
		assertTrue(wsd1.equals(wsd2));
	}
	
	/**
	* Test case 2:
	* This test case tests the {@link WebServiceDescriptor#equals(Object)} method
	* with two unequal objects.
	*/
	@Test
	void testEquals2() {
		WebServiceDescriptor wsd1 = new WebServiceDescriptor(WebServiceDescriptorTest1.class, "http://www.densebrain.com/rif/server/transport", "http://www.densebrain.com/rif/server/transport");
		WebServiceDescriptor wsd2 = new WebServiceDescriptor(WebServiceDescriptorTest1.class, "http://www.densebrain.com/rif/server/transport", "http://www.densebrain.com/rif/server/transport");
		wsd2.setTargetNamespace("http://www.densebrain.com/rif/server/transport/test");
		assertFalse(wsd1.equals(wsd2));
	}
	
	/**
	* Test case 3:
	* This test case tests the {@link WebServiceDescriptor#equals(Object)} method
	* with two unequal objects.
	*/
	@Test
	void testEquals3() {
		WebServiceDescriptor wsd1 = new WebServiceDescriptor(WebServiceDescriptorTest1.class, "http://www.densebrain.com/rif/server/transport", "http://www.densebrain.com/rif/server/transport");
		WebServiceDescriptor wsd2 = new WebServiceDescriptor(WebServiceDescriptorTest1.class, "http://www.densebrain.com/rif/server/transport", "http://www.densebrain.com/rif/server/transport");
		wsd2.setTypesNamespace("http://www.densebrain.com/rif/server/transport/test");
		assertFalse(wsd1.equals(wsd2));
	}
	
	/**
	* Test case 4:
	* This test case tests the {@link WebServiceDescriptor#equals(Object)} method
	* with two unequal objects.
	*/
	@Test
	void testEquals4() {
		WebServiceDescriptor wsd1 = new WebServiceDescriptor(WebServiceDescriptorTest1.class, "http://www.densebrain.com/rif/server/transport", "http://www.densebrain.com/rif/server/transport");
		WebServiceDescriptor wsd2 = new WebServiceDescriptor(WebServiceDescriptorTest1.class, "http://www.densebrain.com/rif/server/transport", "http://www.densebrain.com/rif/server/transport");
		wsd2.setServiceClazz(WebServiceDescriptorTest2.class);
		assertFalse(wsd1.equals(wsd2));
	}
	
	/**
	* Test case 5:
	* This test case tests the {@link WebServiceDescriptor#equals(Object)} method
	* with two unequal objects.
	*/
	@Test
	void testEquals5() {
		WebServiceDescriptor wsd1 = new WebServiceDescriptor(WebServiceDescriptorTest1.class, "http://www.densebrain.com/rif/server/transport", "http://www.densebrain.com/rif/server/transport");
		WebServiceDescriptor wsd2 = new WebServiceDescriptor(WebServiceDescriptorTest1.class, "http://www.densebrain.com/rif/server/transport", "http://www.densebrain.com/rif/server/transport");
		wsd2.setTargetNamespace("http://www.densebrain.com/rif/server/transport/test");
		wsd2.setTypesNamespace("http://www.densebrain.com/rif/server/transport/test");
		assertFalse(wsd1.equals(wsd2));
	}
	
	/**
	* Test case 6:
	* This test case tests the {@link WebServiceDescriptor#equals(Object)} method
	* with two unequal objects.
	*/
	@Test
	void testEquals6() {
		WebServiceDescriptor wsd1 = new WebServiceDescriptor(WebServiceDescriptorTest1.class, "http://www.densebrain.com/rif/server/transport", "http://www.densebrain.com/rif/server/transport");
		WebServiceDescriptor wsd2 = new WebServiceDescriptor(WebServiceDescriptorTest1.class, "http://www.densebrain.com/rif/server/transport", "http://www.densebrain.com/rif/server/transport");
		wsd2.setTargetNamespace("http://www.densebrain.com/rif/server/transport/test");
		wsd2.setServiceClazz(WebServiceDescriptorTest2.class);
		assertFalse(wsd1.equals(wsd2));
	}
	
	/**
	* Test case 7:
	* This test case tests the {@link WebServiceDescriptor#equals(Object)} method
	* with two unequal objects.
	*/
	@Test
	void testEquals7() {
		WebServiceDescriptor wsd1 = new WebServiceDescriptor(WebServiceDescriptorTest1.class, "http://www.densebrain.com/rif/server/transport", "http://www.densebrain.com/rif/server/transport");
		WebServiceDescriptor wsd2 = new WebServiceDescriptor(WebServiceDescriptorTest1.class, "http://www.densebrain.com/rif/server/transport", "http://www.densebrain.com/rif/server/transport");
		wsd2.setTypesNamespace("http://www.densebrain.com/rif/server/transport/test");
		wsd2.setServiceClazz(WebServiceDescriptorTest2.class);
		assertFalse(wsd1.equals(wsd2));
	}
	
	/**
	* Test case 8:
	* This test case tests the {@link WebServiceDescriptor#equals(Object)} method
	* with two unequal objects.
	*/
	@Test
	void testEquals8() {
		WebServiceDescriptor wsd1 = new WebServiceDescriptor(WebServiceDescriptorTest1.class, "http://www.densebrain.com/rif/server/transport", "http://www.densebrain.com/rif/server/transport");
		WebServiceDescriptor wsd2 = new WebServiceDescriptor(WebServiceDescriptorTest1.class, "http://www.densebrain.com/rif/server/transport", "http://www.densebrain.com/rif/server/transport");
		wsd2.setTargetNamespace("http://www.densebrain.com/rif/server/transport/test");
		wsd2.setTypesNamespace("http://www.densebrain.com/rif/server/transport/test");
		wsd2.setServiceClazz(WebServiceDescriptorTest2.class);
		assertFalse(wsd1.equals(wsd2));
	}
	