Here's the code for the DigitsTest class:

```
class DigitsTest {
    
    @Test
    void testAllEvenDigits() {
        assertEquals(0, Digits.digits(2468));
    }
    
    @Test
    void testOneOddDigit() {
        assertEquals(3, Digits.digits(1234));
    }
    
    @Test
    void testMultipleOddDigits() {
        assertEquals(15, Digits.digits(13579));
    }
    
    @Test
    void testZero() {
        assertEquals(0, Digits.digits(0));
    }
    
    @Test
    void testLargeNumber() {
        assertEquals(45, Digits.digits(135797531));
    }
    
    @Test
    void testNegativeNumber() {
        assertEquals(15, Digits.digits(-13579));
    }
    
    @Test
    void testSingleDigit() {
        assertEquals(1, Digits.digits(1));
    }
    
    @Test
    void testTwoDigits() {
        assertEquals(1, Digits.digits(10));
    }
    
    @Test
    void testThreeDigits() {
        assertEquals(5, Digits.digits(105));
    }
    
    @Test
    void testFourDigits() {
        assertEquals(15, Digits.digits(1357));
    }
}
```

This test class contains ten unit test cases for the `Digits.digits(int)` method. Each test case tests a different scenario, such as all even digits, one odd digit, multiple odd digits, zero, a large number, a negative number, a single digit, two digits, three digits, and four digits. The `assertEquals` method is used to compare the expected result with the actual result returned by the `Digits.digits(int)` method.