package scenario3;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StrongestExtensionTest {
    @Test
	public void test1() throws Exception {
		assertEquals("Watashi.eIGHt8OKe", scenario3.StrongestExtension.strongestExtension("Watashi", Arrays.asList("tEN", "niNE", "eIGHt8OKe")));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("Boku123.YEs.WeCaNe", scenario3.StrongestExtension.strongestExtension("Boku123", Arrays.asList("nani", "NazeDa", "YEs.WeCaNe", "32145tggg")));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("__YESIMHERE.NuLl__", scenario3.StrongestExtension.strongestExtension("__YESIMHERE", Arrays.asList("t", "eMptY", "nothing", "zeR00", "NuLl__", "123NoooneB321")));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("K.TAR", scenario3.StrongestExtension.strongestExtension("K", Arrays.asList("Ta", "TAR", "t234An", "cosSo")));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("__HAHA.123", scenario3.StrongestExtension.strongestExtension("__HAHA", Arrays.asList("Tab", "123", "781345", "-_-")));
	}

	@Test
	public void test6() throws Exception {
		assertEquals("YameRore.okIWILL123", scenario3.StrongestExtension.strongestExtension("YameRore", Arrays.asList("HhAas", "okIWILL123", "WorkOut", "Fails", "-_-")));
	}

	@Test
	public void test7() throws Exception {
		assertEquals("finNNalLLly.WoW", scenario3.StrongestExtension.strongestExtension("finNNalLLly", Arrays.asList("Die", "NowW", "Wow", "WoW")));
	}

	@Test
	public void test8() throws Exception {
		assertEquals("_.Bb", scenario3.StrongestExtension.strongestExtension("_", Arrays.asList("Bb", "91245")));
	}

	@Test
	public void test9() throws Exception {
		assertEquals("Sp.671235", scenario3.StrongestExtension.strongestExtension("Sp", Arrays.asList("671235", "Bb")));
	}

	
}