from fix_tests_openai import heuristic_6


SMALL_FLOATING_POINT=""""
// TruncateNumberTest.java
package scenario2;

import java.util.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static scenario2.TruncateNumber.*;

/**
 * Test class of {@link TruncateNumber}.
 * It contains one unit test case for the {@link TruncateNumber#truncateNumber(Double)} method.
 */
class TruncateNumber_truncateNumber_2000_3_Test {

    @Test
    public void test() {
        assertNotEquals(2147483648d, TruncateNumber.truncateNumber(2147483648d));
        assertEquals(Double.MAX_VALUE, TruncateNumber.truncateNumber(Double.MAX_VALUE));
        assertEquals(1.699998e+308, TruncateNumber.truncateNumber(1e308d), 1.0e-6);
        assertEquals(1.6, TruncateNumber.truncateNumber(1.), 1.0e-6);
        assertEquals(1.699998000000005000000000000d, TruncateNumber.truncateNumber(1e-600d), 1.0e-6);
    }
}
"""

INTEGER_TOO_LARGE="""
// LargestPrimeFactorTest.java
package scenario1;

import java.util.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static scenario1.LargestPrimeFactor.*;

/**
 * Test class of {@link LargestPrimeFactor}.
 * It contains ten unit test cases for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
 */
class LargestPrimeFactor_largestPrimeFactor_4000_Test {

    @Test
    void testLargestPrimeFactor() {
        assertEquals(29, LargestPrimeFactor.largestPrimeFactor(13195));
        assertEquals(6857, LargestPrimeFactor.largestPrimeFactor(600851475143));
        assertEquals(5, LargestPrimeFactor.largestPrimeFactor(5));
        assertEquals(2, LargestPrimeFactor.largestPrimeFactor(800851475142L));
        assertEquals(13, LargestPrimeFactor.largestPrimeFactor(26));
        assertEquals(13, LargestPrimeFactor.largestPrimeFactor(63f));
        assertEquals(13, LargestPrimeFactor.largestPrimeFactor(59d));
        assertEquals(13, LargestPrimeFactor.largestPrimeFactor(59.1));
        assertEquals(13, LargestPrimeFactor.largestPrimeFactor(-2147483647));
        
    }
}
"""


def test_integer_too_large():
    new_code, applied_heuristic = heuristic_6(INTEGER_TOO_LARGE)
    assert applied_heuristic
    assert 'Integer.parseInt("600851475143")' in new_code
    assert 'Long.parseLong("800851475142")' in new_code
    assert 'largestPrimeFactor(5)' in new_code
    assert 'largestPrimeFactor(-2147483647)' in new_code

def test_floating_point_code():
    new_code, applied_heuristic = heuristic_6(SMALL_FLOATING_POINT)
    assert applied_heuristic == False
    assert 'TruncateNumber.truncateNumber(2147483648d)' in new_code




