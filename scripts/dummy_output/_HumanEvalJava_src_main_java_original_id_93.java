// Here's an updated version of the Encode and EncodeTest classes with additional test cases and comments:


// EncodeTest.java
package original;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncodeTest {

    @Test
    public void testEncodeEmptyString() {
        assertEquals("", Encode.encode(""));
    }

    @Test
    public void testEncodeAllLowercase() {
        assertEquals("tgs", Encode.encode("test"));
    }

    @Test
    public void testEncodeAllUppercase() {
        assertEquals("TGS", Encode.encode("TEST"));
    }

    @Test
    public void testEncodeMixedCase() {
        assertEquals("tHKS KS C MGSSCGG", Encode.encode("This is a message"));
    }

    @Test
    public void testEncodeWithNonLetters() {
        assertEquals("k dQnT kNqW wHcT Tq wRkTg!", Encode.encode("I DoNt KnOw WhAt tO WrItE!"));
    }

    @Test
    public void testEncodeWithVowelsAtEnd() {
        assertEquals("mWDCSKR", Encode.encode("Mudasir"));
    }

    @Test
    public void testEncodeWithVowelsAtBeginning() {
        assertEquals("ygs", Encode.encode("YES"));
    }

    @Test
    public void testEncodeWithVowelsInMiddle() {
        assertEquals("k dQnT kNqW wHcT Tq wRkTg", Encode.encode("I DoNt KnOw WhAt tO WrItE"));
    }

    @Test
    public void testEncodeWithAllVowels() {
        assertEquals("CGIKO", Encode.encode("AEIOU"));
    }

    @Test
    public void testEncodeWithNonAsciiCharacters() {
        assertEquals("hëllö wörld", Encode.encode("HëLLö WöRLD"));
    }
}