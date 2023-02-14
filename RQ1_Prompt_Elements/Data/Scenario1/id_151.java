package Part1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class DoubleTheDifference {
    
    public static int doubleTheDifference(List<Object> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) instanceof Integer) {
                int num = (int) lst.get(i);
                if (num % 2 != 0 && num > 0) {
                    sum += num * num;
                }
            }
        }
        return sum;
    }

}