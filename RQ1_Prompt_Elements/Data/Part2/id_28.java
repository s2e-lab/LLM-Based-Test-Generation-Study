package Part2;

import static junit.framework.TestCase.assertEquals;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Concatenate {
    /**
     * Concatenate list of strings into a single string
     
     */
    public static String concatenate(List<Object> strings) {
        String result = "";
        for (Object string : strings) {
            result += string.toString();
        }
        return result;
    }

}