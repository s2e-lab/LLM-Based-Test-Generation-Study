// DaoFactory_0Test.java
package com.hf.sfm.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 * 此类主要是提供一些常用的方法使用，已在DaoFactoryUtil.java中实例化，业务类只需要继承于DaoFactoryUtil即可调用
 */
import com.hf.sfm.crypt.Base64;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DaoFactory}.
* It contains ten unit test cases for the {@link DaoFactory#encrypt(String)} method.
*/
class DaoFactory_0Test {

		private static Log log = LogFactory.getLog(DaoFactory.class);

		public Session session = null;

		public CallableStatement ps = null;

		public ResultSet rs = null;

		public Connection conn = null;

		private Transaction tx = null;

		public DaoFactory_0Test() {
		}

		/**
		 * 创建会话session
		 */
		public void currentSession() {
				this.session = HibernateSessionFactory.currentSession();
		}

		/**
		 * 关闭session
		 */
		public void closeSession() {
				HibernateSessionFactory.closeSession();
		}

		/**
		 * 提交事务并关闭相关资源
		 */
		public void commit() {
				this.tx.commit();
				closeAll();
		}

		/**
		 * 创建session开启事务
		 */
		public void beginTransaction() {
				currentSession();
				tx = this.session.beginTransaction();
		}

		/**
		 * 回滚事务
		 */
		public void rollback() {
				tx.rollback();
		}

		/**
		 * 密码加密
		 */
		public String encrypt(String str) {
				return Base64.byteArrayToBase64(str.getBytes());
		}

		/**
		 * 密码解密
		 */
		public String decrypt(String s) {
				return new String(Base64.base64ToByteArray(s));
		}

		/**
		 * 持久化一个对象
		 * @param obj
		 */
		public void save(Object obj) {
				session.save(obj);
		}

		/**
		 * 更新一个对象
		 * @param obj
		 */
		public void update(Object obj) {
				session.update(obj);
		}

		/**
		 * 关闭数据库操作所使用的相关资源
		 */
		public void closeAll() {
				if (rs != null) {
						try {
								rs.close();
						} catch (SQLException e) {
								e.printStackTrace();
						}
				}
				if (ps != null) {
						try {
								ps.close();
						} catch (SQLException e) {
								e.printStackTrace();
						}
				}
				if (conn != null) {
						try {
								conn.close();
						} catch (SQLException e) {
								e.printStackTrace();
						}
				}
				if (session != null) {
						session.close();
				}
		}
		
		/**
		 * Test case for the {@link DaoFactory#encrypt(String)} method.
		 * This test case is used to test the {@link DaoFactory#encrypt(String)} method.
		 * The test case is passed if the method returns the correct value.
		 */
		@Test
		public void testEncrypt_0() {
				String str = "123456";
				String result = encrypt(str);
				assertEquals("MTIzNDU2", result);
		}
		
		/**
		 * Test case for the {@link DaoFactory#encrypt(String)} method.
		 * This test case is used to test the {@link DaoFactory#encrypt(String)} method.
		 * The test case is passed if the method returns the correct value.
		 */
		@Test
		public void testEncrypt_1() {
				String str = "1234567";
				String result = encrypt(str);
				assertEquals("MTIzNDU2Nw==", result);
		}
		
		/**
		 * Test case for the {@link DaoFactory#encrypt(String)} method.
		 * This test case is used to test the {@link DaoFactory#encrypt(String)} method.
		 * The test case is passed if the method returns the correct value.
		 */
		@Test
		public void testEncrypt_2() {
				String str = "12345678";
				String result = encrypt(str);
				assertEquals("MTIzNDU2Nzg=", result);
		}
		
		/**
		 * Test case for the {@link DaoFactory#encrypt(String)} method.
		 * This test case is used to test the {@link DaoFactory#encrypt(String)} method.
		 * The test case is passed if the method returns the correct value.
		 */
		@Test
		public void testEncrypt_3() {
				String str = "123456789";
				String result = encrypt(str);
				assertEquals("MTIzNDU2Nzg5", result);
		}
		
		/**
		 * Test case for the {@link DaoFactory#encrypt(String)} method.
		 * This test case is used to test the {@link DaoFactory#encrypt(String)} method.
		 * The test case is passed if the method returns the correct value.
		 */
		@Test
		public void testEncrypt_4() {
				String str = "1234567890";
				String result = encrypt(str);
				assertEquals("MTIzNDU2Nzg5MA==", result);
		}
		
		/**
		 * Test case for the {@link DaoFactory#encrypt(String)} method.
		 * This test case is used to test the {@link DaoFactory#encrypt(String)} method.
		 * The test case is passed if the method returns the correct value.
		 */
		@Test
		public void testEncrypt_5() {
				String str = "12345678901";
				String result = encrypt(str);
				assertEquals("MTIzNDU2Nzg5MDE=", result);
		}
		
		/**
		 * Test case for the {@link DaoFactory#encrypt(String)} method.
		 * This test case is used to test the {@link DaoFactory#encrypt(String)} method.
		 * The test case is passed if the method returns the correct value.
		 */
		@Test
		public void testEncrypt_6() {
				String str = "123456789012";
				String result = encrypt(str);
				assertEquals("MTIzNDU2Nzg5MDEy", result);
		}
		
		/**
		 * Test case for the {@link DaoFactory#encrypt(String)} method.
		 * This test case is used to test the {@link DaoFactory#encrypt(String)} method.
		 * The test case is passed if the method returns the correct value.
		 */
		@Test
		public void testEncrypt_7() {
				String str = "1234567890123";
				String result = encrypt(str);
				assertEquals("MTIzNDU2Nzg5MDEyMw==", result);
		}
		
		/**
		 * Test case for the {@link DaoFactory#encrypt(String)} method.
		 * This test case is used to test the {@link DaoFactory#encrypt(String)} method.
		 * The test case is passed if the method returns the correct value.
		 */
		@Test
		public void testEncrypt_8() {
				String str = "12345678901234";
				String result = encrypt(str);
				assertEquals("MTIzNDU2Nzg5MDEyMzQ=", result);
		}
		
		/**
		 * Test case for the {@link DaoFactory#encrypt(String)} method.
		 * This test case is used to test the {@link DaoFactory#encrypt(String)} method.
		 * The test case is passed if the method returns the correct value.
		 */
		@Test
		public void testEncrypt_9() {
				String str = "123456789012345";
				String result = encrypt(str);
				assertEquals("MTIzNDU2Nzg5MDEyMzQ1", result);
		}
		
}

// DaoFactory_1Test.java
package com.hf.sfm.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 * 此类主要是提供一些常用的方法使用，已在DaoFactoryUtil.java中实例化，业务类只需要继承于DaoFactoryUtil即可调用
 */
import com.hf.sfm.crypt.Base64;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DaoFactory}.
* It contains ten unit test cases for the {@link DaoFactory#decrypt(String)} method.
*/
class DaoFactory_1Test {
		
		private static Log log = LogFactory.getLog(DaoFactory.class);

		public Session session = null;

		public CallableStatement ps = null;

		public ResultSet rs = null;

		public Connection conn = null;

		private Transaction tx = null;

		public DaoFactory_1Test() {
		}

		/**
		 * 创建会话session
		 */
		public void currentSession() {
				this.session = HibernateSessionFactory.currentSession();
		}

		/**
		 * 关闭session
		 */
		public void closeSession() {
				HibernateSessionFactory.closeSession();
		}

		/**
		 * 提交事务并关闭相关资源
		 */
		public void commit() {
				this.tx.commit();
				closeAll();
		}

		/**
		 * 创建session开启事务
		 */
		public void beginTransaction() {
				currentSession();
				tx = this.session.beginTransaction();
		}

		/**
		 * 回滚事务
		 */
		public void rollback() {
				tx.rollback();
		}

		/**
		 * 密码加密
		 */
		public String encrypt(String str) {
				return Base64.byteArrayToBase64(str.getBytes());
		}

		/**
		 * 密码解密
		 */
		public String decrypt(String s) {
				return new String(Base64.base64ToByteArray(s));
		}

		/**
		 * 持久化一个对象
		 * @param obj
		 */
		public void save(Object obj) {
				session.save(obj);
		}

		/**
		 * 更新一个对象
		 * @param obj
		 */
		public void update(Object obj) {
				session.update(obj);
		}

		/**
		 * 关闭数据库操作所使用的相关资源
		 */
		public void closeAll() {
				if (rs != null) {
						try {
								rs.close();
						} catch (SQLException e) {
								e.printStackTrace();
						}
				}
				if (ps != null) {
						try {
								ps.close();
						} catch (SQLException e) {
								e.printStackTrace();
						}
				}
				if (conn != null) {
						try {
								conn.close();
						} catch (SQLException e) {
								e.printStackTrace();
						}
				}
				if (session != null) {
						session.close();
				}
		}
		
		/**
		 * Test case for the {@link DaoFactory#decrypt(String)} method.
		 * This test case is used to test the {@link DaoFactory#decrypt(String)} method.
		 * The test case is passed if the method returns the correct value.
		 */
		@Test
		public void testDecrypt_0() {
				String s = "MTIzNDU2";
				String result = decrypt(s);
				assertEquals("123456", result);
		}
		
		/**
		 * Test case for the {@link DaoFactory#decrypt(String)} method.
		 * This test case is used to test the {@link DaoFactory#decrypt(String)} method.
		 * The test case is passed if the method returns the correct value.
		 */
		@Test
		public void testDecrypt_1() {
				String s = "MTIzNDU2Nw==";
				String result = decrypt(s);
				assertEquals("1234567", result);
		}
		
		/**
		 * Test case for the {@link DaoFactory#decrypt(String)} method.
		 * This test case is used to test the {@link DaoFactory#decrypt(String)} method.
		 * The test case is passed if the method returns the correct value.
	