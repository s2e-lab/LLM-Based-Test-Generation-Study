// ClientHttpRequest_3Test.java
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(Map, Map)} method.
*/
class ClientHttpRequest_3Test {

    /**
     * Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
     * It tests the method with the following parameters:
     * <ul>
     * <li>cookies: null</li>
     * <li>parameters: null</li>
     * </ul>
     *
     * @throws IOException
     */
    @Test
    void testPost_01() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest_3();
        InputStream inputStream = clientHttpRequest.post(null, null);
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
     * It tests the method with the following parameters:
     * <ul>
     * <li>cookies: null</li>
     * <li>parameters: not null</li>
     * </ul>
     *
     * @throws IOException
     */
    @Test
    void testPost_02() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest_3();
        Map parameters = new HashMap();
        parameters.put("param1", "value1");
        parameters.put("param2", "value2");
        InputStream inputStream = clientHttpRequest.post(null, parameters);
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
     * It tests the method with the following parameters:
     * <ul>
     * <li>cookies: not null</li>
     * <li>parameters: null</li>
     * </ul>
     *
     * @throws IOException
     */
    @Test
    void testPost_03() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest_3();
        Map cookies = new HashMap();
        cookies.put("cookie1", "value1");
        cookies.put("cookie2", "value2");
        InputStream inputStream = clientHttpRequest.post(cookies, null);
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
     * It tests the method with the following parameters:
     * <ul>
     * <li>cookies: not null</li>
     * <li>parameters: not null</li>
     * </ul>
     *
     * @throws IOException
     */
    @Test
    void testPost_04() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest_3();
        Map cookies = new HashMap();
        cookies.put("cookie1", "value1");
        cookies.put("cookie2", "value2");
        Map parameters = new HashMap();
        parameters.put("param1", "value1");
        parameters.put("param2", "value2");
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
     * It tests the method with the following parameters:
     * <ul>
     * <li>cookies: not null</li>
     * <li>parameters: not null</li>
     * </ul>
     *
     * @throws IOException
     */
    @Test
    void testPost_05() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest_3();
        Map cookies = new HashMap();
        cookies.put("cookie1", "value1");
        cookies.put("cookie2", "value2");
        Map parameters = new HashMap();
        parameters.put("param1", "value1");
        parameters.put("param2", "value2");
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
     * It tests the method with the following parameters:
     * <ul>
     * <li>cookies: not null</li>
     * <li>parameters: not null</li>
     * </ul>
     *
     * @throws IOException
     */
    @Test
    void testPost_06() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest_3();
        Map cookies = new HashMap();
        cookies.put("cookie1", "value1");
        cookies.put("cookie2", "value2");
        Map parameters = new HashMap();
        parameters.put("param1", "value1");
        parameters.put("param2", "value2");
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
     * It tests the method with the following parameters:
     * <ul>
     * <li>cookies: not null</li>
     * <li>parameters: not null</li>
     * </ul>
     *
     * @throws IOException
     */
    @Test
    void testPost_07() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest_3();
        Map cookies = new HashMap();
        cookies.put("cookie1", "value1");
        cookies.put("cookie2", "value2");
        Map parameters = new HashMap();
        parameters.put("param1", "value1");
        parameters.put("param2", "value2");
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
     * It tests the method with the following parameters:
     * <ul>
     * <li>cookies: not null</li>
     * <li>parameters: not null</li>
     * </ul>
     *
     * @throws IOException
     */
    @Test
    void testPost_08() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest_3();
        Map cookies = new HashMap();
        cookies.put("cookie1", "value1");
        cookies.put("cookie2", "value2");
        Map parameters = new HashMap();
        parameters.put("param1", "value1");
        parameters.put("param2", "value2");
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
     * It tests the method with the following parameters:
     * <ul>
     * <li>cookies: not null</li>
     * <li>parameters: not null</li>
     * </ul>
     *
     * @throws IOException
     */
    @Test
    void testPost_09() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest_3();
        Map cookies = new HashMap();
        cookies.put("cookie1", "value1");
        cookies.put("cookie2", "value2");
        Map parameters = new HashMap();
        parameters.put("param1", "value1");
        parameters.put("param2", "value2");
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
     * It tests the method with the following parameters:
     * <ul>
     * <li>cookies: not null</li>
     * <li>parameters: not null</li>
     * </ul>
     *
     * @throws IOException
     */
    @Test
    void testPost_10() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest_3();
        Map cookies = new HashMap();
        cookies.put("cookie1", "value1");
        cookies.put("cookie2", "value2");
        Map parameters = new HashMap();
        parameters.put("param1", "value1");
        parameters.put("param2", "value2");
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }
}

// ClientHttpRequest_2Test.java
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(Map, Map)} method.
*/
class ClientHttpRequest_2Test {
		
    /**
     * Test case for the {@link ClientHttpRequest#post(Map, Map)} method.
     * It tests the method with the following parameters:
     * <ul>
     * <li>cookies: null</li>
     * <li>parameters: null</li>
     * </ul>
     *
     * @throws IOException
     */
    @Test
    void testPost_01() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest_2();
        InputStream inputStream = clientHttpRequest.post(null, null);
       