// HttpActionClient_1Test.java
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
* It contains ten unit test cases for the {@link HttpActionClient#get(Get)} method.
*/
class HttpActionClient_1Test {

    private static final String URL = "http://localhost:8080/wiki/";
    private static final String URL_2 = "http://localhost:8080/wiki/index.php";
    private static final String URL_3 = "http://localhost:8080/wiki/index.php?title=Main_Page";
    private static final String URL_4 = "http://localhost:8080/wiki/index.php?title=Main_Page&action=edit";
    private static final String URL_5 = "http://localhost:8080/wiki/index.php?title=Main_Page&action=edit&section=new";
    private static final String URL_6 = "http://localhost:8080/wiki/index.php?title=Main_Page&action=edit&section=new&oldid=123";
    private static final String URL_7 = "http://localhost:8080/wiki/index.php?title=Main_Page&action=edit&section=new&oldid=123&preload=Template%3AStub";
    private static final String URL_8 = "http://localhost:8080/wiki/index.php?title=Main_Page&action=edit&section=new&oldid=123&preload=Template%3AStub&preloadparams%5B%5D=123&preloadparams%5B%5D=456";
    private static final String URL_9 = "http://localhost:8080/wiki/index.php?title=Main_Page&action=edit&section=new&oldid=123&preload=Template%3AStub&preloadparams%5B%5D=123&preloadparams%5B%5D=456&preloadparams%5B%5D=789";
    private static final String URL_10 = "http://localhost:8080/wiki/index.php?title=Main_Page&action=edit&section=new&oldid=123&preload=Template%3AStub&preloadparams%5B%5D=123&preloadparams%5B%5D=456&preloadparams%5B%5D=789&preloadparams%5B%5D=101112";
    private static final String URL_11 = "http://localhost:8080/wiki/index.php?title=Main_Page&action=edit&section=new&oldid=123&preload=Template%3AStub&preloadparams%5B%5D=123&preloadparams%5B%5D=456&preloadparams%5B%5D=789&preloadparams%5B%5D=101112&preloadparams%5B%5D=131415";
    private static final String URL_12 = "http://localhost:8080/wiki/index.php?title=Main_Page&action=edit&section=new&oldid=123&preload=Template%3AStub&preloadparams%5B%5D=123&preloadparams%5B%5D=456&preloadparams%5B%5D=789&preloadparams%5B%5D=101112&preloadparams%5B%5D=131415&preloadparams%5B%5D=161718";
    private static final String URL_13 = "http://localhost:8080/wiki/index.php?title=Main_Page&action=edit&section=new&oldid=123&preload=Template%3AStub&preloadparams%5B%5D=123&preloadparams%5B%5D=456&preloadparams%5B%5D=789&preloadparams%5B%5D=101112&preloadparams%5B%5D=131415&preloadparams%5B%5D=161718&preloadparams%5B%5D=192021";
    private static final String URL_14 = "http://localhost:8080/wiki/index.php?title=Main_Page&action=edit&section=new&oldid=123&preload=Template%3AStub&preloadparams%5B%5D=123&preloadparams%5B%5D=456&preloadparams%5B%5D=789&preloadparams%5B%5D=101112&preloadparams%5B%5D=131415&preloadparams%5B%5D=161718&preloadparams%5B%5D=192021&preloadparams%5B%5D=222324";
    private static final String URL_15 = "http://localhost:8080/wiki/index.php?title=Main_Page&action=edit&section=new&oldid=123&preload=Template%3AStub&preloadparams%5B%5D=123&preloadparams%5B%5D=456&preloadparams%5B%5D=789&preloadparams%5B%5D=101112&preloadparams%5B%5D=131415&preloadparams%5B%5D=161718&preloadparams%5B%5D=192021&preloadparams%5B%5D=222324&preloadparams%5B%5D=252627";
    private static final String URL_16 = "http://localhost:8080/wiki/index.php?title=Main_Page&action=edit&section=new&oldid=123&preload=Template%3AStub&preloadparams%5B%5D=123&preloadparams%5B%5D=456&preloadparams%5B%5D=789&preloadparams%5B%5D=101112&preloadparams%5B%5D=131415&preloadparams%5B%5D=161718&preloadparams%5B%5D=192021&preloadparams%5B%5D=222324&preloadparams%5B%5D=252627&preloadparams%5B%5D=282930";
    private static final String URL_17 = "http://localhost:8080/wiki/index.php?title=Main_Page&action=edit&section=new&oldid=123&preload=Template%3AStub&preloadparams%5B%5D=123&preloadparams%5B%5D=456&preloadparams%5B%5D=789&preloadparams%5B%5D=101112&preloadparams%5B%5D=131415&preloadparams%5B%5D=161718&preloadparams%5B%5D=192021&preloadparams%5B%5D=222324&preloadparams%5B%5D=252627&preloadparams%5B%5D=282930&preloadparams%5B%5D=313233";
    private static final String URL_18 = "http://localhost:8080/wiki/index.php?title=Main_Page&action=edit&section=new&oldid=123&preload=Template%3AStub&preloadparams%5B%5D=123&preloadparams%5B%5D=456&preloadparams%5B%5D=789&preloadparams%5B%5D=101112&preloadparams%5B%5D=131415&preloadparams%5B%5D=161718&preloadparams%5B%5D=192021&preloadparams%5B%5D=222324&preloadparams%5B%5D=252627&preloadparams%5B%5D=282930&preloadparams%5B%5D=313233&preloadparams%5B%5D=343536";
    private static final String URL_19 = "http