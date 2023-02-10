package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PrimeFib {
    
    public static int primeFib(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        int count = 0;
        while (count < n) {
            c = a + b;
            a = b;
            b = c;
            if (isPrime(c)) {
                count++;
            }
        }
        return c;
    }

}