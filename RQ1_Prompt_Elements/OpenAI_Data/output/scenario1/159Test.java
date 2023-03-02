// EatTest.java
package scenario1;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Eat}.
* It contains ten unit test cases for the {@link Eat#eat(int, int, int)} method.
*/
class EatTest {
@Test
	void testEat() {
		List<Integer> result = Eat.eat(0, 0, 0);
		assertEquals(Arrays.asList(0, 0), result);
		
		result = Eat.eat(0, 1, 0);
		assertEquals(Arrays.asList(0, 0), result);
		
		result = Eat.eat(0, 0, 1);
		assertEquals(Arrays.asList(0, 1), result);
		
		result = Eat.eat(0, 1, 1);
		assertEquals(Arrays.asList(1, 0), result);
		
		result = Eat.eat(0, 2, 1);
		assertEquals(Arrays.asList(1, 0), result);
		
		result = Eat.eat(0, 1, 2);
		assertEquals(Arrays.asList(1, 1), result);
		
		result = Eat.eat(0, 2, 2);
		assertEquals(Arrays.asList(2, 0), result);
		
		result = Eat.eat(0, 3, 2);
		assertEquals(Arrays.asList(2, 0), result);
		
		result = Eat.eat(0, 2, 3);
		assertEquals(Arrays.asList(2, 1), result);
		
		result = Eat.eat(0, 3, 3);
		assertEquals(Arrays.asList(3, 0), result);
	}
}