// LinkedInApiTest.java
package org.scribe.builder.api;

import org.scribe.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinkedInApi}.
* It contains ten unit test cases for the {@link LinkedInApi#withScopes(String[])} method.
*/
class LinkedInApiTest {

		@Test
		void testWithScopes() {
				LinkedInApi api = LinkedInApi.withScopes("r_basicprofile", "r_emailaddress");
				assertEquals("https://api.linkedin.com/uas/oauth/requestToken?scope=r_basicprofile+r_emailaddress", api.getRequestTokenEndpoint());
		}
		
		@Test
		void testWithScopes_Empty() {
				LinkedInApi api = LinkedInApi.withScopes();
				assertEquals("https://api.linkedin.com/uas/oauth/requestToken", api.getRequestTokenEndpoint());
		}
		
		@Test
		void testWithScopes_Null() {
				LinkedInApi api = LinkedInApi.withScopes((String[]) null);
				assertEquals("https://api.linkedin.com/uas/oauth/requestToken", api.getRequestTokenEndpoint());
		}
		
		@Test
		void testWithScopes_NullElement() {
				LinkedInApi api = LinkedInApi.withScopes("r_basicprofile", null, "r_emailaddress");
				assertEquals("https://api.linkedin.com/uas/oauth/requestToken?scope=r_basicprofile+r_emailaddress", api.getRequestTokenEndpoint());
		}
		
		@Test
		void testWithScopes_EmptyElement() {
				LinkedInApi api = LinkedInApi.withScopes("r_basicprofile", "", "r_emailaddress");
				assertEquals("https://api.linkedin.com/uas/oauth/requestToken?scope=r_basicprofile+r_emailaddress", api.getRequestTokenEndpoint());
		}
		
		@Test
		void testWithScopes_WhitespaceElement() {
				LinkedInApi api = LinkedInApi.withScopes("r_basicprofile", " ", "r_emailaddress");
				assertEquals("https://api.linkedin.com/uas/oauth/requestToken?scope=r_basicprofile+r_emailaddress", api.getRequestTokenEndpoint());
		}
		
		@Test
		void testWithScopes_WhitespaceElement_Trimmed() {
				LinkedInApi api = LinkedInApi.withScopes("r_basicprofile", " r_emailaddress ");
				assertEquals("https://api.linkedin.com/uas/oauth/requestToken?scope=r_basicprofile+r_emailaddress", api.getRequestTokenEndpoint());
		}
		
		@Test
		void testWithScopes_WhitespaceElement_Trimmed_Empty() {
				LinkedInApi api = LinkedInApi.withScopes("r_basicprofile", " ", " ");
				assertEquals("https://api.linkedin.com/uas/oauth/requestToken?scope=r_basicprofile", api.getRequestTokenEndpoint());
		}
		
		@Test
		void testWithScopes_WhitespaceElement_Trimmed_Empty_Null() {
				LinkedInApi api = LinkedInApi.withScopes("r_basicprofile", " ", " ", null);
				assertEquals("https://api.linkedin.com/uas/oauth/requestToken?scope=r_basicprofile", api.getRequestTokenEndpoint());
		}
		
		@Test
		void testWithScopes_WhitespaceElement_Trimmed_Empty_Null_Empty() {
				LinkedInApi api = LinkedInApi.withScopes("r_basicprofile", " ", " ", null, "");
				assertEquals("https://api.linkedin.com/uas/oauth/requestToken?scope=r_basicprofile", api.getRequestTokenEndpoint());
		}
		
		@Test
		void testWithScopes_WhitespaceElement_Trimmed_Empty_Null_Empty_Whitespace() {
				LinkedInApi api = LinkedInApi.withScopes("r_basicprofile", " ", " ", null, "", " ");
				assertEquals("https://api.linkedin.com/uas/oauth/requestToken?scope=r_basicprofile", api.getRequestTokenEndpoint());
		}
}