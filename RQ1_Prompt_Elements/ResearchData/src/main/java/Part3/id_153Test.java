package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class StrongestExtensionTest {
    @Test
    public void testStrongestExtension() {
        assertEquals("Watashi.eIGHt8OKe", StrongestExtension.strongestExtension("Watashi", Arrays.asList("tEN", "niNE", "eIGHt8OKe")));
        assertEquals("Boku123.YEs.WeCaNe", StrongestExtension.strongestExtension("Boku123", Arrays.asList("nani", "NazeDa", "YEs.WeCaNe", "32145tggg")));
        assertEquals("__YESIMHERE.NuLl__", StrongestExtension.strongestExtension("__YESIMHERE", Arrays.asList("t", "eMptY", "nothing", "zeR00", "NuLl__", "123NoooneB321")));
        assertEquals("K.TAR", StrongestExtension.strongestExtension("K", Arrays.asList("Ta", "TAR", "t234An", "cosSo")));
        assertEquals("__HAHA.123", StrongestExtension.strongestExtension("__HAHA", Arrays.asList("Tab", "123", "781345", "-_-")));
        assertEquals("YameRore.okIWILL123", StrongestExtension.strongestExtension("YameRore", Arrays.asList("HhAas", "okIWILL123", "WorkOut", "Fails", "-_-")));
        assertEquals("finNNalLLly.WoW", StrongestExtension.strongestExtension("finNNalLLly", Arrays.asList("Die", "NowW", "Wow", "WoW")));
        assertEquals("_.Bb", StrongestExtension.strongestExtension("_", Arrays.asList("Bb", "91245")));
        assertEquals("Sp.671235", StrongestExtension.strongestExtension("Sp", Arrays.asList("671235", "Bb")));
        assertEquals("my_class.AA", StrongestExtension.strongestExtension("my_class", Arrays.asList("AA", "Be", "CC")));
    }
}