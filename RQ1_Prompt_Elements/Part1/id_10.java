package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MakePalindrome {
    
    public static String makePalindrome(String string) {
        if (string.length() == 0) {
            return "";
        }
        String reversed = new StringBuilder(string).reverse().toString();
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i).equals(reversed.substring(0, string.length() - i))) {
                return string + reversed.substring(string.length() - i);
            }
        }
        return null;
    }

}