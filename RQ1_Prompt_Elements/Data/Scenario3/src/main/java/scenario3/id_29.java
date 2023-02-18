package scenario3;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class FilterByPrefix {
    /**
     * Filter an input list of strings only for ones that start with a given prefix.
     * >>> filter_by_prefix([], 'a')
     * []
     * >>> filter_by_prefix(['abc', 'bcd', 'cde', 'array'], 'a')
     * ['abc', 'array']
     *
     * > filterByPrefix([], "john")
     * []
     * > filterByPrefix(["xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx"], "xxx")
     * ["xxx", "xxxAAA", "xxx"]
     */
    public static List<Object> filterByPrefix(List<Object> strings, String prefix) {
        List<Object> result = new ArrayList<Object>();
        for (Object string : strings) {
            if (string.toString().startsWith(prefix)) {
                result.add(string);
            }
        }
        return result;
    }

}