// IsPalindromeTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link IsPalindrome}.
* It contains ten test cases for the {@link IsPalindrome#isPalindrome()} method.
*/
class IsPalindromeTest {


    @Test
    void testIsPalindrome() {
        assertTrue(IsPalindrome.isPalindrome(""));
        assertTrue(IsPalindrome.isPalindrome("a"));
        assertTrue(IsPalindrome.isPalindrome("aa"));
        assertTrue(IsPalindrome.isPalindrome("aba"));
        assertTrue(IsPalindrome.isPalindrome("abba"));
        assertTrue(IsPalindrome.isPalindrome("abcba"));
        assertFalse(IsPalindrome.isPalindrome("ab"));
        assertFalse(IsPalindrome.isPalindrome("abc"));
        assertFalse(IsPalindrome.isPalindrome("abca"));
        assertFalse(IsPalindrome.isPalindrome("abcdba"));
    }
}

// IsPalindrome.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class IsPalindrome {

    public static Boolean isPalindrome(String text) {
        int i = 0;
        int j = text.length() - 1;
        while (i < j) {
            if (text.charAt(i) != text.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

// IsPalindromeTest.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link IsPalindrome}.
* It contains ten test cases for the {@link IsPalindrome#isPalindrome()} method.
*/
class IsPalindromeTest {

    @Test
    void testIsPalindrome() {
        assertTrue(IsPalindrome.isPalindrome(""));
        assertTrue(IsPalindrome.isPalindrome("a"));
        assertTrue(IsPalindrome.isPalindrome("aa"));
        assertTrue(IsPalindrome.isPalindrome("aba"));
        assertTrue(IsPalindrome.isPalindrome("abba"));
        assertTrue(IsPalindrome.isPalindrome("abcba"));
        assertFalse(IsPalindrome.isPalindrome("ab"));
        assertFalse(IsPalindrome.isPalindrome("abc"));
        assertFalse(IsPalindrome.isPalindrome("abca"));
        assertFalse(IsPalindrome.isPalindrome("abcdba"));
    }
}

// IsPalindrome.java
package scenario3;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class IsPalindrome {

    public static Boolean isPalindrome(String text) {
        int i = 0;
        int j = text.length() - 1;
        while (i < j) {
            if (text.charAt(i) != text.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

// IsPalindromeTest.java
package scenario3;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link IsPalindrome}.
* It contains ten test cases for the {@link IsPalindrome#isPalindrome()} method.
*/
class IsPalindromeTest {

    @Test
    void testIsPalindrome() {
        assertTrue(IsPalindrome.isPalindrome(""));
        assertTrue(IsPalindrome.isPalindrome("a"));
        assertTrue(IsPalindrome.isPalindrome("aa"));
        assertTrue(IsPalindrome.isPal