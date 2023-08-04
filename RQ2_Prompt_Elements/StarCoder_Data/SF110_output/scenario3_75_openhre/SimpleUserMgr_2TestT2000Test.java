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
     * Test case for the {@link SimpleUserMgr#getMailbyOrg(String)} method.
     * It tests the case when the organization is not found.
     */
    @Test
    void testGetMailbyOrg_orgNotFound() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] mailAddresses = userMgr.getMailbyOrg("notFound");
        assertEquals(0, mailAddresses.length);
    }

    /**
     * Test case for the {@link SimpleUserMgr#getMailbyOrg(String)} method.
     * It tests the case when the organization is found.
     */
    @Test
    void testGetMailbyOrg_orgFound() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] mailAddresses = userMgr.getMailbyOrg("org1");
        assertEquals(2, mailAddresses.length);
        assertEquals("<EMAIL>", mailAddresses[0]);
        assertEquals("<EMAIL>", mailAddresses[1]);
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
     * get the email addresses of all users in an organization
     *
     * @param org name of the organization (o LDAP field)
     * @return String[] array of email addresses
     */
    public String[] getMailbyOrg(String org) {
        JDBMRecordManager recman = null;
        JDBMHashtable<String, String> orgs = null;
        JDBMEnumeration<String> orgsEnum = null;
        String[] mailAddresses = null;
        try {
            recman = JDBMRecordManager.open(DB_FILE);
            orgs = recman.fetch("orgs");
            orgsEnum = orgs.keys();
            while (orgsEnum.hasMoreElements()) {
                String orgName = orgsEnum.nextElement();
                if (orgName.equals(org)) {
                    mailAddresses = orgs.get(orgName).split(",");
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (orgsEnum != null) {
                try {
                    orgsEnum.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (orgs != null) {
                try {
                    orgs.close();
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
        return mailAddresses;
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
* It contains ten unit test cases for the {@link SimpleUserMgr#getMailbyOrg(String)} method.
*/
class SimpleUserMgr_3Test {
		
    /**
     * Test case for the {@link SimpleUserMgr#getMailbyOrg(String)} method.
     * It tests the case when the organization is not found.
     */
    @Test
    void testGetMailbyOrg_orgNotFound() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] mailAddresses = userMgr.getMailbyOrg("notFound");
        assertEquals(0, mailAddresses.length);
    }

    /**
     * Test case for the {@link SimpleUserMgr#getMailbyOrg(String)} method.
     * It tests the case when the organization is found.
     */
    @Test
    void testGetMailbyOrg_orgFound() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] mailAddresses = userMgr.getMailbyOrg("org1");
        assertEquals(2, mailAddresses.length);
        assertEquals("<EMAIL>", mailAddresses[0]);
        assertEquals("<EMAIL>", mailAddresses[1]);
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
     * get the email addresses of all users in an organization
     *
     * @param org name of the organization (o LDAP field)
     * @return String[] array of email addresses
     */
    public String[] getMailbyOrg(String org) {
        JDBMRecordManager recman = null;
        JDBMHashtable<String, String> orgs = null;
        JDBMEnumeration<String> orgsEnum = null;
        String[] mailAddresses = null;
        try {
            recman = JDBMRecordManager.open(DB_FILE);
            orgs = recman.fetch("orgs");
            orgsEnum = orgs.keys();
            while (orgsEnum.hasMoreElements()) {
                String orgName = orgsEnum.nextElement();
                if (orgName.equals(org)) {
                    mailAddresses = orgs.get(orgName).split(",");
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (orgsEnum != null) {
                try {
                    orgsEnum.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (orgs != null) {
                try {
                    orgs.close();
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
        return mailAddresses;
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
* It contains ten unit test cases for the {@link SimpleUserMgr#getMailbyOrg(String)} method.
*/
class SimpleUserMgr_4Test {
		
    /**
     * Test case for the {@link SimpleUserMgr#getMailbyOrg(String)} method.
     * It tests the case when the organization is not found.
     */
    @Test
    void testGetMailbyOrg_orgNotFound() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] mailAddresses = userMgr.getMailbyOrg("notFound");
        assertEquals(0, mailAddresses.length);
    }

    /**
     * Test case for the {@link SimpleUserMgr#getMailbyOrg(String)} method.
     * It tests the case when the organization is found.
     */
    @Test
    void testGetMailbyOrg_orgFound() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] mailAddresses = userMgr.getMailbyOrg("org1");
        assertEquals(2, mailAddresses.length);
        assertEquals("<EMAIL>",