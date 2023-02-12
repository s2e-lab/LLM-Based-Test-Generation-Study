package Part1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class MakeAPile {
    
    public static List<Integer> makeAPile(int n) {
        List<Integer> result = new ArrayList<Integer>();
        int i = 1;
        while (i <= n) {
            if (i == 1) {
                result.add(n);
            } else {
                if (n % 2 == 0) {
                    result.add(result.get(i - 2) + 2);
                } else {
                    result.add(result.get(i - 2) + 2);
                }
            }
            i++;
        }
        return result;
    }

}