// EncodeTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encode}.
* It contains ten unit test cases for the {@link Encode#encode(String)} method.
*/
class EncodeTest {

		@Test
		void testEncode() {
				assertEquals("", Encode.encode(""));
				assertEquals("C", Encode.encode("c"));
				assertEquals("C", Encode.encode("C"));
				assertEquals("C", Encode.encode("c"));
				assertEquals("C", Encode.encode("C"));
				assertEquals("C", Encode.encode("c"));
				assertEquals("C", Encode.encode("C"));
				assertEquals("C", Encode.encode("c"));
				assertEquals("C", Encode.encode("C"));
				assertEquals("C", Encode.encode("c"));
		}
}