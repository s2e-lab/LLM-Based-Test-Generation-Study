package Part1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class Solve1 {
    
    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return Integer.toBinaryString(sum);
    }

}