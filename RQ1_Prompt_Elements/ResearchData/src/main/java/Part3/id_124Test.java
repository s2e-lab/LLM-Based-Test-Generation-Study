package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class ValidDateTest {
    @Test
    public void testValidDate() {
        assertEquals(true, ValidDate.validDate("03-11-2000"));
        assertEquals(false, ValidDate.validDate("15-01-2012"));
        assertEquals(false, ValidDate.validDate("04-0-2040"));
        assertEquals(true, ValidDate.validDate("06-04-2020"));
        assertEquals(true, ValidDate.validDate("01-01-2007"));
        assertEquals(false, ValidDate.validDate("03-32-2011"));
        assertEquals(false, ValidDate.validDate(""));
        assertEquals(false, ValidDate.validDate("04-31-3000"));
        assertEquals(true, ValidDate.validDate("06-06-2005"));
        assertEquals(false, ValidDate.validDate("21-31-2000"));
        assertEquals(true, ValidDate.validDate("04-12-2003"));
        assertEquals(false, ValidDate.validDate("04122003"));
        assertEquals(false, ValidDate.validDate("20030412"));
        assertEquals(false, ValidDate.validDate("2003-04"));
        assertEquals(false, ValidDate.validDate("2003-04-12"));
        assertEquals(false, ValidDate.validDate("04-2003"));
    }
}