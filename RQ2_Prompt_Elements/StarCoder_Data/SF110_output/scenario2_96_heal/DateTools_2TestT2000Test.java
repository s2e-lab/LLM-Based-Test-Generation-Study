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

    /**
     * Test method for {@link DateTools#parse(String)}.
     */
    @Test
    void testParse() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2018-01-01");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000Z");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+0000");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000-0000");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000-00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000-00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00:00:00.000+00:00");
        assertEquals(date.getYear(), 118);
        assertEquals(date.getMonth(), 0);
        assertEquals(date.getDate(), 1);
        date = dateTools.parse("2018-01-01 00: