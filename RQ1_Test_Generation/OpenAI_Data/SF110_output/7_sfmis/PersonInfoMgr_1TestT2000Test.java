// PersonInfoMgr_1Test.java
package com.hf.sfm.sfmis.personinfo.business;

import org.hibernate.Transaction;
import com.hf.sfm.sfmis.personinfo.pdo.APersonInfo;
import com.hf.sfm.util.DaoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PersonInfoMgr}.
* It contains ten unit test cases for the {@link PersonInfoMgr#deleteByIds(String[])} method.
*/
class PersonInfoMgr_1Test {

	/**
	* Test case 1 for method deleteByIds.
	* The test case aims to test the situation that when the parameter idnos is null,
	* the method deleteByIds will throw a NullPointerException.
	*/
	@Test
	void testDeleteByIds_1() {
		// Arrange
		String[] idnos = null;
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		
		// Act
		Throwable exception = assertThrows(NullPointerException.class, () -> {
			personInfoMgr.deleteByIds(idnos);
		});
		
		// Assert
		assertEquals("idnos is marked non-null but is null", exception.getMessage());
	}
	
	/**
	* Test case 2 for method deleteByIds.
	* The test case aims to test the situation that when the parameter idnos is empty,
	* the method deleteByIds will throw a IllegalArgumentException.
	*/
	@Test
	void testDeleteByIds_2() {
		// Arrange
		String[] idnos = new String[0];
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		
		// Act
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			personInfoMgr.deleteByIds(idnos);
		});
		
		// Assert
		assertEquals("idnos is empty", exception.getMessage());
	}
	
	/**
	* Test case 3 for method deleteByIds.
	* The test case aims to test the situation that when the parameter idnos contains null element,
	* the method deleteByIds will throw a NullPointerException.
	*/
	@Test
	void testDeleteByIds_3() {
		// Arrange
		String[] idnos = new String[1];
		idnos[0] = null;
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		
		// Act
		Throwable exception = assertThrows(NullPointerException.class, () -> {
			personInfoMgr.deleteByIds(idnos);
		});
		
		// Assert
		assertEquals("idnos contains null element", exception.getMessage());
	}
	
	/**
	* Test case 4 for method deleteByIds.
	* The test case aims to test the situation that when the parameter idnos contains empty element,
	* the method deleteByIds will throw a IllegalArgumentException.
	*/
	@Test
	void testDeleteByIds_4() {
		// Arrange
		String[] idnos = new String[1];
		idnos[0] = "";
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		
		// Act
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			personInfoMgr.deleteByIds(idnos);
		});
		
		// Assert
		assertEquals("idnos contains empty element", exception.getMessage());
	}
	
	/**
	* Test case 5 for method deleteByIds.
	* The test case aims to test the situation that when the parameter idnos contains element which is not a number,
	* the method deleteByIds will throw a NumberFormatException.
	*/
	@Test
	void testDeleteByIds_5() {
		// Arrange
		String[] idnos = new String[1];
		idnos[0] = "abc";
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		
		// Act
		Throwable exception = assertThrows(NumberFormatException.class, () -> {
			personInfoMgr.deleteByIds(idnos);
		});
		
		// Assert
		assertEquals("For input string: \"abc\"", exception.getMessage());
	}
	
	/**
	* Test case 6 for method deleteByIds.
	* The test case aims to test the situation that when the parameter idnos contains element which is not a number,
	* the method deleteByIds will throw a NumberFormatException.
	*/
	@Test
	void testDeleteByIds_6() {
		// Arrange
		String[] idnos = new String[1];
		idnos[0] = "123.45";
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		
		// Act
		Throwable exception = assertThrows(NumberFormatException.class, () -> {
			personInfoMgr.deleteByIds(idnos);
		});
		
		// Assert
		assertEquals("For input string: \"123.45\"", exception.getMessage());
	}
	
	/**
	* Test case 7 for method deleteByIds.
	* The test case aims to test the situation that when the parameter idnos contains element which is not a number,
	* the method deleteByIds will throw a NumberFormatException.
	*/
	@Test
	void testDeleteByIds_7() {
		// Arrange
		String[] idnos = new String[1];
		idnos[0] = "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123