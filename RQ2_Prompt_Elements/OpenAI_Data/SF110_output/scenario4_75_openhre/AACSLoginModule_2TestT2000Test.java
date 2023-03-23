// AACSLoginModule_2Test.java
package com.browsersoft.jaas;

import java.util.*;
import java.io.IOException;
import javax.security.auth.*;
import javax.security.auth.callback.*;
import javax.security.auth.login.*;
import javax.security.auth.spi.*;
import com.browsersoft.aacs.Login;
import com.browsersoft.aacs.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AACSLoginModule}.
* It contains ten unit test cases for the {@link AACSLoginModule#abort()} method.
*/
class AACSLoginModule_2Test {

	/**
	* Test case 1 for method {@link AACSLoginModule#abort()}.
	*
	* @throws LoginException if the test fails
	*/
	@Test
	void testAbort_1() throws LoginException {
		// create a test subject
		Subject subject = new Subject();
		// create a test callback handler
		CallbackHandler callbackHandler = new TestCallbackHandler();
		// create a test shared state
		Map sharedState = new HashMap();
		// create a test options
		Map options = new HashMap();
		// create a test login module
		LoginModule loginModule = new AACSLoginModule();
		// initialize the test login module
		loginModule.initialize(subject, callbackHandler, sharedState, options);
		// login
		loginModule.login();
		// commit
		loginModule.commit();
		// abort
		loginModule.abort();
		// check if the subject is empty
		assertTrue(subject.getPrincipals().isEmpty());
	}
	
	/**
	* Test case 2 for method {@link AACSLoginModule#abort()}.
	*
	* @throws LoginException if the test fails
	*/
	@Test
	void testAbort_2() throws LoginException {
		// create a test subject
		Subject subject = new Subject();
		// create a test callback handler
		CallbackHandler callbackHandler = new TestCallbackHandler();
		// create a test shared state
		Map sharedState = new HashMap();
		// create a test options
		Map options = new HashMap();
		// create a test login module
		LoginModule loginModule = new AACSLoginModule();
		// initialize the test login module
		loginModule.initialize(subject, callbackHandler, sharedState, options);
		// login
		loginModule.login();
		// commit
		loginModule.commit();
		// abort
		loginModule.abort();
		// check if the subject is empty
		assertTrue(subject.getPrincipals().isEmpty());
	}
	
	/**
	* Test case 3 for method {@link AACSLoginModule#abort()}.
	*
	* @throws LoginException if the test fails
	*/
	@Test
	void testAbort_3() throws LoginException {
		// create a test subject
		Subject subject = new Subject();
		// create a test callback handler
		CallbackHandler callbackHandler = new TestCallbackHandler();
		// create a test shared state
		Map sharedState = new HashMap();
		// create a test options
		Map options = new HashMap();
		// create a test login module
		LoginModule loginModule = new AACSLoginModule();
		// initialize the test login module
		loginModule.initialize(subject, callbackHandler, sharedState, options);
		// login
		loginModule.login();
		// commit
		loginModule.commit();
		// abort
		loginModule.abort();
		// check if the subject is empty
		assertTrue(subject.getPrincipals().isEmpty());
	}
	
	/**
	* Test case 4 for method {@link AACSLoginModule#abort()}.
	*
	* @throws LoginException if the test fails
	*/
	@Test
	void testAbort_4() throws LoginException {
		// create a test subject
		Subject subject = new Subject();
		// create a test callback handler
		CallbackHandler callbackHandler = new TestCallbackHandler();
		// create a test shared state
		Map sharedState = new HashMap();
		// create a test options
		Map options = new HashMap();
		// create a test login module
		LoginModule loginModule = new AACSLoginModule();
		// initialize the test login module
		loginModule.initialize(subject, callbackHandler, sharedState, options);
		// login
		loginModule.login();
		// commit
		loginModule.commit();
		// abort
		loginModule.abort();
		// check if the subject is empty
		assertTrue(subject.getPrincipals().isEmpty());
	}
	
	/**
	* Test case 5 for method {@link AACSLoginModule#abort()}.
	*
	* @throws LoginException if the test fails
	*/
	@Test
	void testAbort_5() throws LoginException {
		// create a test subject
		Subject subject = new Subject();
		// create a test callback handler
		CallbackHandler callbackHandler = new TestCallbackHandler();
		// create a test shared state
		Map sharedState = new HashMap();
		// create a test options
		Map options = new HashMap();
		// create a test login module
		LoginModule loginModule = new AACSLoginModule();
		// initialize the test login module
		loginModule.initialize(subject, callbackHandler, sharedState, options);
		// login
		loginModule.login();
		// commit
		loginModule.commit();
		// abort
		loginModule.abort();
		// check if the subject is empty
		assertTrue(subject.getPrincipals().isEmpty());
	}
	
	/**
	* Test case 6 for method {@link AACSLoginModule#abort()}.
	*
	* @throws LoginException if the test fails
	*/
	@Test
	void testAbort_6() throws LoginException {
		// create a test subject
		Subject subject = new Subject();
		// create a test callback handler
		CallbackHandler callbackHandler = new TestCallbackHandler();
		// create a test shared state
		Map sharedState = new HashMap();
		// create a test options
		Map options = new HashMap();
		// create a test login module
		LoginModule loginModule = new AACSLoginModule();
		// initialize the test login module
		loginModule.initialize(subject, callbackHandler, sharedState, options);
		// login
		loginModule.login();
		// commit
		loginModule.commit();
		// abort
		loginModule.abort();
		// check if the subject is empty
		assertTrue(subject.getPrincipals().isEmpty());
	}
	
	/**
	* Test case 7 for method {@link AACSLoginModule#abort()}.
	*
	* @throws LoginException if the test fails
	*/
	@Test
	void testAbort_7() throws LoginException {
		// create a test subject
		Subject subject = new Subject();
		// create a test callback handler
		CallbackHandler callbackHandler = new TestCallbackHandler();
		// create a test shared state
		Map sharedState = new HashMap();
		// create a test options
		Map options = new HashMap();
		// create a test login module
		LoginModule loginModule = new AACSLoginModule();
		// initialize the test login module
		loginModule.initialize(subject, callbackHandler, sharedState, options);
		// login
		loginModule.login();
		// commit
		loginModule.commit();
		// abort
		loginModule.abort();
		// check if the subject is empty
		assertTrue(subject.getPrincipals().isEmpty());
	}
	
	/**
	* Test case 8 for method {@link AACSLoginModule#abort()}.
	*
	* @throws LoginException if the test fails
	*/
	@Test
	void testAbort_8() throws LoginException {
		// create a test subject
		Subject subject = new Subject();
		// create a test callback handler
		CallbackHandler callbackHandler = new TestCallbackHandler();
		// create a test shared state
		Map sharedState = new HashMap();
		// create a test options
		Map options = new HashMap();
		// create a test login module
		LoginModule loginModule = new AACSLoginModule();
		// initialize the test login module
		loginModule.initialize(subject, callbackHandler, sharedState, options