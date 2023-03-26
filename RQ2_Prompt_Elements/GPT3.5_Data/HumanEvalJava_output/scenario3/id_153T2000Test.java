// StrongestExtensionTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrongestExtension}.
* It contains ten unit test cases for the {@link StrongestExtension#strongestExtension(String, List)} method.
*/
class StrongestExtensionTest {
    
    @Test
    void testStrongestExtension1() {
        String className = "my_class";
        List<String> extensions = Arrays.asList("AA", "Be", "CC");
        String expected = "my_class.AA";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
    
    @Test
    void testStrongestExtension2() {
        String className = "Watashi";
        List<String> extensions = Arrays.asList("tEN", "niNE", "eIGHt8OKe");
        String expected = "Watashi.eIGHt8OKe";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
    
    @Test
    void testStrongestExtension3() {
        String className = "Boku123";
        List<String> extensions = Arrays.asList("nani", "NazeDa", "YEs.WeCaNe", "32145tggg");
        String expected = "Boku123.YEs.WeCaNe";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
    
    @Test
    void testStrongestExtension4() {
        String className = "__YESIMHERE";
        List<String> extensions = Arrays.asList("t", "eMptY", "nothing", "zeR00", "NuLl__", "123NoooneB321");
        String expected = "__YESIMHERE.NuLl__";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
    
    @Test
    void testStrongestExtension5() {
        String className = "K";
        List<String> extensions = Arrays.asList("Ta", "TAR", "t234An", "cosSo");
        String expected = "K.TAR";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
    
    @Test
    void testStrongestExtension6() {
        String className = "__HAHA";
        List<String> extensions = Arrays.asList("Tab", "123", "781345", "-_-");
        String expected = "__HAHA.123";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
    
    @Test
    void testStrongestExtension7() {
        String className = "YameRore";
        List<String> extensions = Arrays.asList("HhAas", "okIWILL123", "WorkOut", "Fails", "-_-");
        String expected = "YameRore.okIWILL123";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
    
    @Test
    void testStrongestExtension8() {
        String className = "finNNalLLly";
        List<String> extensions = Arrays.asList("Die", "NowW", "Wow", "WoW");
        String expected = "finNNalLLly.WoW";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
    
    @Test
    void testStrongestExtension9() {
        String className = "_";
        List<String> extensions = Arrays.asList("Bb", "91245");
        String expected = "_.Bb";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
    
    @Test
    void testStrongestExtension10() {
        String className = "Sp";
        List<String> extensions = Arrays.asList("671235", "Bb");
        String expected = "Sp.671235";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
}