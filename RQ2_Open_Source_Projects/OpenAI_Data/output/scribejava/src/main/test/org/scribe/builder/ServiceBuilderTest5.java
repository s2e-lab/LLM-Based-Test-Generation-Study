// ServiceBuilderTest5.java
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
* It contains ten unit test cases for the {@link ServiceBuilder#scope(String)} method.
*/
class ServiceBuilderTest5 {

		private static final String EMPTY_STRING = "";
		private static final String NULL_STRING = null;
		private static final String VALID_SCOPE = "http://www.google.com/m8/feeds/";
		private static final String INVALID_SCOPE = "";
		private static final String VALID_API_KEY = "valid_api_key";
		private static final String VALID_API_SECRET = "valid_api_secret";
		private static final String VALID_CALLBACK = "http://www.example.com/oauth_callback/";
		private static final String VALID_SIGNATURE_TYPE = "Header";
		private static final String VALID_DEBUG_STREAM = "System.out";
		private static final String VALID_API_CLASS = "org.scribe.builder.api.DefaultApi10a";
		private static final String VALID_API_INSTANCE = "org.scribe.builder.api.DefaultApi10a@1a2b3c4d";
		private static final String VALID_SERVICE = "org.scribe.oauth.OAuth10aServiceImpl@1a2b3c4d";
		
		@Test
		public void testScope_EmptyString_ThrowsException() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertThrows(IllegalArgumentException.class, () -> {
						serviceBuilder.scope(EMPTY_STRING);
				});
		}
		
		@Test
		public void testScope_NullString_ThrowsException() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertThrows(IllegalArgumentException.class, () -> {
						serviceBuilder.scope(NULL_STRING);
				});
		}
		
		@Test
		public void testScope_ValidScope_ReturnsServiceBuilder() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SCOPE, serviceBuilder.scope(VALID_SCOPE).scope);
		}
		
		@Test
		public void testScope_InvalidScope_ThrowsException() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertThrows(IllegalArgumentException.class, () -> {
						serviceBuilder.scope(INVALID_SCOPE);
				});
		}
		
		@Test
		public void testScope_ValidScope_ReturnsService() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SERVICE, serviceBuilder.provider(DefaultApi10a.class).apiKey(VALID_API_KEY).apiSecret(VALID_API_SECRET).callback(VALID_CALLBACK).signatureType(VALID_SIGNATURE_TYPE).debugStream(System.out).scope(VALID_SCOPE).build().toString());
		}
		
		@Test
		public void testScope_ValidScope_ReturnsService2() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SERVICE, serviceBuilder.provider(DefaultApi10a.class).apiKey(VALID_API_KEY).apiSecret(VALID_API_SECRET).callback(VALID_CALLBACK).signatureType(VALID_SIGNATURE_TYPE).debugStream(System.out).scope(VALID_SCOPE).build().toString());
		}
		
		@Test
		public void testScope_ValidScope_ReturnsService3() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SERVICE, serviceBuilder.provider(DefaultApi10a.class).apiKey(VALID_API_KEY).apiSecret(VALID_API_SECRET).callback(VALID_CALLBACK).signatureType(VALID_SIGNATURE_TYPE).debugStream(System.out).scope(VALID_SCOPE).build().toString());
		}
		
		@Test
		public void testScope_ValidScope_ReturnsService4() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SERVICE, serviceBuilder.provider(DefaultApi10a.class).apiKey(VALID_API_KEY).apiSecret(VALID_API_SECRET).callback(VALID_CALLBACK).signatureType(VALID_SIGNATURE_TYPE).debugStream(System.out).scope(VALID_SCOPE).build().toString());
		}
		
		@Test
		public void testScope_ValidScope_ReturnsService5() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SERVICE, serviceBuilder.provider(DefaultApi10a.class).apiKey(VALID_API_KEY).apiSecret(VALID_API_SECRET).callback(VALID_CALLBACK).signatureType(VALID_SIGNATURE_TYPE).debugStream(System.out).scope(VALID_SCOPE).build().toString());
		}
		
		@Test
		public void testScope_ValidScope_ReturnsService6() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SERVICE, serviceBuilder.provider(DefaultApi10a.class).apiKey(VALID_API_KEY).apiSecret(VALID_API_SECRET).callback(VALID_CALLBACK).signatureType(VALID_SIGNATURE_TYPE).debugStream(System.out).scope(VALID_SCOPE).build().toString());
		}
		
		@Test
		public void testScope_ValidScope_ReturnsService7() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SERVICE, serviceBuilder.provider(DefaultApi10a.class).apiKey(VALID_API_KEY).apiSecret(VALID_API_SECRET).callback(VALID_CALLBACK).signatureType(VALID_SIGNATURE_TYPE).debugStream(System.out).scope(VALID_SCOPE).build().toString());
		}
		
		@Test
		public void testScope_ValidScope_ReturnsService8() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SERVICE, serviceBuilder.provider(DefaultApi10a.class).apiKey(VALID_API_KEY).apiSecret(VALID_API_SECRET).callback(VALID_CALLBACK).signatureType(VALID_SIGNATURE_TYPE).debugStream(System.out).scope(VALID_SCOPE).build().toString());
		}
		
		@Test
		public void testScope_ValidScope_ReturnsService9() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SERVICE, serviceBuilder.provider(DefaultApi10a.class).apiKey(VALID_API_KEY).apiSecret(VALID_API_SECRET).callback(VALID_CALLBACK).signatureType(VALID_SIGNATURE_TYPE).debugStream(System.out).scope(VALID_SCOPE).build().toString());
		}
		
		@Test
		public void testScope_ValidScope_ReturnsService10() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SERVICE, serviceBuilder.provider(DefaultApi10a.class).apiKey(VALID_API_KEY).apiSecret(VALID_API_SECRET).callback(VALID_CALLBACK).signatureType(VALID_SIGNATURE_TYPE).debugStream(System.out).scope(VALID_SCOPE).build().toString());
		}
}

