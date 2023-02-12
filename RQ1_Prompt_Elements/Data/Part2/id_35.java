package Part2;

import static junit.framework.TestCase.assertEquals;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MaxElement {
    /**
     * Return maximum element in the list.
    
     */
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