package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AllPrefixesTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList("a", "ab", "abc"), scenario1.AllPrefixes.allPrefixes("abc"));
        assertEquals(Arrays.asList(), scenario1.AllPrefixes.allPrefixes(""));
        assertEquals(Arrays.asList("a", "as", "asd", "asdf", "asdfg", "asdfgh"), scenario1.AllPrefixes.allPrefixes("asdfgh"));
        assertEquals(Arrays.asList("W", "WW", "WWW"), scenario1.AllPrefixes.allPrefixes("WWW"));

    }

}