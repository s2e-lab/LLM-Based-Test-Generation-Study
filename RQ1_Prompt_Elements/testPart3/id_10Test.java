class MakePalindromeTest {
    @Test
    void testMakePalindrome() {
        assertEquals("", MakePalindrome.makePalindrome(""));
        assertEquals("x", MakePalindrome.makePalindrome("x"));
        assertEquals("xyzyx", MakePalindrome.makePalindrome("xyz"));
        assertEquals("xyx", MakePalindrome.makePalindrome("xyx"));
        assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerry"));
        assertEquals("catac", MakePalindrome.makePalindrome("cat"));
        assertEquals("catac", MakePalindrome.makePalindrome("cata"));
        assertEquals("catac", MakePalindrome.makePalindrome("cata"));
        assertEquals("catac", MakePalindrome.makePalindrome("cata"));
        assertEquals("catac", MakePalindrome.makePalindrome("cata"));
    }
}