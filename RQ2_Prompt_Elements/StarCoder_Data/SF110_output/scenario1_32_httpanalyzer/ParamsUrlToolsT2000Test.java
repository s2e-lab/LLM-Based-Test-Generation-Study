// ParamsUrlToolsTest.java
package httpanalyzer;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParamsUrlTools}.
* It contains ten unit test cases for the {@link ParamsUrlTools#getPairParams(String)} method.
*/
class ParamsUrlToolsTest {

    @Test
    void test1() throws URISyntaxException {
        ParamsUrlTools paramsUrlTools = new ParamsUrlTools();
        String params = "param1=value1&param2=value2";
        List<NameValuePair> nvps = paramsUrlTools.getPairParams(params);
        assertEquals(2, nvps.size());
        assertEquals("param1", nvps.get(0).getName());
        assertEquals("value1", nvps.get(0).getValue());
        assertEquals("param2", nvps.get(1).getName());
        assertEquals("value2", nvps.get(1).getValue());
    }

    @Test
    void test2() throws URISyntaxException {
        ParamsUrlTools paramsUrlTools = new ParamsUrlTools();
        String params = "param1=value1&param2=value2&param3=value3";
        List<NameValuePair> nvps = paramsUrlTools.getPairParams(params);
        assertEquals(3, nvps.size());
        assertEquals("param1", nvps.get(0).getName());
        assertEquals("value1", nvps.get(0).getValue());
        assertEquals("param2", nvps.get(1).getName());
        assertEquals("value2", nvps.get(1).getValue());
        assertEquals("param3", nvps.get(2).getName());
        assertEquals("value3", nvps.get(2).getValue());
    }

    @Test
    void test3() throws URISyntaxException {
        ParamsUrlTools paramsUrlTools = new ParamsUrlTools();
        String params = "param1=value1&param2=value2&param3=value3&param4=value4";
        List<NameValuePair> nvps = paramsUrlTools.getPairParams(params);
        assertEquals(4, nvps.size());
        assertEquals("param1", nvps.get(0).getName());
        assertEquals("value1", nvps.get(0).getValue());
        assertEquals("param2", nvps.get(1).getName());
        assertEquals("value2", nvps.get(1).getValue());
        assertEquals("param3", nvps.get(2).getName());
        assertEquals("value3", nvps.get(2).getValue());
        assertEquals("param4", nvps.get(3).getName());
        assertEquals("value4", nvps.get(3).getValue());
    }

    @Test
    void test4() throws URISyntaxException {
        ParamsUrlTools paramsUrlTools = new ParamsUrlTools();
        String params = "param1=value1&param2=value2&param3=value3&param4=value4&param5=value5";
        List<NameValuePair> nvps = paramsUrlTools.getPairParams(params);
        assertEquals(5, nvps.size());
        assertEquals("param1", nvps.get(0).getName());
        assertEquals("value1", nvps.get(0).getValue());
        assertEquals("param2", nvps.get(1).getName());
        assertEquals("value2", nvps.get(1).getValue());
        assertEquals("param3", nvps.get(2).getName());
        assertEquals("value3", nvps.get(2).getValue());
        assertEquals("param4", nvps.get(3).getName());
        assertEquals("value4", nvps.get(3).getValue());
        assertEquals("param5", nvps.get(4).getName());
        assertEquals("value5", nvps.get(4).getValue());
    }

    @Test
    void test5() throws URISyntaxException {
        ParamsUrlTools paramsUrlTools = new ParamsUrlTools();
        String params = "param1=value1&param2=value2&param3=value3&param4=value4&param5=value5&param6=value6";
        List<NameValuePair> nvps = paramsUrlTools.getPairParams(params);
        assertEquals(6, nvps.size());
        assertEquals("param1", nvps.get(0).getName());
        assertEquals("value1", nvps.get(0).getValue());
        assertEquals("param2", nvps.get(1).getName());
        assertEquals("value2", nvps.get(1).getValue());
        assertEquals("param3", nvps.get(2).getName());
        assertEquals("value3", nvps.get(2).getValue());
        assertEquals("param4", nvps.get(3).getName());
        assertEquals("value4", nvps.get(3).getValue());
        assertEquals("param5", nvps.get(4).getName());
        assertEquals("value5", nvps.get(4).getValue());
        assertEquals("param6", nvps.get(5).getName());
        assertEquals("value6", nvps.get(5).getValue());
    }

    @Test
    void test6() throws URISyntaxException {
        ParamsUrlTools paramsUrlTools = new ParamsUrlTools();
        String params = "param1=value1&param2=value2&param3=value3&param4=value4&param5=value5&param6=value6&param7=value7";
        List<NameValuePair> nvps = paramsUrlTools.getPairParams(params);
        assertEquals(7, nvps.size());
        assertEquals("param1", nvps.get(0).getName());
        assertEquals("value1", nvps.get(0).getValue());
        assertEquals("param2", nvps.get(1).getName());
        assertEquals("value2", nvps.get(1).getValue());
        assertEquals("param3", nvps.get(2).getName());
        assertEquals("value3", nvps.get(2).getValue());
        assertEquals("param4", nvps.get(3).getName());
        assertEquals("value4", nvps.get(3).getValue());
        assertEquals("param5", nvps.get(4).getName());
        assertEquals("value5", nvps.get(4).getValue());
        assertEquals("param6", nvps.get(5).getName());
        assertEquals("value6", nvps.get(5).getValue());
        assertEquals("param7", nvps.get(6).getName());
        assertEquals("value7", nvps.get(6).getValue());
    }

    @Test
    void test7() throws URISyntaxException {
        ParamsUrlTools paramsUrlTools = new ParamsUrlTools();
        String params = "param1=value1&param2=value2&param3=value3&param4=value4&param5=value5&param6=value6&param7=value7&param8=value8";
        List<NameValuePair> nvps = paramsUrlTools.getPairParams(params);
        assertEquals(8, nvps.size());
        assertEquals("param1", nvps.get(0).getName());
        assertEquals("value1", nvps.get(0).getValue());
        assertEquals("param2", nvps.get(1).getName());
        assertEquals("value2", nvps.get(1).getValue());
        assertEquals("param3", nvps.get(2).getName());
        assertEquals("value3", nvps.get(2).getValue());
        assertEquals("param4", nvps.get(3).getName());
        assertEquals("value4", nvps.get(3).getValue());
        assertEquals("param5", nvps.get(4).getName());
        assertEquals("value5", nvps.get(4).getValue());
        assertEquals("param6", nvps.get(5).getName());
        assertEquals("value6", nvps.get(5).getValue());
        assertEquals("param7", nvps.get(6).getName());
        assertEquals("value7", nvps.get(6).getValue());
        assertEquals("param8", nvps.get(7).getName());
        assertEquals("value8", nvps.get(7).getValue());
    }

    @Test
    void test8() throws URISyntaxException {
        ParamsUrlTools paramsUrlTools = new ParamsUrlTools();
        String params = "param1=value1&param2=value2&param3=value3&param4=value4&param5=value5&param6=value6&param7=value7&param8=value8&param9=value9";
        List<NameValuePair> nvps = paramsUrlTools.getPairParams(params);
        assertEquals(9, nvps.size());
        assertEquals("param1", nvps.get(0).getName());
        assertEquals("value1", nvps.get(0).getValue());
        assertEquals("param2", nvps.get(1).getName());
        assertEquals("value2", nvps.get(1).getValue());
        assertEquals("param3", nvps.get(2).getName());
        assertEquals("value3", nvps.get(2).getValue());
        assertEquals("param4", nvps.get(3).getName());
        assertEquals("value4", nvps.get(3).getValue());
        assertEquals("param5", nvps.get(4).getName());
        assertEquals("value5", nvps.get(4).getValue());
        assertEquals("param6", nvps.get(5).getName());
        assertEquals("value6", nvps.get(5).getValue());
        assertEquals("param7", nvps.get(6).getName());
        assertEquals("value7", nvps.get(6).