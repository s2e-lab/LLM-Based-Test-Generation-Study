public class IscubeTest {
    @Test
    public void test1() {
        assertEquals(true, Iscube.iscube(1));
    }
    @Test
    public void test2() {
        assertEquals(false, Iscube.iscube(2));
    }
    @Test
    public void test3() {
        assertEquals(true, Iscube.iscube(-1));
    }
    @Test
    public void test4() {
        assertEquals(true, Iscube.iscube(64));
    }
    @Test
    public void test5() {
        assertEquals(false, Iscube.iscube(180));
    }
    @Test
    public void test6() {
        assertEquals(true, Iscube.iscube(1000));
    }
    @Test
    public void test7() {
        assertEquals(true, Iscube.iscube(0));
    }
    @Test
    public void test8() {
        assertEquals(false, Iscube.iscube(1729));
    }
    @Test
    public void test9() {
        assertEquals(true, Iscube.iscube(125));
    }
    @Test
    public void test10() {
        assertEquals(false, Iscube.iscube(100));
    }
}