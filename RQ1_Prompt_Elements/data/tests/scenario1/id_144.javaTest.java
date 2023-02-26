package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimplifyTest {

    @Test
    public void test() throws Exception{

        assertEquals(true, scenario1.Simplify.simplify("1/5", "5/1"));
		assertEquals(false, scenario1.Simplify.simplify("1/6", "2/1"));
		assertEquals(true, scenario1.Simplify.simplify("5/1", "3/1"));
		assertEquals(false, scenario1.Simplify.simplify("7/10", "10/2"));
		assertEquals(true, scenario1.Simplify.simplify("2/10", "50/10"));
		assertEquals(true, scenario1.Simplify.simplify("7/2", "4/2"));
		assertEquals(true, scenario1.Simplify.simplify("11/6", "6/1"));
		assertEquals(false, scenario1.Simplify.simplify("2/3", "5/2"));
		assertEquals(false, scenario1.Simplify.simplify("5/2", "3/5"));
		assertEquals(true, scenario1.Simplify.simplify("2/4", "8/4"));
		assertEquals(true, scenario1.Simplify.simplify("2/4", "4/2"));
		assertEquals(true, scenario1.Simplify.simplify("1/5", "5/1"));
		assertEquals(false, scenario1.Simplify.simplify("1/5", "1/5"));
		
    }

}