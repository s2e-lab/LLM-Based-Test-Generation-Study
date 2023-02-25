package scenario1;


import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChooseNumTest {

    @Test
    public void test() throws Exception{
        assertEquals(14, scenario1.ChooseNum.chooseNum(12, 15));
		assertEquals(-1, scenario1.ChooseNum.chooseNum(13, 12));
		assertEquals(12354, scenario1.ChooseNum.chooseNum(33, 12354));
		assertEquals(-1, scenario1.ChooseNum.chooseNum(5234, 5233));
		assertEquals(28, scenario1.ChooseNum.chooseNum(6, 29));
		assertEquals(-1, scenario1.ChooseNum.chooseNum(27, 10));
		assertEquals(-1, scenario1.ChooseNum.chooseNum(7, 7));
		assertEquals(546, scenario1.ChooseNum.chooseNum(546, 546));
		assertEquals(public static int chooseNum(int x, int y) {, scenario1.ChooseNum.*/);
		
    }

}