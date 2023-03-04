// DecimalToBinaryTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DecimalToBinary}.
* It contains ten unit test cases for the {@link DecimalToBinary#decimalToBinary(int)} method.
*/
class DecimalToBinaryTest {

	@Test
	void testDecimalToBinary_0() {
		assertEquals("db0db", DecimalToBinary.decimalToBinary(0));
	}
	
	@Test
	void testDecimalToBinary_1() {
		assertEquals("db1db", DecimalToBinary.decimalToBinary(1));
	}
	
	@Test
	void testDecimalToBinary_2() {
		assertEquals("db10db", DecimalToBinary.decimalToBinary(2));
	}
	
	@Test
	void testDecimalToBinary_3() {
		assertEquals("db11db", DecimalToBinary.decimalToBinary(3));
	}
	
	@Test
	void testDecimalToBinary_4() {
		assertEquals("db100db", DecimalToBinary.decimalToBinary(4));
	}
	
	@Test
	void testDecimalToBinary_5() {
		assertEquals("db101db", DecimalToBinary.decimalToBinary(5));
	}
	
	@Test
	void testDecimalToBinary_6() {
		assertEquals("db110db", DecimalToBinary.decimalToBinary(6));
	}
	
	@Test
	void testDecimalToBinary_7() {
		assertEquals("db111db", DecimalToBinary.decimalToBinary(7));
	}
	
	@Test
	void testDecimalToBinary_8() {
		assertEquals("db1000db", DecimalToBinary.decimalToBinary(8));
	}
	
	@Test
	void testDecimalToBinary_9() {
		assertEquals("db1001db", DecimalToBinary.decimalToBinary(9));
	}
	
}

// BinaryToDecimal.java
package scenario3;

class BinaryToDecimal {

    /**
     * You will be given a string in binary format and your task is to convert it to decimal format.
     * The function should return an integer.
     *
     * There will be an extra couple of characters 'db' at the beginning and at the end of the string.
     * The extra characters are there to help with the format.
     *
     * Examples:
     * - binaryToDecimal("db1111db")   # returns 15
     * - binaryToDecimal("db100000db") # returns 32
     *
     * > binaryToDecimal("db0db")
     * 0
     * > binaryToDecimal("db100000db")
     * 32
     * > binaryToDecimal("db1100111db")
     * 103
     * > binaryToDecimal("db1111db")
     * 15
     */
    public static int binaryToDecimal(String binary) {
    }
}

// BinaryToDecimalTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryToDecimal}.
* It contains ten unit test cases for the {@link BinaryToDecimal#binaryToDecimal(String)} method.
*/
class BinaryToDecimalTest {
		
	@Test
	void testBinaryToDecimal_0() {
		assertEquals(0, BinaryToDecimal.binaryToDecimal("db0db"));
	}
	
	@Test
	void testBinaryToDecimal_1() {
		assertEquals(1, BinaryToDecimal.binaryToDecimal("db1db"));
	}
	
	@Test
	void testBinaryToDecimal_2() {
		assertEquals(2, BinaryToDecimal.binaryToDecimal("db10db"));
	}
	
	@Test
	void testBinaryToDecimal_3() {
		assertEquals(3, BinaryToDecimal.binaryToDecimal("db11db"));
	}
	
	@Test
	void testBinaryToDecimal_4() {
		assertEquals(4, BinaryToDecimal.binaryToDecimal("db100db"));
	}
	
	@Test
	void testBinaryToDecimal_5() {
		assertEquals(5, BinaryToDecimal.binaryToDecimal("db101db"));
	}
	
	@Test
	void testBinaryToDecimal_6() {
		assertEquals(6, BinaryToDecimal.binaryToDecimal("db110db"));
	}
	
	@Test
	void testBinaryToDecimal_7() {
		assertEquals(7, BinaryToDecimal.binaryToDecimal("db111db"));
	}
	
	@Test
	void testBinaryToDecimal_8() {
		assertEquals(8, BinaryToDecimal.binaryToDecimal("db1000db"));
	}
	
	@Test
	void testBinaryToDecimal_9() {
		assertEquals(9, BinaryToDecimal.binaryToDecimal("db1001db"));
	}
	
}

// BinaryToDecimal.java
package scenario3;

class BinaryToDecimal {

    /**
     * You will be given a string in binary format and your task is to convert it to decimal format.
     * The function should return an integer.
     *
     * There will be an extra couple of characters 'db' at the beginning and at the end of the string.
     * The extra characters are there to help with the format.
     *
     * Examples:
     * - binaryToDecimal("db1111db")   # returns 15
     * - binaryToDecimal("db100000db") # returns 32
     *
     * > binaryToDecimal("db0db")
     * 0
     * > binaryToDecimal("db100000db")
     * 32
     * > binaryToDecimal("db1100111db")
     * 103
     * > binaryToDecimal("db1111db")
     * 15
     */
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
}

// BinaryToDecimalTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryToDecimal}.
* It contains ten unit test cases for the {@link BinaryToDecimal#binaryToDecimal(String)} method.
*/
class BinaryToDecimalTest {
		
	@Test
	void testBinaryToDecimal_0() {
		assertEquals(0, BinaryToDecimal.binaryToDecimal("db0db"));
	}
	
	@Test
	void testBinaryToDecimal_1() {
		assertEquals(1, BinaryToDecimal.binaryToDecimal("db1db"));
	}
	
	@Test
	void testBinaryToDecimal_2() {
		assertEquals(2, BinaryToDecimal.binaryToDecimal("db10db"));
	}
	
	@Test
	void testBinaryToDecimal_3() {
		assertEquals(3, BinaryToDecimal.binaryToDecimal("db11db"));
	}
	
	@Test
	void testBinaryToDecimal_4() {
		assertEquals(4, BinaryToDecimal.binaryToDecimal("db100db"));
	}
	
	@Test
	void testBinaryToDecimal_5() {
		assertEquals(5, BinaryToDecimal.binaryToDecimal("db101db"));
	}
	
	@Test
	void testBinaryToDecimal_6() {
		assertEquals(6, BinaryToDecimal.binaryToDecimal("db110db"));
	}
	
	@Test
	void testBinaryToDecimal_7() {
		assertEquals(7, BinaryToDecimal.binaryToDecimal("db111db"));
	}
	
	@Test
	void testBinaryToDecimal_8() {
		assertEquals(8, BinaryToDecimal.binaryToDecimal("db1000db"));
	}
	
	@Test
	void testBinaryToDecimal_9() {
		assertEquals(9, BinaryToDecimal.binaryToDecimal("db1001db"));
	}
	
}

// DecimalToBinary.java
package scenario3;

class DecimalToBinary {

    /**
     * You will be given a number in decimal form and your task is to convert it to
     * binary format. The function should return a string, with each character representing a binary
     * number. Each character in the string will be '0' or '1'.
     *
     * There will be an extra couple of characters 'db' at the beginning and at the end of the string.
     * The extra characters are there to help with the format.
     *
     * Examples:
     * - decimalToBinary(15)   # returns "db1111db"
     * - decimalToBinary(32)   # returns "db100000db"
     *
     * > decimalToBinary(0)
     * "db0db"
     * > decimalToBinary(32)
     * "db100000db"
     * > decimalToBinary(103)
     * "db1100111db"
     * > decimalToBinary(15)
     * "db1111db"
     */
    public static String decimalToBinary(int decimal) {
        String binary = "";
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal /= 2;
        }
        return "db" + binary + "db";
    }
}

// DecimalToBinaryTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DecimalToBinary}.
* It contains ten unit test cases for the {@link DecimalToBinary#decimalToBinary(int)} method.
*/
class DecimalToBinaryTest {
		
	@Test
	void testDecimalToBinary_0() {
		assertEquals("db0db", DecimalToBinary.decimalToBinary(0));
	}
	
	@Test
	void testDecimalToBinary_1() {
		assertEquals("db1db", DecimalToBinary.decimalToBinary(1));
	}
	
	@Test
	void testDecimalToBinary_2() {
		assertEquals("db10db", DecimalToBinary.decimalToBinary(2));
	}
	
	@Test
	void testDecimalToBinary_3() {
		assertEquals("db11db", DecimalToBinary.decimalToBinary(3));
	}
	
	@Test
	void testDecimalToBinary_4() {
		assertEquals("db100db", DecimalToBinary.decimalToBinary(4));
	}
	
	@Test
	void testDecimalToBinary_5() {
		assertEquals("db101db", DecimalToBinary.decimalToBinary(5));
	}
	
	@Test
	void testDecimalToBinary_6() {
		assertEquals("db110db", DecimalToBinary.decimalToBinary(6));
	}
	
	@Test
	void testDecimalToBinary_7() {
		assertEquals("db111db", DecimalToBinary.decimalToBinary(7));
	}
	
	@Test
	void testDecimalToBinary_8() {
		assertEquals("db1000db", DecimalToBinary.decimalToBinary(8));
	}
	
	@Test
	void testDecimalToBinary_9() {
		assertEquals("db1001db", DecimalToBinary.decimalToBinary(9));
	}
	
}

// BinaryToDecimal.java
package scenario3;

class BinaryToDecimal {

    /**
     * You will be given a string in binary format and your task is to convert it to decimal format.
     * The function should return an integer.
     *
     * There will be an extra couple of characters 'db' at the beginning and at the end of the string.
     * The extra characters are there to help with the format.
     *
     * Examples:
     * - binaryToDecimal("db1111db")   # returns 15
     * - binaryToDecimal("db100000db") # returns 32
     *
     * > binaryToDecimal("db0db")
     * 0
     * > binaryToDecimal("db100000db")
     * 32
     * > binaryToDecimal("db1100111db")
     * 103
     * > binaryToDecimal("db1111db")
     * 15
     */
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
}

// BinaryToDecimalTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryToDecimal}.
* It contains ten unit test cases for the {@link BinaryToDecimal#binaryToDecimal(String)} method.
*/
class BinaryToDecimalTest {
		
	@Test
	void testBinaryToDecimal_0() {
		assertEquals(0, BinaryToDecimal.binaryToDecimal("db0db"));
	}
	
	@Test
	void testBinaryToDecimal_1() {
		assertEquals(1, BinaryToDecimal.binaryToDecimal("db1db"));
	}
	
	@Test
	void testBinaryToDecimal_2() {
		assertEquals(2, BinaryToDecimal.binaryToDecimal("db10db"));
	}
	
	@Test
	void testBinaryToDecimal_3() {
		assertEquals(3, BinaryToDecimal.binaryToDecimal("db11db"));
	}
	
	@Test
	void testBinaryToDecimal_4() {
		assertEquals(4, BinaryToDecimal.binaryToDecimal("db100db"));
	}
	
	@Test
	void testBinaryToDecimal_5() {
		assertEquals(5, BinaryToDecimal.binaryToDecimal("db101db"));
	}
	
	@Test
	void testBinaryToDecimal_6() {
		assertEquals(6, BinaryToDecimal.binaryToDecimal("db110db"));
	}
	
	@Test
	void testBinaryToDecimal_7() {
		assertEquals(7, BinaryToDecimal.binaryToDecimal("db111db"));
	}
	
	@Test
	void testBinaryToDecimal_8() {
		assertEquals(8, BinaryToDecimal.binaryToDecimal("db1000db"));
	}
	
	@Test
	void testBinaryToDecimal_9() {
		assertEquals(9, BinaryToDecimal.binaryToDecimal("db1001db"));
	}
	
}

// DecimalToBinary.java
package scenario3;

class DecimalToBinary {

    /**
     * You will be given a number in decimal form and your task is to convert it to
    