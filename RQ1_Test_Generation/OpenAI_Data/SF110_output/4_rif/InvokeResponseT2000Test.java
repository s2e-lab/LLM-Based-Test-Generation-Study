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
		javax.xml.stream.XMLStreamReader xmlStreamReader = invokeResponse.getPullParser(InvokeResponse.MY_QNAME);
		assertNotNull(xmlStreamReader);
		assertEquals(xmlStreamReader.getEventType(), javax.xml.stream.XMLStreamConstants.START_ELEMENT);
		assertEquals(xmlStreamReader.getLocalName(), "invokeResponse");
		assertEquals(xmlStreamReader.getNamespaceURI(), "http://densebrain.com/rif/client/service/types");
		assertEquals(xmlStreamReader.getPrefix(), "ns1");
		assertEquals(xmlStreamReader.getAttributeCount(), 0);
		assertEquals(xmlStreamReader.getNamespaceCount(), 1);
		assertEquals(xmlStreamReader.getNamespacePrefix(0), "ns1");
		assertEquals(xmlStreamReader.getNamespaceURI(0), "http://densebrain.com/rif/client/service/types");
		assertEquals(xmlStreamReader.getNamespaceContext().getNamespaceURI("ns1"), "http://densebrain.com/rif/client/service/types");
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefix("http://densebrain.com/rif/client/service/types"), "ns1");
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").next(), "ns1");
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").hasNext(), false);
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").next(), "ns1");
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").hasNext(), false);
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").next(), "ns1");
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").hasNext(), false);
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").next(), "ns1");
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").hasNext(), false);
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").next(), "ns1");
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").hasNext(), false);
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").next(), "ns1");
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").hasNext(), false);
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").next(), "ns1");
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").hasNext(), false);
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").next(), "ns1");
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").hasNext(), false);
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").next(), "ns1");
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").hasNext(), false);
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").next(), "ns1");
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").hasNext(), false);
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").next(), "ns1");
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").hasNext(), false);
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").next(), "ns1");
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").hasNext(), false);
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").next(), "ns1");
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").hasNext(), false);
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").next(), "ns1");
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").hasNext(), false);
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").next(), "ns1");
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").hasNext(), false);
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").next(), "ns1");
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").hasNext(), false);
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").next(), "ns1");
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").hasNext(), false);
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").next(), "ns1");
		assertEquals(xmlStreamReader.getNamespaceContext().getPrefixes("http://densebrain.com/rif/client/service/types").hasNext(), false);
		assertEquals(xmlStreamReader.getNamespaceContext().getPref