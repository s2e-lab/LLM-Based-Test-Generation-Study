package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncodeTest {
    @Test
	public void test1() throws Exception {
		assertEquals("tgst", scenario1.Encode.encode("TEST"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("mWDCSKR", scenario1.Encode.encode("Mudasir"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("ygs", scenario1.Encode.encode("YES"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("tHKS KS C MGSSCGG", scenario1.Encode.encode("This is a message"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("k dQnT kNqW wHcT Tq wRkTg", scenario1.Encode.encode("I DoNt KnOw WhAt tO WrItE"));
	}

	
}