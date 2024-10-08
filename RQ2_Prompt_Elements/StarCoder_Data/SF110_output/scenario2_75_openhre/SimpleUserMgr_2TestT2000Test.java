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
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] mailAddresses = userMgr.getMailbyOrg("org1");
        assertEquals(2, mailAddresses.length);
        assertEquals("<EMAIL>", mailAddresses[0]);
        assertEquals("<EMAIL>", mailAddresses[1]);
    }
}
