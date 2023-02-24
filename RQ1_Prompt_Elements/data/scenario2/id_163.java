package scenario2;



import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class GenerateIntegers {
    /**
     * * Given two positive integers a and b, return the even digits between a
     * and b, in ascending order.
     */
    public static List<Object> generateIntegers(int a, int b) {
    // lower = max(2, min(a, b))
    // upper = min(8, max(a, b))

    // return [i for i in range(lower, upper+1) if i % 2 == 0]
    // convert to java
    int lower = Math.max(2, Math.min(a, b));
    int upper = Math.min(8, Math.max(a, b));
    List<Object> result = new ArrayList<>();
    for (int i = lower; i <= upper; i++) {
        if (i % 2 == 0) {
            result.add(i);
        }
    }
    return result;
    }


}