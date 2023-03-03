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
		public void shouldThrowExceptionIfApiKeyIsBlank() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("  ").apiSecret("secret").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if api key is blank");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Invalid Api key", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfApiSecretIsBlank() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("  ").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if api secret is blank");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Invalid Api secret", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfApiKeyIsInvalid() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if api key is invalid");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Invalid Api key", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfApiSecretIsInvalid() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if api secret is invalid");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Invalid Api secret", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfApiKeyIsInvalid2() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if api key is invalid");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Invalid Api key", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfApiSecretIsInvalid2() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if api secret is invalid");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Invalid Api secret", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfApiKeyIsInvalid3() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if api key is invalid");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Invalid Api key", e.getMessage());
				}
		}
		
		@Test
		public void shouldThrowExceptionIfApiSecretIsInvalid3() {
				ServiceBuilder builder = new ServiceBuilder();
				builder.apiKey("key").apiSecret("secret").provider(TwitterApi.class);
				try {
						builder.build();
						fail("Should throw an exception if api secret is invalid");
				} catch (Exception e) {
						assertEquals(OAuthException.class, e.getClass());
						assertEquals("Invalid Api secret", e.getMessage());
				}
		}
		
}