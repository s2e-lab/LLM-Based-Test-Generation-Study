// StartsOneEndsTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartsOneEnds}.
* It contains ten unit test cases for the {@link StartsOneEnds#startsOneEnds(int)} method.
*/
class StartsOneEndsTest {

    /**
     * Test case for {@link StartsOneEnds#startsOneEnds(int)}.
     */
    @Test
    void testStartsOneEnds() {
        assertEquals(1, StartsOneEnds.startsOneEnds(1));
        assertEquals(10, StartsOneEnds.startsOneEnds(2));
        assertEquals(100, StartsOneEnds.startsOneEnds(3));
        assertEquals(1000, StartsOneEnds.startsOneEnds(4));
        assertEquals(10000, StartsOneEnds.startsOneEnds(5));
        assertEquals(100000, StartsOneEnds.startsOneEnds(6));
        assertEquals(1000000, StartsOneEnds.startsOneEnds(7));
        assertEquals(10000000, StartsOneEnds.startsOneEnds(8));
        assertEquals(100000000, StartsOneEnds.startsOneEnds(9));
        assertEquals(1000000000, StartsOneEnds.startsOneEnds(10));
    }
}
