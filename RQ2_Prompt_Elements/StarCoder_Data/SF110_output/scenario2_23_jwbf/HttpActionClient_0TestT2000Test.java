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
    */
    @Test
    void testPerformAction() {
        // Arrange
        HttpActionClient httpActionClient = new HttpActionClient();
        httpActionClient.setPath("http://www.google.de");
        httpActionClient.setUserAgent("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
        httpActionClient.setCookie("test", "test");
        httpActionClient.setCookie("test2", "test2");
        httpActionClient.setCookie("test3", "test3");
        httpActionClient.setCookie("test4", "test4");
        httpActionClient.setCookie("test5", "test5");
        httpActionClient.setCookie("test6", "test6");
        httpActionClient.setCookie("test7", "test7");
        httpActionClient.setCookie("test8", "test8");
        httpActionClient.setCookie("test9", "test9");
        httpActionClient.setCookie("test10", "test10");
        httpActionClient.setCookie("test11", "test11");
        httpActionClient.setCookie("test12", "test12");
        httpActionClient.setCookie("test13", "test13");
        httpActionClient.setCookie("test14", "test14");
        httpActionClient.setCookie("test15", "test15");
        httpActionClient.setCookie("test16", "test16");
        httpActionClient.setCookie("test17", "test17");
        httpActionClient.setCookie("test18", "test18");
        httpActionClient.setCookie("test19", "test19");
        httpActionClient.setCookie("test20", "test20");
        httpActionClient.setCookie("test21", "test21");
        httpActionClient.setCookie("test22", "test22");
        httpActionClient.setCookie("test23", "test23");
        httpActionClient.setCookie("test24", "test24");
        httpActionClient.setCookie("test25", "test25");
        httpActionClient.setCookie("test26", "test26");
        httpActionClient.setCookie("test27", "test27");
        httpActionClient.setCookie("test28", "test28");
        httpActionClient.setCookie("test29", "test29");
        httpActionClient.setCookie("test30", "test30");
        httpActionClient.setCookie("test31", "test31");
        httpActionClient.setCookie("test32", "test32");
        httpActionClient.setCookie("test33", "test33");
        httpActionClient.setCookie("test34", "test34");
        httpActionClient.setCookie("test35", "test35");
        httpActionClient.setCookie("test36", "test36");
        httpActionClient.setCookie("test37", "test37");
        httpActionClient.setCookie("test38", "test38");
        httpActionClient.setCookie("test39", "test39");
        httpActionClient.setCookie("test40", "test40");
        httpActionClient.setCookie("test41", "test41");
        httpActionClient.setCookie("test42", "test42");
        httpActionClient.setCookie("test43", "test43");
        httpActionClient.setCookie("test44", "test44");
        httpActionClient.setCookie("test45", "test45");
        httpActionClient.setCookie("test46", "test46");
        httpActionClient.setCookie("test47", "test47");
        httpActionClient.setCookie("test48", "test48");
        httpActionClient.setCookie("test49", "test49");
        httpActionClient.setCookie("test50", "test50");
        httpActionClient.setCookie("test51", "test51");
        httpActionClient.setCookie("test52", "test52");
        httpActionClient.setCookie("test53", "test53");
        httpActionClient.setCookie("test54", "test54");
        httpActionClient.setCookie("test55", "test55");
        httpActionClient.setCookie("test56", "test56");
        httpActionClient.setCookie("test57", "test57");
        httpActionClient.setCookie("test58", "test58");
        httpActionClient.setCookie("test59", "test59");
        httpActionClient.setCookie("test60", "test60");
        httpActionClient.setCookie("test61", "test61");
        httpActionClient.setCookie("test62", "test62");
        httpActionClient.setCookie("test63", "test63");
        httpActionClient.setCookie("test64", "test64");
        httpActionClient.setCookie("test65", "test65");
        httpActionClient.setCookie("test66", "test66");
        httpActionClient.setCookie("test67", "test67");
        httpActionClient.setCookie("test68", "test68");
        httpActionClient.setCookie("test69", "test69");
        httpActionClient.setCookie("test70", "test70");
        httpActionClient.setCookie("test71", "test71");
        httpActionClient.setCookie("test72", "test72");
        httpActionClient.setCookie("test73", "test73");
        httpActionClient.setCookie("test74", "test74");
        httpActionClient.setCookie("test75", "test75");
        httpActionClient.setCookie("test76", "test76");
        httpActionClient.setCookie("test77", "test77");
        httpActionClient.setCookie("test78", "test78");
        httpActionClient.setCookie("test79", "test79");
        httpActionClient.setCookie("test80", "test80");
        httpActionClient.setCookie("test81", "test81");
        httpActionClient.setCookie("test82", "test82");
        httpActionClient.setCookie("test83", "test83");
        httpActionClient.setCookie("test84", "test84");
        httpActionClient.setCookie("test85", "test85");
        httpActionClient.setCookie("test86", "test86");
        httpActionClient.setCookie("test87", "test87");
        httpActionClient.setCookie("test88", "test88");
        httpActionClient.setCookie("test89", "test89");
        httpActionClient.setCookie("test90", "test90");
        httpActionClient.setCookie("test91", "test91");
        httpActionClient.setCookie("test92", "test92");
        httpActionClient.setCookie("test93", "test93");
        httpActionClient.setCookie("test94", "test94");
        httpActionClient.setCookie("test95", "test95");
        httpActionClient.setCookie("test96", "test96");
        httpActionClient.setCookie("test97", "test97");
        httpActionClient.setCookie("test98", "test98");
        httpActionClient.setCookie("test99", "test99");
        httpActionClient.setCookie("test100", "test100");
        httpActionClient.setCookie("test101", "test101");
        httpActionClient.setCookie("test102", "test102");
        httpActionClient.setCookie("test103", "test103");
        httpActionClient.setCookie("test104", "test104");
        httpActionClient.setCookie("test105", "test105");
        httpActionClient.setCookie("test106", "test106");
        httpActionClient.setCookie("test107", "test107");
        httpActionClient.setCookie("test108", "test108");
        httpActionClient.setCookie("test109", "test109");
        httpActionClient.setCookie("test110", "test110");
        httpActionClient.setCookie("test111", "