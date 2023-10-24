// Queue_1Test.java
package bible.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Queue}.
* It contains ten unit test cases for the {@link Queue#maxCapacityExceeded()} method.
*/
class Queue_1Test {

    /**
    * Test case for {@link Queue#maxCapacityExceeded()} method.
    * It tests the method with a queue with a maximum capacity of 10.
    */
    @Test
    void testMaxCapacityExceeded() {
        Queue queue = new Queue(10);
        queue.add(new Node("1"));
        queue.add(new Node("2"));
        queue.add(new Node("3"));
        queue.add(new Node("4"));
        queue.add(new Node("5"));
        queue.add(new Node("6"));
        queue.add(new Node("7"));
        queue.add(new Node("8"));
        queue.add(new Node("9"));
        queue.add(new Node("10"));
        queue.add(new Node("11"));
        assertTrue(queue.maxCapacityExceeded());
    }

    /**
    * Test case for {@link Queue#maxCapacityExceeded()} method.
    * It tests the method with a queue with a maximum capacity of 10.
    */
    @Test
    void testMaxCapacityExceeded2() {
        Queue queue = new Queue(10);
        queue.add(new Node("1"));
        queue.add(new Node("2"));
        queue.add(new Node("3"));
        queue.add(new Node("4"));
        queue.add(new Node("5"));
        queue.add(new Node("6"));
        queue.add(new Node("7"));
        queue.add(new Node("8"));
        queue.add(new Node("9"));
        queue.add(new Node("10"));
        assertFalse(queue.maxCapacityExceeded());
    }

    /**
    * Test case for {@link Queue#maxCapacityExceeded()} method.
    * It tests the method with a queue with a maximum capacity of 10.
    */
    @Test
    void testMaxCapacityExceeded3() {
        Queue queue = new Queue(10);
        queue.add(new Node("1"));
        queue.add(new Node("2"));
        queue.add(new Node("3"));
        queue.add(new Node("4"));
        queue.add(new Node("5"));
        queue.add(new Node("6"));
        queue.add(new Node("7"));
        queue.add(new Node("8"));
        queue.add(new Node("9"));
        queue.add(new Node("10"));
        queue.add(new Node("11"));
        queue.add(new Node("12"));
        queue.add(new Node("13"));
        queue.add(new Node("14"));
        queue.add(new Node("15"));
        queue.add(new Node("16"));
        queue.add(new Node("17"));
        queue.add(new Node("18"));
        queue.add(new Node("19"));
        queue.add(new Node("20"));
        queue.add(new Node("21"));
        queue.add(new Node("22"));
        queue.add(new Node("23"));
        queue.add(new Node("24"));
        queue.add(new Node("25"));
        queue.add(new Node("26"));
        queue.add(new Node("27"));
        queue.add(new Node("28"));
        queue.add(new Node("29"));
        queue.add(new Node("30"));
        queue.add(new Node("31"));
        queue.add(new Node("32"));
        queue.add(new Node("33"));
        queue.add(new Node("34"));
        queue.add(new Node("35"));
        queue.add(new Node("36"));
        queue.add(new Node("37"));
        queue.add(new Node("38"));
        queue.add(new Node("39"));
        queue.add(new Node("40"));
        queue.add(new Node("41"));
        queue.add(new Node("42"));
        queue.add(new Node("43"));
        queue.add(new Node("44"));
        queue.add(new Node("45"));
        queue.add(new Node("46"));
        queue.add(new Node("47"));
        queue.add(new Node("48"));
        queue.add(new Node("49"));
        queue.add(new Node("50"));
        queue.add(new Node("51"));
        queue.add(new Node("52"));
        queue.add(new Node("53"));
        queue.add(new Node("54"));
        queue.add(new Node("55"));
        queue.add(new Node("56"));
        queue.add(new Node("57"));
        queue.add(new Node("58"));
        queue.add(new Node("59"));
        queue.add(new Node("60"));
        queue.add(new Node("61"));
        queue.add(new Node("62"));
        queue.add(new Node("63"));
        queue.add(new Node("64"));
        queue.add(new Node("65"));
        queue.add(new Node("66"));
        queue.add(new Node("67"));
        queue.add(new Node("68"));
        queue.add(new Node("69"));
        queue.add(new Node("70"));
        queue.add(new Node("71"));
        queue.add(new Node("72"));
        queue.add(new Node("73"));
        queue.add(new Node("74"));
        queue.add(new Node("75"));
        queue.add(new Node("76"));
        queue.add(new Node("77"));
        queue.add(new Node("78"));
        queue.add(new Node("79"));
        queue.add(new Node("80"));
        queue.add(new Node("81"));
        queue.add(new Node("82"));
        queue.add(new Node("83"));
        queue.add(new Node("84"));
        queue.add(new Node("85"));
        queue.add(new Node("86"));
        queue.add(new Node("87"));
        queue.add(new Node("88"));
        queue.add(new Node("89"));
        queue.add(new Node("90"));
        queue.add(new Node("91"));
        queue.add(new Node("92"));
        queue.add(new Node("93"));
        queue.add(new Node("94"));
        queue.add(new Node("95"));
        queue.add(new Node("96"));
        queue.add(new Node("97"));
        queue.add(new Node("98"));
        queue.add(new Node("99"));
        queue.add(new Node("100"));
        queue.add(new Node("101"));
        queue.add(new Node("102"));
        queue.add(new Node("103"));
        queue.add(new Node("104"));
        queue.add(new Node("105"));
        queue.add(new Node("106"));
        queue.add(new Node("107"));
        queue.add(new Node("108"));
        queue.add(new Node("109"));
        queue.add(new Node("110"));
        queue.add(new Node("111"));
        queue.add(new Node("112"));
        queue.add(new Node("113"));
        queue.add(new Node("114"));
        queue.add(new Node("115"));
        queue.add(new Node("116"));
        queue.add(new Node("117"));
        queue.add(new Node("118"));
        queue.add(new Node("119"));
        queue.add(new Node("120"));
        queue.add(new Node("121"));
        queue.add(new Node("122"));
        queue.add(new Node("123"));
        queue.add(new Node("124"));
        queue.add(new Node("125"));
        queue.add(new Node("126"));
        queue.add(new Node("127"));
        queue.add(new Node("128"));
        queue.add(new Node("129"));
        queue.add(new Node("130"));
        queue.add(new Node("131"));
        queue.add(new Node("132"));
        queue.add(new Node("133"));
        queue.add(new Node("134"));
        queue.add(new Node("135"));
        queue.add(new Node("136"));
        queue.add(new Node("137"));
        queue.add(new Node("138"));
        queue.add(new Node("139"));
        queue.add(new Node("140"));
        queue.add(new Node("141"));
        queue.add(