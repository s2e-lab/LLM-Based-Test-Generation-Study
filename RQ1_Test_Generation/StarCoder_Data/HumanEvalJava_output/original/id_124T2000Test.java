// ValidDateTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ValidDate}.
* It contains ten unit test cases for the {@link ValidDate#validDate(String)} method.
*/
class ValidDateTest {

    /**
    * Test case for {@link ValidDate#validDate(String)}
    * when the date string is not empty.
    */
    @Test
    void testValidDate1() {
        assertTrue(ValidDate.validDate("03-11-2000"));
    }

    /**
    * Test case for {@link ValidDate#validDate(String)}
    * when the number of days is not less than 1 or higher than 31 days for months 1,3,5,7,8,10,12.
    */
    @Test
    void testValidDate2() {
        assertFalse(ValidDate.validDate("15-01-2012"));
    }

    /**
    * Test case for {@link ValidDate#validDate(String)}
    * when the number of days is not less than 1 or higher than 30 days for months 4,6,9,11.
    */
    @Test
    void testValidDate3() {
        assertFalse(ValidDate.validDate("04-0-2040"));
    }

    /**
    * Test case for {@link ValidDate#validDate(String)}
    * when the number of days is not less than 1 or higher than 29 for the month 2.
    */
    @Test
    void testValidDate4() {
        assertTrue(ValidDate.validDate("06-04-2020"));
    }

    /**
    * Test case for {@link ValidDate#validDate(String)}
    * when the months should not be less than 1 or higher than 12.
    */
    @Test
    void testValidDate5() {
        assertFalse(ValidDate.validDate("06/04/2020"));
    }

    /**
    * Test case for {@link ValidDate#validDate(String)}
    * when the date should be in the format: mm-dd-yyyy.
    */
    @Test
    void testValidDate6() {
        assertTrue(ValidDate.validDate("01-01-2007"));
    }

    /**
    * Test case for {@link ValidDate#validDate(String)}
    * when the date is not empty.
    */
    @Test
    void testValidDate7() {
        assertFalse(ValidDate.validDate("03-32-2011"));
    }

    /**
    * Test case for {@link ValidDate#validDate(String)}
    * when the date is empty.
    */
    @Test
    void testValidDate8() {
        assertFalse(ValidDate.validDate(""));
    }

    /**
    * Test case for {@link ValidDate#validDate(String)}
    * when the date is not empty.
    */
    @Test
    void testValidDate9() {
        assertFalse(ValidDate.validDate("04-31-3000"));
    }

    /**
    * Test case for {@link ValidDate#validDate(String)}
    * when the date is not empty.
    */
    @Test
    void testValidDate10() {
        assertTrue(ValidDate.validDate("06-06-2005"));
    }
}