// ServiceBuilderTest6.java
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
* It contains ten unit test cases for the {@link ServiceBuilder#signatureType(SignatureType)} method.
*/
class ServiceBuilderTest6 {
		
		private static final String EMPTY_STRING = "";
		private static final String NULL_STRING = null;
		private static final String VALID_SCOPE = "http://www.google.com/m8/feeds/";
		private static final String INVALID_SCOPE = "";
		private static final String VALID_API_KEY = "valid_api_key";
		private static final String VALID_API_SECRET = "valid_api_secret";
		private static final String VALID_CALLBACK = "http://www.example.com/oauth_callback/";
		private static final String VALID_SIGNATURE_TYPE = "Header";
		private static final String VALID_DEBUG_STREAM = "System.out";
		private static final String VALID_API_CLASS = "org.scribe.builder.api.DefaultApi10a";
		private static final String VALID_API_INSTANCE = "org.scribe.builder.api.DefaultApi10a@1a2b3c4d";
		private static final String VALID_SERVICE = "org.scribe.oauth.OAuth10aServiceImpl@1a2b3c4d";
		
		@Test
		public void testSignatureType_EmptyString_ThrowsException() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertThrows(IllegalArgumentException.class, () -> {
						serviceBuilder.signatureType(EMPTY_STRING);
				});
		}
		
		@Test
		public void testSignatureType_NullString_ThrowsException() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertThrows(IllegalArgumentException.class, () -> {
						serviceBuilder.signatureType(NULL_STRING);
				});
		}
		
		@Test
		public void testSignatureType_ValidSignatureType_ReturnsServiceBuilder() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SIGNATURE_TYPE, serviceBuilder.signatureType(VALID_SIGNATURE_TYPE).signatureType.toString());
		}
		
		@Test
		public void testSignatureType_InvalidSignatureType_ThrowsException() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertThrows(IllegalArgumentException.class, () -> {
						serviceBuilder.signatureType(INVALID_SCOPE);
				});
		}
		
		@Test
		public void testSignatureType_ValidSignatureType_ReturnsService() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SERVICE, serviceBuilder.provider(DefaultApi10a.class).apiKey(VALID_API_KEY).apiSecret(VALID_API_SECRET).callback(VALID_CALLBACK).signatureType(VALID_SIGNATURE_TYPE).debugStream(System.out).scope(VALID_SCOPE).build().toString());
		}
		
		@Test
		public void testSignatureType_ValidSignatureType_ReturnsService2() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SERVICE, serviceBuilder.provider(DefaultApi10a.class).apiKey(VALID_API_KEY).apiSecret(VALID_API_SECRET).callback(VALID_CALLBACK).signatureType(VALID_SIGNATURE_TYPE).debugStream(System.out).scope(VALID_SCOPE).build().toString());
		}
		
		@Test
		public void testSignatureType_ValidSignatureType_ReturnsService3() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SERVICE, serviceBuilder.provider(DefaultApi10a.class).apiKey(VALID_API_KEY).apiSecret(VALID_API_SECRET).callback(VALID_CALLBACK).signatureType(VALID_SIGNATURE_TYPE).debugStream(System.out).scope(VALID_SCOPE).build().toString());
		}
		
		@Test
		public void testSignatureType_ValidSignatureType_ReturnsService4() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SERVICE, serviceBuilder.provider(DefaultApi10a.class).apiKey(VALID_API_KEY).apiSecret(VALID_API_SECRET).callback(VALID_CALLBACK).signatureType(VALID_SIGNATURE_TYPE).debugStream(System.out).scope(VALID_SCOPE).build().toString());
		}
		
		@Test
		public void testSignatureType_ValidSignatureType_ReturnsService5() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SERVICE, serviceBuilder.provider(DefaultApi10a.class).apiKey(VALID_API_KEY).apiSecret(VALID_API_SECRET).callback(VALID_CALLBACK).signatureType(VALID_SIGNATURE_TYPE).debugStream(System.out).scope(VALID_SCOPE).build().toString());
		}
		
		@Test
		public void testSignatureType_ValidSignatureType_ReturnsService6() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SERVICE, serviceBuilder.provider(DefaultApi10a.class).apiKey(VALID_API_KEY).apiSecret(VALID_API_SECRET).callback(VALID_CALLBACK).signatureType(VALID_SIGNATURE_TYPE).debugStream(System.out).scope(VALID_SCOPE).build().toString());
		}
		
		@Test
		public void testSignatureType_ValidSignatureType_ReturnsService7() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SERVICE, serviceBuilder.provider(DefaultApi10a.class).apiKey(VALID_API_KEY).apiSecret(VALID_API_SECRET).callback(VALID_CALLBACK).signatureType(VALID_SIGNATURE_TYPE).debugStream(System.out).scope(VALID_SCOPE).build().toString());
		}
		
		@Test
		public void testSignatureType_ValidSignatureType_ReturnsService8() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SERVICE, serviceBuilder.provider(DefaultApi10a.class).apiKey(VALID_API_KEY).apiSecret(VALID_API_SECRET).callback(VALID_CALLBACK).signatureType(VALID_SIGNATURE_TYPE).debugStream(System.out).scope(VALID_SCOPE).build().toString());
		}
		
		@Test
		public void testSignatureType_ValidSignatureType_ReturnsService9() {
				ServiceBuilder serviceBuilder = new ServiceBuilder();
				assertEquals(VALID_SERVICE, serviceBuilder.provider(DefaultApi10a.class).apiKey(VALID_API_KEY).apiSecret(VALID_API_SECRET).callback(VALID_CALLBACK).signatureType(VALID_SIGNATURE_TYPE).debugStream(System.out).scope(VALID_SCOPE).build().toString());
		}
		
		@Test
		public void testSignature