package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MaxFill {
    
    public static int maxFill(List<List<Integer>> grid, int capacity) {
        int sum = 0;
        for (List<Integer> arr : grid) {
            int sumArr = 0;
            for (Integer i : arr) {
                sumArr += i;
            }
            sum += Math.ceil((double)sumArr / capacity);
        }
        return sum;
    }

}