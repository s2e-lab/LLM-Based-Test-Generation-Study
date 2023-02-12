package Part3;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class StringSequence {
    /**
     * Return a string containing space-delimited numbers starting from 0 upto n inclusive.
     * >>> string_sequence(0)
     * '0'
     * >>> string_sequence(5)
     * '0 1 2 3 4 5'
     *
     * > stringSequence(0)
     * "0"
     * > stringSequence(3)
     * "0 1 2 3"
     * > stringSequence(10)
     * "0 1 2 3 4 5 6 7 8 9 10"
     */
    public static String stringSequence(int n) {
        String result = "";
        for (int i = 0; i <= n; i++) {
            result += i + " ";
        }
        return result.trim();
    }


}