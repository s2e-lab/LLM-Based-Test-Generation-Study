// _Request_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _Request_2Test {

	/**
	* Test case for the {@link _Request#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* The test case is successful if the method returns a {@link org.apache.axis.encoding.ser.BeanSerializer} object.
	*/
	@Test
	void testGetSerializer_1() {
		assertTrue(_Request.getSerializer("", null, null) instanceof org.apache.axis.encoding.ser.BeanSerializer);
	}
	
	/**
	* Test case for the {@link _Request#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* The test case is successful if the method returns a {@link org.apache.axis.encoding.ser.BeanSerializer} object.
	*/
	@Test
	void testGetSerializer_2() {
		assertTrue(_Request.getSerializer("", _Request.class, null) instanceof org.apache.axis.encoding.ser.BeanSerializer);
	}
	
	/**
	* Test case for the {@link _Request#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* The test case is successful if the method returns a {@link org.apache.axis.encoding.ser.BeanSerializer} object.
	*/
	@Test
	void testGetSerializer_3() {
		assertTrue(_Request.getSerializer("", _Request.class, new javax.xml.namespace.QName("http://tempuri.org/", ">Request")) instanceof org.apache.axis.encoding.ser.BeanSerializer);
	}
	
	/**
	* Test case for the {@link _Request#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* The test case is successful if the method returns a {@link org.apache.axis.encoding.ser.BeanSerializer} object.
	*/
	@Test
	void testGetSerializer_4() {
		assertTrue(_Request.getSerializer("", _Request.class, new javax.xml.namespace.QName("http://tempuri.org/", "Request")) instanceof org.apache.axis.encoding.ser.BeanSerializer);
	}
	
	/**
	* Test case for the {@link _Request#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* The test case is successful if the method returns a {@link org.apache.axis.encoding.ser.BeanSerializer} object.
	*/
	@Test
	void testGetSerializer_5() {
		assertTrue(_Request.getSerializer("", _Request.class, new javax.xml.namespace.QName("http://tempuri.org/", "request")) instanceof org.apache.axis.encoding.ser.BeanSerializer);
	}
	
	/**
	* Test case for the {@link _Request#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* The test case is successful if the method returns a {@link org.apache.axis.encoding.ser.BeanSerializer} object.
	*/
	@Test
	void testGetSerializer_6() {
		assertTrue(_Request.getSerializer("", _Request.class, new javax.xml.namespace.QName("http://tempuri.org/", "Request")) instanceof org.apache.axis.encoding.ser.BeanSerializer);
	}
	
	/**
	* Test case for the {@link _Request#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* The test case is successful if the method returns a {@link org.apache.axis.encoding.ser.BeanSerializer} object.
	*/
	@Test
	void testGetSerializer_7() {
		assertTrue(_Request.getSerializer("", _Request.class, new javax.xml.namespace.QName("http://tempuri.org/", "request")) instanceof org.apache.axis.encoding.ser.BeanSerializer);
	}
	
	/**
	* Test case for the {@link _Request#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* The test case is successful if the method returns a {@link org.apache.axis.encoding.ser.BeanSerializer} object.
	*/
	@Test
	void testGetSerializer_8() {
		assertTrue(_Request.getSerializer("", _Request.class, new javax.xml.namespace.QName("http://tempuri.org/", "Request")) instanceof org.apache.axis.encoding.ser.BeanSerializer);
	}
	
	/**
	* Test case for the {@link _Request#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* The test case is successful if the method returns a {@link org.apache.axis.encoding.ser.BeanSerializer} object.
	*/
	@Test
	void testGetSerializer_9() {
		assertTrue(_Request.getSerializer("", _Request.class, new javax.xml.namespace.QName("http://tempuri.org/", "request")) instanceof org.apache.axis.encoding.ser.BeanSerializer);
	}
	
	/**
	* Test case for the {@link _Request#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* The test case is successful if the method returns a {@link org.apache.axis.encoding.ser.BeanSerializer} object.
	*/
	@Test
	void testGetSerializer_10() {
		assertTrue(_Request.getSerializer("", _Request.class, new javax.xml.namespace.QName("http://tempuri.org/", "Request")) instanceof org.apache.axis.encoding.ser.BeanSerializer);
	}
	
}

// _Request_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _Request_3Test {
		
	/**
	* Test case for the {@link _Request#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* The test case is successful if the method returns a {@link org.apache.axis.encoding.ser.BeanDeserializer} object.
	*/
	@Test
	void testGetDeserializer_1() {
		assertTrue(_Request.getDeserializer("", null, null) instanceof org.apache.axis.encoding.ser.BeanDeserializer);
	}
	
	/**
	* Test case for the {@link _Request#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* The test case is successful if the method returns a {@link org.apache.axis.encoding.ser.BeanDeserializer} object.
	*/
	@Test
	void testGetDeserializer_2() {
		assertTrue(_Request.getDeserializer("", _Request.class, null) instanceof org.apache.axis.encoding.ser.BeanDeserializer);
	}
	
