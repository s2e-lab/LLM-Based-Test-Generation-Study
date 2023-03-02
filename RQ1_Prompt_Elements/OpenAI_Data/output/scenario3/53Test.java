// AddTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add}.
* It contains ten unit test cases for the {@link Add#add(int, int)} method.
*/
class AddTest {
@Test
	void testAdd() {
		assertEquals(1, Add.add(0, 1));
		assertEquals(1, Add.add(1, 0));
		assertEquals(5, Add.add(2, 3));
		assertEquals(12, Add.add(5, 7));
		assertEquals(12, Add.add(7, 5));
		assertEquals(1297, Add.add(572, 725));
		assertEquals(855, Add.add(51, 804));
		assertEquals(741, Add.add(645, 96));
		assertEquals(1565, Add.add(712, 853));
		assertEquals(324, Add.add(223, 101));
	}
}