// MultiCostTest.java
package lotus.core.cost;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MultiCost}.
* It contains ten unit test cases for the {@link MultiCost#isPayable()} method.
*/
class MultiCostTest {

	/**
	* Test case 1 for {@link MultiCost#isPayable()}.
	* This test case tests the method with a list of costs that are all payable.
	*/
	@Test
	void testIsPayable1() {
		MultiCost multiCost = new MultiCost();
		multiCost.addCost(new ManaCost(1, 0, 0, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 1, 0, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 1, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 1, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 0, 1, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 0, 0, 1));
		assertTrue(multiCost.isPayable());
	}
	
	/**
	* Test case 2 for {@link MultiCost#isPayable()}.
	* This test case tests the method with a list of costs that are all payable.
	*/
	@Test
	void testIsPayable2() {
		MultiCost multiCost = new MultiCost();
		multiCost.addCost(new ManaCost(1, 0, 0, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 1, 0, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 1, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 1, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 0, 1, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 0, 0, 1));
		multiCost.addCost(new ManaCost(1, 1, 1, 1, 1, 1));
		assertTrue(multiCost.isPayable());
	}
	
	/**
	* Test case 3 for {@link MultiCost#isPayable()}.
	* This test case tests the method with a list of costs that are all payable.
	*/
	@Test
	void testIsPayable3() {
		MultiCost multiCost = new MultiCost();
		multiCost.addCost(new ManaCost(1, 0, 0, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 1, 0, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 1, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 1, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 0, 1, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 0, 0, 1));
		multiCost.addCost(new ManaCost(1, 1, 1, 1, 1, 1));
		multiCost.addCost(new ManaCost(1, 1, 1, 1, 1, 1));
		assertTrue(multiCost.isPayable());
	}
	
	/**
	* Test case 4 for {@link MultiCost#isPayable()}.
	* This test case tests the method with a list of costs that are all payable.
	*/
	@Test
	void testIsPayable4() {
		MultiCost multiCost = new MultiCost();
		multiCost.addCost(new ManaCost(1, 0, 0, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 1, 0, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 1, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 1, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 0, 1, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 0, 0, 1));
		multiCost.addCost(new ManaCost(1, 1, 1, 1, 1, 1));
		multiCost.addCost(new ManaCost(1, 1, 1, 1, 1, 1));
		multiCost.addCost(new ManaCost(1, 1, 1, 1, 1, 1));
		assertTrue(multiCost.isPayable());
	}
	
	/**
	* Test case 5 for {@link MultiCost#isPayable()}.
	* This test case tests the method with a list of costs that are all payable.
	*/
	@Test
	void testIsPayable5() {
		MultiCost multiCost = new MultiCost();
		multiCost.addCost(new ManaCost(1, 0, 0, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 1, 0, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 1, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 1, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 0, 1, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 0, 0, 1));
		multiCost.addCost(new ManaCost(1, 1, 1, 1, 1, 1));
		multiCost.addCost(new ManaCost(1, 1, 1, 1, 1, 1));
		multiCost.addCost(new ManaCost(1, 1, 1, 1, 1, 1));
		multiCost.addCost(new ManaCost(1, 1, 1, 1, 1, 1));
		assertTrue(multiCost.isPayable());
	}
	
	/**
	* Test case 6 for {@link MultiCost#isPayable()}.
	* This test case tests the method with a list of costs that are all payable.
	*/
	@Test
	void testIsPayable6() {
		MultiCost multiCost = new MultiCost();
		multiCost.addCost(new ManaCost(1, 0, 0, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 1, 0, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 1, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 1, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 0, 1, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 0, 0, 1));
		multiCost.addCost(new ManaCost(1, 1, 1, 1, 1, 1));
		multiCost.addCost(new ManaCost(1, 1, 1, 1, 1, 1));
		multiCost.addCost(new ManaCost(1, 1, 1, 1, 1, 1));
		multiCost.addCost(new ManaCost(1, 1, 1, 1, 1, 1));
		multiCost.addCost(new ManaCost(1, 1, 1, 1, 1, 1));
		assertTrue(multiCost.isPayable());
	}
	
	/**
	* Test case 7 for {@link MultiCost#isPayable()}.
	* This test case tests the method with a list of costs that are all payable.
	*/
	@Test
	void testIsPayable7() {
		MultiCost multiCost = new MultiCost();
		multiCost.addCost(new ManaCost(1, 0, 0, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 1, 0, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 1, 0, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 1, 0, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 0, 1, 0));
		multiCost.addCost(new ManaCost(0, 0, 0, 0, 0, 1));
		multiCost.addCost(new ManaCost(1, 1, 1, 1, 1, 1));
		multiCost.add