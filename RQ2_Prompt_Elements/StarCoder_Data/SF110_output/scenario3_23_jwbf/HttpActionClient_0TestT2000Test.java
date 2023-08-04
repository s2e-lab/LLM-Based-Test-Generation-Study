// HttpActionClient_0Test.java
package net.sourceforge.jwbf.core.actions;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.JWBF;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.CookieException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpActionClient}.
* It contains ten unit test cases for the {@link HttpActionClient#performAction(ContentProcessable)} method.
*/
class HttpActionClient_0Test {

    /**
    * Test method for {@link HttpActionClient#performAction(ContentProcessable)}.
    * @throws ActionException on problems with http, cookies and io
    * @throws ProcessException on inner problems
    */
    @Test
    void testPerformAction() throws ActionException, ProcessException {
        // Arrange
        HttpActionClient testee = new HttpActionClient_0();
        HttpAction action = new HttpAction(new URL("http://www.google.de"));
        action.setUserAgent(JWBF.VERSION);
        action.setEncoding(Charset.forName("UTF-8"));
        action.setFollowRedirect(true);
        action.setCookie(new HashMap<String, String>());
        action.setPostData(new HashMap<String, String>());
        action.setPostFile(new HashMap<String, File>());
        action.setPostContentType(new HashMap<String, String>());
        action.setPostCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String>());
        action.setPostDataCharset(new HashMap<String, String