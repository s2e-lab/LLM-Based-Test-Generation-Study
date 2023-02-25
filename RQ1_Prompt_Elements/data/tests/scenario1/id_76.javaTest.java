package scenario1;


import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsSimplePowerTest {

    @Test
    public void test() throws Exception{
        assertEquals(true, scenario1.IsSimplePower.isSimplePower(16, 2));
		assertEquals(false, scenario1.IsSimplePower.isSimplePower(143214, 16));
		assertEquals(true, scenario1.IsSimplePower.isSimplePower(4, 2));
		assertEquals(true, scenario1.IsSimplePower.isSimplePower(9, 3));
		assertEquals(true, scenario1.IsSimplePower.isSimplePower(16, 4));
		assertEquals(false, scenario1.IsSimplePower.isSimplePower(24, 2));
		assertEquals(false, scenario1.IsSimplePower.isSimplePower(128, 4));
		assertEquals(false, scenario1.IsSimplePower.isSimplePower(12, 6));
		assertEquals(true, scenario1.IsSimplePower.isSimplePower(1, 1));
		assertEquals(true, scenario1.IsSimplePower.isSimplePower(1, 12));
		assertEquals(public static Boolean isSimplePower(int x, int n) {, scenario1.IsSimplePower.*/);
		
    }

}