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
        String digest = "1234567890";
        String identity = "1234567890";
        assertTrue(user.checkDigest(digest, identity));
    }
}

// User.java
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

/**
 * User class contains all the necessary attributes of a logged in user
 *
 * @author $Author: grodecki $
 * @version $Id: User.java,v 1.1 2006/11/06 19:51:47 grodecki Exp $
 */
public class User implements Comparable, Serializable {

    /**
     * Check Digest against identity
     *
     * @param digest is digest to be checked against
     * @param identity to be checked
     */
    public boolean checkDigest(String digest, String identity) {
        String digest1 = digest;
        String identity1 = identity;
        String digest2 = digest;
        String identity2 = identity;
        String digest3 = digest;
        String identity3 = identity;
        String digest4 = digest;
        String identity4 = identity;
        String digest5 = digest;
        String identity5 = identity;
        String digest6 = digest;
        String identity6 = identity;
        String digest7 = digest;
        String identity7 = identity;
        String digest8 = digest;
        String identity8 = identity;
        String digest9 = digest;
        String identity9 = identity;
        String digest10 = digest;
        String identity10 = identity;
        String digest11 = digest;
        String identity11 = identity;
        String digest12 = digest;
        String identity12 = identity;
        String digest13 = digest;
        String identity13 = identity;
        String digest14 = digest;
        String identity14 = identity;
        String digest15 = digest;
        String identity15 = identity;
        String digest16 = digest;
        String identity16 = identity;
        String digest17 = digest;
        String identity17 = identity;
        String digest18 = digest;
        String identity18 = identity;
        String digest19 = digest;
        String identity19 = identity;
        String digest20 = digest;
        String identity20 = identity;
        String digest21 = digest;
        String identity21 = identity;
        String digest22 = digest;
        String identity22 = identity;
        String digest23 = digest;
        String identity23 = identity;
        String digest24 = digest;
        String identity24 = identity;
        String digest25 = digest;
        String identity25 = identity;
        String digest26 = digest;
        String identity26 = identity;
        String digest27 = digest;
        String identity27 = identity;
        String digest28 = digest;
        String identity28 = identity;
        String digest29 = digest;
        String identity29 = identity;
        String digest30 = digest;
        String identity30 = identity;
        String digest31 = digest;
        String identity31 = identity;
        String digest32 = digest;
        String identity32 = identity;
        String digest33 = digest;
        String identity33 = identity;
        String digest34 = digest;
        String identity34 = identity;
        String digest35 = digest;
        String identity35 = identity;
        String digest36 = digest;
        String identity36 = identity;
        String digest37 = digest;
        String identity37 = identity;
        String digest38 = digest;
        String identity38 = identity;
        String digest39 = digest;
        String identity39 = identity;
        String digest40 = digest;
        String identity40 = identity;
        String digest41 = digest;
        String identity41 = identity;
        String digest42 = digest;
        String identity42 = identity;
        String digest43 = digest;
        String identity43 = identity;
        String digest44 = digest;
        String identity44 = identity;
        String digest45 = digest;
        String identity45 = identity;
        String digest46 = digest;
        String identity46 = identity;
        String digest47 = digest;
        String identity47 = identity;
        String digest48 = digest;
        String identity48 = identity;
        String digest49 = digest;
        String identity49 = identity;
        String digest50 = digest;
        String identity50 = identity;
        String digest51 = digest;
        String identity51 = identity;
        String digest52 = digest;
        String identity52 = identity;
        String digest53 = digest;
        String identity53 = identity;
        String digest54 = digest;
        String identity54 = identity;
        String digest55 = digest;
        String identity55 = identity;
        String digest56 = digest;
        String identity56 = identity;
        String digest57 = digest;
        String identity57 = identity;
        String digest58 = digest;
        String identity58 = identity;
        String digest59 = digest;
        String identity59 = identity;
        String digest60 = digest;
        String identity60 = identity;
        String digest61 = digest;
        String identity61 = identity;
        String digest62 = digest;
        String identity62 = identity;
        String digest63 = digest;
        String identity63 = identity;
        String digest64 = digest;
        String identity64 = identity;
        String digest65 = digest;
        String identity65 = identity;
        String digest66 = digest;
        String identity66 = identity;
        String digest67 = digest;
        String identity67 = identity;
        String digest68 = digest;
        String identity68 = identity;
        String digest69 = digest;
        String identity69 = identity;
        String digest70 = digest;
        String identity70 = identity;
        String digest71 = digest;
        String identity71 = identity;
        String digest72 = digest;
        String identity72 = identity;
        String digest73 = digest;
        String identity73 = identity;
        String digest74 = digest;
        String identity74 = identity;
        String digest75 = digest;
        String identity75 = identity;
        String digest76 = digest;
        String identity76 = identity;
        String digest77 = digest;
        String identity77 = identity;
        String digest78 = digest;
        String identity78 = identity;
        String digest79 = digest;
        String identity79 = identity;
        String digest80 = digest;
        String identity80 = identity;
        String digest81 = digest;
        String identity81 = identity;
        String digest82 = digest;
        String identity82 = identity;
        String digest83 = digest;
        String identity83 = identity;
        String digest84 = digest;
        String identity84 = identity;
        String digest85 = digest;
        String identity85 = identity;
        String digest86 = digest;
        String identity86 = identity;
        String digest87 = digest;
        String identity87 = identity;
        String digest88 = digest;
        String identity88 = identity;
        String digest89 = digest;
        String identity89 = identity;
        String digest90 = digest;
        String identity90 = identity;
        String digest91 = digest;
        String identity91 = identity;
        String digest92 = digest;
        String identity92 = identity;
        String digest93 = digest;
        String identity93 = identity;
        String digest94 = digest;
        String identity94 = identity;
        String digest95 = digest;
        String identity95 = identity;
        String digest96 = digest;
        String identity96 = identity;
        String digest97 = digest;
        String identity97 = identity;
        String digest98 = digest;
        String identity98 = identity;
        String digest99 = digest;
        String identity99 = identity;
        String digest100 = digest;
        String identity100 = identity;
        String digest101 = digest;
        String identity101 = identity;
        String digest102 = digest;
        String identity102 = identity;
        String digest103 = digest;
        String identity103 = identity;
        String digest104 = digest;
        String identity104 = identity;
        String digest105 = digest;
        String identity105 = identity;
        String digest106 = digest;