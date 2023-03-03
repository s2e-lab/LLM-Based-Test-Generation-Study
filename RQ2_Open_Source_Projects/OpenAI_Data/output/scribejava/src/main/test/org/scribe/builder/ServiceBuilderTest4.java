// ServiceBuilderTest4.java
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
* It contains ten unit test cases for the {@link ServiceBuilder#apiSecret(String)} method.
*/
class ServiceBuilderTest4 {

		private static final String INVALID_API_SECRET = "";
		private static final String VALID_API_SECRET = "apiSecret";
		private static final String VALID_API_KEY = "apiKey";
		private static final String VALID_CALLBACK = "oob";
		private static final String VALID_SCOPE = "scope";
		private static final String VALID_SIGNATURE_TYPE = "header";
		private static final String VALID_DEBUG_STREAM = "System.out";
		private static final String VALID_API_CLASS = "org.scribe.builder.api.DefaultApi10a";
		private static final String VALID_API_INSTANCE = "org.scribe.builder.api.DefaultApi10a@1";
		
		@Test
		public void testApiSecret_invalidApiSecret_throwsException() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertThrows(OAuthException.class, () -> {
						serviceBuilder.apiSecret(INVALID_API_SECRET);
				});
		}
		
		@Test
		public void testApiSecret_validApiSecret_returnsServiceBuilder() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(ServiceBuilder.class, serviceBuilder.apiSecret(VALID_API_SECRET).getClass());
		}
		
		@Test
		public void testApiSecret_validApiSecret_returnsServiceBuilderWithValidApiSecret() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_API_SECRET, serviceBuilder.apiSecret(VALID_API_SECRET).apiSecret);
		}
		
		@Test
		public void testApiSecret_validApiSecret_returnsServiceBuilderWithValidApiKey() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				serviceBuilder.apiKey(VALID_API_KEY);
				assertEquals(VALID_API_KEY, serviceBuilder.apiSecret(VALID_API_SECRET).apiKey);
		}
		
		@Test
		public void testApiSecret_validApiSecret_returnsServiceBuilderWithValidCallback() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				serviceBuilder.callback(VALID_CALLBACK);
				assertEquals(VALID_CALLBACK, serviceBuilder.apiSecret(VALID_API_SECRET).callback);
		}
		
		@Test
		public void testApiSecret_validApiSecret_returnsServiceBuilderWithValidScope() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				serviceBuilder.scope(VALID_SCOPE);
				assertEquals(VALID_SCOPE, serviceBuilder.apiSecret(VALID_API_SECRET).scope);
		}
		
		@Test
		public void testApiSecret_validApiSecret_returnsServiceBuilderWithValidSignatureType() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				serviceBuilder.signatureType(SignatureType.Header);
				assertEquals(SignatureType.Header, serviceBuilder.apiSecret(VALID_API_SECRET).signatureType);
		}
		
		@Test
		public void testApiSecret_validApiSecret_returnsServiceBuilderWithValidDebugStream() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				serviceBuilder.debugStream(System.out);
				assertEquals(System.out, serviceBuilder.apiSecret(VALID_API_SECRET).debugStream);
		}
		
		@Test
		public void testApiSecret_validApiSecret_returnsServiceBuilderWithValidApiClass() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				serviceBuilder.provider(DefaultApi10a.class);
				assertEquals(DefaultApi10a.class, serviceBuilder.apiSecret(VALID_API_SECRET).api.getClass());
		}
		
		@Test
		public void testApiSecret_validApiSecret_returnsServiceBuilderWithValidApiInstance() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				serviceBuilder.provider(new DefaultApi10a());
				assertEquals(DefaultApi10a.class, serviceBuilder.apiSecret(VALID_API_SECRET).api.getClass());
		}
}