// AntiShuffleTest.java
package scenario2;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains ten unit test cases for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {

	@Test
	void testAntiShuffle() {
		assertEquals("a", AntiShuffle.antiShuffle("a"));
		assertEquals("a b", AntiShuffle.antiShuffle("a b"));
		assertEquals("a b c", AntiShuffle.antiShuffle("a b c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a b c d"));
		assertEquals("a b c d e", AntiShuffle.antiShuffle("a b c d e"));
		assertEquals("a b c d e f", AntiShuffle.antiShuffle("a b c d e f"));
		assertEquals("a b c d e f g", AntiShuffle.antiShuffle("a b c d e f g"));
		assertEquals("a b c d e f g h", AntiShuffle.antiShuffle("a b c d e f g h"));
		assertEquals("a b c d e f g h i", AntiShuffle.antiShuffle("a b c d e f g h i"));
		assertEquals("a b c d e f g h i j", AntiShuffle.antiShuffle("a b c d e f g h i j"));
	}
}