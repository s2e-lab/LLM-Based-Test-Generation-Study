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

    private static final String URL = "http://localhost:8080/wiki/index.php";

    private static final String USER = "test";

    private static final String PASS = "<PASSWORD>";

    private static final String CONTENT = "test";

    private static final String CONTENT_TYPE = "text/plain";

    private static final String CONTENT_TYPE_MULTIPART = "multipart/form-data";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY = "----WebKitFormBoundary7MA4YWxkTrZu0gW";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_2 = "----WebKitFormBoundary7MA4YWxkTrZu0gW2";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_3 = "----WebKitFormBoundary7MA4YWxkTrZu0gW3";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_4 = "----WebKitFormBoundary7MA4YWxkTrZu0gW4";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_5 = "----WebKitFormBoundary7MA4YWxkTrZu0gW5";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_6 = "----WebKitFormBoundary7MA4YWxkTrZu0gW6";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_7 = "----WebKitFormBoundary7MA4YWxkTrZu0gW7";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_8 = "----WebKitFormBoundary7MA4YWxkTrZu0gW8";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_9 = "----WebKitFormBoundary7MA4YWxkTrZu0gW9";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_10 = "----WebKitFormBoundary7MA4YWxkTrZu0gW10";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_11 = "----WebKitFormBoundary7MA4YWxkTrZu0gW11";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_12 = "----WebKitFormBoundary7MA4YWxkTrZu0gW12";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_13 = "----WebKitFormBoundary7MA4YWxkTrZu0gW13";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_14 = "----WebKitFormBoundary7MA4YWxkTrZu0gW14";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_15 = "----WebKitFormBoundary7MA4YWxkTrZu0gW15";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_16 = "----WebKitFormBoundary7MA4YWxkTrZu0gW16";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_17 = "----WebKitFormBoundary7MA4YWxkTrZu0gW17";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_18 = "----WebKitFormBoundary7MA4YWxkTrZu0gW18";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_19 = "----WebKitFormBoundary7MA4YWxkTrZu0gW19";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_20 = "----WebKitFormBoundary7MA4YWxkTrZu0gW20";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_21 = "----WebKitFormBoundary7MA4YWxkTrZu0gW21";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_22 = "----WebKitFormBoundary7MA4YWxkTrZu0gW22";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_23 = "----WebKitFormBoundary7MA4YWxkTrZu0gW23";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_24 = "----WebKitFormBoundary7MA4YWxkTrZu0gW24";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_25 = "----WebKitFormBoundary7MA4YWxkTrZu0gW25";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_26 = "----WebKitFormBoundary7MA4YWxkTrZu0gW26";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_27 = "----WebKitFormBoundary7MA4YWxkTrZu0gW27";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_28 = "----WebKitFormBoundary7MA4YWxkTrZu0gW28";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_29 = "----WebKitFormBoundary7MA4YWxkTrZu0gW29";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_30 = "----WebKitFormBoundary7MA4YWxkTrZu0gW30";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_31 = "----WebKitFormBoundary7MA4YWxkTrZu0gW31";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_32 = "----WebKitFormBoundary7MA4YWxkTrZu0gW32";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_33 = "----WebKitFormBoundary7MA4YWxkTrZu0gW33";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_34 = "----WebKitFormBoundary7MA4YWxkTrZu0gW34";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_35 = "----WebKitFormBoundary7MA4YWxkTrZu0gW35";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_36 = "----WebKitFormBoundary7MA4YWxkTrZu0gW36";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_37 = "----WebKitFormBoundary7MA4YWxkTrZu0gW37";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_38 = "----WebKitFormBoundary7MA4YWxkTrZu0gW38";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_39 = "----WebKitFormBoundary7MA4YWxkTrZu0gW39";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_40 = "----WebKitFormBoundary7MA4YWxkTrZu0gW40";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_41 = "----WebKitFormBoundary7MA4YWxkTrZu0gW41";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_42 = "----WebKitFormBoundary7MA4YWxkTrZu0gW42";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_43 = "----WebKitFormBoundary7MA4YWxkTrZu0gW43";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_44 = "----WebKitFormBoundary7MA4YWxkTrZu0gW44";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_45 = "----WebKitFormBoundary7MA4YWxkTrZu0gW45";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_46 = "----WebKitFormBoundary7MA4YWxkTrZu0gW46";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_47 = "----WebKitFormBoundary7MA4YWxkTrZu0gW47";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_48 = "----WebKitFormBoundary7MA4YWxkTrZu0gW48";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_49 = "----WebKitFormBoundary7MA4YWxkTrZu0gW49";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_50 = "----WebKitFormBoundary7MA4YWxkTrZu0gW50";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_51 = "----WebKitFormBoundary7MA4YWxkTrZu0gW51";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_52 = "----WebKitFormBoundary7MA4YWxkTrZu0gW52";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_53 = "----WebKitFormBoundary7MA4YWxkTrZu0gW53";

    private static final String CONTENT_TYPE_MULTIPART_BOUNDARY_54 = "----WebKitFormBoundary7MA4YW