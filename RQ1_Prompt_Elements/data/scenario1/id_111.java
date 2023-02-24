package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class Histogram {
    
    public static Object histogram(String test) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = test.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("")){
                continue;
            }
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        return map;
    }

}