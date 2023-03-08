package scenario2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OddCountTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList("the number of odd elements 4n the str4ng 4 of the 4nput."), scenario2.OddCount.oddCount(Arrays.asList("1234567")));
        assertEquals(Arrays.asList("the number of odd elements 1n the str1ng 1 of the 1nput.", "the number of odd elements 8n the str8ng 8 of the 8nput."), scenario2.OddCount.oddCount(Arrays.asList("3", "11111111")));
        assertEquals(Arrays.asList("the number of odd elements 2n the str2ng 2 of the 2nput.", "the number of odd elements 3n the str3ng 3 of the 3nput.", "the number of odd elements 2n the str2ng 2 of the 2nput."), scenario2.OddCount.oddCount(Arrays.asList("271", "137", "314")));

    }

}