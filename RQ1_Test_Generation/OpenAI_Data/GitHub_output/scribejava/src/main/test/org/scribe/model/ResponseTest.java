// ResponseTest.java
package org.scribe.model;

import java.io.*;
import java.net.*;
import java.util.*;
import org.scribe.exceptions.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Response}.
* It contains ten unit test cases for the {@link Response#isSuccessful()} method.
*/
class ResponseTest {

		private static final String EMPTY = "";
		
		private static final String HEADER_NAME = "headerName";
		
		private static final String HEADER_VALUE = "headerValue";
		
		private static final String BODY = "body";
		
		private static final String MESSAGE = "message";
		
		private static final String URL = "http://example.com";
		
		private static final String URL_WITH_PORT = "http://example.com:8080";
		
		private static final String URL_WITH_PATH = "http://example.com/path";
		
		private static final String URL_WITH_PATH_AND_PORT = "http://example.com:8080/path";
		
		private static final String URL_WITH_QUERY = "http://example.com?query=value";
		
		private static final String URL_WITH_QUERY_AND_PORT = "http://example.com:8080?query=value";
		
		private static final String URL_WITH_QUERY_AND_PATH = "http://example.com/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PORT = "http://example.com:8080/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PORT_AND_FRAGMENT = "http://example.com:8080/path?query=value#fragment";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_FRAGMENT = "http://example.com/path?query=value#fragment";
		
		private static final String URL_WITH_QUERY_AND_FRAGMENT = "http://example.com?query=value#fragment";
		
		private static final String URL_WITH_PATH_AND_FRAGMENT = "http://example.com/path#fragment";
		
		private static final String URL_WITH_FRAGMENT = "http://example.com#fragment";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PORT_AND_FRAGMENT_AND_USER_INFO = "http://user:password@example.com:8080/path?query=value#fragment";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_FRAGMENT_AND_USER_INFO = "http://user:password@example.com/path?query=value#fragment";
		
		private static final String URL_WITH_QUERY_AND_FRAGMENT_AND_USER_INFO = "http://user:password@example.com?query=value#fragment";
		
		private static final String URL_WITH_PATH_AND_FRAGMENT_AND_USER_INFO = "http://user:password@example.com/path#fragment";
		
		private static final String URL_WITH_FRAGMENT_AND_USER_INFO = "http://user:password@example.com#fragment";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PORT_AND_USER_INFO = "http://user:password@example.com:8080/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_USER_INFO = "http://user:password@example.com/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_USER_INFO = "http://user:password@example.com?query=value";
		
		private static final String URL_WITH_PATH_AND_USER_INFO = "http://user:password@example.com/path";
		
		private static final String URL_WITH_USER_INFO = "http://user:password@example.com";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PORT_AND_USER_INFO_AND_AUTHORITY = "http://user:password@example.com:8080/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_USER_INFO_AND_AUTHORITY = "http://user:password@example.com/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_USER_INFO_AND_AUTHORITY = "http://user:password@example.com?query=value";
		
		private static final String URL_WITH_PATH_AND_USER_INFO_AND_AUTHORITY = "http://user:password@example.com/path";
		
		private static final String URL_WITH_USER_INFO_AND_AUTHORITY = "http://user:password@example.com";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PORT_AND_AUTHORITY = "http://example.com:8080/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_AUTHORITY = "http://example.com/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_AUTHORITY = "http://example.com?query=value";
		
		private static final String URL_WITH_PATH_AND_AUTHORITY = "http://example.com/path";
		
		private static final String URL_WITH_AUTHORITY = "http://example.com";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PORT_AND_AUTHORITY_AND_SCHEME = "http://example.com:8080/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_AUTHORITY_AND_SCHEME = "http://example.com/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_AUTHORITY_AND_SCHEME = "http://example.com?query=value";
		
		private static final String URL_WITH_PATH_AND_AUTHORITY_AND_SCHEME = "http://example.com/path";
		
		private static final String URL_WITH_AUTHORITY_AND_SCHEME = "http://example.com";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PORT_AND_SCHEME = "http://example.com:8080/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_SCHEME = "http://example.com/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_SCHEME = "http://example.com?query=value";
		
		private static final String URL_WITH_PATH_AND_SCHEME = "http://example.com/path";
		
		private static final String URL_WITH_SCHEME = "http://example.com";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PORT_AND_SCHEME_AND_HOST = "http://example.com:8080/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_SCHEME_AND_HOST = "http://example.com/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_SCHEME_AND_HOST = "http://example.com?query=value";
		
		private static final String URL_WITH_PATH_AND_SCHEME_AND_HOST = "http://example.com/path";
		
		private static final String URL_WITH_SCHEME_AND_HOST = "http://example.com";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PORT_AND_HOST = "http://example.com:8080/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_HOST = "http://example.com/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_HOST = "http://example.com?query=value";
		
		private static final String URL_WITH_PATH_AND_HOST = "http://example.com/path";
		
		private static final String URL_WITH_HOST = "http://example.com";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PORT_AND_HOST_AND_FILE = "http://example.com:8080/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_HOST_AND_FILE = "http://example.com/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_HOST_AND_FILE = "http://example.com?query=value";
		
		private static final String URL_WITH_PATH_AND_HOST_AND_FILE = "http://example.com/path";
		
		private static final String URL_WITH_HOST_AND_FILE = "http://example.com";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PORT_AND_FILE = "http://example.com:8080/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_FILE = "http://example.com/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_FILE = "http://example.com?query=value";
		
		private static final String URL_WITH_PATH_AND_FILE = "http://example.com/path";
		
		private static final String URL_WITH_FILE = "http://example.com";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PORT_AND_FILE_AND_PROTOCOL = "http://example.com:8080/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_FILE_AND_PROTOCOL = "http://example.com/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_FILE_AND_PROTOCOL = "http://example.com?query=value";
		
		private static final String URL_WITH_PATH_AND_FILE_AND_PROTOCOL = "http://example.com/path";
		
		private static final String URL_WITH_FILE_AND_PROTOCOL = "http://example.com";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PORT_AND_PROTOCOL = "http://example.com:8080/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PROTOCOL = "http://example.com/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_PROTOCOL = "http://example.com?query=value";
		
		private static final String URL_WITH_PATH_AND_PROTOCOL = "http://example.com/path";
		
		private static final String URL_WITH_PROTOCOL = "http://example.com";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PORT_AND_PROTOCOL_AND_AUTHORITY = "http://example.com:8080/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PROTOCOL_AND_AUTHORITY = "http://example.com/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_PROTOCOL_AND_AUTHORITY = "http://example.com?query=value";
		
		private static final String URL_WITH_PATH_AND_PROTOCOL_AND_AUTHORITY = "http://example.com/path";
		
		private static final String URL_WITH_PROTOCOL_AND_AUTHORITY = "http://example.com";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PORT_AND_AUTHORITY_AND_SCHEME = "http://example.com:8080/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_AUTHORITY_AND_SCHEME = "http://example.com/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_AUTHORITY_AND_SCHEME = "http://example.com?query=value";
		
		private static final String URL_WITH_PATH_AND_AUTHORITY_AND_SCHEME = "http://example.com/path";
		
		private static final String URL_WITH_AUTHORITY_AND_SCHEME = "http://example.com";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PORT_AND_SCHEME = "http://example.com:8080/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_SCHEME = "http://example.com/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_SCHEME = "http://example.com?query=value";
		
		private static final String URL_WITH_PATH_AND_SCHEME = "http://example.com/path";
		
		private static final String URL_WITH_SCHEME = "http://example.com";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PORT_AND_SCHEME_AND_HOST = "http://example.com:8080/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_SCHEME_AND_HOST = "http://example.com/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_SCHEME_AND_HOST = "http://example.com?query=value";
		
		private static final String URL_WITH_PATH_AND_SCHEME_AND_HOST = "http://example.com/path";
		
		private static final String URL_WITH_SCHEME_AND_HOST = "http://example.com";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_PORT_AND_HOST = "http://example.com:8080/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_PATH_AND_HOST = "http://example.com/path?query=value";
		
		private static final String URL_WITH_QUERY_AND_HOST = "http://example.com?query=value";
		
		private static final String URL_WITH_PATH_AND_HOST = "http://example.com/path";
		
		private static final String URL_WITH_HOST = "http://example.com";
		
		private static