import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class RollingMaxTest {

	@Test
	void testRollingMax() {
		List<Object> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		List<Object> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		assertEquals(expected, RollingMax.rollingMax(numbers));
		
		numbers = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
		expected = new ArrayList<>(Arrays.asList(5, 5, 5, 5, 5));
		assertEquals(expected, RollingMax.rollingMax(numbers));
		
		numbers = new ArrayList<>(Arrays.asList(1, 3, 2, 5, 4));
		expected = new ArrayList<>(Arrays.asList(1, 3, 3, 5, 5));
		assertEquals(expected, RollingMax.rollingMax(numbers));
		
		numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
		expected = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
		assertEquals(expected, RollingMax.rollingMax(numbers));
		
		numbers = new ArrayList<>(Arrays.asList(1));
		expected = new ArrayList<>(Arrays.asList(1));
		assertEquals(expected, RollingMax.rollingMax(numbers));
		
		numbers = new ArrayList<>();
		expected = new ArrayList<>();
		assertEquals(expected, RollingMax.rollingMax(numbers));
		
		numbers = new ArrayList<>(Arrays.asList(1, 2, "3", 4, 5));
		assertThrows(IllegalArgumentException.class, () -> RollingMax.rollingMax(numbers));
		
		numbers = new ArrayList<>(Arrays.asList(null, 2, 3, 4, 5));
		assertThrows(NullPointerException.class, () -> RollingMax.rollingMax(numbers));
		
		numbers = null;
		assertThrows(NullPointerException.class, () -> RollingMax.rollingMax(numbers));
	}

}