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
	void shouldReturnTokenIfResponseContainsTokenWithExclamationMark() {
		Token token = extractor.extract("access_token=166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE!.");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE!.", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithPercentEncoding() {
		Token token = extractor.extract("access_token=166942940015970%7C2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159%7CRsXNdKrpxg8L6QNLWcs2TVTmcaE");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithPercentEncodingAndExclamationMark() {
		Token token = extractor.extract("access_token=166942940015970%7C2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159%7CRsXNdKrpxg8L6QNLWcs2TVTmcaE!.");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE!.", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithPercentEncodingAndExclamationMarkAndAmpersand() {
		Token token = extractor.extract("access_token=166942940015970%7C2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159%7CRsXNdKrpxg8L6QNLWcs2TVTmcaE!&expires=5108");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE!", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithPercentEncodingAndExclamationMarkAndAmpersandAndEquals() {
		Token token = extractor.extract("access_token=166942940015970%7C2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159%7CRsXNdKrpxg8L6QNLWcs2TVTmcaE!&expires=5108&other=value");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE!", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithPercentEncodingAndExclamationMarkAndAmpersandAndEqualsAndQuestionMark() {
		Token token = extractor.extract("access_token=166942940015970%7C2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159%7CRsXNdKrpxg8L6QNLWcs2TVTmcaE!&expires=5108&other=value?q=1");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE!", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithPercentEncodingAndExclamationMarkAndAmpersandAndEqualsAndQuestionMarkAndHash() {
		Token token = extractor.extract("access_token=166942940015970%7C2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159%7CRsXNdKrpxg8L6QNLWcs2TVTmcaE!&expires=5108&other=value?q=1#_=_");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE!", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithPercentEncodingAndExclamationMarkAndAmpersandAndEqualsAndQuestionMarkAndHashAndSlash() {
		Token token = extractor.extract("access_token=166942940015970%7C2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159%7CRsXNdKrpxg8L6QNLWcs2TVTmcaE!&expires=5108&other=value?q=1#_=_/");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE!", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithPercentEncodingAndExclamationMarkAndAmpersandAndEqualsAndQuestionMarkAndHashAndSlashAndColon() {
		Token token = extractor.extract("access_token=166942940015970%7C2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159%7CRsXNdKrpxg8L6QNLWcs2TVTmcaE!&expires=5108&other=value?q=1#_=_/:");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE!", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithPercentEncodingAndExclamationMarkAndAmpersandAndEqualsAndQuestionMarkAndHashAndSlashAndColonAndAt() {
		Token token = extractor.extract("access_token=166942940015970%7C2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159%7CRsXNdKrpxg8L6QNLWcs2TVTmcaE!&expires=5108&other=value?q=1#_=_/:@");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE!", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithPercentEncodingAndExclamationMarkAndAmpersandAndEqualsAndQuestionMarkAndHashAndSlashAndColonAndAtAndDollar() {
		Token token = extractor.extract("access_token=166942940015970%7C2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159%7CRsXNdKrpxg8L6QNLWcs2TVTmcaE!&expires=5108&other=value?q=1#_=_/:@$");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE!", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithPercentEncodingAndExclamationMarkAndAmpersandAndEqualsAndQuestionMarkAndHashAndSlashAndColonAndAtAndDollarAndComma() {
		Token token = extractor.extract("access_token=166942940015970%7C2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159%7CRsXNdKrpxg8L6QNLWcs2TVTmcaE!&expires=5108&other=value?q=1#_=_/:@$,;");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE!", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithPercentEncodingAndExclamationMarkAndAmpersandAndEqualsAndQuestionMarkAndHashAndSlashAndColonAndAtAndDollarAndCommaAndSemicolon() {
		Token token = extractor.extract("access_token=166942940015970%7C2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159%7CRsXNdKrpxg8L6QNLWcs2TVTmcaE!&expires=5108&other=value?q=1#_=_/:@$,;=");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE!", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithPercentEncodingAndExclamationMarkAndAmpersandAndEqualsAndQuestionMarkAndHashAndSlashAndColonAndAtAndDollarAndCommaAndSemicolonAndPlus() {
		Token token = extractor.extract("access_token=166942940015970%7C2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159%7CRsXNdKrpxg8L6QNLWcs2TVTmcaE!&expires=5108&other=value?q=1#_=_/:@$,;=+");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE!", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithPercentEncodingAndExclamationMarkAndAmpersandAndEqualsAndQuestionMarkAndHashAndSlashAndColonAndAtAndDollarAndCommaAndSemicolonAndPlusAndAsterisk() {
		Token token = extractor.extract("access_token=166942940015970%7C2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159%7CRsXNdKrpxg8L6QNLWcs2TVTmcaE!&expires=5108&other=value?q=1#_=_/:@$,;=+*");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE!", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithPercentEncodingAndExclamationMarkAndAmpersandAndEqualsAndQuestionMarkAndHashAndSlashAndColonAndAtAndDollarAndCommaAndSemicolonAndPlusAndAsteriskAndTilde() {
		Token token = extractor.extract("access_token=166942940015970%7C2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159%7CRsXNdKrpxg8L6QNLWcs2TVTmcaE!&expires=5108&other=value?q=1#_=_/:@$,;=+*~");
		assertEquals("166942940015970|2.2ltzWXYNDjCtg5ZDVVJJeg__.3600.1295816400-548517159|RsXNdKrpxg8L6QNLWcs2TVTmcaE!", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithPercentEncodingAndExclamationMarkAndAmpersandAndEqualsAndQuestionMarkAndHashAndSlashAndColonAndAtAndDollarAndCommaAndSemicolonAndPlusAnd