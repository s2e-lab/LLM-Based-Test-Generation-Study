// FTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains ten unit test cases for the {@link F#f(int)} method.
*/
class FTest {

    @Test
    void testF1() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        expected.add(120);
        expected.add(720);
        expected.add(5040);
        expected.add(40320);
        expected.add(362880);
        expected.add(3628800);
        assertEquals(expected, F.f(10));
    }

    @Test
    void testF2() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(10);
        expected.add(35);
        expected.add(140);
        expected.add(630);
        expected.add(3150);
        expected.add(15750);
        expected.add(83200);
        expected.add(504000);
        assertEquals(expected, F.f(10));
    }

    @Test
    void testF3() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(4);
        expected.add(15);
        expected.add(64);
        expected.add(285);
        expected.add(1352);
        expected.add(7203);
        expected.add(42525);
        expected.add(252004);
        expected.add(1512016);
        assertEquals(expected, F.f(10));
    }

    @Test
    void testF4() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(5);
        expected.add(20);
        expected.add(80);
        expected.add(360);
        expected.add(1800);
        expected.add(10080);
        expected.add(60480);
        expected.add(403200);
        expected.add(2822400);
        assertEquals(expected, F.f(10));
    }

    @Test
    void testF5() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(6);
        expected.add(25);
        expected.add(120);
        expected.add(600);
        expected.add(3600);
        expected.add(21600);
        expected.add(145152);
        expected.add(1008000);
        expected.add(7257600);
        assertEquals(expected, F.f(10));
    }

    @Test
    void testF6() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(7);
        expected.add(31);
        expected.add(165);
        expected.add(966);
        expected.add(6720);
        expected.add(49380);
        expected.add(390625);
        expected.add(3144960);
        expected.add(26214400);
        assertEquals(expected, F.f(10));
    }

    @Test
    void testF7() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(8);
        expected.add(36);
        expected.add(220);
        expected.add(1440);
        expected.add(10080);
        expected.add(72072);
        expected.add(576480);
        expected.add(4838400);
        expected.add(42598400);
        assertEquals(expected, F.f(10));
    }

    @Test
    void testF8() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(9);
        expected.add(41);
        expected.add(286);
        expected.add(2016);
        expected.add(15120);
        expected.add(115975);
        expected.add(969484);
        expected.add(8472880);
        expected.add(76255960);
        assertEquals(expected, F.f(10));
    }

    @Test
    void testF9() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(10);
        expected.add(46);
        expected.add(364);
        expected.add(2744);
        expected.add(22680);
        expected.add(190522);
        expected.add(1679616);
        expected.add(15032384);
        expected.add(137438953);
        assertEquals(expected, F.f(10));
    }

    @Test
    void testF10() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(11);
        expected.add(51);
        expected.add(455);
        expected.add(4032);
        expected.add(36288);
        expected.add(332640);
        expected.add(3113510);
        expected.add(29699264);
        expected.add(288230375);
        assertEquals(expected, F.f(10));
    }
}
