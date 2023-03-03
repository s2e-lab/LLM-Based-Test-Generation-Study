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

		private TokenExtractorImpl tokenExtractorImpl;
		
		public TokenExtractorImplTest() {
			tokenExtractorImpl = new TokenExtractorImpl();
		}
		
		@Test
		public void testExtract() {
			String response = "oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03";
			Token token = tokenExtractorImpl.extract(response);
			assertEquals("hh5s93j4hdidpola", token.getToken());
			assertEquals("hdhd0244k9j7ao03", token.getSecret());
			assertEquals(response, token.getRawResponse());
		}
		
		@Test
		public void testExtractWithEmptyResponse() {
			String response = "";
			assertThrows(OAuthException.class, () -> {
				tokenExtractorImpl.extract(response);
			});
		}
		
		@Test
		public void testExtractWithNullResponse() {
			String response = null;
			assertThrows(OAuthException.class, () -> {
				tokenExtractorImpl.extract(response);
			});
		}
		
		@Test
		public void testExtractWithResponseWithoutToken() {
			String response = "oauth_token_secret=hdhd0244k9j7ao03";
			assertThrows(OAuthException.class, () -> {
				tokenExtractorImpl.extract(response);
			});
		}
		
		@Test
		public void testExtractWithResponseWithoutSecret() {
			String response = "oauth_token=hh5s93j4hdidpola";
			assertThrows(OAuthException.class, () -> {
				tokenExtractorImpl.extract(response);
			});
		}
		
		@Test
		public void testExtractWithResponseWithEmptyToken() {
			String response = "oauth_token=&oauth_token_secret=hdhd0244k9j7ao03";
			assertThrows(OAuthException.class, () -> {
				tokenExtractorImpl.extract(response);
			});
		}
		
		@Test
		public void testExtractWithResponseWithEmptySecret() {
			String response = "oauth_token=hh5s93j4hdidpola&oauth_token_secret=";
			assertThrows(OAuthException.class, () -> {
				tokenExtractorImpl.extract(response);
			});
		}
		
		@Test
		public void testExtractWithResponseWithNullToken() {
			String response = "oauth_token=null&oauth_token_secret=hdhd0244k9j7ao03";
			assertThrows(OAuthException.class, () -> {
				tokenExtractorImpl.extract(response);
			});
		}
		
		@Test
		public void testExtractWithResponseWithNullSecret() {
			String response = "oauth_token=hh5s93j4hdidpola&oauth_token_secret=null";
			assertThrows(OAuthException.class, () -> {
				tokenExtractorImpl.extract(response);
			});
		}
		
		@Test
		public void testExtractWithResponseWithInvalidToken() {
			String response = "oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_token=hh5s93j4hdidpola";
			assertThrows(OAuthException.class, () -> {
				tokenExtractorImpl.extract(response);
			});
		}
		
		@Test
		public void testExtractWithResponseWithInvalidSecret() {
			String response = "oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_token_secret=hdhd0244k9j7ao03";
			assertThrows(OAuthException.class, () -> {
				tokenExtractorImpl.extract(response);
			});
		}
}

// TokenExtractorTest.java
package org.scribe.extractors;

import org.junit.jupiter.api.Test;
import org.scribe.model.*;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TokenExtractor}.
* It contains ten unit test cases for the {@link TokenExtractor#extract(String)} method.
*/
class TokenExtractorTest {
		
		private TokenExtractor tokenExtractor;
		
		public TokenExtractorTest() {
			tokenExtractor = new TokenExtractor() {
				public Token extract(String response) {
					return null;
				}
			};
		}
		
		@Test
		public void testExtract() {
			String response = "oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03";
			Token token = tokenExtractor.extract(response);
			assertNull(token);
		}
		
		@Test
		public void testExtractWithEmptyResponse() {
			String response = "";
			Token token = tokenExtractor.extract(response);
			assertNull(token);
		}
		
		@Test
		public void testExtractWithNullResponse() {
			String response = null;
			Token token = tokenExtractor.extract(response);
			assertNull(token);
		}
		
		@Test
		public void testExtractWithResponseWithoutToken() {
			String response = "oauth_token_secret=hdhd0244k9j7ao03";
			Token token = tokenExtractor.extract(response);
			assertNull(token);
		}
		
		@Test
		public void testExtractWithResponseWithoutSecret() {
			String response = "oauth_token=hh5s93j4hdidpola";
			Token token = tokenExtractor.extract(response);
			assertNull(token);
		}
		
		@Test
		public void testExtractWithResponseWithEmptyToken() {
			String response = "oauth_token=&oauth_token_secret=hdhd0244k9j7ao03";
			Token token = tokenExtractor.extract(response);
			assertNull(token);
		}
		
		@Test
		public void testExtractWithResponseWithEmptySecret() {
			String response = "oauth_token=hh5s93j4hdidpola&oauth_token_secret=";
			Token token = tokenExtractor.extract(response);
			assertNull(token);
		}
		
		@Test
		public void testExtractWithResponseWithNullToken() {
			String response = "oauth_token=null&oauth_token_secret=hdhd0244k9j7ao03";
			Token token = tokenExtractor.extract(response);
			assertNull(token);
		}
		
		@Test
		public void testExtractWithResponseWithNullSecret() {
			String response = "oauth_token=hh5s93j4hdidpola&oauth_token_secret=null";
			Token token = tokenExtractor.extract(response);
			assertNull(token);
		}
		
		@Test
		public void testExtractWithResponseWithInvalidToken() {
			String response = "oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_token=hh5s93j4hdidpola";
			Token token = tokenExtractor.extract(response);
			assertNull(token);
		}
		
		@Test
		public void testExtractWithResponseWithInvalidSecret() {
			String response = "oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_token_secret=hdhd0244k9j7ao03";
			Token token = tokenExtractor.extract(response);
			assertNull(token);
		}
}

// Token.java
package org.scribe.model;

import java.io.*;
import java.util.*;

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
     */
    public Token(String token, String secret) {
        this(token, secret, null);
    }

    public Token(String token, String secret, String rawResponse) {
        Preconditions.checkEmptyString(token, "Invalid token");
        Preconditions.checkEmptyString(secret, "Invalid secret");
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
            return "oauth_token=" + token + "&oauth_token_secret=" + secret;
        } else {
            return rawResponse;
        }
    }

    @Override
    public String toString() {
        return String.format("Token[%s , %s]", token, secret);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Token that = (Token) o;

        if (secret != null ? !secret.equals(that.secret) : that.secret != null) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = token != null ? token.hashCode() : 0;
        result = 31 * result + (secret != null ? secret.hashCode() : 0);
        return result;
    }
}

