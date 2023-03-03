// JsonTokenExtractorTest.java
package org.scribe.extractors;

import java.util.regex.*;
import org.scribe.exceptions.*;
import org.scribe.model.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JsonTokenExtractor}.
* It contains ten unit test cases for the {@link JsonTokenExtractor#extract(String)} method.
*/
class JsonTokenExtractorTest {

		private JsonTokenExtractor extractor = new JsonTokenExtractor();
		
		@Test
		public void shouldExtractTokenFromJsonResponse() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParam() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallback() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshToken() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScope() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndState() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParam() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra\":\"extra\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra\":\"extra\",\"extra2\":\"extra2\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra\":\"extra\",\"extra2\":\"extra2\",\"extra3\":\"extra3\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3AndExtraParam4() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra\":\"extra\",\"extra2\":\"extra2\",\"extra3\":\"extra3\",\"extra4\":\"extra4\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3AndExtraParam4AndExtraParam5() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra\":\"extra\",\"extra2\":\"extra2\",\"extra3\":\"extra3\",\"extra4\":\"extra4\",\"extra5\":\"extra5\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3AndExtraParam4AndExtraParam5AndExtraParam6() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra\":\"extra\",\"extra2\":\"extra2\",\"extra3\":\"extra3\",\"extra4\":\"extra4\",\"extra5\":\"extra5\",\"extra6\":\"extra6\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3AndExtraParam4AndExtraParam5AndExtraParam6AndExtraParam7() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra\":\"extra\",\"extra2\":\"extra2\",\"extra3\":\"extra3\",\"extra4\":\"extra4\",\"extra5\":\"extra5\",\"extra6\":\"extra6\",\"extra7\":\"extra7\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3AndExtraParam4AndExtraParam5AndExtraParam6AndExtraParam7AndExtraParam8() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra\":\"extra\",\"extra2\":\"extra2\",\"extra3\":\"extra3\",\"extra4\":\"extra4\",\"extra5\":\"extra5\",\"extra6\":\"extra6\",\"extra7\":\"extra7\",\"extra8\":\"extra8\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3AndExtraParam4AndExtraParam5AndExtraParam6AndExtraParam7AndExtraParam8AndExtraParam9() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra\":\"extra\",\"extra2\":\"extra2\",\"extra3\":\"extra3\",\"extra4\":\"extra4\",\"extra5\":\"extra5\",\"extra6\":\"extra6\",\"extra7\":\"extra7\",\"extra8\":\"extra8\",\"extra9\":\"extra9\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3AndExtraParam4AndExtraParam5AndExtraParam6AndExtraParam7AndExtraParam8AndExtraParam9AndExtraParam10() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra\":\"extra\",\"extra2\":\"extra2\",\"extra3\":\"extra3\",\"extra4\":\"extra4\",\"extra5\":\"extra5\",\"extra6\":\"extra6\",\"extra7\":\"extra7\",\"extra8\":\"extra8\",\"extra9\":\"extra9\",\"extra10\":\"extra10\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3AndExtraParam4AndExtraParam5AndExtraParam6AndExtraParam7AndExtraParam8AndExtraParam9AndExtraParam10AndExtraParam11() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra\":\"extra\",\"extra2\":\"extra2\",\"extra3\":\"extra3\",\"extra4\":\"extra4\",\"extra5\":\"extra5\",\"extra6\":\"extra6\",\"extra7\":\"extra7\",\"extra8\":\"extra8\",\"extra9\":\"extra9\",\"extra10\":\"extra10\",\"extra11\":\"extra11\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3AndExtraParam4AndExtraParam5AndExtraParam6AndExtraParam7AndExtraParam8AndExtraParam9AndExtraParam10AndExtraParam11AndExtraParam12() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra\":\"extra\",\"extra2\":\"extra2\",\"extra3\":\"extra3\",\"extra4\":\"extra4\",\"extra5\":\"extra5\",\"extra6\":\"extra6\",\"extra7\":\"extra7\",\"extra8\":\"extra8\",\"extra9\":\"extra9\",\"extra10\":\"extra10\",\"extra11\":\"extra11\",\"extra12\":\"extra12\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3AndExtraParam4AndExtraParam5AndExtraParam6AndExtraParam7AndExtraParam8AndExtraParam9AndExtraParam10AndExtraParam11AndExtraParam12AndExtraParam13() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra\":\"extra\",\"extra2\":\"extra2\",\"extra3\":\"extra3\",\"extra4\":\"extra4\",\"extra5\":\"extra5\",\"extra6\":\"extra6\",\"extra7\":\"extra7\",\"extra8\":\"extra8\",\"extra9\":\"extra9\",\"extra10\":\"extra10\",\"extra11\":\"extra11\",\"extra12\":\"extra12\",\"extra13\":\"