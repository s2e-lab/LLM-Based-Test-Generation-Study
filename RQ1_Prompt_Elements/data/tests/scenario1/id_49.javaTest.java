package scenario1;


import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ModpTest {

    @Test
    public void test() throws Exception{
        assertEquals(3, scenario1.Modp.modp(3, 5));
		assertEquals(2, scenario1.Modp.modp(1101, 101));
		assertEquals(1, scenario1.Modp.modp(0, 101));
		assertEquals(8, scenario1.Modp.modp(3, 11));
		assertEquals(1, scenario1.Modp.modp(100, 101));
		assertEquals(4, scenario1.Modp.modp(30, 5));
		assertEquals(3, scenario1.Modp.modp(31, 5));
		assertEquals(public static int modp(int n, int p) {, scenario1.Modp.*/);
		
    }

}