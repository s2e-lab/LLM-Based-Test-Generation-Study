package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Intersection {
    
    public static String intersection(List<Integer> interval1, List<Integer> interval2) {
        
        int start = Math.max(interval1.get(0), interval2.get(0));
        int end = Math.min(interval1.get(1), interval2.get(1));
        if (start > end) {
            return "NO";
        }
        if (isPrime(end - start)) {
            return "YES";
        }
        return "NO";
    }

}