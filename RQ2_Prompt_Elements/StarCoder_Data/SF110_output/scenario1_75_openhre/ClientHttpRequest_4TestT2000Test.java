// ClientHttpRequest_4Test.java
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
class ClientHttpRequest_4Test {

    @Test
    void testPost_1() throws IOException {
        String[] cookies = new String[0];
        Object[] parameters = new Object[0];
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    @Test
    void testPost_2() throws IOException {
        String[] cookies = new String[0];
        Object[] parameters = new Object[1];
        parameters[0] = new Object();
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    @Test
    void testPost_3() throws IOException {
        String[] cookies = new String[1];
        cookies[0] = "cookie";
        Object[] parameters = new Object[0];
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    @Test
    void testPost_4() throws IOException {
        String[] cookies = new String[1];
        cookies[0] = "cookie";
        Object[] parameters = new Object[1];
        parameters[0] = new Object();
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    @Test
    void testPost_5() throws IOException {
        String[] cookies = new String[2];
        cookies[0] = "cookie";
        cookies[1] = "cookie";
        Object[] parameters = new Object[0];
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    @Test
    void testPost_6() throws IOException {
        String[] cookies = new String[2];
        cookies[0] = "cookie";
        cookies[1] = "cookie";
        Object[] parameters = new Object[1];
        parameters[0] = new Object();
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    @Test
    void testPost_7() throws IOException {
        String[] cookies = new String[3];
        cookies[0] = "cookie";
        cookies[1] = "cookie";
        cookies[2] = "cookie";
        Object[] parameters = new Object[0];
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    @Test
    void testPost_8() throws IOException {
        String[] cookies = new String[3];
        cookies[0] = "cookie";
        cookies[1] = "cookie";
        cookies[2] = "cookie";
        Object[] parameters = new Object[1];
        parameters[0] = new Object();
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    @Test
    void testPost_9() throws IOException {
        String[] cookies = new String[4];
        cookies[0] = "cookie";
        cookies[1] = "cookie";
        cookies[2] = "cookie";
        cookies[3] = "cookie";
        Object[] parameters = new Object[0];
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    @Test
    void testPost_10() throws IOException {
        String[] cookies = new String[4];
        cookies[0] = "cookie";
        cookies[1] = "cookie";
        cookies[2] = "cookie";
        cookies[3] = "cookie";
        Object[] parameters = new Object[1];
        parameters[0] = new Object();
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }
}

// ClientHttpRequest_5Test.java
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
class ClientHttpRequest_5Test {
		
    @Test
    void testPost_1() throws IOException {
        String[] cookies = new String[0];
        Object[] parameters = new Object[0];
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    @Test
    void testPost_2() throws IOException {
        String[] cookies = new String[0];
        Object[] parameters = new Object[1];
        parameters[0] = new Object();
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    @Test
    void testPost_3() throws IOException {
        String[] cookies = new String[1];
        cookies[0] = "cookie";
        Object[] parameters = new Object[0];
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    @Test
    void testPost_4() throws IOException {
        String[] cookies = new String[1];
        cookies[0] = "cookie";
        Object[] parameters = new Object[1];
        parameters[0] = new Object();
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    @Test
    void testPost_5() throws IOException {
        String[] cookies = new String[2];
        cookies[0] = "cookie";
        cookies[1] = "cookie";
        Object[] parameters = new Object[0];
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    @Test
    void testPost_6() throws IOException {
        String[] cookies = new String[2];
        cookies[0] = "cookie";
        cookies[1] = "cookie";
        Object[] parameters = new Object[1];
        parameters[0] = new Object();
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    @Test
    void testPost_7() throws IOException {
        String[] cookies = new String[3];
        cookies[0] = "cookie";
        cookies[1] = "cookie";
        cookies[2] = "cookie";
        Object[] parameters = new Object[0];
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    @Test
    void testPost_8() throws IOException {
        String[] cookies = new String[3];
        cookies[0] = "cookie";
        cookies[1] = "cookie";
        cookies[2] = "cookie";
        Object[] parameters = new Object[1];
        parameters[0] = new Object();
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    @Test
    void testPost_9() throws IOException {
        String[] cookies = new String[4];
        cookies[0] = "cookie";
        cookies[1] = "cookie";
        cookies[2] = "cookie";
        cookies[3] = "cookie";
        Object[] parameters = new Object[0];
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }

    @Test
    void testPost_10() throws IOException {
        String[] cookies = new String[4];
        cookies[0] = "cookie";
        cookies[1] = "cookie";
        cookies[2] = "cookie";
        cookies[3] = "cookie";
        Object[] parameters = new Object[1];
        parameters[0] = new Object();
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(cookies, parameters);
        assertNotNull(inputStream);
    }
}

// ClientHttpRequest_6Test.java
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
import java.io