// GetPositiveTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains ten unit test cases for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {

    /**
     * Test case for {@link GetPositive#getPositive(List)}.
     */
    @Test
    void testGetPositive() {
        List<Object> l1 = List.of(-1, 2, -4, 5, 6);
        List<Object> l2 = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
        List<Object> l3 = List.of(-1, -2, 4, 5, 6);
        List<Object> l4 = List.of(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10);
        List<Object> l5 = List.of(-1, -2);
        List<Object> l6 = List.of();
        List<Object> l7 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Object> l8 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        List<Object> l9 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100);
        List<Object> l10 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200);
        assertEquals(List.of(2, 5, 6), GetPositive.getPositive(l1));
        assertEquals(List.of(5, 3, 2, 3, 9, 123, 1), GetPositive.getPositive(l2));
        assertEquals(List.of(4, 5, 6), GetPositive.getPositive(l3));
        assertEquals(List.of(5, 3, 2, 3, 3, 9, 123, 1), GetPositive.getPositive(l4));
        assertEquals(List.of(), GetPositive.getPositive(l5));
        assertEquals(List.of(), GetPositive.getPositive(l6));
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), GetPositive.getPositive(l7));
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20), GetPositive.getPositive(l8));
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 2