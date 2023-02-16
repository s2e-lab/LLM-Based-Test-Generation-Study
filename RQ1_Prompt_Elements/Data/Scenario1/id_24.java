package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class LargestDivisor {
    
    public static int largestDivisor(int n) {
        for (int i = n - 1; i > 0; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }

}