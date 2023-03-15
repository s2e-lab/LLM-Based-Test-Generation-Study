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
	* It tests the case that when the inserts is null and expects NullPointerException.
	*/
	@Test
	public void testBatchInsert_NullInserts() {
		try {
			Database.BatchInsert(null, 1);
			fail("NullPointerException expected.");
		} catch (NullPointerException e) {
			// as expected
		} catch (Exception e) {
			fail("NullPointerException expected, but got " + e);
		}
	}
	
	/**
	* Test case for {@link Database#BatchInsert(String[], int)} method.
	* It tests the case that when the countPerBatch is less than 1 and expects IllegalArgumentException.
	*/
	@Test
	public void testBatchInsert_InvalidCountPerBatch() {
		try {
			Database.BatchInsert(new String[1], 0);
			fail("IllegalArgumentException expected.");
		} catch (IllegalArgumentException e) {
			// as expected
		} catch (Exception e) {
			fail("IllegalArgumentException expected, but got " + e);
		}
	}
	
	/**
	* Test case for {@link Database#BatchInsert(String[], int)} method.
	* It tests the case that when the inserts is empty and expects IllegalArgumentException.
	*/
	@Test
	public void testBatchInsert_EmptyInserts() {
		try {
			Database.BatchInsert(new String[0], 1);
			fail("IllegalArgumentException expected.");
		} catch (IllegalArgumentException e) {
			// as expected
		} catch (Exception e) {
			fail("IllegalArgumentException expected, but got " + e);
		}
	}
	
	/**
	* Test case for {@link Database#BatchInsert(String[], int)} method.
	* It tests the case that when the inserts is valid and expects the inserts are inserted.
	*/
	@Test
	public void testBatchInsert_ValidInserts() {
		try {
			String[] inserts = new String[3];
			inserts[0] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(1, 1, 1)";
			inserts[1] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(2, 2, 2)";
			inserts[2] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(3, 3, 3)";
			int[] ids = Database.BatchInsert(inserts, 1);
			assertEquals(3, ids.length);
			assertTrue(ids[0] > 0);
			assertTrue(ids[1] > 0);
			assertTrue(ids[2] > 0);
		} catch (Exception e) {
			fail("No exception should be thrown, but got: " + e);
		}
	}
	
	/**
	* Test case for {@link Database#BatchInsert(String[], int)} method.
	* It tests the case that when the inserts is valid and expects the inserts are inserted.
	*/
	@Test
	public void testBatchInsert_ValidInserts2() {
		try {
			String[] inserts = new String[3];
			inserts[0] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(1, 1, 1)";
			inserts[1] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(2, 2, 2)";
			inserts[2] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(3, 3, 3)";
			int[] ids = Database.BatchInsert(inserts, 2);
			assertEquals(3, ids.length);
			assertTrue(ids[0] > 0);
			assertTrue(ids[1] > 0);
			assertTrue(ids[2] > 0);
		} catch (Exception e) {
			fail("No exception should be thrown, but got: " + e);
		}
	}
	
	/**
	* Test case for {@link Database#BatchInsert(String[], int)} method.
	* It tests the case that when the inserts is valid and expects the inserts are inserted.
	*/
	@Test
	public void testBatchInsert_ValidInserts3() {
		try {
			String[] inserts = new String[3];
			inserts[0] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(1, 1, 1)";
			inserts[1] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(2, 2, 2)";
			inserts[2] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(3, 3, 3)";
			int[] ids = Database.BatchInsert(inserts, 3);
			assertEquals(3, ids.length);
			assertTrue(ids[0] > 0);
			assertTrue(ids[1] > 0);
			assertTrue(ids[2] > 0);
		} catch (Exception e) {
			fail("No exception should be thrown, but got: " + e);
		}
	}
	
	/**
	* Test case for {@link Database#BatchInsert(String[], int)} method.
	* It tests the case that when the inserts is valid and expects the inserts are inserted.
	*/
	@Test
	public void testBatchInsert_ValidInserts4() {
		try {
			String[] inserts = new String[3];
			inserts[0] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(1, 1, 1)";
			inserts[1] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(2, 2, 2)";
			inserts[2] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(3, 3, 3)";
			int[] ids = Database.BatchInsert(inserts, 4);
			assertEquals(3, ids.length);
			assertTrue(ids[0] > 0);
			assertTrue(ids[1] > 0);
			assertTrue(ids[2] > 0);
		} catch (Exception e) {
			fail("No exception should be thrown, but got: " + e);
		}
	}
	
	/**
	* Test case for {@link Database#BatchInsert(String[], int)} method.
	* It tests the case that when the inserts is valid and expects the inserts are inserted.
	*/
	@Test
	public void testBatchInsert_ValidInserts5() {
		try {
			String[] inserts = new String[3];
			inserts[0] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(1, 1, 1)";
			inserts[1] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(2, 2, 2)";
			inserts[2] = "insert into web_complete_Document (form_number, transaction_status, web_doc_uid) values(3, 3, 3)";
	