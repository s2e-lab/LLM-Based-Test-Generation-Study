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
	* Test case for the resource name is null.
	*/
	@Test
	void testSetupResource_1() throws URISyntaxException {
		String resName = null;
		Set<Attribute> result = RequestBuilder.setupResource(resName);
		assertEquals(0, result.size());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* Test case for the resource name is empty.
	*/
	@Test
	void testSetupResource_2() throws URISyntaxException {
		String resName = "";
		Set<Attribute> result = RequestBuilder.setupResource(resName);
		assertEquals(0, result.size());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* Test case for the resource name is a valid name.
	*/
	@Test
	void testSetupResource_3() throws URISyntaxException {
		String resName = "resource";
		Set<Attribute> result = RequestBuilder.setupResource(resName);
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* Test case for the resource name is a valid name.
	*/
	@Test
	void testSetupResource_4() throws URISyntaxException {
		String resName = "resource1";
		Set<Attribute> result = RequestBuilder.setupResource(resName);
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* Test case for the resource name is a valid name.
	*/
	@Test
	void testSetupResource_5() throws URISyntaxException {
		String resName = "resource2";
		Set<Attribute> result = RequestBuilder.setupResource(resName);
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* Test case for the resource name is a valid name.
	*/
	@Test
	void testSetupResource_6() throws URISyntaxException {
		String resName = "resource3";
		Set<Attribute> result = RequestBuilder.setupResource(resName);
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* Test case for the resource name is a valid name.
	*/
	@Test
	void testSetupResource_7() throws URISyntaxException {
		String resName = "resource4";
		Set<Attribute> result = RequestBuilder.setupResource(resName);
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* Test case for the resource name is a valid name.
	*/
	@Test
	void testSetupResource_8() throws URISyntaxException {
		String resName = "resource5";
		Set<Attribute> result = RequestBuilder.setupResource(resName);
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* Test case for the resource name is a valid name.
	*/
	@Test
	void testSetupResource_9() throws URISyntaxException {
		String resName = "resource6";
		Set<Attribute> result = RequestBuilder.setupResource(resName);
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupResource(String)} method.
	* Test case for the resource name is a valid name.
	*/
	@Test
	void testSetupResource_10() throws URISyntaxException {
		String resName = "resource7";
		Set<Attribute> result = RequestBuilder.setupResource(resName);
		assertEquals(1, result.size());
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
	* Test case for the action name is null.
	*/
	@Test
	void testSetupAction_1() throws URISyntaxException {
		String actionName = null;
		Set<Attribute> result = RequestBuilder.setupAction(actionName);
		assertEquals(0, result.size());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* Test case for the action name is empty.
	*/
	@Test
	void testSetupAction_2() throws URISyntaxException {
		String actionName = "";
		Set<Attribute> result = RequestBuilder.setupAction(actionName);
		assertEquals(0, result.size());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* Test case for the action name is a valid name.
	*/
	@Test
	void testSetupAction_3() throws URISyntaxException {
		String actionName = "action";
		Set<Attribute> result = RequestBuilder.setupAction(actionName);
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* Test case for the action name is a valid name.
	*/
	@Test
	void testSetupAction_4() throws URISyntaxException {
		String actionName = "action1";
		Set<Attribute> result = RequestBuilder.setupAction(actionName);
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* Test case for the action name is a valid name.
	*/
	@Test
	void testSetupAction_5() throws URISyntaxException {
		String actionName = "action2";
		Set<Attribute> result = RequestBuilder.setupAction(actionName);
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* Test case for the action name is a valid name.
	*/
	@Test
	void testSetupAction_6() throws URISyntaxException {
		String actionName = "action3";
		Set<Attribute> result = RequestBuilder.setupAction(actionName);
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupAction(String)} method.
	* Test case for the action name is a valid name.
	*/
	@Test
