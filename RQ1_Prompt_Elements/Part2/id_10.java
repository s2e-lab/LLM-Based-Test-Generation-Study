package Part2;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MakePalindrome {
    /**
     * Find the shortest palindrome that begins with a supplied string.
     * Algorithm idea is simple:
     * - Find the longest postfix of supplied string that is a palindrome.
     * - Append to the end of the string reverse of a string prefix that comes before the palindromic suffix.

     */
    public static String makePalindrome(String string) {
        if (string.length() == 0) {
            return "";
        }
        String reversed = new StringBuilder(string).reverse().toString();
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i).equals(reversed.substring(0, string.length() - i))) {
                return string + reversed.substring(string.length() - i);
            }
        }
        return null;
    }


}