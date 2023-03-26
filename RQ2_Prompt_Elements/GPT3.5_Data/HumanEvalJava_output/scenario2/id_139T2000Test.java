Here's the code for the test class:

```
class SpecialFactorialTest {

    @Test
    void testSpecialFactorialWithZero() {
        assertEquals(1, SpecialFactorial.specialFactorial(0));
    }

    @Test
    void testSpecialFactorialWithOne() {
        assertEquals(1, SpecialFactorial.specialFactorial(1));
    }

    @Test
    void testSpecialFactorialWithTwo() {
        assertEquals(2, SpecialFactorial.specialFactorial(2));
    }

    @Test
    void testSpecialFactorialWithThree() {
        assertEquals(12, SpecialFactorial.specialFactorial(3));
    }

    @Test
    void testSpecialFactorialWithFour() {
        assertEquals(288, SpecialFactorial.specialFactorial(4));
    }

    @Test
    void testSpecialFactorialWithFive() {
        assertEquals(34560, SpecialFactorial.specialFactorial(5));
    }

    @Test
    void testSpecialFactorialWithSix() {
        assertEquals(24883200, SpecialFactorial.specialFactorial(6));
    }

    @Test
    void testSpecialFactorialWithSeven() {
        assertEquals(125411328000L, SpecialFactorial.specialFactorial(7));
    }

    @Test
    void testSpecialFactorialWithEight() {
        assertEquals(5230697472000L, SpecialFactorial.specialFactorial(8));
    }

    @Test
    void testSpecialFactorialWithNine() {
        assertEquals(20922789888000L, SpecialFactorial.specialFactorial(9));
    }
}
```

This test class contains ten test cases that cover different input values for the `specialFactorial` method. Each test case uses the `assertEquals` method to compare the expected result with the actual result returned by the method.