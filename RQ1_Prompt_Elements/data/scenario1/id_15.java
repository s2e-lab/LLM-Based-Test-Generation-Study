package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class StringSequence {
    
    public static String stringSequence(int n) {
        String result = "";
        for (int i = 0; i <= n; i++) {
            result += i + " ";
        }
        return result.trim();
    }

}