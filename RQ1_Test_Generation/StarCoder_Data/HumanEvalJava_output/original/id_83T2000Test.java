// StartsOneEndsTest.java
package original;


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
        assertEquals(18, StartsOneEnds.startsOneEnds(2));
        assertEquals(180, StartsOneEnds.startsOneEnds(3));
        assertEquals(1800, StartsOneEnds.startsOneEnds(4));
        assertEquals(18000, StartsOneEnds.startsOneEnds(5));
    }
}
