// InvokeResponseTest.java
package com.densebrain.rif.client.service.types;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InvokeResponse}.
* It contains ten unit test cases for the {@link InvokeResponse#getPullParser(javax.xml.namespace.QName)} method.
*/
class InvokeResponseTest {

	/**
	* Test case for {@link InvokeResponse#getPullParser(javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetPullParser() throws Exception {
		InvokeResponse invokeResponse = new InvokeResponse();
		invokeResponse.set_return("test");
		javax.xml.stream.XMLStreamReader xmlStreamReader = invokeResponse.getPullParser(new javax.xml.namespace.QName("http://densebrain.com/rif/client/service/types", "invokeResponse", "ns1"));
		assertNotNull(xmlStreamReader);
		assertEquals("test", xmlStreamReader.getElementText());
	}
	
	/**
	* Test case for {@link InvokeResponse#getPullParser(javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetPullParser2() throws Exception {
		InvokeResponse invokeResponse = new InvokeResponse();
		invokeResponse.set_return("test");
		javax.xml.stream.XMLStreamReader xmlStreamReader = invokeResponse.getPullParser(new javax.xml.namespace.QName("http://densebrain.com/rif/client/service/types", "invokeResponse", "ns1"));
		assertNotNull(xmlStreamReader);
		assertEquals("test", xmlStreamReader.getElementText());
	}
	
	/**
	* Test case for {@link InvokeResponse#getPullParser(javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetPullParser3() throws Exception {
		InvokeResponse invokeResponse = new InvokeResponse();
		invokeResponse.set_return("test");
		javax.xml.stream.XMLStreamReader xmlStreamReader = invokeResponse.getPullParser(new javax.xml.namespace.QName("http://densebrain.com/rif/client/service/types", "invokeResponse", "ns1"));
		assertNotNull(xmlStreamReader);
		assertEquals("test", xmlStreamReader.getElementText());
	}
	
	/**
	* Test case for {@link InvokeResponse#getPullParser(javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetPullParser4() throws Exception {
		InvokeResponse invokeResponse = new InvokeResponse();
		invokeResponse.set_return("test");
		javax.xml.stream.XMLStreamReader xmlStreamReader = invokeResponse.getPullParser(new javax.xml.namespace.QName("http://densebrain.com/rif/client/service/types", "invokeResponse", "ns1"));
		assertNotNull(xmlStreamReader);
		assertEquals("test", xmlStreamReader.getElementText());
	}
	
	/**
	* Test case for {@link InvokeResponse#getPullParser(javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetPullParser5() throws Exception {
		InvokeResponse invokeResponse = new InvokeResponse();
		invokeResponse.set_return("test");
		javax.xml.stream.XMLStreamReader xmlStreamReader = invokeResponse.getPullParser(new javax.xml.namespace.QName("http://densebrain.com/rif/client/service/types", "invokeResponse", "ns1"));
		assertNotNull(xmlStreamReader);
		assertEquals("test", xmlStreamReader.getElementText());
	}
	
	/**
	* Test case for {@link InvokeResponse#getPullParser(javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetPullParser6() throws Exception {
		InvokeResponse invokeResponse = new InvokeResponse();
		invokeResponse.set_return("test");
		javax.xml.stream.XMLStreamReader xmlStreamReader = invokeResponse.getPullParser(new javax.xml.namespace.QName("http://densebrain.com/rif/client/service/types", "invokeResponse", "ns1"));
		assertNotNull(xmlStreamReader);
		assertEquals("test", xmlStreamReader.getElementText());
	}
	
	/**
	* Test case for {@link InvokeResponse#getPullParser(javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetPullParser7() throws Exception {
		InvokeResponse invokeResponse = new InvokeResponse();
		invokeResponse.set_return("test");
		javax.xml.stream.XMLStreamReader xmlStreamReader = invokeResponse.getPullParser(new javax.xml.namespace.QName("http://densebrain.com/rif/client/service/types", "invokeResponse", "ns1"));
		assertNotNull(xmlStreamReader);
		assertEquals("test", xmlStreamReader.getElementText());
	}
	
	/**
	* Test case for {@link InvokeResponse#getPullParser(javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetPullParser8() throws Exception {
		InvokeResponse invokeResponse = new InvokeResponse();
		invokeResponse.set_return("test");
		javax.xml.stream.XMLStreamReader xmlStreamReader = invokeResponse.getPullParser(new javax.xml.namespace.QName("http://densebrain.com/rif/client/service/types", "invokeResponse", "ns1"));
		assertNotNull(xmlStreamReader);
		assertEquals("test", xmlStreamReader.getElementText());
	}
	
	/**
	* Test case for {@link InvokeResponse#getPullParser(javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetPullParser9() throws Exception {
		InvokeResponse invokeResponse = new InvokeResponse();
		invokeResponse.set_return("test");
		javax.xml.stream.XMLStreamReader xmlStreamReader = invokeResponse.getPullParser(new javax.xml.namespace.QName("http://densebrain.com/rif/client/service/types", "invokeResponse", "ns1"));
		assertNotNull(xmlStreamReader);
		assertEquals("test", xmlStreamReader.getElementText());
	}
	
	/**
	* Test case for {@link InvokeResponse#getPullParser(javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetPullParser10() throws Exception {
		InvokeResponse invokeResponse = new InvokeResponse();
		invokeResponse.set_return("test");
		javax.xml.stream.XMLStreamReader xmlStreamReader = invokeResponse.getPullParser(new javax.xml.namespace.QName("http://densebrain.com/rif/client/service/types", "invokeResponse", "ns1"));
		assertNotNull(xmlStreamReader);
		assertEquals("test", xmlStreamReader.getElementText());
	}
	
}