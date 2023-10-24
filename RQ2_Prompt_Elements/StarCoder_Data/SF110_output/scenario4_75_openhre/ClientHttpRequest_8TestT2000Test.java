// ClientHttpRequest_8Test.java
package com.browsersoft.servlet.util;

import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.InputStream;
import java.util.Random;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientHttpRequest}.
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_8Test {

    /**
    * Test case number: 1
    * Test case values: parameter name1 = "name1", parameter value1 = "value1", parameter name2 = "name2", parameter value2 = "value2", parameter name3 = "name3", parameter value3 = "value3", parameter name4 = "name4", parameter value4 = "value4"
    * Expected result: the input stream with the server response
    */
    @Test
    void test_post_1() throws IOException {
        // Arrange
        final String name1 = "name1";
        final String value1 = "value1";
        final String name2 = "name2";
        final String value2 = "value2";
        final String name3 = "name3";
        final String value3 = "value3";
        final String name4 = "name4";
        final String value4 = "value4";
        final String urlString = "http://localhost:8080/test";
        final String[] cookies = new String[0];
        final Object[] parameters = new Object[]{name1, value1, name2, value2, name3, value3, name4, value4};
        final URL url = new URL(urlString);
        final Map cookiesMap = new HashMap();
        final Map parametersMap = new HashMap();
        for (int i = 0; i < cookies.length; i += 2) {
            cookiesMap.put(cookies[i], cookies[i + 1]);
        }
        for (int i = 0; i < parameters.length; i += 2) {
            parametersMap.put(parameters[i], parameters[i + 1]);
        }
        final ClientHttpRequest clientHttpRequest = new ClientHttpRequest(url);
        clientHttpRequest.setCookies(cookiesMap);
        clientHttpRequest.setParameters(parametersMap);
        // Act
        final InputStream inputStream = clientHttpRequest.post();
        // Assert result
        assertNotNull(inputStream);
    }

    /**
    * Test case number: 2
    * Test case values: parameter name1 = "name1", parameter value1 = "value1", parameter name2 = "name2", parameter value2 = "value2", parameter name3 = "name3", parameter value3 = "value3", parameter name4 = "name4", parameter value4 = "value4"
    * Expected result: the input stream with the server response
    */
    @Test
    void test_post_2() throws IOException {
        // Arrange
        final String name1 = "name1";
        final String value1 = "value1";
        final String name2 = "name2";
        final String value2 = "value2";
        final String name3 = "name3";
        final String value3 = "value3";
        final String name4 = "name4";
        final String value4 = "value4";
        final String urlString = "http://localhost:8080/test";
        final String[] cookies = new String[0];
        final Object[] parameters = new Object[]{name1, value1, name2, value2, name3, value3, name4, value4};
        final URL url = new URL(urlString);
        final Map cookiesMap = new HashMap();
        final Map parametersMap = new HashMap();
        for (int i = 0; i < cookies.length; i += 2) {
            cookiesMap.put(cookies[i], cookies[i + 1]);
        }
        for (int i = 0; i < parameters.length; i += 2) {
            parametersMap.put(parameters[i], parameters[i + 1]);
        }
        final ClientHttpRequest clientHttpRequest = new ClientHttpRequest(url);
        clientHttpRequest.setCookies(cookiesMap);
        clientHttpRequest.setParameters(parametersMap);
        // Act
        final InputStream inputStream = clientHttpRequest.post();
        // Assert result
        assertNotNull(inputStream);
    }

    /**
    * Test case number: 3
    * Test case values: parameter name1 = "name1", parameter value1 = "value1", parameter name2 = "name2", parameter value2 = "value2", parameter name3 = "name3", parameter value3 = "value3", parameter name4 = "name4", parameter value4 = "value4"
    * Expected result: the input stream with the server response
    */
    @Test
    void test_post_3() throws IOException {
        // Arrange
        final String name1 = "name1";
        final String value1 = "value1";
        final String name2 = "name2";
        final String value2 = "value2";
        final String name3 = "name3";
        final String value3 = "value3";
        final String name4 = "name4";
        final String value4 = "value4";
        final String urlString = "http://localhost:8080/test";
        final String[] cookies = new String[0];
        final Object[] parameters = new Object[]{name1, value1, name2, value2, name3, value3, name4, value4};
        final URL url = new URL(urlString);
        final Map cookiesMap = new HashMap();
        final Map parametersMap = new HashMap();
        for (int i = 0; i < cookies.length; i += 2) {
            cookiesMap.put(cookies[i], cookies[i + 1]);
        }
        for (int i = 0; i < parameters.length; i += 2) {
            parametersMap.put(parameters[i], parameters[i + 1]);
        }
        final ClientHttpRequest clientHttpRequest = new ClientHttpRequest(url);
        clientHttpRequest.setCookies(cookiesMap);
        clientHttpRequest.setParameters(parametersMap);
        // Act
        final InputStream inputStream = clientHttpRequest.post();
        // Assert result
        assertNotNull(inputStream);
    }

    /**
    * Test case number: 4
    * Test case values: parameter name1 = "name1", parameter value1 = "value1", parameter name2 = "name2", parameter value2 = "value2", parameter name3 = "name3", parameter value3 = "value3", parameter name4 = "name4", parameter value4 = "value4"
    * Expected result: the input stream with the server response
    */
    @Test
    void test_post_4() throws IOException {
        // Arrange
        final String name1 = "name1";
        final String value1 = "value1";
        final String name2 = "name2";
        final String value2 = "value2";
        final String name3 = "name3";
        final String value3 = "value3";
        final String name4 = "name4";
        final String value4 = "value4";
        final String urlString = "http://localhost:8080/test";
        final String[] cookies = new String[0];
        final Object[] parameters = new Object[]{name1, value1, name2, value2, name3, value3, name4, value4};
        final URL url = new URL(urlString);
        final Map cookiesMap = new HashMap();
        final Map parametersMap = new HashMap();
        for (int i = 0; i < cookies.length; i += 2) {
            cookiesMap.put(cookies[i], cookies[i + 1]);
        }
        for (int i = 0; i < parameters.length; i += 2) {
            parametersMap.put(parameters[i], parameters[i + 1]);
        }
        final ClientHttpRequest clientHttpRequest = new ClientHttpRequest(url);
        clientHttpRequest.setCookies(cookiesMap);
        clientHttpRequest.setParameters(parametersMap);
        // Act
        final InputStream inputStream = clientHttpRequest.post();
        // Assert result
        assertNotNull(inputStream);
    }

    /**
    * Test case number: 5
    * Test case values: parameter name1 = "name1", parameter value1 = "value1", parameter name2 = "name2", parameter value2 = "value2", parameter name3 = "name3", parameter value3 = "value3", parameter name4 = "name4", parameter value4 = "value4"
    * Expected result: the input stream with the server response
    */
    @Test
    void test_post_5() throws IOException {
        // Arrange
        final String name1 = "name1";
        final String value1 = "value1";
        final String name2 = "name2";
        final String value2 = "value2";
        final String name3 = "name3";
        final String value3 = "value3";
        final String name4 = "name4";
        final String value4 = "value4";
        final String urlString = "http://localhost:8080/test";
        final String[] cookies = new String[0];
        final Object[] parameters = new Object[]{name1, value1, name2, value2, name3, value3, name4, value4};
        final URL url = new URL(urlString);
        final Map cookiesMap = new HashMap();
        final Map parametersMap = new HashMap();
        for (int i = 0; i < cookies.length; i += 2) {
            cookiesMap.put(cookies[i], cookies[i + 1]);
        }
        for