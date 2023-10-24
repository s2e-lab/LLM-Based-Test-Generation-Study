// SimpleUserMgr_0Test.java
package com.browsersoft.aacs;

import jdbm.JDBMEnumeration;
import jdbm.JDBMHashtable;
import jdbm.JDBMRecordManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleUserMgr}.
* It contains ten unit test cases for the {@link SimpleUserMgr#getUser(String, String, String)} method.
*/
class SimpleUserMgr_0Test {

    /**
     * Test method for {@link SimpleUserMgr#getUser(String, String, String)}.
     */
    @Test
    void testGetUser() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        User user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNotNull(user);
        assertEquals("user1", user.getUsername());
        assertEquals("org1", user.getOrg());
        assertEquals("<EMAIL>", user.getEmail());
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNotNull(user);
        assertEquals("user1", user.getUsername());
        assertEquals("org1", user.getOrg());
        assertEquals("<EMAIL>", user.getEmail());
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
    }
}

// SimpleUserMgr_1Test.java
package com.browsersoft.aacs;

import jdbm.JDBMEnumeration;
import jdbm.JDBMHashtable;
import jdbm.JDBMRecordManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleUserMgr}.
* It contains ten unit test cases for the {@link SimpleUserMgr#getUser(String, String, String)} method.
*/
class SimpleUserMgr_1Test {
		
    /**
     * Test method for {@link SimpleUserMgr#getUser(String, String, String)}.
     */
    @Test
    void testGetUser() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        User user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNotNull(user);
        assertEquals("user1", user.getUsername());
        assertEquals("org1", user.getOrg());
        assertEquals("<EMAIL>", user.getEmail());
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNotNull(user);
        assertEquals("user1", user.getUsername());
        assertEquals("org1", user.getOrg());
        assertEquals("<EMAIL>", user.getEmail());
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
    }
}

// SimpleUserMgr_2Test.java
package com.browsersoft.aacs;

import jdbm.JDBMEnumeration;
import jdbm.JDBMHashtable;
import jdbm.JDBMRecordManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleUserMgr}.
* It contains ten unit test cases for the {@link SimpleUserMgr#getUser(String, String, String)} method.
*/
class SimpleUserMgr_2Test {
		
    /**
     * Test method for {@link SimpleUserMgr#getUser(String, String, String)}.
     */
    @Test
    void testGetUser() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        User user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNotNull(user);
        assertEquals("user1", user.getUsername());
        assertEquals("org1", user.getOrg());
        assertEquals("<EMAIL>", user.getEmail());
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNotNull(user);
        assertEquals("user1", user.getUsername());
        assertEquals("org1", user.getOrg());
        assertEquals("<EMAIL>", user.getEmail());
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
        user = userMgr.getUser("cn=user1,o=org1,email=<EMAIL>", "org1", "<EMAIL>");
        assertNull(user);
    }
}

// SimpleUserMgr_3Test.java
package com.browsersoft.aacs;

import jdbm.JDBMEnumeration;
import jdbm.JDBMHashtable;
import jdbm.JDBMRecordManager;
import java.io.BufferedReader;
import java.io.IOException;
import java