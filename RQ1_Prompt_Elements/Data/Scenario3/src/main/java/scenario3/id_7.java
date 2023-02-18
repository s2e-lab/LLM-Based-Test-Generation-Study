package scenario3;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class FilterBySubstring {
    /**
     * Filter an input list of strings only for ones that contain given substring
     * >>> filter_by_substring([], 'a')
     * []
     * >>> filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'a')
     * ['abc', 'bacd', 'array']
     *
     * > filterBySubstring([], "john")
     * []
     * > filterBySubstring(["xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx"], "xxx")
     * ["xxx", "xxxAAA", "xxx"]
     * > filterBySubstring(["xxx", "asd", "aaaxxy", "john doe", "xxxAAA", "xxx"], "xx")
     * ["xxx", "aaaxxy", "xxxAAA", "xxx"]
     * > filterBySubstring(["grunt", "trumpet", "prune", "gruesome"], "run")
     * ["grunt", "prune"]
     */
    public static List<Object> filterBySubstring(List<Object> strings, String substring) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).toString().contains(substring)) {
                result.add(strings.get(i));
            }
        }
        return result;
    }


}