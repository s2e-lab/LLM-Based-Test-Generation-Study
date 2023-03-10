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
		
		private static final String CALLBACK_URL_ENCODED_IS_NULL = "Callback url encoded is null";
		
		private static final String CALLBACK_URL_ENCODED_IS_EMPTY = "Callback url encoded is empty";
		
		private static final String CALLBACK_URL_ENCODED_IS_SPACE = "Callback url encoded is space";
		
		private static final String CALLBACK_URL_ENCODED_IS_OOB = "Callback url encoded is oob";
		
		private static final String CALLBACK_URL_ENCODED_IS_NOT_NULL = "Callback url encoded is not null";
		
		private static final String CALLBACK_URL_ENCODED_IS_NOT_EMPTY = "Callback url encoded is not empty";
		
		private static final String CALLBACK_URL_ENCODED_IS_NOT_SPACE = "Callback url encoded is not space";
		
		private static final String CALLBACK_URL_ENCODED_IS_NOT_OOB = "Callback url encoded is not oob";
		
		private static final String CALLBACK_IS_NULL = "Callback is null";
		
		private static final String CALLBACK_IS_EMPTY = "Callback is empty";
		
		private static final String CALLBACK_IS_SPACE = "Callback is space";
		
		private static final String CALLBACK_IS_OOB = "Callback is oob";
		
		private static final String CALLBACK_IS_NOT_NULL = "Callback is not null";
		
		private static final String CALLBACK_IS_NOT_EMPTY = "Callback is not empty";
		
		private static final String CALLBACK_IS_NOT_SPACE = "Callback is not space";
		
		private static final String CALLBACK_IS_NOT_OOB = "Callback is not oob";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED = "Callback is not url encoded";
		
		private static final String CALLBACK_IS_URL_ENCODED = "Callback is url encoded";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_OOB = "Callback is not url encoded oob";
		
		private static final String CALLBACK_IS_URL_ENCODED_OOB = "Callback is url encoded oob";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_EMPTY = "Callback is not url encoded empty";
		
		private static final String CALLBACK_IS_URL_ENCODED_EMPTY = "Callback is url encoded empty";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_NULL = "Callback is not url encoded null";
		
		private static final String CALLBACK_IS_URL_ENCODED_NULL = "Callback is url encoded null";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_SPACE = "Callback is not url encoded space";
		
		private static final String CALLBACK_IS_URL_ENCODED_SPACE = "Callback is url encoded space";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED = "Callback is not url encoded url encoded";
		
		private static final String CALLBACK_IS_URL_ENCODED_URL_ENCODED = "Callback is url encoded url encoded";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED_OOB = "Callback is not url encoded url encoded oob";
		
		private static final String CALLBACK_IS_URL_ENCODED_URL_ENCODED_OOB = "Callback is url encoded url encoded oob";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED_EMPTY = "Callback is not url encoded url encoded empty";
		
		private static final String CALLBACK_IS_URL_ENCODED_URL_ENCODED_EMPTY = "Callback is url encoded url encoded empty";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED_NULL = "Callback is not url encoded url encoded null";
		
		private static final String CALLBACK_IS_URL_ENCODED_URL_ENCODED_NULL = "Callback is url encoded url encoded null";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED_SPACE = "Callback is not url encoded url encoded space";
		
		private static final String CALLBACK_IS_URL_ENCODED_URL_ENCODED_SPACE = "Callback is url encoded url encoded space";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED_URL_ENCODED = "Callback is not url encoded url encoded url encoded";
		
		private static final String CALLBACK_IS_URL_ENCODED_URL_ENCODED_URL_ENCODED = "Callback is url encoded url encoded url encoded";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED_URL_ENCODED_OOB = "Callback is not url encoded url encoded url encoded oob";
		
		private static final String CALLBACK_IS_URL_ENCODED_URL_ENCODED_URL_ENCODED_OOB = "Callback is url encoded url encoded url encoded oob";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED_URL_ENCODED_EMPTY = "Callback is not url encoded url encoded url encoded empty";
		
		private static final String CALLBACK_IS_URL_ENCODED_URL_ENCODED_URL_ENCODED_EMPTY = "Callback is url encoded url encoded url encoded empty";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED_URL_ENCODED_NULL = "Callback is not url encoded url encoded url encoded null";
		
		private static final String CALLBACK_IS_URL_ENCODED_URL_ENCODED_URL_ENCODED_NULL = "Callback is url encoded url encoded url encoded null";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED_URL_ENCODED_SPACE = "Callback is not url encoded url encoded url encoded space";
		
		private static final String CALLBACK_IS_URL_ENCODED_URL_ENCODED_URL_ENCODED_SPACE = "Callback is url encoded url encoded url encoded space";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED = "Callback is not url encoded url encoded url encoded url encoded";
		
		private static final String CALLBACK_IS_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED = "Callback is url encoded url encoded url encoded url encoded";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_OOB = "Callback is not url encoded url encoded url encoded url encoded oob";
		
		private static final String CALLBACK_IS_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_OOB = "Callback is url encoded url encoded url encoded url encoded oob";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_EMPTY = "Callback is not url encoded url encoded url encoded url encoded empty";
		
		private static final String CALLBACK_IS_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_EMPTY = "Callback is url encoded url encoded url encoded url encoded empty";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_NULL = "Callback is not url encoded url encoded url encoded url encoded null";
		
		private static final String CALLBACK_IS_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_NULL = "Callback is url encoded url encoded url encoded url encoded null";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_SPACE = "Callback is not url encoded url encoded url encoded url encoded space";
		
		private static final String CALLBACK_IS_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_SPACE = "Callback is url encoded url encoded url encoded url encoded space";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED = "Callback is not url encoded url encoded url encoded url encoded url encoded";
		
		private static final String CALLBACK_IS_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED = "Callback is url encoded url encoded url encoded url encoded url encoded";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_OOB = "Callback is not url encoded url encoded url encoded url encoded url encoded oob";
		
		private static final String CALLBACK_IS_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_OOB = "Callback is url encoded url encoded url encoded url encoded url encoded oob";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_EMPTY = "Callback is not url encoded url encoded url encoded url encoded url encoded empty";
		
		private static final String CALLBACK_IS_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_EMPTY = "Callback is url encoded url encoded url encoded url encoded url encoded empty";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_NULL = "Callback is not url encoded url encoded url encoded url encoded url encoded null";
		
		private static final String CALLBACK_IS_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_NULL = "Callback is url encoded url encoded url encoded url encoded url encoded null";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_SPACE = "Callback is not url encoded url encoded url encoded url encoded url encoded space";
		
		private static final String CALLBACK_IS_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_SPACE = "Callback is url encoded url encoded url encoded url encoded url encoded space";
		
		private static final String CALLBACK_IS_NOT_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED_URL_ENCODED = "Callback is not url encoded url encoded url encoded url encoded url encoded url encoded";
		
		private static final String CALL