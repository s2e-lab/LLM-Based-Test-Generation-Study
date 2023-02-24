package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class IsPalindrome {
    
    public static Boolean isPalindrome(String text) {
        int i = 0;
        int j = text.length() - 1;
        while (i < j) {
            if (text.charAt(i) != text.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}