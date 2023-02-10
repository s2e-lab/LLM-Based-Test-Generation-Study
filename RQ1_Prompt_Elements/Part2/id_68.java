package Part2;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Pluck {
    /**
     * * "Given an array representing a branch of a tree that has non-negative integer nodes
     * your task is to pluck one of the nodes and return it.
     * The plucked node should be the node with the smallest even value.
     * If multiple nodes with the same smallest even value are found return the node that has smallest index.

     * The plucked node should be returned in a list, [ smalest_value, its index ],
     * If there are no even values or the given array is empty, return [].

     * Constraints:
     *     * 1 <= nodes.length <= 10000
     *     * 0 <= node.value
    
     */
    public static List<Object> pluck(List<Object> arr) {
        List<Object> result = new ArrayList<Object>();
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer) {
                int value = (Integer) arr.get(i);
                if (value % 2 == 0 && value < min) {
                    min = value;
                    index = i;
                }
            }
        }
        if (index != -1) {
            result.add(min);
            result.add(index);
        }
        return result;
    }

}