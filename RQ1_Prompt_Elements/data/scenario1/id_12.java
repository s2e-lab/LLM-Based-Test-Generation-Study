package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class Longest {
    
    public static String longest(List<Object> strings) {
        if (strings.size() == 0) {
            return null;
        }
        String longest = strings.get(0).toString();
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).toString().length() > longest.length()) {
                longest = strings.get(i).toString();
            }
        }
        return longest;
    }

}