package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class CountUpTo {

    public static List<Object> countUpTo(int n) {
        List<Object> result = new ArrayList<Object>();
        int i = 2;
        while (i < n) {
            if (isPrime(i)) {
                result.add(i);
            }
            i++;
        }
        return result;
    }


}