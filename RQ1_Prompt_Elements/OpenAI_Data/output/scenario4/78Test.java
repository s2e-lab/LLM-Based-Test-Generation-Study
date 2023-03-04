// HexKeyTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HexKey}.
* It contains ten unit test cases for the {@link HexKey#hexKey(Object)} method.
*/
class HexKeyTest {

	@Test
	void testHexKey() {
		assertEquals(1, HexKey.hexKey("AB"));
		assertEquals(2, HexKey.hexKey("1077E"));
		assertEquals(4, HexKey.hexKey("ABED1A33"));
		assertEquals(2, HexKey.hexKey("2020"));
		assertEquals(6, HexKey.hexKey("123456789ABCDEF0"));
		assertEquals(12, HexKey.hexKey("112233445566778899AABBCCDDEEFF00"));
		assertEquals(0, HexKey.hexKey(""));
		assertEquals(0, HexKey.hexKey("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		assertEquals(0, HexKey.hexKey("0123456789"));
		assertEquals(0, HexKey.hexKey("0123456789ABCDEF"));
	}
}

// HexKeyTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HexKey}.
* It contains ten unit test cases for the {@link HexKey#hexKey(Object)} method.
*/
class HexKeyTest {
		
	@Test
	void testHexKey() {
		assertEquals(1, HexKey.hexKey("AB"));
		assertEquals(2, HexKey.hexKey("1077E"));
		assertEquals(4, HexKey.hexKey("ABED1A33"));
		assertEquals(2, HexKey.hexKey("2020"));
		assertEquals(6, HexKey.hexKey("123456789ABCDEF0"));
		assertEquals(12, HexKey.hexKey("112233445566778899AABBCCDDEEFF00"));
		assertEquals(0, HexKey.hexKey(""));
		assertEquals(0, HexKey.hexKey("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		assertEquals(0, HexKey.hexKey("0123456789"));
		assertEquals(0, HexKey.hexKey("0123456789ABCDEF"));
	}
}

// HexKey.java
package scenario3;

class HexKey {

    /**
     * You have been tasked to write a function that receives
     * a hexadecimal number as a string and counts the number of hexadecimal
     * digits that are primes (prime number, or a prime, is a natural number
     * greater than 1 that is not a product of two smaller natural numbers).
     * Hexadecimal digits are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F.
     * Prime numbers are 2, 3, 5, 7, 11, 13, 17,...
     * So you have to determine a number of the following digits: 2, 3, 5, 7,
     * B (=decimal 11), D (=decimal 13).
     * Note: you may assume the input is always correct or empty string,
     * and symbols A,B,C,D,E,F are always uppercase.
     * Examples:
     * For num = "AB" the output should be 1.
     * For num = "1077E" the output should be 2.
     * For num = "ABED1A33" the output should be 4.
     * For num = "123456789ABCDEF0" the output should be 6.
     * For num = "2020" the output should be 2.
     *
     * > hexKey("AB")
     * 1
     * > hexKey("1077E")
     * 2
     * > hexKey("ABED1A33")
     * 4
     * > hexKey("2020")
     * 2
     * > hexKey("123456789ABCDEF0")
     * 6
     * > hexKey("112233445566778899AABBCCDDEEFF00")
     * 12
     * > hexKey([])
     * 0
     */
    public static int hexKey(Object num) {
        if (num instanceof String) {
            String str = (String) num;
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '2' || c == '3' || c == '5' || c == '7' || c == 'B' || c == 'D') {
                    count++;
                }
            }
            return count;
        }
        return 0;
    }
}

// HexKeyTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HexKey}.
* It contains ten unit test cases for the {@link HexKey#hexKey(Object)} method.
*/
class HexKeyTest {
		
	@Test
	void testHexKey() {
		assertEquals(1, HexKey.hexKey("AB"));
		assertEquals(2, HexKey.hexKey("1077E"));
		assertEquals(4, HexKey.hexKey("ABED1A33"));
		assertEquals(2, HexKey.hexKey("2020"));
		assertEquals(6, HexKey.hexKey("123456789ABCDEF0"));
		assertEquals(12, HexKey.hexKey("112233445566778899AABBCCDDEEFF00"));
		assertEquals(0, HexKey.hexKey(""));
		assertEquals(0, HexKey.hexKey("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		assertEquals(0, HexKey.hexKey("0123456789"));
		assertEquals(0, HexKey.hexKey("0123456789ABCDEF"));
	}
}

// HexKey.java
package scenario3;

class HexKey {

    /**
     * You have been tasked to write a function that receives
     * a hexadecimal number as a string and counts the number of hexadecimal
     * digits that are primes (prime number, or a prime, is a natural number
     * greater than 1 that is not a product of two smaller natural numbers).
     * Hexadecimal digits are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F.
     * Prime numbers are 2, 3, 5, 7, 11, 13, 17,...
     * So you have to determine a number of the following digits: 2, 3, 5, 7,
     * B (=decimal 11), D (=decimal 13).
     * Note: you may assume the input is always correct or empty string,
     * and symbols A,B,C,D,E,F are always uppercase.
     * Examples:
     * For num = "AB" the output should be 1.
     * For num = "1077E" the output should be 2.
     * For num = "ABED1A33" the output should be 4.
     * For num = "123456789ABCDEF0" the output should be 6.
     * For num = "2020" the output should be 2.
     *
     * > hexKey("AB")
     * 1
     * > hexKey("1077E")
     * 2
     * > hexKey("ABED1A33")
     * 4
     * > hexKey("2020")
     * 2
     * > hexKey("123456789ABCDEF0")
     * 6
     * > hexKey("112233445566778899AABBCCDDEEFF00")
     * 12
     * > hexKey([])
     * 0
     */
    public static int hexKey(Object num) {
        if (num instanceof String) {
            String str = (String) num;
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '2' || c == '3' || c == '5' || c == '7' || c == 'B' || c == 'D') {
                    count++;
                }
            }
            return count;
        }
        return 0;
    }
}

// HexKeyTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HexKey}.
* It contains ten unit test cases for the {@link HexKey#hexKey(Object)} method.
*/
class HexKeyTest {
		
	@Test
	void testHexKey() {
		assertEquals(1, HexKey.hexKey("AB"));
		assertEquals(2, HexKey.hexKey("1077E"));
		assertEquals(4, HexKey.hexKey("ABED1A33"));
		assertEquals(2, HexKey.hexKey("2020"));
		assertEquals(6, HexKey.hexKey("123456789ABCDEF0"));
		assertEquals(12, HexKey.hexKey("112233445566778899AABBCCDDEEFF00"));
		assertEquals(0, HexKey.hexKey(""));
		assertEquals(0, HexKey.hexKey("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		assertEquals(0, HexKey.hexKey("0123456789"));
		assertEquals(0, HexKey.hexKey("0123456789ABCDEF"));
	}
}

// HexKey.java
package scenario3;

class HexKey {

    /**
     * You have been tasked to write a function that receives
     * a hexadecimal number as a string and counts the number of hexadecimal
     * digits that are primes (prime number, or a prime, is a natural number
     * greater than 1 that is not a product of two smaller natural numbers).
     * Hexadecimal digits are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F.
     * Prime numbers are 2, 3, 5, 7, 11, 13, 17,...
     * So you have to determine a number of the following digits: 2, 3, 5, 7,
     * B (=decimal 11), D (=decimal 13).
     * Note: you may assume the input is always correct or empty string,
     * and symbols A,B,C,D,E,F are always uppercase.
     * Examples:
     * For num = "AB" the output should be 1.
     * For num = "1077E" the output should be 2.
     * For num = "ABED1A33" the output should be 4.
     * For num = "123456789ABCDEF0" the output should be 6.
     * For num = "2020" the output should be 2.
     *
     * > hexKey("AB")
     * 1
     * > hexKey("1077E")
     * 2
     * > hexKey("ABED1A33")
     * 4
     * > hexKey("2020")
     * 2
     * > hexKey("123456789ABCDEF0")
     * 6
     * > hexKey("112233445566778899AABBCCDDEEFF00")
     * 12
     * > hexKey([])
     * 0
     */
    public static int hexKey(Object num) {
        if (num instanceof String) {
            String str = (String) num;
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '2' || c == '3' || c == '5' || c == '7' || c == 'B' || c == 'D') {
                    count++;
                }
            }
            return count;
        }
        return 0;
    }
}

// HexKeyTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HexKey}.
* It contains ten unit test cases for the {@link HexKey#hexKey(Object)} method.
*/
class HexKeyTest {
		
	@Test
	void testHexKey() {
		assertEquals(1, HexKey.hexKey("AB"));
		assertEquals(2, HexKey.hexKey("1077E"));
		assertEquals(4, HexKey.hexKey("ABED1A33"));
		assertEquals(2, HexKey.hexKey("2020"));
		assertEquals(6, HexKey.hexKey("123456789ABCDEF0"));
		assertEquals(12, HexKey.hexKey("112233445566778899AABBCCDDEEFF00"));
		assertEquals(0, HexKey.hexKey(""));
		assertEquals(0, HexKey.hexKey("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		assertEquals(0, HexKey.hexKey("0123456789"));
		assertEquals(0, HexKey.hexKey("0123456789ABCDEF"));
	}
}

// HexKey.java
package scenario3;

class HexKey {

    /**
     * You have been tasked to write a function that receives
     * a hexadecimal number as a string and counts the number of hexadecimal
     * digits that are primes (prime number, or a prime, is a natural number
     * greater than 1 that is not a product of two smaller natural numbers).
     * Hexadecimal digits are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F.
     * Prime numbers are 2, 3, 5, 7, 11, 13, 17,...
     * So you have to determine a number of the following digits: 2, 3, 5, 7,
     * B (=decimal 11), D (=decimal 13).
     * Note: you may assume the input is always correct or empty string,
     * and symbols A,B,C,D,E,F are always uppercase.
     * Examples:
     * For num = "AB" the output should be 1.
     * For num = "1077E" the output should be 2.
     * For num = "ABED1A33" the output should be 4.
     * For num = "123456789ABCDEF0" the output should be 6.
     * For num = "2020" the output should be 2.
     *
     * > hexKey("AB")
     * 1
     * > hexKey("1077E")
     * 2
     * > hexKey("ABED1A33")
     * 4
     * > hexKey("2020")
     * 2
     * > hexKey("123456789ABCDEF0")
     * 6
     * > hexKey("112233445566778899AABBCCDDEEFF00")
     * 12
     * > hexKey([])
     * 0
     */
    public static int hexKey(Object num) {
        if (num instanceof String) {
            String str = (String) num;
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '2' || c == '3' || c == '5' || c == '7' || c == 'B' || c == 'D') {
                    count++;
                }
            }
            return count;
        }
        return 0;
    }
}

// HexKeyTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HexKey}.
* It contains ten