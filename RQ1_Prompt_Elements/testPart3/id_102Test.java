class ChooseNumTest {
    @Test
    void testChooseNum() {
        assertEquals(14, ChooseNum.chooseNum(12, 15));
        assertEquals(-1, ChooseNum.chooseNum(13, 12));
        assertEquals(12354, ChooseNum.chooseNum(33, 12354));
        assertEquals(-1, ChooseNum.chooseNum(5234, 5233));
        assertEquals(28, ChooseNum.chooseNum(6, 29));
        assertEquals(-1, ChooseNum.chooseNum(27, 10));
        assertEquals(-1, ChooseNum.chooseNum(7, 7));
        assertEquals(546, ChooseNum.chooseNum(546, 546));
    }
}