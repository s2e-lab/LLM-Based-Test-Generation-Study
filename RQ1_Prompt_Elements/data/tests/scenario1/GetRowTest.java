package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetRowTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(), scenario1.GetRow.getRow(Arrays.asList(), 1));
        assertEquals(Arrays.asList(), scenario1.GetRow.getRow(Arrays.asList(Arrays.asList(1)), 2));
        assertEquals(Arrays.asList(Arrays.asList(2, 2)), scenario1.GetRow.getRow(Arrays.asList(Arrays.asList(), Arrays.asList(1), Arrays.asList(1, 2, 3)), 3));

    }

}