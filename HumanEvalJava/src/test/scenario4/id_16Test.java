package scenario4;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountDistinctCharactersTest {
    @Test
	public void test1() throws Exception {
		assertEquals(3, scenario4.CountDistinctCharacters.countDistinctCharacters("xyzXYZ"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(4, scenario4.CountDistinctCharacters.countDistinctCharacters("Jerry"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(0, scenario4.CountDistinctCharacters.countDistinctCharacters(""));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(5, scenario4.CountDistinctCharacters.countDistinctCharacters("abcde"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(5, scenario4.CountDistinctCharacters.countDistinctCharacters("abcdecadeCADE"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(1, scenario4.CountDistinctCharacters.countDistinctCharacters("aaaaAAAAaaaa"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(5, scenario4.CountDistinctCharacters.countDistinctCharacters("Jerry jERRY JeRRRY"));
	}

	
}