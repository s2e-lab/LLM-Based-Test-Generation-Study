package Part3;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class FilterIntegers {
    /**
     * Filter given list of any Java values only for integers
     * >>> filter_integers(['a', 3.14, 5])
     * [5]
     * >>> filter_integers([1, 2, 3, 'abc', {}, []])
     * [1, 2, 3]
     *
     * > filterIntegers([])
     * []
     * > filterIntegers([4, {}, [], 23.2, 9, "adasd"])
     * [4, 9]
     * > filterIntegers([3, "c", 3, 3, "a", "b"])
     * [3, 3, 3]
     */
    public static List<Object> filterIntegers(List<Object> values) {
        List<Object> result = new ArrayList<Object>();
        for (Object value : values) {
            if (value instanceof Integer) {
                result.add(value);
            }
        }
        return result;
    }


}