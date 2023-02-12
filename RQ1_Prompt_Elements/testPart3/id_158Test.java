class FindMaxTest {
    @Test
    void testFindMax() {
        List<String> words = new ArrayList<>();
        words.add("name");
        words.add("of");
        words.add("string");
        assertEquals("string", FindMax.findMax(words));

        words.clear();
        words.add("name");
        words.add("enam");
        words.add("game");
        assertEquals("enam", FindMax.findMax(words));

        words.clear();
        words.add("aaaaaaa");
        words.add("bb");
        words.add("cc");
        assertEquals("aaaaaaa", FindMax.findMax(words));

        words.clear();
        words.add("abc");
        words.add("cba");
        assertEquals("abc", FindMax.findMax(words));

        words.clear();
        words.add("play");
        words.add("this");
        words.add("game");
        words.add("of");
        words.add("footbott");
        assertEquals("footbott", FindMax.findMax(words));

        words.clear();
        words.add("we");
        words.add("are");
        words.add("gonna");
        words.add("rock");
        assertEquals("gonna", FindMax.findMax(words));

        words.clear();
        words.add("we");
        words.add("are");
        words.add("a");
        words.add("mad");
        words.add("nation");
        assertEquals("nation", FindMax.findMax(words));

        words.clear();
        words.add("this");
        words.add("is");
        words.add("a");
        words.add("prrk");
        assertEquals("this", FindMax.findMax(words));

        words.clear();
        words.add("b");
        assertEquals("b", FindMax.findMax(words));

        words.clear();
        words.add("play");
        words.add("play");
        words.add("play");
        assertEquals("play", FindMax.findMax(words));
    }
}