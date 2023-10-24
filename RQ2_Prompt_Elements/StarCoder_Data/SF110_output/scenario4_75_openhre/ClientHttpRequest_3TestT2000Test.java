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
    * Test method for {@link ClientHttpRequest#post(Map, Map)}.
    * @throws IOException
    */
    @Test
    void testPost() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
        Map<String, String> cookies = new HashMap<String, String>();
        cookies.put("name", "value");
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("name", "value");
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    /**
    * Test method for {@link ClientHttpRequest#post(Map, Map)}.
    * @throws IOException
    */
    @Test
    void testPost2() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
        Map<String, String> cookies = new HashMap<String, String>();
        cookies.put("name", "value");
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("name", "value");
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    /**
    * Test method for {@link ClientHttpRequest#post(Map, Map)}.
    * @throws IOException
    */
    @Test
    void testPost3() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
        Map<String, String> cookies = new HashMap<String, String>();
        cookies.put("name", "value");
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("name", "value");
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    /**
    * Test method for {@link ClientHttpRequest#post(Map, Map)}.
    * @throws IOException
    */
    @Test
    void testPost4() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
        Map<String, String> cookies = new HashMap<String, String>();
        cookies.put("name", "value");
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("name", "value");
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    /**
    * Test method for {@link ClientHttpRequest#post(Map, Map)}.
    * @throws IOException
    */
    @Test
    void testPost5() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
        Map<String, String> cookies = new HashMap<String, String>();
        cookies.put("name", "value");
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("name", "value");
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    /**
    * Test method for {@link ClientHttpRequest#post(Map, Map)}.
    * @throws IOException
    */
    @Test
    void testPost6() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
        Map<String, String> cookies = new HashMap<String, String>();
        cookies.put("name", "value");
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("name", "value");
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    /**
    * Test method for {@link ClientHttpRequest#post(Map, Map)}.
    * @throws IOException
    */
    @Test
    void testPost7() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
        Map<String, String> cookies = new HashMap<String, String>();
        cookies.put("name", "value");
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("name", "value");
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    /**
    * Test method for {@link ClientHttpRequest#post(Map, Map)}.
    * @throws IOException
    */
    @Test
    void testPost8() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
        Map<String, String> cookies = new HashMap<String, String>();
        cookies.put("name", "value");
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("name", "value");
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    /**
    * Test method for {@link ClientHttpRequest#post(Map, Map)}.
    * @throws IOException
    */
    @Test
    void testPost9() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
        Map<String, String> cookies = new HashMap<String, String>();
        cookies.put("name", "value");
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("name", "value");
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    /**
    * Test method for {@link ClientHttpRequest#post(Map, Map)}.
    * @throws IOException
    */
    @Test
    void testPost10() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
        Map<String, String> cookies = new HashMap<String, String>();
        cookies.put("name", "value");
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("name", "value");
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String[], Object[])} method.
*/
class ClientHttpRequest_2Test {
		
    /**
    * Test method for {@link ClientHttpRequest#post(String[], Object[])}.
    * @throws IOException
    */
    @Test
    void testPost() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
        String[] cookies = new String[2];
        cookies[0] = "name";
        cookies[1] = "value";
        Object[] parameters = new Object[2];
        parameters[0] = "name";
        parameters[1] = "value";
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    /**
    * Test method for {@link ClientHttpRequest#post(String[], Object[])}.
    * @throws IOException
    */
    @Test
    void testPost2() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
        String[] cookies = new String[2];
        cookies[0] = "name";
        cookies[1] = "value";
        Object[] parameters = new Object[2];
        parameters[0] = "name";
        parameters[1] = "value";
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    /**
    * Test method for {@link ClientHttpRequest#post(String[], Object[])}.
    * @throws IOException
    */
    @Test
    void testPost3() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
        String[] cookies = new String[2];
        cookies[0] = "name";
        cookies[1] = "value";
        Object[] parameters = new Object[2];
        parameters[0] = "name";
        parameters[1] = "value";
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    /**
    * Test method for {@link ClientHttpRequest#post(String[], Object[])}.
    * @throws IOException
    */
    @Test
    void testPost4() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest(new URL("http://localhost:8080/"));
        String[] cookies = new String[2];
        cookies[0] = "name";
        cookies[1