package Part1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class FilterBySubstring {
    
    public static List<Object> filterBySubstring(List<Object> strings, String substring) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).toString().contains(substring)) {
                result.add(strings.get(i));
            }
        }
        return result;
    }

}