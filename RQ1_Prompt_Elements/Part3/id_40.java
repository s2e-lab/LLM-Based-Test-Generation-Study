package Part3;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TriplesSumToZero {
    /**
     * * triples_sum_to_zero takes a list of integers as an input.
     * it returns True if there are three distinct elements in the list that
     * sum to zero, and False otherwise.

     * >>> triples_sum_to_zero([1, 3, 5, 0])
     * False
     * >>> triples_sum_to_zero([1, 3, -2, 1])
     * True
     * >>> triples_sum_to_zero([1, 2, 3, 7])
     * False
     * >>> triples_sum_to_zero([2, 4, -5, 3, 9, 7])
     * True
     * >>> triples_sum_to_zero([1])
     * False
     *
     * > triplesSumToZero([1, 3, 5, 0])
     * false
     * > triplesSumToZero([1, 3, 5, -1])
     * false
     * > triplesSumToZero([1, 3, -2, 1])
     * true
     * > triplesSumToZero([1, 2, 3, 7])
     * false
     * > triplesSumToZero([1, 2, 5, 7])
     * false
     * > triplesSumToZero([2, 4, -5, 3, 9, 7])
     * true
     * > triplesSumToZero([1])
     * false
     * > triplesSumToZero([1, 3, 5, -100])
     * false
     * > triplesSumToZero([100, 3, 5, -100])
     * false
     */
    public static Boolean triplesSumToZero(List<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                for (int k = j + 1; k < l.size(); k++) {
                    if (l.get(i) + l.get(j) + l.get(k) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }



}