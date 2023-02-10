package Part2;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CountUpper {
    /**
     * * Given a string s, count the number of uppercase vowels in even indices.
     * 
     */
    public static int countUpper(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0 && Character.isUpperCase(c) && "AEIOU".indexOf(c) >= 0) {
                result += 1;
            }
        }
        return result;
    }

}