package scenario1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParseMusicTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList(4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4), scenario1.ParseMusic.parseMusic("o o| .| o| o| .| .| .| .| o o"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList(), scenario1.ParseMusic.parseMusic(""));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList(4, 4, 4, 4), scenario1.ParseMusic.parseMusic("o o o o"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(Arrays.asList(1, 1, 1, 1), scenario1.ParseMusic.parseMusic(".| .| .| .|"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(Arrays.asList(2, 2, 1, 1, 4, 4, 4, 4), scenario1.ParseMusic.parseMusic("o| o| .| .| o o o o"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(Arrays.asList(2, 1, 2, 1, 4, 2, 4, 2), scenario1.ParseMusic.parseMusic("o| .| o| .| o o| o o|"));
	}

	
}