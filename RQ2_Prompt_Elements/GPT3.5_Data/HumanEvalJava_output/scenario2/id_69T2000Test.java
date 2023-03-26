Here's the code for the SearchTest class:

```
class SearchTest {

    @Test
    void testSearch1() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5);
        int expected = 1;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch2() {
        List<Integer> lst = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);
        int expected = 5;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch3() {
        List<Integer> lst = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5);
        int expected = 4;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch4() {
        List<Integer> lst = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4);
        int expected = 3;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch5() {
        List<Integer> lst = Arrays.asList(1, 1, 2, 2, 3, 3, 4);
        int expected = 2;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch6() {
        List<Integer> lst = Arrays.asList(1, 1, 2, 2, 3, 3);
        int expected = 3;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch7() {
        List<Integer> lst = Arrays.asList(1, 1, 2, 2, 3);
        int expected = 2;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch8() {
        List<Integer> lst = Arrays.asList(1, 1, 2, 2);
        int expected = 2;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch9() {
        List<Integer> lst = Arrays.asList(1, 1, 2);
        int expected = 1;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch10() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int expected = -1;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }
}
```

This class contains ten test cases for the `Search.search()` method. Each test case creates a list of integers and calls the `Search.search()` method with that list. The expected result is compared to the actual result using the `assertEquals()` method. If the expected and actual results are not equal, the test fails.