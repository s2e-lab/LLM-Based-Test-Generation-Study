// ServiceBuilderTest9.java
package org.scribe.builder;

import java.io.*;
import org.scribe.builder.api.*;
import org.scribe.exceptions.*;
import org.scribe.model.*;
import org.scribe.oauth.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ServiceBuilder}.
* It contains ten unit test cases for the {@link ServiceBuilder#build()} method.
*/
class ServiceBuilderTest9 {

		@Test
		public void shouldThrowExceptionIfApiIsNull() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret");
				try {
						builder.build();
						fail("Should throw an exception if api is null");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("You must specify a valid api through the provider() method", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfApiKeyIsNull() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiSecret("secret").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if api key is null");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("You must provide an api key", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfApiKeyIsEmpty() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("").apiSecret("secret").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if api key is empty");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Invalid Api key", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfApiSecretIsNull() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if api secret is null");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("You must provide an api secret", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfApiSecretIsEmpty() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if api secret is empty");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Invalid Api secret", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfCallbackIsNull() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if callback is null");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Callback can't be null", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfCallbackIsEmpty() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret").callback("").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if callback is empty");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Callback can't be null", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfSignatureTypeIsNull() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret").callback("callback").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if signature type is null");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Signature type can't be null", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfScopeIsNull() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret").callback("callback").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if scope is null");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Invalid OAuth scope", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfScopeIsEmpty() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret").callback("callback").scope("").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if scope is empty");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Invalid OAuth scope", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfDebugStreamIsNull() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret").callback("callback").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if debug stream is null");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("debug stream can't be null", e.getMessage());
				}
		}
		
}

// ServiceBuilderTest10.java
package org.scribe.builder;

import java.io.*;
import org.scribe.builder.api.*;
import org.scribe.exceptions.*;
import org.scribe.model.*;
import org.scribe.oauth.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ServiceBuilder}.
* It contains ten unit test cases for the {@link ServiceBuilder#build()} method.
*/
class ServiceBuilderTest10 {
		
		@Test
		public void shouldThrowExceptionIfApiIsNull() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret");
				try {
						builder.build();
						fail("Should throw an exception if api is null");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("You must specify a valid api through the provider() method", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfApiKeyIsNull() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiSecret("secret").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if api key is null");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("You must provide an api key", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfApiKeyIsEmpty() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("").apiSecret("secret").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if api key is empty");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Invalid Api key", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfApiSecretIsNull() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if api secret is null");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("You must provide an api secret", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfApiSecretIsEmpty() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if api secret is empty");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Invalid Api secret", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfCallbackIsNull() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if callback is null");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Callback can't be null", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfCallbackIsEmpty() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret").callback("").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if callback is empty");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Callback can't be null", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfSignatureTypeIsNull() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret").callback("callback").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if signature type is null");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Signature type can't be null", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfScopeIsNull() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret").callback("callback").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if scope is null");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Invalid OAuth scope", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfScopeIsEmpty() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret").callback("callback").scope("").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if scope is empty");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Invalid OAuth scope", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfDebugStreamIsNull() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret").callback("callback").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if debug stream is null");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("debug stream can't be null", e.getMessage());
				}
		}
		
}

// ServiceBuilderTest11.java
package org.scribe.builder;

import java.io.*;
import org.scribe.builder.api.*;
import org.scribe.exceptions.*;
import org.scribe.model.*;
import org.scribe.oauth.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ServiceBuilder}.
* It contains ten unit test cases for the {@link ServiceBuilder#build()} method.
*/
class ServiceBuilderTest11 {
		
		@Test
		public void shouldThrowExceptionIfApiIsNull() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret");
	