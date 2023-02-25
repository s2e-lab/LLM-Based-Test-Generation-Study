package scenario1;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringToMd5Test {

    @Test
    public void test() throws Exception{
        assertEquals("3e25960a79dbc69b674cd4ec67a72c62", scenario1.StringToMd5.stringToMd5("Hello world"));
		assertEquals(null, scenario1.StringToMd5.stringToMd5(""));
		assertEquals("0ef78513b0cb8cef12743f5aeb35f888", scenario1.StringToMd5.stringToMd5("A B C"));
		assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", scenario1.StringToMd5.stringToMd5("password"));
		assertEquals(public static String stringToMd5(String text) {, scenario1.StringToMd5.*/);
		
    }

}