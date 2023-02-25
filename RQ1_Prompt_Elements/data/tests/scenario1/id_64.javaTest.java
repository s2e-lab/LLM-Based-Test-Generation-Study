package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VowelsCountTest {

    @Test
    public void test() throws Exception{

        assertEquals(2, scenario1.VowelsCount.vowelsCount("abcde"));
		assertEquals(3, scenario1.VowelsCount.vowelsCount("Alone"));
		assertEquals(2, scenario1.VowelsCount.vowelsCount("key"));
		assertEquals(1, scenario1.VowelsCount.vowelsCount("bye"));
		assertEquals(2, scenario1.VowelsCount.vowelsCount("keY"));
		assertEquals(1, scenario1.VowelsCount.vowelsCount("bYe"));
		assertEquals(3, scenario1.VowelsCount.vowelsCount("ACEDY"));
		
    }

}