package scenario2;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class GetPositive {
    /**
     * Return only positive numbers in the list.

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