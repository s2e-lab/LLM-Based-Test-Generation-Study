// Login_0Test.java
package com.browsersoft.aacs;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.security.auth.login.LoginException;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import com.browsersoft.aacs.xacml.PDPadapter;
import com.browsersoft.aacs.xacml.RequestBuilder;
import com.sun.xacml.Indenter;
import com.sun.xacml.ctx.RequestCtx;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Login}.
* It contains ten unit test cases for the {@link Login#getProps(String)} method.
*/
class Login_0Test {

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps() {
        Login.setConfigFile("AACS");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_01() {
        Login.setConfigFile("AACS_01");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_02() {
        Login.setConfigFile("AACS_02");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_03() {
        Login.setConfigFile("AACS_03");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_04() {
        Login.setConfigFile("AACS_04");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_05() {
        Login.setConfigFile("AACS_05");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_06() {
        Login.setConfigFile("AACS_06");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_07() {
        Login.setConfigFile("AACS_07");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_08() {
        Login.setConfigFile("AACS_08");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_09() {
        Login.setConfigFile("AACS_09");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_10() {
        Login.setConfigFile("AACS_10");
        Properties props = Login.getProps();
        assertNotNull(props);
    }
}

// Login_1Test.java
package com.browsersoft.aacs;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.security.auth.login.LoginException;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import com.browsersoft.aacs.xacml.PDPadapter;
import com.browsersoft.aacs.xacml.RequestBuilder;
import com.sun.xacml.Indenter;
import com.sun.xacml.ctx.RequestCtx;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Login}.
* It contains ten unit test cases for the {@link Login#getProps(String)} method.
*/
class Login_1Test {
		
    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps() {
        Login.setConfigFile("AACS");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_01() {
        Login.setConfigFile("AACS_01");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_02() {
        Login.setConfigFile("AACS_02");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_03() {
        Login.setConfigFile("AACS_03");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_04() {
        Login.setConfigFile("AACS_04");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_05() {
        Login.setConfigFile("AACS_05");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_06() {
        Login.setConfigFile("AACS_06");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_07() {
        Login.setConfigFile("AACS_07");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_08() {
        Login.setConfigFile("AACS_08");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_09() {
        Login.setConfigFile("AACS_09");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_10() {
        Login.setConfigFile("AACS_10");
        Properties props = Login.getProps();
        assertNotNull(props);
    }
}

// Login_2Test.java
package com.browsersoft.aacs;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.security.auth.login.LoginException;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import com.browsersoft.aacs.xacml.PDPadapter;
import com.browsersoft.aacs.xacml.RequestBuilder;
import com.sun.xacml.Indenter;
import com.sun.xacml.ctx.RequestCtx;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Login}.
* It contains ten unit test cases for the {@link Login#getProps(String)} method.
*/
class Login_2Test {
		
    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps() {
        Login.setConfigFile("AACS");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @Test
    void testGetProps_01() {
        Login.setConfigFile("AACS_01");
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test method for {@link Login#getProps(String)}.
     */
    @