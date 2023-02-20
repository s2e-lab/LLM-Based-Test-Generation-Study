package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class IsNestedTest {
    @Test
    public void test1() {
        assertEquals(true, IsNested.isNested("[[]]"));
    }
    @Test
    public void test2() {
        assertEquals(false, IsNested.isNested("[]]]]]]][[[[[]"));
    }
    @Test
    public void test3() {
        assertEquals(false, IsNested.isNested("[][]"));
    }
    @Test
    public void test4() {
        assertEquals(false, IsNested.isNested("[]"));
    }
    @Test
    public void test5() {
        assertEquals(true, IsNested.isNested("[[[[]]]]"));
    }
    @Test
    public void test6() {
        assertEquals(false, IsNested.isNested("[]]]]]]]]]]"));
    }
    @Test
    public void test7() {
        assertEquals(true, IsNested.isNested("[][][[]]"));
    }
    @Test
    public void test8() {
        assertEquals(false, IsNested.isNested("[[]"));
    }
    @Test
    public void test9() {
        assertEquals(false, IsNested.isNested("[]]"));
    }
    @Test
    public void test10() {
        assertEquals(true, IsNested.isNested("[[]][["));
    }
    @Test
    public void test11() {
        assertEquals(true, IsNested.isNested("[[][]]"));
    }
    @Test
    public void test12() {
        assertEquals(false, IsNested.isNested(""));
    }
    @Test
    public void test13() {
        assertEquals(false, IsNested.isNested("[[[[[[["));
    }
    @Test
    public void test14() {
        assertEquals(false, IsNested.isNested("]]]]]]]]"));
    }
}