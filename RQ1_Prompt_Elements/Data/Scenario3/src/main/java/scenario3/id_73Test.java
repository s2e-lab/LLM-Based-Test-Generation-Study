package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class SmallestChangeTest {
    @Test
    void testSmallestChange() {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(4);
        arr.add(7);
        arr.add(9);
        arr.add(6);
        assertEquals(4, SmallestChange.smallestChange(arr));
        arr.clear();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(2);
        assertEquals(1, SmallestChange.smallestChange(arr));
        arr.clear();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        assertEquals(0, SmallestChange.smallestChange(arr));
        arr.clear();
        arr.add(3);
        arr.add(1);
        arr.add(1);
        arr.add(3);
        assertEquals(0, SmallestChange.smallestChange(arr));
        arr.clear();
        arr.add(1);
        assertEquals(0, SmallestChange.smallestChange(arr));
        arr.clear();
        arr.add(0);
        arr.add(1);
        assertEquals(1, SmallestChange.smallestChange(arr));
        arr.clear();
        arr.add(1);
        arr.add(4);
        arr.add(2);
        assertEquals(1, SmallestChange.smallestChange(arr));
        arr.clear();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(2);
        assertEquals(1, SmallestChange.smallestChange(arr));
        arr.clear();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        assertEquals(9, SmallestChange.smallestChange(arr));
        arr.clear();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        arr.add(16);
        arr.add(17);
        arr.add(18);
        arr.add(19);
        arr.add(20);
        assertEquals(19, SmallestChange.smallestChange(arr));
    }
}