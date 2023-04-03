// IsPrimeTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPrime}.
* It contains ten unit test cases for the {@link IsPrime#isPrime(int)} method.
*/
class IsPrimeTest {
    
    @Test
    void testIsPrimeWithNegativeNumber() {
        assertFalse(IsPrime.isPrime(-5));
    }
    
    @Test
    void testIsPrimeWithZero() {
        assertFalse(IsPrime.isPrime(0));
    }
    
    @Test
    void testIsPrimeWithOne() {
        assertFalse(IsPrime.isPrime(1));
    }
    
    @Test
    void testIsPrimeWithTwo() {
        assertTrue(IsPrime.isPrime(2));
    }
    
    @Test
    void testIsPrimeWithEvenNumber() {
        assertFalse(IsPrime.isPrime(4));
    }
    
    @Test
    void testIsPrimeWithOddNumber() {
        assertTrue(IsPrime.isPrime(7));
    }
    
    @Test
    void testIsPrimeWithLargePrimeNumber() {
        assertTrue(IsPrime.isPrime(999983));
    }
    
    @Test
    void testIsPrimeWithLargeNonPrimeNumber() {
        assertFalse(IsPrime.isPrime(999981));
    }
    
    @Test
    void testIsPrimeWithMaxValue() {
        assertFalse(IsPrime.isPrime(Integer.MAX_VALUE));
    }
    
    @Test
    void testIsPrimeWithMinValue() {
        assertFalse(IsPrime.isPrime(Integer.MIN_VALUE));
    }
}