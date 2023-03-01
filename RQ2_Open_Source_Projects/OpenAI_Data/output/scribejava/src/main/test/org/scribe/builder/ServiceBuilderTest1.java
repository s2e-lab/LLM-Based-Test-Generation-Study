// ServiceBuilderTest1.java
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
* It contains ten unit test cases for the {@link ServiceBuilder#provider(Api)} method.
*/
class ServiceBuilderTest1 {

		private static final String API_KEY = "apiKey";
		private static final String API_SECRET = "apiSecret";
		private static final String CALLBACK = "callback";
		private static final String SCOPE = "scope";
		private static final SignatureType SIGNATURE_TYPE = SignatureType.Header;
		private static final OutputStream DEBUG_STREAM = System.out;
		
		private static final String API_KEY_2 = "apiKey2";
		private static final String API_SECRET_2 = "apiSecret2";
		private static final String CALLBACK_2 = "callback2";
		private static final String SCOPE_2 = "scope2";
		private static final SignatureType SIGNATURE_TYPE_2 = SignatureType.QueryString;
		private static final OutputStream DEBUG_STREAM_2 = System.err;
		
		private static final String API_KEY_3 = "apiKey3";
		private static final String API_SECRET_3 = "apiSecret3";
		private static final String CALLBACK_3 = "callback3";
		private static final String SCOPE_3 = "scope3";
		private static final SignatureType SIGNATURE_TYPE_3 = SignatureType.QueryString;
		private static final OutputStream DEBUG_STREAM_3 = System.err;
		
		private static final String API_KEY_4 = "apiKey4";
		private static final String API_SECRET_4 = "apiSecret4";
		private static final String CALLBACK_4 = "callback4";
		private static final String SCOPE_4 = "scope4";
		private static final SignatureType SIGNATURE_TYPE_4 = SignatureType.QueryString;
		private static final OutputStream DEBUG_STREAM_4 = System.err;
		
		private static final String API_KEY_5 = "apiKey5";
		private static final String API_SECRET_5 = "apiSecret5";
		private static final String CALLBACK_5 = "callback5";
		private static final String SCOPE_5 = "scope5";
		private static final SignatureType SIGNATURE_TYPE_5 = SignatureType.QueryString;
		private static final OutputStream DEBUG_STREAM_5 = System.err;
		
		private static final String API_KEY_6 = "apiKey6";
		private static final String API_SECRET_6 = "apiSecret6";
		private static final String CALLBACK_6 = "callback6";
		private static final String SCOPE_6 = "scope6";
		private static final SignatureType SIGNATURE_TYPE_6 = SignatureType.QueryString;
		private static final OutputStream DEBUG_STREAM_6 = System.err;
		
		private static final String API_KEY_7 = "apiKey7";
		private static final String API_SECRET_7 = "apiSecret7";
		private static final String CALLBACK_7 = "callback7";
		private static final String SCOPE_7 = "scope7";
		private static final SignatureType SIGNATURE_TYPE_7 = SignatureType.QueryString;
		private static final OutputStream DEBUG_STREAM_7 = System.err;
		
		private static final String API_KEY_8 = "apiKey8";
		private static final String API_SECRET_8 = "apiSecret8";
		private static final String CALLBACK_8 = "callback8";
		private static final String SCOPE_8 = "scope8";
		private static final SignatureType SIGNATURE_TYPE_8 = SignatureType.QueryString;
		private static final OutputStream DEBUG_STREAM_8 = System.err;
		
		private static final String API_KEY_9 = "apiKey9";
		private static final String API_SECRET_9 = "apiSecret9";
		private static final String CALLBACK_9 = "callback9";
		private static final String SCOPE_9 = "scope9";
		private static final SignatureType SIGNATURE_TYPE_9 = SignatureType.QueryString;
		private static final OutputStream DEBUG_STREAM_9 = System.err;
		
		private static final String API_KEY_10 = "apiKey10";
		private static final String API_SECRET_10 = "apiSecret10";
		private static final String CALLBACK_10 = "callback10";
		private static final String SCOPE_10 = "scope10";
		private static final SignatureType SIGNATURE_TYPE_10 = SignatureType.QueryString;
		private static final OutputStream DEBUG_STREAM_10 = System.err;
		
		private static final String API_KEY_11 = "apiKey11";
		private static final String API_SECRET_11 = "apiSecret11";
		private static final String CALLBACK_11 = "callback11";
		private static final String SCOPE_11 = "scope11";
		private static final SignatureType SIGNATURE_TYPE_11 = SignatureType.QueryString;
		private static final OutputStream DEBUG_STREAM_11 = System.err;
		
		private static final String API_KEY_12 = "apiKey12";
		private static final String API_SECRET_12 = "apiSecret12";
		private static final String CALLBACK_12 = "callback12";
		private static final String SCOPE_12 = "scope12";
		private static final SignatureType SIGNATURE_TYPE_12 = SignatureType.QueryString;
		private static final OutputStream DEBUG_STREAM_12 = System.err;
		
		private static final String API_KEY_13 = "apiKey13";
		private static final String API_SECRET_13 = "apiSecret13";
		private static final String CALLBACK_13 = "callback13";
		private static final String SCOPE_13 = "scope13";
		private static final SignatureType SIGNATURE_TYPE_13 = SignatureType.QueryString;
		private static final OutputStream DEBUG_STREAM_13 = System.err;
		
		private static final String API_KEY_14 = "apiKey14";
		private static final String API_SECRET_14 = "apiSecret14";
		private static final String CALLBACK_14 = "callback14";
		private static final String SCOPE_14 = "scope14";
		private static final SignatureType SIGNATURE_TYPE_14 = SignatureType.QueryString;
		private static final OutputStream DEBUG_STREAM_14 = System.err;
		
		private static final String API_KEY_15 = "apiKey15";
		private static final String API_SECRET_15 = "apiSecret15";
		private static final String CALLBACK_15 = "callback15";
		private static final String SCOPE_15 = "scope15";
		private static final SignatureType SIGNATURE_TYPE_15 = SignatureType.QueryString;
		private static final OutputStream DEBUG_STREAM_15 = System.err;
		
		private static final String API_KEY_16 = "apiKey16";
		private static final String API_SECRET_16 = "apiSecret16";
		private static final String CALLBACK_16 = "callback16";
		private static final String SCOPE_16 = "scope16";
		private static final SignatureType SIGNATURE_TYPE_16 = SignatureType.QueryString;
		private static final OutputStream DEBUG_STREAM_16 = System.err;
		
		private static final String API_KEY_17 = "apiKey17";
		private static final String API_SECRET_17 = "apiSecret17";
		private static final String CALLBACK_17 = "callback17";
		private static final String SCOPE_17 = "scope17";
		private static final SignatureType SIGNATURE_TYPE_17 = SignatureType.QueryString;
		private static final OutputStream DEBUG_STREAM_17 = System.err;
		
		private static final String API_KEY_18 = "apiKey18";
		private static final String API_SECRET_18 = "apiSecret18";
		private static final String CALLBACK_18 = "callback18";
		private static final String SCOPE_18 = "scope18";
		private static final SignatureType SIGNATURE_TYPE_18 = SignatureType.QueryString;
		private static final OutputStream DEBUG_STREAM_18 = System.err;
		
		private static final String API_KEY_19 = "apiKey19";
		private static final String API_SECRET_19 = "apiSecret19";
		private static final String CALLBACK_19 =