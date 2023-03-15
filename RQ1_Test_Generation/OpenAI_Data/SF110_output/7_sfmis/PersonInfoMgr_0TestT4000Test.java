// PersonInfoMgr_0Test.java
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
class PersonInfoMgr_0Test {

	/**
	* Test case 1:
	* 		pInfo: null
	* 		Expected: NullPointerException
	*/
	@Test
	void testCase1() {
		// Arrange
		APersonInfo pInfo = null;
		
		// Act
		String actual = new PersonInfoMgr().saveOrUpdate(pInfo);
		
		// Assert
		assertEquals("0", actual);
	}
	
	/**
	* Test case 2:
	* 		pInfo: {personid: null, personname: null, personsex: null, personage: null, personaddress: null, personphone: null, personemail: null, personqq: null, personwechat: null, personremark: null}
	* 		Expected: NullPointerException
	*/
	@Test
	void testCase2() {
		// Arrange
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid(null);
		pInfo.setPersonname(null);
		pInfo.setPersonsex(null);
		pInfo.setPersonage(null);
		pInfo.setPersonaddress(null);
		pInfo.setPersonphone(null);
		pInfo.setPersonemail(null);
		pInfo.setPersonqq(null);
		pInfo.setPersonwechat(null);
		pInfo.setPersonremark(null);
		
		// Act
		String actual = new PersonInfoMgr().saveOrUpdate(pInfo);
		
		// Assert
		assertEquals("0", actual);
	}
	
	/**
	* Test case 3:
	* 		pInfo: {personid: "", personname: "", personsex: "", personage: "", personaddress: "", personphone: "", personemail: "", personqq: "", personwechat: "", personremark: ""}
	* 		Expected: NullPointerException
	*/
	@Test
	void testCase3() {
		// Arrange
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("");
		pInfo.setPersonname("");
		pInfo.setPersonsex("");
		pInfo.setPersonage("");
		pInfo.setPersonaddress("");
		pInfo.setPersonphone("");
		pInfo.setPersonemail("");
		pInfo.setPersonqq("");
		pInfo.setPersonwechat("");
		pInfo.setPersonremark("");
		
		// Act
		String actual = new PersonInfoMgr().saveOrUpdate(pInfo);
		
		// Assert
		assertEquals("0", actual);
	}
	
	/**
	* Test case 4:
	* 		pInfo: {personid: "1", personname: "1", personsex: "1", personage: "1", personaddress: "1", personphone: "1", personemail: "1", personqq: "1", personwechat: "1", personremark: "1"}
	* 		Expected: NullPointerException
	*/
	@Test
	void testCase4() {
		// Arrange
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		pInfo.setPersonname("1");
		pInfo.setPersonsex("1");
		pInfo.setPersonage("1");
		pInfo.setPersonaddress("1");
		pInfo.setPersonphone("1");
		pInfo.setPersonemail("1");
		pInfo.setPersonqq("1");
		pInfo.setPersonwechat("1");
		pInfo.setPersonremark("1");
		
		// Act
		String actual = new PersonInfoMgr().saveOrUpdate(pInfo);
		
		// Assert
		assertEquals("0", actual);
	}
	
	/**
	* Test case 5:
	* 		pInfo: {personid: "1", personname: "1", personsex: "1", personage: "1", personaddress: "1", personphone: "1", personemail: "1", personqq: "1", personwechat: "1", personremark: "1"}
	* 		Expected: NullPointerException
	*/
	@Test
	void testCase5() {
		// Arrange
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		pInfo.setPersonname("1");
		pInfo.setPersonsex("1");
		pInfo.setPersonage("1");
		pInfo.setPersonaddress("1");
		pInfo.setPersonphone("1");
		pInfo.setPersonemail("1");
		pInfo.setPersonqq("1");
		pInfo.setPersonwechat("1");
		pInfo.setPersonremark("1");
		
		// Act
		String actual = new PersonInfoMgr().saveOrUpdate(pInfo);
		
		// Assert
		assertEquals("0", actual);
	}
	
	/**
	* Test case 6:
	* 		pInfo: {personid: "1", personname: "1", personsex: "1", personage: "1", personaddress: "1", personphone: "1", personemail: "1", personqq: "1", personwechat: "1", personremark: "1"}
	* 		Expected: NullPointerException
	*/
	@Test
	void testCase6() {
		// Arrange
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		pInfo.setPersonname("1");
		pInfo.setPersonsex("1");
		pInfo.setPersonage("1");
		pInfo.setPersonaddress("1");
		pInfo.setPersonphone("1");
		pInfo.setPersonemail("1");
		pInfo.setPersonqq("1");
		pInfo.setPersonwechat("1");
		pInfo.setPersonremark("1");
		
		// Act
		String actual = new PersonInfoMgr().saveOrUpdate(pInfo);
		
		// Assert
		assertEquals("0", actual);
	}
	
	/**
	* Test case 7:
	* 		pInfo: {personid: "1", personname: "1", personsex: "1", personage: "1", personaddress: "1", personphone: "1", personemail: "1", personqq: "1", personwechat: "1", personremark: "1"}
	* 		Expected: NullPointerException
	*/
	@Test
	void testCase7() {
		// Arrange
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		pInfo.setPersonname("1");
		pInfo.setPersonsex("1");
		pInfo.setPersonage("1");
		pInfo.setPersonaddress("1");
		pInfo.setPersonphone("1");
		pInfo.setPersonemail("1");
		pInfo.setPersonqq("1");
		pInfo.setPersonwechat("1");
		pInfo.setPersonremark("1");
		
		// Act
		String actual = new PersonInfoMgr().saveOrUpdate(pInfo);
		
		// Assert
		assertEquals("0", actual);
	}
	
