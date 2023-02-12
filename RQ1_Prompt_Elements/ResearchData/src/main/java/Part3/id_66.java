package Part3;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Digitsum {
    /**
     * Task
     * Write a function that takes a string as input and returns the sum of the upper characters only'
     * ASCII codes.

     * Examples:
     *     digitSum("") => 0
     *     digitSum("abAB") => 131
     *     digitSum("abcCd") => 67
     *     digitSum("helloE") => 69
     *     digitSum("woArBld") => 131
     *     digitSum("aAaaaXa") => 153
     *
     * > digitsum("")
     * 0
     * > digitsum("abAB")
     * 131
     * > digitsum("abcCd")
     * 67
     * > digitsum("helloE")
     * 69
     * > digitsum("woArBld")
     * 131
     * > digitsum("aAaaaXa")
     * 153
     * > digitsum(" How are yOu?")
     * 151
     * > digitsum("You arE Very Smart")
     * 327
     */
    public static int digitsum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sum += c;
            }
        }
        return sum;
    }


}