// EncodeTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encode}.
* It contains ten unit test cases for the {@link Encode#encode(String)} method.
*/
class EncodeTest {

    /**
    * Test case for the {@link Encode#encode(String)} method.
    */
    @Test
    void testEncode() {
        assertEquals("hEllO", Encode.encode("Hello"));
        assertEquals("hEllo", Encode.encode("Hello"));
        assertEquals("hEllo", Encode.encode("hello"));
        assertEquals("hEllo", Encode.encode("HELLO"));
        assertEquals("hEllo", Encode.encode("hEllo"));
        assertEquals("hEllo", Encode.encode("hEllo"));
        assertEquals("hEllo", Encode.encode("hEllo"));
        assertEquals("hEllo", Encode.encode("hEllo"));
        assertEquals("hEllo", Encode.encode("hEllo"));
        assertEquals("hEllo", Encode.encode("hEllo"));
        assertEquals("hEllo", Encode.encode("hEllo"));
    }
}
