// SeparateParenGroupsTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SeparateParenGroups}.
* It contains ten unit test cases for the {@link SeparateParenGroups#separateParenGroups(String)} method.
*/
class SeparateParenGroupsTest {

    @Test
    void testSeparateParenGroups1() {
        String parenString = "a(b(c)d)e";
        List<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("b(c)d");
        expected.add("e");
        assertEquals(expected, SeparateParenGroups.separateParenGroups(parenString));
    }

    @Test
    void testSeparateParenGroups2() {
        String parenString = "a(b(c)d)e(f)";
        List<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("b(c)d");
        expected.add("e");
        expected.add("f");
        assertEquals(expected, SeparateParenGroups.separateParenGroups(parenString));
    }

    @Test
    void testSeparateParenGroups3() {
        String parenString = "a(b(c)d)e(f)g";
        List<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("b(c)d");
        expected.add("e");
        expected.add("f");
        expected.add("g");
        assertEquals(expected, SeparateParenGroups.separateParenGroups(parenString));
    }

    @Test
    void testSeparateParenGroups4() {
        String parenString = "a(b(c)d)e(f)g(h)";
        List<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("b(c)d");
        expected.add("e");
        expected.add("f");
        expected.add("g");
        expected.add("h");
        assertEquals(expected, SeparateParenGroups.separateParenGroups(parenString));
    }

    @Test
    void testSeparateParenGroups5() {
        String parenString = "a(b(c)d)e(f)g(h)i";
        List<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("b(c)d");
        expected.add("e");
        expected.add("f");
        expected.add("g");
        expected.add("h");
        expected.add("i");
        assertEquals(expected, SeparateParenGroups.separateParenGroups(parenString));
    }

    @Test
    void testSeparateParenGroups6() {
        String parenString = "a(b(c)d)e(f)g(h)i(j)";
        List<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("b(c)d");
        expected.add("e");
        expected.add("f");
        expected.add("g");
        expected.add("h");
        expected.add("i");
        expected.add("j");
        assertEquals(expected, SeparateParenGroups.separateParenGroups(parenString));
    }

    @Test
    void testSeparateParenGroups7() {
        String parenString = "a(b(c)d)e(f)g(h)i(j)k";
        List<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("b(c)d");
        expected.add("e");
        expected.add("f");
        expected.add("g");
        expected.add("h");
        expected.add("i");
        expected.add("j");
        expected.add("k");
        assertEquals(expected, SeparateParenGroups.separateParenGroups(parenString));
    }

    @Test
    void testSeparateParenGroups8() {
        String parenString = "a(b(c)d)e(f)g(h)i(j)k(l)";
        List<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("b(c)d");
        expected.add("e");
        expected.add("f");
        expected.add("g");
        expected.add("h");
        expected.add("i");
        expected.add("j");
        expected.add("k");
        expected.add("l");
        assertEquals(expected, SeparateParenGroups.separateParenGroups(parenString));
    }

    @Test
    void testSeparateParenGroups9() {
        String parenString = "a(b(c)d)e(f)g(h)i(j)k(l)m";
        List<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("b(c)d");
        expected.add("e");
        expected.add("f");
        expected.add("g");
        expected.add("h");
        expected.add("i");
        expected.add("j");
        expected.add("k");
        expected.add("l");
        expected.add("m");
        assertEquals(expected, SeparateParenGroups.separateParenGroups(parenString));
    }

    @Test
    void testSeparateParenGroups10() {
        String parenString = "a(b(c)d)e(f)g(h)i(j)k(l)m(n)";
        List<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("b(c)d");
        expected.add("e");
        expected.add("f");
        expected.add("g");
        expected.add("h");
        expected.add("i");
        expected.add("j");
        expected.add("k");
        expected.add("l");
        expected.add("m");
        expected.add("n");
        assertEquals(expected, SeparateParenGroups.separateParenGroups(parenString));
    }
}
