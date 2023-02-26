package scenario2;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {

    @Test
    public void test() throws Exception{

        assertEquals("lm", scenario2.Encrypt.encrypt("hi"));
		assertEquals("ewhjklnop", scenario2.Encrypt.encrypt("asdfghjkl"));
		assertEquals("kj", scenario2.Encrypt.encrypt("gf"));
		assertEquals("ix", scenario2.Encrypt.encrypt("et"));
		assertEquals("jeiajeaijeiak", scenario2.Encrypt.encrypt("faewfawefaewg"));
		assertEquals("lippsqcjvmirh", scenario2.Encrypt.encrypt("hellomyfriend"));
		assertEquals("hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl", scenario2.Encrypt.encrypt("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh"));
		assertEquals("e", scenario2.Encrypt.encrypt("a"));
		
    }

}