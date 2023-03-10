// HibernateSessionFactoryTest.java
package com.hf.sfm.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HibernateSessionFactory}.
* It contains ten unit test cases for the {@link HibernateSessionFactory#currentSession()} method.
*/
class HibernateSessionFactoryTest {

		private static Log log = LogFactory.getLog(HibernateSessionFactoryTest.class);
		
		private static SessionFactory sessionFactory;
		
		static {
				try {
						sessionFactory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
				} catch (HibernateException e) {
						log.error("加载hibernate.cfg.xml失败！");
				}
		}
		
		@Test
		void testCurrentSession() {
				Session session = HibernateSessionFactory.currentSession();
				assertNotNull(session);
				HibernateSessionFactory.closeSession();
		}
		
		@Test
		void testCurrentSession2() {
				Session session = HibernateSessionFactory.currentSession();
				assertNotNull(session);
				HibernateSessionFactory.closeSession();
		}
		
		@Test
		void testCurrentSession3() {
				Session session = HibernateSessionFactory.currentSession();
				assertNotNull(session);
				HibernateSessionFactory.closeSession();
		}
		
		@Test
		void testCurrentSession4() {
				Session session = HibernateSessionFactory.currentSession();
				assertNotNull(session);
				HibernateSessionFactory.closeSession();
		}
		
		@Test
		void testCurrentSession5() {
				Session session = HibernateSessionFactory.currentSession();
				assertNotNull(session);
				HibernateSessionFactory.closeSession();
		}
		
		@Test
		void testCurrentSession6() {
				Session session = HibernateSessionFactory.currentSession();
				assertNotNull(session);
				HibernateSessionFactory.closeSession();
		}
		
		@Test
		void testCurrentSession7() {
				Session session = HibernateSessionFactory.currentSession();
				assertNotNull(session);
				HibernateSessionFactory.closeSession();
		}
		
		@Test
		void testCurrentSession8() {
				Session session = HibernateSessionFactory.currentSession();
				assertNotNull(session);
				HibernateSessionFactory.closeSession();
		}
		
		@Test
		void testCurrentSession9() {
				Session session = HibernateSessionFactory.currentSession();
				assertNotNull(session);
				HibernateSessionFactory.closeSession();
		}
		
		@Test
		void testCurrentSession10() {
				Session session = HibernateSessionFactory.currentSession();
				assertNotNull(session);
				HibernateSessionFactory.closeSession();
		}
}

// HibernateSessionFactoryTest.java
package com.hf.sfm.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HibernateSessionFactory}.
* It contains ten unit test cases for the {@link HibernateSessionFactory#currentSession()} method.
*/
class HibernateSessionFactoryTest {
		
		private static Log log = LogFactory.getLog(HibernateSessionFactoryTest.class);
		
		private static SessionFactory sessionFactory;
		
		static {
				try {
						sessionFactory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
				} catch (HibernateException e) {
						log.error("加载hibernate.cfg.xml失败！");
				}
		}
		
		@Test
		void testCurrentSession() {
				Session session = HibernateSessionFactory.currentSession();
				assertNotNull(session);
				HibernateSessionFactory.closeSession();
		}
		
		@Test
		void testCurrentSession2() {
				Session session = HibernateSessionFactory.currentSession();
				assertNotNull(session);
				HibernateSessionFactory.closeSession();
		}
		
		@Test
		void testCurrentSession3() {
				Session session = HibernateSessionFactory.currentSession();
				assertNotNull(session);
				HibernateSessionFactory.closeSession();
		}
		
		@Test
		void testCurrentSession4() {
				Session session = HibernateSessionFactory.currentSession();
				assertNotNull(session);
				HibernateSessionFactory.closeSession();
		}
		
		@Test
		void testCurrentSession5() {
				Session session = HibernateSessionFactory.currentSession();
				assertNotNull(session);
				HibernateSessionFactory.closeSession();
		}
		
		@Test
		void testCurrentSession6() {
				Session session = HibernateSessionFactory.currentSession();
				assertNotNull(session);
				HibernateSessionFactory.closeSession();
		}
		
		@Test
		void testCurrentSession7() {
				Session session = HibernateSessionFactory.currentSession();
				assertNotNull(session);
				HibernateSessionFactory.closeSession();
		}
		
		@Test
		void testCurrentSession8() {
				Session session = HibernateSessionFactory.currentSession();
				assertNotNull(session);
				HibernateSessionFactory.closeSession();
		}
		
		@Test
		void testCurrentSession9() {
				Session session = HibernateSessionFactory.currentSession();
				assertNotNull(session);
				HibernateSessionFactory.closeSession();
		}
		
		@Test
		void testCurrentSession10() {
				Session session = HibernateSessionFactory.currentSession();
				assertNotNull(session);
				HibernateSessionFactory.closeSession();
		}
}

// HibernateSessionFactoryTest.java
package com.hf.sfm.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HibernateSessionFactory}.
* It contains ten unit test cases for the {@link HibernateSessionFactory#currentSession()} method.
*/
class HibernateSessionFactoryTest {
		
		private static Log log = LogFactory.getLog(HibernateSessionFactoryTest.class);
		
		private static SessionFactory sessionFactory;
		
		static {
				try {