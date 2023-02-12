public class IsBoredTest {
    @Test
    public void testIsBored() {
        assertEquals(0, IsBored.isBored("Hello world"));
        assertEquals(0, IsBored.isBored("Is the sky blue?"));
        assertEquals(1, IsBored.isBored("I love It !"));
        assertEquals(0, IsBored.isBored("bIt"));
        assertEquals(2, IsBored.isBored("I feel good today. I will be productive. will kill It"));
        assertEquals(0, IsBored.isBored("You and I are going for a walk"));
        assertEquals(0, IsBored.isBored(""));
        assertEquals(0, IsBored.isBored(" "));
        assertEquals(0, IsBored.isBored("."));
        assertEquals(0, IsBored.isBored("?"));
        assertEquals(0, IsBored.isBored("!"));
    }
}