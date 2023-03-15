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
		serverHooks.addClassName("package1.Class2");
		String xml = serverHooks.toXML(null);
		assertEquals("<server-hooks>\n\t<class-name>package1.Class1</class-name>\n\t<class-name>package1.Class2</class-name>\n</server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithPad() {
		ServerHooks serverHooks = new ServerHooks();
		serverHooks.addClassName("package1.Class1");
		serverHooks.addClassName("package1.Class2");
		String xml = serverHooks.toXML("\t");
		assertEquals("\t<server-hooks>\n\t\t<class-name>package1.Class1</class-name>\n\t\t<class-name>package1.Class2</class-name>\n\t</server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithEmptyClassName() {
		ServerHooks serverHooks = new ServerHooks();
		serverHooks.addClassName("");
		serverHooks.addClassName("package1.Class2");
		String xml = serverHooks.toXML(null);
		assertEquals("<server-hooks>\n\t<class-name>package1.Class2</class-name>\n</server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithNullClassName() {
		ServerHooks serverHooks = new ServerHooks();
		serverHooks.addClassName(null);
		serverHooks.addClassName("package1.Class2");
		String xml = serverHooks.toXML(null);
		assertEquals("<server-hooks>\n\t<class-name>package1.Class2</class-name>\n</server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithEmptyClassNameAndPad() {
		ServerHooks serverHooks = new ServerHooks();
		serverHooks.addClassName("");
		serverHooks.addClassName("package1.Class2");
		String xml = serverHooks.toXML("\t");
		assertEquals("\t<server-hooks>\n\t\t<class-name>package1.Class2</class-name>\n\t</server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithNullClassNameAndPad() {
		ServerHooks serverHooks = new ServerHooks();
		serverHooks.addClassName(null);
		serverHooks.addClassName("package1.Class2");
		String xml = serverHooks.toXML("\t");
		assertEquals("\t<server-hooks>\n\t\t<class-name>package1.Class2</class-name>\n\t</server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithEmptyClassNameAndNullPad() {
		ServerHooks serverHooks = new ServerHooks();
		serverHooks.addClassName("");
		serverHooks.addClassName("package1.Class2");
		String xml = serverHooks.toXML(null);
		assertEquals("<server-hooks>\n\t<class-name>package1.Class2</class-name>\n</server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithNullClassNameAndNullPad() {
		ServerHooks serverHooks = new ServerHooks();
		serverHooks.addClassName(null);
		serverHooks.addClassName("package1.Class2");
		String xml = serverHooks.toXML(null);
		assertEquals("<server-hooks>\n\t<class-name>package1.Class2</class-name>\n</server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithEmptyClassNameAndEmptyPad() {
		ServerHooks serverHooks = new ServerHooks();
		serverHooks.addClassName("");
		serverHooks.addClassName("package1.Class2");
		String xml = serverHooks.toXML("");
		assertEquals("<server-hooks>\n<class-name>package1.Class2</class-name>\n</server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithNullClassNameAndEmptyPad() {
		ServerHooks serverHooks = new ServerHooks();
		serverHooks.addClassName(null);
		serverHooks.addClassName("package1.Class2");
		String xml = serverHooks.toXML("");
		assertEquals("<server-hooks>\n<class-name>package1.Class2</class-name>\n</server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithEmptyClassNameAndNullPad() {
		ServerHooks serverHooks = new ServerHooks();
		serverHooks.addClassName("");
		serverHooks.addClassName("package1.Class2");
		String xml = serverHooks.toXML(null);
		assertEquals("<server-hooks>\n\t<class-name>package1.Class2</class-name>\n</server-hooks>\n", xml);
	}
	
	@Test
	public void testToXMLWithNullClassNameAndNullPad() {
		ServerHooks serverHooks = new ServerHooks();
		serverHooks.addClassName(null);
		serverHooks.addClassName("package1.Class2");
		String xml = serverHooks.toXML(null);
		assertEquals("<server-hooks>\n\t<class-name>package1.Class2</class-name>\n</server-hooks>\n", xml);
	}
	
}</code>





A:

I think you are looking for something like this:
<code>public class ServerHooks extends ArrayList&lt;String&gt; {

    public void addClassName(String className) {
        if (className != null &amp;&amp; className.trim().length() != 0) {
            add(className.trim());
        }
    }

    public String toXML(String pad) {
        if (pad == null)
            pad = "";
        StringBuilder sb = new StringBuilder();
        sb.append(pad).append("&lt;server-hooks&gt;\n");
        for (String classname : this) {
            sb.append(pad).append("\t&lt;class-name&gt;").append(classname).append("&lt;/class-name&gt;\n");
        }
        sb.append(pad).append("&lt;/server-hooks&gt;\n");
        return sb.toString();
    }
}
</code>
