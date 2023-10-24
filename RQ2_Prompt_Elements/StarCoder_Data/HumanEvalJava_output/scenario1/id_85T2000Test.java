// Add1Test.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add1}.
* It contains ten unit test cases for the {@link Add1#add(List)} method.
*/
class Add1Test {

    @Test
    void testAdd1() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(30, Add1.add(lst));
    }

    @Test
    void testAdd2() {
        List<Integer> lst = List.of(1, 3, 5, 7, 9);
        assertEquals(0, Add1.add(lst));
    }

    @Test
    void testAdd3() {
        List<Integer> lst = List.of(2, 4, 6, 8, 10);
        assertEquals(30, Add1.add(lst));
    }

    @Test
    void testAdd4() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(30, Add1.add(lst));
    }

    @Test
    void testAdd5() {
        List<Integer> lst = List.of(1, 3, 5, 7, 9);
        assertEquals(0, Add1.add(lst));
    }

    @Test
    void testAdd6() {
        List<Integer> lst = List.of(2, 4, 6, 8, 10);
        assertEquals(30, Add1.add(lst));
    }

    @Test
    void testAdd7() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(30, Add1.add(lst));
    }

    @Test
    void testAdd8() {
        List<Integer> lst = List.of(1, 3, 5, 7, 9);
        assertEquals(0, Add1.add(lst));
    }

    @Test
    void testAdd9() {
        List<Integer> lst = List.of(2, 4, 6, 8, 10);
        assertEquals(30, Add1.add(lst));
    }

    @Test
    void testAdd10() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(30, Add1.add(lst));
    }
}