	/**
	* Test case 8:
	* 		pInfo: {personid: "1", personname: "1", personsex: "1", personage: "1", personaddress: "1", personphone: "1", personemail: "1", personqq: "1", personwechat: "1", personremark: "1"}
	* 		Expected: NullPointerException
	*/
	@Test
	void testCase8() {
		// Arrange
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		pInfo.setPersonname("1");
		pInfo.setPersonsex("1");
		pInfo.setPersonage("1");
		pInfo.setPersonaddress("1");
		pInfo.setPersonphone("1");
		pInfo.setPersonemail("1");
		pInfo.setPersonqq("1");
		pInfo.setPersonwechat("1");
		pInfo.setPersonremark("1");
		
		// Act
		String actual = new PersonInfoMgr().saveOrUpdate(pInfo);
		
		// Assert
		assertEquals("0", actual);
	}
	
	/**
	* Test case 9:
	* 		pInfo: {personid: "1", personname: "1", personsex: "1", personage: "1", personaddress: "1", personphone: "1", personemail: "1", personqq: "1", personwechat: "1", personremark: "1"}
	* 		Expected: NullPointerException
	*/
	@Test
	void testCase9() {
		// Arrange
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		pInfo.setPersonname("1");
		pInfo.setPersonsex("1");
		pInfo.setPersonage("1");
		pInfo.setPersonaddress("1");
		pInfo.setPersonphone("1");
		pInfo.setPersonemail("1");
		pInfo.setPersonqq("1");
		pInfo.setPersonwechat("1");
		pInfo.setPersonremark("1");
		
		// Act
		String actual = new PersonInfoMgr().saveOrUpdate(pInfo);
		
		// Assert
		assertEquals("0", actual);
	}
	
	/**
	* Test case 10:
	* 		pInfo: {personid: "1", personname: "1", personsex: "1", personage: "1", personaddress: "1", personphone: "1", personemail: "1", personqq: "1", personwechat: "1", personremark: "1"}
	* 		Expected: NullPointerException
	*/
	@Test
	void testCase10() {
		// Arrange
		APersonInfo pInfo = new APersonInfo();
		pInfo.setPersonid("1");
		pInfo.setPersonname("1");
		pInfo.setPersonsex("1");
		pInfo.setPersonage("1");
		pInfo.setPersonaddress("1");
		pInfo.setPersonphone("1");
		pInfo.setPersonemail("1");
		pInfo.setPersonqq("1");
		pInfo.setPersonwechat("1");
		pInfo.setPersonremark("1");
		
		// Act
		String actual = new PersonInfoMgr().saveOrUpdate(pInfo);
		
		// Assert
		assertEquals("0", actual);
	}
	
}

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
	* Test case 1:
	* 		idnos: null
	* 		Expected: NullPointerException
	*/
	@Test
	void testCase1() {
		// Arrange
		String[] idnos = null;
		
		// Act
		String actual = new PersonInfoMgr().deleteByIds(idnos);
		
		// Assert
		assertEquals("0", actual);
	}
	
	/**
	* Test case 2:
	* 		idnos: {""}
	* 		Expected: NullPointerException
	*/
	@Test
	void testCase2() {
		// Arrange
		String[] idnos = {""};
		
		// Act
		String actual = new PersonInfoMgr().deleteByIds(idnos);
		
		// Assert
		assertEquals("0", actual);
	}
	
	/**
	* Test case 3:
	* 		idnos: {"1"}
	* 		Expected: NullPointerException
	*/
	@Test
	void testCase3() {
		// Arrange
		String[] idnos = {"1"};
		
		// Act
		String actual = new PersonInfoMgr().deleteByIds(idnos);
		
		// Assert
		assertEquals("0", actual);
	}
	
	/**
	* Test case 4:
	* 		idnos: {"1"}
	* 		Expected: NullPointerException
	*/
	@Test
	void testCase4() {
		// Arrange
		String[] idnos = {"1"};
		
		// Act
		String actual = new PersonInfoMgr().deleteByIds(idnos);
		
		// Assert
		assertEquals("0", actual);
	}
	
	/**
	* Test case 5:
	* 		idnos: {"1"}
	* 		Expected: NullPointerException
	*/
	@Test
	void testCase5() {
		// Arrange
		String[] idnos = {"1"};
		
		// Act
		String actual = new PersonInfoMgr().deleteByIds(idnos);
		
		// Assert
		assertEquals("0", actual);
	}
	
	/**
	* Test case 6:
	* 		idnos: {"1"}
	* 		Expected: NullPointerException
	*/
	@Test
	void testCase6() {
		// Arrange
		String[] idnos = {"1"};
		
		// Act
		String actual = new PersonInfoMgr().deleteByIds(idnos);
		
		// Assert
		assertEquals("0", actual);
	}
	
	/**
	* Test case 7:
	* 		idnos: {"1"}
	* 		Expected: NullPointerException
	*/
	@Test
	void testCase7() {
		// Arrange
		String[] idnos = {"1"};
		
		// Act
		String actual = new PersonInfoMgr().deleteByIds(idnos);
		
		// Assert
		assertEquals("0", actual);
	}
	
	/**
	* Test case 8:
	* 		idnos: {"1"}
	* 		Expected: NullPointerException
	*/
	@Test
	void testCase8() {
		// Arrange
		String[] idnos = {"1"};
		
		// Act
		String actual = new PersonInfoMgr().deleteByIds(idnos);
		
		// Assert
		assertEquals("0", actual);
	}
	
	/**
	* Test case 9:
	* 		idnos: {"1"}
	* 		Expected: NullPointerException
	*/
	@Test
	void testCase9