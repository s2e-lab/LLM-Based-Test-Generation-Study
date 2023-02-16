package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class BelowThreshold {
    
    public static Boolean belowThreshold(List<Integer> l, int t) {
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) >= t) {
                return false;
            }
        }
        return true;
    }

}