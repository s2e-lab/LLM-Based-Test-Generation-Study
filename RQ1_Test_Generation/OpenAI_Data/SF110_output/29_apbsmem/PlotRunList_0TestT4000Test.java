// PlotRunList_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#size()} method.
*/
class PlotRunList_0Test {

	/**
	* Test case for {@link PlotRunList#size()}.
	*/
	@Test
	void testSize() {
		PlotRunList runList = new PlotRunList();
		assertEquals(0, runList.size());
		
		PlotRun[] runArr = new PlotRun[0];
		runList = new PlotRunList(runArr);
		assertEquals(0, runList.size());
		
		runArr = new PlotRun[1];
		runArr[0] = new PlotRun();
		runList = new PlotRunList(runArr);
		assertEquals(1, runList.size());
		
		runArr = new PlotRun[2];
		runArr[0] = new PlotRun();
		runArr[1] = new PlotRun();
		runList = new PlotRunList(runArr);
		assertEquals(2, runList.size());
		
		runArr = new PlotRun[3];
		runArr[0] = new PlotRun();
		runArr[1] = new PlotRun();
		runArr[2] = new PlotRun();
		runList = new PlotRunList(runArr);
		assertEquals(3, runList.size());
		
		runArr = new PlotRun[4];
		runArr[0] = new PlotRun();
		runArr[1] = new PlotRun();
		runArr[2] = new PlotRun();
		runArr[3] = new PlotRun();
		runList = new PlotRunList(runArr);
		assertEquals(4, runList.size());
		
		runArr = new PlotRun[5];
		runArr[0] = new PlotRun();
		runArr[1] = new PlotRun();
		runArr[2] = new PlotRun();
		runArr[3] = new PlotRun();
		runArr[4] = new PlotRun();
		runList = new PlotRunList(runArr);
		assertEquals(5, runList.size());
		
		runArr = new PlotRun[6];
		runArr[0] = new PlotRun();
		runArr[1] = new PlotRun();
		runArr[2] = new PlotRun();
		runArr[3] = new PlotRun();
		runArr[4] = new PlotRun();
		runArr[5] = new PlotRun();
		runList = new PlotRunList(runArr);
		assertEquals(6, runList.size());
		
		runArr = new PlotRun[7];
		runArr[0] = new PlotRun();
		runArr[1] = new PlotRun();
		runArr[2] = new PlotRun();
		runArr[3] = new PlotRun();
		runArr[4] = new PlotRun();
		runArr[5] = new PlotRun();
		runArr[6] = new PlotRun();
		runList = new PlotRunList(runArr);
		assertEquals(7, runList.size());
		
		runArr = new PlotRun[8];
		runArr[0] = new PlotRun();
		runArr[1] = new PlotRun();
		runArr[2] = new PlotRun();
		runArr[3] = new PlotRun();
		runArr[4] = new PlotRun();
		runArr[5] = new PlotRun();
		runArr[6] = new PlotRun();
		runArr[7] = new PlotRun();
		runList = new PlotRunList(runArr);
		assertEquals(8, runList.size());
		
		runArr = new PlotRun[9];
		runArr[0] = new PlotRun();
		runArr[1] = new PlotRun();
		runArr[2] = new PlotRun();
		runArr[3] = new PlotRun();
		runArr[4] = new PlotRun();
		runArr[5] = new PlotRun();
		runArr[6] = new PlotRun();
		runArr[7] = new PlotRun();
		runArr[8] = new PlotRun();
		runList = new PlotRunList(runArr);
		assertEquals(9, runList.size());
		
		runArr = new PlotRun[10];
		runArr[0] = new PlotRun();
		runArr[1] = new PlotRun();
		runArr[2] = new PlotRun();
		runArr[3] = new PlotRun();
		runArr[4] = new PlotRun();
		runArr[5] = new PlotRun();
		runArr[6] = new PlotRun();
		runArr[7] = new PlotRun();
		runArr[8] = new PlotRun();
		runArr[9] = new PlotRun();
		runList = new PlotRunList(runArr);
		assertEquals(10, runList.size());
	}
}

// PlotRunList_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#get(int)} method.
*/
class PlotRunList_1Test {
		
