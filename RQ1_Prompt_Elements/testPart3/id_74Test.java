public class TotalMatchTest {
    @Test
    public void test1() {
        List<Object> lst1 = new ArrayList<Object>();
        List<Object> lst2 = new ArrayList<Object>();
        assertEquals(lst1, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    public void test2() {
        List<Object> lst1 = new ArrayList<Object>();
        List<Object> lst2 = new ArrayList<Object>();
        lst1.add("hi");
        lst1.add("admin");
        lst2.add("hi");
        lst2.add("hi");
        assertEquals(lst2, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    public void test3() {
        List<Object> lst1 = new ArrayList<Object>();
        List<Object> lst2 = new ArrayList<Object>();
        lst1.add("hi");
        lst1.add("admin");
        lst2.add("hi");
        lst2.add("hi");
        lst2.add("admin");
        lst2.add("project");
        assertEquals(lst1, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    public void test4() {
        List<Object> lst1 = new ArrayList<Object>();
        List<Object> lst2 = new ArrayList<Object>();
        lst1.add("4");
        lst2.add("1");
        lst2.add("2");
        lst2.add("3");
        lst2.add("4");
        lst2.add("5");
        assertEquals(lst1, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    public void test5() {
        List<Object> lst1 = new ArrayList<Object>();
        List<Object> lst2 = new ArrayList<Object>();
        lst1.add("hi");
        lst1.add("admin");
        lst2.add("hI");
        lst2.add("Hi");
        assertEquals(lst2, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    public void test6() {
        List<Object> lst1 = new ArrayList<Object>();
        List<Object> lst2 = new ArrayList<Object>();
        lst1.add("hi");
        lst1.add("admin");
        lst2.add("hI");
        lst2.add("hi");
        lst2.add("hi");
        assertEquals(lst2, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    public void test7() {
        List<Object> lst1 = new ArrayList<Object>();
        List<Object> lst2 = new ArrayList<Object>();
        lst1.add("hi");
        lst1.add("admin");
        lst2.add("hI");
        lst2.add("hi");
        lst2.add("hii");
        assertEquals(lst1, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    public void test8() {
        List<Object> lst1 = new ArrayList<Object>();
        List<Object> lst2 = new ArrayList<Object>();
        lst2.add("this");
        assertEquals(lst1, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    public void test9() {
        List<Object> lst1 = new ArrayList<Object>();
        List<Object> lst2 = new ArrayList<Object>();
        lst1.add("this");
        assertEquals(lst1, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    public void test10() {
        List<Object> lst1 = new ArrayList<Object>();
        List<Object> lst2 = new ArrayList<Object>();
        lst1.add("hi");
        lst1.add("admin");
        lst2.add("hI");
        lst2.add("hi");
        lst2.add("hii");
        assertEquals(lst1, TotalMatch.totalMatch(lst1, lst2));
    }
}