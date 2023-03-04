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
	void testIsMultiplyPrime() {
		assertFalse(IsMultiplyPrime.isMultiplyPrime(5));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(30));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(8));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(10));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(125));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(105));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(126));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(729));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(891));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(1001));
	}
}

// IsMultiplyPrime.java
package scenario3;

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
        int count = 0;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                count++;
                a /= i;
                i--;
            }
        }
        return count == 3;
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
	void testIsMultiplyPrime() {
		assertFalse(IsMultiplyPrime.isMultiplyPrime(5));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(30));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(8));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(10));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(125));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(105));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(126));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(729));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(891));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(1001));
	}
}

// IsMultiplyPrime.java
package scenario3;

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
        int count = 0;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                count++;
                a /= i;
                i--;
            }
        }
        return count == 3;
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
	void testIsMultiplyPrime() {
		assertFalse(IsMultiplyPrime.isMultiplyPrime(5));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(30));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(8));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(10));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(125));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(105));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(126));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(729));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(891));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(1001));
	}
}

// IsMultiplyPrime.java
package scenario3;

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
        int count = 0;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                count++;
                a /= i;
                i--;
            }
        }
        return count == 3;
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
	void testIsMultiplyPrime() {
		assertFalse(IsMultiplyPrime.isMultiplyPrime(5));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(30));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(8));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(10));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(125));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(105));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(126));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(729));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(891));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(1001));
	}
}

// IsMultiplyPrime.java
package scenario3;

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
        int count = 0;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                count++;
                a /= i;
                i--;
            }
        }
        return count == 3;
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
	void testIsMultiplyPrime() {
		assertFalse(IsMultiplyPrime.isMultiplyPrime(5));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(30));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(8));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(10));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(125));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(105));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(126));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(729));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(891));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(1001));
	}
}

// IsMultiplyPrime.java
package scenario3;

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
        int count = 0;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                count++;
                a /= i;
                i--;
            }
        }
        return count == 3;
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
	void testIsMultiplyPrime() {
		assertFalse(IsMultiplyPrime.isMultiplyPrime(5));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(30));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(8));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(10));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(125));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(105));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(126));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(729));
		assertFalse(IsMultiplyPrime.isMultiplyPrime(891));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(1001));
	}
}

// IsMultiplyPrime.java
package scenario3;

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
        int count = 0;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                count++;
                a /= i;
                i--;
            }
        }
        return count == 3;
    }
}

// IsMultiplyPrimeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@