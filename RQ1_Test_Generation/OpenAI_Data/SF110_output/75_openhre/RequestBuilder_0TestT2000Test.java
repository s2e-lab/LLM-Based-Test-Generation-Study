// RequestBuilder_0Test.java
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
class RequestBuilder_0Test {

	/**
	* Test case for {@link RequestBuilder#setupSubjects(String, Set, Set)}
	* with subject = "", roles = null, groups = null.
	*/
	@Test
	void testSetupSubjects_0() throws URISyntaxException {
		String subject = "";
		Set roles = null;
		Set groups = null;
		Set result = RequestBuilder.setupSubjects(subject, roles, groups);
		assertNotNull(result);
		assertEquals(1, result.size());
		Iterator it = result.iterator();
		Subject s = (Subject) it.next();
		assertNotNull(s);
		Set attrs = s.getAttributes();
		assertNotNull(attrs);
		assertEquals(1, attrs.size());
		it = attrs.iterator();
		Attribute a = (Attribute) it.next();
		assertNotNull(a);
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:subject:subject-id"), a.getId());
		assertNull(a.getIssuer());
		assertNull(a.getIssueInstant());
		assertNotNull(a.getType());
		assertEquals(RFC822NameAttribute.identifier, a.getType());
		assertNotNull(a.getValues());
		assertEquals(1, a.getValues().size());
		it = a.getValues().iterator();
		RFC822NameAttribute v = (RFC822NameAttribute) it.next();
		assertNotNull(v);
		assertEquals("", v.getValue());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupSubjects(String, Set, Set)}
	* with subject = "", roles = {}, groups = null.
	*/
	@Test
	void testSetupSubjects_1() throws URISyntaxException {
		String subject = "";
		Set roles = new HashSet();
		Set groups = null;
		Set result = RequestBuilder.setupSubjects(subject, roles, groups);
		assertNotNull(result);
		assertEquals(1, result.size());
		Iterator it = result.iterator();
		Subject s = (Subject) it.next();
		assertNotNull(s);
		Set attrs = s.getAttributes();
		assertNotNull(attrs);
		assertEquals(1, attrs.size());
		it = attrs.iterator();
		Attribute a = (Attribute) it.next();
		assertNotNull(a);
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:subject:subject-id"), a.getId());
		assertNull(a.getIssuer());
		assertNull(a.getIssueInstant());
		assertNotNull(a.getType());
		assertEquals(RFC822NameAttribute.identifier, a.getType());
		assertNotNull(a.getValues());
		assertEquals(1, a.getValues().size());
		it = a.getValues().iterator();
		RFC822NameAttribute v = (RFC822NameAttribute) it.next();
		assertNotNull(v);
		assertEquals("", v.getValue());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupSubjects(String, Set, Set)}
	* with subject = "", roles = null, groups = {}.
	*/
	@Test
	void testSetupSubjects_2() throws URISyntaxException {
		String subject = "";
		Set roles = null;
		Set groups = new HashSet();
		Set result = RequestBuilder.setupSubjects(subject, roles, groups);
		assertNotNull(result);
		assertEquals(1, result.size());
		Iterator it = result.iterator();
		Subject s = (Subject) it.next();
		assertNotNull(s);
		Set attrs = s.getAttributes();
		assertNotNull(attrs);
		assertEquals(1, attrs.size());
		it = attrs.iterator();
		Attribute a = (Attribute) it.next();
		assertNotNull(a);
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:subject:subject-id"), a.getId());
		assertNull(a.getIssuer());
		assertNull(a.getIssueInstant());
		assertNotNull(a.getType());
		assertEquals(RFC822NameAttribute.identifier, a.getType());
		assertNotNull(a.getValues());
		assertEquals(1, a.getValues().size());
		it = a.getValues().iterator();
		RFC822NameAttribute v = (RFC822NameAttribute) it.next();
		assertNotNull(v);
		assertEquals("", v.getValue());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupSubjects(String, Set, Set)}
	* with subject = "", roles = {}, groups = {}.
	*/
	@Test
	void testSetupSubjects_3() throws URISyntaxException {
		String subject = "";
		Set roles = new HashSet();
		Set groups = new HashSet();
		Set result = RequestBuilder.setupSubjects(subject, roles, groups);
		assertNotNull(result);
		assertEquals(1, result.size());
		Iterator it = result.iterator();
		Subject s = (Subject) it.next();
		assertNotNull(s);
		Set attrs = s.getAttributes();
		assertNotNull(attrs);
		assertEquals(1, attrs.size());
		it = attrs.iterator();
		Attribute a = (Attribute) it.next();
		assertNotNull(a);
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:subject:subject-id"), a.getId());
		assertNull(a.getIssuer());
		assertNull(a.getIssueInstant());
		assertNotNull(a.getType());
		assertEquals(RFC822NameAttribute.identifier, a.getType());
		assertNotNull(a.getValues());
		assertEquals(1, a.getValues().size());
		it = a.getValues().iterator();
		RFC822NameAttribute v = (RFC822NameAttribute) it.next();
		assertNotNull(v);
		assertEquals("", v.getValue());
	}
	
	/**
	* Test case for {@link RequestBuilder#setupSubjects(String, Set, Set)}
	* with subject = "", roles = {"role1"}, groups = null.
	*/
	@Test
	void testSetupSubjects_4() throws URISyntaxException {
		String subject = "";
		Set roles = new HashSet();
		roles.add("role1");
		Set groups = null;
		Set result = RequestBuilder.setupSubjects(subject, roles, groups);
		assertNotNull(result);
		assertEquals(1, result.size());
		Iterator it = result.iterator();
		Subject s = (Subject) it.next();
		assertNotNull(s);
		Set attrs = s.getAttributes();
		assertNotNull(attrs);
		assertEquals(2, attrs.size());
		it = attrs.iterator();
		Attribute a = (Attribute) it.next();
		assertNotNull(a);
		assertEquals(new URI("urn:oasis:names:tc:xacml:1.0:subject:subject-id"), a.getId());
		assertNull(a.getIssuer());
		assertNull(a.getIssueInstant());
		assertNotNull(a.getType());
		assertEquals(RFC822NameAttribute.identifier, a.getType());