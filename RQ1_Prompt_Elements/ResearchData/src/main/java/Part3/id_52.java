package Part3;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class BelowThreshold {
    /**
     * Return True if all numbers in the list l are below threshold t.
     * >>> below_threshold([1, 2, 4, 10], 100)
     * True
     * >>> below_threshold([1, 20, 4, 10], 5)
     * False
     *
     * > belowThreshold([1, 2, 4, 10], 100)
     * true
     * > belowThreshold([1, 20, 4, 10], 5)
     * false
     * > belowThreshold([1, 20, 4, 10], 21)
     * true
     * > belowThreshold([1, 20, 4, 10], 22)
     * true
     * > belowThreshold([1, 8, 4, 10], 11)
     * true
     * > belowThreshold([1, 8, 4, 10], 10)
     * false
     */
    public static Boolean belowThreshold(List<Integer> l, int t) {
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) >= t) {
                return false;
            }
        }
        return true;
    }


}