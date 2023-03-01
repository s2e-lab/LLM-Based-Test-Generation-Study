// LargestPrimeFactorTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains ten unit test cases for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {

	@Test
	void testLargestPrimeFactor() {
		assertEquals(29, LargestPrimeFactor.largestPrimeFactor(13195));
		assertEquals(6857, LargestPrimeFactor.largestPrimeFactor(600851475143));
		assertEquals(5, LargestPrimeFactor.largestPrimeFactor(5));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(4));
		assertEquals(3, LargestPrimeFactor.largestPrimeFactor(6));
		assertEquals(5, LargestPrimeFactor.largestPrimeFactor(10));
		assertEquals(7, LargestPrimeFactor.largestPrimeFactor(14));
		assertEquals(11, LargestPrimeFactor.largestPrimeFactor(22));
		assertEquals(13, LargestPrimeFactor.largestPrimeFactor(26));
	}
}

// MultiplesOf3And5.java
package scenario1;

class MultiplesOf3And5 {

    public static int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 3; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

// MultiplesOf3And5Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MultiplesOf3And5}.
* It contains ten unit test cases for the {@link MultiplesOf3And5#sumOfMultiples(int)} method.
*/
class MultiplesOf3And5Test {
		
	@Test
	void testSumOfMultiples() {
		assertEquals(23, MultiplesOf3And5.sumOfMultiples(10));
		assertEquals(2318, MultiplesOf3And5.sumOfMultiples(100));
		assertEquals(233168, MultiplesOf3And5.sumOfMultiples(1000));
		assertEquals(0, MultiplesOf3And5.sumOfMultiples(1));
		assertEquals(0, MultiplesOf3And5.sumOfMultiples(2));
		assertEquals(0, MultiplesOf3And5.sumOfMultiples(3));
		assertEquals(3, MultiplesOf3And5.sumOfMultiples(4));
		assertEquals(3, MultiplesOf3And5.sumOfMultiples(5));
		assertEquals(8, MultiplesOf3And5.sumOfMultiples(6));
		assertEquals(14, MultiplesOf3And5.sumOfMultiples(7));
	}
}

// PalindromeProduct.java
package scenario1;

class PalindromeProduct {

    public static int largestPalindromeProduct(int n) {
        int max = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int product = i * j;
                if (isPalindrome(product) && product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    private static boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

// PalindromeProductTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PalindromeProduct}.
* It contains ten unit test cases for the {@link PalindromeProduct#largestPalindromeProduct(int)} method.
*/
class PalindromeProductTest {
		
	@Test
	void testLargestPalindromeProduct() {
		assertEquals(9009, PalindromeProduct.largestPalindromeProduct(99));
		assertEquals(906609, PalindromeProduct.largestPalindromeProduct(999));
		assertEquals(0, PalindromeProduct.largestPalindromeProduct(0));
		assertEquals(0, PalindromeProduct.largestPalindromeProduct(1));
		assertEquals(0, PalindromeProduct.largestPalindromeProduct(2));
		assertEquals(0, PalindromeProduct.largestPalindromeProduct(3));
		assertEquals(0, PalindromeProduct.largestPalindromeProduct(4));
		assertEquals(0, PalindromeProduct.largestPalindromeProduct(5));
		assertEquals(0, PalindromeProduct.largestPalindromeProduct(6));
		assertEquals(0, PalindromeProduct.largestPalindromeProduct(7));
	}
}

// SmallestMultiple.java
package scenario1;

class SmallestMultiple {

    public static int smallestMultiple(int n) {
        int i = n;
        while (true) {
            boolean isMultiple = true;
            for (int j = 1; j <= n; j++) {
                if (i % j != 0) {
                    isMultiple = false;
                    break;
                }
            }
            if (isMultiple) {
                return i;
            }
            i++;
        }
    }
}

// SmallestMultipleTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SmallestMultiple}.
* It contains ten unit test cases for the {@link SmallestMultiple#smallestMultiple(int)} method.
*/
class SmallestMultipleTest {
		
	@Test
	void testSmallestMultiple() {
		assertEquals(2520, SmallestMultiple.smallestMultiple(10));
		assertEquals(232792560, SmallestMultiple.smallestMultiple(20));
		assertEquals(0, SmallestMultiple.smallestMultiple(0));
		assertEquals(1, SmallestMultiple.smallestMultiple(1));
		assertEquals(2, SmallestMultiple.smallestMultiple(2));
		assertEquals(6, SmallestMultiple.smallestMultiple(3));
		assertEquals(12, SmallestMultiple.smallestMultiple(4));
		assertEquals(60, SmallestMultiple.smallestMultiple(5));
		assertEquals(60, SmallestMultiple.smallestMultiple(6));
		assertEquals(420, SmallestMultiple.smallestMultiple(7));
	}
}

// SumSquareDifference.java
package scenario1;

class SumSquareDifference {

    public static int sumSquareDifference(int n) {
        int sumOfSquares = 0;
        int squareOfSum = 0;
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
            squareOfSum += i;
        }
        squareOfSum *= squareOfSum;
        return squareOfSum - sumOfSquares;
    }
}

// SumSquareDifferenceTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquareDifference}.
* It contains ten unit test cases for the {@link SumSquareDifference#sumSquareDifference(int)} method.
*/
class SumSquareDifferenceTest {
		
	@Test
	void testSumSquareDifference() {
		assertEquals(2640, SumSquareDifference.sumSquareDifference(10));
		assertEquals(25164150, SumSquareDifference.sumSquareDifference(100));
		assertEquals(0, SumSquareDifference.sumSquareDifference(0));
		assertEquals(0, SumSquareDifference.sumSquareDifference(1));
		assertEquals(4, Sum