package scenario3;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VowelsCountTest {

    @Test
    public void test() throws Exception{

        assertEquals(2, scenario3.VowelsCount.vowelsCount("abcde"));
		assertEquals(3, scenario3.VowelsCount.vowelsCount("Alone"));
		assertEquals(2, scenario3.VowelsCount.vowelsCount("key"));
		assertEquals(1, scenario3.VowelsCount.vowelsCount("bye"));
		assertEquals(2, scenario3.VowelsCount.vowelsCount("keY"));
		assertEquals(1, scenario3.VowelsCount.vowelsCount("bYe"));
		assertEquals(3, scenario3.VowelsCount.vowelsCount("ACEDY"));
		
    }

}