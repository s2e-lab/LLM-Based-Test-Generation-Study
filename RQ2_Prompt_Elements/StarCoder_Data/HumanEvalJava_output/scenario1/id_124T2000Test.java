// ValidDateTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ValidDate}.
* It contains ten unit test cases for the {@link ValidDate#validDate(String)} method.
*/
class ValidDateTest {

    @Test
    void testValidDate1() {
        String date = "2020-02-29";
        assertTrue(ValidDate.validDate(date));
    }

    @Test
    void testValidDate2() {
        String date = "2020-02-30";
        assertFalse(ValidDate.validDate(date));
    }

    @Test
    void testValidDate3() {
        String date = "2020-02-31";
        assertFalse(ValidDate.validDate(date));
    }

    @Test
    void testValidDate4() {
        String date = "2020-02-29";
        assertTrue(ValidDate.validDate(date));
    }

    @Test
    void testValidDate5() {
        String date = "2020-02-29";
        assertTrue(ValidDate.validDate(date));
    }

    @Test
    void testValidDate6() {
        String date = "2020-02-29";
        assertTrue(ValidDate.validDate(date));
    }

    @Test
    void testValidDate7() {
        String date = "2020-02-29";
        assertTrue(ValidDate.validDate(date));
    }

    @Test
    void testValidDate8() {
        String date = "2020-02-29";
        assertTrue(ValidDate.validDate(date));
    }

    @Test
    void testValidDate9() {
        String date = "2020-02-29";
        assertTrue(ValidDate.validDate(date));
    }

    @Test
    void testValidDate10() {
        String date = "2020-02-29";
        assertTrue(ValidDate.validDate(date));
    }
}
