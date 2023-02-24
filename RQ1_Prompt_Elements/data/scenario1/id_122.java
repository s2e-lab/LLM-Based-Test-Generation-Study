package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class AddElements {
    
    public static int addElements(List<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

}