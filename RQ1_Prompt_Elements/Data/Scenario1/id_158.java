package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class FindMax {
    
    public static String findMax(List<String> words) {
        String max = "";
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() >= max.length()) {
                if(words.get(i).length() == max.length() && words.get(i).compareTo(max) >= 0)
                    continue;
                max = words.get(i);
            }
        }
        return max;
    }

}