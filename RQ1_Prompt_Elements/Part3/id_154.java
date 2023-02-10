package Part3;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CycpatternCheck {
    /**
     * You are given 2 words. You need to return True if the second word or any of its rotations is a substring in the first word
     * cycpattern_check("abcd","abd") => False
     * cycpattern_check("hello","ell") => True
     * cycpattern_check("whassup","psus") => False
     * cycpattern_check("abab","baa") => True
     * cycpattern_check("efef","eeff") => False
     * cycpattern_check("himenss","simen") => True

     *
     * > cycpatternCheck("xyzw", "xyw")
     * false
     * > cycpatternCheck("yello", "ell")
     * true
     * > cycpatternCheck("whattup", "ptut")
     * false
     * > cycpatternCheck("efef", "fee")
     * true
     * > cycpatternCheck("abab", "aabb")
     * false
     * > cycpatternCheck("winemtt", "tinem")
     * true
     */
    public static Boolean cycpatternCheck(String a, String b) {
    int l = b.length();
    String pat = b + b;
    for (int i = 0; i < a.length() - l + 1; i++){
        for (int j = 0; j < l + 1; j++){
            if (a.substring(i, i+l).equals(pat.substring(j, j+l))){
                return true;
            }
        }
    }
    return false;
    }



}