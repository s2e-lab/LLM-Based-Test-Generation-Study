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

	@Test
	void testDerivative() {
		List<Integer> xs = new ArrayList<>();
		xs.add(3);
		xs.add(1);
		xs.add(2);
		xs.add(4);
		xs.add(5);
		List<Object> expected = new ArrayList<>();
		expected.add(1);
		expected.add(4);
		expected.add(12);
		expected.add(20);
		assertEquals(expected, Derivative.derivative(xs));
		
		xs = new ArrayList<>();
		xs.add(1);
		xs.add(2);
		xs.add(3);
		expected = new ArrayList<>();
		expected.add(2);
		expected.add(6);
		assertEquals(expected, Derivative.derivative(xs));
		
		xs = new ArrayList<>();
		xs.add(3);
		xs.add(2);
		xs.add(1);
		expected = new ArrayList<>();
		expected.add(2);
		expected.add(2);
		assertEquals(expected, Derivative.derivative(xs));
		
		xs = new ArrayList<>();
		xs.add(3);
		xs.add(2);
		xs.add(1);
		xs.add(0);
		xs.add(4);
		expected = new ArrayList<>();
		expected.add(2);
		expected.add(2);
		expected.add(0);
		expected.add(16);
		assertEquals(expected, Derivative.derivative(xs));
		
		xs = new ArrayList<>();
		xs.add(1);
		expected = new ArrayList<>();
		assertEquals(expected, Derivative.derivative(xs));
	}
}