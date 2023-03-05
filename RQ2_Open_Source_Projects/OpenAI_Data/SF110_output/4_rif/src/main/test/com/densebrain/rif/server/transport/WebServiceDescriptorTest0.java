// WebServiceDescriptorTest0.java
package com.densebrain.rif.server.transport;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WebServiceDescriptor}.
* It contains ten unit test cases for the {@link WebServiceDescriptor#hashCode()} method.
*/
class WebServiceDescriptorTest0 {

	/**
	* Test case for {@link WebServiceDescriptor#hashCode()}.
	*/
	@Test
	void testHashCode0() {
		WebServiceDescriptor webServiceDescriptor = new WebServiceDescriptor(null, null, null);
		int result = webServiceDescriptor.hashCode();
		assertEquals(1, result);
	}
	
	/**
	* Test case for {@link WebServiceDescriptor#hashCode()}.
	*/
	@Test
	void testHashCode1() {
		WebServiceDescriptor webServiceDescriptor = new WebServiceDescriptor(null, "", "");
		int result = webServiceDescriptor.hashCode();
		assertEquals(1, result);
	}
	
	/**
	* Test case for {@link WebServiceDescriptor#hashCode()}.
	*/
	@Test
	void testHashCode2() {
		WebServiceDescriptor webServiceDescriptor = new WebServiceDescriptor(null, "", "http://www.densebrain.com/rif/types");
		int result = webServiceDescriptor.hashCode();
		assertEquals(1, result);
	}
	
	/**
	* Test case for {@link WebServiceDescriptor#hashCode()}.
	*/
	@Test
	void testHashCode3() {
		WebServiceDescriptor webServiceDescriptor = new WebServiceDescriptor(null, "http://www.densebrain.com/rif/services", "");
		int result = webServiceDescriptor.hashCode();
		assertEquals(1, result);
	}
	
	/**
	* Test case for {@link WebServiceDescriptor#hashCode()}.
	*/
	@Test
	void testHashCode4() {
		WebServiceDescriptor webServiceDescriptor = new WebServiceDescriptor(null, "http://www.densebrain.com/rif/services", "http://www.densebrain.com/rif/types");
		int result = webServiceDescriptor.hashCode();
		assertEquals(1, result);
	}
	
	/**
	* Test case for {@link WebServiceDescriptor#hashCode()}.
	*/
	@Test
	void testHashCode5() {
		WebServiceDescriptor webServiceDescriptor = new WebServiceDescriptor(WebServiceDescriptor.class, null, null);
		int result = webServiceDescriptor.hashCode();
		assertEquals(WebServiceDescriptor.class.hashCode(), result);
	}
	
	/**
	* Test case for {@link WebServiceDescriptor#hashCode()}.
	*/
	@Test
	void testHashCode6() {
		WebServiceDescriptor webServiceDescriptor = new WebServiceDescriptor(WebServiceDescriptor.class, "", "");
		int result = webServiceDescriptor.hashCode();
		assertEquals(WebServiceDescriptor.class.hashCode(), result);
	}
	
	/**
	* Test case for {@link WebServiceDescriptor#hashCode()}.
	*/
	@Test
	void testHashCode7() {
		WebServiceDescriptor webServiceDescriptor = new WebServiceDescriptor(WebServiceDescriptor.class, "", "http://www.densebrain.com/rif/types");
		int result = webServiceDescriptor.hashCode();
		assertEquals(WebServiceDescriptor.class.hashCode(), result);
	}
	
	/**
	* Test case for {@link WebServiceDescriptor#hashCode()}.
	*/
	@Test
	void testHashCode8() {
		WebServiceDescriptor webServiceDescriptor = new WebServiceDescriptor(WebServiceDescriptor.class, "http://www.densebrain.com/rif/services", "");
		int result = webServiceDescriptor.hashCode();
		assertEquals(WebServiceDescriptor.class.hashCode(), result);
	}
	
	/**
	* Test case for {@link WebServiceDescriptor#hashCode()}.
	*/
	@Test
	void testHashCode9() {
		WebServiceDescriptor webServiceDescriptor = new WebServiceDescriptor(WebServiceDescriptor.class, "http://www.densebrain.com/rif/services", "http://www.densebrain.com/rif/types");
		int result = webServiceDescriptor.hashCode();
		assertEquals(WebServiceDescriptor.class.hashCode(), result);
	}
	
}

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
	* Test case for {@link WebServiceDescriptor#equals(Object)}.
	*/
	@Test
	void testEquals0() {
		WebServiceDescriptor webServiceDescriptor = new WebServiceDescriptor(null, null, null);
		boolean result = webServiceDescriptor.equals(null);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link WebServiceDescriptor#equals(Object)}.
	*/
	@Test
	void testEquals1() {
		WebServiceDescriptor webServiceDescriptor = new WebServiceDescriptor(null, null, null);
		boolean result = webServiceDescriptor.equals(new Object());
		assertFalse(result);
	}
	
	/**
	* Test case for {@link WebServiceDescriptor#equals(Object)}.
	*/
	@Test
	void testEquals2() {
		WebServiceDescriptor webServiceDescriptor = new WebServiceDescriptor(null, null, null);
		boolean result = webServiceDescriptor.equals(webServiceDescriptor);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link WebServiceDescriptor#equals(Object)}.
	*/
	@Test
	void testEquals3() {
		WebServiceDescriptor webServiceDescriptor = new WebServiceDescriptor(null, null, null);
		boolean result = webServiceDescriptor.equals(new WebServiceDescriptor(null, null, null));
		assertTrue(result);
	}
	
	/**
	* Test case for {@link WebServiceDescriptor#equals(Object)}.
	*/
	@Test
	void testEquals4() {
		WebServiceDescriptor webServiceDescriptor = new WebServiceDescriptor(null, null, null);
		boolean result = webServiceDescriptor.equals(new WebServiceDescriptor(null, "", ""));
		assertTrue(result);
	}
	
	/**
	* Test case for {@link WebServiceDescriptor#equals(Object)}.
	*/
	@Test
	void testEquals5() {
		WebServiceDescriptor webServiceDescriptor = new WebServiceDescriptor(null, null, null);
		boolean result = webServiceDescriptor.equals(new WebServiceDescriptor(null, "", "http://www.densebrain.com/rif/types"));
		assertTrue(result);
	}
	
	/**
	* Test case for {@link WebServiceDescriptor#equals(Object)}.
	*/
	@Test
	void testEquals6() {
		WebServiceDescriptor webServiceDescriptor = new WebServiceDescriptor(null, null, null);
		boolean result = webServiceDescriptor.equals(new WebServiceDescriptor(null, "http://www.densebrain.com/rif/services", ""));
		assertTrue(result);
	}
	
	/**
	* Test case for {@link WebService