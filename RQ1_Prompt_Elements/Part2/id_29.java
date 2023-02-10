package Part2;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class FilterByPrefix {
    /**
     * Filter an input list of strings only for ones that start with a given prefix.
    
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