// RequestBuilder_1Test.java
package com.browsersoft.aacs.xacml;

import com.sun.xacml.EvaluationCtx;
import com.sun.xacml.Indenter;
import com.sun.xacml.attr.AnyURIAttribute;
import com.sun.xacml.attr.RFC822NameAttribute;
import com.sun.xacml.attr.StringAttribute;
import com.sun.xacml.ctx.Attribute;
import com.sun.xacml.ctx.RequestCtx;
import com.sun.xacml.ctx.Subject;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RequestBuilder}.
* It contains ten unit test cases for the {@link RequestBuilder#setupResource(String)} method.
*/
class RequestBuilder_1Test {

	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* It tests the case when the resource name is null.
	*/
	@Test
	void testSetupResource_1() throws URISyntaxException {
		String resName = null;
		Set<Attribute> result = RequestBuilder.setupResource(resName);
		assertEquals(1, result.size());
		Iterator<Attribute> it = result.iterator();
		Attribute attr = it.next();
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:resource:resource-id"), attr.getId());
		assertEquals(null, attr.getIssuer());
		assertEquals(null, attr.getIssueInstant());
		assertEquals(new StringAttribute(""), attr.getValue());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* It tests the case when the resource name is empty.
	*/
	@Test
	void testSetupResource_2() throws URISyntaxException {
		String resName = "";
		Set<Attribute> result = RequestBuilder.setupResource(resName);
		assertEquals(1, result.size());
		Iterator<Attribute> it = result.iterator();
		Attribute attr = it.next();
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:resource:resource-id"), attr.getId());
		assertEquals(null, attr.getIssuer());
		assertEquals(null, attr.getIssueInstant());
		assertEquals(new StringAttribute(""), attr.getValue());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* It tests the case when the resource name is a valid name.
	*/
	@Test
	void testSetupResource_3() throws URISyntaxException {
		String resName = "resource";
		Set<Attribute> result = RequestBuilder.setupResource(resName);
		assertEquals(1, result.size());
		Iterator<Attribute> it = result.iterator();
		Attribute attr = it.next();
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:resource:resource-id"), attr.getId());
		assertEquals(null, attr.getIssuer());
		assertEquals(null, attr.getIssueInstant());
		assertEquals(new StringAttribute("resource"), attr.getValue());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* It tests the case when the resource name is a valid name with a space.
	*/
	@Test
	void testSetupResource_4() throws URISyntaxException {
		String resName = "resource name";
		Set<Attribute> result = RequestBuilder.setupResource(resName);
		assertEquals(1, result.size());
		Iterator<Attribute> it = result.iterator();
		Attribute attr = it.next();
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:resource:resource-id"), attr.getId());
		assertEquals(null, attr.getIssuer());
		assertEquals(null, attr.getIssueInstant());
		assertEquals(new StringAttribute("resource name"), attr.getValue());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* It tests the case when the resource name is a valid name with a space and a tab.
	*/
	@Test
	void testSetupResource_5() throws URISyntaxException {
		String resName = "resource name\t";
		Set<Attribute> result = RequestBuilder.setupResource(resName);
		assertEquals(1, result.size());
		Iterator<Attribute> it = result.iterator();
		Attribute attr = it.next();
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:resource:resource-id"), attr.getId());
		assertEquals(null, attr.getIssuer());
		assertEquals(null, attr.getIssueInstant());
		assertEquals(new StringAttribute("resource name\t"), attr.getValue());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* It tests the case when the resource name is a valid name with a space and a tab and a new line.
	*/
	@Test
	void testSetupResource_6() throws URISyntaxException {
		String resName = "resource name\t\n";
		Set<Attribute> result = RequestBuilder.setupResource(resName);
		assertEquals(1, result.size());
		Iterator<Attribute> it = result.iterator();
		Attribute attr = it.next();
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:resource:resource-id"), attr.getId());
		assertEquals(null, attr.getIssuer());
		assertEquals(null, attr.getIssueInstant());
		assertEquals(new StringAttribute("resource name\t\n"), attr.getValue());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* It tests the case when the resource name is a valid name with a space and a tab and a new line and a carriage return.
	*/
	@Test
	void testSetupResource_7() throws URISyntaxException {
		String resName = "resource name\t\n\r";
		Set<Attribute> result = RequestBuilder.setupResource(resName);
		assertEquals(1, result.size());
		Iterator<Attribute> it = result.iterator();
		Attribute attr = it.next();
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:resource:resource-id"), attr.getId());
		assertEquals(null, attr.getIssuer());
		assertEquals(null, attr.getIssueInstant());
		assertEquals(new StringAttribute("resource name\t\n\r"), attr.getValue());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* It tests the case when the resource name is a valid name with a space and a tab and a new line and a carriage return and a form feed.
	*/
	@Test
	void testSetupResource_8() throws URISyntaxException {
		String resName = "resource name\t\n\r\f";
		Set<Attribute> result = RequestBuilder.setupResource(resName);
		assertEquals(1, result.size());
		Iterator<Attribute> it = result.iterator();
		Attribute attr = it.next();
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:resource:resource-id"), attr.getId());
		assertEquals(null, attr.getIssuer());
		assertEquals(null, attr.getIssueInstant());
		assertEquals(new StringAttribute("resource name\t\n\r\f"), attr.getValue());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* It tests the case when the resource name is a valid name with a space and a tab and a new line and a carriage return and a form feed and a vertical tab.
	*/
	@Test
	void testSetupResource_9() throws URISyntaxException {
		String resName = "resource name\t\n\r\f\u000B";
		Set<Attribute> result = RequestBuilder.setupResource(resName);
		assertEquals(1, result.size());
		Iterator<Attribute> it = result.iterator();
		Attribute attr = it.next();
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:resource:resource-id"), attr.getId());
		assertEquals(null, attr.getIssuer());
		assertEquals(null, attr.getIssueInstant());
		assertEquals(new StringAttribute("resource name\t\n\r\f\u000B"), attr.getValue());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* It tests the case when the resource name is a valid name with a space and a tab and a new line and a carriage return and a form feed and a vertical tab and a backspace.
	*/
	@Test
	void testSetupResource_10() throws URISyntaxException {
		String resName = "resource name\t\n\r\f\u000B\b";
		Set<Attribute> result = RequestBuilder.setupResource(resName);
		assertEquals(1, result.size());
		Iterator<Attribute> it = result.iterator();
		Attribute attr = it.next();
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:resource:resource-id"), attr.getId());
		assertEquals(null, attr.getIssuer());
		assertEquals(null, attr.getIssueInstant());
		assertEquals(new StringAttribute("resource name\t\n\r\f\u000B\b"), attr.getValue());
	}
}

// RequestBuilder_2Test.java
package com.browsersoft.aacs.xacml;

import com.sun.xacml.EvaluationCtx;
import com.sun.xacml.Indenter;
import com.sun.xacml.attr.AnyURIAttribute;
import com.sun.xacml.attr.RFC822NameAttribute;
import com.sun.xacml.attr.StringAttribute;
import com.sun.xacml.ctx.Attribute;
import com.sun.xacml.ctx.RequestCtx;
import com.sun.xacml.ctx.Subject;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RequestBuilder}.
* It contains ten unit test cases for the {@link RequestBuilder#setupAction(String)} method.
*/
class RequestBuilder_2Test {
		
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* It tests the case when the action name is null.
	*/
	@Test
	void testSetupAction_1() throws URISyntaxException {
		String actionName = null;
		Set<Attribute> result = RequestBuilder.setupAction(actionName);
		assertEquals(1, result.size());
		Iterator<Attribute> it = result.iterator();
		Attribute attr = it.next();
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:action:action-id"), attr.getId());
		assertEquals(null, attr.getIssuer());
		assertEquals(null, attr.getIssueInstant());
		assertEquals(new StringAttribute(""), attr.getValue());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* It tests the case when the action name is empty.
	*/
	@Test
	void testSetupAction_2() throws URISyntaxException {
		String actionName = "";
		Set<Attribute> result = RequestBuilder.setupAction(actionName);
		assertEquals(1, result.size());
		Iterator<Attribute> it = result.iterator();
		Attribute attr = it.next();
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:action:action-id"), attr.getId());
		assertEquals(null, attr.getIssuer());
		assertEquals(null, attr.getIssueInstant());
		assertEquals(new StringAttribute(""), attr.getValue());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* It tests the case when the action name is a valid name.
	*/
	@Test
	void testSetupAction_3() throws URISyntaxException {
		String actionName = "action";
		Set<Attribute> result = RequestBuilder.setupAction(actionName);
		assertEquals(1, result.size());
		Iterator<Attribute> it = result.iterator();
		Attribute attr = it.next();
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:action:action-id"), attr.getId());
		assertEquals(null, attr.getIssuer());
		assertEquals(null, attr.getIssueInstant());
		assertEquals(new StringAttribute("action"), attr.getValue());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* It tests the case when the action name is a valid name with a space.
	*/
	@Test
	void testSetupAction_4() throws URISyntaxException {
		String actionName = "action name";
		Set<Attribute> result = RequestBuilder.setupAction(actionName);
		assertEquals(1, result.size());
		Iterator<Attribute> it = result.iterator();
		Attribute attr = it.next();
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:action:action-id"), attr.getId());
		assertEquals(null, attr.getIssuer());
		assertEquals(null, attr.getIssueInstant());
		assertEquals(new StringAttribute("action name"), attr.getValue());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* It tests the case when the action name is a valid name with a space and a tab.
	*/
	@Test
	void testSetupAction_5() throws URISyntaxException {
		String actionName = "action name\t";
		Set<Attribute> result = RequestBuilder.setupAction(actionName);
		assertEquals(1, result.size());
		Iterator<Attribute> it = result.iterator();
		Attribute attr = it.next();
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:action:action-id"), attr.getId());
		assertEquals(null, attr.getIssuer());
		assertEquals(null, attr.getIssueInstant());
		assertEquals(new StringAttribute("action name\t"), attr.getValue());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* It tests the case when the action name is a valid name with a space and a tab and a new line.
	*/
	@Test
	void testSetupAction_6() throws URISyntaxException {
		String actionName = "action name\t\n";
		Set<Attribute> result = RequestBuilder.setupAction(actionName);
		assertEquals(1, result.size());
		Iterator<Attribute> it = result.iterator();
		Attribute attr = it.next();
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:action:action-id"), attr.getId());
		assertEquals(null, attr.getIssuer());
		assertEqu