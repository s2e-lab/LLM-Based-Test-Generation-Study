// ValidDateTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ValidDate}.
 * It contains ten unit test cases for the {@link ValidDate#validDate(String)} method.
 */
class ValidDateTest {

    @Test
    void testValidDateWithEmptyString() {
        assertFalse(ValidDate.validDate(""));
    }

    @Test
    void testValidDateWithInvalidFormat() {
        assertFalse(ValidDate.validDate("2021/01/01"));
    }

    @Test
    void testValidDateWithInvalidMonth() {
        assertFalse(ValidDate.validDate("13-01-2021"));
    }

    @Test
    void testValidDateWithInvalidDay() {
        assertFalse(ValidDate.validDate("02-31-2021"));
    }

    @Test
    void testValidDateWithInvalidDayForFebruary() {
        assertFalse(ValidDate.validDate("02-30-2021"));
    }

    @Test
    void testValidDateWithInvalidDayForApril() {
        assertFalse(ValidDate.validDate("04-31-2021"));
    }

    @Test
    void testValidDateWithInvalidDayForJune() {
        assertFalse(ValidDate.validDate("06-31-2021"));
    }

    @Test
    void testValidDateWithInvalidDayForSeptember() {
        assertFalse(ValidDate.validDate("09-31-2021"));
    }

    @Test
    void testValidDateWithInvalidDayForNovember() {
        assertFalse(ValidDate.validDate("11-31-2021"));
    }

    @Test
    void testValidDateWithValidDate() {
        assertTrue(ValidDate.validDate("01-01-2021"));
    }
}