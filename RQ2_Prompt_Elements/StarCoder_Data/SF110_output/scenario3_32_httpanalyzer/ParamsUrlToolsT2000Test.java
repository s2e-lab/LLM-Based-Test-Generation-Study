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

    /**
     * Test of getPairParams method, of class ParamsUrlTools.
     * @throws java.net.URISyntaxException
     */
    @Test
    void testGetPairParams() throws URISyntaxException {
        System.out.println("getPairParams");
        String params = "param1=value1&param2=value2&param3=value3";
        ParamsUrlTools instance = new ParamsUrlTools();
        List<NameValuePair> expResult = new ArrayList<>();
        expResult.add(new BasicNameValuePair("param1", "value1"));
        expResult.add(new BasicNameValuePair("param2", "value2"));
        expResult.add(new BasicNameValuePair("param3", "value3"));
        List<NameValuePair> result = instance.getPairParams(params);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPairParams method, of class ParamsUrlTools.
     * @throws java.net.URISyntaxException
     */
    @Test
    void testGetPairParams2() throws URISyntaxException {
        System.out.println("getPairParams");
        String params = "param1=value1&param2=value2&param3=value3&";
        ParamsUrlTools instance = new ParamsUrlTools();
        List<NameValuePair> expResult = new ArrayList<>();
        expResult.add(new BasicNameValuePair("param1", "value1"));
        expResult.add(new BasicNameValuePair("param2", "value2"));
        expResult.add(new BasicNameValuePair("param3", "value3"));
        List<NameValuePair> result = instance.getPairParams(params);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPairParams method, of class ParamsUrlTools.
     * @throws java.net.URISyntaxException
     */
    @Test
    void testGetPairParams3() throws URISyntaxException {
        System.out.println("getPairParams");
        String params = "param1=value1&param2=value2&param3=value3&param4=value4";
        ParamsUrlTools instance = new ParamsUrlTools();
        List<NameValuePair> expResult = new ArrayList<>();
        expResult.add(new BasicNameValuePair("param1", "value1"));
        expResult.add(new BasicNameValuePair("param2", "value2"));
        expResult.add(new BasicNameValuePair("param3", "value3"));
        expResult.add(new BasicNameValuePair("param4", "value4"));
        List<NameValuePair> result = instance.getPairParams(params);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPairParams method, of class ParamsUrlTools.
     * @throws java.net.URISyntaxException
     */
    @Test
    void testGetPairParams4() throws URISyntaxException {
        System.out.println("getPairParams");
        String params = "param1=value1&param2=value2&param3=value3&param4=value4&";
        ParamsUrlTools instance = new ParamsUrlTools();
        List<NameValuePair> expResult = new ArrayList<>();
        expResult.add(new BasicNameValuePair("param1", "value1"));
        expResult.add(new BasicNameValuePair("param2", "value2"));
        expResult.add(new BasicNameValuePair("param3", "value3"));
        expResult.add(new BasicNameValuePair("param4", "value4"));
        List<NameValuePair> result = instance.getPairParams(params);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPairParams method, of class ParamsUrlTools.
     * @throws java.net.URISyntaxException
     */
    @Test
    void testGetPairParams5() throws URISyntaxException {
        System.out.println("getPairParams");
        String params = "param1=value1&param2=value2&param3=value3&param4=value4&param5=value5";
        ParamsUrlTools instance = new ParamsUrlTools();
        List<NameValuePair> expResult = new ArrayList<>();
        expResult.add(new BasicNameValuePair("param1", "value1"));
        expResult.add(new BasicNameValuePair("param2", "value2"));
        expResult.add(new BasicNameValuePair("param3", "value3"));
        expResult.add(new BasicNameValuePair("param4", "value4"));
        expResult.add(new BasicNameValuePair("param5", "value5"));
        List<NameValuePair> result = instance.getPairParams(params);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPairParams method, of class ParamsUrlTools.
     * @throws java.net.URISyntaxException
     */
    @Test
    void testGetPairParams6() throws URISyntaxException {
        System.out.println("getPairParams");
        String params = "param1=value1&param2=value2&param3=value3&param4=value4&param5=value5&";
        ParamsUrlTools instance = new ParamsUrlTools();
        List<NameValuePair> expResult = new ArrayList<>();
        expResult.add(new BasicNameValuePair("param1", "value1"));
        expResult.add(new BasicNameValuePair("param2", "value2"));
        expResult.add(new BasicNameValuePair("param3", "value3"));
        expResult.add(new BasicNameValuePair("param4", "value4"));
        expResult.add(new BasicNameValuePair("param5", "value5"));
        List<NameValuePair> result = instance.getPairParams(params);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPairParams method, of class ParamsUrlTools.
     * @throws java.net.URISyntaxException
     */
    @Test
    void testGetPairParams7() throws URISyntaxException {
        System.out.println("getPairParams");
        String params = "param1=value1&param2=value2&param3=value3&param4=value4&param5=value5&param6=value6";
        ParamsUrlTools instance = new ParamsUrlTools();
        List<NameValuePair> expResult = new ArrayList<>();
        expResult.add(new BasicNameValuePair("param1", "value1"));
        expResult.add(new BasicNameValuePair("param2", "value2"));
        expResult.add(new BasicNameValuePair("param3", "value3"));
        expResult.add(new BasicNameValuePair("param4", "value4"));
        expResult.add(new BasicNameValuePair("param5", "value5"));
        expResult.add(new BasicNameValuePair("param6", "value6"));
        List<NameValuePair> result = instance.getPairParams(params);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPairParams method, of class ParamsUrlTools.
     * @throws java.net.URISyntaxException
     */
    @Test
    void testGetPairParams8() throws URISyntaxException {
        System.out.println("getPairParams");
        String params = "param1=value1&param2=value2&param3=value3&param4=value4&param5=value5&param6=value6&";
        ParamsUrlTools instance = new ParamsUrlTools();
        List<NameValuePair> expResult = new ArrayList<>();
        expResult.add(new BasicNameValuePair("param1", "value1"));
        expResult.add(new BasicNameValuePair("param2", "value2"));
        expResult.add(new BasicNameValuePair("param3", "value3"));
        expResult.add(new BasicNameValuePair("param4", "value4"));
        expResult.add(new BasicNameValuePair("param5", "value5"));
        expResult.add(new BasicNameValuePair("param6", "value6"));
        List<NameValuePair> result = instance.getPairParams(params);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPairParams method, of class ParamsUrlTools.
     * @throws java.net.URISyntaxException
     */
    @Test
    void testGetPairParams9() throws URISyntaxException {
        System.out.println("getPairParams");
        String params = "param1=value1&param2=value2&param3=value3&param4=value4&param5=value5&param6=value6&param7=value7";
        ParamsUrlTools instance = new ParamsUrlTools();
        List<NameValuePair> expResult = new ArrayList<>();
        expResult.add(new BasicNameValuePair("param1", "value1"));
        expResult.add(new BasicNameValuePair("param2", "value2"));
        expResult.add(new BasicNameValuePair("param3", "value3"));
        expResult.add(new BasicNameValuePair("param4", "value4"));
        expResult.add(new BasicNameValuePair("param5", "value5"));
        expResult.add(new BasicNameValuePair("param6", "value6"));
        expResult.add(new BasicNameValuePair("param7", "value7"));
        List<NameValuePair> result = instance.getPairParams(params);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPairParams method, of class ParamsUrlTools.
     * @throws java.net.URISyntaxException
     */
    @Test
    void testGetPairParams10() throws URISyntaxException {
        System.out.println("getPairParams