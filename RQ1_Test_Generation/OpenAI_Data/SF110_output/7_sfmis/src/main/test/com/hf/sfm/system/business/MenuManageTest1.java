// MenuManageTest1.java
package com.hf.sfm.system.business;

import org.hibernate.Transaction;
import com.hf.sfm.system.pdo.Menu;
import com.hf.sfm.util.DaoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MenuManage}.
* It contains ten unit test cases for the {@link MenuManage#del(String[])} method.
*/
class MenuManageTest1 {

	/**
	* Test case 1 for method del.
	* Test data: idnos = {null}.
	* Expected result: rtn = "0".
	*/
	@Test
	void testCase1() {
		// Arrange
		String[] idnos = {null};
		MenuManage menuManage = new MenuManage();
		
		// Act
		String rtn = menuManage.del(idnos);
		
		// Assert
		assertEquals("0", rtn);
	}
	
	/**
	* Test case 2 for method del.
	* Test data: idnos = {""}.
	* Expected result: rtn = "0".
	*/
	@Test
	void testCase2() {
		// Arrange
		String[] idnos = {""};
		MenuManage menuManage = new MenuManage();
		
		// Act
		String rtn = menuManage.del(idnos);
		
		// Assert
		assertEquals("0", rtn);
	}
	
	/**
	* Test case 3 for method del.
	* Test data: idnos = {"1"}.
	* Expected result: rtn = "1".
	*/
	@Test
	void testCase3() {
		// Arrange
		String[] idnos = {"1"};
		MenuManage menuManage = new MenuManage();
		
		// Act
		String rtn = menuManage.del(idnos);
		
		// Assert
		assertEquals("1", rtn);
	}
	
	/**
	* Test case 4 for method del.
	* Test data: idnos = {"1", "2"}.
	* Expected result: rtn = "1".
	*/
	@Test
	void testCase4() {
		// Arrange
		String[] idnos = {"1", "2"};
		MenuManage menuManage = new MenuManage();
		
		// Act
		String rtn = menuManage.del(idnos);
		
		// Assert
		assertEquals("1", rtn);
	}
	
	/**
	* Test case 5 for method del.
	* Test data: idnos = {"1", "2", "3"}.
	* Expected result: rtn = "1".
	*/
	@Test
	void testCase5() {
		// Arrange
		String[] idnos = {"1", "2", "3"};
		MenuManage menuManage = new MenuManage();
		
		// Act
		String rtn = menuManage.del(idnos);
		
		// Assert
		assertEquals("1", rtn);
	}
	
	/**
	* Test case 6 for method del.
	* Test data: idnos = {"1", "2", "3", "4"}.
	* Expected result: rtn = "1".
	*/
	@Test
	void testCase6() {
		// Arrange
		String[] idnos = {"1", "2", "3", "4"};
		MenuManage menuManage = new MenuManage();
		
		// Act
		String rtn = menuManage.del(idnos);
		
		// Assert
		assertEquals("1", rtn);
	}
	
	/**
	* Test case 7 for method del.
	* Test data: idnos = {"1", "2", "3", "4", "5"}.
	* Expected result: rtn = "1".
	*/
	@Test
	void testCase7() {
		// Arrange
		String[] idnos = {"1", "2", "3", "4", "5"};
		MenuManage menuManage = new MenuManage();
		
		// Act
		String rtn = menuManage.del(idnos);
		
		// Assert
		assertEquals("1", rtn);
	}
	
	/**
	* Test case 8 for method del.
	* Test data: idnos = {"1", "2", "3", "4", "5", "6"}.
	* Expected result: rtn = "1".
	*/
	@Test
	void testCase8() {
		// Arrange
		String[] idnos = {"1", "2", "3", "4", "5", "6"};
		MenuManage menuManage = new MenuManage();
		
		// Act
		String rtn = menuManage.del(idnos);
		
		// Assert
		assertEquals("1", rtn);
	}
	
	/**
	* Test case 9 for method del.
	* Test data: idnos = {"1", "2", "3", "4", "5", "6", "7"}.
	* Expected result: rtn = "1".
	*/
	@Test
	void testCase9() {
		// Arrange
		String[] idnos = {"1", "2", "3", "4", "5", "6", "7"};
		MenuManage menuManage = new MenuManage();
		
		// Act
		String rtn = menuManage.del(idnos);
		
		// Assert
		assertEquals("1", rtn);
	}
	
	/**
	* Test case 10 for method del.
	* Test data: idnos = {"1", "2", "3", "4", "5", "6", "7", "8"}.
	* Expected result: rtn = "1".
	*/
	@Test
	void testCase10() {
		// Arrange
		String[] idnos = {"1", "2", "3", "4", "5", "6", "7", "8"};
		MenuManage menuManage = new MenuManage();
		
		// Act
		String rtn = menuManage.del(idnos);
		
		// Assert
		assertEquals("1", rtn);
	}
}

// MenuManageTest2.java
package com.hf.sfm.system.business;

import org.hibernate.Transaction;
import com.hf.sfm.system.pdo.Menu;
import com.hf.sfm.util.DaoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MenuManage}.
* It contains ten unit test cases for the {@link MenuManage#saveOrUpdate(Menu)} method.
*/
class MenuManageTest2 {
		
	/**
	* Test case 1 for method saveOrUpdate.
	* Test data: menu = null.
	* Expected result: rtn = "0".
	*/
	@Test
	void testCase1() {
		// Arrange
		Menu menu = null;
		MenuManage menuManage = new MenuManage();
		
		// Act
		String rtn = menuManage.saveOrUpdate(menu);
		
		// Assert
		assertEquals("0", rtn);
	}
	
	/**
	* Test case 2 for method saveOrUpdate.
	* Test data: menu = new Menu().
	* Expected result: rtn = "1".
	*/
	@Test
	void testCase2() {
		// Arrange
		Menu menu = new Menu();
		MenuManage menuManage = new MenuManage();
		
		// Act
		String rtn = menuManage.saveOrUpdate(menu);
		
		// Assert
		assertEquals("1", rtn);
	}
	
	/**
	* Test case 3 for method saveOrUpdate.
	* Test data: menu = new Menu().
	* Expected result: rtn = "1".
	*/
	@Test
	void testCase3() {
		// Arrange
		Menu menu = new Menu();
		MenuManage menuManage = new MenuManage();
		
		// Act