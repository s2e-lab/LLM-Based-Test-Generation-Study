package Part1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class F {
    
    public static List<Integer> f(int n) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result.add(factorial(i));
            } else {
                result.add(sum(i));
            }
        }
        return result;
    }

}