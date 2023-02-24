package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class Intersperse {

    public static List<Object> intersperse(List<Object> numbers, int delimeter) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < numbers.size(); i++) {
            result.add(numbers.get(i));
            if (i < numbers.size() - 1) {
                result.add(delimeter);
            }
        }
        return result;
    }

}