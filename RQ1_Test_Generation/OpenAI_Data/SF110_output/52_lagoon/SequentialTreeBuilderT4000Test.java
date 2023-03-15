// SequentialTreeBuilderTest.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SequentialTreeBuilder}.
* It contains ten unit test cases for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
*/
class SequentialTreeBuilderTest {

	@Test
	void testParseXMLSequential() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void processElement(Element el) {
				System.out.println(el.getLocalName());
			}
		};
		Element rootElement = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
		assertEquals("root", rootElement.getLocalName());
	}
	
	@Test
	void testParseXMLSequential2() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void processElement(Element el) {
				System.out.println(el.getLocalName());
			}
		};
		Element rootElement = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
		assertEquals("root", rootElement.getLocalName());
	}
	
	@Test
	void testParseXMLSequential3() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void processElement(Element el) {
				System.out.println(el.getLocalName());
			}
		};
		Element rootElement = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
		assertEquals("root", rootElement.getLocalName());
	}
	
	@Test
	void testParseXMLSequential4() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void processElement(Element el) {
				System.out.println(el.getLocalName());
			}
		};
		Element rootElement = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
		assertEquals("root", rootElement.getLocalName());
	}
	
	@Test
	void testParseXMLSequential5() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void processElement(Element el) {
				System.out.println(el.getLocalName());
			}
		};
		Element rootElement = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
		assertEquals("root", rootElement.getLocalName());
	}
	
	@Test
	void testParseXMLSequential6() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void processElement(Element el) {
				System.out.println(el.getLocalName());
			}
		};
		Element rootElement = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
		assertEquals("root", rootElement.getLocalName());
	}
	
	@Test
	void testParseXMLSequential7() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void processElement(Element el) {
				System.out.println(el.getLocalName());
			}
		};
		Element rootElement = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
		assertEquals("root", rootElement.getLocalName());
	}
	
	@Test
	void testParseXMLSequential8() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void processElement(Element el) {
				System.out.println(el.getLocalName());
			}
		};
		Element rootElement = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
		assertEquals("root", rootElement.getLocalName());
	}
	
	@Test
	void testParseXMLSequential9() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void processElement(Element el) {
				System.out.println(el.getLocalName());
			}
		};
		Element rootElement = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
		assertEquals("root", rootElement.getLocalName());
	}
	
	@Test
	void testParseXMLSequential10() throws Exception {
		InputSource xmlInput = new InputSource(new StringReader("<root><a/><b/><c/></root>"));
		ElementHandler handler = new ElementHandler() {
			public void processElement(Element el) {
				System.out.println(el.getLocalName());
			}
		};
		Element rootElement = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);
		assertEquals("root", rootElement.getLocalName());
	}
}