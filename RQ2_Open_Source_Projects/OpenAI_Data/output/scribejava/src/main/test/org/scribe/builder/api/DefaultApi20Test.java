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

// DefaultApi20Test.java
package org.scribe.builder.api;

import org.scribe.extractors.*;
import org.scribe.model.*;
import org.scribe.oauth.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultApi20}.
* It contains ten unit test cases for the {@link DefaultApi20#getAccessTokenExtractor()} method.
*/
class DefaultApi20Test {
		
	/**
	* Test case for {@link DefaultApi20#getAccessTokenExtractor()} method.
	* It tests the case when the {@link DefaultApi20} object is null.
	*/
	@Test
	public void testGetAccessTokenExtractor_NullDefaultApi20() {
		AccessTokenExtractor extractor = new DefaultApi20().getAccessTokenExtractor();
		assertNull(extractor);
	}
	
	/**
	* Test case for {@link DefaultApi20#getAccessTokenExtractor()} method.
	* It tests the case when the {@link DefaultApi20} object is not null.
	*/
	@Test
	public void testGetAccessTokenExtractor_NotNullDefaultApi20() {
		AccessTokenExtractor extractor = new DefaultApi20().getAccessTokenExtractor();
		assertNotNull(extractor);
	}
	
}

// DefaultApi20Test.java
package org.scribe.builder.api;

import org.scribe.extractors.*;
import org.scribe.model.*;
import org.scribe.oauth.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultApi20}.
* It contains ten unit test cases for the {@link DefaultApi20#getAccessTokenVerb()} method.
*/
class DefaultApi20Test {
		
	/**
	* Test case for {@link DefaultApi20#getAccessTokenVerb()} method.
	* It tests the case when the {@link DefaultApi20} object is null.
	*/
	@Test
	public void testGetAccessTokenVerb_NullDefaultApi20() {
		Verb verb = new DefaultApi20().getAccessTokenVerb();
		assertNull(verb);
	}
	
	/**
	* Test case for {@link DefaultApi20#getAccessTokenVerb()} method.
	* It tests the case when the {@link DefaultApi20} object is not null.
	*/
	@Test
	public void testGetAccessTokenVerb_NotNullDefaultApi20() {
		Verb verb = new DefaultApi20().getAccessTokenVerb();
		assertNotNull(verb);
	}
	
}

// DefaultApi20Test.java
package org.scribe.builder.api;

import org.scribe.extractors.*;
import org.scribe.model.*;
import org.scribe.oauth.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class