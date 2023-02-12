package Part1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class Median {
    
    public static Number median(List<Integer> l) {
        Collections.sort(l);
        int size = l.size();
        if (size % 2 == 0) {
            return (l.get(size / 2) + l.get(size / 2 - 1)) / 2.0;
        } else {
            return l.get(size / 2);
        }
    }

}