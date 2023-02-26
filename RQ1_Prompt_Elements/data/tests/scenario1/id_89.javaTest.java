package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {

    @Test
    public void test() throws Exception{

        assertEquals("lm", scenario1.Encrypt.encrypt("hi"));
		assertEquals("ewhjklnop", scenario1.Encrypt.encrypt("asdfghjkl"));
		assertEquals("kj", scenario1.Encrypt.encrypt("gf"));
		assertEquals("ix", scenario1.Encrypt.encrypt("et"));
		assertEquals("jeiajeaijeiak", scenario1.Encrypt.encrypt("faewfawefaewg"));
		assertEquals("lippsqcjvmirh", scenario1.Encrypt.encrypt("hellomyfriend"));
		assertEquals("hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl", scenario1.Encrypt.encrypt("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh"));
		assertEquals("e", scenario1.Encrypt.encrypt("a"));
		
    }

}