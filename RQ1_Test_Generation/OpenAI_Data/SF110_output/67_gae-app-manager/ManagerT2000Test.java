// ManagerTest.java
package net.sf.gaeappmanager.google.appengine;

import net.sf.gaeappmanager.google.LogonHelper;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Manager}.
* It contains ten unit test cases for the {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
*/
class ManagerTest {

	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		String authCookie = "authCookie";
		
		LogonHelper logonHelper = new LogonHelper();
		LogonHelper spyLogonHelper = spy(logonHelper);
		doReturn(authCookie).when(spyLogonHelper).loginToGoogleAppEngine(userid, password, source);
		
		Manager manager = new Manager();
		Manager spyManager = spy(manager);
		doReturn(spyLogonHelper).when(spyManager).getLogonHelper();
		
		DefaultHttpClient client = new DefaultHttpClient();
		DefaultHttpClient spyClient = spy(client);
		doReturn(spyClient).when(spyManager).getHttpClient();
		
		HttpGet get = new HttpGet("https://appengine.google.com/dashboard/quotadetails?&app_id=" + application);
		HttpGet spyGet = spy(get);
		doReturn(spyGet).when(spyManager).getHttpGet(authCookie, application);
		
		HttpResponse response = new HttpResponse() {
			@Override
			public StatusLine getStatusLine() {
				return null;
			}
			@Override
			public void setStatusLine(StatusLine statusline) {
			}
			@Override
			public void setStatusLine(ProtocolVersion ver, int code) {
			}
			@Override
			public void setStatusLine(ProtocolVersion ver, int code, String reason) {
			}
			@Override
			public void setStatusCode(int code) throws IllegalStateException {
			}
			@Override
			public void setReasonPhrase(String reason) throws IllegalStateException {
			}
			@Override
			public HttpEntity getEntity() {
				return null;
			}
			@Override
			public void setEntity(HttpEntity entity) {
			}
			@Override
			public Locale getLocale() {
				return null;
			}
			@Override
			public void setLocale(Locale loc) {
			}
			@Override
			public ProtocolVersion getProtocolVersion() {
				return null;
			}
			@Override
			public boolean containsHeader(String name) {
				return false;
			}
			@Override
			public Header[] getHeaders(String name) {
				return new Header[0];
			}
			@Override
			public Header getFirstHeader(String name) {
				return null;
			}
			@Override
			public Header getLastHeader(String name) {
				return null;
			}
			@Override
			public Header[] getAllHeaders() {
				return new Header[0];
			}
			@Override
			public void addHeader(Header header) {
			}
			@Override
			public void addHeader(String name, String value) {
			}
			@Override
			public void setHeader(Header header) {
			}
			@Override
			public void setHeader(String name, String value) {
			}
			@Override
			public void setHeaders(Header[] headers) {
			}
			@Override
			public void removeHeader(Header header) {
			}
			@Override
			public void removeHeaders(String name) {
			}
			@Override
			public HeaderIterator headerIterator() {
				return null;
			}
			@Override
			public HeaderIterator headerIterator(String name) {
				return null;
			}
			@Override
			public HttpParams getParams() {
				return null;
			}
			@Override
			public void setParams(HttpParams params) {
			}
		};
		HttpResponse spyResponse = spy(response);
		doReturn(spyResponse).when(spyClient).execute(spyGet);
		
		QuotaDetails quotaDetails = new QuotaDetails();
		QuotaDetailsParser quotaDetailsParser = new QuotaDetailsParser();
		QuotaDetailsParser spyQuotaDetailsParser = spy(quotaDetailsParser);
		doReturn(quotaDetails).when(spyQuotaDetailsParser).parse(spyResponse.getEntity().getContent());
		
		doReturn(spyQuotaDetailsParser).when(spyManager).getQuotaDetailsParser();
		
		QuotaDetails result = spyManager.retrieveAppQuotaDetails(userid, password, source, application);
		
		assertEquals(quotaDetails, result);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with null userid.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetailsWithNullUserid() throws Exception {
		String userid = null;
		String password = "password";
		String source = "source";
		String application = "application";
		
		Manager manager = new Manager();
		
		assertThrows(IllegalArgumentException.class, () -> {
			manager.retrieveAppQuotaDetails(userid, password, source, application);
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with empty userid.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetailsWithEmptyUserid() throws Exception {
		String userid = "";
		String password = "password";
		String source = "source";
		String application = "application";
		
		Manager manager = new Manager();
		
		assertThrows(IllegalArgumentException.class, () -> {
			manager.retrieveAppQuotaDetails(userid, password, source, application);
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with null password.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetailsWithNullPassword() throws Exception {
		String userid = "userid";
		String password = null;
		String source = "source";
		String application = "application";
		
		Manager manager = new Manager();
		
		assertThrows(IllegalArgumentException.class, () -> {
			manager.retrieveAppQuotaDetails(userid, password, source, application);
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with empty password.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetailsWithEmptyPassword() throws Exception {
	