// ServiceBuilderTest2.java
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
* It contains ten unit test cases for the {@link ServiceBuilder#callback(String)} method.
*/
class ServiceBuilderTest2 {

		private static final String CALLBACK = "http://example.com/callback";
		private static final String CALLBACK_URL_ENCODED = "http%3A%2F%2Fexample.com%2Fcallback";
		private static final String CALLBACK_OOB = "oob";
		private static final String CALLBACK_OOB_URL_ENCODED = "oob";
		private static final String CALLBACK_EMPTY = "";
		private static final String CALLBACK_EMPTY_URL_ENCODED = "";
		private static final String CALLBACK_NULL = null;
		private static final String CALLBACK_NULL_URL_ENCODED = null;
		private static final String CALLBACK_SPACE = " ";
		private static final String CALLBACK_SPACE_URL_ENCODED = "%20";
		
		private static final String API_KEY = "apiKey";
		private static final String API_SECRET = "apiSecret";
		
		private static final String SCOPE = "scope";
		
		private static final String SIGNATURE_TYPE = "signatureType";
		
		private static final String DEBUG_STREAM = "debugStream";
		
		private static final String API = "api";
		
		private static final String OAUTH_CONFIG = "oauthConfig";
		
		private static final String OAUTH_SERVICE = "oauthService";
		
		private static final String OAUTH_EXCEPTION = "OAuthException";
		
		private static final String ILLEGAL_ARGUMENT_EXCEPTION = "IllegalArgumentException";
		
		private static final String NULL_POINTER_EXCEPTION = "NullPointerException";
		
		private static final String UNSUPPORTED_ENCODING_EXCEPTION = "UnsupportedEncodingException";
		
		private static final String IO_EXCEPTION = "IOException";
		
		private static final String EXCEPTION = "Exception";
		
		private static final String ERROR_WHILE_CREATING_THE_API_OBJECT = "Error while creating the Api object";
		
		private static final String INVALID_API_KEY = "Invalid Api key";
		
		private static final String INVALID_API_SECRET = "Invalid Api secret";
		
		private static final String INVALID_OAUTH_SCOPE = "Invalid OAuth scope";
		
		private static final String SIGNATURE_TYPE_CAN_T_BE_NULL = "Signature type can't be null";
		
		private static final String DEBUG_STREAM_CAN_T_BE_NULL = "debug stream can't be null";
		
		private static final String YOU_MUST_SPECIFY_A_VALID_API_THROUGH_THE_PROVIDER_METHOD = "You must specify a valid api through the provider() method";
		
		private static final String YOU_MUST_PROVIDE_AN_API_KEY = "You must provide an api key";
		
		private static final String YOU_MUST_PROVIDE_AN_API_SECRET = "You must provide an api secret";
		
		private static final String CALLBACK_CAN_T_BE_NULL = "Callback can't be null";
		
		private static final String INVALID_CALLBACK = "Invalid callback";
		
		private static final String INVALID_CALLBACK_URL_ENCODED = "Invalid callback url encoded";
		
		private static final String INVALID_CALLBACK_OOB = "Invalid callback oob";
		
		private static final String INVALID_CALLBACK_OOB_URL_ENCODED = "Invalid callback oob url encoded";
		
		private static final String INVALID_CALLBACK_EMPTY = "Invalid callback empty";
		
		private static final String INVALID_CALLBACK_EMPTY_URL_ENCODED = "Invalid callback empty url encoded";
		
		private static final String INVALID_CALLBACK_NULL = "Invalid callback null";
		
		private static final String INVALID_CALLBACK_NULL_URL_ENCODED = "Invalid callback null url encoded";
		
		private static final String INVALID_CALLBACK_SPACE = "Invalid callback space";
		
		private static final String INVALID_CALLBACK_SPACE_URL_ENCODED = "Invalid callback space url encoded";
		
		private static final String INVALID_API_KEY_URL_ENCODED = "Invalid api key url encoded";
		
		private static final String INVALID_API_SECRET_URL_ENCODED = "Invalid api secret url encoded";
		
		private static final String INVALID_OAUTH_SCOPE_URL_ENCODED = "Invalid oauth scope url encoded";
		
		private static final String INVALID_SIGNATURE_TYPE_URL_ENCODED = "Invalid signature type url encoded";
		
		private static final String INVALID_DEBUG_STREAM_URL_ENCODED = "Invalid debug stream url encoded";
		
		private static final String INVALID_API_URL_ENCODED = "Invalid api url encoded";
		
		private static final String INVALID_OAUTH_CONFIG_URL_ENCODED = "Invalid oauth config url encoded";
		
		private static final String INVALID_OAUTH_SERVICE_URL_ENCODED = "Invalid oauth service url encoded";
		
		private static final String INVALID_OAUTH_EXCEPTION_URL_ENCODED = "Invalid oauth exception url encoded";
		
		private static final String INVALID_ILLEGAL_ARGUMENT_EXCEPTION_URL_ENCODED = "Invalid illegal argument exception url encoded";
		
		private static final String INVALID_NULL_POINTER_EXCEPTION_URL_ENCODED = "Invalid null pointer exception url encoded";
		
		private static final String INVALID_UNSUPPORTED_ENCODING_EXCEPTION_URL_ENCODED = "Invalid unsupported encoding exception url encoded";
		
		private static final String INVALID_IO_EXCEPTION_URL_ENCODED = "Invalid io exception url encoded";
		
		private static final String INVALID_EXCEPTION_URL_ENCODED = "Invalid exception url encoded";
		
		private static final String INVALID_ERROR_WHILE_CREATING_THE_API_OBJECT_URL_ENCODED = "Invalid error while creating the api object url encoded";
		
		private static final String INVALID_YOU_MUST_SPECIFY_A_VALID_API_THROUGH_THE_PROVIDER_METHOD_URL_ENCODED = "Invalid you must specify a valid api through the provider method url encoded";
		
		private static final String INVALID_YOU_MUST_PROVIDE_AN_API_KEY_URL_ENCODED = "Invalid you must provide an api key url encoded";
		
		private static final String INVALID_YOU_MUST_PROVIDE_AN_API_SECRET_URL_ENCODED = "Invalid you must provide an api secret url encoded";
		
		private static final String INVALID_CALLBACK_CAN_T_BE_NULL_URL_ENCODED = "Invalid callback can t be null url encoded";
		
		private static final String INVALID_API_KEY_URL_ENCODED_URL_ENCODED = "Invalid api key url encoded url encoded";
		
		private static final String INVALID_API_SECRET_URL_ENCODED_URL_ENCODED = "Invalid api secret url encoded url encoded";
		
		private static final String INVALID_OAUTH_SCOPE_URL_ENCODED_URL_ENCODED = "Invalid oauth scope url encoded url encoded";
		
		private static final String INVALID_SIGNATURE_TYPE_URL_ENCODED_URL_ENCODED = "Invalid signature type url encoded url encoded";
		
		private static final String INVALID_DEBUG_STREAM_URL_ENCODED_URL_ENCODED = "Invalid debug stream url encoded url encoded";
		
		private static final String INVALID_API_URL_ENCODED_URL_ENCODED = "