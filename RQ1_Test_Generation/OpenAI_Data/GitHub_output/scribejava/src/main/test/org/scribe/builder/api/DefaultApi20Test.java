// DefaultApi20Test.java
package org.scribe.builder.api;

import org.scribe.extractors.*;
import org.scribe.model.*;
import org.scribe.oauth.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultApi20}.
* It contains ten unit test cases for the {@link DefaultApi20#createService(OAuthConfig)} method.
*/
class DefaultApi20Test {

	/**
	* Test case for {@link DefaultApi20#createService(OAuthConfig)} method.
	* It tests the case when the {@link OAuthConfig} parameter is null.
	*/
	@Test
	public void testCreateService_NullOAuthConfig() {
		OAuthService service = new DefaultApi20().createService(null);
		assertNull(service);
	}
	
	/**
	* Test case for {@link DefaultApi20#createService(OAuthConfig)} method.
	* It tests the case when the {@link OAuthConfig} parameter is not null.
	*/
	@Test
	public void testCreateService_NotNullOAuthConfig() {
		OAuthService service = new DefaultApi20().createService(new OAuthConfig("key", "secret"));
		assertNotNull(service);
	}
	
	/**
	* Test case for {@link DefaultApi20#createService(OAuthConfig)} method.
	* It tests the case when the {@link OAuthConfig} parameter is not null.
	*/
	@Test
	public void testCreateService_NotNullOAuthConfig_NullApi() {
		OAuthService service = new DefaultApi20().createService(new OAuthConfig("key", "secret", null));
		assertNotNull(service);
	}
	
	/**
	* Test case for {@link DefaultApi20#createService(OAuthConfig)} method.
	* It tests the case when the {@link OAuthConfig} parameter is not null.
	*/
	@Test
	public void testCreateService_NotNullOAuthConfig_NotNullApi() {
		OAuthService service = new DefaultApi20().createService(new OAuthConfig("key", "secret", "callback"));
		assertNotNull(service);
	}
	
	/**
	* Test case for {@link DefaultApi20#createService(OAuthConfig)} method.
	* It tests the case when the {@link OAuthConfig} parameter is not null.
	*/
	@Test
	public void testCreateService_NotNullOAuthConfig_NotNullApi_NullScope() {
		OAuthService service = new DefaultApi20().createService(new OAuthConfig("key", "secret", "callback", null));
		assertNotNull(service);
	}
	
	/**
	* Test case for {@link DefaultApi20#createService(OAuthConfig)} method.
	* It tests the case when the {@link OAuthConfig} parameter is not null.
	*/
	@Test
	public void testCreateService_NotNullOAuthConfig_NotNullApi_NotNullScope() {
		OAuthService service = new DefaultApi20().createService(new OAuthConfig("key", "secret", "callback", "scope"));
		assertNotNull(service);
	}
	
	/**
	* Test case for {@link DefaultApi20#createService(OAuthConfig)} method.
	* It tests the case when the {@link OAuthConfig} parameter is not null.
	*/
	@Test
	public void testCreateService_NotNullOAuthConfig_NotNullApi_NotNullScope_NullGrantType() {
		OAuthService service = new DefaultApi20().createService(new OAuthConfig("key", "secret", "callback", "scope", null));
		assertNotNull(service);
	}
	
	/**
	* Test case for {@link DefaultApi20#createService(OAuthConfig)} method.
	* It tests the case when the {@link OAuthConfig} parameter is not null.
	*/
	@Test
	public void testCreateService_NotNullOAuthConfig_NotNullApi_NotNullScope_NotNullGrantType() {
		OAuthService service = new DefaultApi20().createService(new OAuthConfig("key", "secret", "callback", "scope", "grantType"));
		assertNotNull(service);
	}
	
	/**
	* Test case for {@link DefaultApi20#createService(OAuthConfig)} method.
	* It tests the case when the {@link OAuthConfig} parameter is not null.
	*/
	@Test
	public void testCreateService_NotNullOAuthConfig_NotNullApi_NotNullScope_NotNullGrantType_NullHeader() {
		OAuthService service = new DefaultApi20().createService(new OAuthConfig("key", "secret", "callback", "scope", "grantType", null));
		assertNotNull(service);
	}
	
	/**
	* Test case for {@link DefaultApi20#createService(OAuthConfig)} method.
	* It tests the case when the {@link OAuthConfig} parameter is not null.
	*/
	@Test
	public void testCreateService_NotNullOAuthConfig_NotNullApi_NotNullScope_NotNullGrantType_NotNullHeader() {
		OAuthService service = new DefaultApi20().createService(new OAuthConfig("key", "secret", "callback", "scope", "grantType", "header"));
		assertNotNull(service);
	}
	
}