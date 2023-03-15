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
	* Test case for the action name is null.
	*/
	@Test
	void testSetupAction_1() throws URISyntaxException {
		String actionName = null;
		Set<Attribute> action = RequestBuilder.setupAction(actionName);
		assertEquals(0, action.size());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* Test case for the action name is empty.
	*/
	@Test
	void testSetupAction_2() throws URISyntaxException {
		String actionName = "";
		Set<Attribute> action = RequestBuilder.setupAction(actionName);
		assertEquals(0, action.size());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* Test case for the action name is "action".
	*/
	@Test
	void testSetupAction_3() throws URISyntaxException {
		String actionName = "action";
		Set<Attribute> action = RequestBuilder.setupAction(actionName);
		assertEquals(1, action.size());
		Iterator<Attribute> it = action.iterator();
		Attribute attr = it.next();
		assertEquals("urn:oasis:names:tc:xacml:1.0:action:action-id", attr.getId().toString());
		assertEquals("action", attr.getValue().encode());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* Test case for the action name is "action1".
	*/
	@Test
	void testSetupAction_4() throws URISyntaxException {
		String actionName = "action1";
		Set<Attribute> action = RequestBuilder.setupAction(actionName);
		assertEquals(1, action.size());
		Iterator<Attribute> it = action.iterator();
		Attribute attr = it.next();
		assertEquals("urn:oasis:names:tc:xacml:1.0:action:action-id", attr.getId().toString());
		assertEquals("action1", attr.getValue().encode());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* Test case for the action name is "action2".
	*/
	@Test
	void testSetupAction_5() throws URISyntaxException {
		String actionName = "action2";
		Set<Attribute> action = RequestBuilder.setupAction(actionName);
		assertEquals(1, action.size());
		Iterator<Attribute> it = action.iterator();
		Attribute attr = it.next();
		assertEquals("urn:oasis:names:tc:xacml:1.0:action:action-id", attr.getId().toString());
		assertEquals("action2", attr.getValue().encode());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* Test case for the action name is "action3".
	*/
	@Test
	void testSetupAction_6() throws URISyntaxException {
		String actionName = "action3";
		Set<Attribute> action = RequestBuilder.setupAction(actionName);
		assertEquals(1, action.size());
		Iterator<Attribute> it = action.iterator();
		Attribute attr = it.next();
		assertEquals("urn:oasis:names:tc:xacml:1.0:action:action-id", attr.getId().toString());
		assertEquals("action3", attr.getValue().encode());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* Test case for the action name is "action4".
	*/
	@Test
	void testSetupAction_7() throws URISyntaxException {
		String actionName = "action4";
		Set<Attribute> action = RequestBuilder.setupAction(actionName);
		assertEquals(1, action.size());
		Iterator<Attribute> it = action.iterator();
		Attribute attr = it.next();
		assertEquals("urn:oasis:names:tc:xacml:1.0:action:action-id", attr.getId().toString());
		assertEquals("action4", attr.getValue().encode());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* Test case for the action name is "action5".
	*/
	@Test
	void testSetupAction_8() throws URISyntaxException {
		String actionName = "action5";
		Set<Attribute> action = RequestBuilder.setupAction(actionName);
		assertEquals(1, action.size());
		Iterator<Attribute> it = action.iterator();
		Attribute attr = it.next();
		assertEquals("urn:oasis:names:tc:xacml:1.0:action:action-id", attr.getId().toString());
		assertEquals("action5", attr.getValue().encode());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* Test case for the action name is "action6".
	*/
	@Test
	void testSetupAction_9() throws URISyntaxException {
		String actionName = "action6";
		Set<Attribute> action = RequestBuilder.setupAction(actionName);
		assertEquals(1, action.size());
		Iterator<Attribute> it = action.iterator();
		Attribute attr = it.next();
		assertEquals("urn:oasis:names:tc:xacml:1.0:action:action-id", attr.getId().toString());
		assertEquals("action6", attr.getValue().encode());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* Test case for the action name is "action7".
	*/
	@Test
	void testSetupAction_10() throws URISyntaxException {
		String actionName = "action7";
		Set<Attribute> action = RequestBuilder.setupAction(actionName);
		assertEquals(1, action.size());
		Iterator<Attribute> it = action.iterator();
		Attribute attr = it.next();
		assertEquals("urn:oasis:names:tc:xacml:1.0:action:action-id", attr.getId().toString());
		assertEquals("action7", attr.getValue().encode());
	}
}

// RequestBuilder_3Test.java
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
class RequestBuilder_3Test {
		
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* Test case for the resource name is null.
	*/
	@Test
	void testSetupResource_1() throws URISyntaxException {
		String resName = null;
		Set<Attribute> resource = RequestBuilder.setupResource(resName);
		assertEquals(0, resource.size());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* Test case for the resource name is empty.
	*/
	@Test
	void testSetupResource_2() throws URISyntaxException {
		String resName = "";
		Set<Attribute> resource = RequestBuilder.setupResource(resName);
		assertEquals(0, resource.size());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* Test case for the resource name is "resource".
	*/
	@Test
	void testSetupResource_3() throws URISyntaxException {
		String resName = "resource";
		Set<Attribute> resource = RequestBuilder.setupResource(resName);
		assertEquals(1, resource.size());
		Iterator<Attribute> it = resource.iterator();
		Attribute attr = it.next();
		assertEquals("urn:oasis:names:tc:xacml:1.0:resource:resource-id", attr.getId().toString());
		assertEquals("resource", attr.getValue().encode());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* Test case for the resource name is "resource1".
	*/
	@Test
	void testSetupResource_4() throws URISyntaxException {
		String resName = "resource1";
		Set<Attribute> resource = RequestBuilder.setupResource(resName);
		assertEquals(1, resource.size());
		Iterator<Attribute> it = resource.iterator();
		Attribute attr = it.next();
		assertEquals("urn:oasis:names:tc:xacml:1.0:resource:resource-id", attr.getId().toString());
		assertEquals("resource1", attr.getValue().encode());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* Test case for the resource name is "resource2".
	*/
	@Test
	void testSetupResource_5() throws URISyntaxException {
		String resName = "resource2";
		Set<Attribute> resource = RequestBuilder.setupResource(resName);
		assertEquals(1, resource.size());
		Iterator<Attribute> it = resource.iterator();
		Attribute attr = it.next();
		assertEquals("urn:oasis:names:tc:xacml:1.0:resource:resource-id", attr.getId().toString());
		assertEquals("resource2", attr.getValue().encode());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* Test case for the resource name is "resource3".
	*/
	@Test
	void testSetupResource_6() throws URISyntaxException {
		String resName = "resource3";
		Set<Attribute> resource = RequestBuilder.setupResource(resName);
		assertEquals(1, resource.size());
		Iterator<Attribute> it = resource.iterator();
		Attribute attr = it.next();
		assertEquals("urn:oasis:names:tc:xacml:1.0:resource:resource-id", attr.getId().toString());
		assertEquals("resource3", attr.getValue().encode());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* Test case for the resource name is "resource4".
	*/
	@Test
	void testSetupResource_7() throws URISyntaxException {
		String resName = "resource4";
		Set<Attribute> resource = RequestBuilder.setupResource(resName);
		assertEquals(1, resource.size());
		Iterator<Attribute> it = resource.iterator();
		Attribute attr = it.next();
		assertEquals("urn:oasis:names:tc:xacml:1.0:resource:resource-id", attr.getId().toString());
		assertEquals("resource4", attr.getValue().encode());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* Test case for the resource name is "resource5".
	*/
	@Test
	void testSetupResource_8() throws URISyntaxException {
		String resName = "resource5";
		Set<Attribute> resource = RequestBuilder.setupResource(resName);
		assertEquals(1, resource.size());
		Iterator<Attribute> it = resource.iterator();
		Attribute attr = it.next();
		assertEquals("urn:oasis:names:tc:xacml:1.0:resource:resource-id", attr.getId().toString());
		assertEquals("resource5", attr.getValue().encode());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* Test case for the resource name is "resource6".
	*/
	@Test
	void testSetupResource_9() throws URISyntaxException {
		String resName = "resource6";
		Set<Attribute> resource = RequestBuilder.setupResource(resName);
		assertEquals(1, resource.size());
		Iterator<Attribute> it = resource.iterator();
		Attribute attr = it.next();
		assertEquals("urn:oasis:names:tc:xacml:1.0:resource:resource-id", attr.getId().toString());
		assertEquals("resource6", attr.getValue().encode());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* Test case for the resource name is "resource7".
	*/
	@Test
	void testSetupResource_10() throws URISyntaxException {
		String resName = "resource7";
		Set<Attribute> resource = RequestBuilder.setupResource(resName);
		assertEquals(1, resource.size());
		Iterator<Attribute> it = resource.iterator();
		Attribute attr = it.next();
		assertEquals("urn:oasis:names:tc:xacml:1.0:resource:resource-id", attr.getId().toString());
		assertEquals("resource7", attr.getValue().encode());
	}
}

// RequestBuilder_4Test.java
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
* It contains ten unit test cases for the {@link RequestBuilder#setupSubjects(String, Set, Set)} method.
*/
class RequestBuilder_4Test {
		
	/**
	* Test case for {@link RequestBuilder#setupSubjects(String, Set, Set)} method.
	