package Part1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class CircularShift {
    
    public static String circularShift(int x, int shift) {
        String result = "";
        String xString = Integer.toString(x);
        int xLength = xString.length();
        if (shift > xLength) {
            for (int i = xLength - 1; i >= 0; i--) {
                result += xString.charAt(i);
            }
        } else {
            for (int i = xLength - shift; i < xLength; i++) {
                result += xString.charAt(i);
            }
            for (int i = 0; i < xLength - shift; i++) {
                result += xString.charAt(i);
            }
        }
        return result;
    }

}