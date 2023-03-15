// InvokeTest.java
package com.densebrain.rif.client.service.types;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Invoke}.
* It contains ten unit test cases for the {@link Invoke#getPullParser(javax.xml.namespace.QName)} method.
*/
class InvokeTest {

	@Test
	void testGetPullParser() throws Exception {
		Invoke invoke = new Invoke();
		invoke.setClassName("com.densebrain.rif.client.service.types.Invoke");
		invoke.setMethodName("getPullParser");
		invoke.setSerializedParams("");
		
		javax.xml.stream.XMLStreamReader reader = invoke.getPullParser(Invoke.MY_QNAME);
		
		assertEquals("ns1:invoke", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		
		reader.next();
		assertEquals("ns1:className", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("com.densebrain.rif.client.service.types.Invoke", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:methodName", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("getPullParser", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:serializedParams", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:invoke", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.END_ELEMENT, reader.getEventType());
	}
	
	@Test
	void testGetPullParser_nullClassName() throws Exception {
		Invoke invoke = new Invoke();
		invoke.setClassName(null);
		invoke.setMethodName("getPullParser");
		invoke.setSerializedParams("");
		
		javax.xml.stream.XMLStreamReader reader = invoke.getPullParser(Invoke.MY_QNAME);
		
		assertEquals("ns1:invoke", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		
		reader.next();
		assertEquals("ns1:className", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:methodName", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("getPullParser", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:serializedParams", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:invoke", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.END_ELEMENT, reader.getEventType());
	}
	
	@Test
	void testGetPullParser_nullMethodName() throws Exception {
		Invoke invoke = new Invoke();
		invoke.setClassName("com.densebrain.rif.client.service.types.Invoke");
		invoke.setMethodName(null);
		invoke.setSerializedParams("");
		
		javax.xml.stream.XMLStreamReader reader = invoke.getPullParser(Invoke.MY_QNAME);
		
		assertEquals("ns1:invoke", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		
		reader.next();
		assertEquals("ns1:className", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("com.densebrain.rif.client.service.types.Invoke", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:methodName", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:serializedParams", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:invoke", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.END_ELEMENT, reader.getEventType());
	}
	
	@Test
	void testGetPullParser_nullSerializedParams() throws Exception {
		Invoke invoke = new Invoke();
		invoke.setClassName("com.densebrain.rif.client.service.types.Invoke");
		invoke.setMethodName("getPullParser");
		invoke.setSerializedParams(null);
		
		javax.xml.stream.XMLStreamReader reader = invoke.getPullParser(Invoke.MY_QNAME);
		
		assertEquals("ns1:invoke", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		
		reader.next();
		assertEquals("ns1:className", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("com.densebrain.rif.client.service.types.Invoke", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:methodName", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("getPullParser", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:serializedParams", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:invoke", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.END_ELEMENT, reader.getEventType());
	}
	
	@Test
	void testGetPullParser_emptyClassName() throws Exception {
		Invoke invoke = new Invoke();
		invoke.setClassName("");
		invoke.setMethodName("getPullParser");
		invoke.setSerializedParams("");
		
		javax.xml.stream.XMLStreamReader reader = invoke.getPullParser(Invoke.MY_QNAME);
		
		assertEquals("ns1:invoke", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		
		reader.next();
		assertEquals("ns1:className", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:methodName", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("getPullParser", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:serializedParams", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:invoke", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.END_ELEMENT, reader.getEventType());
	}
	
	@Test
	void testGetPullParser_emptyMethodName() throws Exception {
		Invoke invoke = new Invoke();
		invoke.setClassName("com.densebrain.rif.client.service.types.Invoke");
		invoke.setMethodName("");
		invoke.setSerializedParams("");
		
		javax.xml.stream.XMLStreamReader reader = invoke.getPullParser(Invoke.MY_QNAME);
		
		assertEquals("ns1:invoke", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		
		reader.next();
		assertEquals("ns1:className", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("com.densebrain.rif.client.service.types.Invoke", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:methodName", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:serializedParams", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:invoke", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.END_ELEMENT, reader.getEventType());
	}
	
	@Test
	void testGetPullParser_emptySerializedParams() throws Exception {
		Invoke invoke = new Invoke();
		invoke.setClassName("com.densebrain.rif.client.service.types.Invoke");
		invoke.setMethodName("getPullParser");
		invoke.setSerializedParams("");
		
		javax.xml.stream.XMLStreamReader reader = invoke.getPullParser(Invoke.MY_QNAME);
		
		assertEquals("ns1:invoke", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		
		reader.next();
		assertEquals("ns1:className", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("com.densebrain.rif.client.service.types.Invoke", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:methodName", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("getPullParser", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:serializedParams", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("", reader.getElementText());
		
		reader.next();
		assertEquals("ns1:invoke", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.END_ELEMENT, reader.getEventType());
	}
	
	@Test
	void testGetPullParser_nullQName() throws Exception {
		Invoke invoke = new Invoke();
		invoke.setClassName("com.densebrain.rif.client.service.types.Invoke");
		invoke.setMethodName("getPullParser");
		invoke.setSerializedParams("");
		
		javax.xml.stream.XMLStreamReader reader = invoke.getPullParser(null);
		
		assertEquals("invoke", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		
		reader.next();
		assertEquals("className", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("com.densebrain.rif.client.service.types.Invoke", reader.getElementText());
		
		reader.next();
		assertEquals("methodName", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("getPullParser", reader.getElementText());
		
		reader.next();
		assertEquals("serializedParams", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.START_ELEMENT, reader.getEventType());
		assertEquals("", reader.getElementText());
		
		reader.next();
		assertEquals("invoke", reader.getName().toString());
		assertEquals(javax.xml.stream.XMLStreamConstants.END_ELEMENT, reader.getEventType());
	}
	
	@Test
	void testGetPullParser_emptyQName() throws Exception {
		Invoke invoke = new Invoke();
		invoke.setClassName("com.densebrain.rif.client.service.types.Invoke");
		invoke.setMethodName("getPullParser");
		invoke.setSerializedParams("");
		
		javax.xml.stream.XML