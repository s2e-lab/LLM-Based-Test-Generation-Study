package Part1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class FilterByPrefix {
    
    public static List<Object> filterByPrefix(List<Object> strings, String prefix) {
        List<Object> result = new ArrayList<Object>();
        for (Object string : strings) {
            if (string.toString().startsWith(prefix)) {
                result.add(string);
            }
        }
        return result;
    }

}