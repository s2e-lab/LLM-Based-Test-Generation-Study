package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class SpecialFactorial {
    
    public static long specialFactorial(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= factorial(i);
        }
        return res;
    }

}