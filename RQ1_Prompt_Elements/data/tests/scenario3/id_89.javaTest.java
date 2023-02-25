package scenario3;


import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {

    @Test
    public void test() throws Exception{
        assertEquals("lm", scenario3.Encrypt.encrypt("hi"));
		assertEquals("ewhjklnop", scenario3.Encrypt.encrypt("asdfghjkl"));
		assertEquals("kj", scenario3.Encrypt.encrypt("gf"));
		assertEquals("ix", scenario3.Encrypt.encrypt("et"));
		assertEquals("jeiajeaijeiak", scenario3.Encrypt.encrypt("faewfawefaewg"));
		assertEquals("lippsqcjvmirh", scenario3.Encrypt.encrypt("hellomyfriend"));
		assertEquals("hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl", scenario3.Encrypt.encrypt("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh"));
		assertEquals("e", scenario3.Encrypt.encrypt("a"));
		assertEquals(public static String encrypt(String s) {, scenario3.Encrypt.*/);
		
    }

}