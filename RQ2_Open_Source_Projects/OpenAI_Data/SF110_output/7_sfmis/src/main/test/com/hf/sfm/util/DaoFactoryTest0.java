// DaoFactoryTest0.java
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
class DaoFactoryTest0 {

		private static Log log = LogFactory.getLog(DaoFactory.class);
		
		public Session session = null;
		
		public CallableStatement ps = null;
		
		public ResultSet rs = null;
		
		public Connection conn = null;
		
		private Transaction tx = null;
		
		public DaoFactory() {
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
		 * Test case for {@link DaoFactory#encrypt(String)}
		 * Input: "123456"
		 * Expected: "MTIzNDU2"
		 */
		@Test
		public void testEncrypt0() {
				String str = "123456";
				String expected = "MTIzNDU2";
				String actual = encrypt(str);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DaoFactory#encrypt(String)}
		 * Input: "1234567"
		 * Expected: "MTIzNDU2Nw=="
		 */
		@Test
		public void testEncrypt1() {
				String str = "1234567";
				String expected = "MTIzNDU2Nw==";
				String actual = encrypt(str);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DaoFactory#encrypt(String)}
		 * Input: "12345678"
		 * Expected: "MTIzNDU2Nzg="
		 */
		@Test
		public void testEncrypt2() {
				String str = "12345678";
				String expected = "MTIzNDU2Nzg=";
				String actual = encrypt(str);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DaoFactory#encrypt(String)}
		 * Input: "123456789"
		 * Expected: "MTIzNDU2Nzg5"
		 */
		@Test
		public void testEncrypt3() {
				String str = "123456789";
				String expected = "MTIzNDU2Nzg5";
				String actual = encrypt(str);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DaoFactory#encrypt(String)}
		 * Input: "1234567890"
		 * Expected: "MTIzNDU2Nzg5MA=="
		 */
		@Test
		public void testEncrypt4() {
				String str = "1234567890";
				String expected = "MTIzNDU2Nzg5MA==";
				String actual = encrypt(str);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DaoFactory#encrypt(String)}
		 * Input: "12345678901"
		 * Expected: "MTIzNDU2Nzg5MDE="
		 */
		@Test
		public void testEncrypt5() {
				String str = "12345678901";
				String expected = "MTIzNDU2Nzg5MDE=";
				String actual = encrypt(str);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DaoFactory#encrypt(String)}
		 * Input: "123456789012"
		 * Expected: "MTIzNDU2Nzg5MDEy"
		 */
		@Test
		public void testEncrypt6() {
				String str = "123456789012";
				String expected = "MTIzNDU2Nzg5MDEy";
				String actual = encrypt(str);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DaoFactory#encrypt(String)}
		 * Input: "1234567890123"
		 * Expected: "MTIzNDU2Nzg5MDEyMw=="
		 */
		@Test
		public void testEncrypt7() {
				String str = "123456789