// DerivativeTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Derivative}.
* It contains ten unit test cases for the {@link Derivative#derivative(List)} method.
*/
class DerivativeTest {

	/**
	 * Test case for {@link Derivative#derivative(List)} method.
	 * It tests the case when the input list is empty.
	 */
	@Test
	void testDerivative_EmptyList() {
		List<Integer> input = new ArrayList<Integer>();
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = Derivative.derivative(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Derivative#derivative(List)} method.
	 * It tests the case when the input list contains only one element.
	 */
	@Test
	void testDerivative_OneElement() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = Derivative.derivative(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Derivative#derivative(List)} method.
	 * It tests the case when the input list contains two elements.
	 */
	@Test
	void testDerivative_TwoElements() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(3);
		input.add(2);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		List<Object> actual = Derivative.derivative(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Derivative#derivative(List)} method.
	 * It tests the case when the input list contains three elements.
	 */
	@Test
	void testDerivative_ThreeElements() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(3);
		input.add(2);
		input.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(2);
		List<Object> actual = Derivative.derivative(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Derivative#derivative(List)} method.
	 * It tests the case when the input list contains four elements.
	 */
	@Test
	void testDerivative_FourElements() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(3);
		input.add(2);
		input.add(1);
		input.add(0);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(2);
		expected.add(0);
		List<Object> actual = Derivative.derivative(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Derivative#derivative(List)} method.
	 * It tests the case when the input list contains five elements.
	 */
	@Test
	void testDerivative_FiveElements() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(3);
		input.add(2);
		input.add(1);
		input.add(0);
		input.add(4);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(2);
		expected.add(0);
		expected.add(16);
		List<Object> actual = Derivative.derivative(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Derivative#derivative(List)} method.
	 * It tests the case when the input list contains five elements.
	 */
	@Test
	void testDerivative_FiveElements2() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(3);
		input.add(1);
		input.add(2);
		input.add(4);
		input.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(4);
		expected.add(12);
		expected.add(20);
		List<Object> actual = Derivative.derivative(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Derivative#derivative(List)} method.
	 * It tests the case when the input list contains five elements.
	 */
	@Test
	void testDerivative_FiveElements3() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(6);
		List<Object> actual = Derivative.derivative(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Derivative#derivative(List)} method.
	 * It tests the case when the input list contains five elements.
	 */
	@Test
	void testDerivative_FiveElements4() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(3);
		input.add(2);
		input.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(2);
		List<Object> actual = Derivative.derivative(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Derivative#derivative(List)} method.
	 * It tests the case when the input list contains five elements.
	 */
	@Test
	void testDerivative_FiveElements5() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(3);
		input.add(2);
		input.add(1);
		input.add(0);
		input.add(4);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(2);
		expected.add(0);
		expected.add(16);
		List<Object> actual = Derivative.derivative(input);
		assertEquals(expected, actual);
	}
}