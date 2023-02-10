package Part3;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class IsNested {
    /**
     * * Create a function that takes a string as input which contains only square brackets.
     * The function should return True if and only if there is a valid subsequence of brackets 
     * where at least one bracket in the subsequence is nested.

     * is_nested('[[]]') ➞ True
     * is_nested('[]]]]]]][[[[[]') ➞ False
     * is_nested('[][]') ➞ False
     * is_nested('[]') ➞ False
     * is_nested('[[][]]') ➞ True
     * is_nested('[[]][[') ➞ True
     *
     * > isNested("[[]]")
     * true
     * > isNested("[]]]]]]][[[[[]")
     * false
     * > isNested("[][]")
     * false
     * > isNested("[]")
     * false
     * > isNested("[[[[]]]]")
     * true
     * > isNested("[]]]]]]]]]]")
     * false
     * > isNested("[][][[]]")
     * true
     * > isNested("[[]")
     * false
     * > isNested("[]]")
     * false
     * > isNested("[[]][[")
     * true
     * > isNested("[[][]]")
     * true
     * > isNested("")
     * false
     * > isNested("[[[[[[[[")
     * false
     * > isNested("]]]]]]]]")
     * false
     */
    public static Boolean isNested(String string) {
    ArrayList<Integer> opening_bracket_index = new ArrayList<Integer>();
    ArrayList<Integer> closing_bracket_index = new ArrayList<Integer>();
    for (int i = 0; i < string.length(); i++) {
        if (string.charAt(i) == '[') {
            opening_bracket_index.add(i);
        } else {
            closing_bracket_index.add(i);
        }
    }
    Collections.reverse(closing_bracket_index);
    int cnt = 0;
    int i = 0;
    int l = closing_bracket_index.size();
    for (int idx : opening_bracket_index) {
        if (i < l && idx < closing_bracket_index.get(i)) {
            cnt += 1;
            i += 1;
        }
    }
    return cnt >= 2;
    }


}