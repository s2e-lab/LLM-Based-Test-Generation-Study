package Part3;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SameChars {
    /**
     * * Check if two words have the same characters.
     * >>> same_chars('eabcdzzzz', 'dddzzzzzzzddeddabc')
     * True
     * >>> same_chars('abcd', 'dddddddabc')
     * True
     * >>> same_chars('dddddddabc', 'abcd')
     * True
     * >>> same_chars('eabcd', 'dddddddabc')
     * False
     * >>> same_chars('abcd', 'dddddddabce')
     * False
     * >>> same_chars('eabcdzzzz', 'dddzzzzzzzddddabc')
     * False
     *
     * > sameChars("eabcdzzzz", "dddzzzzzzzddeddabc")
     * true
     * > sameChars("abcd", "dddddddabc")
     * true
     * > sameChars("dddddddabc", "abcd")
     * true
     * > sameChars("eabcd", "dddddddabc")
     * false
     * > sameChars("abcd", "dddddddabcf")
     * false
     * > sameChars("eabcdzzzz", "dddzzzzzzzddddabc")
     * false
     * > sameChars("aabb", "aaccc")
     * false
     */
    public static Boolean sameChars(String s0, String s1) {
        int[] count0 = new int[26];
        int[] count1 = new int[26];
        for (int i = 0; i < s0.length(); i++) {
            count0[s0.charAt(i) - 'a']=1;
            
        }
        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']=1;
        }
        for (int i = 0; i < 26; i++) {
            if (count0[i] != count1[i]) {
                return false;
            }
        }
        return true;
    }


}