// MaxFillTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxFill}.
* It contains ten unit test cases for the {@link MaxFill#maxFill(List, int)} method.
*/
class MaxFillTest {

    /**
    * Test case number: 1
    */
    @Test
    void test_case_1() {
        List<List<Integer>> grid = List.of(List.of(0, 0, 1, 0), List.of(0, 1, 0, 0), List.of(1, 1, 1, 1));
        int bucket_capacity = 1;
        int expected = 6;
        int output = MaxFill.maxFill(grid, bucket_capacity);
        assertEquals(expected, output);
    }

    /**
    * Test case number: 2
    */
    @Test
    void test_case_2() {
        List<List<Integer>> grid = List.of(List.of(0, 0, 1, 1), List.of(0, 0, 0, 0), List.of(1, 1, 1, 1), List.of(0, 1, 1, 1));
        int bucket_capacity = 2;
        int expected = 5;
        int output = MaxFill.maxFill(grid, bucket_capacity);
        assertEquals(expected, output);
    }

    /**
    * Test case number: 3
    */
    @Test
    void test_case_3() {
        List<List<Integer>> grid = List.of(List.of(0, 0, 0), List.of(0, 0, 0));
        int bucket_capacity = 5;
        int expected = 0;
        int output = MaxFill.maxFill(grid, bucket_capacity);
        assertEquals(expected, output);
    }

    /**
    * Test case number: 4
    */
    @Test
    void test_case_4() {
        List<List<Integer>> grid = List.of(List.of(1, 1, 1, 1), List.of(1, 1, 1, 1));
        int bucket_capacity = 2;
        int expected = 4;
        int output = MaxFill.maxFill(grid, bucket_capacity);
        assertEquals(expected, output);
    }

    /**
    * Test case number: 5
    */
    @Test
    void test_case_5() {
        List<List<Integer>> grid = List.of(List.of(1, 1, 1, 1), List.of(1, 1, 1, 1));
        int bucket_capacity = 9;
        int expected = 2;
        int output = MaxFill.maxFill(grid, bucket_capacity);
        assertEquals(expected, output);
    }
}