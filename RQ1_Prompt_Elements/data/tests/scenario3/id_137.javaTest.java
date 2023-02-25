package scenario3;


import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompareOneTest {

    @Test
    public void test() throws Exception{
        assertEquals(2, scenario3.CompareOne.compareOne(1, 2));
		assertEquals(2.5, scenario3.CompareOne.compareOne(1, 2.5));
		assertEquals(3, scenario3.CompareOne.compareOne(2, 3));
		assertEquals(6, scenario3.CompareOne.compareOne(5, 6));
		assertEquals("2,3", scenario3.CompareOne.compareOne(1, "2,3"));
		assertEquals("6", scenario3.CompareOne.compareOne("5,1", "6"));
		assertEquals("2", scenario3.CompareOne.compareOne("1", "2"));
		assertEquals(null, scenario3.CompareOne.compareOne("1", 1));
		assertEquals(public static Object compareOne(Object a, Object b) {, scenario3.CompareOne.*/);
		
    }

}