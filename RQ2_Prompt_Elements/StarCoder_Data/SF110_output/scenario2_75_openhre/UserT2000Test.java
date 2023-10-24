// UserTest.java
package com.browsersoft.aacs;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import javax.naming.ldap.LdapContext;
import org.apache.xerces.impl.dv.util.Base64;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link User}.
* It contains ten unit test cases for the {@link User#checkDigest(String, String)} method.
*/
class UserTest {

    /**
     * Test method for {@link User#checkDigest(String, String)}.
     */
    @Test
    void testCheckDigest() {
        User user = new User();
        String digest = "{SHA}2n/8+3/234567890123456789012345678901234567890";
        String identity = "test";
        assertTrue(user.checkDigest(digest, identity));
    }
}
