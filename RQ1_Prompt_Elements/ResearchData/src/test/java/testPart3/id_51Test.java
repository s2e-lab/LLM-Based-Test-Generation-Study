class RemoveVowelsTest {
    @Test
    void testRemoveVowels() {
        assertEquals("", RemoveVowels.removeVowels(""));
        assertEquals("bcdf\nghjklm", RemoveVowels.removeVowels("abcdef\nghijklm"));
        assertEquals("fdcb", RemoveVowels.removeVowels("fedcba"));
        assertEquals("", RemoveVowels.removeVowels("eeeee"));
        assertEquals("cB", RemoveVowels.removeVowels("acBAA"));
        assertEquals("cB", RemoveVowels.removeVowels("EcBOO"));
        assertEquals("ybcd", RemoveVowels.removeVowels("ybcd"));
        assertEquals("", RemoveVowels.removeVowels("aaaaa"));
        assertEquals("B", RemoveVowels.removeVowels("aaBAA"));
        assertEquals("zbcd", RemoveVowels.removeVowels("zbcd"));
    }
}