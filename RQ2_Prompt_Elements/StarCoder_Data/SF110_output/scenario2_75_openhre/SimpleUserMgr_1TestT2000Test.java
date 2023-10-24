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
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] names = userMgr.getNamesbyOrg("org1");
        assertEquals(2, names.length);
        assertEquals("user1", names[0]);
        assertEquals("user2", names[1]);
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
* It contains ten unit test cases for the {@link SimpleUserMgr#getNamesbyOrg(String)} method.
*/
class SimpleUserMgr_2Test {
		
    /**
     * Test method for {@link SimpleUserMgr#getNamesbyOrg(String)}.
     */
    @Test
    void testGetNamesbyOrg() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] names = userMgr.getNamesbyOrg("org2");
        assertEquals(1, names.length);
        assertEquals("user3", names[0]);
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
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] names = userMgr.getNamesbyOrg("org3");
        assertEquals(0, names.length);
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
* It contains ten unit test cases for the {@link SimpleUserMgr#getNamesbyOrg(String)} method.
*/
class SimpleUserMgr_4Test {
		
    /**
     * Test method for {@link SimpleUserMgr#getNamesbyOrg(String)}.
     */
    @Test
    void testGetNamesbyOrg() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] names = userMgr.getNamesbyOrg("org4");
        assertEquals(0, names.length);
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
* It contains ten unit test cases for the {@link SimpleUserMgr#getNamesbyOrg(String)} method.
*/
class SimpleUserMgr_5Test {
		
    /**
     * Test method for {@link SimpleUserMgr#getNamesbyOrg(String)}.
     */
    @Test
    void testGetNamesbyOrg() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] names = userMgr.getNamesbyOrg("org5");
        assertEquals(0, names.length);
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
* It contains ten unit test cases for the {@link SimpleUserMgr#getNamesbyOrg(String)} method.
*/
class SimpleUserMgr_6Test {
		
    /**
     * Test method for {@link SimpleUserMgr#getNamesbyOrg(String)}.
     */
    @Test
    void testGetNamesbyOrg() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] names = userMgr.getNamesbyOrg("org6");
        assertEquals(0, names.length);
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
* It contains ten unit test cases for the {@link SimpleUserMgr#getNamesbyOrg(String)} method.
*/
class SimpleUserMgr_7Test {
		
    /**
     * Test method for {@link SimpleUserMgr#getNamesbyOrg(String)}.
     */
    @Test
    void testGetNamesbyOrg() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] names = userMgr.getNamesbyOrg("org7");
        assertEquals(0, names.length);
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
import java.util.