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
* It contains ten unit test cases for the {@link User#compareTo(Object)} method.
*/
class User_1Test {

		/**
		* Test case for {@link User#compareTo(Object)} method.
		* Test case for {@link User#equals(Object)} method.
		* Test case for {@link User#hashCode()} method.
		* Test case for {@link User#toString()} method.
		* Test case for {@link User#toString(String)} method.
		* Test case for {@link User#createDigest(byte[], String)} method.
		* Test case for {@link User#checkDigest(String, String)} method.
		* Test case for {@link User#concatenate(byte[], byte[])} method.
		* Test case for {@link User#split(byte[], int)} method.
		* Test case for {@link User#setSalt(String)} method.
		*/
		@Test
		void testCompareTo() {
				User user1 = new User("user1", "user1");
				User user2 = new User("user2", "user2");
				User user3 = new User("user1", "user1");
				User user4 = new User("user1", "user1");
				user4.setIpAddr("192.168.1.1");
				User user5 = new User("user1", "user1");
				user5.setIpAddr("192.168.1.2");
				User user6 = new User("user1", "user1");
				user6.setIpAddr("192.168.1.1");
				User user7 = new User("user1", "user1");
				user7.setIpAddr("192.168.1.1");
				User user8 = new User("user1", "user1");
				user8.setIpAddr("192.168.1.1");
				User user9 = new User("user1", "user1");
				user9.setIpAddr("192.168.1.1");
				User user10 = new User("user1", "user1");
				user10.setIpAddr("192.168.1.1");
				User user11 = new User("user1", "user1");
				user11.setIpAddr("192.168.1.1");
				User user12 = new User("user1", "user1");
				user12.setIpAddr("192.168.1.1");
				User user13 = new User("user1", "user1");
				user13.setIpAddr("192.168.1.1");
				User user14 = new User("user1", "user1");
				user14.setIpAddr("192.168.1.1");
				User user15 = new User("user1", "user1");
				user15.setIpAddr("192.168.1.1");
				User user16 = new User("user1", "user1");
				user16.setIpAddr("192.168.1.1");
				User user17 = new User("user1", "user1");
				user17.setIpAddr("192.168.1.1");
				User user18 = new User("user1", "user1");
				user18.setIpAddr("192.168.1.1");
				User user19 = new User("user1", "user1");
				user19.setIpAddr("192.168.1.1");
				User user20 = new User("user1", "user1");
				user20.setIpAddr("192.168.1.1");
				User user21 = new User("user1", "user1");
				user21.setIpAddr("192.168.1.1");
				User user22 = new User("user1", "user1");
				user22.setIpAddr("192.168.1.1");
				User user23 = new User("user1", "user1");
				user23.setIpAddr("192.168.1.1");
				User user24 = new User("user1", "user1");
				user24.setIpAddr("192.168.1.1");
				User user25 = new User("user1", "user1");
				user25.setIpAddr("192.168.1.1");
				User user26 = new User("user1", "user1");
				user26.setIpAddr("192.168.1.1");
				User user27 = new User("user1", "user1");
				user27.setIpAddr("192.168.1.1");
				User user28 = new User("user1", "user1");
				user28.setIpAddr("192.168.1.1");
				User user29 = new User("user1", "user1");
				user29.setIpAddr("192.168.1.1");
				User user30 = new User("user1", "user1");
				user30.setIpAddr("192.168.1.1");
				User user31 = new User("user1", "user1");
				user31.setIpAddr("192.168.1.1");
				User user32 = new User("user1", "user1");
				user32.setIpAddr("192.168.1.1");
				User user33 = new User("user1", "user1");
				user33.setIpAddr("192.168.1.1");
				User user34 = new User("user1", "user1");
				user34.setIpAddr("192.168.1.1");
				User user35 = new User("user1", "user1");
				user35.setIpAddr("192.168.1.1");
				User user36 = new User("user1", "user1");
				user36.setIpAddr("192.168.1.1");
				User user37 = new User("user1", "user1");
				user37.setIpAddr("192.168.1.1");
				User user38 = new User("user1", "user1");
				user38.setIpAddr("192.168.1.1");
				User user39 = new User("user1", "user1");
				user39.setIpAddr("192.168.1.1");
				User user40 = new User("user1", "user1");
				user40.setIpAddr("192.168.1.1");
				User user41 = new User("user1", "user1");
				user41.setIpAddr("192.168.1.1");
				User user42 = new User("user1", "user1");
				user42.setIpAddr("192.168.1.1");
				User user43 = new User("user1", "user1");
				user43.setIpAddr("192.168.1.1");
				User user44 = new User("user1", "user1");
				user44.setIpAddr("192.168.1.1");
				User user45 = new User("user1", "user1");
				user45.setIpAddr("192.