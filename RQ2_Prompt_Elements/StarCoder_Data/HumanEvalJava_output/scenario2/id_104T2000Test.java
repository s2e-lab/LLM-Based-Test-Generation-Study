// UniqueDigitsTest.java
package scenario2;

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
        x.add(12);
        x.add(123);
        x.add(1234);
        x.add(12345);
        x.add(123456);
        x.add(1234567);
        x.add(12345678);
        x.add(123456789);
        x.add(1234567890);
        x.add(12345678901);
        List<Object> expected = new ArrayList<Object>();
        expected.add(12345678901);
        expected.add(1234567890);
        expected.add(123456789);
        expected.add(12345678);
        expected.add(1234567);
        expected.add(123456);
        expected.add(12345);
        expected.add(1234);
        expected.add(123);
        expected.add(12);
        assertEquals(expected, UniqueDigits.uniqueDigits(x));
    }
}
