// DateTools_3Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#parse(String, String)} method.
*/
class DateTools_3Test {

    @Test
    void testParse() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date.getYear(), 119);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
    }
}
