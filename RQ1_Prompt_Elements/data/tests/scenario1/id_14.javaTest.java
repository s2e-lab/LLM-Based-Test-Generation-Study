package scenario1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AllPrefixesTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList("a", "ab", "abc"), scenario1.AllPrefixes.allPrefixes("abc"));
		assertEquals(Arrays.asList(), scenario1.AllPrefixes.allPrefixes(""));
		assertEquals(Arrays.asList("a", "as", "asd", "asdf", "asdfg", "asdfgh"), scenario1.AllPrefixes.allPrefixes("asdfgh"));
		assertEquals(Arrays.asList("W", "WW", "WWW"), scenario1.AllPrefixes.allPrefixes("WWW"));
		assertEquals(public static List<Object> allPrefixes(String string) {, scenario1.AllPrefixes.*/);
		
    }

}