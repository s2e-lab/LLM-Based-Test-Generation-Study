class FlipCaseTest {
    @Test
    void testFlipCase() {
        assertEquals("hELLO", FlipCase.flipCase("Hello"));
        assertEquals("", FlipCase.flipCase(""));
        assertEquals("hELLO!", FlipCase.flipCase("Hello!"));
        assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", FlipCase.flipCase("These violent delights have violent ends"));
        assertEquals("", FlipCase.flipCase(""));
        assertEquals("", FlipCase.flipCase(""));
        assertEquals("", FlipCase.flipCase(""));
        assertEquals("", FlipCase.flipCase(""));
        assertEquals("", FlipCase.flipCase(""));
        assertEquals("", FlipCase.flipCase(""));
    }
}