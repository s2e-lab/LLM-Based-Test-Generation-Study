package Part1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class SumToN {
    
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

}