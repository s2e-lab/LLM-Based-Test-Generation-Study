package Part2;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class PrimeLength {
    /**
     * Write a function that takes a string and returns True if the string
     * length is a prime number or False otherwise
    
     */
    public static Boolean primeLength(String string) {
        int length = string.length();
        if (length == 0 || length == 1) {
            return false;
        }
        for (int i = 2; i < length; i++) {
            if (length % i == 0) {
                return false;
            }
        }
        return true;
    }

}