package Part1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class StartsOneEnds {
    
    public static int startsOneEnds(int n) {
      
        int count = 0;
        int start = 1;
        int end = 1;
        for (int i = 1; i < n; i++) {
            start *= 10;
            end *= 10;
        }
        for (int i = start; i < end * 10; i++) {
            if (i % 10 == 1 || i / start == 1) {
                count++;
            }
        }
        return count;
    }

}