// PrimeLengthTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeLength}.
* It contains ten unit test cases for the {@link PrimeLength#primeLength(String)} method.
*/
class PrimeLengthTest {

		@Test
		void testPrimeLength() {
			assertTrue(PrimeLength.primeLength(""));
			assertTrue(PrimeLength.primeLength("a"));
			assertTrue(PrimeLength.primeLength("ab"));
			assertTrue(PrimeLength.primeLength("abc"));
			assertTrue(PrimeLength.primeLength("abcd"));
			assertTrue(PrimeLength.primeLength("abcde"));
			assertTrue(PrimeLength.primeLength("abcdef"));
			assertTrue(PrimeLength.primeLength("abcdefg"));
			assertTrue(PrimeLength.primeLength("abcdefgh"));
			assertTrue(PrimeLength.primeLength("abcdefghi"));
		}
}

// PrimeLength.java
package scenario2;

class PrimeLength {

    /**
     * Write a function that takes a string and returns True if the string
     * length is a prime number or False otherwise
     */
    public static Boolean primeLength(String string) {
        int length = string.length();
        if (length == 0 || length == 1) {
            return false;
        }
        for (int i = 2; i < length; i++) {
            if (length % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// PrimeLengthTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeLength}.
* It contains ten unit test cases for the {@link PrimeLength#primeLength(String)} method.
*/
class PrimeLengthTest {
		
		@Test
		void testPrimeLength() {
			assertTrue(PrimeLength.primeLength(""));
			assertTrue(PrimeLength.primeLength("a"));
			assertTrue(PrimeLength.primeLength("ab"));
			assertTrue(PrimeLength.primeLength("abc"));
			assertTrue(PrimeLength.primeLength("abcd"));
			assertTrue(PrimeLength.primeLength("abcde"));
			assertTrue(PrimeLength.primeLength("abcdef"));
			assertTrue(PrimeLength.primeLength("abcdefg"));
			assertTrue(PrimeLength.primeLength("abcdefgh"));
			assertTrue(PrimeLength.primeLength("abcdefghi"));
		}
}

// PrimeLength.java
package scenario2;

class PrimeLength {

    /**
     * Write a function that takes a string and returns True if the string
     * length is a prime number or False otherwise
     */
    public static Boolean primeLength(String string) {
        int length = string.length();
        if (length == 0 || length == 1) {
            return false;
        }
        for (int i = 2; i < length; i++) {
            if (length % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// PrimeLengthTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeLength}.
* It contains ten unit test cases for the {@link PrimeLength#primeLength(String)} method.
*/
class PrimeLengthTest {
		
		@Test
		void testPrimeLength() {
			assertTrue(PrimeLength.primeLength(""));
			assertTrue(PrimeLength.primeLength("a"));
			assertTrue(PrimeLength.primeLength("ab"));
			assertTrue(PrimeLength.primeLength("abc"));
			assertTrue(PrimeLength.primeLength("abcd"));
			assertTrue(PrimeLength.primeLength("abcde"));
			assertTrue(PrimeLength.primeLength("abcdef"));
			assertTrue(PrimeLength.primeLength("abcdefg"));
			assertTrue(PrimeLength.primeLength("abcdefgh"));
			assertTrue(PrimeLength.primeLength("abcdefghi"));
		}
}

// PrimeLength.java
package scenario2;

class PrimeLength {

    /**
     * Write a function that takes a string and returns True if the string
     * length is a prime number or False otherwise
     */
    public static Boolean primeLength(String string) {
        int length = string.length();
        if (length == 0 || length == 1) {
            return false;
        }
        for (int i = 2; i < length; i++) {
            if (length % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// PrimeLengthTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeLength}.
* It contains ten unit test cases for the {@link PrimeLength#primeLength(String)} method.
*/
class PrimeLengthTest {
		
		@Test
		void testPrimeLength() {
			assertTrue(PrimeLength.primeLength(""));
			assertTrue(PrimeLength.primeLength("a"));
			assertTrue(PrimeLength.primeLength("ab"));
			assertTrue(PrimeLength.primeLength("abc"));
			assertTrue(PrimeLength.primeLength("abcd"));
			assertTrue(PrimeLength.primeLength("abcde"));
			assertTrue(PrimeLength.primeLength("abcdef"));
			assertTrue(PrimeLength.primeLength("abcdefg"));
			assertTrue(PrimeLength.primeLength("abcdefgh"));
			assertTrue(PrimeLength.primeLength("abcdefghi"));
		}
}

// PrimeLength.java
package scenario2;

class PrimeLength {

    /**
     * Write a function that takes a string and returns True if the string
     * length is a prime number or False otherwise
     */
    public static Boolean primeLength(String string) {
        int length = string.length();
        if (length == 0 || length == 1) {
            return false;
        }
        for (int i = 2; i < length; i++) {
            if (length % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// PrimeLengthTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeLength}.
* It contains ten unit test cases for the {@link PrimeLength#primeLength(String)} method.
*/
class PrimeLengthTest {
		
		@Test
		void testPrimeLength() {
			assertTrue(PrimeLength.primeLength(""));
			assertTrue(PrimeLength.primeLength("a"));
			assertTrue(PrimeLength.primeLength("ab"));
			assertTrue(PrimeLength.primeLength("abc"));
			assertTrue(PrimeLength.primeLength("abcd"));
			assertTrue(PrimeLength.primeLength("abcde"));
			assertTrue(PrimeLength.primeLength("abcdef"));
			assertTrue(PrimeLength.primeLength("abcdefg"));
			assertTrue(PrimeLength.primeLength("abcdefgh"));
			assertTrue(PrimeLength.primeLength("abcdefghi"));
		}
}

// PrimeLength.java
package scenario2;

class PrimeLength {

    /**
     * Write a function that takes a string and returns True if the string
     * length is a prime number or False otherwise
     */
    public static Boolean primeLength(String string) {
        int length = string.length();
        if (length == 0 || length == 1) {
            return false;
        }
        for (int i = 2; i < length; i++) {
            if (length % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// PrimeLengthTest.java
package scenario2;


import org.junit.j