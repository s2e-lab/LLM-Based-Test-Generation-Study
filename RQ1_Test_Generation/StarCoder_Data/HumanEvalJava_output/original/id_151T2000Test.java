// DoubleTheDifferenceTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DoubleTheDifference}.
* It contains ten unit test cases for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
*/
class DoubleTheDifferenceTest {

    /**
    * Test case for {@link DoubleTheDifference#doubleTheDifference(List)}.
    */
    @Test
    void testDoubleTheDifference() {
        List<Object> lst1 = List.of(1, 3, 2, 0);
        assertEquals(10, DoubleTheDifference.doubleTheDifference(lst1));

        List<Object> lst2 = List.of(-1, -2, 0);
        assertEquals(0, DoubleTheDifference.doubleTheDifference(lst2));

        List<Object> lst3 = List.of(9, -2);
        assertEquals(81, DoubleTheDifference.doubleTheDifference(lst3));

        List<Object> lst4 = List.of(0);
        assertEquals(0, DoubleTheDifference.doubleTheDifference(lst4));

        List<Object> lst5 = List.of();
        assertEquals(0, DoubleTheDifference.doubleTheDifference(lst5));

        List<Object> lst6 = List.of(5, 4);
        assertEquals(25, DoubleTheDifference.doubleTheDifference(lst6));

        List<Object> lst7 = List.of(0.1, 0.2, 0.3);
        assertEquals(0, DoubleTheDifference.doubleTheDifference(lst7));

        List<Object> lst8 = List.of(-10, -20, -30);
        assertEquals(0, DoubleTheDifference.doubleTheDifference(lst8));

        List<Object> lst9 = List.of(-1, -2, 8);
        assertEquals(0, DoubleTheDifference.doubleTheDifference(lst9));

        List<Object> lst10 = List.of(0.2, 3, 5);
        assertEquals(34, DoubleTheDifference.doubleTheDifference(lst10));

        List<Object> lst11 = List.of(-99, -97, -95, -93, -91, -89, -87, -85, -83, -81, -79, -77, -75, -73, -71, -69, -67, -65, -63, -61, -59, -57, -55, -53, -51, -49, -47, -45, -43, -41, -39, -37, -35, -33, -31, -29, -27, -25, -23, -21, -19, -17, -15, -13, -11, -9, -7, -5, -3, -1, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99);
        assertEquals(166650, DoubleTheDifference.doubleTheDifference(lst11));
    }
}
