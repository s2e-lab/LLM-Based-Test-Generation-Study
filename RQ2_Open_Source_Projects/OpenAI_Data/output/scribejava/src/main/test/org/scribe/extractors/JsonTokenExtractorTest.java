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
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://example.com/callback\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndOtherStuff() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://example.com/callback\",\"other\":\"stuff\"}";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndOtherStuffAndNewLines() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://example.com/callback\",\"other\":\"stuff\"}\n\n";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndOtherStuffAndNewLinesAndTabs() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://example.com/callback\",\"other\":\"stuff\"}\n\t\n";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndOtherStuffAndNewLinesAndTabsAndCarriageReturns() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://example.com/callback\",\"other\":\"stuff\"}\r\n\t\r\n";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndOtherStuffAndNewLinesAndTabsAndCarriageReturnsAndSpaces() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://example.com/callback\",\"other\":\"stuff\"}\r\n \t\r\n";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndOtherStuffAndNewLinesAndTabsAndCarriageReturnsAndSpacesAndQuotes() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://example.com/callback\",\"other\":\"stuff\"}\r\n \"\t\r\n";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndOtherStuffAndNewLinesAndTabsAndCarriageReturnsAndSpacesAndQuotesAndColons() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://example.com/callback\",\"other\":\"stuff\"}\r\n \":\t\r\n";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndOtherStuffAndNewLinesAndTabsAndCarriageReturnsAndSpacesAndQuotesAndColonsAndCommas() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://example.com/callback\",\"other\":\"stuff\"}\r\n \",:\t\r\n";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndOtherStuffAndNewLinesAndTabsAndCarriageReturnsAndSpacesAndQuotesAndColonsAndCommasAndBraces() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://example.com/callback\",\"other\":\"stuff\"}\r\n \",:{\t\r\n";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndOtherStuffAndNewLinesAndTabsAndCarriageReturnsAndSpacesAndQuotesAndColonsAndCommasAndBracesAndBrackets() {
				String response = "{\"access_token\":\"I0122HHJKLEU\",\"token_type\":\"bearer\",\"expires_in\":3600,\"callback\":\"http://example.com/callback\",\"other\":\"stuff\"}\r\n \",:{[\t\r\n";
				Token extracted = extractor.extract(response);
				assertEquals("I0122HHJKLEU", extracted.getToken());
		}
		
		@Test
		public void shouldExtractTokenFromJsonResponseWithExpiresParamAndCallbackAndOtherStuffAndNewLinesAndTabsAndCarriageReturnsAndSpacesAndQuotesAndColonsAndCommasAndBracesAndBracketsAndSlashes() {
				String response = "{\"access_token\":