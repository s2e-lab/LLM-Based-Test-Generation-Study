// Database_4Test.java
package bible.util;

import java.io.*;
import java.sql.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Database}.
* It contains ten unit test cases for the {@link Database#Insert(String, boolean)} method.
*/
class Database_4Test {

		/**
		* Test case for {@link Database#Insert(String, boolean)} method.
		* It tests the case when the insert query is null.
		*/
		@Test
		public void testInsert_1() throws SQLException {
				try {
						Database.Insert(null, true);
						fail("Should throw NullPointerException");
				} catch (NullPointerException e) {
						assertTrue(true);
				}
		}
		
		/**
		* Test case for {@link Database#Insert(String, boolean)} method.
		* It tests the case when the insert query is empty.
		*/
		@Test
		public void testInsert_2() throws SQLException {
				try {
						Database.Insert("", true);
						fail("Should throw SQLException");
				} catch (SQLException e) {
						assertTrue(true);
				}
		}
		
		/**
		* Test case for {@link Database#Insert(String, boolean)} method.
		* It tests the case when the insert query is not a valid insert query.
		*/
		@Test
		public void testInsert_3() throws SQLException {
				try {
						Database.Insert("insert", true);
						fail("Should throw SQLException");
				} catch (SQLException e) {
						assertTrue(true);
				}
		}
		
		/**
		* Test case for {@link Database#Insert(String, boolean)} method.
		* It tests the case when the insert query is a valid insert query.
		*/
		@Test
		public void testInsert_4() throws SQLException {
				try {
						Database.Insert("insert into table1 values(1, 2, 3)", true);
						assertTrue(true);
				} catch (SQLException e) {
						fail("Should not throw SQLException");
				}
		}
		
		/**
		* Test case for {@link Database#Insert(String, boolean)} method.
		* It tests the case when the insert query is a valid insert query.
		*/
		@Test
		public void testInsert_5() throws SQLException {
				try {
						Database.Insert("insert into table1 values(1, 2, 3)", false);
						assertTrue(true);
				} catch (SQLException e) {
						fail("Should not throw SQLException");
				}
		}
		
		/**
		* Test case for {@link Database#Insert(String, boolean)} method.
		* It tests the case when the insert query is a valid insert query.
		*/
		@Test
		public void testInsert_6() throws SQLException {
				try {
						Database.Insert("insert into table1 values(1, 2, 3)", true);
						assertTrue(true);
				} catch (SQLException e) {
						fail("Should not throw SQLException");
				}
		}
		
		/**
		* Test case for {@link Database#Insert(String, boolean)} method.
		* It tests the case when the insert query is a valid insert query.
		*/
		@Test
		public void testInsert_7() throws SQLException {
				try {
						Database.Insert("insert into table1 values(1, 2, 3)", false);
						assertTrue(true);
				} catch (SQLException e) {
						fail("Should not throw SQLException");
				}
		}
		
		/**
		* Test case for {@link Database#Insert(String, boolean)} method.
		* It tests the case when the insert query is a valid insert query.
		*/
		@Test
		public void testInsert_8() throws SQLException {
				try {
						Database.Insert("insert into table1 values(1, 2, 3)", true);
						assertTrue(true);
				} catch (SQLException e) {
						fail("Should not throw SQLException");
				}
		}
		
		/**
		* Test case for {@link Database#Insert(String, boolean)} method.
		* It tests the case when the insert query is a valid insert query.
		*/
		@Test
		public void testInsert_9() throws SQLException {
				try {
						Database.Insert("insert into table1 values(1, 2, 3)", false);
						assertTrue(true);
				} catch (SQLException e) {
						fail("Should not throw SQLException");
				}
		}
		
		/**
		* Test case for {@link Database#Insert(String, boolean)} method.
		* It tests the case when the insert query is a valid insert query.
		*/
		@Test
		public void testInsert_10() throws SQLException {
				try {
						Database.Insert("insert into table1 values(1, 2, 3)", true);
						assertTrue(true);
				} catch (SQLException e) {
						fail("Should not throw SQLException");
				}
		}
}

// Database_4Test_Coverage.java
package bible.util;

import java.io.*;
import java.sql.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Database}.
* It contains ten unit test cases for the {@link Database#Insert(String, boolean)} method.
*/
class Database_4Test_Coverage {
		
		/**
		* Test case for {@link Database#Insert(String, boolean)} method.
		* It tests the case when the insert query is null.
		*/
		@Test
		public void testInsert_1() throws SQLException {
				try {
						Database.Insert(null, true);
						fail("Should throw NullPointerException");
				} catch (NullPointerException e) {
						assertTrue(true);
				}
		}
		
		/**
		* Test case for {@link Database#Insert(String, boolean)} method.
		* It tests the case when the insert query is empty.
		*/
		@Test
		public void testInsert_2() throws SQLException {
				try {
						Database.Insert("", true);
						fail("Should throw SQLException");
				} catch (SQLException e) {
						assertTrue(true);
				}
		}
		
		/**
		* Test case for {@link Database#Insert(String, boolean)} method.
		* It tests the case when the insert query is not a valid insert query.
		*/
		@Test
		public void testInsert_3() throws SQ