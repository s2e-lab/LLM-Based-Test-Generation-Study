package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class Fibfib {
    
    public static int fibfib(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int a = 0;
        int b = 0;
        int c = 1;
        int d = 0;
        for (int i = 3; i <= n; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return d;
    }

}