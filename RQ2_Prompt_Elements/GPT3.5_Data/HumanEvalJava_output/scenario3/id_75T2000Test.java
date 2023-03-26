// IsMultiplyPrime.java
package scenario3;

import java.util.ArrayList;

class IsMultiplyPrime {

    /**
     * Write a function that returns true if the given number is the multiplication of 3 prime numbers
     * and false otherwise.
     * Knowing that (a) is less than 100.
     * Example:
     * isMultiplyPrime(30) == true
     * 30 = 2 * 3 * 5
     *
     * > isMultiplyPrime(5)
     * false
     * > isMultiplyPrime(30)
     * true
     * > isMultiplyPrime(8)
     * true
     * > isMultiplyPrime(10)
     * false
     * > isMultiplyPrime(125)
     * true
     * > isMultiplyPrime(105)
     * true
     * > isMultiplyPrime(126)
     * false
     * > isMultiplyPrime(729)
     * false
     * > isMultiplyPrime(891)
     * false
     * > isMultiplyPrime(1001)
     * true
     */
    public static Boolean isMultiplyPrime(int a) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
        primes.add(13);
        primes.add(17);
        primes.add(19);
        primes.add(23);
        primes.add(29);
        primes.add(31);
        primes.add(37);
        primes.add(41);
        primes.add(43);
        primes.add(47);
        primes.add(53);
        primes.add(59);
        primes.add(61);
        primes.add(67);
        primes.add(71);
        primes.add(73);
        primes.add(79);
        primes.add(83);
        primes.add(89);
        primes.add(97);

        int count = 0;
        for (int i = 0; i < primes.size(); i++) {
            if (a % primes.get(i) == 0) {
                count++;
                if (count == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}

// IsMultiplyPrimeTest.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsMultiplyPrime}.
* It contains ten unit test cases for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
*/
class IsMultiplyPrimeTest {
    @Test
    void testIsMultiplyPrime1() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(5));
    }

    @Test
    void testIsMultiplyPrime2() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(30));
    }

    @Test
    void testIsMultiplyPrime3() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(8));
    }

    @Test
    void testIsMultiplyPrime4() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(10));
    }

    @Test
    void testIsMultiplyPrime5() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(125));
    }

    @Test
    void testIsMultiplyPrime6() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(105));
    }

    @Test
    void testIsMultiplyPrime7() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(126));
    }

    @Test
    void testIsMultiplyPrime8() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(729));
    }

    @Test
    void testIsMultiplyPrime9() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(891));
    }

    @Test
    void testIsMultiplyPrime10() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(1001));
    }
}