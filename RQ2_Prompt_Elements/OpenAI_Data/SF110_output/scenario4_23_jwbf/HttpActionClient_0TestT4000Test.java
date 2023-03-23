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

		private static final String HOST_URL = "http://localhost/";
		private static final String PATH = "";
		private static final String URL = HOST_URL + PATH;
		private static final String USER_AGENT = "JWBF";
		private static final String USER_AGENT_KEY = "User-Agent";
		private static final String USER_AGENT_VALUE = USER_AGENT;
		private static final String ACCEPT_LANGUAGE_KEY = "Accept-Language";
		private static final String ACCEPT_LANGUAGE_VALUE = "en-us,en;q=0.5";
		private static final String ACCEPT_CHARSET_KEY = "Accept-Charset";
		private static final String ACCEPT_CHARSET_VALUE = "ISO-8859-1,utf-8;q=0.7,*;q=0.7";
		private static final String ACCEPT_ENCODING_KEY = "Accept-Encoding";
		private static final String ACCEPT_ENCODING_VALUE = "gzip,deflate";
		private static final String ACCEPT_KEY = "Accept";
		private static final String ACCEPT_VALUE = "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8";
		private static final String KEEP_ALIVE_KEY = "Keep-Alive";
		private static final String KEEP_ALIVE_VALUE = "300";
		private static final String CONNECTION_KEY = "Connection";
		private static final String CONNECTION_VALUE = "keep-alive";
		private static final String CONTENT_TYPE_KEY = "Content-Type";
		private static final String CONTENT_TYPE_VALUE = "application/x-www-form-urlencoded";
		private static final String CONTENT_LENGTH_KEY = "Content-Length";
		private static final String CONTENT_LENGTH_VALUE = "0";
		private static final String COOKIE_KEY = "Cookie";
		private static final String COOKIE_VALUE = "";
		private static final String HOST_KEY = "Host";
		private static final String HOST_VALUE = "localhost";
		private static final String REFERER_KEY = "Referer";
		private static final String REFERER_VALUE = "http://localhost/";
		private static final String MESSAGE = "message";
		private static final String MESSAGE_VALUE = "message";
		private static final String MESSAGE_KEY = "message";
		private static final String MESSAGE_VALUE_2 = "message2";
		private static final String MESSAGE_KEY_2 = "message2";
		private static final String MESSAGE_VALUE_3 = "message3";
		private static final String MESSAGE_KEY_3 = "message3";
		private static final String MESSAGE_VALUE_4 = "message4";
		private static final String MESSAGE_KEY_4 = "message4";
		private static final String MESSAGE_VALUE_5 = "message5";
		private static final String MESSAGE_KEY_5 = "message5";
		private static final String MESSAGE_VALUE_6 = "message6";
		private static final String MESSAGE_KEY_6 = "message6";
		private static final String MESSAGE_VALUE_7 = "message7";
		private static final String MESSAGE_KEY_7 = "message7";
		private static final String MESSAGE_VALUE_8 = "message8";
		private static final String MESSAGE_KEY_8 = "message8";
		private static final String MESSAGE_VALUE_9 = "message9";
		private static final String MESSAGE_KEY_9 = "message9";
		private static final String MESSAGE_VALUE_10 = "message10";
		private static final String MESSAGE_KEY_10 = "message10";
		private static final String MESSAGE_VALUE_11 = "message11";
		private static final String MESSAGE_KEY_11 = "message11";
		private static final String MESSAGE_VALUE_12 = "message12";
		private static final String MESSAGE_KEY_12 = "message12";
		private static final String MESSAGE_VALUE_13 = "message13";
		private static final String MESSAGE_KEY_13 = "message13";
		private static final String MESSAGE_VALUE_14 = "message14";
		private static final String MESSAGE_KEY_14 = "message14";
		private static final String MESSAGE_VALUE_15 = "message15";
		private static final String MESSAGE_KEY_15 = "message15";
		private static final String MESSAGE_VALUE_16 = "message16";
		private static final String MESSAGE_KEY_16 = "message16";
		private static final String MESSAGE_VALUE_17 = "message17";
		private static final String MESSAGE_KEY_17 = "message17";
		private static final String MESSAGE_VALUE_18 = "message18";
		private static final String MESSAGE_KEY_18 = "message18";
		private static final String MESSAGE_VALUE_19 = "message19";
		private static final String MESSAGE_KEY_19 = "message19";
		private static final String MESSAGE_VALUE_20 = "message20";
		private static final String MESSAGE_KEY_20 = "message20";
		private static final String MESSAGE_VALUE_21 = "message21";
		private static final String MESSAGE_KEY_21 = "message21";
		private static final String MESSAGE_VALUE_22 = "message22";
		private static final String MESSAGE_KEY_22 = "message22";
		private static final String MESSAGE_VALUE_23 = "message23";
		private static final String MESSAGE_KEY_23 = "message23";
		private static final String MESSAGE_VALUE_24 = "message24";
		private static final String MESSAGE_KEY_24 = "message24";
		private static final String MESSAGE_VALUE_25 = "message25";
		private static final String MESSAGE_KEY_25 = "message25";
		private static final String MESSAGE_VALUE_26 = "message26";
		private static final String MESSAGE_KEY_26 = "message26";
		private static final String MESSAGE_VALUE_27 = "message27";
		private static final String MESSAGE_KEY_27 = "message27";
		private static final String MESSAGE_VALUE_28 = "message28";
		private static final String MESSAGE_KEY_28 = "message28";
		private static final String MESSAGE_VALUE_29 = "message29";
		private static final String MESSAGE_KEY_29 = "message29";
		private static final String MESSAGE_VALUE_30 = "message30";
		private static final String MESSAGE_KEY_30 = "message30";
		private static final String MESSAGE_VALUE_31 = "message31";
		private static final String MESSAGE_KEY_31 = "message31";
		private static final String MESSAGE_VALUE_32 = "message32";
		private static final String MESSAGE_KEY_32 = "message32";
		private static final String MESSAGE_VALUE_33 = "message33";
		private static final String MESSAGE_KEY_33 = "message33";
		private static final String MESSAGE_VALUE_34 = "message34";
		private static final String MESSAGE_KEY_34 = "message34";
		private static final String MESSAGE_VALUE_35 = "message35";
		private static final String MESSAGE_KEY_35 = "message35";
		private static final String MESSAGE_VALUE_36 = "message36";
		private static final String MESSAGE_KEY_36 = "message36";
		private static final String MESSAGE_VALUE_37 = "message37";
		private static final String MESSAGE_KEY_37 = "message37";
		private static final String MESSAGE_VALUE_38 = "message38";
		private static final String MESSAGE_KEY_38 = "message38";
		private static final String MESSAGE_VALUE_39 = "message39";
		private static final String MESSAGE_KEY_39 = "message39";
		private static final String MESSAGE_VALUE_40 = "message40";
		private static final String MESSAGE_KEY_40 = "message40";
		private static final String MESSAGE_VALUE_41 = "message41";
		private static final String MESSAGE_KEY_41 = "message41";
		private static final String MESSAGE_VALUE_42 = "message42";
		private static final String MESSAGE_KEY_42 = "message42";
		private static final String MESSAGE_VALUE_43 = "message43";
		private static final String MESSAGE_KEY_43 = "message43";
		private static final String MESSAGE_VALUE_44 = "message44";
		private static final String MESSAGE_KEY_44 = "message44";
		private static final String MESSAGE_VALUE_45 = "message45";
		private static final String MESSAGE_KEY_45 = "message45";
		private static final String MESSAGE_VALUE_46 = "message46";
		private static final String MESSAGE_KEY_46 = "message46";
		private static final String MESSAGE_VALUE_47 = "message47";
		private static final String MESSAGE_KEY_47 = "message47";
		private static final String MESSAGE_VALUE_48 = "message48";
		private static final String MESSAGE_KEY_48 = "message48";
		private static final String MESSAGE_VALUE_49 = "message49";
		private static final String MESSAGE_KEY_49 = "message49";
		private static final String MESSAGE_VALUE_50 = "message50";
		private static final String MESSAGE_KEY_50 = "message50";
		private static final String MESSAGE_VALUE_51 = "message51";
		private static final String MESSAGE_KEY_51 = "message51";
		private static final String MESSAGE_VALUE_52 = "message52";
		private static final String MESSAGE_KEY_52 = "message52";
		private static final String MESSAGE_VALUE_53 = "message53";
		private static final String MESSAGE_KEY_53 = "message53";
		private static final String MESSAGE_VALUE_54 = "message54";
		private static final String MESSAGE_KEY_54 = "message54";
		private static final String MESSAGE_VALUE_55 = "message55";
		private static final String MESSAGE_KEY_55 = "message55";
		private static final String MESSAGE_VALUE_56 = "message56";
		private static final String MESSAGE_KEY_56 = "message56";
		private static final String MESSAGE_VALUE_57 = "message57";
		private static final String MESSAGE_KEY_57 = "message57";
		private static final String MESSAGE_VALUE_58 = "message58";
		private static final String MESSAGE_KEY_58 = "message58";
		private static final String MESSAGE_VALUE_59 = "message59";
		private static final String MESSAGE_KEY_59 = "message59";
		private static final String MESSAGE_VALUE_60 = "message60";
		private static final String MESSAGE_KEY_60 = "message60";
		private static final String MESSAGE_VALUE_61 = "message61";
		private static final String MESSAGE_KEY_61 = "message61";
		private static final String MESSAGE_VALUE_62 = "message62";
		private static final String MESSAGE_KEY_62 = "message62";
		private static final String MESSAGE_VALUE_63 = "message63";
		private static final String MESSAGE_KEY_63 = "message63";
		private static final String MESSAGE_VALUE_64 = "message64";
		private static final String MESSAGE_KEY_64 = "message64";
		private static final String MESSAGE_VALUE_65 = "message65";
		private static final String MESSAGE_KEY_65 = "message65";
		private static final String MESSAGE_VALUE_66 = "message66";
		private static final String MESSAGE_KEY_66 = "message66";
		private static final String MESSAGE_VALUE_67 = "message67";
		private static final String MESSAGE_KEY_67 = "message67";
		private static final String MESSAGE_VALUE_68 = "message68";
		private static final String MESSAGE_KEY_68 = "message68";
		private static final String MESSAGE_VALUE_69 = "message69";
		private static final String MESSAGE_KEY_69 = "message69";
		private static final String MESSAGE_VALUE_70 = "message70";
		private static final String MESSAGE_KEY_70 = "message70";
		private static final String MESSAGE_VALUE_71 = "message71";
		private static final String MESSAGE_KEY_71 = "message71";
		private static final String MESSAGE_VALUE_72 = "message72";
		private static final String MESSAGE_KEY_72 = "message72";
		private static final String MESSAGE_VALUE_73 = "message73";
		private static final String MESSAGE_KEY_73 = "message73";
		private static final String MESSAGE_VALUE_74 = "message74";
		private static final String MESSAGE_KEY_74 = "message74";
		private static final String MESSAGE_VALUE_75 = "message75";
		private static final String MESSAGE_KEY_75 = "message75";
		private static final String MESSAGE_VALUE_76 = "message76";
		private static final String MESSAGE_KEY_76 = "message76";
		private static final String MESSAGE_VALUE_77 = "message77";
		private static final String MESSAGE_KEY_77 = "message77";
		private static final String MESSAGE_VALUE_78 = "message78";
		private static final String MESSAGE_KEY_78 = "message78";
		private static final String MESSAGE_VALUE_79 = "message79";
		private static final String MESSAGE_KEY_79 = "message79";
		private static final String MESSAGE_VALUE_80 = "message80";
		private static final String MESSAGE_KEY_80 = "message80";
		private static final String MESSAGE_VALUE_81 = "message81";
		private static final String MESSAGE_KEY_81 = "message81";
		private static final String MESSAGE_VALUE_82 = "message82";
		private static final String MESSAGE_KEY_82 = "message82";
		private static final String MESSAGE_VALUE_83 = "message83";
		private static final String MESSAGE_KEY_83 = "message83";
		private static final String MESSAGE_VALUE_84 = "message84";
		private static final String MESSAGE_KEY_84 = "message84";
		private static final String MESSAGE_VALUE_85 = "message85";
		private static final String MESSAGE_KEY_85 = "message85";
		