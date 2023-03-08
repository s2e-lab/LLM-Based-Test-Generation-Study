package scenario2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsNestedTest {

    @Test
    public void test() throws Exception {

        assertEquals(true, scenario2.IsNested.isNested("[[]]"));
        assertEquals(false, scenario2.IsNested.isNested("[]]]]]]][[[[[]"));
        assertEquals(false, scenario2.IsNested.isNested("[][]"));
        assertEquals(false, scenario2.IsNested.isNested("[]"));
        assertEquals(true, scenario2.IsNested.isNested("[[[[]]]]"));
        assertEquals(false, scenario2.IsNested.isNested("[]]]]]]]]]]"));
        assertEquals(true, scenario2.IsNested.isNested("[][][[]]"));
        assertEquals(false, scenario2.IsNested.isNested("[[]"));
        assertEquals(false, scenario2.IsNested.isNested("[]]"));
        assertEquals(true, scenario2.IsNested.isNested("[[]][["));
        assertEquals(true, scenario2.IsNested.isNested("[[][]]"));
        assertEquals(false, scenario2.IsNested.isNested(""));
        assertEquals(false, scenario2.IsNested.isNested("[[[[[[[["));
        assertEquals(false, scenario2.IsNested.isNested("]]]]]]]]"));

    }

}