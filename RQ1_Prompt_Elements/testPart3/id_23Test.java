class StrlenTest {
    @Test
    void testStrlen() {
        assertEquals(0, Strlen.strlen(""));
        assertEquals(1, Strlen.strlen("x"));
        assertEquals(9, Strlen.strlen("asdasnakj"));
        assertEquals(3, Strlen.strlen("abc"));
        assertEquals(0, Strlen.strlen(""));
        assertEquals(1, Strlen.strlen("x"));
        assertEquals(9, Strlen.strlen("asdasnakj"));
        assertEquals(3, Strlen.strlen("abc"));
        assertEquals(0, Strlen.strlen(""));
        assertEquals(1, Strlen.strlen("x"));
        assertEquals(9, Strlen.strlen("asdasnakj"));
        assertEquals(3, Strlen.strlen("abc"));
    }
}