package scenario1;


import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HowManyTimesTest {

    @Test
    public void test() throws Exception{
        assertEquals(0, scenario1.HowManyTimes.howManyTimes("", "a"));
		assertEquals(3, scenario1.HowManyTimes.howManyTimes("aaa", "a"));
		assertEquals(3, scenario1.HowManyTimes.howManyTimes("aaaa", "aa"));
		assertEquals(0, scenario1.HowManyTimes.howManyTimes("", "x"));
		assertEquals(4, scenario1.HowManyTimes.howManyTimes("xyxyxyx", "x"));
		assertEquals(4, scenario1.HowManyTimes.howManyTimes("cacacacac", "cac"));
		assertEquals(1, scenario1.HowManyTimes.howManyTimes("john doe", "john"));
		assertEquals(public static int howManyTimes(String string, String substring) {, scenario1.HowManyTimes.*/);
		
    }

}