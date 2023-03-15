// User_0Test.java
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
* It contains ten unit test cases for the {@link User#checkPassword(String)} method.
*/
class User_0Test {

		/**
		* Test case for {@link User#checkPassword(String)} method.
		* Test case for checking the password.
		*/
		@Test
		public void testCheckPassword() {
				User user = new User();
				user.setPassword("{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=");
				assertTrue(user.checkPassword("secret"));
		}
		
		/**
		* Test case for {@link User#checkPassword(String)} method.
		* Test case for checking the password.
		*/
		@Test
		public void testCheckPassword2() {
				User user = new User();
				user.setPassword("{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=");
				assertFalse(user.checkPassword("secret2"));
		}
		
		/**
		* Test case for {@link User#checkPassword(String)} method.
		* Test case for checking the password.
		*/
		@Test
		public void testCheckPassword3() {
				User user = new User();
				user.setPassword("{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=");
				assertFalse(user.checkPassword(""));
		}
		
		/**
		* Test case for {@link User#checkPassword(String)} method.
		* Test case for checking the password.
		*/
		@Test
		public void testCheckPassword4() {
				User user = new User();
				user.setPassword("{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=");
				assertFalse(user.checkPassword(null));
		}
		
		/**
		* Test case for {@link User#checkPassword(String)} method.
		* Test case for checking the password.
		*/
		@Test
		public void testCheckPassword5() {
				User user = new User();
				user.setPassword("{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=");
				assertFalse(user.checkPassword("{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g="));
		}
		
		/**
		* Test case for {@link User#checkPassword(String)} method.
		* Test case for checking the password.
		*/
		@Test
		public void testCheckPassword6() {
				User user = new User();
				user.setPassword("{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=");
				assertFalse(user.checkPassword("{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g"));
		}
		
		/**
		* Test case for {@link User#checkPassword(String)} method.
		* Test case for checking the password.
		*/
		@Test
		public void testCheckPassword7() {
				User user = new User();
				user.setPassword("{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=");
				assertFalse(user.checkPassword("{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=="));
		}
		
		/**
		* Test case for {@link User#checkPassword(String)} method.
		* Test case for checking the password.
		*/
		@Test
		public void testCheckPassword8() {
				User user = new User();
				user.setPassword("{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=");
				assertFalse(user.checkPassword("{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g==="));
		}
		
		/**
		* Test case for {@link User#checkPassword(String)} method.
		* Test case for checking the password.
		*/
		@Test
		public void testCheckPassword9() {
				User user = new User();
				user.setPassword("{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=");
				assertFalse(user.checkPassword("{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g===="));
		}
		
		/**
		* Test case for {@link User#checkPassword(String)} method.
		* Test case for checking the password.
		*/
		@Test
		public void testCheckPassword10() {
				User user = new User();
				user.setPassword("{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=");
				assertFalse(user.checkPassword("{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g====="));
		}
}

// User_1Test.java
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
* It contains ten unit test cases for the {@link User#checkPassword(String)} method.
*/
class User_1Test {
		
		/**
		* Test case for {@link User#checkPassword(String)} method.
		* Test case for checking the password.
		*/
		@Test
		public void testCheckPassword() {
				User user = new User();
				user.setPassword("{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=");
				assertTrue(user.checkPassword("secret"));
		}
		
		/**
		* Test case for {@link User#checkPassword(String)} method.
		* Test case for checking the password.
		*/
		@Test
		public void testCheckPassword2() {
				User user = new User();
				user.setPassword("{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=");
				assertFalse(user.checkPassword("secret2"));
		}
		
		/**
		* Test case for {@link User#checkPassword(String)} method.
		* Test case for checking the password.
		*/
		@Test
		public void testCheckPassword3() {
				User user = new User();
				user.setPassword("{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=");
				assertFalse(user.checkPassword(""));
		}
		
		/**
		* Test case for {@link User#checkPassword(String)} method.
		* Test case for