package scenario2;

import java.util.List;
import original.TotalMatch;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TotalMatchTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList(), scenario2.TotalMatch.totalMatch(Arrays.asList(), Arrays.asList()));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList("hi", "hi"), scenario2.TotalMatch.totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hi", "hi")));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList("hi", "admin"), scenario2.TotalMatch.totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hi", "hi", "admin", "project")));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(Arrays.asList("4"), scenario2.TotalMatch.totalMatch(Arrays.asList("4"), Arrays.asList("1", "2", "3", "4", "5")));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(Arrays.asList("hI", "Hi"), scenario2.TotalMatch.totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hI", "Hi")));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(Arrays.asList("hI", "hi", "hi"), scenario2.TotalMatch.totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hI", "hi", "hi")));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(Arrays.asList("hi", "admin"), scenario2.TotalMatch.totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hI", "hi", "hii")));
	}

	@Test
	public void test8() throws Exception {
		assertEquals(Arrays.asList(), scenario2.TotalMatch.totalMatch(Arrays.asList(), Arrays.asList("this")));
	}

	@Test
	public void test9() throws Exception {
		assertEquals(Arrays.asList(), scenario2.TotalMatch.totalMatch(Arrays.asList("this"), Arrays.asList()));
	}

	
}