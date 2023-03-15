// InitServerHooksTest.java
package org.quickserver.util.xmlreader;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InitServerHooks}.
* It contains ten unit test cases for the {@link InitServerHooks#toXML(String)} method.
*/
class InitServerHooksTest {

	@Test
	void testToXML() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("package1.Class1");
		initServerHooks.addClassName("package1.Class2");
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n\t<class-name>package1.Class1</class-name>\n\t<class-name>package1.Class2</class-name>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("package1.Class1");
		initServerHooks.addClassName("package1.Class2");
		String xml = initServerHooks.toXML("\t");
		assertEquals("\t<init-server-hooks>\n\t\t<class-name>package1.Class1</class-name>\n\t\t<class-name>package1.Class2</class-name>\n\t</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyClassName() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("");
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithNullClassName() {
		InitServerHooks initServerHooks = new InitServerHooks();

initServerHooks.addClassName(null);
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyClassNameAndPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("");
		String xml = initServerHooks.toXML("\t");
		assertEquals("\t<init-server-hooks>\n\t</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithNullClassNameAndPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName(null);
		String xml = initServerHooks.toXML("\t");
		assertEquals("\t<init-server-hooks>\n\t</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyClassNameAndNullPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("");
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithNullClassNameAndNullPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName(null);
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyClassNameAndEmptyPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("");
		String xml = initServerHooks.toXML("");
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithNullClassNameAndEmptyPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName(null);
		String xml = initServerHooks.toXML("");
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyClassNameAndNullPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("");
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithNullClassNameAndNullPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName(null);
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
}

// InitServerHooksTest.java
package org.quickserver.util.xmlreader;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InitServerHooks}.
* It contains ten unit test cases for the {@link InitServerHooks#toXML(String)} method.
*/
class InitServerHooksTest {
		
	@Test
	void testToXML() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("package1.Class1");
		initServerHooks.addClassName("package1.Class2");
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n\t<class-name>package1.Class1</class-name>\n\t<class-name>package1.Class2</class-name>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("package1.Class1");
		initServerHooks.addClassName("package1.Class2");
		String xml = initServerHooks.toXML("\t");
		assertEquals("\t<init-server-hooks>\n\t\t<class-name>package1.Class1</class-name>\n\t\t<class-name>package1.Class2</class-name>\n\t</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyClassName() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("");
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithNullClassName() {
		InitServerHooks initServerHooks = new InitServerHooks();

initServerHooks.addClassName(null);
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyClassNameAndPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("");
		String xml = initServerHooks.toXML("\t");
		assertEquals("\t<init-server-hooks>\n\t</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithNullClassNameAndPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName(null);
		String xml = initServerHooks.toXML("\t");
		assertEquals("\t<init-server-hooks>\n\t</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyClassNameAndNullPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("");
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithNullClassNameAndNullPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName(null);
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyClassNameAndEmptyPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("");
		String xml = initServerHooks.toXML("");
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithNullClassNameAndEmptyPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName(null);
		String xml = initServerHooks.toXML("");
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyClassNameAndNullPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("");
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithNullClassNameAndNullPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName(null);
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
}

// InitServerHooksTest.java
package org.quickserver.util.xmlreader;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InitServerHooks}.
* It contains ten unit test cases for the {@link InitServerHooks#toXML(String)} method.
*/
class InitServerHooksTest {
		
	@Test
	void testToXML() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("package1.Class1");
		initServerHooks.addClassName("package1.Class2");
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n\t<class-name>package1.Class1</class-name>\n\t<class-name>package1.Class2</class-name>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("package1.Class1");
		initServerHooks.addClassName("package1.Class2");
		String xml = initServerHooks.toXML("\t");
		assertEquals("\t<init-server-hooks>\n\t\t<class-name>package1.Class1</class-name>\n\t\t<class-name>package1.Class2</class-name>\n\t</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyClassName() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("");
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithNullClassName() {
		InitServerHooks initServerHooks = new InitServerHooks();

initServerHooks.addClassName(null);
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyClassNameAndPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("");
		String xml = initServerHooks.toXML("\t");
		assertEquals("\t<init-server-hooks>\n\t</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithNullClassNameAndPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName(null);
		String xml = initServerHooks.toXML("\t");
		assertEquals("\t<init-server-hooks>\n\t</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyClassNameAndNullPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("");
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithNullClassNameAndNullPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName(null);
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyClassNameAndEmptyPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("");
		String xml = initServerHooks.toXML("");
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n",