	/**
	* Test case for {@link PlotRunList#get(int)}.
	*/
	@Test
	void testGet() {
		PlotRunList runList = new PlotRunList();
		assertEquals(null, runList.get(0));
		
		PlotRun[] runArr = new PlotRun[0];
		runList = new PlotRunList(runArr);
		assertEquals(null, runList.get(0));
		
		runArr = new PlotRun[1];
		runArr[0] = new PlotRun();
		runList = new PlotRunList(runArr);
		assertEquals(runArr[0], runList.get(0));
		
		runArr = new PlotRun[2];
		runArr[0] = new PlotRun();
		runArr[1] = new PlotRun();
		runList = new PlotRunList(runArr);
		assertEquals(runArr[0], runList.get(0));
		assertEquals(runArr[1], runList.get(1));
		
		runArr = new PlotRun[3];
		runArr[0] = new PlotRun();
		runArr[1] = new PlotRun();
		runArr[2] = new PlotRun();
		runList = new PlotRunList(runArr);
		assertEquals(runArr[0], runList.get(0));
		assertEquals(runArr[1], runList.get(1));
		assertEquals(runArr[2], runList.get(2));
		
		runArr = new PlotRun[4];
		runArr[0] = new PlotRun();
		runArr[1] = new PlotRun();
		runArr[2] = new PlotRun();
		runArr[3] = new PlotRun();
		runList = new PlotRunList(runArr);
		assertEquals(runArr[0], runList.get(0));
		assertEquals(runArr[1], runList.get(1));
		assertEquals(runArr[2], runList.get(2));
		assertEquals(runArr[3], runList.get(3));
		
		runArr = new PlotRun[5];
		runArr[0] = new PlotRun();
		runArr[1] = new PlotRun();
		runArr[2] = new PlotRun();
		runArr[3] = new PlotRun();
		runArr[4] = new PlotRun();
		runList = new PlotRunList(runArr);
		assertEquals(runArr[0], runList.get(0));
		assertEquals(runArr[1], runList.get(1));
		assertEquals(runArr[2], runList.get(2));
		assertEquals(runArr[3], runList.get(3));
		assertEquals(runArr[4], runList.get(4));
		
		runArr = new PlotRun[6];
		runArr[0] = new PlotRun();
		runArr[1] = new PlotRun();
		runArr[2] = new PlotRun();
		runArr[3] = new PlotRun();
		runArr[4] = new PlotRun();
		runArr[5] = new PlotRun();
		runList = new PlotRunList(runArr);
		assertEquals(runArr[0], runList.get(0));
		assertEquals(runArr[1], runList.get(1));
		assertEquals(runArr[2], runList.get(2));
		assertEquals(runArr[3], runList.get(3));
		assertEquals(runArr[4], runList.get(4));
		assertEquals(runArr[5], runList.get(5));
		
		runArr = new PlotRun[7];
		runArr[0] = new PlotRun();
		runArr[1] = new PlotRun();
		runArr[2] = new PlotRun();
		runArr[3] = new PlotRun();
		runArr[4] = new PlotRun();
		runArr[5] = new PlotRun();
		runArr[6] = new PlotRun();
		runList = new PlotRunList(runArr);
		assertEquals(runArr[0], runList.get(0));
		assertEquals(runArr[1], runList.get(1));
		assertEquals(runArr[2], runList.get(2));
		assertEquals(runArr[3], runList.get(3));
		assertEquals(runArr[4], runList.get(4));
		assertEquals(runArr[5], runList.get(5));
		assertEquals(runArr[6], runList.get(6));
		
		runArr = new PlotRun[8];
		runArr[0] = new PlotRun();
		runArr[1] = new PlotRun();
		runArr[2] = new PlotRun();
		runArr[3] = new PlotRun();
		runArr[4] = new PlotRun();
		runArr[5] = new PlotRun();
		runArr[6] = new PlotRun();
		runArr[7] = new PlotRun();
		runList = new PlotRunList(runArr);
		assertEquals(runArr[0], runList.get(0));
		assertEquals(runArr[1], runList.get(1));
		assertEquals(runArr[2], runList.get(2));
		assertEquals(runArr[3], runList.get(3));
		assertEquals(runArr[4], runList.get(4));
		assertEquals(runArr[5], runList.get(5));
		assertEquals(runArr[6], runList.get(6));
		assertEquals(runArr[7], runList.get(7));
		
		runArr = new PlotRun[9];
		runArr[0] = new PlotRun();
		runArr[1] = new PlotRun();
		runArr[2] = new PlotRun();
		runArr[3] = new PlotRun();
		runArr[4] = new PlotRun();
		runArr[5] = new PlotRun();
		runArr[6] = new PlotRun();
		runArr[7] = new PlotRun();
		runArr[8] = new PlotRun();
		runList = new PlotRunList(runArr);
		assertEquals(runArr[0], runList.get(0));
		assertEquals(runArr[1], runList.get(1));
		assertEquals(runArr[2], runList.get(2));
		assertEquals(runArr[3], runList.get(3));
		assertEquals(runArr[4], runList.get(4));
		assertEquals(runArr[5], runList.get(5));
		assertEquals(runArr[6], runList.get(6));
		assertEquals(runArr[7], runList.get(7));
		assertEquals(runArr[8], runList.get(8));
		
		runArr = new PlotRun[10];
		runArr[0] = new PlotRun();
		runArr[1] = new PlotRun();
		runArr[2] = new PlotRun();
		runArr[3] = new PlotRun();
		runArr[4] = new PlotRun();
		runArr[5] = new PlotRun();
		runArr[6] = new PlotRun();
		runArr[7] = new PlotRun();
		runArr[8] = new PlotRun();
		runArr[9] = new PlotRun();
		runList = new PlotRunList(runArr);
		assertEquals(runArr[0], runList.get(0));
		assertEquals(runArr[1], runList.get(1));
		assertEquals(runArr[2], runList.get(2));
		assertEquals(runArr[3], runList.get(3));
		assertEquals(runArr[4], runList.get(4));
		assertEquals(runArr[5], runList.get(5));
		assertEquals(runArr[6], runList.get(6));
		assertEquals(runArr[7], runList.get(7));
		assertEquals(runArr[8], runList.get(8));
		assertEquals(runArr[9], runList.get(9));
	}
}

// PlotRunList_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#set(int, Object)} method.
*/
class PlotRunList_2Test {
		
	/**
	* Test case for {@link PlotRunList#set(int, Object)}.
	*/
	@Test
	void testSet() {
		PlotRunList runList = new PlotRunList();
		assertEquals(null, runList.set(0, new PlotRun()));
		
		PlotRun[] runArr = new PlotRun[0];
		runList = new PlotRunList(runArr);
		assertEquals(null, runList.set(0,