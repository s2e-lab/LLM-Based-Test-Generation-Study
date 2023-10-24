// BinaryCalculate_0Test.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains ten unit test cases for the {@link BinaryCalculate#addBinary(String, String)} method.
*/
class BinaryCalculate_0Test {

    /**
    * Test case for {@link BinaryCalculate#addBinary(String, String)}.
    */
    @Test
    void testAddBinary() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String num1 = "1010";
        String num2 = "1010";
        String expected = "10100";
        String actual = binaryCalculate.addBinary(num1, num2);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link BinaryCalculate#addBinary(String, String)}.
    */
    @Test
    void testAddBinary1() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String num1 = "1010";
        String num2 = "10100";
        String expected = "101000";
        String actual = binaryCalculate.addBinary(num1, num2);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link BinaryCalculate#addBinary(String, String)}.
    */
    @Test
    void testAddBinary2() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String num1 = "1010";
        String num2 = "101000";
        String expected = "1010000";
        String actual = binaryCalculate.addBinary(num1, num2);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link BinaryCalculate#addBinary(String, String)}.
    */
    @Test
    void testAddBinary3() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String num1 = "1010";
        String num2 = "1010000";
        String expected = "10100000";
        String actual = binaryCalculate.addBinary(num1, num2);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link BinaryCalculate#addBinary(String, String)}.
    */
    @Test
    void testAddBinary4() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String num1 = "1010";
        String num2 = "10100000";
        String expected = "101000000";
        String actual = binaryCalculate.addBinary(num1, num2);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link BinaryCalculate#addBinary(String, String)}.
    */
    @Test
    void testAddBinary5() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String num1 = "1010";
        String num2 = "101000000";
        String expected = "1010000000";
        String actual = binaryCalculate.addBinary(num1, num2);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link BinaryCalculate#addBinary(String, String)}.
    */
    @Test
    void testAddBinary6() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String num1 = "1010";
        String num2 = "1010000000";
        String expected = "10100000000";
        String actual = binaryCalculate.addBinary(num1, num2);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link BinaryCalculate#addBinary(String, String)}.
    */
    @Test
    void testAddBinary7() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String num1 = "1010";
        String num2 = "10100000000";
        String expected = "101000000000";
        String actual = binaryCalculate.addBinary(num1, num2);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link BinaryCalculate#addBinary(String, String)}.
    */
    @Test
    void testAddBinary8() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String num1 = "1010";
        String num2 = "101000000000";
        String expected = "1010000000000";
        String actual = binaryCalculate.addBinary(num1, num2);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link BinaryCalculate#addBinary(String, String)}.
    */
    @Test
    void testAddBinary9() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String num1 = "1010";
        String num2 = "1010000000000";
        String expected = "10100000000000";
        String actual = binaryCalculate.addBinary(num1, num2);
        assertEquals(expected, actual);
    }
}

// BinaryCalculate_1Test.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains ten unit test cases for the {@link BinaryCalculate#subBinary(String, String)} method.
*/
class BinaryCalculate_1Test {
		
    /**
    * Test case for {@link BinaryCalculate#subBinary(String, String)}.
    */
    @Test
    void testSubBinary() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String num1 = "1010";
        String num2 = "1010";
        String expected = "0";
        String actual = binaryCalculate.subBinary(num1, num2);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link BinaryCalculate#subBinary(String, String)}.
    */
    @Test
    void testSubBinary1() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String num1 = "1010";
        String num2 = "10100";
        String expected = "101";
        String actual = binaryCalculate.subBinary(num1, num2);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link BinaryCalculate#subBinary(String, String)}.
    */
    @Test
    void testSubBinary2() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String num1 = "1010";
        String num2 = "101000";
        String expected = "1010";
        String actual = binaryCalculate.subBinary(num1, num2);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link BinaryCalculate#subBinary(String, String)}.
    */
    @Test
    void testSubBinary3() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String num1 = "1010";
        String num2 = "1010000";
        String expected = "10100";
        String actual = binaryCalculate.subBinary(num1, num2);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link BinaryCalculate#subBinary(String, String)}.
    */
    @Test
    void testSubBinary4() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String num1 = "1010";
        String num2 = "10100000";
        String expected = "101000";
        String actual = binaryCalculate.subBinary(num1, num2);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link BinaryCalculate#subBinary(String, String)}.
    */
    @Test
    void testSubBinary5() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String num1 = "1010";
        String num2 = "101000000";
        String expected = "1010000";
        String actual = binaryCalculate.subBinary(num1, num2);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link BinaryCalculate#subBinary(String, String)}.
    */
    @Test
    void testSubBinary6() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String num1 = "1010";
        String num2 = "1010000000";
        String expected = "10100000";
        String actual = binaryCalculate.subBinary(num1, num2);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link BinaryCalculate#subBinary(String, String)}.
    */
    @Test
    void testSubBinary7() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String num1 = "1010";
        String num2 = "10100000000";
        String expected = "1010000