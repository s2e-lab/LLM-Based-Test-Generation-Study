// TreeBuilder_0Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains ten unit test cases for the {@link TreeBuilder#fileToInputSource(File)} method.
*/
class TreeBuilder_0Test {

		@Test
		void test_0() throws Exception {
				File file = new File("src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml");
				InputSource inputSource = TreeBuilder.fileToInputSource(file);
				assertEquals("file:/src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml", inputSource.getSystemId());
		}
		
		@Test
		void test_1() throws Exception {
				File file = new File("src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml");
				InputSource inputSource = TreeBuilder.fileToInputSource(file);
				assertEquals("file:/src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml", inputSource.getSystemId());
		}
		
		@Test
		void test_2() throws Exception {
				File file = new File("src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml");
				InputSource inputSource = TreeBuilder.fileToInputSource(file);
				assertEquals("file:/src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml", inputSource.getSystemId());
		}
		
		@Test
		void test_3() throws Exception {
				File file = new File("src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml");
				InputSource inputSource = TreeBuilder.fileToInputSource(file);
				assertEquals("file:/src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml", inputSource.getSystemId());
		}
		
		@Test
		void test_4() throws Exception {
				File file = new File("src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml");
				InputSource inputSource = TreeBuilder.fileToInputSource(file);
				assertEquals("file:/src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml", inputSource.getSystemId());
		}
		
		@Test
		void test_5() throws Exception {
				File file = new File("src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml");
				InputSource inputSource = TreeBuilder.fileToInputSource(file);
				assertEquals("file:/src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml", inputSource.getSystemId());
		}
		
		@Test
		void test_6() throws Exception {
				File file = new File("src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml");
				InputSource inputSource = TreeBuilder.fileToInputSource(file);
				assertEquals("file:/src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml", inputSource.getSystemId());
		}
		
		@Test
		void test_7() throws Exception {
				File file = new File("src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml");
				InputSource inputSource = TreeBuilder.fileToInputSource(file);
				assertEquals("file:/src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml", inputSource.getSystemId());
		}
		
		@Test
		void test_8() throws Exception {
				File file = new File("src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml");
				InputSource inputSource = TreeBuilder.fileToInputSource(file);
				assertEquals("file:/src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml", inputSource.getSystemId());
		}
		
		@Test
		void test_9() throws Exception {
				File file = new File("src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml");
				InputSource inputSource = TreeBuilder.fileToInputSource(file);
				assertEquals("file:/src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml", inputSource.getSystemId());
		}
}

// TreeBuilder_1Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains ten unit test cases for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
*/
class TreeBuilder_1Test {
		
