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

    private static final String URL = "http://localhost:8080/wiki/";

    private static final String PATH = "http://localhost:8080/wiki/index.php";

    private static final String PATH_WITH_SLASH = "http://localhost:8080/wiki/index.php/";

    private static final String PATH_WITH_SLASH_AND_PARAM = "http://localhost:8080/wiki/index.php?param=value";

    private static final String PATH_WITH_SLASH_AND_PARAM_AND_HASH = "http://localhost:8080/wiki/index.php?param=value#hash";

    private static final String PATH_WITH_SLASH_AND_HASH = "http://localhost:8080/wiki/index.php#hash";

    private static final String PATH_WITH_SLASH_AND_HASH_AND_PARAM = "http://localhost:8080/wiki/index.php#hash?param=value";

    private static final String PATH_WITH_SLASH_AND_HASH_AND_PARAM_AND_HASH = "http://localhost:8080/wiki/index.php#hash?param=value#hash";

    private static final String PATH_WITH_SLASH_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM = "http://localhost:8080/wiki/index.php#hash?param=value#hash?param=value";

    private static final String PATH_WITH_SLASH_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH = "http://localhost:8080/wiki/index.php#hash?param=value#hash?param=value#hash";

    private static final String PATH_WITH_SLASH_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM = "http://localhost:8080/wiki/index.php#hash?param=value#hash?param=value#hash?param=value";

    private static final String PATH_WITH_SLASH_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH = "http://localhost:8080/wiki/index.php#hash?param=value#hash?param=value#hash?param=value#hash";

    private static final String PATH_WITH_SLASH_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM = "http://localhost:8080/wiki/index.php#hash?param=value#hash?param=value#hash?param=value#hash?param=value";

    private static final String PATH_WITH_SLASH_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH = "http://localhost:8080/wiki/index.php#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash";

    private static final String PATH_WITH_SLASH_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM = "http://localhost:8080/wiki/index.php#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value";

    private static final String PATH_WITH_SLASH_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH = "http://localhost:8080/wiki/index.php#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash";

    private static final String PATH_WITH_SLASH_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM = "http://localhost:8080/wiki/index.php#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value";

    private static final String PATH_WITH_SLASH_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH = "http://localhost:8080/wiki/index.php#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash";

    private static final String PATH_WITH_SLASH_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM = "http://localhost:8080/wiki/index.php#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value";

    private static final String PATH_WITH_SLASH_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH = "http://localhost:8080/wiki/index.php#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash";

    private static final String PATH_WITH_SLASH_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM = "http://localhost:8080/wiki/index.php#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value";

    private static final String PATH_WITH_SLASH_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH = "http://localhost:8080/wiki/index.php#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash";

    private static final String PATH_WITH_SLASH_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM = "http://localhost:8080/wiki/index.php#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value";

    private static final String PATH_WITH_SLASH_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH_AND_PARAM_AND_HASH = "http://localhost:8080/wiki/index.php#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash?param=value#hash";