package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class OddCountTest {
    @Test
    void testOddCount() {
        List<String> lst = new ArrayList<String>();
        lst.add("1234567");
        assertEquals(OddCount.oddCount(lst), Arrays.asList("the number of odd elements 4n the str4ng 4 of the 4nput."));
        lst.clear();
        lst.add("3");
        lst.add("11111111");
        assertEquals(OddCount.oddCount(lst), Arrays.asList("the number of odd elements 1n the str1ng 1 of the 1nput.", "the number of odd elements 8n the str8ng 8 of the 8nput."));
        lst.clear();
        lst.add("271");
        lst.add("137");
        lst.add("314");
        assertEquals(OddCount.oddCount(lst), Arrays.asList("the number of odd elements 2n the str2ng 2 of the 2nput.", "the number of odd elements 3n the str3ng 3 of the 3nput.", "the number of odd elements 2n the str2ng 2 of the 2nput."));
    }
}