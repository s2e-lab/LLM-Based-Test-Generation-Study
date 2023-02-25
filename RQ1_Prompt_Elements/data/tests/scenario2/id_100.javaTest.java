package scenario2;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MakeAPileTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList(3, 5, 7), scenario2.MakeAPile.makeAPile(3));
		assertEquals(Arrays.asList(4, 6, 8, 10), scenario2.MakeAPile.makeAPile(4));
		assertEquals(Arrays.asList(5, 7, 9, 11, 13), scenario2.MakeAPile.makeAPile(5));
		assertEquals(Arrays.asList(6, 8, 10, 12, 14, 16), scenario2.MakeAPile.makeAPile(6));
		assertEquals(Arrays.asList(8, 10, 12, 14, 16, 18, 20, 22), scenario2.MakeAPile.makeAPile(8));
		assertEquals(public static List<Integer> makeAPile(int n) {, scenario2.MakeAPile.*/);
		
    }

}