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
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		String[] idnos = null;
		
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
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		String[] idnos = new String[0];
		
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
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		String[] idnos = new String[1];
		idnos[0] = null;
		
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
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		String[] idnos = new String[1];
		idnos[0] = "";
		
		// Act
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			personInfoMgr.deleteByIds(idnos);
		});
		
		// Assert
		assertEquals("idnos contains empty element", exception.getMessage());
	}
	
	/**
	* Test case 5 for method deleteByIds.
	* The test case aims to test the situation that when the parameter idnos contains duplicate element,
	* the method deleteByIds will throw a IllegalArgumentException.
	*/
	@Test
	void testDeleteByIds_5() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		String[] idnos = new String[2];
		idnos[0] = "1";
		idnos[1] = "1";
		
		// Act
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			personInfoMgr.deleteByIds(idnos);
		});
		
		// Assert
		assertEquals("idnos contains duplicate element", exception.getMessage());
	}
	
	/**
	* Test case 6 for method deleteByIds.
	* The test case aims to test the situation that when the parameter idnos contains element which is not a number,
	* the method deleteByIds will throw a NumberFormatException.
	*/
	@Test
	void testDeleteByIds_6() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		String[] idnos = new String[1];
		idnos[0] = "a";
		
		// Act
		Throwable exception = assertThrows(NumberFormatException.class, () -> {
			personInfoMgr.deleteByIds(idnos);
		});
		
		// Assert
		assertEquals("For input string: \"a\"", exception.getMessage());
	}
	
	/**
	* Test case 7 for method deleteByIds.
	* The test case aims to test the situation that when the parameter idnos contains element which is not a integer,
	* the method deleteByIds will throw a NumberFormatException.
	*/
	@Test
	void testDeleteByIds_7() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		String[] idnos = new String[1];
		idnos[0] = "1.1";
		
		// Act
		Throwable exception = assertThrows(NumberFormatException.class, () -> {
			personInfoMgr.deleteByIds(idnos);
		});
		
		// Assert
		assertEquals("For input string: \"1.1\"", exception.getMessage());
	}
	
	/**
	* Test case 8 for method deleteByIds.
	* The test case aims to test the situation that when the parameter idnos contains element which is not a positive integer,
	* the method deleteByIds will throw a IllegalArgumentException.
	*/
	@Test
	void testDeleteByIds_8() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		String[] idnos = new String[1];
		idnos[0] = "-1";
		
		// Act
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			personInfoMgr.deleteByIds(idnos);
		});
		
		// Assert
		assertEquals("idnos contains element which is not a positive integer", exception.getMessage());
	}
	
	/**
	* Test case 9 for method deleteByIds.
	* The test case aims to test the situation that when the parameter idnos contains element which is not a positive integer,
	* the method deleteByIds will throw a IllegalArgumentException.
	*/
	@Test
	void testDeleteByIds_9() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		String[] idnos = new String[1];
		idnos[0] = "0";
		
		// Act
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			personInfoMgr.deleteByIds(idnos);
		});
		
		// Assert
		assertEquals("idnos contains element which is not a positive integer", exception.getMessage());
	}
	
	/**
	* Test case 10 for method deleteByIds.
	* The test case aims to test the situation that when the parameter idnos contains element which is not a positive integer,
	* the method deleteByIds will throw a IllegalArgumentException.
	*/
	@Test
	void testDeleteByIds_10() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		String[] idnos = new String[1];
		idnos[0] = "2147483648";
		
		// Act
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			personInfoMgr.deleteByIds(idnos);
		});
		
		// Assert
		assertEquals("idnos contains element which is not a positive integer", exception.getMessage());
	}
}

// PersonInfoMgr_2Test.java
package com.hf.sfm.sfmis.personinfo.business;