// TokenTest.java
package org.scribe.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Token}.
* It contains ten unit test cases for the {@link Token#Token(String, String)} constructor.
*/
class TokenTest {
		
		public TokenTest() {
		}
		
		@Test
		public void testToken() {
			Token token = new Token("hh5s93j4hdidpola", "hdhd0244k9j7ao03");
			assertEquals("hh5s93j4hdidpola", token.getToken());
			assertEquals("hdhd0244k9j7ao03", token.getSecret());
			assertEquals("oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03", token.getRawResponse());
		}
		
		@Test
		public void testTokenWithEmptyToken() {
			assertThrows(IllegalArgumentException.class, () -> {
				new Token("", "hdhd0244k9j7ao03");
			});
		}
		
		@Test
		public void testTokenWithNullToken() {
			assertThrows(IllegalArgumentException.class, () -> {
				new Token(null, "hdhd0244k9j7ao03");
			});
		}
		
		@Test
		public void testTokenWithEmptySecret() {
			assertThrows(IllegalArgumentException.class, () -> {
				new Token("hh5s93j4hdidpola", "");
			});
		}
		
		@Test
		public void testTokenWithNullSecret() {
			assertThrows(IllegalArgumentException.class, () -> {
				new Token("hh5s93j4hdidpola", null);
			});
		}
		
		@Test
		public void testTokenWithEmptyTokenAndEmptySecret() {
			assertThrows(IllegalArgumentException.class, () -> {
				new Token("", "");
			});
		}
		
		@Test
		public void testTokenWithNullTokenAndNullSecret() {
			assertThrows(IllegalArgumentException.class, () -> {
				new Token(null, null);
			});
		}
		
		@Test
		public void testTokenWithEmptyTokenAndNullSecret() {
			assertThrows(IllegalArgumentException.class, () -> {
				new Token("", null);
			});
		}
		
		@Test
		public void testTokenWithNullTokenAndEmptySecret() {
			assertThrows(IllegalArgumentException.class, () -> {
				new Token(null, "");
			});
		}
		
		@Test
		public void testTokenWithNullTokenAndValidSecret() {
			assertThrows(IllegalArgumentException.class, () -> {
				new Token(null, "hdhd0244k9j7ao03");
			});
		}
		
		@Test
		public void testTokenWithValidTokenAndNullSecret() {
			assertThrows(IllegalArgumentException.class, () -> {
				new Token("hh5s93j4hdidpola", null);
			});
		}
}

// OAuthEncoder.java
package org.scribe.utils;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * Encodes a string into its URL safe form.
 *
 * @author Pablo Fernandez
 */
public class OAuthEncoder {

    /**
     * Encodes a string into its URL safe form using the UTF-8 charset.
     *
     * @param plain
     * @return encoded
     */
    public static String encode(String plain) {
        try {
            return URLEncoder.encode(plain, "UTF-8");
        } catch (UnsupportedEncodingException uee) {
            throw new RuntimeException("Unsupported encoding", uee);
        }
    }

    /**
     * Decodes a string from its URL safe form using the UTF-8 charset.
     *
     * @param encoded
     * @return decoded
     */
    public static String decode(String encoded) {
        try {
            return URLDecoder.decode(encoded, "UTF-8");
        } catch