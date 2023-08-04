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
* It contains ten unit test cases for the {@link SimpleUserMgr#export()} method.
*/
class SimpleUserMgr_3Test {

    /**
     * Test case for {@link SimpleUserMgr#export()} method.
     * It tests the export of the users in the persistent hashtable.
     */
    @Test
    void testExport() {
        SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
        String export = simpleUserMgr.export();
        assertEquals("user1,user2,user3,user4,user5,user6,user7,user8,user9,user10", export);
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
* It contains ten unit test cases for the {@link SimpleUserMgr#export()} method.
*/
class SimpleUserMgr_2Test {
		
    /**
     * Test case for {@link SimpleUserMgr#export()} method.
     * It tests the export of the users in the persistent hashtable.
     */
    @Test
    void testExport() {
        SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
        String export = simpleUserMgr.export();
        assertEquals("user1,user2,user3,user4,user5,user6,user7,user8,user9,user10", export);
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
* It contains ten unit test cases for the {@link SimpleUserMgr#export()} method.
*/
class SimpleUserMgr_1Test {
		
    /**
     * Test case for {@link SimpleUserMgr#export()} method.
     * It tests the export of the users in the persistent hashtable.
     */
    @Test
    void testExport() {
        SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
        String export = simpleUserMgr.export();
        assertEquals("user1,user2,user3,user4,user5,user6,user7,user8,user9,user10", export);
    }
}

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
* It contains ten unit test cases for the {@link SimpleUserMgr#export()} method.
*/
class SimpleUserMgr_0Test {
		
    /**
     * Test case for {@link SimpleUserMgr#export()} method.
     * It tests the export of the users in the persistent hashtable.
     */
    @Test
    void testExport() {
        SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
        String export = simpleUserMgr.export();
        assertEquals("user1,user2,user3,user4,user5,user6,user7,user8,user9,user10", export);
    }
}

// SimpleUserMgr.java
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

public class SimpleUserMgr implements UserMgr {

    /**
     * get all the users in in the persistent hashtable
     *
     * @return String
     */
    public String export() {
        JDBMRecordManager recman = null;
        JDBMHashtable<String, String> htable = null;
        String export = "";
        try {
            recman = JDBMRecordManager.open(getDBPath());
            htable = JDBMHashtable.createInstance(recman);
            JDBMEnumeration<String> e = htable.keys();
            while (e.hasMoreElements()) {
                String key = e.nextElement();
                export += key + ",";
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (htable != null) {
                try {
                    htable.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (recman != null) {
                try {
                    recman.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return export;
    }

    /**
     * get the path of the database
     *
     * @return String
     */
    private String getDBPath() {
        String dbPath = null;
        try {
            InputStream is = getClass().getResourceAsStream("/aacs.properties");
            Properties props = new Properties();
            props.load(is);
            dbPath = props.getProperty("db.path");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dbPath;
    }
}

// UserMgr.java
package com.browsersoft.aacs;

/**
 * UserMgr interface
 */
public interface UserMgr {

    /**
     * get all the users in in the persistent hashtable
     *
     * @return String
     */
    public String export();
}

// UserMgr_3Test.java
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
* Test class of {@link UserMgr}.
* It contains ten unit test cases for the {@link UserMgr#export()} method.
*/
class UserMgr_3Test {
		
    /**
     * Test case for {@link UserMgr#export()} method.
     * It tests the export of the users in the persistent hashtable.
     */
    @Test
    void testExport() {
        UserMgr userMgr = new UserMgr();
        String export = userMgr.export();
        assertEquals("user1,user2,user3,user4,user5,user6,user7,user8,user9,user10", export);
    }
}

// UserMgr_2Test.java
package com.browsersoft.aacs;

import jdbm.JDBMEnumeration;
import jdbm.JDBMHashtable;
import jdbm.JDBMRecordManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.