// PersonInfoMgrTest0.java
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
class PersonInfoMgrTest0 {

	/**
	* Test case 1 for method saveOrUpdate.
	* The test case aims to test the branch of the method saveOrUpdate
	* where the parameter pInfo is null.
	* The expected result is that the method will return "0".
	*/
	@Test
	void testCase1() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		APersonInfo pInfo = null;
		
		// Act
		String result = personInfoMgr.saveOrUpdate(pInfo);
		
		// Assert
		assertEquals("0", result);
	}
	
	/**
	* Test case 2 for method saveOrUpdate.
	* The test case aims to test the branch of the method saveOrUpdate
	* where the parameter pInfo is not null and the personid of pInfo is null.
	* The expected result is that the method will return "1".
	*/
	@Test
	void testCase2() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid(null);
		
		// Act
		String result = personInfoMgr.saveOrUpdate(pInfo);
		
		// Assert
		assertEquals("1", result);
	}
	
	/**
	* Test case 3 for method saveOrUpdate.
	* The test case aims to test the branch of the method saveOrUpdate
	* where the parameter pInfo is not null and the personid of pInfo is not null.
	* The expected result is that the method will return "1".
	*/
	@Test
	void testCase3() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		
		// Act
		String result = personInfoMgr.saveOrUpdate(pInfo);
		
		// Assert
		assertEquals("1", result);
	}
	
	/**
	* Test case 4 for method saveOrUpdate.
	* The test case aims to test the branch of the method saveOrUpdate
	* where the parameter pInfo is not null and the personid of pInfo is not null.
	* The expected result is that the method will return "1".
	*/
	@Test
	void testCase4() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		
		// Act
		String result = personInfoMgr.saveOrUpdate(pInfo);
		
		// Assert
		assertEquals("1", result);
	}
	
	/**
	* Test case 5 for method saveOrUpdate.
	* The test case aims to test the branch of the method saveOrUpdate
	* where the parameter pInfo is not null and the personid of pInfo is not null.
	* The expected result is that the method will return "1".
	*/
	@Test
	void testCase5() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		
		// Act
		String result = personInfoMgr.saveOrUpdate(pInfo);
		
		// Assert
		assertEquals("1", result);
	}
	
	/**
	* Test case 6 for method saveOrUpdate.
	* The test case aims to test the branch of the method saveOrUpdate
	* where the parameter pInfo is not null and the personid of pInfo is not null.
	* The expected result is that the method will return "1".
	*/
	@Test
	void testCase6() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		
		// Act
		String result = personInfoMgr.saveOrUpdate(pInfo);
		
		// Assert
		assertEquals("1", result);
	}
	
	/**
	* Test case 7 for method saveOrUpdate.
	* The test case aims to test the branch of the method saveOrUpdate
	* where the parameter pInfo is not null and the personid of pInfo is not null.
	* The expected result is that the method will return "1".
	*/
	@Test
	void testCase7() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		
		// Act
		String result = personInfoMgr.saveOrUpdate(pInfo);
		
		// Assert
		assertEquals("1", result);
	}
	
	/**
	* Test case 8 for method saveOrUpdate.
	* The test case aims to test the branch of the method saveOrUpdate
	* where the parameter pInfo is not null and the personid of pInfo is not null.
	* The expected result is that the method will return "1".
	*/
	@Test
	void testCase8() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		
		// Act
		String result = personInfoMgr.saveOrUpdate(pInfo);
		
		// Assert
		assertEquals("1", result);
	}
	
	/**
	* Test case 9 for method saveOrUpdate.
	* The test case aims to test the branch of the method saveOrUpdate
	* where the parameter pInfo is not null and the personid of pInfo is not null.
	* The expected result is that the method will return "1".
	*/
	@Test
	void testCase9() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		
		// Act
		String result = personInfoMgr.saveOrUpdate(pInfo);
		
		// Assert
		assertEquals("1", result);
	}
	
	/**
	* Test case 10 for method saveOrUpdate.
	* The test case aims to test the branch of the method saveOrUpdate
	* where the parameter pInfo is not null and the personid of pInfo is not null.
	* The expected result is that the method will return "1".
	*/
	@Test
	void testCase10() {
		// Arrange
		PersonInfoMgr personInfoMgr = new PersonInfoMgr();
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		
		// Act
		String result = personInfoMgr.saveOrUpdate(pInfo);
		
		// Assert
		assertEquals("1", result);
	}
	
}

// PersonInfoMgrTest1.java
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
class PersonInfoMgrTest1 {
		
	/**
	* Test case 1 for method deleteByIds.
	* The test case aims to test the branch of the method deleteByIds
	* where the parameter idnos is null.
	* The expected result is that the method