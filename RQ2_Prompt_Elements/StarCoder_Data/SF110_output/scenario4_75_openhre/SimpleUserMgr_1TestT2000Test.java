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
* It contains ten unit test cases for the {@link SimpleUserMgr#getNamesbyOrg(String)} method.
*/
class SimpleUserMgr_1Test {

    /**
     * Test method for {@link SimpleUserMgr#getNamesbyOrg(String)}.
     */
    @Test
    void testGetNamesbyOrg() {
        SimpleUserMgr test = new SimpleUserMgr();
        test.init();
        String[] names = test.getNamesbyOrg("org1");
        assertEquals(names.length, 2);
        assertEquals(names[0], "user1");
        assertEquals(names[1], "user2");
        names = test.getNamesbyOrg("org2");
        assertEquals(names.length, 1);
        assertEquals(names[0], "user3");
        names = test.getNamesbyOrg("org3");
        assertEquals(names.length, 0);
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
* It contains ten unit test cases for the {@link SimpleUserMgr#getMailbyOrg(String)} method.
*/
class SimpleUserMgr_2Test {
		
    /**
     * Test method for {@link SimpleUserMgr#getMailbyOrg(String)}.
     */
    @Test
    void testGetMailbyOrg() {
        SimpleUserMgr test = new SimpleUserMgr();
        test.init();
        String[] names = test.getMailbyOrg("org1");
        assertEquals(names.length, 2);
        assertEquals(names[0], "<EMAIL>");
        assertEquals(names[1], "<EMAIL>");
        names = test.getMailbyOrg("org2");
        assertEquals(names.length, 1);
        assertEquals(names[0], "<EMAIL>");
        names = test.getMailbyOrg("org3");
        assertEquals(names.length, 0);
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
* It contains ten unit test cases for the {@link SimpleUserMgr#getUserIds()} method.
*/
class SimpleUserMgr_3Test {
		
    /**
     * Test method for {@link SimpleUserMgr#getUserIds()}.
     */
    @Test
    void testGetUserIds() {
        SimpleUserMgr test = new SimpleUserMgr();
        test.init();
        String[] names = test.getUserIds();
        assertEquals(names.length, 3);
        assertEquals(names[0], "<EMAIL>");
        assertEquals(names[1], "<EMAIL>");
        assertEquals(names[2], "<EMAIL>");
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
* It contains ten unit test cases for the {@link SimpleUserMgr#getUserNames()} method.
*/
class SimpleUserMgr_4Test {
		
    /**
     * Test method for {@link SimpleUserMgr#getUserNames()}.
     */
    @Test
    void testGetUserNames() {
        SimpleUserMgr test = new SimpleUserMgr();
        test.init();
        String[] names = test.getUserNames();
        assertEquals(names.length, 3);
        assertEquals(names[0], "user1");
        assertEquals(names[1], "user2");
        assertEquals(names[2], "user3");
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
* It contains ten unit test cases for the {@link SimpleUserMgr#getUser(String, String)} method.
*/
class SimpleUserMgr_5Test {
		
    /**
     * Test method for {@link SimpleUserMgr#getUser(String, String)}.
     */
    @Test
    void testGetUser() {
        SimpleUserMgr test = new SimpleUserMgr();
        test.init();
        User user = test.getUser("user1", "org1");
        assertEquals(user.getDN(), "cn=user1,o=org1,c=us");
        assertEquals(user.getCn(), "user1");
        assertEquals(user.getSn(), "user1");
        assertEquals(user.getEmail(), "<EMAIL>");
        assertEquals(user.getRole(), "user");
        assertEquals(user.getPassword(), "<PASSWORD>");
        user = test.getUser("user2", "org1");
        assertEquals(user.getDN(), "cn=user2,o=org1,c=us");
        assertEquals(user.getCn(), "user2");
        assertEquals(user.getSn(), "user2");
        assertEquals(user.getEmail(), "<EMAIL>");
        assertEquals(user.getRole(), "user");
        assertEquals(user.getPassword(), "<PASSWORD>");
        user = test.getUser("user3", "org1");
        assertNull(user);
        user = test.getUser("user1", "org2");
        assertEquals(user.getDN(), "cn=user1,o=org2,c=us");
        assertEquals(user.getCn(), "user1");
        assertEquals(user.getSn(), "user1");
        assertEquals(user.getEmail(), "<EMAIL>");
        assertEquals(user.getRole(), "user");
        assertEquals(user.getPassword(), "<PASSWORD>");
        user = test.getUser("user2", "org2");
        assertNull(user);
        user = test.getUser("user3", "org2");
        assertNull(user);
        user = test.getUser("user1", "org3");
        assertNull(user);
        user = test.getUser("user2", "org3");
        assertNull(user);
        user = test.getUser("user3", "org3");
        assertNull(user);
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
