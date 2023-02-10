package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Digits {
    
    public static int digits(int n) {
        int res = 1;
        boolean hasOdd = false;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 1) {
                res *= digit;
                hasOdd = true;
            }
            n /= 10;
        }
        return hasOdd ? res : 0;
    }

}