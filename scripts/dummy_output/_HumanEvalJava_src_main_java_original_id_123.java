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
    void testGetOddCollatz() {
        List<Integer> expected = Arrays.asList(1, 5);
        List<Integer> actual = GetOddCollatz.getOddCollatz(5);
        assertEquals(expected, actual);
        
        expected = Arrays.asList(1, 3, 5);
        actual = GetOddCollatz.getOddCollatz(12);
        assertEquals(expected, actual);
        
        expected = Arrays.asList(1);
        actual = GetOddCollatz.getOddCollatz(1);
        assertEquals(expected, actual);
        
        expected = Arrays.asList(1, 5, 7, 11, 13, 17);
        actual = GetOddCollatz.getOddCollatz(14);
        assertEquals(expected, actual);
        
        expected = Arrays.asList(1, 3, 5, 7, 9, 11, 15, 19, 23, 27, 31, 41, 47, 55, 71, 77, 83, 95, 107, 119, 123, 143, 159, 191, 207, 239, 255, 279, 311, 335, 371, 407, 431, 447, 479, 575, 599, 671, 703, 767, 799, 959, 991, 1023, 1087, 1151, 1279, 1343, 1823, 1951, 2015, 2559, 2687, 2735, 3135, 3263, 3455, 3647, 4031, 4095, 4369, 5119, 5461, 5567, 8191, 8199, 9103, 9331, 11263, 12287, 13055, 13107, 17407, 21845, 21847, 26207, 29791, 32767, 32769, 43691, 52487, 65535);
        actual = GetOddCollatz.getOddCollatz(65535);
        assertEquals(expected, actual);
        
        expected = Arrays.asList(1, 3, 5, 7, 9, 11, 15, 19, 23, 27, 31, 41, 47, 55, 71, 77, 83, 95, 107, 119, 123, 143, 159, 191, 207, 239, 255, 279, 311, 335, 371, 407, 431, 447, 479, 575, 599, 671, 703, 767, 799, 959, 991, 1023, 1087, 1151, 1279, 1343, 1823, 1951, 2015, 2559, 2687, 2735, 3135, 3263, 3455, 3647, 4031, 4095, 4369, 5119, 5461, 5567, 8191, 8199, 9103, 9331, 11263, 12287, 13055, 13107, 17407, 21845, 21847, 26207, 29791, 32767, 32769, 43691, 52487, 65535);
        actual = GetOddCollatz.getOddCollatz(65535);
        assertEquals(expected, actual);
        
        expected = Arrays.asList(1, 3, 5, 7, 9, 11, 15, 19, 23, 27, 31, 41, 47, 55, 71, 77, 83, 95, 107, 119, 123, 143, 159, 191, 207, 239, 255, 279, 311, 335, 371, 407, 431, 447, 479, 575, 599, 671, 703, 767, 799, 959, 991, 1023, 1087, 1151, 1279, 1343, 1823, 1951, 2015, 2559, 2687, 2735, 3135, 3263, 3455, 3647, 4031, 4095, 4369, 5119, 5461, 5567, 8191, 8199, 9103, 9331, 11263, 12287, 13055, 13107, 17407, 21845, 21847, 26207, 29791, 32767, 32769, 43691, 52487, 65535);
        actual = GetOddCollatz.getOddCollatz(65535);
        assertEquals(expected, actual);
        
        expected = Arrays.asList(1, 3, 5, 7, 9, 11, 15, 19, 23, 27, 31, 41, 47, 55, 71, 77, 83, 95, 107, 119, 123, 143, 159, 191, 207, 239, 255, 279, 311, 335, 371, 407, 431, 447, 479, 575, 599, 671, 703, 767, 799, 959, 991, 1023, 1087, 1151, 1279, 1343, 1823, 1951, 2015, 2559, 2687, 2735, 3135, 3263, 3455, 3647, 4031, 4095, 4369, 5119, 5461, 5567, 8191, 8199, 9103, 9331, 11263, 12287, 13055, 13107, 17407, 21845, 21847, 26207, 29791, 32767, 32769, 43691, 52487, 65535);
        actual = GetOddCollatz.getOddCollatz(65535);
        assertEquals(expected, actual);
        
        expected = Arrays.asList(1, 3, 5, 7, 9, 11, 15, 19, 23, 27, 31, 41, 47