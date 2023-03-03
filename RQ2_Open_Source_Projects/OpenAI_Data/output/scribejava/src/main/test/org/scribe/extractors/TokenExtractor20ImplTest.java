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

// TokenExtractorImpl.java
package org.scribe.extractors;

import java.util.regex.*;
import org.scribe.exceptions.*;
import org.scribe.model.*;
import org.scribe.utils.*;

/**
 * Default implementation of {@AccessTokenExtractor}. Conforms to OAuth 1.0a
 */
public class TokenExtractorImpl implements AccessTokenExtractor {

    private static final String TOKEN_REGEX = "oauth_token=([^&]+)";

    private static final String SECRET_REGEX = "oauth_token_secret=([^&]*)";

    /**
     * {@inheritDoc}
     */
    public Token extract(String response) {
        Preconditions.checkEmptyString(response, "Response body is incorrect. Can't extract a token from an empty string");
        String token = extract(response, TOKEN_REGEX);
        String secret = extract(response, SECRET_REGEX);
        return new Token(token, secret, response);
    }

    private String extract(String response, String patten) {
        Pattern pattern = Pattern.compile(patten);
        Matcher matcher = pattern.matcher(response);
        if (matcher.find() && matcher.groupCount() >= 1) {
            return OAuthEncoder.decode(matcher.group(1));
        } else {
            throw new OAuthException("Response body is incorrect. Can't extract token and secret from this: '" + response + "'", null);
        }
    }
}

// TokenExtractorImplTest.java
package org.scribe.extractors;

import java.util.regex.*;
import org.scribe.exceptions.*;
import org.scribe.model.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TokenExtractorImpl}.
* It contains ten unit test cases for the {@link TokenExtractorImpl#extract(String)} method.
*/
class TokenExtractorImplTest {
		
	private TokenExtractorImpl extractor = new TokenExtractorImpl();
	
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
			extractor.extract("oauth_problem=signature_invalid");
		});
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsToken() {
		Token token = extractor.extract("oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03");
		assertEquals("hh5s93j4hdidpola", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithLeadingAndTrailingSpaces() {
		Token token = extractor.extract(" oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03 ");
		assertEquals("hh5s93j4hdidpola", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithLeadingSpaces() {
		Token token = extractor.extract(" oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03");
		assertEquals("hh5s93j4hdidpola", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithTrailingSpaces() {
		Token token = extractor.extract("oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03 ");
		assertEquals("hh5s93j4hdidpola", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithLeadingAndTrailingSpacesAndOtherParameters() {
		Token token = extractor.extract(" oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03 &oauth_callback_confirmed=true");
		assertEquals("hh5s93j4hdidpola", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithLeadingSpacesAndOtherParameters() {
		Token token = extractor.extract(" oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_callback_confirmed=true");
		assertEquals("hh5s93j4hdidpola", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithTrailingSpacesAndOtherParameters() {
		Token token = extractor.extract("oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03 &oauth_callback_confirmed=true");
		assertEquals("hh5s93j4hdidpola", token.getToken());
	}
	
	@Test
	void shouldReturnTokenIfResponseContainsTokenWithOtherParameters() {
		Token token = extractor.extract("oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_callback_confirmed=true");
		assertEquals("hh5s93j4hdidpola", token.getToken());
	}
}

// Token.java
package org.scribe.model;

import java.io.*;

/**
 * Represents an OAuth token (either request or access token) and its secret
 *
 * @author Pablo Fernandez
 */
public class Token implements Serializable {

    private static final long serialVersionUID = 715000866082812683L;

    private final String token;

    private final String secret;

    private final String rawResponse;

    /**
     * Default constructor
     *
     * @param token token value. Can't be null.
     * @param secret token secret. Can't be null.
     * @param rawResponse raw response from the OAuth provider. Can't be null.
     */
    public Token(String token, String secret, String rawResponse) {
        Preconditions.checkNotNull(token, "token can't be null");
        Preconditions.checkNotNull(secret, "secret can't be null");
        Preconditions.checkNotNull(rawResponse, "rawResponse can't be null");
        this.token = token;
        this.secret = secret;
        this.rawResponse = rawResponse;
    }

    public String getToken() {
        return token;
    }

    public String getSecret() {
        return secret;
    }

    public String getRawResponse() {
        if (rawResponse == null) {
            throw new IllegalStateException("This token object was not constructed by scribe and does not have a rawResponse");
        }
        return rawResponse;
    }

    @Override
    public String toString() {
        return String.format("Token[%s , %s]", token, secret);
    }
}

// TokenTest.java
package org.scribe.model;

import org.scribe.exceptions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Token}.
* It contains ten unit test cases for the {@link Token#Token(String, String, String)} constructor.
*/
class TokenTest {
	
	@Test
	void shouldThrowExceptionIfTokenIsNull() {
		assertThrows(OAuthException.class, () -> {
			new Token(null, "secret", "rawResponse");
		});
	}
	
	@Test
	void shouldThrowExceptionIfTokenIsEmptyString() {
		assertThrows(OAuthException.class, () -> {
			new Token("", "secret", "rawResponse");
		});
	}
	
	@Test
	void shouldThrowExceptionIfTokenIsBlank() {
		assertThrows(OAuthException.class, () -> {
			new Token(" ", "secret", "rawResponse");
		});
	}
	
	@Test
	void shouldThrowExceptionIfSecretIsNull() {
		assertThrows(OAuthException.class, () -> {
			new Token("token", null, "rawResponse");