package scenario2;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class IsEqualToSumEven {
    /**
     * Evaluate whether the given number n can be written as the sum of exactly 4 positive even numbers
    
     */
    public static Boolean isEqualToSumEven(int n) {
        if (n < 8) {
            return false;
        }
        return n % 2 == 0;
    }

}