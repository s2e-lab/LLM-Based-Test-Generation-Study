package scenario2;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Digitsum {
    /**
     * Task
     * Write a function that takes a string as input and returns the sum of the upper characters only'
     * ASCII codes.

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