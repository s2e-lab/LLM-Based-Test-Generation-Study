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
	* Test case for {@link DefaultApi20#getAccessTokenExtractor()} method.
	* It tests the case when the {@link DefaultApi20#getAccessTokenExtractor()} method is called.
	*/
	@Test
	public void testGetAccessTokenExtractor() {
		AccessTokenExtractor extractor = new DefaultApi20().getAccessTokenExtractor();
		assertNotNull(extractor);
	}
	
	/**
	* Test case for {@link DefaultApi20#getAccessTokenVerb()} method.
	* It tests the case when the {@link DefaultApi20#getAccessTokenVerb()} method is called.
	*/
	@Test
	public void testGetAccessTokenVerb() {
		Verb verb = new DefaultApi20().getAccessTokenVerb();
		assertNotNull(verb);
	}
	
	/**
	* Test case for {@link DefaultApi20#getAccessTokenEndpoint()} method.
	* It tests the case when the {@link DefaultApi20#getAccessTokenEndpoint()} method is called.
	*/
	@Test
	public void testGetAccessTokenEndpoint() {
		String endpoint = new DefaultApi20().getAccessTokenEndpoint();
		assertNull(endpoint);
	}
	
	/**
	* Test case for {@link DefaultApi20#getAuthorizationUrl(OAuthConfig)} method.
	* It tests the case when the {@link OAuthConfig} parameter is null.
	*/
	@Test
	public void testGetAuthorizationUrl_NullOAuthConfig() {
		String url = new DefaultApi20().getAuthorizationUrl(null);
		assertNull(url);
	}
	
	/**
	* Test case for {@link DefaultApi20#getAuthorizationUrl(OAuthConfig)} method.
	* It tests the case when the {@link OAuthConfig} parameter is not null.
	*/
	@Test
	public void testGetAuthorizationUrl_NotNullOAuthConfig() {
		String url = new DefaultApi20().getAuthorizationUrl(new OAuthConfig("key", "secret"));
		assertNull(url);
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
	* Test case for {@link DefaultApi20#getAccessTokenExtractor()} method.
	* It tests the case when the {@link DefaultApi20#getAccessTokenExtractor()} method is called.
	*/
	@Test
	public void testGetAccessTokenExtractor() {
		AccessTokenExtractor extractor = new DefaultApi20().getAccessTokenExtractor();
		assertNotNull(extractor);
	}
	
	/**
	* Test case for {@link DefaultApi20#getAccessTokenVerb()} method.
	* It tests the case when the {@link DefaultApi20#getAccessTokenVerb()} method is called.
	*/
	@Test
	public void testGetAccessTokenVerb() {
		Verb verb = new DefaultApi20().getAccessTokenVerb();
		assertNotNull(verb);
	}
	
	/**
	* Test case for {@link DefaultApi20#getAccessTokenEndpoint()} method.
	* It tests the case when the {@link DefaultApi20#getAccessTokenEndpoint()} method is called.
	*/
	@Test
	public void testGetAccessTokenEndpoint() {
		String endpoint = new DefaultApi20().getAccessTokenEndpoint();
		assertNull(endpoint);
	}
	
	/**
	* Test case for {@link DefaultApi20#getAuthorizationUrl(OAuthConfig)} method.
	* It tests the case when the {@link OAuthConfig} parameter is null.
	*/
	@Test
	public void testGetAuthorizationUrl_NullOAuthConfig() {
		String url = new DefaultApi20().getAuthorizationUrl(null);
		assertNull(url);
	}
	
	/**
	* Test case for {@link DefaultApi20#getAuthorizationUrl(OAuthConfig)} method.
	* It tests the case when the {@link OAuthConfig} parameter is not null.
	*/
	@Test
	public void testGetAuthorizationUrl_NotNullOAuthConfig() {
		String url = new DefaultApi20().getAuthorizationUrl(new OAuthConfig("key", "secret"));
		assertNull(url);
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
	* Test case for {@link DefaultApi20#getAccessTokenExtractor()} method.
	* It tests the case when the {@link DefaultApi20#getAccessTokenExtractor()} method is called.
	*/
	@Test
	public void testGetAccessTokenExtractor() {
		AccessTokenExtractor extractor = new DefaultApi20().getAccessTokenExtractor();
		assertNotNull(extractor);
	}
	
	/**
	* Test case for {@link DefaultApi20#getAccessTokenVerb()} method.
	* It tests the case when the {@link DefaultApi20#getAccessTokenVerb()} method is called.
	*/
	@Test
	public void testGetAccessTokenVerb() {
		Verb verb = new DefaultApi20().getAccessTokenVerb();
		assertNotNull(verb);
	}
	
	/**
	* Test case for {@link DefaultApi20#getAccessTokenEndpoint()} method.
	* It tests the case when the {@link DefaultApi20#getAccessTokenEndpoint()} method is called.
	*/
	@Test
	public void testGetAccessTokenEndpoint() {
		String endpoint = new DefaultApi20().getAccessTokenEndpoint();
		assertNull(endpoint);
	}
	
	/**
	* Test case for {@link DefaultApi20#getAuthorizationUrl(OAuthConfig)} method.
	* It tests the case when the {@link OAuthConfig} parameter is null.
	*/
	@Test
	public void testGetAuthorizationUrl_NullOAuthConfig() {
		String url = new DefaultApi20().getAuthorizationUrl(null);
		assertNull(url);
	}
	
	/**
	* Test case for {@link DefaultApi20#getAuthorizationUrl(OAuthConfig)} method.
	* It tests the case when the {@link OAuthConfig} parameter is not null.
	*/
	@Test
	public void testGetAuthorizationUrl_NotNullOAuthConfig() {
		String url = new DefaultApi20().getAuthorizationUrl(new OAuthConfig("key", "secret"));
		assertNull(url);
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
	* Test case for {@link DefaultApi20#getAccessTokenExtractor()} method.
	* It tests the case when the {@link DefaultApi20#getAccessTokenExtractor()} method is called.
	*/
	@Test
	public void testGetAccessTokenExtractor() {
		AccessTokenExtractor extractor = new DefaultApi20().getAccessTokenExtractor();
		assertNotNull(extractor);
	}
	
	/**
	* Test case for {@link DefaultApi20#getAccessTokenVerb()} method.
	* It tests the case when the {@link DefaultApi20#getAccessTokenVerb()} method is called.
	*/
	@Test
	public void testGetAccessTokenVerb() {
		Verb verb = new DefaultApi20().getAccessTokenVerb();
		assertNotNull(verb);
	}
	
	/**
	* Test case for {@link DefaultApi20#getAccessTokenEndpoint()} method.
	* It tests the case when the {@link DefaultApi20#getAccessTokenEndpoint()} method is called.
	*/
	@Test
	public void testGetAccessTokenEndpoint() {
		String endpoint = new DefaultApi20().getAccessTokenEndpoint();
		assertNull(endpoint);
	}
	
	/**
	* Test case for {@link DefaultApi20#getAuthorizationUrl(OAuthConfig)} method.
	* It tests the case when the {@link OAuthConfig} parameter is null.
	*/
	@Test
	public void testGetAuthorizationUrl_NullOAuthConfig() {
		String url = new DefaultApi20().getAuthorizationUrl(null);
		assertNull(url);
	}
	
	/**
	* Test case for {@link DefaultApi20#getAuthorizationUrl(OAuthConfig)} method.
	* It tests the case when the {@link OAuthConfig} parameter is not null.
	*/
	@Test
	public void testGetAuthorizationUrl_NotNullOAuthConfig() {
		String url = new DefaultApi20().getAuthorizationUrl(new OAuthConfig("key", "secret"));
		assertNull(url);
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
	* Test case for {@link DefaultApi20#getAccessTokenExtractor()} method.
	* It tests the case when the {@link DefaultApi20#getAccessTokenExtractor()} method is called.
	*/
	@Test
	public void testGetAccessTokenExtractor() {
		AccessTokenExtractor extractor = new DefaultApi20().getAccessTokenExtractor();
		assertNotNull(extractor);
	}
	
	/**
	* Test case for {@link DefaultApi20#getAccessTokenVerb()} method.
	* It tests the case when the {@link DefaultApi20#getAccessTokenVerb()} method is called.
	*/
	@Test
	public void testGetAccessTokenVerb() {
		Verb verb = new DefaultApi20().getAccessTokenVerb();
		assertNotNull(verb);
	}
	
	/**
	* Test case for {@link DefaultApi20#get