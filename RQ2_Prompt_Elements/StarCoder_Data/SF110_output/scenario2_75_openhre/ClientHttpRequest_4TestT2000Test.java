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

    /**
     * Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
     * It tests the method with no cookies and no parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_0() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(null, null);
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
     * It tests the method with no cookies and one parameter.
     *
     * @throws IOException
     */
    @Test
    void testPost_1() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(null, new Object[] { "param1" });
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
     * It tests the method with no cookies and two parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_2() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(null, new Object[] { "param1", "param2" });
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
     * It tests the method with no cookies and three parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_3() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(null, new Object[] { "param1", "param2", "param3" });
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
     * It tests the method with no cookies and four parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_4() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(null, new Object[] { "param1", "param2", "param3", "param4" });
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
     * It tests the method with no cookies and five parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_5() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(null, new Object[] { "param1", "param2", "param3", "param4", "param5" });
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
     * It tests the method with no cookies and six parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_6() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(null, new Object[] { "param1", "param2", "param3", "param4", "param5", "param6" });
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
     * It tests the method with no cookies and seven parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_7() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(null, new Object[] { "param1", "param2", "param3", "param4", "param5", "param6", "param7" });
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
     * It tests the method with no cookies and eight parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_8() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(null, new Object[] { "param1", "param2", "param3", "param4", "param5", "param6", "param7", "param8" });
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
     * It tests the method with no cookies and nine parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_9() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(null, new Object[] { "param1", "param2", "param3", "param4", "param5", "param6", "param7", "param8", "param9" });
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
     * It tests the method with no cookies and ten parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_10() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(null, new Object[] { "param1", "param2", "param3", "param4", "param5", "param6", "param7", "param8", "param9", "param10" });
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
		
    /**
     * Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
     * It tests the method with one cookie and no parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_0() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(new String[] { "cookie1" }, null);
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
     * It tests the method with one cookie and one parameter.
     *
     * @throws IOException
     */
    @Test
    void testPost_1() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(new String[] { "cookie1" }, new Object[] { "param1" });
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
     * It tests the method with one cookie and two parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_2() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(new String[] { "cookie1" }, new Object[] { "param1", "param2" });
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
     * It tests the method with one cookie and three parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_3() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(new String[] { "cookie1" }, new Object[] { "param1", "param2", "param3" });
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
     * It tests the method with one cookie and four parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_4() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(new String[] { "cookie1" }, new Object[] { "param1", "param2", "param3", "param4" });
        assertNotNull(inputStream);
    }

    /**
     * Test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
     * It tests the method with one cookie and five parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_5() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        InputStream inputStream = clientHttpRequest.post(new String[] { "cookie