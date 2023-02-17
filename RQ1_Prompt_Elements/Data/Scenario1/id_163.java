package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class GenerateIntegers {
    
    public static List<Object> generateIntegers(int a, int b) {
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