package Part1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class CountUpper {
    
    public static int countUpper(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0 && Character.isUpperCase(c) && "AEIOU".indexOf(c) >= 0) {
                result += 1;
            }
        }
        return result;
    }

}