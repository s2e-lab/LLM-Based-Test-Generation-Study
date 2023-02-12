package Part1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static junit.framework.TestCase.assertEquals;


class Unique {
    
    public static List<Integer> unique(List<Integer> l) {
        Set<Integer> set = new HashSet<Integer>();
        for (Integer i : l) {
            set.add(i);
        }
        List<Integer> result = new ArrayList<Integer>(set);
        Collections.sort(result);
        return result;
    }

}