package scenario2;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StartsOneEndsTest {

    @Test
    public void test() throws Exception{

        assertEquals(1, scenario2.StartsOneEnds.startsOneEnds(1));
		assertEquals(18, scenario2.StartsOneEnds.startsOneEnds(2));
		assertEquals(180, scenario2.StartsOneEnds.startsOneEnds(3));
		assertEquals(1800, scenario2.StartsOneEnds.startsOneEnds(4));
		assertEquals(18000, scenario2.StartsOneEnds.startsOneEnds(5));
		
    }

}