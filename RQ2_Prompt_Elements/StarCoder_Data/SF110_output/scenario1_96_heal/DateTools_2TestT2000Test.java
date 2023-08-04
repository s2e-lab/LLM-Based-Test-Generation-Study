// DateTools_2Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#parse(String)} method.
*/
class DateTools_2Test {

    @Test
    void testParse() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(2019, date.getYear() + 1900);
        assertEquals(0, date.getMonth());
        assertEquals(1, date.getDate());
    }
}
