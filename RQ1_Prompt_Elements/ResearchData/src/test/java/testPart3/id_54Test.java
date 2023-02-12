public class SameCharsTest {
    @Test
    public void testSameChars() {
        assertEquals(true, SameChars.sameChars("eabcdzzzz", "dddzzzzzzzddeddabc"));
        assertEquals(true, SameChars.sameChars("abcd", "dddddddabc"));
        assertEquals(true, SameChars.sameChars("dddddddabc", "abcd"));
        assertEquals(false, SameChars.sameChars("eabcd", "dddddddabc"));
        assertEquals(false, SameChars.sameChars("abcd", "dddddddabcf"));
        assertEquals(false, SameChars.sameChars("eabcdzzzz", "dddzzzzzzzddddabc"));
        assertEquals(false, SameChars.sameChars("aabb", "aaccc"));
        assertEquals(false, SameChars.sameChars("aabb", "aaccc"));
        assertEquals(false, SameChars.sameChars("aabb", "aaccc"));
        assertEquals(false, SameChars.sameChars("aabb", "aaccc"));
    }
}