package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class GetOddCollatz {

    public static List<Integer> getOddCollatz(int n) {
        List<Integer> result = new ArrayList<Integer>();
        while (n != 1) {
            if (n % 2 == 1) {
                result.add(n);
            }
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        result.add(1);
        Collections.sort(result);
        return result;
    }

}