package Part3;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CountDistinctCharacters {
    /**
     * Given a string, find out how many distinct characters (regardless of case) does it consist of
     * >>> count_distinct_characters('xyzXYZ')
     * 3
     * >>> count_distinct_characters('Jerry')
     * 4
     *
     * > countDistinctCharacters("")
     * 0
     * > countDistinctCharacters("abcde")
     * 5
     * > countDistinctCharacters("abcdecadeCADE")
     * 5
     * > countDistinctCharacters("aaaaAAAAaaaa")
     * 1
     * > countDistinctCharacters("Jerry jERRY JeRRRY")
     * 5
     */
    public static int countDistinctCharacters(String string) {
        Set<Character> distinctCharacters = new HashSet<Character>();
        for (int i = 0; i < string.length(); i++) {
            distinctCharacters.add(Character.toLowerCase(string.charAt(i)));
        }
        return distinctCharacters.size();
    }

}