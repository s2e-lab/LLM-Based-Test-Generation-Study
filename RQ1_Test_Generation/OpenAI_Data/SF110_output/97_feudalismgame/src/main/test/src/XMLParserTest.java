// XMLParserTest.java
package src;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XMLParser}.
* It contains ten unit test cases for the {@link XMLParser#fiefdoms()} method.
*/
class XMLParserTest {

		/**
		* Test case for {@link XMLParser#fiefdoms()} method.
		* It tests if the method returns a HashMap of Fiefdoms.
		*/
		@Test
		void testFiefdoms() {
				HashMap<String, Fiefdoms> fiefdoms = XMLParser.fiefdoms();
				assertEquals(fiefdoms.getClass(), HashMap.class);
		}
		
		/**
		* Test case for {@link XMLParser#fiefdoms()} method.
		* It tests if the method returns a HashMap of Fiefdoms.
		*/
		@Test
		void testFiefdoms2() {
				HashMap<String, Fiefdoms> fiefdoms = XMLParser.fiefdoms();
				assertEquals(fiefdoms.get("Aberdeen").getClass(), Fiefdoms.class);
		}
		
		/**
		* Test case for {@link XMLParser#fiefdoms()} method.
		* It tests if the method returns a HashMap of Fiefdoms.
		*/
		@Test
		void testFiefdoms3() {
				HashMap<String, Fiefdoms> fiefdoms = XMLParser.fiefdoms();
				assertEquals(fiefdoms.get("Aberdeen").getName(), "Aberdeen");
		}
		
		/**
		* Test case for {@link XMLParser#fiefdoms()} method.
		* It tests if the method returns a HashMap of Fiefdoms.
		*/
		@Test
		void testFiefdoms4() {
				HashMap<String, Fiefdoms> fiefdoms = XMLParser.fiefdoms();
				assertEquals(fiefdoms.get("Aberdeen").getOwner(), "Player");
		}
		
		/**
		* Test case for {@link XMLParser#fiefdoms()} method.
		* It tests if the method returns a HashMap of Fiefdoms.
		*/
		@Test
		void testFiefdoms5() {
				HashMap<String, Fiefdoms> fiefdoms = XMLParser.fiefdoms();
				assertEquals(fiefdoms.get("Aberdeen").getValue(), 1);
		}
		
		/**
		* Test case for {@link XMLParser#fiefdoms()} method.
		* It tests if the method returns a HashMap of Fiefdoms.
		*/
		@Test
		void testFiefdoms6() {
				HashMap<String, Fiefdoms> fiefdoms = XMLParser.fiefdoms();
				assertEquals(fiefdoms.get("Aberdeen").getIsKingdom(), false);
		}
		
		/**
		* Test case for {@link XMLParser#fiefdoms()} method.
		* It tests if the method returns a HashMap of Fiefdoms.
		*/
		@Test
		void testFiefdoms7() {
				HashMap<String, Fiefdoms> fiefdoms = XMLParser.fiefdoms();
				assertEquals(fiefdoms.get("Aberdeen").getInvaderType().get(0), "None");
		}
		
		/**
		* Test case for {@link XMLParser#fiefdoms()} method.
		* It tests if the method returns a HashMap of Fiefdoms.
		*/
		@Test
		void testFiefdoms8() {
				HashMap<String, Fiefdoms> fiefdoms = XMLParser.fiefdoms();
				assertEquals(fiefdoms.get("Aberdeen").getNeighbors().get(0), "Aberdeenshire");
		}
		
		/**
		* Test case for {@link XMLParser#fiefdoms()} method.
		* It tests if the method returns a HashMap of Fiefdoms.
		*/
		@Test
		void testFiefdoms9() {
				HashMap<String, Fiefdoms> fiefdoms = XMLParser.fiefdoms();
				assertEquals(fiefdoms.get("Aberdeen").getNeighbors().get(1), "Angus");
		}
		
		/**
		* Test case for {@link XMLParser#fiefdoms()} method.
		* It tests if the method returns a HashMap of Fiefdoms.
		*/
		@Test
		void testFiefdoms10() {
				HashMap<String, Fiefdoms> fiefdoms = XMLParser.fiefdoms();
				assertEquals(fiefdoms.get("Aberdeen").getNeighbors().get(2), "Banffshire");
		}
}</code>



I am trying to test the XMLParser class using JUnit. I am getting the following error:
<code>java.lang.NoClassDefFoundError: org/junit/platform/commons/util/PreconditionViolationException
    at java.base/java.lang.ClassLoader.defineClass1(Native Method)
    at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1016)
    at java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:174)
    at java.base/jdk.internal.loader.BuiltinClassLoader.defineClass(BuiltinClassLoader.java:802)
    at java.base/jdk.internal.loader.BuiltinClassLoader.findClassOnClassPathOrNull(BuiltinClassLoader.java:700)
    at java.base/jdk.internal.loader.BuiltinClassLoader.loadClassOrNull(BuiltinClassLoader.java:623)
    at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:581)
    at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
    at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
    at java.base/java.lang.Class.getDeclaredMethods0(Native Method)
    at java.base/java.lang.Class.privateGetDeclaredMethods(Class.java:3167)
    at java.base/java.lang.Class.privateGetMethodRecursive(Class.java:3410)
    at java.base/java.lang.Class.getMethod0(Class.java:3170)
    at java.base/java.lang.Class.getMethod(Class.java:2075)
    at org.junit.platform.commons.util.ReflectionUtils.findMethod(ReflectionUtils.java:532)
    at org.junit.jupiter.engine.execution.MethodInvocation.getExecutable(MethodInvocation.java:132)
    at org.junit.jupiter.engine.execution.MethodInvocation.&lt;init&gt;(MethodInvocation.java:75)
    at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$6(TestMethodTestDescriptor.java:171)
    at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
    at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:167)
    at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:114)
    at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:59)
    at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$4(NodeTestTask.java:108)
    at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
    at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecurs