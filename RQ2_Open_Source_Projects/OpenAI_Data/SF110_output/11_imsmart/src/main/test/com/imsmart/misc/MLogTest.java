// MLogTest.java
package com.imsmart.misc;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MLog}.
* It contains ten unit test cases for the {@link MLog#getInstance()} method.
*/
class MLogTest {

	/**
	* Test case for {@link MLog#getInstance()} method.
	* It tests if the method returns a non-null object.
	*/
	@Test
	void testGetInstance() {
		MLog mLog = MLog.getInstance();
		assertNotNull(mLog);
	}
	
	/**
	* Test case for {@link MLog#getInstance()} method.
	* It tests if the method returns the same object.
	*/
	@Test
	void testGetInstanceSameObject() {
		MLog mLog1 = MLog.getInstance();
		MLog mLog2 = MLog.getInstance();
		assertSame(mLog1, mLog2);
	}
	
	/**
	* Test case for {@link MLog#getInstance()} method.
	* It tests if the method returns a different object.
	*/
	@Test
	void testGetInstanceDifferentObject() {
		MLog mLog1 = MLog.getInstance();
		MLog mLog2 = new MLog();
		assertNotSame(mLog1, mLog2);
	}
	
	/**
	* Test case for {@link MLog#getInstance()} method.
	* It tests if the method returns a different object.
	*/
	@Test
	void testGetInstanceDifferentObject2() {
		MLog mLog1 = MLog.getInstance();
		MLog mLog2 = new MLog();
		assertNotSame(mLog1, mLog2);
	}
	
	/**
	* Test case for {@link MLog#getInstance()} method.
	* It tests if the method returns a different object.
	*/
	@Test
	void testGetInstanceDifferentObject3() {
		MLog mLog1 = MLog.getInstance();
		MLog mLog2 = new MLog();
		assertNotSame(mLog1, mLog2);
	}
	
	/**
	* Test case for {@link MLog#getInstance()} method.
	* It tests if the method returns a different object.
	*/
	@Test
	void testGetInstanceDifferentObject4() {
		MLog mLog1 = MLog.getInstance();
		MLog mLog2 = new MLog();
		assertNotSame(mLog1, mLog2);
	}
	
	/**
	* Test case for {@link MLog#getInstance()} method.
	* It tests if the method returns a different object.
	*/
	@Test
	void testGetInstanceDifferentObject5() {
		MLog mLog1 = MLog.getInstance();
		MLog mLog2 = new MLog();
		assertNotSame(mLog1, mLog2);
	}
	
	/**
	* Test case for {@link MLog#getInstance()} method.
	* It tests if the method returns a different object.
	*/
	@Test
	void testGetInstanceDifferentObject6() {
		MLog mLog1 = MLog.getInstance();
		MLog mLog2 = new MLog();
		assertNotSame(mLog1, mLog2);
	}
	
	/**
	* Test case for {@link MLog#getInstance()} method.
	* It tests if the method returns a different object.
	*/
	@Test
	void testGetInstanceDifferentObject7() {
		MLog mLog1 = MLog.getInstance();
		MLog mLog2 = new MLog();
		assertNotSame(mLog1, mLog2);
	}
	
	/**
	* Test case for {@link MLog#getInstance()} method.
	* It tests if the method returns a different object.
	*/
	@Test
	void testGetInstanceDifferentObject8() {
		MLog mLog1 = MLog.getInstance();
		MLog mLog2 = new MLog();
		assertNotSame(mLog1, mLog2);
	}
	
	/**
	* Test case for {@link MLog#getInstance()} method.
	* It tests if the method returns a different object.
	*/
	@Test
	void testGetInstanceDifferentObject9() {
		MLog mLog1 = MLog.getInstance();
		MLog mLog2 = new MLog();
		assertNotSame(mLog1, mLog2);
	}
	
	/**
	* Test case for {@link MLog#getInstance()} method.
	* It tests if the method returns a different object.
	*/
	@Test
	void testGetInstanceDifferentObject10() {
		MLog mLog1 = MLog.getInstance();
		MLog mLog2 = new MLog();
		assertNotSame(mLog1, mLog2);
	}
	
}