// OracleFormationDaoTest.java
package fr.unice.gfarce.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TemporalType;
import java.util.*;
import fr.unice.gfarce.identity.Formation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OracleFormationDao}.
* It contains ten unit test cases for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
*/
class OracleFormationDaoTest {

		String persistUnitName = "Identite";
		
		@PersistenceContext
		private EntityManager em;
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name and the date are null.
		*/
		@Test
		void testFindFormationNameDateNull() {
				OracleFormationDao dao = new OracleFormationDao();
				Formation[] result = dao.findFormation(null, null);
				assertNotNull(result);
				assertEquals(result.length, 2);
		}
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name is null and the date is not null.
		*/
		@Test
		void testFindFormationNameNullDateNotNull() {
				OracleFormationDao dao = new OracleFormationDao();
				Calendar date = Calendar.getInstance();
				date.set(2019, Calendar.JANUARY, 1);
				Formation[] result = dao.findFormation(null, date);
				assertNotNull(result);
				assertEquals(result.length, 1);
		}
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is null.
		*/
		@Test
		void testFindFormationNameNotNullDateNull() {
				OracleFormationDao dao = new OracleFormationDao();
				Formation[] result = dao.findFormation("Java", null);
				assertNotNull(result);
				assertEquals(result.length, 1);
		}
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name and the date are not null.
		*/
		@Test
		void testFindFormationNameNotNullDateNotNull() {
				OracleFormationDao dao = new OracleFormationDao();
				Calendar date = Calendar.getInstance();
				date.set(2019, Calendar.JANUARY, 1);
				Formation[] result = dao.findFormation("Java", date);
				assertNotNull(result);
				assertEquals(result.length, 1);
		}
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is not null but the formation does not exist.
		*/
		@Test
		void testFindFormationNameNotNullDateNotNullFormationNotExist() {
				OracleFormationDao dao = new OracleFormationDao();
				Calendar date = Calendar.getInstance();
				date.set(2019, Calendar.JANUARY, 1);
				assertThrows(DaoException.class, () -> {
						dao.findFormation("C++", date);
				});
		}
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is null but the formation does not exist.
		*/
		@Test
		void testFindFormationNameNotNullDateNullFormationNotExist() {
				OracleFormationDao dao = new OracleFormationDao();
				assertThrows(DaoException.class, () -> {
						dao.findFormation("C++", null);
				});
		}
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name is null and the date is not null but the formation does not exist.
		*/
		@Test
		void testFindFormationNameNullDateNotNullFormationNotExist() {
				OracleFormationDao dao = new OracleFormationDao();
				Calendar date = Calendar.getInstance();
				date.set(2019, Calendar.JANUARY, 1);
				assertThrows(DaoException.class, () -> {
						dao.findFormation(null, date);
				});
		}
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name and the date are not null but the formation does not exist.
		*/
		@Test
		void testFindFormationNameNotNullDateNotNullFormationNotExist() {
				OracleFormationDao dao = new OracleFormationDao();
				Calendar date = Calendar.getInstance();
				date.set(2019, Calendar.JANUARY, 1);
				assertThrows(DaoException.class, () -> {
						dao.findFormation("C++", date);
				});
		}
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is not null but the formation does not exist.
		*/
		@Test
		void testFindFormationNameNotNullDateNotNullFormationExist() {
				OracleFormationDao dao = new OracleFormationDao();
				Calendar date = Calendar.getInstance();
				date.set(2019, Calendar.JANUARY, 1);
				Formation[] result = dao.findFormation("Java", date);
				assertNotNull(result);
				assertEquals(result.length, 1);
		}
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is null but the formation does not exist.
		*/
		@Test
		void testFindFormationNameNotNullDateNullFormationExist() {
				OracleFormationDao dao = new OracleFormationDao();
				Formation[] result = dao.findFormation("Java", null);
				assertNotNull(result);
				assertEquals(result.length, 1);
		}
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name is null and the date is not null but the formation does not exist.
		*/
		@Test
		void testFindFormationNameNullDateNotNullFormationExist() {
				OracleFormationDao dao = new OracleFormationDao();
				Calendar date = Calendar.getInstance();
				date.set(2019, Calendar.JANUARY, 1);
				Formation[] result = dao.findFormation(null, date);
				assertNotNull(result);
				assertEquals(result.length, 1);
		}
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name and the date are not null but the formation does not exist.
		*/
		@Test
		void testFindFormationNameNotNullDateNotNullFormationExist() {
				OracleFormationDao dao = new OracleFormationDao();
				Calendar date = Calendar.getInstance();
				date.set(2019, Calendar.JANUARY, 1);
				Formation[] result = dao.findFormation("Java", date);
				assertNotNull(result);
				assertEquals(result.length, 1);
		}
}

