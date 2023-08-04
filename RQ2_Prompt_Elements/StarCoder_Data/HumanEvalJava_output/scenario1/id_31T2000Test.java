// IsPrimeTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPrime}.
* It contains ten unit test cases for the {@link IsPrime#isPrime(int)} method.
*/
class IsPrimeTest {

    @Test
    void testIsPrime() {
        assertTrue(IsPrime.isPrime(2));
        assertTrue(IsPrime.isPrime(3));
        assertTrue(IsPrime.isPrime(5));
        assertTrue(IsPrime.isPrime(7));
        assertTrue(IsPrime.isPrime(11));
        assertTrue(IsPrime.isPrime(13));
        assertTrue(IsPrime.isPrime(17));
        assertTrue(IsPrime.isPrime(19));
        assertTrue(IsPrime.isPrime(23));
        assertTrue(IsPrime.isPrime(29));
    }

    @Test
    void testIsPrime2() {
        assertFalse(IsPrime.isPrime(4));
        assertFalse(IsPrime.isPrime(6));
        assertFalse(IsPrime.isPrime(8));
        assertFalse(IsPrime.isPrime(12));
        assertFalse(IsPrime.isPrime(14));
        assertFalse(IsPrime.isPrime(18));
        assertFalse(IsPrime.isPrime(20));
        assertFalse(IsPrime.isPrime(24));
        assertFalse(IsPrime.isPrime(30));
    }

    @Test
    void testIsPrime3() {
        assertFalse(IsPrime.isPrime(1));
        assertFalse(IsPrime.isPrime(9));
        assertFalse(IsPrime.isPrime(21));
        assertFalse(IsPrime.isPrime(25));
        assertFalse(IsPrime.isPrime(27));
        assertFalse(IsPrime.isPrime(28));
        assertFalse(IsPrime.isPrime(31));
        assertFalse(IsPrime.isPrime(32));
        assertFalse(IsPrime.isPrime(33));
    }

    @Test
    void testIsPrime4() {
        assertFalse(IsPrime.isPrime(0));
        assertFalse(IsPrime.isPrime(10));
        assertFalse(IsPrime.isPrime(22));
        assertFalse(IsPrime.isPrime(26));
        assertFalse(IsPrime.isPrime(28));
        assertFalse(IsPrime.isPrime(34));
        assertFalse(IsPrime.isPrime(35));
        assertFalse(IsPrime.isPrime(36));
        assertFalse(IsPrime.isPrime(37));
    }

    @Test
    void testIsPrime5() {
        assertFalse(IsPrime.isPrime(-1));
        assertFalse(IsPrime.isPrime(15));
        assertFalse(IsPrime.isPrime(29));
        assertFalse(IsPrime.isPrime(38));
        assertFalse(IsPrime.isPrime(39));
        assertFalse(IsPrime.isPrime(40));
        assertFalse(IsPrime.isPrime(41));
        assertFalse(IsPrime.isPrime(42));
        assertFalse(IsPrime.isPrime(43));
    }

    @Test
    void testIsPrime6() {
        assertFalse(IsPrime.isPrime(-2));
        assertFalse(IsPrime.isPrime(16));
        assertFalse(IsPrime.isPrime(30));
        assertFalse(IsPrime.isPrime(44));
        assertFalse(IsPrime.isPrime(45));
        assertFalse(IsPrime.isPrime(46));
        assertFalse(IsPrime.isPrime(47));
        assertFalse(IsPrime.isPrime(48));
        assertFalse(IsPrime.isPrime(49));
    }

    @Test
    void testIsPrime7() {
        assertFalse(IsPrime.isPrime(-3));
        assertFalse(IsPrime.isPrime(17));
        assertFalse(IsPrime.isPrime(31));
        assertFalse(IsPrime.isPrime(45));
        assertFalse(IsPrime.isPrime(46));
        assertFalse(IsPrime.isPrime(47));
        assertFalse(IsPrime.isPrime(48));
        assertFalse(IsPrime.isPrime(49));
        assertFalse(IsPrime.isPrime(50));
    }

    @Test
    void testIsPrime8() {
        assertFalse(IsPrime.isPrime(-4));
        assertFalse(IsPrime.isPrime(18));
        assertFalse(IsPrime.isPrime(32));
        assertFalse(IsPrime.isPrime(46));
        assertFalse(IsPrime.isPrime(47));
        assertFalse(IsPrime.isPrime(48));
        assertFalse(IsPrime.isPrime(49));
        assertFalse(IsPrime.isPrime(50));
        assertFalse(IsPrime.isPrime(51));
    }

    @Test
    void testIsPrime9() {
        assertFalse(IsPrime.isPrime(-5));
        assertFalse(IsPrime.isPrime(19));
        assertFalse(IsPrime.isPrime(33));
        assertFalse(IsPrime.isPrime(47));
        assertFalse(IsPrime.isPrime(48));
        assertFalse(IsPrime.isPrime(49));
        assertFalse(IsPrime.isPrime(50));
        assertFalse(IsPrime.isPrime(51));
        assertFalse(IsPrime.isPrime(52));
    }

    @Test
    void testIsPrime10() {
        assertFalse(IsPrime.isPrime(-6));
        assertFalse(IsPrime.isPrime(20));
        assertFalse(IsPrime.isPrime(34));
        assertFalse(IsPrime.isPrime(48));
        assertFalse(IsPrime.isPrime(49));
        assertFalse(IsPrime.isPrime(50));
        assertFalse(IsPrime.isPrime(51));
        assertFalse(IsPrime.isPrime(52));
        assertFalse(IsPrime.isPrime(53));
    }
}
