package Part2;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class PairsSumToZero {
    /**
     * * pairs_sum_to_zero takes a list of integers as an input.
     * it returns True if there are two distinct elements in the list that
     * sum to zero, and False otherwise.
     
     */
    public static Boolean pairsSumToZero(List<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i) + l.get(j) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

}