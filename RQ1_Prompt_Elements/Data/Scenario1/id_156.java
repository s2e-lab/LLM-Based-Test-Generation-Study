package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class IntToMiniRoman {
    
    public static String intToMiniRoman(int number) {
        String result = "";
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", "v", "iv", "i"};
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                result += symbols[i];
            }
        }
        return result;
    }

}