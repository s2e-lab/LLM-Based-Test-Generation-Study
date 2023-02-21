package scenario2;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class FindMax {
    /**
     * Write a function that accepts a list of strings.
     * The list contains different words. Return the word with maximum number
     * of unique characters. If multiple strings have maximum number of unique
     * characters, return the one which comes first in lexicographical order.

   
     */
    public static String findMax(List<String> words) {
        String max = "";
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() >= max.length()) {
                if(words.get(i).length() == max.length() && words.get(i).compareTo(max) >= 0)
                    continue;
                max = words.get(i);
            }
        }
        return max;
    }

}