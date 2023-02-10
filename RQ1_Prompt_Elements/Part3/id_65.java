package Part3;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CircularShift {
    /**
     * Circular shift the digits of the integer x, shift the digits right by shift
     * and return the result as a string.
     * If shift > number of digits, return digits reversed.
     * >>> circular_shift(12, 1)
     * "21"
     * >>> circular_shift(12, 2)
     * "12"
     *
     * > circularShift(100, 2)
     * "001"
     * > circularShift(12, 2)
     * "12"
     * > circularShift(97, 8)
     * "79"
     * > circularShift(12, 1)
     * "21"
     * > circularShift(11, 101)
     * "11"
     */
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