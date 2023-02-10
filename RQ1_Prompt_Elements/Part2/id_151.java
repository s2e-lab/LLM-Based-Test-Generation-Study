package Part2;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DoubleTheDifference {
    /**
     * * Given a list of numbers, return the sum of squares of the numbers
     * in the list that are odd. Ignore numbers that are negative or not integers.
     */
    public static int doubleTheDifference(List<Object> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) instanceof Integer) {
                int num = (int) lst.get(i);
                if (num % 2 != 0 && num > 0) {
                    sum += num * num;
                }
            }
        }
        return sum;
    }

}