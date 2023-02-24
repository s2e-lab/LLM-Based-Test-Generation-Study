// CorrectBracketing1Test.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link CorrectBracketing1}.
* It contains ten test cases for the {@link CorrectBracketing1#correctBracketing()} method.
*/
class CorrectBracketing1Test {


    @Test
    void testCorrectBracketing1() {
        assertTrue(CorrectBracketing1.correctBracketing("()"));
    }

    @Test
    void testCorrectBracketing2() {
        assertTrue(CorrectBracketing1.correctBracketing("(())"));
    }

    @Test
    void testCorrectBracketing3() {
        assertTrue(CorrectBracketing1.correctBracketing("()()"));
    }

    @Test
    void testCorrectBracketing4() {
        assertTrue(CorrectBracketing1.correctBracketing("(()())"));
    }

    @Test
    void testCorrectBracketing5() {
        assertTrue(CorrectBracketing1.correctBracketing("()(())"));
    }

    @Test
    void testCorrectBracketing6() {
        assertFalse(CorrectBracketing1.correctBracketing("("));
    }

    @Test
    void testCorrectBracketing7() {
        assertFalse(CorrectBracketing1.correctBracketing(")"));
    }

    @Test
    void testCorrectBracketing8() {
        assertFalse(CorrectBracketing1.correctBracketing("(()"));
    }

    @Test
    void testCorrectBracketing9() {
        assertFalse(CorrectBracketing1.correctBracketing("())"));
    }

    @Test
    void testCorrectBracketing10() {
        assertFalse(CorrectBracketing1.correctBracketing("())("));
    }
}

// CorrectBracketing2.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class CorrectBracketing2 {

    public static Boolean correctBracketing(String brackets) {
        int count = 0;
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }
}

// CorrectBracketing2Test.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link CorrectBracketing2}.
* It contains ten test cases for the {@link CorrectBracketing2#correctBracketing()} method.
*/
class CorrectBracketing2Test {

    @Test
    void testCorrectBracketing1() {
        assertTrue(CorrectBracketing2.correctBracketing("()"));
    }

    @Test
    void testCorrectBracketing2() {
        assertTrue(CorrectBracketing2.correctBracketing("(())"));
    }

    @Test
    void testCorrectBracketing3() {
        assertTrue(CorrectBracketing2.correctBracketing("()()"));
    }

    @Test
    void testCorrectBracketing4() {
        assertTrue(CorrectBracketing2.correctBracketing("(()())"));
    }

    @Test
    void testCorrectBracketing5() {
        assertTrue(CorrectBracketing2.correctBracketing("()(())"));
    }

    @Test
    void testCorrectBracketing6() {
        assertFalse(CorrectBracketing2.correctBracketing("("));
    }

    @Test
    void testCorrectBracketing7() {
        assertFalse(CorrectBracketing2.correctBracketing(")"));
    }

    @Test
    void testCorrectBracketing8() {
        assertFalse(CorrectBracketing2.correctBracketing("(()"));
    }

    @Test
    void testCorrectBracketing9() {
        assertFalse(CorrectBracketing2.correctBracketing("())"));
    }

    @Test
    void testCorrectBracketing10()