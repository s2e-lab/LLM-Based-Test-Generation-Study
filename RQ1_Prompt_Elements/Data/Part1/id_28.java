package Part1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Concatenate {
    
    public static String concatenate(List<Object> strings) {
        String result = "";
        for (Object string : strings) {
            result += string.toString();
        }
        return result;
    }

}