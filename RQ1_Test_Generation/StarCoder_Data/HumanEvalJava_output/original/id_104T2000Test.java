// UniqueDigitsTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UniqueDigits}.
* It contains ten unit test cases for the {@link UniqueDigits#uniqueDigits(List)} method.
*/
class UniqueDigitsTest {

    /**
     * Test case for {@link UniqueDigits#uniqueDigits(List)}.
     */
    @Test
    void testUniqueDigits() {
        List<Integer> x = new ArrayList<Integer>();
        x.add(15);
        x.add(33);
        x.add(1422);
        x.add(1);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(15);
        expected.add(33);
        assertEquals(expected, UniqueDigits.uniqueDigits(x));

        x = new ArrayList<Integer>();
        x.add(152);
        x.add(323);
        x.add(1422);
        x.add(10);
        expected = new ArrayList<Object>();
        assertEquals(expected, UniqueDigits.uniqueDigits(x));

        x = new ArrayList<Integer>();
        x.add(12345);
        x.add(2033);
        x.add(111);
        x.add(151);
        expected = new ArrayList<Object>();
        expected.add(111);
        expected.add(151);
        assertEquals(expected, UniqueDigits.uniqueDigits(x));

        x = new ArrayList<Integer>();
        x.add(135);
        x.add(103);
        x.add(31);
        expected = new ArrayList<Object>();
        expected.add(31);
        expected.add(135);
        assertEquals(expected, UniqueDigits.uniqueDigits(x));
    }
}
