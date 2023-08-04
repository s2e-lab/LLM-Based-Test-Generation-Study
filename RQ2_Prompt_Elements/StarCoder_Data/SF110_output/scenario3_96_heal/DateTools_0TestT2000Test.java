// DateTools_0Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#format(Date)} method.
*/
class DateTools_0Test {

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_2 = "yyyy-MM-dd";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_3 = "yyyy-MM-dd HH:mm:ss.SSS";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_4 = "yyyy-MM-dd HH:mm:ss.SSS Z";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_5 = "yyyy-MM-dd HH:mm:ss.SSS z";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_6 = "yyyy-MM-dd HH:mm:ss.SSS ZZ";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_7 = "yyyy-MM-dd HH:mm:ss.SSS zzz";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_8 = "yyyy-MM-dd HH:mm:ss.SSS ZZZ";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_9 = "yyyy-MM-dd HH:mm:ss.SSS zzzz";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_10 = "yyyy-MM-dd HH:mm:ss.SSS ZZZZ";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_11 = "yyyy-MM-dd HH:mm:ss.SSS zzzzz";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_12 = "yyyy-MM-dd HH:mm:ss.SSS ZZZZZ";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_13 = "yyyy-MM-dd HH:mm:ss.SSS zzzzzz";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_14 = "yyyy-MM-dd HH:mm:ss.SSS ZZZZZZ";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_15 = "yyyy-MM-dd HH:mm:ss.SSS zzzzzzz";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_16 = "yyyy-MM-dd HH:mm:ss.SSS ZZZZZZZ";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_17 = "yyyy-MM-dd HH:mm:ss.SSS zzzzzzzz";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_18 = "yyyy-MM-dd HH:mm:ss.SSS ZZZZZZZZ";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_19 = "yyyy-MM-dd HH:mm:ss.SSS zzzzzzzzz";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_20 = "yyyy-MM-dd HH:mm:ss.SSS ZZZZZZZZZ";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_21 = "yyyy-MM-dd HH:mm:ss.SSS zzzzzzzzzz";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_22 = "yyyy-MM-dd HH:mm:ss.SSS ZZZZZZZZZZ";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_23 = "yyyy-MM-dd HH:mm:ss.SSS zzzzzzzzzzz";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_24 = "yyyy-MM-dd HH:mm:ss.SSS ZZZZZZZZZZZ";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_25 = "yyyy-MM-dd HH:mm:ss.SSS zzzzzzzzzzzz";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_26 = "yyyy-MM-dd HH:mm:ss.SSS ZZZZZZZZZZZZ";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_27 = "yyyy-MM-dd HH:mm:ss.SSS zzzzzzzzzzzzz";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_28 = "yyyy-MM-dd HH:mm:ss.SSS ZZZZZZZZZZZZZ";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_29 = "yyyy-MM-dd HH:mm:ss.SSS zzzzzzzzzzzzzz";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_30 = "yyyy-MM-dd HH:mm:ss.SSS ZZZZZZZZZZZZZZ";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_31 = "yyyy-MM-dd HH:mm:ss.SSS zzzzzzzzzzzzzzz";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_32 = "yyyy-MM-dd HH:mm:ss.SSS ZZZZZZZZZZZZZZZ";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_33 = "yyyy-MM-dd HH:mm:ss.SSS zzzzzzzzzzzzzzzz";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_34 = "yyyy-MM-dd HH:mm:ss.SSS ZZZZZZZZZZZZZZZZ";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_35 = "yyyy-MM-dd HH:mm:ss.SSS zzzzzzzzzzzzzzzzz";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_36 = "yyyy-MM-dd HH:mm:ss.SSS ZZZZZZZZZZZZZZZZZ";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_37 = "yyyy-MM-dd HH:mm:ss.SSS zzzzzzzzzzzzzzzzzz";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_38 = "yyyy-MM-dd HH:mm:ss.SSS ZZZZZZZZZZZZZZZZZZ";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_39 = "yyyy-MM-dd HH:mm:ss.SSS zzzzzzzzzzzzzzzzzzz";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_40 = "yyyy-MM-dd HH:mm:ss.SSS ZZZZZZZZZZZZZZZZZZZ";

    /**
     * The default date format used in the unit tests.
     */
    private static final String DEFAULT_DATE_FORMAT_41 = "yyyy-MM-dd HH:mm:ss.