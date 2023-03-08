package scenario1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveVowelsTest {

    @Test
    public void test() throws Exception {

        assertEquals("bcdf", scenario1.RemoveVowels.removeVowels("abcdef"));
        assertEquals("", scenario1.RemoveVowels.removeVowels("aaaaa"));
        assertEquals("B", scenario1.RemoveVowels.removeVowels("aaBAA"));
        assertEquals("zbcd", scenario1.RemoveVowels.removeVowels("zbcd"));
        assertEquals("", scenario1.RemoveVowels.removeVowels(""));
        assertEquals("bcdf\nghjklm", scenario1.RemoveVowels.removeVowels("abcdef\nghijklm"));
        assertEquals("fdcb", scenario1.RemoveVowels.removeVowels("fedcba"));
        assertEquals("", scenario1.RemoveVowels.removeVowels("eeeee"));
        assertEquals("cB", scenario1.RemoveVowels.removeVowels("acBAA"));
        assertEquals("cB", scenario1.RemoveVowels.removeVowels("EcBOO"));
        assertEquals("ybcd", scenario1.RemoveVowels.removeVowels("ybcd"));

    }

}