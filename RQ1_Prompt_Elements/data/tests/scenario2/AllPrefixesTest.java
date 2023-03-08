package scenario2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AllPrefixesTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList("a", "ab", "abc"), scenario2.AllPrefixes.allPrefixes("abc"));
        assertEquals(Arrays.asList(), scenario2.AllPrefixes.allPrefixes(""));
        assertEquals(Arrays.asList("a", "as", "asd", "asdf", "asdfg", "asdfgh"), scenario2.AllPrefixes.allPrefixes("asdfgh"));
        assertEquals(Arrays.asList("W", "WW", "WWW"), scenario2.AllPrefixes.allPrefixes("WWW"));

    }

}