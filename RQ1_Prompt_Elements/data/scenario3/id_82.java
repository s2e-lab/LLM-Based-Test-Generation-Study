package scenario3;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class PrimeLength {
    /**
     * Write a function that takes a string and returns True if the string
     * length is a prime number or False otherwise
     * Examples
     * prime_length('Hello') == True
     * prime_length('abcdcba') == True
     * prime_length('kittens') == True
     * prime_length('orange') == False
     *
     * > primeLength("Hello")
     * true
     * > primeLength("abcdcba")
     * true
     * > primeLength("kittens")
     * true
     * > primeLength("orange")
     * false
     * > primeLength("wow")
     * true
     * > primeLength("world")
     * true
     * > primeLength("MadaM")
     * true
     * > primeLength("Wow")
     * true
     * > primeLength("")
     * false
     * > primeLength("HI")
     * true
     * > primeLength("go")
     * true
     * > primeLength("gogo")
     * false
     * > primeLength("aaaaaaaaaaaaaaa")
     * false
     * > primeLength("Madam")
     * true
     * > primeLength("M")
     * false
     * > primeLength("0")
     * false
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