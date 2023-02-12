package Part3;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class GetPositive {
    /**
     * Return only positive numbers in the list.
     * >>> get_positive([-1, 2, -4, 5, 6])
     * [2, 5, 6]
     * >>> get_positive([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10])
     * [5, 3, 2, 3, 9, 123, 1]
     *
     * > getPositive([-1, -2, 4, 5, 6])
     * [4, 5, 6]
     * > getPositive([5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10])
     * [5, 3, 2, 3, 3, 9, 123, 1]
     * > getPositive([-1, -2])
     * []
     * > getPositive([])
     * []
     */
    public static List<Object> getPositive(List<Object> l) {
        List<Object> result = new ArrayList<Object>();
        for (Object value : l) {
            if (value instanceof Integer) {
                int i = (Integer) value;
                if (i > 0) {
                    result.add(i);
                }
            }
        }
        return result;
    }


}