// ClientHttpRequest_0Test.java
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post()} method.
*/
class ClientHttpRequest_0Test {

    /**
     * Test case for the {@link ClientHttpRequest#post()} method.
     * It tests the method with no cookies and no parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_0() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/servlets/servlet/ClientHttpRequest");
        InputStream inputStream = clientHttpRequest.post();
        assertNotNull(inputStream);
    }
}

// ClientHttpRequest_1Test.java
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post()} method.
*/
class ClientHttpRequest_1Test {
		
    /**
     * Test case for the {@link ClientHttpRequest#post()} method.
     * It tests the method with no cookies and one parameter.
     *
     * @throws IOException
     */
    @Test
    void testPost_1() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/servlets/servlet/ClientHttpRequest");
        clientHttpRequest.addParameter("param1", "value1");
        InputStream inputStream = clientHttpRequest.post();
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post()} method.
*/
class ClientHttpRequest_2Test {
		
    /**
     * Test case for the {@link ClientHttpRequest#post()} method.
     * It tests the method with no cookies and two parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_2() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/servlets/servlet/ClientHttpRequest");
        clientHttpRequest.addParameter("param1", "value1");
        clientHttpRequest.addParameter("param2", "value2");
        InputStream inputStream = clientHttpRequest.post();
        assertNotNull(inputStream);
    }
}

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
* It contains ten unit test cases for the {@link ClientHttpRequest#post()} method.
*/
class ClientHttpRequest_3Test {
		
    /**
     * Test case for the {@link ClientHttpRequest#post()} method.
     * It tests the method with no cookies and three parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_3() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/servlets/servlet/ClientHttpRequest");
        clientHttpRequest.addParameter("param1", "value1");
        clientHttpRequest.addParameter("param2", "value2");
        clientHttpRequest.addParameter("param3", "value3");
        InputStream inputStream = clientHttpRequest.post();
        assertNotNull(inputStream);
    }
}

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
* It contains ten unit test cases for the {@link ClientHttpRequest#post()} method.
*/
class ClientHttpRequest_4Test {
		
    /**
     * Test case for the {@link ClientHttpRequest#post()} method.
     * It tests the method with no cookies and four parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_4() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/servlets/servlet/ClientHttpRequest");
        clientHttpRequest.addParameter("param1", "value1");
        clientHttpRequest.addParameter("param2", "value2");
        clientHttpRequest.addParameter("param3", "value3");
        clientHttpRequest.addParameter("param4", "value4");
        InputStream inputStream = clientHttpRequest.post();
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post()} method.
*/
class ClientHttpRequest_5Test {
		
    /**
     * Test case for the {@link ClientHttpRequest#post()} method.
     * It tests the method with no cookies and five parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_5() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/servlets/servlet/ClientHttpRequest");
        clientHttpRequest.addParameter("param1", "value1");
        clientHttpRequest.addParameter("param2", "value2");
        clientHttpRequest.addParameter("param3", "value3");
        clientHttpRequest.addParameter("param4", "value4");
        clientHttpRequest.addParameter("param5", "value5");
        InputStream inputStream = clientHttpRequest.post();
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
import java.io.FileInputStream;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientHttpRequest}.
* It contains ten unit test cases for the {@link ClientHttpRequest#post()} method.
*/
class ClientHttpRequest_6Test {
		
    /**
     * Test case for the {@link ClientHttpRequest#post()} method.
     * It tests the method with no cookies and six parameters.
     *
     * @throws IOException
     */
    @Test
    void testPost_6() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest("http://localhost:8080/servlets/servlet/ClientHttpRequest");
        clientHttpRequest.addParameter("param1", "value1");
        clientHttpRequest.addParameter("param2", "value2");
        clientHttpRequest.addParameter("param3", "value3");
        clientHttpRequest.addParameter("param4", "value4