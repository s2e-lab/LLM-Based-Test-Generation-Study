package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsSortedTest {

    @Test
    public void test() throws Exception {

        assertEquals(true, scenario1.IsSorted.isSorted(Arrays.asList(5)));
        assertEquals(true, scenario1.IsSorted.isSorted(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(false, scenario1.IsSorted.isSorted(Arrays.asList(1, 3, 2, 4, 5)));
        assertEquals(true, scenario1.IsSorted.isSorted(Arrays.asList(1, 2, 3, 4, 5, 6)));
        assertEquals(true, scenario1.IsSorted.isSorted(Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
        assertEquals(false, scenario1.IsSorted.isSorted(Arrays.asList(1, 3, 2, 4, 5, 6, 7)));
        assertEquals(true, scenario1.IsSorted.isSorted(Arrays.asList()));
        assertEquals(true, scenario1.IsSorted.isSorted(Arrays.asList(1)));
        assertEquals(false, scenario1.IsSorted.isSorted(Arrays.asList(3, 2, 1)));
        assertEquals(false, scenario1.IsSorted.isSorted(Arrays.asList(1, 2, 2, 2, 3, 4)));
        assertEquals(false, scenario1.IsSorted.isSorted(Arrays.asList(1, 2, 3, 3, 3, 4)));
        assertEquals(true, scenario1.IsSorted.isSorted(Arrays.asList(1, 2, 2, 3, 3, 4)));
        assertEquals(true, scenario1.IsSorted.isSorted(Arrays.asList(1, 2, 3, 4)));

    }

}