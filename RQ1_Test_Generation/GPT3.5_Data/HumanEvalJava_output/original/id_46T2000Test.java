Here's the source code for the test class:

```
class Fib4Test {

    @Test
    void testFib4_0() {
        assertEquals(0, Fib4.fib4(0));
    }

    @Test
    void testFib4_1() {
        assertEquals(0, Fib4.fib4(1));
    }

    @Test
    void testFib4_2() {
        assertEquals(2, Fib4.fib4(2));
    }

    @Test
    void testFib4_3() {
        assertEquals(0, Fib4.fib4(3));
    }

    @Test
    void testFib4_4() {
        assertEquals(2, Fib4.fib4(4));
    }

    @Test
    void testFib4_5() {
        assertEquals(4, Fib4.fib4(5));
    }

    @Test
    void testFib4_6() {
        assertEquals(8, Fib4.fib4(6));
    }

    @Test
    void testFib4_7() {
        assertEquals(14, Fib4.fib4(7));
    }

    @Test
    void testFib4_8() {
        assertEquals(28, Fib4.fib4(8));
    }

    @Test
    void testFib4_12() {
        assertEquals(386, Fib4.fib4(12));
    }
}
```

This test class contains ten unit test cases for the `fib4` method of the `Fib4` class. Each test case tests a different input value and expected output value. The `assertEquals` method is used to compare the actual output of the `fib4` method with the expected output. If the actual output matches the expected output, the test case passes. Otherwise, the test case fails.