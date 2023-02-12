package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
class AllPrefixesTest {
    @Test
    void testAllPrefixes() {
        assertEquals(AllPrefixes.allPrefixes("abc"), Arrays.asList("a", "ab", "abc"));
        assertEquals(AllPrefixes.allPrefixes(""), Arrays.asList());
        assertEquals(AllPrefixes.allPrefixes("asdfgh"), Arrays.asList("a", "as", "asd", "asdf", "asdfg", "asdfgh"));
        assertEquals(AllPrefixes.allPrefixes("WWW"), Arrays.asList("W", "WW", "WWW"));
        assertEquals(AllPrefixes.allPrefixes("a"), Arrays.asList("a"));
        assertEquals(AllPrefixes.allPrefixes("ab"), Arrays.asList("a", "ab"));
        assertEquals(AllPrefixes.allPrefixes("abcdefghijklmnopqrstuvwxyz"), Arrays.asList("a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi", "abcdefghij", "abcdefghijk", "abcdefghijkl", "abcdefghijklm", "abcdefghijklmn", "abcdefghijklmno", "abcdefghijklmnop", "abcdefghijklmnopq", "abcdefghijklmnopqr", "abcdefghijklmnopqrs", "abcdefghijklmnopqrst", "abcdefghijklmnopqrstu", "abcdefghijklmnopqrstuv", "abcdefghijklmnopqrstuvw", "abcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxy", "abcdefghijklmnopqrstuvwxyz"));
        assertEquals(AllPrefixes.allPrefixes("ABCDEFGHIJKLMNOPQRSTUVWXYZ"), Arrays.asList("A", "AB", "ABC", "ABCD", "ABCDE", "ABCDEF", "ABCDEFG", "ABCDEFGH", "ABCDEFGHI", "ABCDEFGHIJ", "ABCDEFGHIJK", "ABCDEFGHIJKL", "ABCDEFGHIJKLM", "ABCDEFGHIJKLMN", "ABCDEFGHIJKLMNO", "ABCDEFGHIJKLMNOP", "ABCDEFGHIJKLMNOPQ", "ABCDEFGHIJKLMNOPQR", "ABCDEFGHIJKLMNOPQRS", "ABCDEFGHIJKLMNOPQRST", "ABCDEFGHIJKLMNOPQRSTU", "ABCDEFGHIJKLMNOPQRSTUV", "ABCDEFGHIJKLMNOPQRSTUVW", "ABCDEFGHIJKLMNOPQRSTUVWX", "ABCDEFGHIJKLMNOPQRSTUVWXY", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        assertEquals(AllPrefixes.allPrefixes("0123456789"), Arrays.asList("0", "01", "012", "0123", "01234", "012345", "0123456", "01234567", "012345678", "0123456789"));
        assertEquals(AllPrefixes.allPrefixes("!@#$%^&*()"), Arrays.asList("!", "!@", "!@$", "!@#$", "!@#$%", "!@#$%^", "!@#$%^&", "!@#$%^&*", "!@#$%^&*(", "!@#$%^&*()"));
    }
}