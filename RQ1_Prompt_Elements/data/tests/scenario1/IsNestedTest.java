package scenario1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsNestedTest {

    @Test
    public void test() throws Exception {

        assertEquals(true, scenario1.IsNested.isNested("[[]]"));
        assertEquals(false, scenario1.IsNested.isNested("[]]]]]]][[[[[]"));
        assertEquals(false, scenario1.IsNested.isNested("[][]"));
        assertEquals(false, scenario1.IsNested.isNested("[]"));
        assertEquals(true, scenario1.IsNested.isNested("[[[[]]]]"));
        assertEquals(false, scenario1.IsNested.isNested("[]]]]]]]]]]"));
        assertEquals(true, scenario1.IsNested.isNested("[][][[]]"));
        assertEquals(false, scenario1.IsNested.isNested("[[]"));
        assertEquals(false, scenario1.IsNested.isNested("[]]"));
        assertEquals(true, scenario1.IsNested.isNested("[[]][["));
        assertEquals(true, scenario1.IsNested.isNested("[[][]]"));
        assertEquals(false, scenario1.IsNested.isNested(""));
        assertEquals(false, scenario1.IsNested.isNested("[[[[[[[["));
        assertEquals(false, scenario1.IsNested.isNested("]]]]]]]]"));

    }

}