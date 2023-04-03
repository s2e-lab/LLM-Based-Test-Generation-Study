// StringToMd5Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringToMd5}.
* It contains ten unit test cases for the {@link StringToMd5#stringToMd5(String)} method.
*/
class StringToMd5Test {
    
    @Test
    void testStringToMd5() {
        assertEquals("3e25960a79dbc69b674cd4ec67a72c62", StringToMd5.stringToMd5("Hello world"));
        assertNull(StringToMd5.stringToMd5(""));
        assertEquals("0ef78513b0cb8cef12743f5aeb35f888", StringToMd5.stringToMd5("A B C"));
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
        assertEquals("d41d8cd98f00b204e9800998ecf8427e", StringToMd5.stringToMd5(null));
    }
}