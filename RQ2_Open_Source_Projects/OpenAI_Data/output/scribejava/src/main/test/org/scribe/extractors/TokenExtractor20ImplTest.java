// TokenExtractor20ImplTest.java
package org.scribe.extractors;

import java.util.regex.*;
import org.scribe.exceptions.*;
import org.scribe.model.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TokenExtractor20Impl}.
* It contains ten unit test cases for the {@link TokenExtractor20Impl#extract(String)} method.
*/
class TokenExtractor20ImplTest {

	private TokenExtractor20Impl extractor = new TokenExtractor20Impl();
	
	@Test
	void shouldThrowExceptionIfResponseIsNull() {
		assertThrows(OAuthException.class, () -> {
			extractor.extract(null);
		});
	}
	
	@Test
	void shouldThrowExceptionIfResponseIsEmptyString() {
		assertThrows(OAuthException.class, () -> {
			extractor.extract("");
		});
	}
	
	@Test
	void shouldThrowExceptionIfResponseIsBlank() {
		assertThrows(OAuthException.class, () -> {
			extractor.extract(" ");
		});
	}
	
	@Test
	void shouldThrowExceptionIfResponseDoesNotContainToken() {
		assertThrows(OAuthException.class, () -> {
			extractor.extract("{\"error\":\"invalid_request\"}");
		});
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsToken() {
		Token token = extractor.extract("access_token=166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithLeadingAndTrailingSpaces() {
		Token token = extractor.extract(" access_token=166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE ");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithLeadingSpaces() {
		Token token = extractor.extract(" access_token=166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithTrailingSpaces() {
		Token token = extractor.extract("access_token=166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE ");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithLeadingAndTrailingSpacesAndOtherParameters() {
		Token token = extractor.extract(" access_token=166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE &expires=5108");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithLeadingSpacesAndOtherParameters() {
		Token token = extractor.extract(" access_token=166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE&expires=5108");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithTrailingSpacesAndOtherParameters() {
		Token token = extractor.extract("access_token=166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE &expires=5108");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithOtherParameters() {
		Token token = extractor.extract("access_token=166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE&expires=5108");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE", token.getToken());
	}
}