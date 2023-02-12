package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
class AntiShuffleTest {
    @Test
    void testAntiShuffle() {
        assertEquals("Hi", AntiShuffle.antiShuffle("Hi"));
        assertEquals("ehllo", AntiShuffle.antiShuffle("hello"));
        assertEquals("bemnru", AntiShuffle.antiShuffle("number"));
        assertEquals("abcd", AntiShuffle.antiShuffle("abcd"));
        assertEquals("Hello !!!Wdlor", AntiShuffle.antiShuffle("Hello World!!!"));
        assertEquals("", AntiShuffle.antiShuffle(""));
        assertEquals(".Hi My aemn is Meirst .Rboot How aer ?ouy", AntiShuffle.antiShuffle("Hi. My name is Mister Robot. How are you?"));
    }
}