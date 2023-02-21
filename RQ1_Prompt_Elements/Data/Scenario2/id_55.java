package scenario2;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Fib {
    /**
     * Return n-th Fibonacci number.
     
     */
    public static int fib(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 0; i <n-1; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

}