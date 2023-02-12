public class IntersectionTest {
    @Test
    public void testIntersection() {
        assertEquals("NO", Intersection.intersection(Arrays.asList(1, 2), Arrays.asList(2, 3)));
        assertEquals("NO", Intersection.intersection(Arrays.asList(-1, 1), Arrays.asList(0, 4)));
        assertEquals("YES", Intersection.intersection(Arrays.asList(-3, -1), Arrays.asList(-5, 5)));
        assertEquals("YES", Intersection.intersection(Arrays.asList(-2, 2), Arrays.asList(-4, 0)));
        assertEquals("NO", Intersection.intersection(Arrays.asList(-11, 2), Arrays.asList(-1, -1)));
        assertEquals("NO", Intersection.intersection(Arrays.asList(1, 2), Arrays.asList(3, 5)));
        assertEquals("NO", Intersection.intersection(Arrays.asList(1, 2), Arrays.asList(1, 2)));
        assertEquals("NO", Intersection.intersection(Arrays.asList(-2, -2), Arrays.asList(-3, -2)));
        assertEquals("NO", Intersection.intersection(Arrays.asList(1, 2), Arrays.asList(2, 3)));
        assertEquals("NO", Intersection.intersection(Arrays.asList(-1, 1), Arrays.asList(0, 4)));
    }
}