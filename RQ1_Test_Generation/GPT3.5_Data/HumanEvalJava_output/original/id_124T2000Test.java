package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ValidDate}.
* It contains ten unit test cases for the {@link ValidDate#validDate(String)} method.
*/
class ValidDateTest {

    @Test
    void testValidDate1() {
        assertTrue(ValidDate.validDate("03-11-2000"));
    }

    @Test
    void testValidDate2() {
        assertFalse(ValidDate.validDate("15-01-2012"));
    }

    @Test
    void testValidDate3() {
        assertFalse(ValidDate.validDate("04-0-2040"));
    }

    @Test
    void testValidDate4() {
        assertTrue(ValidDate.validDate("06-04-2020"));
    }

    @Test
    void testValidDate5() {
        assertTrue(ValidDate.validDate("01-01-2007"));
    }

    @Test
    void testValidDate6() {
        assertFalse(ValidDate.validDate("03-32-2011"));
    }

    @Test
    void testValidDate7() {
        assertFalse(ValidDate.validDate(""));
    }

    @Test
    void testValidDate8() {
        assertFalse(ValidDate.validDate("04-31-3000"));
    }

    @Test
    void testValidDate9() {
        assertTrue(ValidDate.validDate("06-06-2005"));
    }

    @Test
    void testValidDate10() {
        assertFalse(ValidDate.validDate("21-31-2000"));
    }

    @Test
    void testValidDate11() {
        assertTrue(ValidDate.validDate("04-12-2003"));
    }

    @Test
    void testValidDate12() {
        assertFalse(ValidDate.validDate("04122003"));
    }

    @Test
    void testValidDate13() {
        assertFalse(ValidDate.validDate("20030412"));
    }

    @Test
    void testValidDate14() {
        assertFalse(ValidDate.validDate("2003-04"));
    }

    @Test
    void testValidDate15() {
        assertFalse(ValidDate.validDate("2003-04-12"));
    }

    @Test
    void testValidDate16() {
        assertFalse(ValidDate.validDate("04-2003"));
    }
}