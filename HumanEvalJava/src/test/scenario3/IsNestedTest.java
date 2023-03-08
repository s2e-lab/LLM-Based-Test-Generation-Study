package scenario3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsNestedTest {

    @Test
    public void test() throws Exception {

        assertEquals(true, scenario3.IsNested.isNested("[[]]"));
        assertEquals(false, scenario3.IsNested.isNested("[]]]]]]][[[[[]"));
        assertEquals(false, scenario3.IsNested.isNested("[][]"));
        assertEquals(false, scenario3.IsNested.isNested("[]"));
        assertEquals(true, scenario3.IsNested.isNested("[[[[]]]]"));
        assertEquals(false, scenario3.IsNested.isNested("[]]]]]]]]]]"));
        assertEquals(true, scenario3.IsNested.isNested("[][][[]]"));
        assertEquals(false, scenario3.IsNested.isNested("[[]"));
        assertEquals(false, scenario3.IsNested.isNested("[]]"));
        assertEquals(true, scenario3.IsNested.isNested("[[]][["));
        assertEquals(true, scenario3.IsNested.isNested("[[][]]"));
        assertEquals(false, scenario3.IsNested.isNested(""));
        assertEquals(false, scenario3.IsNested.isNested("[[[[[[[["));
        assertEquals(false, scenario3.IsNested.isNested("]]]]]]]]"));

    }

}