// OracleFormationDaoTest.java
package fr.unice.gfarce.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TemporalType;
import java.util.*;
import fr.unice.gfarce.identity.Formation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OracleFormationDao}.
* It contains ten unit test cases for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
*/
class OracleFormationDaoTest {
		
		String persistUnitName = "Identite";
		
		@PersistenceContext
		private EntityManager em;
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name and the date are null.
		*/
		@Test
		void testFindFormationNameDateNull() {
				OracleFormationDao dao = new OracleFormationDao();
				Formation[] result = dao.findFormation(null, null);
				assertNotNull(result);
				assertEquals(result.length, 2);
		}
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name is null and the date is not null.
		*/
		@Test
		void testFindFormationNameNullDateNotNull() {
				OracleFormationDao dao = new OracleFormationDao();
				Calendar date = Calendar.getInstance();
				date.set(2019, Calendar.JANUARY, 1);
				Formation[] result = dao.findFormation(null, date);
				assertNotNull(result);
				assertEquals(result.length, 1);
		}
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is null.
		*/
		@Test
		void testFindFormationNameNotNullDateNull() {
				OracleFormationDao dao = new OracleFormationDao();
				Formation[] result = dao.findFormation("Java", null);
				assertNotNull(result);
				assertEquals(result.length, 1);
		}
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name and the date are not null.
		*/
		@Test
		void testFindFormationNameNotNullDateNotNull() {
				OracleFormationDao dao = new OracleFormationDao();
				Calendar date = Calendar.getInstance();
				date.set(2019, Calendar.JANUARY, 1);
				Formation[] result = dao.findFormation("Java", date);
				assertNotNull(result);
				assertEquals(result.length, 1);
		}
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is not null but the formation does not exist.
		*/
		@Test
		void testFindFormationNameNotNullDateNotNullFormationNotExist() {
				OracleFormationDao dao = new OracleFormationDao();
				Calendar date = Calendar.getInstance();
				date.set(2019, Calendar.JANUARY, 1);
				assertThrows(DaoException.class, () -> {
						dao.findFormation("C++", date);
				});
		}
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is null but the formation does not exist.
		*/
		@Test
		void testFindFormationNameNotNullDateNullFormationNotExist() {
				OracleFormationDao dao = new OracleFormationDao();
				assertThrows(DaoException.class, () -> {
						dao.findFormation("C++", null);
				});
		}
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name is null and the date is not null but the formation does not exist.
		*/
		@Test
		void testFindFormationNameNullDateNotNullFormationNotExist() {
				OracleFormationDao dao = new OracleFormationDao();
				Calendar date = Calendar.getInstance();
				date.set(2019, Calendar.JANUARY, 1);
				assertThrows(DaoException.class, () -> {
						dao.findFormation(null, date);
				});
		}
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name and the date are not null but the formation does not exist.
		*/
		@Test
		void testFindFormationNameNotNullDateNotNullFormationNotExist() {
				OracleFormationDao dao = new OracleFormationDao();
				Calendar date = Calendar.getInstance();
				date.set(2019, Calendar.JANUARY, 1);
				assertThrows(DaoException.class, () -> {
						dao.findFormation("C++", date);
				});
		}
		
		/**
		* Test case for the {@link OracleFormationDao#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is not null but the formation does not exist.
		*/
		@Test
		void testFindFormationNameNotNullDateNotNullFormationExist() {
				OracleFormationDao dao = new OracleFormationDao();
				Calendar date = Calendar.getInstance();
				date.set(2019, Calendar.JANUARY, 1);
				Formation[] result = dao.findFormation("Java", date);
				assertNotNull(result);
				assertEquals(result.length, 1);
		}
		
		/**
		* Test case for the {@link Oracle