public class EatTest {
    @Test
    public void test1() {
        assertEquals(Arrays.asList(11, 4), Eat.eat(5, 6, 10));
    }
    @Test
    public void test2() {
        assertEquals(Arrays.asList(12, 1), Eat.eat(4, 8, 9));
    }
    @Test
    public void test3() {
        assertEquals(Arrays.asList(11, 0), Eat.eat(1, 10, 10));
    }
    @Test
    public void test4() {
        assertEquals(Arrays.asList(7, 0), Eat.eat(2, 11, 5));
    }
    @Test
    public void test5() {
        assertEquals(Arrays.asList(9, 2), Eat.eat(4, 5, 7));
    }
    @Test
    public void test6() {
        assertEquals(Arrays.asList(5, 0), Eat.eat(4, 5, 1));
    }
    @Test
    public void test7() {
        assertEquals(Arrays.asList(0, 0), Eat.eat(0, 0, 0));
    }
    @Test
    public void test8() {
        assertEquals(Arrays.asList(1000, 0), Eat.eat(0, 1000, 1000));
    }
    @Test
    public void test9() {
        assertEquals(Arrays.asList(1000, 0), Eat.eat(1000, 0, 1000));
    }
    @Test
    public void test10() {
        assertEquals(Arrays.asList(1000, 0), Eat.eat(1000, 1000, 0));
    }
}