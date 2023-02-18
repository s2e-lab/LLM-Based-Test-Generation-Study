package scenario3;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class Intersperse {
    /**
     * Insert a number 'delimeter' between every two consecutive elements of input list `numbers'
     * >>> intersperse([], 4)
     * []
     * >>> intersperse([1, 2, 3], 4)
     * [1, 4, 2, 4, 3]
     *
     * > intersperse([], 7)
     * []
     * > intersperse([5, 6, 3, 2], 8)
     * [5, 8, 6, 8, 3, 8, 2]
     * > intersperse([2, 2, 2], 2)
     * [2, 2, 2, 2, 2]
     */
    public static List<Object> intersperse(List<Object> numbers, int delimeter) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < numbers.size(); i++) {
            result.add(numbers.get(i));
            if (i < numbers.size() - 1) {
                result.add(delimeter);
            }
        }
        return result;
    }



}