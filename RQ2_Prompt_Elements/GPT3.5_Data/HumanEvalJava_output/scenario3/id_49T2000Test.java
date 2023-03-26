Here's an implementation of the `modp` method in the `Modp` class:

```java
class Modp {

    /**
     * Return 2^n modulo p (be aware of numerics).
     * >>> modp(3, 5)
     * 3
     * >>> modp(1101, 101)
     * 2
     * >>> modp(0, 101)
     * 1
     * >>> modp(3, 11)
     * 8
     * >>> modp(100, 101)
     * 1
     * > modp(3, 5)
     * 3
     * > modp(1101, 101)
     * 2
     * > modp(0, 101)
     * 1
     * > modp(3, 11)
     * 8
     * > modp(100, 101)
     * 1
     * > modp(30, 5)
     * 4
     * > modp(31, 5)
     * 3
     */
    public static int modp(int n, int p) {
        if (p == 0) {
            return 1;
        }
        int power = 1;
        for (int i = 0; i < n; i++) {
            power = (power * 2) % p;
        }
        return power;
    }
}
```

And here's an implementation of the `ModpTest` class with ten unit test cases:

```java
class ModpTest {

    @Test
    void testModp1() {
        assertEquals(3, Modp.modp(3, 5));
    }

    @Test
    void testModp2() {
        assertEquals(2, Modp.modp(1101, 101));
    }

    @Test
    void testModp3() {
        assertEquals(1, Modp.modp(0, 101));
    }

    @Test
    void testModp4() {
        assertEquals(8, Modp.modp(3, 11));
    }

    @Test
    void testModp5() {
        assertEquals(1, Modp.modp(100, 101));
    }

    @Test
    void testModp6() {
        assertEquals(4, Modp.modp(30, 5));
    }

    @Test
    void testModp7() {
        assertEquals(3, Modp.modp(31, 5));
    }

    @Test
    void testModp8() {
        assertEquals(1, Modp.modp(0, 0));
    }

    @Test
    void testModp9() {
        assertEquals(0, Modp.modp(1, 0));
    }

    @Test
    void testModp10() {
        assertEquals(0, Modp.modp(0, 0));
    }
}
```

These test cases cover a range of inputs, including edge cases where `p` is 0 or `n` is 0.