// ChartUtilities_5Test.java
package de.progra.charting;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChartUtilities}.
* It contains ten unit test cases for the {@link ChartUtilities#exp(double)} method.
*/
class ChartUtilities_5Test {

	/**
	* Test case for {@link ChartUtilities#exp(double)}.
	*/
	@Test
	void testExp_1() {
		double d = 0.0;
		int exp = ChartUtilities.exp(d);
		assertEquals(0, exp);
	}
	
	/**
	* Test case for {@link ChartUtilities#exp(double)}.
	*/
	@Test
	void testExp_2() {
		double d = 1.0;
		int exp = ChartUtilities.exp(d);
		assertEquals(0, exp);
	}
	
	/**
	* Test case for {@link ChartUtilities#exp(double)}.
	*/
	@Test
	void testExp_3() {
		double d = -1.0;
		int exp = ChartUtilities.exp(d);
		assertEquals(0, exp);
	}
	
	/**
	* Test case for {@link ChartUtilities#exp(double)}.
	*/
	@Test
	void testExp_4() {
		double d = 10.0;
		int exp = ChartUtilities.exp(d);
		assertEquals(1, exp);
	}
	
	/**
	* Test case for {@link ChartUtilities#exp(double)}.
	*/
	@Test
	void testExp_5() {
		double d = -10.0;
		int exp = ChartUtilities.exp(d);
		assertEquals(-1, exp);
	}
	
	/**
	* Test case for {@link ChartUtilities#exp(double)}.
	*/
	@Test
	void testExp_6() {
		double d = 100.0;
		int exp = ChartUtilities.exp(d);
		assertEquals(2, exp);
	}
	
	/**
	* Test case for {@link ChartUtilities#exp(double)}.
	*/
	@Test
	void testExp_7() {
		double d = -100.0;
		int exp = ChartUtilities.exp(d);
		assertEquals(-2, exp);
	}
	
	/**
	* Test case for {@link ChartUtilities#exp(double)}.
	*/
	@Test
	void testExp_8() {
		double d = 0.1;
		int exp = ChartUtilities.exp(d);
		assertEquals(-1, exp);
	}
	
	/**
	* Test case for {@link ChartUtilities#exp(double)}.
	*/
	@Test
	void testExp_9() {
		double d = -0.1;
		int exp = ChartUtilities.exp(d);
		assertEquals(-1, exp);
	}
	
	/**
	* Test case for {@link ChartUtilities#exp(double)}.
	*/
	@Test
	void testExp_10() {
		double d = 0.01;
		int exp = ChartUtilities.exp(d);
		assertEquals(-2, exp);
	}
	
}

// ChartUtilities_6Test.java
package de.progra.charting;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChartUtilities}.
* It contains ten unit test cases for the {@link ChartUtilities#floor(double, int)} method.
*/
class ChartUtilities_6Test {
		
	/**
	* Test case for {@link ChartUtilities#floor(double, int)}.
	*/
	@Test
	void testFloor_1() {
		double d = 0.0;
		int exp = 0;
		double floor = ChartUtilities.floor(d, exp);
		assertEquals(0.0, floor);
	}
	
	/**
	* Test case for {@link ChartUtilities#floor(double, int)}.
	*/
	@Test
	void testFloor_2() {
		double d = 1.0;
		int exp = 0;
		double floor = ChartUtilities.floor(d, exp);
		assertEquals(1.0, floor);
	}
	
	/**
	* Test case for {@link ChartUtilities#floor(double, int)}.
	*/
	@Test
	void testFloor_3() {
		double d = -1.0;
		int exp = 0;
		double floor = ChartUtilities.floor(d, exp);
		assertEquals(-1.0, floor);
	}
	
	/**
	* Test case for {@link ChartUtilities#floor(double, int)}.
	*/
	@Test
	void testFloor_4() {
		double d = 10.0;
		int exp = 1;
		double floor = ChartUtilities.floor(d, exp);
		assertEquals(10.0, floor);
	}
	
	/**
	* Test case for {@link ChartUtilities#floor(double, int)}.
	*/
	@Test
	void testFloor_5() {
		double d = -10.0;
		int exp = 1;
		double floor = ChartUtilities.floor(d, exp);
		assertEquals(-10.0, floor);
	}
	
	/**
	* Test case for {@link ChartUtilities#floor(double, int)}.
	*/
	@Test
	void testFloor_6() {
		double d = 100.0;
		int exp = 2;
		double floor = ChartUtilities.floor(d, exp);
		assertEquals(100.0, floor);
	}
	
	/**
	* Test case for {@link ChartUtilities#floor(double, int)}.
	*/
	@Test
	void testFloor_7() {
		double d = -100.0;
		int exp = 2;
		double floor = ChartUtilities.floor(d, exp);
		assertEquals(-100.0, floor);
	}
	
	/**
	* Test case for {@link ChartUtilities#floor(double, int)}.
	*/
	@Test
	void testFloor_8() {
		double d = 0.1;
		int exp = -1;
		double floor = ChartUtilities.floor(d, exp);
		assertEquals(0.0, floor);
	}
	
	/**
	* Test case for {@link ChartUtilities#floor(double, int)}.
	*/
	@Test
	void testFloor_9() {
		double d = -0.1;
		int exp = -1;
		double floor = ChartUtilities.floor(d, exp);
		assertEquals(-0.1, floor);
	}
	
	/**
	* Test case for {@link ChartUtilities#floor(double, int)}.
	*/
	@Test
	void testFloor_10() {
		double d = 0.01;
		int exp = -2;
		double floor = ChartUtilities.floor(d, exp);
		assertEquals(0.0, floor);
	}
	
}

// ChartUtilities_7Test.java
package de.progra.charting;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChartUtilities}.
* It contains ten unit test cases for the {@link ChartUtilities#ceil(double, int)} method.
*/
class ChartUtilities_7Test {
		
	/**
	* Test case for {@link ChartUtilities#ceil(double, int)}.
	*/
	@Test
	void testCeil_1() {
		double d = 0.0;
		int exp = 0;
		double ceil = ChartUtilities.ceil(d, exp);
		assertEquals(0.0, ceil);
	}
	
	/**
	* Test case for {@link ChartUtilities#ceil(double, int)}.
	*/
	@Test
	void testCeil_2() {
		double d = 1.0;
		int exp = 0;
		double ceil = ChartUtilities.ceil(d, exp);
		assertEquals(1.0, ceil);
	}
	
	/**
	* Test case for {@link ChartUtilities#ceil(double, int)}.
	*/
	@Test
	void testCeil_3() {
		double d = -1.0;
		int exp = 0;
		double ceil = ChartUtilities.ceil(d, exp);
		assertEquals(-1.0, ceil);
	}
	
	/**
	* Test case for {@link ChartUtilities#ceil(double, int)}.
	*/
	@Test
	void testCeil_4() {
		double d = 10.0;
		int exp = 1;
		double ceil = ChartUtilities.ceil(d, exp);
		assertEquals(10.0, ceil);
	}
	
	/**
	* Test case for {@link ChartUtilities#ceil(double, int)}.
	*/
	@Test
	void testCeil_5() {
		double d = -10.0;
		int exp = 1;
		double ceil = ChartUtilities.ceil(d, exp);
		assertEquals(-10.0, ceil);
	}
	
	/**
	* Test case for {@link ChartUtilities#ceil(double, int)}.
	*/
	@Test
	void testCeil_6() {
		double d = 100.0;
		int exp = 2;
		double ceil = ChartUtilities.ceil(d, exp);
		assertEquals(100.0, ceil);
	}
	
	/**
	* Test case for {@link ChartUtilities#ceil(double, int)}.
	*/
	@Test
	void testCeil_7() {
		double d = -100.0;
		int exp = 2;
		double ceil = ChartUtilities.ceil(d, exp);
		assertEquals(-100.0, ceil);
	}
	
	/**
	* Test case for {@link ChartUtilities#ceil(double, int)}.
	*/
	@Test
	void testCeil_8() {
		double d = 0.1;
		int exp = -1;
		double ceil = ChartUtilities.ceil(d, exp);
		assertEquals(0.1, ceil);
	}
	
	/**
	* Test case for {@link ChartUtilities#ceil(double, int)}.
	*/
	@Test
	void testCeil_9() {
		double d = -0.1;
		int exp = -1;
		double ceil = ChartUtilities.ceil(d, exp);
		assertEquals(-0.1, ceil);
	}
	
	/**
	* Test case for {@link ChartUtilities#ceil(double, int)}.
	*/
	@Test
	void testCeil_10() {
		double d = 0.01;
		int exp = -2;
		double ceil = ChartUtilities.ceil(d, exp);
		assertEquals(0.01, ceil);
	}
	
}

// ChartUtilities_8Test.java
package de.progra.charting;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChartUtilities}.
* It contains ten unit test cases for the {@link ChartUtilities#performAutoScale(double, double)} method.
*/
class ChartUtilities_8Test {
		
	/**
	* Test case for {@link ChartUtilities#performAutoScale(double, double)}.
	*/
	@Test
	void testPerformAutoScale_1() {
		double min = 0.0;
		double max = 0.0;
		double[] performAutoScale = ChartUtilities.performAutoScale(min, max);
		assertEquals(0.0, performAutoScale[0]);
		assertEquals(0.0, performAutoScale[1]);
	}
	
	/**
	* Test case for {@link ChartUtilities#performAutoScale(double, double)}.
	*/
	@Test
	void testPerformAutoScale_2() {
		double min = 1.0;
		double max = 1.0;
		double[] performAutoScale = ChartUtilities.performAutoScale(min, max);
		assertEquals(1.0, performAutoScale[0]);
		assertEquals(1.0, performAutoScale[1]);
	}
	
	/**
	* Test case for {@link ChartUtilities#performAutoScale(double, double)}.
	*/
	@Test
	void testPerformAutoScale_3() {
		double min = -1.0;
		double max = -1.0;
		double[] performAutoScale = ChartUtilities.performAutoScale(min, max);
		assertEquals(-1.0, performAutoScale[0]);
		assertEquals(-1.0, performAutoScale[1]);
	}
	
	/**
	* Test case for {@link ChartUtilities#performAutoScale(double, double)}.
	*/
	@Test
	void testPerformAutoScale_4() {
		double min = 10.0;
		double max = 10.0;
		double[] performAutoScale = ChartUtilities.performAutoScale(min, max);
		assertEquals(10.0, performAutoScale[0]);
		assertEquals(10.0, performAutoScale[1]);
	}
	
	/**
	* Test case for {@link ChartUtilities#performAutoScale(double, double)}.
	*/
	@Test
	void testPerformAutoScale_5() {
		double min = -10.0;
		double max = -10.0;
		double[] performAutoScale = ChartUtilities.performAutoScale(min, max);
		assertEquals(-10.0, performAutoScale[0]);
		assertEquals(-10.0, performAutoScale[1]);
	}
	
	/**
	* Test case for {@link ChartUtilities#performAutoScale(double, double)}.
	*/
	@Test
	void testPerformAutoScale_6() {
		double min = 100.0;
		double max = 100.0;
		double[] performAutoScale = ChartUtilities.performAutoScale(min, max);
		assertEquals(100.0, performAutoScale[0]);
		assertEquals(100.0, performAutoScale[1]);
	}
	
	/**
	* Test case for {@link ChartUtilities#performAutoScale(double, double)}.
	*/
	@Test
	void testPerformAutoScale_7() {
		double min = -100.0;
		double max = -100.0;
		double[] performAutoScale = ChartUtilities.performAutoScale(min, max);
		assertEquals(-100.0, performAutoScale[0]);
		assertEquals(-100.0, performAutoScale[1]);
	}
	
	/**
	* Test case for {@link ChartUtilities#performAutoScale(double, double)}.
	*/
	@Test
	void testPerformAutoScale_8() {
		double min = 0.1;
		double max = 0.1;
		double[] performAutoScale = ChartUtilities.per