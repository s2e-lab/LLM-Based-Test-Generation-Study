package scenario3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidDateTest {

    @Test
    public void test() throws Exception {

        assertEquals(true, scenario3.ValidDate.validDate("03-11-2000"));
        assertEquals(false, scenario3.ValidDate.validDate("15-01-2012"));
        assertEquals(false, scenario3.ValidDate.validDate("04-0-2040"));
        assertEquals(true, scenario3.ValidDate.validDate("06-04-2020"));
        assertEquals(true, scenario3.ValidDate.validDate("01-01-2007"));
        assertEquals(false, scenario3.ValidDate.validDate("03-32-2011"));
        assertEquals(false, scenario3.ValidDate.validDate(""));
        assertEquals(false, scenario3.ValidDate.validDate("04-31-3000"));
        assertEquals(true, scenario3.ValidDate.validDate("06-06-2005"));
        assertEquals(false, scenario3.ValidDate.validDate("21-31-2000"));
        assertEquals(true, scenario3.ValidDate.validDate("04-12-2003"));
        assertEquals(false, scenario3.ValidDate.validDate("04122003"));
        assertEquals(false, scenario3.ValidDate.validDate("20030412"));
        assertEquals(false, scenario3.ValidDate.validDate("2003-04"));
        assertEquals(false, scenario3.ValidDate.validDate("2003-04-12"));
        assertEquals(false, scenario3.ValidDate.validDate("04-2003"));

    }

}