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
		assertEquals(23331668, MultiplesOf3And5.sumOfMultiples(10000));
		assertEquals(2333316668, MultiplesOf3And5.sumOfMultiples(100000));
		assertEquals(233333166668L, MultiplesOf3And5.sumOfMultiples(1000000));
		assertEquals(23333331666668L, MultiplesOf3And5.sumOfMultiples(10000000));
		assertEquals(2333333316666668L, MultiplesOf3And5.sumOfMultiples(100000000));
		assertEquals(233333333166666668L, MultiplesOf3And5.sumOfMultiples(1000000000));
		assertEquals(23333333331666666666L, MultiplesOf3And5.sumOfMultiples(10000000000L));
	}
}

// PalindromeProduct.java
package scenario1;

class PalindromeProduct {

    public static int largestPalindromeProduct(int n) {
        int max = 0;
        for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
            for (int j = (int) Math.pow(10, n - 1); j < Math.pow(10, n); j++) {
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
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
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
		assertEquals(9009, PalindromeProduct.largestPalindromeProduct(2));
		assertEquals(906609, PalindromeProduct.largestPalindromeProduct(3));
		assertEquals(99000099, PalindromeProduct.largestPalindromeProduct(4));
		assertEquals(9966006699L, PalindromeProduct.largestPalindromeProduct(5));
		assertEquals(999000000999L, PalindromeProduct.largestPalindromeProduct(6));
		assertEquals(999550000559999L, PalindromeProduct.largestPalindromeProduct(7));
		assertEquals(99990000009999L, PalindromeProduct.largestPalindromeProduct(8));
		assertEquals(9999560000569999L, PalindromeProduct.largestPalindromeProduct(9));
		assertEquals(9999900000099999L, PalindromeProduct.largestPalindromeProduct(10));
		assertEquals(9999956000005699999L, PalindromeProduct.largestPalindromeProduct(11));
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
		assertEquals(2329089562800L, SmallestMultiple.smallestMultiple(30));
		assertEquals(2329089562800L, SmallestMultiple.smallestMultiple(40));
		assertEquals(2329089562800L, SmallestMultiple.smallestMultiple(50));
		assertEquals(2329089562800L, SmallestMultiple.smallestMultiple(60));
		assertEquals(2329089562800L, SmallestMultiple.smallestMultiple(70));
		assertEquals(2329089562800L, SmallestMultiple.smallestMultiple(80));
		assertEquals(2329089562800L, SmallestMultiple.smallestMultiple(90));
		assertEquals(2329089562800L, SmallestMultiple.smallestMultiple(100));
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
		assertEquals(250166416500L, SumSquareDifference.sumSquareDifference(1000));
		assertEquals(25001661565000L, SumSquareDifference.sumSquareDifference(10000));
		assertEquals(25000166015650000L, SumSquareDifference.sumSquareDifference(100000));
		assertEquals(25000016600156500000L, SumSquareDifference.sumSquareDifference(1000000));
		assertEquals(25000001660001565000000L, SumSquareDifference.sumSquareDifference(10000000));
		assertEquals(2500000016600015650000000L, SumSquareDifference.sumSquareDifference(100000000));
		assertEquals(2500000001660000156500000000L, SumSquareDifference.sumSquareDifference(1000000000));
		assertEquals(25000000001660001565000000000L, SumSquareDifference.sumSquareDifference(10000000000L));
	}
}

// SpecialPythagoreanTriplet.java
package scenario1;

class SpecialPythagoreanTriplet {

    public static int productOfSpecialPythagoreanTriplet(int n) {
        for (int a = 1; a < n; a++) {
            for (int b = a + 1; b < n; b++) {
                int c = n - a - b;
                if (a * a + b * b == c * c) {
                    return a * b * c;
                }
            }
        }
        return 0;
    }
}

// SpecialPythagoreanTripletTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SpecialPythagoreanTriplet}.
* It contains ten unit test cases for the {@link SpecialPythagoreanTriplet#productOfSpecialPythagoreanTriplet(int)} method.
*/
class SpecialPythagoreanTripletTest {
		
	@Test
	void testProductOfSpecialPythagoreanTriplet() {
		assertEquals(60, SpecialPythagoreanTriplet.productOfSpecialPythagoreanTriplet(12));
		assertEquals(31875000, SpecialPythagoreanTriplet.productOfSpecialPythagoreanTriplet(1000));
		assertEquals(31875000, SpecialPythagoreanTriplet.productOfSpecialPythagoreanTriplet(2000));
		assertEquals(31875000, SpecialPythagoreanTriplet.productOfSpecialPythagoreanTriplet(3000));
		assertEquals(31875000, SpecialPythagoreanTriplet.productOfSpecialPythagoreanTriplet(4000));
		assertEquals(31875000, SpecialPythagoreanTriplet.productOfSpecialPythagoreanTriplet(5000));
		assertEquals(31875000, SpecialPythagoreanTriplet.productOfSpecialPythagoreanTriplet(6000));
		assertEquals(31875000, SpecialPythagoreanTriplet.productOfSpecialPythagoreanTriplet(7000));
		assertEquals(31875000, SpecialPythagoreanTriplet.productOfSpecialPythagoreanTriplet(8000));
		assertEquals(31875000, SpecialPythagoreanTriplet.productOfSpecialPythagoreanTriplet(9000));
	}
}

// SummationOfPrimes.java
package scenario1;

class SummationOfPrimes {

    public static int sumOfPrimes(int n) {
        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// SummationOfPrimesTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SummationOfPrimes}.
* It contains ten unit test cases for the {@link SummationOfPrimes#sumOfPrimes(int)} method.
*/
class SummationOfPrimesTest {
		
	@Test
	void testSumOfPrimes() {
		assertEquals(17, SummationOfPrimes.sumOfPrimes(10));
		assertEquals(1060, SummationOfPrimes.sumOfPrimes(100));
		assertEquals(76127, SummationOfPrimes.sumOfPrimes(1000));
		assertEquals(5736396, SummationOfPrimes.sumOfPrimes(10000));
		assertEquals(37550402023L, SummationOfPrimes.sumOfPrimes(100000));
		assertEquals(2303127503681L, SummationOfPrimes.sumOfPrimes(1000000));
		assertEquals(142913828922L, SummationOfPrimes.sumOfPrimes(10000000));
		assertEquals(9227465L, SummationOfPrimes.sumOfPrimes(100000000));
		assertEquals(142913828922L, SummationOfPrimes.sumOfPrimes(10000000));
		assertEquals(9227465L, SummationOfPrimes.sumOfPrimes(100000000));
	}
}