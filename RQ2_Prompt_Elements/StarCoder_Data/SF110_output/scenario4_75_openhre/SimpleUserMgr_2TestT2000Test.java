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
* It contains ten unit test cases for the {@link SimpleUserMgr#getMailbyOrg(String)} method.
*/
class SimpleUserMgr_2Test {

    /**
     * Test method for {@link SimpleUserMgr#getMailbyOrg(String)}.
     */
    @Test
    void testGetMailbyOrg() {
        SimpleUserMgr testUserMgr = new SimpleUserMgr();
        testUserMgr.init();
        String[] mailbyOrg = testUserMgr.getMailbyOrg("org1");
        assertEquals(mailbyOrg.length, 2);
        assertEquals(mailbyOrg[0], "<EMAIL>");
        assertEquals(mailbyOrg[1], "<EMAIL>");
    }
}

// SimpleUserMgr_3Test.java
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
* It contains ten unit test cases for the {@link SimpleUserMgr#getNamesbyOrg(String)} method.
*/
class SimpleUserMgr_3Test {
		
    /**
     * Test method for {@link SimpleUserMgr#getNamesbyOrg(String)}.
     */
    @Test
    void testGetNamesbyOrg() {
        SimpleUserMgr testUserMgr = new SimpleUserMgr();
        testUserMgr.init();
        String[] namesbyOrg = testUserMgr.getNamesbyOrg("org1");
        assertEquals(namesbyOrg.length, 2);
        assertEquals(namesbyOrg[0], "user1");
        assertEquals(namesbyOrg[1], "user2");
    }
}

// SimpleUserMgr_4Test.java
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
* It contains ten unit test cases for the {@link SimpleUserMgr#getUser(String, String)} method.
*/
class SimpleUserMgr_4Test {
		
    /**
     * Test method for {@link SimpleUserMgr#getUser(String, String)}.
     */
    @Test
    void testGetUser() {
        SimpleUserMgr testUserMgr = new SimpleUserMgr();
        testUserMgr.init();
        User user = testUserMgr.getUser("user1", "org1");
        assertEquals(user.getEmail(), "<EMAIL>");
    }
}

// SimpleUserMgr_5Test.java
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
class SimpleUserMgr_5Test {
		
    /**
     * Test method for {@link SimpleUserMgr#getUser(String, String, String)}.
     */
    @Test
    void testGetUser() {
        SimpleUserMgr testUserMgr = new SimpleUserMgr();
        testUserMgr.init();
        User user = testUserMgr.getUser("user1", "org1", "<EMAIL>");
        assertEquals(user.getEmail(), "<EMAIL>");
    }
}

// SimpleUserMgr_6Test.java
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
* It contains ten unit test cases for the {@link SimpleUserMgr#getUser(User)} method.
*/
class SimpleUserMgr_6Test {
		
    /**
     * Test method for {@link SimpleUserMgr#getUser(User)}.
     */
    @Test
    void testGetUser() {
        SimpleUserMgr testUserMgr = new SimpleUserMgr();
        testUserMgr.init();
        User user = testUserMgr.getUser();
        assertEquals(user.getEmail(), "<EMAIL>");
    }
}

// SimpleUserMgr_7Test.java
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
* It contains ten unit test cases for the {@link SimpleUserMgr#getUserIds()} method.
*/
class SimpleUserMgr_7Test {
		
    /**
     * Test method for {@link SimpleUserMgr#getUserIds()}.
     */
    @Test
    void testGetUserIds() {
        SimpleUserMgr testUserMgr = new SimpleUserMgr();
        testUserMgr.init();
        String[] userIds = testUserMgr.getUserIds();
        assertEquals(userIds.length, 3);
        assertEquals(userIds[0], "<EMAIL>");
        assertEquals(userIds[1], "<EMAIL>");
        assertEquals(userIds[2], "<EMAIL>");
    }
}

// SimpleUserMgr_8Test.java
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
* It contains ten unit test cases for the {@link SimpleUserMgr#getUserNames()} method.
*/
class SimpleUserMgr_8Test {
		
    /**
     * Test method for {@link SimpleUserMgr#getUserNames()}.
     */
    @Test
    void testGetUserNames() {
        SimpleUserMgr testUserMgr = new SimpleUserMgr();
        testUserMgr.init();
        String[] userNames = testUserMgr.getUserNames();
        assertEquals(userNames.length, 3);
        assertEquals(userNames[0], "user1");
        assertEquals(userNames[1], "user2");
        assertEquals(userNames[2], "user3");
    }
