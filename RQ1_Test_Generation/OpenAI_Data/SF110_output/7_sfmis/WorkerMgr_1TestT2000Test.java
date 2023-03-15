// WorkerMgr_1Test.java
package com.hf.sfm.system.business;

import org.hibernate.Transaction;
import com.hf.sfm.sfmis.personinfo.business.PersonInfoMgr;
import com.hf.sfm.system.pdo.AWorker;
import com.hf.sfm.util.DaoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WorkerMgr}.
* It contains ten unit test cases for the {@link WorkerMgr#deleteByIds(String[])} method.
*/
class WorkerMgr_1Test {

	/**
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case 1 for method deleteByIds.
	* Test case