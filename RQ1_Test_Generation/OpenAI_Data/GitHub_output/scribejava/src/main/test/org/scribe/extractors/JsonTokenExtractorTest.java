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
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra_param\":\"extra_param\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra_param\":\"extra_param\",\"extra_param2\":\"extra_param2\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra_param\":\"extra_param\",\"extra_param2\":\"extra_param2\",\"extra_param3\":\"extra_param3\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3AndExtraParam4() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra_param\":\"extra_param\",\"extra_param2\":\"extra_param2\",\"extra_param3\":\"extra_param3\",\"extra_param4\":\"extra_param4\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3AndExtraParam4AndExtraParam5() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra_param\":\"extra_param\",\"extra_param2\":\"extra_param2\",\"extra_param3\":\"extra_param3\",\"extra_param4\":\"extra_param4\",\"extra_param5\":\"extra_param5\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3AndExtraParam4AndExtraParam5AndExtraParam6() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra_param\":\"extra_param\",\"extra_param2\":\"extra_param2\",\"extra_param3\":\"extra_param3\",\"extra_param4\":\"extra_param4\",\"extra_param5\":\"extra_param5\",\"extra_param6\":\"extra_param6\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3AndExtraParam4AndExtraParam5AndExtraParam6AndExtraParam7() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra_param\":\"extra_param\",\"extra_param2\":\"extra_param2\",\"extra_param3\":\"extra_param3\",\"extra_param4\":\"extra_param4\",\"extra_param5\":\"extra_param5\",\"extra_param6\":\"extra_param6\",\"extra_param7\":\"extra_param7\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3AndExtraParam4AndExtraParam5AndExtraParam6AndExtraParam7AndExtraParam8() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra_param\":\"extra_param\",\"extra_param2\":\"extra_param2\",\"extra_param3\":\"extra_param3\",\"extra_param4\":\"extra_param4\",\"extra_param5\":\"extra_param5\",\"extra_param6\":\"extra_param6\",\"extra_param7\":\"extra_param7\",\"extra_param8\":\"extra_param8\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3AndExtraParam4AndExtraParam5AndExtraParam6AndExtraParam7AndExtraParam8AndExtraParam9() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra_param\":\"extra_param\",\"extra_param2\":\"extra_param2\",\"extra_param3\":\"extra_param3\",\"extra_param4\":\"extra_param4\",\"extra_param5\":\"extra_param5\",\"extra_param6\":\"extra_param6\",\"extra_param7\":\"extra_param7\",\"extra_param8\":\"extra_param8\",\"extra_param9\":\"extra_param9\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3AndExtraParam4AndExtraParam5AndExtraParam6AndExtraParam7AndExtraParam8AndExtraParam9AndExtraParam10() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra_param\":\"extra_param\",\"extra_param2\":\"extra_param2\",\"extra_param3\":\"extra_param3\",\"extra_param4\":\"extra_param4\",\"extra_param5\":\"extra_param5\",\"extra_param6\":\"extra_param6\",\"extra_param7\":\"extra_param7\",\"extra_param8\":\"extra_param8\",\"extra_param9\":\"extra_param9\",\"extra_param10\":\"extra_param10\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3AndExtraParam4AndExtraParam5AndExtraParam6AndExtraParam7AndExtraParam8AndExtraParam9AndExtraParam10AndExtraParam11() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra_param\":\"extra_param\",\"extra_param2\":\"extra_param2\",\"extra_param3\":\"extra_param3\",\"extra_param4\":\"extra_param4\",\"extra_param5\":\"extra_param5\",\"extra_param6\":\"extra_param6\",\"extra_param7\":\"extra_param7\",\"extra_param8\":\"extra_param8\",\"extra_param9\":\"extra_param9\",\"extra_param10\":\"extra_param10\",\"extra_param11\":\"extra_param11\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndRefreshTokenAndScopeAndStateAndExtraParamAndExtraParam2AndExtraParam3AndExtraParam4AndExtraParam5AndExtraParam6AndExtraParam7AndExtraParam8AndExtraParam9AndExtraParam10AndExtraParam11AndExtraParam12() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://www.example.com/callback\",\"refresh_token\":\"I0122HHJKLEU\",\"scope\":\"read\",\"state\":\"state\",\"extra_param\":\"extra_param\",\"extra_param2\":\"extra_param2\",\"extra_param3\":\"extra_param3\",\"extra_param4\":\"extra_param4\",\"extra_param5\":\"extra_param5\",\"extra_param6\":\"extra_param6\",\"extra_param7\":\"extra_param7\",\"extra_param8\":\"extra_param8\",\"extra_param9\":\"extra_param9\",\"extra_param10\":\"extra_param10\",\"extra_param11\":\"extra_param11\",\"extra_param12\":\"extra_param12\"}";
	