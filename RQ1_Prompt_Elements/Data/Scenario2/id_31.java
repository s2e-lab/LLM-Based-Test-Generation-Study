package Part2;



import static junit.framework.TestCase.assertTrue;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class IsPrime {
    /**
     * Return true if a given number is prime, and false otherwise.
     
     */
    public static Boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}