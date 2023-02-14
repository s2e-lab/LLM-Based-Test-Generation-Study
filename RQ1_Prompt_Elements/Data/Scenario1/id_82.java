package Part1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class PrimeLength {
    
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