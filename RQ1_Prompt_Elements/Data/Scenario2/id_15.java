package Part2;

import static junit.framework.TestCase.assertEquals;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringSequence {
    /**
     * Return a string containing space-delimited numbers starting from 0 upto n inclusive.
    
     */
    public static String stringSequence(int n) {
        String result = "";
        for (int i = 0; i <= n; i++) {
            result += i + " ";
        }
        return result.trim();
    }

}