// GetOddCollatzTest.java
package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetOddCollatz}.
* It contains ten unit test cases for the {@link GetOddCollatz#getOddCollatz(int)} method.
*/
class GetOddCollatzTest {
    
    @Test
    void testGetOddCollatzWithOne() {
        List<Integer> expected = Arrays.asList(1);
        List<Integer> actual = GetOddCollatz.getOddCollatz(1);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetOddCollatzWithFive() {
        List<Integer> expected = Arrays.asList(1, 5);
        List<Integer> actual = GetOddCollatz.getOddCollatz(5);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetOddCollatzWithTwelve() {
        List<Integer> expected = Arrays.asList(1, 3, 5);
        List<Integer> actual = GetOddCollatz.getOddCollatz(12);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetOddCollatzWithFourteen() {
        List<Integer> expected = Arrays.asList(1, 5, 7, 11, 13, 17);
        List<Integer> actual = GetOddCollatz.getOddCollatz(14);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetOddCollatzWithNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            GetOddCollatz.getOddCollatz(-5);
        });
    }
    
    @Test
    void testGetOddCollatzWithZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            GetOddCollatz.getOddCollatz(0);
        });
    }
    
    @Test
    void testGetOddCollatzWithLargeNumber() {
        List<Integer> expected = Arrays.asList(1, 5, 7, 11, 13, 16, 21, 26, 31, 36, 41, 47, 53, 60, 67, 74, 82, 90, 98, 107, 116, 125, 135, 145, 155, 166, 177, 189, 201, 213, 226, 239, 253, 267, 281, 296, 311, 326, 342, 358, 375, 392, 409, 427, 445, 464, 483, 502, 522, 542, 563, 584, 606, 628, 651, 674, 698, 722, 747, 772, 798, 824, 851, 878, 906, 934, 963, 992, 1021, 1051, 1081, 1112, 1143, 1175, 1207, 1240, 1273, 1307, 1341, 1376, 1411, 1447, 1483, 1520, 1557, 1595, 1633, 1672, 1711, 1751, 1791, 1832, 1873, 1915, 1957, 2000, 2043, 2087, 2131, 2176, 2221, 2267, 2313, 2360, 2407, 2455, 2503, 2552, 2601, 2651, 2701, 2752, 2803, 2855, 2907, 2960, 3013, 3067, 3121, 3176, 3231, 3287, 3343, 3400, 3457, 3515, 3573, 3632, 3691, 3751, 3811, 3872, 3933, 3995, 4057, 4120, 4183, 4247, 4311, 4376, 4441, 4507, 4573, 4640, 4707, 4775, 4843, 4912, 4981, 5051, 5121, 5192, 5263, 5335, 5407, 5480, 5553, 5627, 5701, 5776, 5851, 5926, 6002, 6078, 6155, 6232, 6310, 6388, 6467, 6546, 6626, 6706, 6787, 6868, 6950, 7032, 7115, 7198, 7282, 7366, 7451, 7536, 7622, 7708, 7795, 7882, 7970, 8058, 8147, 8236, 8326, 8416, 8507, 8598, 8690, 8782, 8875, 8968, 9062, 9156, 9251, 9346, 9442, 9538, 9635, 9732, 9830, 9928, 10027, 10126, 10226, 10326, 10427, 10528, 10630, 10732, 10835, 10938, 11042, 11146, 11251, 11356, 11462, 11568, 11675, 11782, 11890, 11998, 12107, 12216, 12326, 12436, 12547, 12658, 12770, 12882, 12995, 13108, 13222, 13336, 13451, 13566, 13682, 13798, 13915, 14032, 14150, 14268, 14387, 14506, 14626, 14746, 14867, 14988, 15110, 15232, 15355, 15478, 15602, 15726, 15851, 15976, 16102, 16228, 16355, 16482, 16610, 16738, 16867, 16996, 17126, 17256, 17387, 17518, 17650, 17782, 17915, 18048, 18182, 18316, 18451, 18586, 18722, 18858, 18995, 19132, 19270, 19408, 19547, 19686, 19826, 19966, 20107, 20248, 20390, 20532, 20675, 20818, 20962, 21106, 21251, 21396, 21542, 21688, 21835, 21982, 22130, 22278, 22427, 22576, 22726, 22876, 23027, 23178, 23330, 23482, 23635, 23788, 23942, 24096, 24251, 24406, 24562, 24718, 24875, 25032, 25190, 25348, 25507, 25666, 25826, 25986, 26147, 26308, 26470, 26632, 26795, 26958, 27122, 27286, 27451, 27616, 27782, 27948, 28115, 28282, 28450, 28618, 28787, 28956, 29126, 29296, 29467, 29638, 29810, 29982, 30155, 30328, 30502, 30676, 30851, 31026, 31202, 31378, 31555, 31732, 31910, 32088, 32267, 32446, 32626, 32806, 32987, 33168, 33350, 33532, 33715, 33898, 34082, 34266, 34451, 34636, 34822, 35008, 35195, 35382, 35570, 35758, 35947, 36136, 36326, 36516, 36707, 36898, 37090, 37282, 37475, 37668, 37862, 38056, 38251, 38446, 38642, 38838, 39035, 39232, 39430, 39628, 39827