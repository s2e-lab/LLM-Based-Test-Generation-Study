package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class Derivative {
    
    public static List<Object> derivative(List<Integer> xs) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 1; i < xs.size(); i++) {
            result.add(xs.get(i) * i);
        }
        return result;
    }

}