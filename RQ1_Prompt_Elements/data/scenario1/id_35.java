package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class MaxElement {
    
    public static int maxElement(List<Integer> l) {
        int max = Integer.MIN_VALUE;
        for (Integer i : l) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

}