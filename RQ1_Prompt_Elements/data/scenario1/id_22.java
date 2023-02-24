package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class FilterIntegers {
    
    public static List<Object> filterIntegers(List<Object> values) {
        List<Object> result = new ArrayList<Object>();
        for (Object value : values) {
            if (value instanceof Integer) {
                result.add(value);
            }
        }
        return result;
    }

}