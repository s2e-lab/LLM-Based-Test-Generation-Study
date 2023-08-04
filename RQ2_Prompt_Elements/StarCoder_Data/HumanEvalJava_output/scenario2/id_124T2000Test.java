// ValidDateTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ValidDate}.
* It contains ten unit test cases for the {@link ValidDate#validDate(String)} method.
*/
class ValidDateTest {

    /**
     * Test case for the {@link ValidDate#validDate(String)} method.
     * It tests the case when the date string is empty.
     */
    @Test
    void testValidDateEmptyString() {
        String date = "";
        boolean expected = false;
        boolean actual = ValidDate.validDate(date);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ValidDate#validDate(String)} method.
     * It tests the case when the date string is not in the format: mm-dd-yyyy.
     */
    @Test
    void testValidDateWrongFormat() {
        String date = "12-12-2020";
        boolean expected = false;
        boolean actual = ValidDate.validDate(date);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ValidDate#validDate(String)} method.
     * It tests the case when the date string is not in the format: mm-dd-yyyy.
     */
    @Test
    void testValidDateWrongFormat2() {
        String date = "12-12-20";
        boolean expected = false;
        boolean actual = ValidDate.validDate(date);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ValidDate#validDate(String)} method.
     * It tests the case when the date string is not in the format: mm-dd-yyyy.
     */
    @Test
    void testValidDateWrongFormat3() {
        String date = "12-12-2020-12";
        boolean expected = false;
        boolean actual = ValidDate.validDate(date);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ValidDate#validDate(String)} method.
     * It tests the case when the date string is not in the format: mm-dd-yyyy.
     */
    @Test
    void testValidDateWrongFormat4() {
        String date = "12-12-2020-12-12";
        boolean expected = false;
        boolean actual = ValidDate.validDate(date);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ValidDate#validDate(String)} method.
     * It tests the case when the date string is not in the format: mm-dd-yyyy.
     */
    @Test
    void testValidDateWrongFormat5() {
        String date = "12-12-2020-12-12-12";
        boolean expected = false;
        boolean actual = ValidDate.validDate(date);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ValidDate#validDate(String)} method.
     * It tests the case when the date string is not in the format: mm-dd-yyyy.
     */
    @Test
    void testValidDateWrongFormat6() {
        String date = "12-12-2020-12-12-12-12";
        boolean expected = false;
        boolean actual = ValidDate.validDate(date);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ValidDate#validDate(String)} method.
     * It tests the case when the date string is not in the format: mm-dd-yyyy.
     */
    @Test
    void testValidDateWrongFormat7() {
        String date = "12-12-2020-12-12-12-12-12";
        boolean expected = false;
        boolean actual = ValidDate.validDate(date);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ValidDate#validDate(String)} method.
     * It tests the case when the date string is not in the format: mm-dd-yyyy.
     */
    @Test
    void testValidDateWrongFormat8() {
        String date = "12-12-2020-12-12-12-12-12-12";
        boolean expected = false;
        boolean actual = ValidDate.validDate(date);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ValidDate#validDate(String)} method.
     * It tests the case when the date string is not in the format: mm-dd-yyyy.
     */
    @Test
    void testValidDateWrongFormat9() {
        String date = "12-12-2020-12-12-12-12-12-12-12";
        boolean expected = false;
        boolean actual = ValidDate.validDate(date);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ValidDate#validDate(String)} method.
     * It tests the case when the date string is not in the format: mm-dd-yyyy.
     */
    @Test
    void testValidDateWrongFormat10() {
        String date = "12-12-2020-12-12-12-12-12-12-12-12";
        boolean expected = false;
        boolean actual = ValidDate.validDate(date);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ValidDate#validDate(String)} method.
     * It tests the case when the date string is not in the format: mm-dd-yyyy.
     */
    @Test
    void testValidDateWrongFormat11() {
        String date = "12-12-2020-12-12-12-12-12-12-12-12-12";
        boolean expected = false;
        boolean actual = ValidDate.validDate(date);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ValidDate#validDate(String)} method.
     * It tests the case when the date string is not in the format: mm-dd-yyyy.
     */
    @Test
    void testValidDateWrongFormat12() {
        String date = "12-12-2020-12-12-12-12-12-12-12-12-12-12";
        boolean expected = false;
        boolean actual = ValidDate.validDate(date);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ValidDate#validDate(String)} method.
     * It tests the case when the date string is not in the format: mm-dd-yyyy.
     */
    @Test
    void testValidDateWrongFormat13() {
        String date = "12-12-2020-12-12-12-12-12-12-12-12-12-12-12";
        boolean expected = false;
        boolean actual = ValidDate.validDate(date);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ValidDate#validDate(String)} method.
     * It tests the case when the date string is not in the format: mm-dd-yyyy.
     */
    @Test
    void testValidDateWrongFormat14() {
        String date = "12-12-2020-12-12-12-12-12-12-12-12-12-12-12-12";
        boolean expected = false;
        boolean actual = ValidDate.validDate(date);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ValidDate#validDate(String)} method.
     * It tests the case when the date string is not in the format: mm-dd-yyyy.
     */
    @Test
    void testValidDateWrongFormat15() {
        String date = "12-12-2020-12-12-12-12-12-12-12-12-12-12-12-12-12";
        boolean expected = false;
        boolean actual = ValidDate.validDate(date);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ValidDate#validDate(String)} method.
     * It tests the case when the date string is not in the format: mm-dd-yyyy.
     */
    @Test
    void testValidDateWrongFormat16() {
        String date = "12-12-2020-12-12-12-12-12-12-12-12-12-12-12-12-12-12";
        boolean expected = false;
        boolean actual = ValidDate.validDate(date);
        assertEquals(expected, actual);
    }

    /**
    