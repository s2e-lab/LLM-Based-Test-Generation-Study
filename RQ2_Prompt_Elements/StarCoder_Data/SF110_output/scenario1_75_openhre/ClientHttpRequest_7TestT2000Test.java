// ClientHttpRequest_7Test.java
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_7Test {

    /**
    * Test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
    * It tests the method with three parameters.
    */
    @Test
    void testPost_3() {
        try {
            ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
            InputStream inputStream = clientHttpRequest.post("name1", "value1", "name2", "value2", "name3", "value3");
            assertNotNull(inputStream);
        } catch (IOException e) {
            fail("Unexpected exception thrown");
        }
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_6Test {
		
    /**
    * Test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
    * It tests the method with two parameters.
    */
    @Test
    void testPost_2() {
        try {
            ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
            InputStream inputStream = clientHttpRequest.post("name1", "value1", "name2", "value2");
            assertNotNull(inputStream);
        } catch (IOException e) {
            fail("Unexpected exception thrown");
        }
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_5Test {
		
    /**
    * Test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
    * It tests the method with one parameter.
    */
    @Test
    void testPost_1() {
        try {
            ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
            InputStream inputStream = clientHttpRequest.post("name1", "value1");
            assertNotNull(inputStream);
        } catch (IOException e) {
            fail("Unexpected exception thrown");
        }
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_4Test {
		
    /**
    * Test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
    * It tests the method with no parameters.
    */
    @Test
    void testPost_0() {
        try {
            ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
            InputStream inputStream = clientHttpRequest.post();
            assertNotNull(inputStream);
        } catch (IOException e) {
            fail("Unexpected exception thrown");
        }
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_3Test {
		
    /**
    * Test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
    * It tests the method with three parameters.
    */
    @Test
    void testPost_3() {
        try {
            ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
            InputStream inputStream = clientHttpRequest.post("name1", "value1", "name2", "value2", "name3", "value3");
            assertNotNull(inputStream);
        } catch (IOException e) {
            fail("Unexpected exception thrown");
        }
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_2Test {
		
    /**
    * Test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
    * It tests the method with two parameters.
    */
    @Test
    void testPost_2() {
        try {
            ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
            InputStream inputStream = clientHttpRequest.post("name1", "value1", "name2", "value2");
            assertNotNull(inputStream);
        } catch (IOException e) {
            fail("Unexpected exception thrown");
        }
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_1Test {
		
    /**
    * Test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
    * It tests the method with one parameter.
    */
    @Test
    void testPost_1() {
        try {
            ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
            InputStream inputStream = clientHttpRequest.post("name1", "value1");
            assertNotNull(inputStream);
        } catch (IOException e) {
            fail("Unexpected exception thrown");
        }
    }
}

// ClientHttpRequest_0Test.java
package com.browsersoft.servlet.util;

import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
