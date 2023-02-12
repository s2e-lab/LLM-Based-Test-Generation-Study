public class EncryptTest {
    @Test
    public void testEncrypt() {
        assertEquals("lm", Encrypt.encrypt("hi"));
        assertEquals("ewhjklnop", Encrypt.encrypt("asdfghjkl"));
        assertEquals("kj", Encrypt.encrypt("gf"));
        assertEquals("ix", Encrypt.encrypt("et"));
        assertEquals("jeiajeaijeiak", Encrypt.encrypt("faewfawefaewg"));
        assertEquals("lippsqcjvmirh", Encrypt.encrypt("hellomyfriend"));
        assertEquals("hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl", Encrypt.encrypt("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh"));
        assertEquals("e", Encrypt.encrypt("a"));
        assertEquals("", Encrypt.encrypt(""));
        assertEquals(" ", Encrypt.encrypt(" "));
    }
}