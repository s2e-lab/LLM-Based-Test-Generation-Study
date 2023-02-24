package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class MatchParensTest {
    @Test
    void testMatchParens() {
        List<String> lst1 = new ArrayList<>();
        lst1.add("()(");
        lst1.add(")");
        assertEquals("Yes", MatchParens.matchParens(lst1));

        List<String> lst2 = new ArrayList<>();
        lst2.add(")");
        lst2.add(")");
        assertEquals("No", MatchParens.matchParens(lst2));

        List<String> lst3 = new ArrayList<>();
        lst3.add("(()(())");
        lst3.add("())())");
        assertEquals("No", MatchParens.matchParens(lst3));

        List<String> lst4 = new ArrayList<>();
        lst4.add(")())");
        lst4.add("(()()(");
        assertEquals("Yes", MatchParens.matchParens(lst4));

        List<String> lst5 = new ArrayList<>();
        lst5.add("(())))");
        lst5.add("(()())((");
        assertEquals("Yes", MatchParens.matchParens(lst5));

        List<String> lst6 = new ArrayList<>();
        lst6.add("()");
        lst6.add("())");
        assertEquals("No", MatchParens.matchParens(lst6));

        List<String> lst7 = new ArrayList<>();
        lst7.add("(()(");
        lst7.add("()))()");
        assertEquals("Yes", MatchParens.matchParens(lst7));

        List<String> lst8 = new ArrayList<>();
        lst8.add("((((");
        lst8.add("((())");
        assertEquals("No", MatchParens.matchParens(lst8));

        List<String> lst9 = new ArrayList<>();
        lst9.add(")(()");
        lst9.add("(()(");
        assertEquals("No", MatchParens.matchParens(lst9));

        List<String> lst10 = new ArrayList<>();
        lst10.add(")(");
        lst10.add(")(");
        assertEquals("No", MatchParens.matchParens(lst10));

        List<String> lst11 = new ArrayList<>();
        lst11.add("(");
        lst11.add(")");
        assertEquals("Yes", MatchParens.matchParens(lst11));

        List<String> lst12 = new ArrayList<>();
        lst12.add(")");
        lst12.add("(");
        assertEquals("Yes", MatchParens.matchParens(lst12));
    }
}