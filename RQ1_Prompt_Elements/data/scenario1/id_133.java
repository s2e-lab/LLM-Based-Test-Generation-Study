package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class SumSquares {
    
    public static int sumSquares(List<Number> lst) {
        int sum = 0;
        for (Number n : lst) {
            sum += Math.pow(Math.ceil(n.doubleValue()), 2);
        }
        return sum;
    }

}