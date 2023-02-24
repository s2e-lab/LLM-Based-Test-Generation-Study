package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class LargestPrimeFactor {
    
    public static int largestPrimeFactor(int n) {
        int max = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                max = i;
                n /= i;
                i--;
            }
        }
        return max;
    }

}