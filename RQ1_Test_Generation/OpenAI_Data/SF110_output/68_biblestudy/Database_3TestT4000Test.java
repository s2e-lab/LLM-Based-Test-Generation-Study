// Database_3Test.java
package bible.util;

import java.io.*;
import java.sql.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Database}.
* It contains ten unit test cases for the {@link Database#BatchInsert(String[], int)} method.
*/
class Database_3Test {

		/**
		* Test case for {@link Database#BatchInsert(String[], int)} method.
		* It tests the case when the number of inserts is less than the number of inserts per batch.
		*/
		@Test
		void testBatchInsert_1() throws SQLException {
				String[] inserts = new String[1];
				inserts[0] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(1, 2, 3)";
				int[] ids = Database.BatchInsert(inserts, 2);
				assertEquals(1, ids.length);
				assertEquals(1, ids[0]);
		}
		
		/**
		* Test case for {@link Database#BatchInsert(String[], int)} method.
		* It tests the case when the number of inserts is equal to the number of inserts per batch.
		*/
		@Test
		void testBatchInsert_2() throws SQLException {
				String[] inserts = new String[2];
				inserts[0] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(1, 2, 3)";
				inserts[1] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(4, 5, 6)";
				int[] ids = Database.BatchInsert(inserts, 2);
				assertEquals(2, ids.length);
				assertEquals(1, ids[0]);
				assertEquals(2, ids[1]);
		}
		
		/**
		* Test case for {@link Database#BatchInsert(String[], int)} method.
		* It tests the case when the number of inserts is greater than the number of inserts per batch.
		*/
		@Test
		void testBatchInsert_3() throws SQLException {
				String[] inserts = new String[3];
				inserts[0] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(1, 2, 3)";
				inserts[1] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(4, 5, 6)";
				inserts[2] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(7, 8, 9)";
				int[] ids = Database.BatchInsert(inserts, 2);
				assertEquals(3, ids.length);
				assertEquals(1, ids[0]);
				assertEquals(2, ids[1]);
				assertEquals(3, ids[2]);
		}
		
		/**
		* Test case for {@link Database#BatchInsert(String[], int)} method.
		* It tests the case when the number of inserts is greater than the number of inserts per batch and the number of inserts is not divisible by the number of inserts per batch.
		*/
		@Test
		void testBatchInsert_4() throws SQLException {
				String[] inserts = new String[4];
				inserts[0] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(1, 2, 3)";
				inserts[1] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(4, 5, 6)";
				inserts[2] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(7, 8, 9)";
				inserts[3] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(10, 11, 12)";
				int[] ids = Database.BatchInsert(inserts, 2);
				assertEquals(4, ids.length);
				assertEquals(1, ids[0]);
				assertEquals(2, ids[1]);
				assertEquals(3, ids[2]);
				assertEquals(4, ids[3]);
		}
		
		/**
		* Test case for {@link Database#BatchInsert(String[], int)} method.
		* It tests the case when the number of inserts is greater than the number of inserts per batch and the number of inserts is not divisible by the number of inserts per batch.
		*/
		@Test
		void testBatchInsert_5() throws SQLException {
				String[] inserts = new String[5];
				inserts[0] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(1, 2, 3)";
				inserts[1] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(4, 5, 6)";
				inserts[2] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(7, 8, 9)";
				inserts[3] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(10, 11, 12)";
				inserts[4] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(13, 14, 15)";
				int[] ids = Database.BatchInsert(inserts, 2);
				assertEquals(5, ids.length);
				assertEquals(1, ids[0]);
				assertEquals(2, ids[1]);
				assertEquals(3, ids[2]);
				assertEquals(4, ids[3]);
				assertEquals(5, ids[4]);
		}
		
		/**
		* Test case for {@link Database#BatchInsert(String[], int)} method.
		* It tests the case when the number of inserts is greater than the number of inserts per batch and the number of inserts is not divisible by the number of inserts per batch.
		*/
		@Test
		void testBatchInsert_6() throws SQLException {
				String[] inserts = new String[6];
				inserts[0] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(1, 2, 3)";
				inserts[1] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(4, 5, 6)";
				inserts[2] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(7, 8, 9)";
				inserts[3] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(10, 11, 12)";
				inserts[4] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(13, 14, 15)";
				inserts[5] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(16, 17, 18)";
				int[] ids = Database.BatchInsert(inserts, 2);
				assertEquals(6, ids.length);
				assertEquals(1, ids[0]);
				assertEquals(2, ids[1]);
				assertEquals(3, ids[2]);
				assertEquals(4, ids[3]);
				assertEquals(5, ids[4]);
				assertEquals(6, ids[5]);
		}
		
		/**
		* Test case for {@link Database#BatchInsert(String[], int)} method.
		* It tests the case when the number of inserts is greater than the number of inserts per batch and the number of inserts is not divisible by the number of inserts per batch.
		*/
		@Test
		void testBatchInsert_7() throws SQLException {
				String[] inserts = new String[7];
				inserts[0] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(1, 2, 3)";
				inserts[1] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(4, 5, 6)";
				inserts[2] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(7, 8, 9)";
				inserts[3] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(10, 11, 12)";
				inserts[4] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(13, 14, 15)";
				inserts[5] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(16, 17, 18)";
				inserts[6] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(19, 20, 21)";
				int[] ids = Database.BatchInsert(inserts, 2);
				assertEquals(7, ids.length);
				assertEquals(1, ids[0]);
				assertEquals(2, ids[1]);
				assertEquals(3, ids[2]);
				assertEquals(4, ids[3]);
				assertEquals(5, ids[4]);
				assertEquals(6, ids[5]);
				assertEquals(7, ids[6]);
		}
		
		/**
		* Test case for {@link Database#BatchInsert(String[], int)} method.
		* It tests the case when the number of inserts is greater than the number of inserts per batch and the number of inserts is not divisible by the number of inserts per batch.
		*/
		@Test
		void testBatchInsert_8() throws SQLException {
				String[] inserts = new String[8];
				inserts[0] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(1, 2, 3)";
				inserts[1] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(4, 5, 6)";
				inserts[2] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(7, 8, 9)";
				inserts[3] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(10, 11, 12)";
				inserts[4] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(13, 14, 15)";
				inserts[5] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(16, 17, 18)";
				inserts[6] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(19, 20, 21)";
				inserts[7] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(22, 23, 24)";
				int[] ids = Database.BatchInsert(inserts, 2);
				assertEquals(8, ids.length);
				assertEquals(1, ids[0]);
				assertEquals(2, ids[1]);
				assertEquals(3, ids[2]);
				assertEquals(4, ids[3]);
				assertEquals(5, ids[4]);
				assertEquals(6, ids[5]);
				assertEquals(7, ids[6]);
				assertEquals(8, ids[7]);
		}
		
		/**
		* Test case for {@link Database#BatchInsert(String[], int)} method.
		* It tests the case when the number of inserts is greater than the number of inserts per batch and the number of inserts is not divisible by the number of inserts per batch.
		*/
		@Test
		void testBatchInsert_9() throws SQLException {
				String[] inserts = new String[9];
				inserts[0] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(1, 2, 3)";
				inserts[1] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(4, 5, 6)";
				inserts[2] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(7, 8, 9)";
				inserts[3] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(10, 11, 12)";
				inserts[4] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(13, 14, 15)";
				inserts[5] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(16, 17, 18)";
				inserts[6] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(19, 20, 21)";
				inserts[7] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(22, 23, 24)";
				inserts[8] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(25, 26, 27)";
				int[] ids = Database.BatchInsert(inserts, 2);
				assertEquals(9, ids.length);
				assertEquals(1, ids[0]);
				assertEquals(2, ids[1]);
				assertEquals(3, ids[2]);
				assertEquals(4, ids[3]);
				assertEquals(5, ids[4]);
				assertEquals(6, ids[5]);
				assertEquals(7, ids[6]);
				assertEquals(8, ids[7]);
				assertEquals(9, ids[8]);
		}
		
		/**
		* Test case for {@link Database#BatchInsert(String[], int)} method.
		* It tests the case when the number of inserts is greater than