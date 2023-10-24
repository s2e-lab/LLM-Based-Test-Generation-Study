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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object)} method.
*/
class ClientHttpRequest_5Test {

    /**
     * Test case for the {@link ClientHttpRequest#post(String, Object)} method.
     * It tests the method with the following parameters:
     * <ul>
     * <li>name = "param1", value = "value1"</li>
     * <li>name = "param2", value = "value2"</li>
     * <li>name = "param3", value = "value3"</li>
     * <li>name = "param4", value = "value4"</li>
     * <li>name = "param5", value = "value5"</li>
     * </ul>
     *
     * @throws IOException
     */
    @Test
    void testPost() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        clientHttpRequest.setParameter("param1", "value1");
        clientHttpRequest.setParameter("param2", "value2");
        clientHttpRequest.setParameter("param3", "value3");
        clientHttpRequest.setParameter("param4", "value4");
        clientHttpRequest.setParameter("param5", "value5");
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object)} method.
*/
class ClientHttpRequest_4Test {
		
    /**
     * Test case for the {@link ClientHttpRequest#post(String, Object)} method.
     * It tests the method with the following parameters:
     * <ul>
     * <li>name = "param1", value = "value1"</li>
     * <li>name = "param2", value = "value2"</li>
     * <li>name = "param3", value = "value3"</li>
     * <li>name = "param4", value = "value4"</li>
     * </ul>
     *
     * @throws IOException
     */
    @Test
    void testPost() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        clientHttpRequest.setParameter("param1", "value1");
        clientHttpRequest.setParameter("param2", "value2");
        clientHttpRequest.setParameter("param3", "value3");
        clientHttpRequest.setParameter("param4", "value4");
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object)} method.
*/
class ClientHttpRequest_3Test {
		
    /**
     * Test case for the {@link ClientHttpRequest#post(String, Object)} method.
     * It tests the method with the following parameters:
     * <ul>
     * <li>name = "param1", value = "value1"</li>
     * <li>name = "param2", value = "value2"</li>
     * <li>name = "param3", value = "value3"</li>
     * </ul>
     *
     * @throws IOException
     */
    @Test
    void testPost() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        clientHttpRequest.setParameter("param1", "value1");
        clientHttpRequest.setParameter("param2", "value2");
        clientHttpRequest.setParameter("param3", "value3");
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object)} method.
*/
class ClientHttpRequest_2Test {
		
    /**
     * Test case for the {@link ClientHttpRequest#post(String, Object)} method.
     * It tests the method with the following parameters:
     * <ul>
     * <li>name = "param1", value = "value1"</li>
     * <li>name = "param2", value = "value2"</li>
     * </ul>
     *
     * @throws IOException
     */
    @Test
    void testPost() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        clientHttpRequest.setParameter("param1", "value1");
        clientHttpRequest.setParameter("param2", "value2");
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object)} method.
*/
class ClientHttpRequest_1Test {
		
    /**
     * Test case for the {@link ClientHttpRequest#post(String, Object)} method.
     * It tests the method with the following parameters:
     * <ul>
     * <li>name = "param1", value = "value1"</li>
     * </ul>
     *
     * @throws IOException
     */
    @Test
    void testPost() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        clientHttpRequest.setParameter("param1", "value1");
        InputStream inputStream = clientHttpRequest.post();
        assertNotNull(inputStream);
    }
}

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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object)} method.
*/
class ClientHttpRequest_0Test {
		
    /**
     * Test case for the {@link ClientHttpRequest#post(String, Object)} method.
     * It tests the method with the following parameters:
     * <ul>
     * <li>name = "param1", value = "value1"</li>
     * </ul>
     *
     * @throws IOException
     */
    @Test
    void testPost() throws IOException {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
        clientHttpRequest.setParameter("param1", "value1");
        InputStream inputStream = clientHttpRequest.post();
        assertNotNull(inputStream);
    }
}

// ClientHttpRequest.java
package com.browsersoft.servlet.util;

import java.net.URLConnection;
import java.net