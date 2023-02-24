package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class AddElementsTest {
    @Test
    void testAddElements() {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(-2);
        arr.add(-3);
        arr.add(41);
        arr.add(57);
        arr.add(76);
        arr.add(87);
        arr.add(88);
        arr.add(99);
        assertEquals(-4, AddElements.addElements(arr, 3));

        arr.clear();
        arr.add(111);
        arr.add(121);
        arr.add(3);
        arr.add(4000);
        arr.add(5);
        arr.add(6);
        assertEquals(0, AddElements.addElements(arr, 2));

        arr.clear();
        arr.add(11);
        arr.add(21);
        arr.add(3);
        arr.add(90);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        assertEquals(125, AddElements.addElements(arr, 4));

        arr.clear();
        arr.add(111);
        arr.add(21);
        arr.add(3);
        arr.add(4000);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        assertEquals(24, AddElements.addElements(arr, 4));

        arr.clear();
        arr.add(1);
        assertEquals(1, AddElements.addElements(arr, 1));
    }
}