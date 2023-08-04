// Add1Test.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add1}.
* It contains ten unit test cases for the {@link Add1#add(List)} method.
*/
class Add1Test {

    /**
     * Test case for the {@link Add1#add(List)} method.
     */
    @Test
    void testAdd() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(10, Add1.add(lst));
    }

    /**
     * Test case for the {@link Add1#add(List)} method.
     */
    @Test
    void testAdd2() {
        List<Integer> lst = List.of(1, 3, 5, 7, 9);
        assertEquals(0, Add1.add(lst));
    }

    /**
     * Test case for the {@link Add1#add(List)} method.
     */
    @Test
    void testAdd3() {
        List<Integer> lst = List.of(2, 4, 6, 8, 10);
        assertEquals(20, Add1.add(lst));
    }

    /**
     * Test case for the {@link Add1#add(List)} method.
     */
    @Test
    void testAdd4() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(11, Add1.add(lst));
    }

    /**
     * Test case for the {@link Add1#add(List)} method.
     */
    @Test
    void testAdd5() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertEquals(12, Add1.add(lst));
    }

    /**
     * Test case for the {@link Add1#add(List)} method.
     */
    @Test
    void testAdd6() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertEquals(13, Add1.add(lst));
    }

    /**
     * Test case for the {@link Add1#add(List)} method.
     */
    @Test
    void testAdd7() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertEquals(14, Add1.add(lst));
    }

    /**
     * Test case for the {@link Add1#add(List)} method.
     */
    @Test
    void testAdd8() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertEquals(15, Add1.add(lst));
    }

    /**
     * Test case for the {@link Add1#add(List)} method.
     */
    @Test
    void testAdd9() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        assertEquals(16, Add1.add(lst));
    }

    /**
     * Test case for the {@link Add1#add(List)} method.
     */
    @Test
    void testAdd10() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        assertEquals(17, Add1.add(lst));
    }
}
