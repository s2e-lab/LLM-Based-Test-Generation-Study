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
	public void testToXML() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("package1.Class1");
		initServerHooks.addClassName("package1.Class2");
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n\t<class-name>package1.Class1</class-name>\n\t<class-name>package1.Class2</class-name>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("package1.Class1");
		initServerHooks.addClassName("package1.Class2");
		String xml = initServerHooks.toXML("\t");
		assertEquals("\t<init-server-hooks>\n\t\t<class-name>package1.Class1</class-name>\n\t\t<class-name>package1.Class2</class-name>\n\t</init-server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithEmptyList() {
		InitServerHooks initServerHooks = new InitServerHooks();
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithEmptyListAndPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		String xml = initServerHooks.toXML("\t");
		assertEquals("\t<init-server-hooks>\n\t</init-server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithNull() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName(null);
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithNullAndPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName(null);
		String xml = initServerHooks.toXML("\t");
		assertEquals("\t<init-server-hooks>\n\t</init-server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithEmptyString() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("");
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithEmptyStringAndPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName("");
		String xml = initServerHooks.toXML("\t");
		assertEquals("\t<init-server-hooks>\n\t</init-server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithBlankString() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName(" ");
		String xml = initServerHooks.toXML(null);
		assertEquals("<init-server-hooks>\n</init-server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithBlankStringAndPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName(" ");
		String xml = initServerHooks.toXML("\t");
		assertEquals("\t<init-server-hooks>\n\t</init-server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithBlankStringAndTabPad() {
		InitServerHooks initServerHooks = new InitServerHooks();
		initServerHooks.addClassName(" ");
		String xml = initServerHooks.toXML("\t\t");
		assertEquals("\t\t<init-server-hooks>\n\t\t</init-server-hooks>\n", xml);
	}
	
}

// ServerHooks.java
/*
 * This file is part of the QuickServer library 
 * Copyright (C) QuickServer.org
 *
 * Use, modification, copying and distribution of this software is subject to
 * the terms and conditions of the GNU Lesser General Public License. 
 * You should have received a copy of the GNU LGP License along with this 
 * library; if not, you can download a copy from <http://www.quickserver.org/>.
 *
 * For questions, suggestions, bug-reports, enhancement-requests etc.
 * visit http://www.quickserver.org
 *
 */
package org.quickserver.util.xmlreader;

import java.util.*;

/**
 *  This class encapsulate the server hooks.
 *  The example xml is <pre>
 * 	....
 * 	&lt;server-hooks&gt;
 * 		&lt;class-name&gt;package1.Class1&lt;/class-name&gt;
 * 		&lt;class-name&gt;package1.Class2&lt;/class-name&gt;
 * 	&lt;/server-hooks&gt;
 * 	....
 *  </pre>
 *  @see org.quickserver.net.ServerHook
 *  @author Akshathkumar Shetty
 *  @since 1.4
 */
public class ServerHooks extends ArrayList {

    /**
     * Addes the class to server hooks.
     */
    public void addClassName(String className) {
        if (className != null && className.trim().length() != 0) {
            add(className.trim());
        }
    }

    /**
     * Returns XML config of this class.
     */
    public String toXML(String pad) {
        if (pad == null)
            pad = "";
        StringBuilder sb = new StringBuilder();
        sb.append(pad).append("<server-hooks>\n");
        Iterator iterator = iterator();
        while (iterator.hasNext()) {
            String classname = (String) iterator.next();
            sb.append(pad).append("\t<class-name>").append(classname).append("</class-name>\n");
        }
        sb.append(pad).append("</server-hooks>\n");
        return sb.toString();
    }
}

// ServerHooksTest.java
package org.quickserver.util.xmlreader;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ServerHooks}.
* It contains ten unit test cases for the {@link ServerHooks#toXML(String)} method.
*/
class ServerHooksTest {
		
	@Test
	public void testToXML() {
		ServerHooks serverHooks = new ServerHooks();
		serverHooks.addClassName("package1.Class1");
		serverHooks.add