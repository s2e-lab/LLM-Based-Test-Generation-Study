package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class BfTest {
    @Test
    public void test1() {
        assertEquals(Arrays.asList("Saturn", "Uranus"), Bf.bf("Jupiter", "Neptune"));
    }
    @Test
    public void test2() {
        assertEquals(Arrays.asList("Venus"), Bf.bf("Earth", "Mercury"));
    }
    @Test
    public void test3() {
        assertEquals(Arrays.asList("Venus", "Earth", "Mars", "Jupiter", "Saturn"), Bf.bf("Mercury", "Uranus"));
    }
    @Test
    public void test4() {
        assertEquals(Arrays.asList("Earth", "Mars", "Jupiter", "Saturn", "Uranus"), Bf.bf("Neptune", "Venus"));
    }
    @Test
    public void test5() {
        assertEquals(Arrays.asList(), Bf.bf("Earth", "Earth"));
    }
    @Test
    public void test6() {
        assertEquals(Arrays.asList(), Bf.bf("Mars", "Earth"));
    }
    @Test
    public void test7() {
        assertEquals(Arrays.asList(), Bf.bf("Jupiter", "Makemake"));
    }
    @Test
    public void test8() {
        assertEquals(Arrays.asList(), Bf.bf("Makemake", "Jupiter"));
    }
    @Test
    public void test9() {
        assertEquals(Arrays.asList(), Bf.bf("Makemake", "Makemake"));
    }
    @Test
    public void test10() {
        assertEquals(Arrays.asList(), Bf.bf("Makemake", "Makemake"));
    }
}