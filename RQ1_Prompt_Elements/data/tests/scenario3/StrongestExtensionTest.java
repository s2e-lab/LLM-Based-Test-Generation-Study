package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StrongestExtensionTest {

    @Test
    public void test() throws Exception {

        assertEquals("Watashi.eIGHt8OKe", scenario3.StrongestExtension.strongestExtension("Watashi", Arrays.asList("tEN", "niNE", "eIGHt8OKe")));
        assertEquals("Boku123.YEs.WeCaNe", scenario3.StrongestExtension.strongestExtension("Boku123", Arrays.asList("nani", "NazeDa", "YEs.WeCaNe", "32145tggg")));
        assertEquals("__YESIMHERE.NuLl__", scenario3.StrongestExtension.strongestExtension("__YESIMHERE", Arrays.asList("t", "eMptY", "nothing", "zeR00", "NuLl__", "123NoooneB321")));
        assertEquals("K.TAR", scenario3.StrongestExtension.strongestExtension("K", Arrays.asList("Ta", "TAR", "t234An", "cosSo")));
        assertEquals("__HAHA.123", scenario3.StrongestExtension.strongestExtension("__HAHA", Arrays.asList("Tab", "123", "781345", "-_-")));
        assertEquals("YameRore.okIWILL123", scenario3.StrongestExtension.strongestExtension("YameRore", Arrays.asList("HhAas", "okIWILL123", "WorkOut", "Fails", "-_-")));
        assertEquals("finNNalLLly.WoW", scenario3.StrongestExtension.strongestExtension("finNNalLLly", Arrays.asList("Die", "NowW", "Wow", "WoW")));
        assertEquals("_.Bb", scenario3.StrongestExtension.strongestExtension("_", Arrays.asList("Bb", "91245")));
        assertEquals("Sp.671235", scenario3.StrongestExtension.strongestExtension("Sp", Arrays.asList("671235", "Bb")));

    }

}