import org.hibernate.Transaction;
import com.hf.sfm.sfmis.personinfo.pdo.APersonInfo;
import com.hf.sfm.util.DaoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PersonInfoMgr}.
* It contains ten unit test cases for the {@link PersonInfoMgr#saveOrUpdate(APersonInfo)} method.
*/
class PersonInfoMgr_2Test {
		
	/**
	* Test case 1 for method saveOrUpdate.
	* The test case aims to test the situation that when the parameter pInfo is null,
	* the method saveOrUpdate will throw a NullPointerException.
	*/
	@Test
	void testSaveOrUpdate_1() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		APersonInfo pInfo = null;
		
		// Act
		Throwable exception = assertThrows(NullPointerException.class, () -> {
			personInfoMgr.saveOrUpdate(pInfo);
		});
		
		// Assert
		assertEquals("pInfo is marked non-null but is null", exception.getMessage());
	}
	
	/**
	* Test case 2 for method saveOrUpdate.
	* The test case aims to test the situation that when the parameter pInfo is not null,
	* the method saveOrUpdate will throw a NullPointerException.
	*/
	@Test
	void testSaveOrUpdate_2() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		APersonInfo pInfo = new APersonInfo();
		
		// Act
		Throwable exception = assertThrows(NullPointerException.class, () -> {
			personInfoMgr.saveOrUpdate(pInfo);
		});
		
		// Assert
		assertEquals("pInfo is marked non-null but is null", exception.getMessage());
	}
	
	/**
	* Test case 3 for method saveOrUpdate.
	* The test case aims to test the situation that when the parameter pInfo is not null,
	* the method saveOrUpdate will throw a NullPointerException.
	*/
	@Test
	void testSaveOrUpdate_3() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		
		// Act
		Throwable exception = assertThrows(NullPointerException.class, () -> {
			personInfoMgr.saveOrUpdate(pInfo);
		});
		
		// Assert
		assertEquals("pInfo is marked non-null but is null", exception.getMessage());
	}
	
	/**
	* Test case 4 for method saveOrUpdate.
	* The test case aims to test the situation that when the parameter pInfo is not null,
	* the method saveOrUpdate will throw a NullPointerException.
	*/
	@Test
	void testSaveOrUpdate_4() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		pInfo.setPersonname("1");
		
		// Act
		Throwable exception = assertThrows(NullPointerException.class, () -> {
			personInfoMgr.saveOrUpdate(pInfo);
		});
		
		// Assert
		assertEquals("pInfo is marked non-null but is null", exception.getMessage());
	}
	
	/**
	* Test case 5 for method saveOrUpdate.
	* The test case aims to test the situation that when the parameter pInfo is not null,
	* the method saveOrUpdate will throw a NullPointerException.
	*/
	@Test
	void testSaveOrUpdate_5() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		pInfo.setPersonname("1");
		pInfo.setPersonsex("1");
		
		// Act
		Throwable exception = assertThrows(NullPointerException.class, () -> {
			personInfoMgr.saveOrUpdate(pInfo);
		});
		
		// Assert
		assertEquals("pInfo is marked non-null but is null", exception.getMessage());
	}
	
	/**
	* Test case 6 for method saveOrUpdate.
	* The test case aims to test the situation that when the parameter pInfo is not null,
	* the method saveOrUpdate will throw a NullPointerException.
	*/
	@Test
	void testSaveOrUpdate_6() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		pInfo.setPersonname("1");
		pInfo.setPersonsex("1");
		pInfo.setPersonage(1);
		
		// Act
		Throwable exception = assertThrows(NullPointerException.class, () -> {
			personInfoMgr.saveOrUpdate(pInfo);
		});
		
		// Assert
		assertEquals("pInfo is marked non-null but is null", exception.getMessage());
	}
	
	/**
	* Test case 7 for method saveOrUpdate.
	* The test case aims to test the situation that when the parameter pInfo is not null,
	* the method saveOrUpdate will throw a NullPointerException.
	*/
	@Test
	void testSaveOrUpdate_7() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		pInfo.setPersonname("1");
		pInfo.setPersonsex("1");
		pInfo.setPersonage(1);
		pInfo.setPersonaddress("1");
		
		// Act
		Throwable exception = assertThrows(NullPointerException.class, () -> {
			personInfoMgr.saveOrUpdate(pInfo);
		});
		
		// Assert
		assertEquals("pInfo is marked non-null but is null", exception.getMessage());
	}
	
	/**
	* Test case 8 for method saveOrUpdate.
	* The test case aims to test the situation that when the parameter pInfo is not null,
	* the method saveOrUpdate will throw a NullPointerException.
	*/
	@Test
	void testSaveOrUpdate_8() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		pInfo.setPersonname("1");
		pInfo.setPersonsex("1");
		pInfo.setPersonage(1);
		pInfo.setPersonaddress("1");
		pInfo.setPersonphone("1");
		
		// Act
		Throwable exception = assertThrows(NullPointerException.class, () -> {
			personInfoMgr.saveOrUpdate(pInfo);
		});
		
		// Assert
		assertEquals("pInfo is marked non-null but is null", exception