package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class StringXor {
    
    public static String stringXor(String a, String b) {
        String result = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                result += "0";
            } else {
                result += "1";
            }
        }
        return result;
    }

}