// Add1Test.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add1}.
* It contains ten unit test cases for the {@link Add1#add(List)} method.
*/
class Add1Test {

    /**
     * Test case for {@link Add1#add(List)}.
     */
    @Test
    void testAdd() {
        List<Integer> lst1 = List.of(4, 2, 6, 7);
        assertEquals(2, Add1.add(lst1));

        List<Integer> lst2 = List.of(4, 88);
        assertEquals(88, Add1.add(lst2));

        List<Integer> lst3 = List.of(4, 5, 6, 7, 2, 122);
        assertEquals(122, Add1.add(lst3));

        List<Integer> lst4 = List.of(4, 0, 6, 7);
        assertEquals(0, Add1.add(lst4));

        List<Integer> lst5 = List.of(4, 4, 6, 8);
        assertEquals(12, Add1.add(lst5));
    }
}
