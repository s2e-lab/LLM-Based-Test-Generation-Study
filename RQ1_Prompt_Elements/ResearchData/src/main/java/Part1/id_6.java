package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ParseNestedParens {
    
    public static List<Integer> parseNestedParens(String parenString) {
        List<Integer> result = new ArrayList<Integer>();
        int count = 0;
        int maximum_depth = 0;
        for (int i = 0; i < parenString.length(); i++) {
            if (parenString.charAt(i) == '(') {
                count++;
                maximum_depth = Math.max(maximum_depth, count);
            } else if (parenString.charAt(i) == ')') {
                count--;
                if(count==0){
                    result.add(maximum_depth);
                    maximum_depth = 0;

                }
            }
        }
        return result;
    }

}