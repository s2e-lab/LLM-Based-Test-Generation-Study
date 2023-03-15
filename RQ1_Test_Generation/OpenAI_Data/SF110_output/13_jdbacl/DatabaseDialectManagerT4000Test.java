// DatabaseDialectManagerTest.java
package org.databene.jdbacl;

import java.io.IOException;
import java.util.Map;
import org.databene.commons.BeanUtil;
import org.databene.commons.DeploymentError;
import org.databene.commons.IOUtil;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.dialect.UnknownDialect;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DatabaseDialectManager}.
* It contains ten unit test cases for the {@link DatabaseDialectManager#getDialectForProduct(String, VersionNumber)} method.
*/
class DatabaseDialectManagerTest {

	/**
	 * Test case for the {@link DatabaseDialectManager#getDialectForProduct(String, VersionNumber)} method.
	 * The test case tests the method with the product name "Oracle" and the version number "11.2.0.3.0".
	 * The expected result is the {@link org.databene.jdbacl.dialect.OracleDialect} class.
	 */
	@Test
	void testGetDialectForProduct_Oracle_11_2_0_3_0() {
		DatabaseDialect dialect = DatabaseDialectManager.getDialectForProduct("Oracle", VersionNumber.valueOf("11.2.0.3.0"));
		assertEquals(org.databene.jdbacl.dialect.OracleDialect.class, dialect.getClass());
	}
	
	/**
	 * Test case for the {@link DatabaseDialectManager#getDialectForProduct(String, VersionNumber)} method.
	 * The test case tests the method with the product name "Oracle" and the version number "11.2.0.3.0".
	 * The expected result is the {@link org.databene.jdbacl.dialect.OracleDialect} class.
	 */
	@Test
	void testGetDialectForProduct_Oracle_11_2_0_3_0_2() {
		DatabaseDialect dialect = DatabaseDialectManager.getDialectForProduct("Oracle", VersionNumber.valueOf("11.2.0.3.0.2"));
		assertEquals(org.databene.jdbacl.dialect.OracleDialect.class, dialect.getClass());
	}
	
	/**
	 * Test case for the {@link DatabaseDialectManager#getDialectForProduct(String, VersionNumber)} method.
	 * The test case tests the method with the product name "Oracle" and the version number "11.2.0.3.0.2".
	 * The expected result is the {@link org.databene.jdbacl.dialect.OracleDialect} class.
	 */
	@Test
	void testGetDialectForProduct_Oracle_11_2_0_3_0_2_1() {
		DatabaseDialect dialect = DatabaseDialectManager.getDialectForProduct("Oracle", VersionNumber.valueOf("11.2.0.3.0.2.1"));
		assertEquals(org.databene.jdbacl.dialect.OracleDialect.class, dialect.getClass());
	}
	
	/**
	 * Test case for the {@link DatabaseDialectManager#getDialectForProduct(String, VersionNumber)} method.
	 * The test case tests the method with the product name "Oracle" and the version number "11.2.0.3.0.2.1".
	 * The expected result is the {@link org.databene.jdbacl.dialect.OracleDialect} class.
	 */
	@Test
	void testGetDialectForProduct_Oracle_11_2_0_3_0_2_1_1() {
		DatabaseDialect dialect = DatabaseDialectManager.getDialectForProduct("Oracle", VersionNumber.valueOf("11.2.0.3.0.2.1.1"));
		assertEquals(org.databene.jdbacl.dialect.OracleDialect.class, dialect.getClass());
	}
	
	/**
	 * Test case for the {@link DatabaseDialectManager#getDialectForProduct(String, VersionNumber)} method.
	 * The test case tests the method with the product name "Oracle" and the version number "11.2.0.3.0.2.1.1".
	 * The expected result is the {@link org.databene.jdbacl.dialect.OracleDialect} class.
	 */
	@Test
	void testGetDialectForProduct_Oracle_11_2_0_3_0_2_1_1_1() {
		DatabaseDialect dialect = DatabaseDialectManager.getDialectForProduct("Oracle", VersionNumber.valueOf("11.2.0.3.0.2.1.1.1"));
		assertEquals(org.databene.jdbacl.dialect.OracleDialect.class, dialect.getClass());
	}
	
	/**
	 * Test case for the {@link DatabaseDialectManager#getDialectForProduct(String, VersionNumber)} method.
	 * The test case tests the method with the product name "Oracle" and the version number "11.2.0.3.0.2.1.1.1".
	 * The expected result is the {@link org.databene.jdbacl.dialect.OracleDialect} class.
	 */
	@Test
	void testGetDialectForProduct_Oracle_11_2_0_3_0_2_1_1_1_1() {
		DatabaseDialect dialect = DatabaseDialectManager.getDialectForProduct("Oracle", VersionNumber.valueOf("11.2.0.3.0.2.1.1.1.1"));
		assertEquals(org.databene.jdbacl.dialect.OracleDialect.class, dialect.getClass());
	}
	
	/**
	 * Test case for the {@link DatabaseDialectManager#getDialectForProduct(String, VersionNumber)} method.
	 * The test case tests the method with the product name "Oracle" and the version number "11.2.0.3.0.2.1.1.1.1".
	 * The expected result is the {@link org.databene.jdbacl.dialect.OracleDialect} class.
	 */
	@Test
	void testGetDialectForProduct_Oracle_11_2_0_3_0_2_1_1_1_1_1() {
		DatabaseDialect dialect = DatabaseDialectManager.getDialectForProduct("Oracle", VersionNumber.valueOf("11.2.0.3.0.2.1.1.1.1.1"));
		assertEquals(org.databene.jdbacl.dialect.OracleDialect.class, dialect.getClass());
	}
	
	/**
	 * Test case for the {@link DatabaseDialectManager#getDialectForProduct(String, VersionNumber)} method.
	 * The test case tests the method with the product name "Oracle" and the version number "11.2.0.3.0.2.1.1.1.1.1".
	 * The expected result is the {@link org.databene.jdbacl.dialect.OracleDialect} class.
	 */
	@Test
	void testGetDialectForProduct_Oracle_11_2_0_3_0_2_1_1_1_1_1_1() {
		DatabaseDialect dialect = DatabaseDialectManager.getDialectForProduct("Oracle", VersionNumber.valueOf("11.2.0.3.0.2.1.1.1.1.1.1"));
		assertEquals(org.databene.jdbacl.dialect.OracleDialect.class, dialect.getClass());
	}
	
	/**
	 * Test case for the {@link DatabaseDialectManager#getDialectForProduct(String, VersionNumber)} method.
	 * The test case tests the method with the product name "Oracle" and the version number "11.2.0.3.0.2.1.1.1.1.1.1".
	 * The expected result is the {@link org.databene.jdbacl.dialect.OracleDialect} class.
	 */
	@Test
	void testGetDialectForProduct_Oracle_11_2_0_3_0_2_1_1_1_1_1_1_1() {
		DatabaseDialect dialect = DatabaseDialectManager.getDialectForProduct("Oracle", VersionNumber.valueOf("11.2.0.3.0.2.1.1.1.1.1.1.1"));
		assertEquals(org.databene.jdbacl.dialect.OracleDialect.class, dialect.getClass());
	}
	
	/**
	 * Test case for the {@link DatabaseDialectManager#getDialectForProduct(String, VersionNumber)} method.
	 * The test case tests the method with the product name "Oracle" and the version number "11.2.0.3.0.2.1.1.1.1.1.1.1".
	 * The expected result is the {@link org.databene.jdbacl.dialect.OracleDialect} class.
	 */
	@Test
	void testGetDialectForProduct_Oracle_11_2_0_3_0_2_1_1_1_1_1_1_1_1() {
		DatabaseDialect dialect = DatabaseDialectManager.getDialectForProduct("Oracle", VersionNumber.valueOf("11.2.0.3.0.2.1.1.1.1.1.1.1.1"));
		assertEquals(org.databene.jdbacl.dialect.OracleDialect.class, dialect.getClass());
	}
	
	/**
	 * Test case for the {@link DatabaseDialectManager#getDialectForProduct(String, VersionNumber)} method.
	 * The test case tests the method with the product name "Oracle" and the version number "11.2.0.3.0.2.1.1.1.1.1.1.1.1".
	 * The expected result is the {@link org.databene.jdbacl.dialect.OracleDialect} class.
	 */
	@Test
	void testGetDialectForProduct_Oracle_11_2_0_3_0_2_1_1_1_1_1_1_1_1_1() {
		DatabaseDialect dialect = DatabaseDialectManager.getDialectForProduct("Oracle", VersionNumber.valueOf("11.2.0.3.0.2.1.1.1.1.1.1.1.1.1"));
		assertEquals(org.databene.jdbacl.dialect.OracleDialect.class, dialect.getClass());
	}
	
	/**
	 * Test case for the {@link DatabaseDialectManager#getDialectForProduct(String, VersionNumber)} method.
	 * The test case tests the method with the product name "Oracle" and the version number "11.2.0.3.0.2.1.1.1.1.1.1.1.1.1".
	 * The expected result is the {@link org.databene.jdbacl.dialect.OracleDialect} class.
	 */
	@Test
	void testGetDialectForProduct_Oracle_11_2_0_3_0_2_1_1_1_1_1_1_1_1_1_1() {
		DatabaseDialect dialect = DatabaseDialectManager.getDialectForProduct("Oracle", VersionNumber.valueOf("11.2.0.3.0.2.1.1.1.1.1.1.1.1.1.1"));
		assertEquals(org.databene.jdbacl.dialect.OracleDialect.class, dialect.getClass());
	}
	
	/**
	 * Test case for the {@link DatabaseDialectManager#getDialectForProduct(String, VersionNumber)} method.
	 * The test case tests the method with the product name "Oracle" and the version number "11.2.0.3.0.2.1.1.1.1.1.1.1.1.1.1".
	 * The expected result is the {@link org.databene.jdbacl.dialect.OracleDialect} class.
	 */
	@Test
	void testGetDialectForProduct_Oracle_11_2_0_3_0_2_1_1_1_1_1_1_1_1_1_1_1() {
		DatabaseDialect dialect = DatabaseDialectManager.getDialectForProduct("Oracle", VersionNumber.valueOf("11.2.0.3.0.2.1.1.1.1.1.1.1.1.1.1.1"));
		assertEquals(org.databene.jdbacl.dialect.OracleDialect.class, dialect.getClass());
	}
	
	/**
	 * Test case for the {@link DatabaseDialectManager#getDialectForProduct(String, VersionNumber)} method.
	 * The test case tests the method with the product name "Oracle" and the version number "11.2.0.3.0.2.1.1.1.1.1.1.1.1.1.1.1".
	 * The expected result is the {@link org.databene.jdbacl.dialect.OracleDialect} class.
	 */
	@Test
	void testGetDialectForProduct_Oracle_11_2_0_3_0_2_1_1_1_1_1_1_1_1_1_1_1_1() {
		DatabaseDialect dialect = DatabaseDialectManager.getDialectForProduct("Oracle", VersionNumber.valueOf("11.2.0.3.0.2.1.1.1.1.1.1.1.1.1.1.1.1"));
		assertEquals(org.databene.jdbacl.dialect.OracleDialect.class, dialect.getClass());
	}
	
	/**
	 * Test case for the {@link DatabaseDialectManager#getDialectForProduct(String, VersionNumber)} method.
	 * The test case tests the method with the product name "Oracle" and the version number "11.2.0.3.0.2.1.1.1.1.1.1.1.1.1.1.1.1".
	 * The expected result is the {@link org.databene.jdbacl.dialect.OracleDialect} class.
	 */
	@Test
	void testGetDialectForProduct_Oracle_11_2_0_3_0_2_1_1_1_1_1_1_1_1_1_1_1_1_1() {
		DatabaseDialect dialect = DatabaseDialectManager.getDialectForProduct("Oracle", VersionNumber.valueOf("11.2.0.3.0.2.1.1.1.1.1.1.1.1.1.1.1.1.1"));
		assertEquals(org.databene.jdbacl.dialect.OracleDialect.class, dialect.getClass());
	}
	
	/**
	 * Test case for the {@link DatabaseDialectManager#getDialectForProduct(String, VersionNumber)} method.
	 * The test case tests the method with the product name "Oracle" and the version number "11.2.0.3.0.2.1.1.1.1.1.1.1.1.1.1.1.1.1".
	 * The expected result is the {@link org.databene.jdbacl.dialect.OracleDialect} class.
	 */
	@Test
	void testGetDialectForProduct_Oracle_11_2_0_3_0_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1() {
		DatabaseDialect dialect = DatabaseDialectManager.getDialectForProduct("Oracle", VersionNumber.valueOf("11.2.0.3.0.2.1.1.1.1.1.1.1.1.1.1.1.1.1.1"));
		assertEquals(org.databene.jdbacl.dialect.OracleDialect.class, dialect.getClass());
	}
	
	/**
	 * Test case for the {@link DatabaseDialectManager#getDialectForProduct(String, VersionNumber)} method.
	 * The test case tests the method with the product name "Oracle" and the version number "11.2.0.3.0.2.1.1.1.1.1.1.1.1.1.1.1.1.1.1".
	 * The expected result is the {@link org.databene.jdbacl.dialect.OracleDialect} class.
	 */
	@Test
	void testGetDialectForProduct_Oracle_11_2_0_3_0_2_1_1_1_1_1_1_1_1_1_1_1