		@Test
		void test_0() throws Exception {
				InputSource inputSource = new InputSource("src/test/resources/nu/staldal/xtree/TreeBuilder_1Test.xml");
				Element element = TreeBuilder.parseXML(inputSource, false);
				assertEquals("http://www.staldal.nu/", element.getNamespaceURI());
				assertEquals("root", element.getLocalName());
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(0));
				assertEquals("attr", element.getAttributeLocalName(0));
				assertEquals("value", element.getAttributeValue(0));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(1));
				assertEquals("attr2", element.getAttributeLocalName(1));
				assertEquals("value2", element.getAttributeValue(1));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(2));
				assertEquals("attr3", element.getAttributeLocalName(2));
				assertEquals("value3", element.getAttributeValue(2));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(3));
				assertEquals("attr4", element.getAttributeLocalName(3));
				assertEquals("value4", element.getAttributeValue(3));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(4));
				assertEquals("attr5", element.getAttributeLocalName(4));
				assertEquals("value5", element.getAttributeValue(4));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(5));
				assertEquals("attr6", element.getAttributeLocalName(5));
				assertEquals("value6", element.getAttributeValue(5));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(6));
				assertEquals("attr7", element.getAttributeLocalName(6));
				assertEquals("value7", element.getAttributeValue(6));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(7));
				assertEquals("attr8", element.getAttributeLocalName(7));
				assertEquals("value8", element.getAttributeValue(7));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(8));
				assertEquals("attr9", element.getAttributeLocalName(8));
				assertEquals("value9", element.getAttributeValue(8));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(9));
				assertEquals("attr10", element.getAttributeLocalName(9));
				assertEquals("value10", element.getAttributeValue(9));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(10));
				assertEquals("attr11", element.getAttributeLocalName(10));
				assertEquals("value11", element.getAttributeValue(10));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(11));
				assertEquals("attr12", element.getAttributeLocalName(11));
				assertEquals("value12", element.getAttributeValue(11));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(12));
				assertEquals("attr13", element.getAttributeLocalName(12));
				assertEquals("value13", element.getAttributeValue(12));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(13));
				assertEquals("attr14", element.getAttributeLocalName(13));
				assertEquals("value14", element.getAttributeValue(13));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(14));
				assertEquals("attr15", element.getAttributeLocalName(14));
				assertEquals("value15", element.getAttributeValue(14));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(15));
				assertEquals("attr16", element.getAttributeLocalName(15));
				assertEquals("value16", element.getAttributeValue(15));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(16));
				assertEquals("attr17", element.getAttributeLocalName(16));
				assertEquals("value17", element.getAttributeValue(16));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(17));
				assertEquals("attr18", element.getAttributeLocalName(17));
				assertEquals("value18", element.getAttributeValue(17));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(18));
				assertEquals("attr19", element.getAttributeLocalName(18));
				assertEquals("value19", element.getAttributeValue(18));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(19));
				assertEquals("attr20", element.getAttributeLocalName(19));
				assertEquals("value20", element.getAttributeValue(19));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(20));
				assertEquals("attr21", element.getAttributeLocalName(20));
				assertEquals("value21", element.getAttributeValue(20));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(21));
				assertEquals("attr22", element.getAttributeLocalName(21));
				assertEquals("value22", element.getAttributeValue(21));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(22));
				assertEquals("attr23", element.getAttributeLocalName(22));
				assertEquals("value23", element.getAttributeValue(22));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(23));
				assertEquals("attr24", element.getAttributeLocalName(23));
				assertEquals("value24", element.getAttributeValue(23));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(24));
				assertEquals("attr25", element.getAttributeLocalName(24));
				assertEquals("value25", element.getAttributeValue(24));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(25));
				assertEquals("attr26", element.getAttributeLocalName(25));
				assertEquals("value26", element.getAttributeValue(25));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(26));
				assertEquals("attr27", element.getAttributeLocalName(26));
				assertEquals("value27", element.getAttributeValue(26));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(27));
				assertEquals("attr28", element.getAttributeLocalName(27));
				assertEquals("value28", element.getAttributeValue(27));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(28));
				assertEquals("attr29", element.getAttributeLocalName(28));
				assertEquals("value29", element.getAttributeValue(28));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(29));
				assertEquals("attr30", element.getAttributeLocalName(29));
				assertEquals("value30", element.getAttributeValue(29));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(30));
				assertEquals("attr31", element.getAttributeLocalName(30));
				assertEquals("value31", element.getAttributeValue(30));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(31));
				assertEquals("attr32", element.getAttributeLocalName(31));
				assertEquals("value32", element.getAttributeValue(31));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(32));
				assertEquals("attr33", element.getAttributeLocalName(32));
				assertEquals("value33", element.getAttributeValue(32));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(33));
				assertEquals("attr34", element.getAttributeLocalName(33));
				assertEquals("value34", element.getAttributeValue(33));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(34));
				assertEquals("attr35", element.getAttributeLocalName(34));
				assertEquals("value35", element.getAttributeValue(34));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(35));
				assertEquals("attr36", element.getAttributeLocalName(35));
				assertEquals("value36", element.getAttributeValue