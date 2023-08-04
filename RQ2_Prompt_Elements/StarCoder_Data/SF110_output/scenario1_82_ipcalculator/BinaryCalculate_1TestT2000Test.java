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
    * Test case number: 1
    * Test case values: "11", "1"
    * Expected output (Post-state): "01"
    */
    @Test
    void testSubBinary1() {
        BinaryCalculate_1 test = new BinaryCalculate_1();
        String result = test.subBinary("11", "1");
        assertEquals("01", result);
    }

    /**
    * Test case number: 2
    * Test case values: "1010", "1011"
    * Expected output (Post-state): "0001"
    */
    @Test
    void testSubBinary2() {
        BinaryCalculate_1 test = new BinaryCalculate_1();
        String result = test.subBinary("1010", "1011");
        assertEquals("0001", result);
    }

    /**
    * Test case number: 3
    * Test case values: "1111", "1111"
    * Expected output (Post-state): "0000"
    */
    @Test
    void testSubBinary3() {
        BinaryCalculate_1 test = new BinaryCalculate_1();
        String result = test.subBinary("1111", "1111");
        assertEquals("0000", result);
    }

    /**
    * Test case number: 4
    * Test case values: "1111", "1110"
    * Expected output (Post-state): "0001"
    */
    @Test
    void testSubBinary4() {
        BinaryCalculate_1 test = new BinaryCalculate_1();
        String result = test.subBinary("1111", "1110");
        assertEquals("0001", result);
    }

    /**
    * Test case number: 5
    * Test case values: "1111", "1101"
    * Expected output (Post-state): "0010"
    */
    @Test
    void testSubBinary5() {
        BinaryCalculate_1 test = new BinaryCalculate_1();
        String result = test.subBinary("1111", "1101");
        assertEquals("0010", result);
    }

    /**
    * Test case number: 6
    * Test case values: "1111", "1011"
    * Expected output (Post-state): "0100"
    */
    @Test
    void testSubBinary6() {
        BinaryCalculate_1 test = new BinaryCalculate_1();
        String result = test.subBinary("1111", "1011");
        assertEquals("0100", result);
    }

    /**
    * Test case number: 7
    * Test case values: "1111", "0111"
    * Expected output (Post-state): "1000"
    */
    @Test
    void testSubBinary7() {
        BinaryCalculate_1 test = new BinaryCalculate_1();
        String result = test.subBinary("1111", "0111");
        assertEquals("1000", result);
    }

    /**
    * Test case number: 8
    * Test case values: "1111", "0011"
    * Expected output (Post-state): "1100"
    */
    @Test
    void testSubBinary8() {
        BinaryCalculate_1 test = new BinaryCalculate_1();
        String result = test.subBinary("1111", "0011");
        assertEquals("1100", result);
    }

    /**
    * Test case number: 9
    * Test case values: "1111", "0001"
    * Expected output (Post-state): "1110"
    */
    @Test
    void testSubBinary9() {
        BinaryCalculate_1 test = new BinaryCalculate_1();
        String result = test.subBinary("1111", "0001");
        assertEquals("1110", result);
    }

    /**
    * Test case number: 10
    * Test case values: "1111", "0000"
    * Expected output (Post-state): "1111"
    */
    @Test
    void testSubBinary10() {
        BinaryCalculate_1 test = new BinaryCalculate_1();
        String result = test.subBinary("1111", "0000");
        assertEquals("1111", result);
    }
}

// BinaryCalculate_2Test.java
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
class BinaryCalculate_2Test {
		
    /**
    * Test case number: 1
    * Test case values: "11", "1"
    * Expected output (Post-state): "01"
    */
    @Test
    void testSubBinary1() {
        BinaryCalculate_2 test = new BinaryCalculate_2();
        String result = test.subBinary("11", "1");
        assertEquals("01", result);
    }

    /**
    * Test case number: 2
    * Test case values: "1010", "1011"
    * Expected output (Post-state): "0001"
    */
    @Test
    void testSubBinary2() {
        BinaryCalculate_2 test = new BinaryCalculate_2();
        String result = test.subBinary("1010", "1011");
        assertEquals("0001", result);
    }

    /**
    * Test case number: 3
    * Test case values: "1111", "1111"
    * Expected output (Post-state): "0000"
    */
    @Test
    void testSubBinary3() {
        BinaryCalculate_2 test = new BinaryCalculate_2();
        String result = test.subBinary("1111", "1111");
        assertEquals("0000", result);
    }

    /**
    * Test case number: 4
    * Test case values: "1111", "1110"
    * Expected output (Post-state): "0001"
    */
    @Test
    void testSubBinary4() {
        BinaryCalculate_2 test = new BinaryCalculate_2();
        String result = test.subBinary("1111", "1110");
        assertEquals("0001", result);
    }

    /**
    * Test case number: 5
    * Test case values: "1111", "1101"
    * Expected output (Post-state): "0010"
    */
    @Test
    void testSubBinary5() {
        BinaryCalculate_2 test = new BinaryCalculate_2();
        String result = test.subBinary("1111", "1101");
        assertEquals("0010", result);
    }

    /**
    * Test case number: 6
    * Test case values: "1111", "1011"
    * Expected output (Post-state): "0100"
    */
    @Test
    void testSubBinary6() {
        BinaryCalculate_2 test = new BinaryCalculate_2();
        String result = test.subBinary("1111", "1011");
        assertEquals("0100", result);
    }

    /**
    * Test case number: 7
    * Test case values: "1111", "0111"
    * Expected output (Post-state): "1000"
    */
    @Test
    void testSubBinary7() {
        BinaryCalculate_2 test = new BinaryCalculate_2();
        String result = test.subBinary("1111", "0111");
        assertEquals("1000", result);
    }

    /**
    * Test case number: 8
    * Test case values: "1111", "0011"
    * Expected output (Post-state): "1100"
    */
    @Test
    void testSubBinary8() {
        BinaryCalculate_2 test = new BinaryCalculate_2();
        String result = test.subBinary("1111", "0011");
        assertEquals("1100", result);
    }

    /**
    * Test case number: 9
    * Test case values: "1111", "0001"
    * Expected output (Post-state): "1110"
    */
    @Test
    void testSubBinary9() {
        BinaryCalculate_2 test = new BinaryCalculate_2();
        String result = test.subBinary("1111", "0001");
        assertEquals("1110", result);