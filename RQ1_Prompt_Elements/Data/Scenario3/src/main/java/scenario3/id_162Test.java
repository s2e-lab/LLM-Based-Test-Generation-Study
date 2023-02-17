package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToMd5Test {
    @Test
    void testStringToMd5() {
        assertEquals("3e25960a79dbc69b674cd4ec67a72c62", StringToMd5.stringToMd5("Hello world"));
        assertEquals(null, StringToMd5.stringToMd5(""));
        assertEquals("0ef78513b0cb8cef12743f5aeb35f888", StringToMd5.stringToMd5("A B C"));
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }
}