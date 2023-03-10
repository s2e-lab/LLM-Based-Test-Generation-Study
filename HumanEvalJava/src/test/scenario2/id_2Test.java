package scenario2;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TruncateNumberTest {
    @Test
	public void test1() throws Exception {
		assertEquals(0.5, scenario2.TruncateNumber.truncateNumber(3.5));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(0.33, scenario2.TruncateNumber.truncateNumber(1.33));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(0.456, scenario2.TruncateNumber.truncateNumber(123.456));
	}

	
}