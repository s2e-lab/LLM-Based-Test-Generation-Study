// StrongestExtensionTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrongestExtension}.
* It contains ten unit test cases for the {@link StrongestExtension#strongestExtension(String, List)} method.
*/
class StrongestExtensionTest {

    /**
    * Test case for {@link StrongestExtension#strongestExtension(String, List)} where the strongest extension is the first one in the list.
    */
    @Test
    void testStrongestExtension1() {
        String className = "my_class";
        List<String> extensions = List.of("AA", "Be", "CC");
        String expected = "my_class.AA";
        assertEquals(expected, StrongestExtension.strongestExtension(className, extensions));
    }

    /**
    * Test case for {@link StrongestExtension#strongestExtension(String, List)} where the strongest extension is the second one in the list.
    */
    @Test
    void testStrongestExtension2() {
        String className = "Boku123";
        List<String> extensions = List.of("nani", "NazeDa", "YEs.WeCaNe", "32145tggg");
        String expected = "Boku123.YEs.WeCaNe";
        assertEquals(expected, StrongestExtension.strongestExtension(className, extensions));
    }

    /**
    * Test case for {@link StrongestExtension#strongestExtension(String, List)} where the strongest extension is the last one in the list.
    */
    @Test
    void testStrongestExtension3() {
        String className = "__YESIMHERE";
        List<String> extensions = List.of("t", "eMptY", "nothing", "zeR00", "NuLl__", "123NoooneB321");
        String expected = "__YESIMHERE.NuLl__";
        assertEquals(expected, StrongestExtension.strongestExtension(className, extensions));
    }

    /**
    * Test case for {@link StrongestExtension#strongestExtension(String, List)} where the strongest extension is the middle one in the list.
    */
    @Test
    void testStrongestExtension4() {
        String className = "K";
        List<String> extensions = List.of("Ta", "TAR", "t234An", "cosSo");
        String expected = "K.TAR";
        assertEquals(expected, StrongestExtension.strongestExtension(className, extensions));
    }

    /**
    * Test case for {@link StrongestExtension#strongestExtension(String, List)} where the strongest extension is the first one in the list.
    */
    @Test
    void testStrongestExtension5() {
        String className = "__HAHA";
        List<String> extensions = List.of("Tab", "123", "781345", "-_-");
        String expected = "__HAHA.123";
        assertEquals(expected, StrongestExtension.strongestExtension(className, extensions));
    }

    /**
    * Test case for {@link StrongestExtension#strongestExtension(String, List)} where the strongest extension is the last one in the list.
    */
    @Test
    void testStrongestExtension6() {
        String className = "YameRore";
        List<String> extensions = List.of("HhAas", "okIWILL123", "WorkOut", "Fails", "-_-");
        String expected = "YameRore.okIWILL123";
        assertEquals(expected, StrongestExtension.strongestExtension(className, extensions));
    }

    /**
    * Test case for {@link StrongestExtension#strongestExtension(String, List)} where the strongest extension is the first one in the list.
    */
    @Test
    void testStrongestExtension7() {
        String className = "finNNalLLly";
        List<String> extensions = List.of("Die", "NowW", "Wow", "WoW");
        String expected = "finNNalLLly.WoW";
        assertEquals(expected, StrongestExtension.strongestExtension(className, extensions));
    }

    /**
    * Test case for {@link StrongestExtension#strongestExtension(String, List)} where the strongest extension is the last one in the list.
    */
    @Test
    void testStrongestExtension8() {
        String className = "_";
        List<String> extensions = List.of("Bb", "91245");
        String expected = "_.Bb";
        assertEquals(expected, StrongestExtension.strongestExtension(className, extensions));
    }

    /**
    * Test case for {@link StrongestExtension#strongestExtension(String, List)} where the strongest extension is the first one in the list.
    */
    @Test
    void testStrongestExtension9() {
        String className = "Sp";
        List<String> extensions = List.of("671235", "Bb");
        String expected = "Sp.671235";
        assertEquals(expected, StrongestExtension.strongestExtension(className, extensions));
    }

    /**
    * Test case for {@link StrongestExtension#strongestExtension(String, List)} where the strongest extension is the last one in the list.
    */
    @Test
    void testStrongestExtension10() {
        String className = "Sp";
        List<String> extensions = List.of("671235", "Bb");
        String expected = "Sp.671235";
        assertEquals(expected, StrongestExtension.strongestExtension(className, extensions));
    }
}
